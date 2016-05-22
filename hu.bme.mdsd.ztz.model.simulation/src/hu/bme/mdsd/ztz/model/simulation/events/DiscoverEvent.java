package hu.bme.mdsd.ztz.model.simulation.events;

import desmoj.core.simulator.EventOf2Entities;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.TimeSpan;
import hu.bme.mdsd.ztz.model.simulation.entities.AreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.entities.RobotEntity;
import hu.bme.mdsd.ztz.model.simulation.model.RobotMissionSimulationModel;

public class DiscoverEvent extends EventOf2Entities<RobotEntity,AreaObjectEntity>{
	private RobotMissionSimulationModel model;

	public DiscoverEvent(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace);
		// TODO Auto-generated constructor stub
		model = (RobotMissionSimulationModel) owner;
	}

	@Override
	public void eventRoutine(RobotEntity who1, AreaObjectEntity who2) {
		// TODO Auto-generated method stub
		RobotStepEvent event = new RobotStepEvent(model, "Next step event", true);
		event.schedule(new TimeSpan(model.getRobotNextStepTime()));
	}

}
