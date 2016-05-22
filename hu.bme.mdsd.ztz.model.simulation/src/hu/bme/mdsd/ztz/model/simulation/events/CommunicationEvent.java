package hu.bme.mdsd.ztz.model.simulation.events;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.entities.RobotEntity;
import hu.bme.mdsd.ztz.model.simulation.model.RobotMissionSimulationModel;

public class CommunicationEvent extends EventOf2Entities<RobotEntity,RobotEntity>{
	
	private RobotMissionSimulationModel model;


	public CommunicationEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		// TODO Auto-generated constructor stub
		model = (RobotMissionSimulationModel) owner;

	}

	@Override
	public void eventRoutine(RobotEntity who1, RobotEntity who2) {
		// TODO Auto-generated method stub
		
	}

}
