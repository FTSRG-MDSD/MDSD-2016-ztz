package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import co.paralleluniverse.fibers.SuspendExecution;
import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.Position;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.VisualizationUtil;

public class ResetObjectEvent extends Event<ResettableAreaObjectEntity> {
	
	private ObjectDeliverySimulationModel owner;
	private Position resetPosition;

	public ResetObjectEvent(Model owner, String name, boolean showInTrace, Position resetPosition) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
		this.resetPosition = resetPosition;
	}

	@Override
	public void eventRoutine(ResettableAreaObjectEntity who) throws SuspendExecution {
		if (resetPosition != null) {
			VisualizationUtil.sendEvent("Reset", null, resetPosition, who);
			who.setPosition(resetPosition);
		}
		
		owner.availableObjects.add(who);
	}

}
