package hu.bme.mdsd.ztz.model.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;
import hu.bme.mdsd.ztz.model.drone.StringValue;


public class SetCapabilityPropertyByLabelAction implements IExternalJavaAction {

	public SetCapabilityPropertyByLabelAction() {
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		DroneFactory factory = DroneFactory.eINSTANCE;
		
		Property prop = (Property) selections.iterator().next();
		RobotMissionContainer container = (RobotMissionContainer) prop.eContainer().eContainer().eContainer();
	
		String label = (String) parameters.get("label");
		String[] propertyParameters = label.split("[^0-9.&&\\s]|:\\s+");
		
		
		PropertyKey goodPropKey = null;
		if (container.getPropertyKeyContainer() != null) {
			for (PropertyKey propKey : container.getPropertyKeyContainer().getKeys()) {
				if (propKey.getName().equals(propertyParameters[0])) {
					goodPropKey = propKey;
					break;
				}
			}
		}
		if (goodPropKey == null) return;
		
		if (propertyParameters.length == 2) {
			if (prop.getValue() != null)
				EcoreUtil.remove(prop.getValue());
			
			
			StringValue newSv = factory.createStringValue();
			newSv.setValue(propertyParameters[1]);

			prop.setKey(goodPropKey);
			prop.setValue(newSv);
		} else if (propertyParameters.length == 3) {
			MeasureDimension goodDimension = null;
			for (MeasureDimension dim : container.getMeasureDimensions()) {
				if (dim.getName().equals(propertyParameters[2])) {
					goodDimension = dim;
					break;
				}
			}
			if (goodDimension == null) return;
			
			float goodValue;
			try {
				goodValue = Float.parseFloat(propertyParameters[1]);
			} catch (NumberFormatException ex) {
				return;
			}
			
			if (prop.getValue() != null)
				EcoreUtil.remove(prop.getValue());
			
			MeasureValue newMv = factory.createMeasureValue();
			newMv.setDimension(goodDimension);
			newMv.setValue(goodValue);
			
			prop.setKey(goodPropKey);
			prop.setValue(newMv);
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) {
			if (!(obj instanceof Property)) {
				return false;
			}
		}
		return true;
	}

}
