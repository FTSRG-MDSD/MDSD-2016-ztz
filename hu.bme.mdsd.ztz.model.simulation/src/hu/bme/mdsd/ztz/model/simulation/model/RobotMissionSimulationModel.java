package hu.bme.mdsd.ztz.model.simulation.model;
import desmoj.core.dist.ContDist;
import desmoj.core.dist.ContDistNormal;
import desmoj.core.dist.ContDistUniform;
import desmoj.core.simulator.Model;
import desmoj.core.simulator.Queue;
import hu.bme.mdsd.ztz.model.simulation.entities.AreaObjectEntity;
import hu.bme.mdsd.ztz.model.simulation.entities.RobotEntity;

public class RobotMissionSimulationModel extends Model {
	
	private static final int ROBOTS = 1;
	private static final int AREAOBJECTS = 3;
	
	public Queue<RobotEntity> robotsQueue;
	public Queue<AreaObjectEntity> pathQueue;
	
	
	private ContDist discoveryTime;
	private ContDist communicationTime;
	private ContDist robotArrivalTime;
	
	public int getDiscoveryTime(){
		int value = discoveryTime.sample().intValue();
		return value <= 0? 1 : value;
	}
	
	public int getCommunicationTime(){
		int value = communicationTime.sample().intValue();
		return value <= 0? 1 : value;
	}
	
	public int getRobotArrivalTime(){
		int value = robotArrivalTime.sample().intValue();
		return value <= 0? 1 : value;
	}

	public RobotMissionSimulationModel(Model owner, String name, boolean showInReport, boolean showInTrace) {
		super(owner, name, showInReport, showInTrace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Robot mission simulation";
	}

	@Override
	public void doInitialSchedules() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		robotsQueue = new Queue<RobotEntity>(this, "Robots queue", true, false);
		pathQueue = new Queue<AreaObjectEntity>(this,"AreaObject's queue",true,false);
		
		robotArrivalTime = new ContDistNormal(this, "Robot arrival time", 4*60, 1*60, true, false);
		discoveryTime = new ContDistUniform(this,"Discover time",1*60,3*60,true,false);
		communicationTime = new ContDistUniform(this, "Communication time", 1*60, 10*60, true, false);
		
		for (int i = 0; i < AREAOBJECTS; i++) {
			pathQueue.insert(new AreaObjectEntity(this, "AreaObject", false));			
		}
		for (int i = 0; i < ROBOTS; i++) {
			robotsQueue.insert(new RobotEntity(this, "Robot", false));
		}
	}

}
