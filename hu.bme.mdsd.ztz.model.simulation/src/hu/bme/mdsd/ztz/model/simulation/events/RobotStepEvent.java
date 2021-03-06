package hu.bme.mdsd.ztz.model.simulation.events;

import hu.bme.mdsd.ztz.model.simulation.model.RobotMissionSimulationModel;
import desmoj.core.simulator.ExternalEvent;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;

public class RobotStepEvent extends ExternalEvent{

	private RobotMissionSimulationModel model;

	public RobotStepEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		model = (RobotMissionSimulationModel) owner;
	}

	@Override
	public void eventRoutine() {
		
		if(model.pathQueue.isEmpty()){
			//TODO
			return;
		}
		else{
			//if the robot has area to go, go and remove from path queue
			model.currentArea = model.pathQueue.first();
			model.pathQueue.removeFirst();
			
			//clear the robots, new area -> new robots queue
			model.robotsQueue.removeAll();
			CommunicationEvent comevent = new CommunicationEvent(model, "Communication event", false);
			if(comevent.isScheduled()){
				comevent.cancel();
			}
			
			RobotAppearanceEvent robotAppearenceEvent = new RobotAppearanceEvent(model, "New robot comes", true);
			if(robotAppearenceEvent.isScheduled()){
				robotAppearenceEvent.cancel();
			}
			robotAppearenceEvent.schedule(new TimeSpan(model.getRobotArrivalTime()));
			
			//schedule discovering
			DiscoverEvent discoverEvent = new DiscoverEvent(model, "Discover event", true);
			if(discoverEvent.isScheduled()){
				discoverEvent.cancel();
			}
			discoverEvent.schedule(model.thisRobot, model.currentArea,new TimeSpan(model.getDiscoveryTime()));
					
		}
				
		
		
	}

}
