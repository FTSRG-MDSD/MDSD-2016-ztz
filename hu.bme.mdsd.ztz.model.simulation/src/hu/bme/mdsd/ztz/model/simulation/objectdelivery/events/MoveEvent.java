package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;

public class MoveEvent extends Event<DynamicRobotEntity> {

	public MoveEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void eventRoutine(DynamicRobotEntity who) {
		who.nextEvent();
	}

}
