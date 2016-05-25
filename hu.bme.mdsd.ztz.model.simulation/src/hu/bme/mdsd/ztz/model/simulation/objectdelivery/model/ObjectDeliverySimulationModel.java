package hu.bme.mdsd.ztz.model.simulation.objectdelivery.model;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import desmoj.core.dist.ContDist;
import desmoj.core.dist.ContDistNormal;
import desmoj.core.dist.ContDistUniform;
import desmoj.core.simulator.EventAbstract;
import desmoj.core.simulator.Model;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.BringEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.DetectEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MessageEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveToTargetEvent;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.ResetObjectEvent;

public class ObjectDeliverySimulationModel extends Model {
	
	protected Map<String, DynamicRobotEntity> registeredEntities;
	protected Map<String, ResettableAreaObjectEntity> registeredObjects;
	
	public Map<DynamicRobotEntity, String> waitingForCommunication;
	public Set<ResettableAreaObjectEntity> availableObjects;
	
	public DynamicRobotEntity getRobotByName(String name) {
		return registeredEntities.get(name);
	}
	
	public ResettableAreaObjectEntity getObjectByName(String name) {
		return registeredObjects.get(name);
	}
	
	private ContDist communicationTime;
	private ContDist robotBringTime;
	private ContDist robotDetectTime;
	private ContDist robotMoveTime;
	private ContDist objectResetTime;
	private ContDist robotSearchTime;
	
	public int getCommunicationTime(){
		int value = communicationTime.sample().intValue();
		return value <= 0? 1 : value;
	}
	
	
	public int getTimeByEvent(Class<? extends EventAbstract> event) {
		if (event.equals(BringEvent.class)) {
			return getRobotBringTime();
		} else if (event.equals(DetectEvent.class)) {
			return getRobotDetectTime();
		} else if (event.equals(MoveToTargetEvent.class)) {
			return getRobotMoveTime();
		} else if (event.equals(ResetObjectEvent.class)) {
			return getObjectResetTime();
		} else if (event.equals(MoveEvent.class)) {
			return getSearchTime();
		} else if (event.equals(MessageEvent.class)) {
			return getCommunicationTime();
		}
		return 0;
	}

	public int getSearchTime() {
		int value = robotSearchTime.sample().intValue();
		return value <= 0? 1 : value;
	}

	public int getObjectResetTime() {
		int value = objectResetTime.sample().intValue();
		return value <= 0? 1 : value;
	}

	public int getRobotMoveTime() {
		int value = robotMoveTime.sample().intValue();
		return value <= 0? 1 : value;
	}

	public int getRobotDetectTime() {
		int value = robotDetectTime.sample().intValue();
		return value <= 0? 1 : value;
	}

	public int getRobotBringTime() {
		int value = robotBringTime.sample().intValue();
		return value <= 0? 1 : value;
	}

	public ObjectDeliverySimulationModel(Model owner, String name, boolean showInReport, boolean showInTrace) {
		super(owner, name, showInReport, showInTrace);
	}

	@Override
	public String description() {
		return "Robot Mission Simulation - Object Delivery";
	}

	@Override
	public void doInitialSchedules() {
		sendInitialStatus();
		for (DynamicRobotEntity entity : registeredEntities.values()) {
			entity.nextEvent();
		}
	}

	private void sendInitialStatus() {
		for (DynamicRobotEntity entity : registeredEntities.values()) {
			if (entity.getPosition() != null) {
				VisualizationUtil.sendPosition(entity);
			}
		}
		for (ResettableAreaObjectEntity entity : registeredObjects.values()) {
			if (entity.getPosition() != null) {
				VisualizationUtil.sendPosition(entity);
			}
		}
	}

	@Override
	public void init() {
		registeredEntities = new HashMap<>();
		registeredObjects = new HashMap<>();
		availableObjects = new HashSet<>();
		waitingForCommunication = new HashMap<>();
		
		robotBringTime = new ContDistNormal(this, "Bring time", 10*60, 5*60, true, false);
		robotDetectTime = new ContDistUniform(this, "Detect time", 1*60, 5*60, true, false);
		robotMoveTime = new ContDistUniform(this,"Move time",1*60,10*60,true,false);
		objectResetTime = new ContDistUniform(this,"Reset time",40*60,100*60,true,false);
		robotSearchTime = new ContDistUniform(this,"Search time",1*60,100*60,true,false);
		communicationTime = new ContDistUniform(this, "Communication time", 1*60, 10*60, true, false);
				
	}

}
