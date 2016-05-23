package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class BringEvent extends EventOf2Entities<DynamicRobotEntity, ResettableAreaObjectEntity> {

	private ObjectDeliverySimulationModel owner;
	
	public BringEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eventRoutine(DynamicRobotEntity who1, ResettableAreaObjectEntity who2) {
		if (owner.availableObjects.contains(who2)) {
			owner.availableObjects.remove(who2);
			who2.reset();
		}
		who1.nextEvent();
	}

}
