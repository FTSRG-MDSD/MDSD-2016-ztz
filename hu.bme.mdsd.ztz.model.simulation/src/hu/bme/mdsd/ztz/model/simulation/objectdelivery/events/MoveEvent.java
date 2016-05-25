package hu.bme.mdsd.ztz.model.simulation.objectdelivery.events;

import desmoj.core.simulator.Event;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.Position;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.VisualizationUtil;

public class MoveEvent extends Event<DynamicRobotEntity> {
	
	private Position position;

	public MoveEvent(Model owner, String name, boolean showInTrace) {
		this(owner, name, showInTrace, null);
	}
	
	public MoveEvent(Model owner, String name, boolean showInTrace, Position position) {
		super(owner, name, showInTrace);
		this.position = position;
	}
	

	@Override
	public void eventRoutine(DynamicRobotEntity who) {
		if (position != null) {
			who.setPosition(position);
			VisualizationUtil.sendEvent("Move", who, position);
		}
		who.nextEvent();
	}

}
