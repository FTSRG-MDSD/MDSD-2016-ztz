package hu.bme.mdsd.ztz.model.simulation.events;

import desmoj.core.simulator.ExternalEvent;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mdsd.ztz.model.simulation.entities.RobotEntity;
import hu.bme.mdsd.ztz.model.simulation.model.RobotMissionSimulationModel;

public class RobotAppearanceEvent extends ExternalEvent{

	private RobotMissionSimulationModel model;

	public RobotAppearanceEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (RobotMissionSimulationModel) owner;
	}
	
	@Override
	public void eventRoutine()  {
		// TODO Auto-generated method stub
		model.robotsQueue.insert(new RobotEntity(model,"Robot",false));
		
		if(!model.robotsQueue.isEmpty()){
			CommunicationEvent comevent = new CommunicationEvent(model, "Communication event", true);
			comevent.schedule(model.robotsQueue.last(), model.thisRobot, new TimeSpan(model.getCommunicationTime()));
		}
		schedule(new TimeSpan(model.getRobotArrivalTime()));
	}

}
