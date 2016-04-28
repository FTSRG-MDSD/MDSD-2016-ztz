package hu.bme.mdsd.ztz.model.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;

public class SetMeasureValueByLabelAction implements IExternalJavaAction {

	public SetMeasureValueByLabelAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		MeasureValue measureValue = (MeasureValue) selections.iterator().next();
		
		EObject tmp = measureValue;
		while (!(tmp instanceof RobotMissionContainer))
			tmp = tmp.eContainer();
		RobotMissionContainer container = (RobotMissionContainer) tmp;
				
		String label = (String) parameters.get("label");
		String[] measureValueParameters = label.split("[^0-9.&&\\s]|:\\s+");
		
		int numIndex = -1, dimensionIndex = -1;
		for (int i=0;i<measureValueParameters.length;++i) {
			if (measureValueParameters[i].matches("[0-9.]+")) {
				numIndex = i;
			} else {
				dimensionIndex = i;
			}
		}
		
		if (numIndex != -1) {
			float goodValue;
			try {
				goodValue = Float.parseFloat(measureValueParameters[numIndex]);
				measureValue.setValue(goodValue);
			} catch (NumberFormatException ex) {
			}
		}
		
		if (dimensionIndex != -1) {
			MeasureDimension goodDimension = null;
			for (MeasureDimension dim : container.getMeasureDimensions()) {
				if (dim.getName().equals(measureValueParameters[dimensionIndex])) {
					goodDimension = dim;
					break;
				}
			}
			if (goodDimension != null) {
				measureValue.setDimension(goodDimension);
			}
		}
		
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) {
			if (!(obj instanceof MeasureValue)) {
				return false;
			}
		}
		return true;
	}

}
