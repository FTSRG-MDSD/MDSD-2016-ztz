package hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities;

import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mdsd.ztz.model.simulation.entities.AreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.ResetObjectEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class ResettableAreaObjectEntity extends AreaObjectEntity {
	
	private ObjectDeliverySimulationModel owner;
	private String name;
	
	private Position resetPosition;
	private Position position;

	public ResettableAreaObjectEntity(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
		this.name = name;
	}
	
	public String getSimpleName() {
		return name;
	}
	
	public void reset() {
		new ResetObjectEvent(getModel(), "Reset", true, resetPosition)
		.schedule(this, new TimeSpan(owner.getObjectResetTime()));
	}
	
	public void setResetPosition(Position position) {
		this.resetPosition = position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Position getPosition() {
		return position;
	}

}
