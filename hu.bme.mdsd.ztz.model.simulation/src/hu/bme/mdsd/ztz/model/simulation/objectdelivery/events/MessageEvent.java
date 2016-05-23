package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class MessageEvent extends EventOf2Entities<DynamicRobotEntity, DynamicRobotEntity> {

	private ObjectDeliverySimulationModel owner;
	
	public MessageEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public synchronized void eventRoutine(DynamicRobotEntity robot, DynamicRobotEntity target) {
		String waited = owner.waitingForCommunication.get(target);
		if (waited != null && robot.getName().equals(waited)) {
			owner.waitingForCommunication.remove(target);
			robot.nextEvent();
			target.nextEvent();
		} else {
			owner.waitingForCommunication.put(robot, target.getName());
		}
	}

}
