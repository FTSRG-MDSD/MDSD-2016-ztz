package hu.bme.mdsd.ztz.model.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import hu.bme.mdsd.ztz.model.drone.Coordinate;

public class SetCoordinateByLabelAction implements IExternalJavaAction {

	public SetCoordinateByLabelAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Coordinate coordinate = (Coordinate) selections.iterator().next();
				
		String label = (String) parameters.get("label");
		String type = (String) parameters.get("type");
		String[] measureValueParameters = label.split("[^0-9.&&\\s]|:\\s+");
		
		int numIndex = -1;
		for (int i=0;i<measureValueParameters.length;++i) {
			if (measureValueParameters[i].matches("[0-9.]+")) {
				numIndex = i;
			}
		}
		
		if (numIndex != -1) {
			float goodValue;
			try {
				goodValue = Float.parseFloat(measureValueParameters[numIndex]);
				if (type.equals("altitude"))
					coordinate.setAltitude(goodValue);
				else if (type.equals("latitude"))
					coordinate.setLatitude(goodValue);
				else if (type.equals("longitude"))
					coordinate.setLongitude(goodValue);
			} catch (NumberFormatException ex) {
			}
		}
		
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) {
			if (!(obj instanceof Coordinate)) {
				return false;
			}
		}
		return true;
	}

}
