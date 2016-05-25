package hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities;

import java.util.ArrayDeque;
import java.util.Queue;

import desmoj.core.simulator.EventAbstract;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mdsd.ztz.model.simulation.entities.RobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.BringEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.DetectEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveToTargetEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MessageEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class DynamicRobotEntity extends RobotEntity {
	
	protected ObjectDeliverySimulationModel owner;
	private String name;
	
	private Position position;

	public DynamicRobotEntity(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		this.owner = (ObjectDeliverySimulationModel) owner;
		this.name = name;
	}
	
	public String getSimpleName() {
		return name;
	}
	
	protected Queue<StatementEntity> eventQueue;
	
	public void nextEvent() {
		StatementEntity first = eventQueue.poll();
		if (first == null) return;
		
		EventAbstract event = first.getEvent();
		eventQueue.add(first);
		if (event instanceof BringEvent) {
			((BringEvent) event).schedule(
					this,
					(ResettableAreaObjectEntity) first.getParam(),
					new TimeSpan(owner.getRobotBringTime()));
		} else if (event instanceof DetectEvent) {
			((DetectEvent) event).schedule(
					this,
					(ResettableAreaObjectEntity) first.getParam(),
					new TimeSpan(owner.getRobotDetectTime()));
		} else if (event instanceof MoveToTargetEvent) {
			((MoveToTargetEvent) event).schedule(
					this,
					(ResettableAreaObjectEntity) first.getParam(),
					new TimeSpan(owner.getRobotMoveTime()));
		} else if (event instanceof MoveEvent) {
			((MoveEvent) event).schedule(
					this,
					new TimeSpan(owner.getSearchTime()));
		} else if (event instanceof MessageEvent) {
			((MessageEvent) event).schedule(
					this,
					(DynamicRobotEntity) first.getParam(),
					new TimeSpan(owner.getCommunicationTime()));
		} else {
			nextEvent();
		}
	}
	
	public void initializeEvents(StatementEntity... events) {
		eventQueue = new ArrayDeque<>();
		for (int i=0;i<events.length;++i) eventQueue.add(events[i]);
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public Position getPosition() {
		return position;
	}

}
