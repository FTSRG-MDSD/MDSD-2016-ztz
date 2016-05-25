package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.Position;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.VisualizationUtil;

public class BringEvent extends EventOf2Entities<DynamicRobotEntity, ResettableAreaObjectEntity> {

	private ObjectDeliverySimulationModel owner;
	
	private Position position;
	
	public BringEvent(Model owner, String name, boolean showInTrace) {
		this(owner, name, showInTrace, null);
	}
	
	public BringEvent(Model owner, String name, boolean showInTrace, Position position) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
		this.position = position;
	}

	@Override
	public void eventRoutine(DynamicRobotEntity who1, ResettableAreaObjectEntity who2) {
		if (owner.availableObjects.contains(who2)) {
			owner.availableObjects.remove(who2);
			if (position != null) {
				who2.setPosition(position);
				who1.setPosition(position);
				VisualizationUtil.sendEvent("Bring", who1, position, who2);
			}
			who2.reset();
		}
		who1.nextEvent();
	}

}
