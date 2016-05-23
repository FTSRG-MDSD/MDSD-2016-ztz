package hu.bme.mdsd.ztz.model.simulation.objectdelivery.model;
import desmoj.core.simulator.Model;

import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.StatementEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.BringEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.DetectEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.ResetObjectEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveToTargetEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MessageEvent;

public class DesmoSimulation extends ObjectDeliverySimulationModel {
	
	public DesmoSimulation(Model owner, String name, boolean showInReport, boolean showInTrace) {
			super(owner, name, showInReport, showInTrace);
	}
	
	@Override
	public void init() {
		super.init();

		DynamicRobotEntity bobDEntity =
			new DynamicRobotEntity(this, "BobD", false);
		registeredEntities.put(bobDEntity.getSimpleName(), bobDEntity);

		DynamicRobotEntity frankDEntity =
			new DynamicRobotEntity(this, "FrankD", false);
		registeredEntities.put(frankDEntity.getSimpleName(), frankDEntity);

		ResettableAreaObjectEntity boxEntity = new ResettableAreaObjectEntity(this, "Box", false);
		
		registeredObjects.put(boxEntity.getSimpleName(), boxEntity);
		availableObjects.add(boxEntity);

		ResettableAreaObjectEntity bottleEntity = new ResettableAreaObjectEntity(this, "Bottle", false);
		
		registeredObjects.put(bottleEntity.getSimpleName(), bottleEntity);
		availableObjects.add(bottleEntity);

		ResettableAreaObjectEntity tissueEntity = new ResettableAreaObjectEntity(this, "Tissue", false);
		
		registeredObjects.put(tissueEntity.getSimpleName(), tissueEntity);
		availableObjects.add(tissueEntity);

		ResettableAreaObjectEntity stubEntity = new ResettableAreaObjectEntity(this, "Stub", false);
		
		registeredObjects.put(stubEntity.getSimpleName(), stubEntity);
		availableObjects.add(stubEntity);

		ResettableAreaObjectEntity napkinEntity = new ResettableAreaObjectEntity(this, "Napkin", false);
		
		registeredObjects.put(napkinEntity.getSimpleName(), napkinEntity);
		availableObjects.add(napkinEntity);

		bobDEntity.initializeEvents(

				new StatementEntity(this, new MoveEvent(this, "Move", true)),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Tissue", false),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Napkin", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Tissue", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true), "Tissue", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Napkin", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true), "Napkin", false),
				new StatementEntity(this, new MoveEvent(this, "Move", true)),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Stub", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Stub", false),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Box", false),
				new StatementEntity(this, new MessageEvent(this, "Message", true), "FrankD", true),
				new StatementEntity(this, new BringEvent(this, "Bring", true), "Stub", false)
		);

		frankDEntity.initializeEvents(

				new StatementEntity(this, new MoveEvent(this, "Move", true)),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Bottle", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Bottle", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true), "Bottle", false),
				new StatementEntity(this, new MoveEvent(this, "Move", true)),
				new StatementEntity(this, new MoveEvent(this, "Move", true)),
				new StatementEntity(this, new MoveEvent(this, "Move", true)),
				new StatementEntity(this, new MoveEvent(this, "Move", true)),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Box", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true), "Box", false)
		);
	}
}
