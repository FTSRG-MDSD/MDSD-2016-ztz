package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class DetectEvent extends EventOf2Entities<DynamicRobotEntity, ResettableAreaObjectEntity> {

	private ObjectDeliverySimulationModel owner;
	
	public DetectEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
	}

	@Override
	public void eventRoutine(DynamicRobotEntity who1, ResettableAreaObjectEntity who2) {
		who1.nextEvent();
	}

}
