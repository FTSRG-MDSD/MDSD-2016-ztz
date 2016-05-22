package hu.bme.mdsd.ztz.model.simulation.entities;

import desmoj.core.simulator.Entity;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.Queue;

public class AreaObjectEntity extends Entity {
	
	public Queue<RobotEntity> inareaRobots;
	
	public AreaObjectEntity(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		// TODO Auto-generated constructor stub
	}

}
