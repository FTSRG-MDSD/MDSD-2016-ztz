package hu.bme.mdsd.ztz.model.simulation.objectdelivery.model;

import desmoj.core.simulator.Model;

import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.Position;
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

		bobDEntity.setPosition(new Position(127.86, 25.0));

		DynamicRobotEntity frankDEntity =
			new DynamicRobotEntity(this, "FrankD", false);
		registeredEntities.put(frankDEntity.getSimpleName(), frankDEntity);

		frankDEntity.setPosition(new Position(127.86, 23.01));


		ResettableAreaObjectEntity boxEntity = new ResettableAreaObjectEntity(this, "Box", false);
		
		registeredObjects.put(boxEntity.getSimpleName(), boxEntity);
		availableObjects.add(boxEntity);

		boxEntity.setResetPosition(new Position(127.23, 28.02));
		boxEntity.setPosition(new Position(127.23, 28.02));

		ResettableAreaObjectEntity bottleEntity = new ResettableAreaObjectEntity(this, "Bottle", false);
		
		registeredObjects.put(bottleEntity.getSimpleName(), bottleEntity);
		availableObjects.add(bottleEntity);

		bottleEntity.setResetPosition(new Position(90.2, 20.0));
		bottleEntity.setPosition(new Position(90.2, 20.0));

		ResettableAreaObjectEntity tissueEntity = new ResettableAreaObjectEntity(this, "Tissue", false);
		
		registeredObjects.put(tissueEntity.getSimpleName(), tissueEntity);
		availableObjects.add(tissueEntity);

		tissueEntity.setResetPosition(new Position(122.0, 27.0));
		tissueEntity.setPosition(new Position(122.0, 27.0));

		ResettableAreaObjectEntity stubEntity = new ResettableAreaObjectEntity(this, "Stub", false);
		
		registeredObjects.put(stubEntity.getSimpleName(), stubEntity);
		availableObjects.add(stubEntity);

		stubEntity.setResetPosition(new Position(119.0, 32.0));
		stubEntity.setPosition(new Position(119.0, 32.0));

		ResettableAreaObjectEntity napkinEntity = new ResettableAreaObjectEntity(this, "Napkin", false);
		
		registeredObjects.put(napkinEntity.getSimpleName(), napkinEntity);
		availableObjects.add(napkinEntity);

		napkinEntity.setResetPosition(new Position(133.0, 25.0));
		napkinEntity.setPosition(new Position(133.0, 25.0));

		bobDEntity.initializeEvents(

				new StatementEntity(this, new MoveEvent(this, "Move", true, new Position(27.0, 127.0))),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Tissue", false),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Napkin", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Tissue", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true, new Position(25.0, 127.0)), "Tissue", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Napkin", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true, new Position(25.0, 127.0)), "Napkin", false),
				new StatementEntity(this, new MoveEvent(this, "Move", true, new Position(30.0, 118.0))),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Stub", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Stub", false),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Box", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true, new Position(25.0, 127.0)), "Stub", false)
		);

		frankDEntity.initializeEvents(

				new StatementEntity(this, new MoveEvent(this, "Move", true, new Position(22.0, 90.0))),
				new StatementEntity(this, new DetectEvent(this, "Detect", true), "Bottle", false),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Bottle", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true, new Position(25.0, 127.0)), "Bottle", false),
				new StatementEntity(this, new MoveEvent(this, "Move", true, new Position(20.0, 85.0))),
				new StatementEntity(this, new MoveEvent(this, "Move", true, new Position(21.0, 90.0))),
				new StatementEntity(this, new MoveEvent(this, "Move", true, new Position(20.0, 92.0))),
				new StatementEntity(this, new MoveEvent(this, "Move", true, new Position(25.0, 127.0))),
				new StatementEntity(this, new MoveToTargetEvent(this, "MoveToTarget", true), "Box", false),
				new StatementEntity(this, new BringEvent(this, "Bring", true, new Position(25.0, 127.0)), "Box", false)
		);
	}
}
