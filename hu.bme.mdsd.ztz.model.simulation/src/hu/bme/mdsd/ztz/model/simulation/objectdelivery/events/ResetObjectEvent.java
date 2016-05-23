package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class ResetObjectEvent extends Event<ResettableAreaObjectEntity> {
	
	private ObjectDeliverySimulationModel owner;

	public ResetObjectEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
	}

	@Override
	public void eventRoutine(ResettableAreaObjectEntity who) throws SuspendExecution {
		owner.availableObjects.add(who);
	}

}
