package hu.bme.mdsd.ztz.model.simulation.events;

import hu.bme.mdsd.ztz.model.simulation.model.RobotMissionSimulationModel;
import desmoj.core.simulator.ExternalEvent;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class ArrivalEvent extends ExternalEvent{

	private RobotMissionSimulationModel model;

	public ArrivalEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (RobotMissionSimulationModel) owner;
	}

	@Override
	public void eventRoutine() {

				
		
		
	}

}
