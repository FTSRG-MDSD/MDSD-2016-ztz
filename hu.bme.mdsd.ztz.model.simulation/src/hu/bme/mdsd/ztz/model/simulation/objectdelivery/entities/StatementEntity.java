package hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.EventAbstract;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class StatementEntity extends Entity{
	
	public StatementEntity(ObjectDeliverySimulationModel owner, EventAbstract event) {
		this(owner, event, null, false);
	}
	
	public StatementEntity(ObjectDeliverySimulationModel owner, EventAbstract event, String param, boolean isRobot) {
		super(owner, "Statement", false);
		this.owner = owner;
		this.event = event;
		this.param = param;
		this.isRobot = isRobot;
	}
	
	private ObjectDeliverySimulationModel owner;
	
	private EventAbstract event;
	
	private String param;
	
	private boolean isRobot;
	
	public EventAbstract getEvent() {
		return event;
	}
	
	public Entity getParam() {
		if (isRobot) {
			return owner.getRobotByName(param);
		} else {
			return owner.getObjectByName(param);
		}
	}
}
