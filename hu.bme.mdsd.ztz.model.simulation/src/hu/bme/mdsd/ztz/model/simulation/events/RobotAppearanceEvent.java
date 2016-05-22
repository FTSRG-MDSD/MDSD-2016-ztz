package hu.bme.mdsd.ztz.model.simulation.events;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.ExternalEvent;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.model.RobotMissionSimulationModel;

public class RobotAppearanceEvent extends ExternalEvent{

	private RobotMissionSimulationModel model;

	public RobotAppearanceEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (RobotMissionSimulationModel) owner;
	}
	
	@Override
	public void eventRoutine() throws SuspendExecution {
		// TODO Auto-generated method stub
		
	}

}
