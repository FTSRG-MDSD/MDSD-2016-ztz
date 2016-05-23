package hu.bme.mdsd.ztz.model.simulation.objectdelivery;

import java.util.concurrent.TimeUnit;

import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.TimeInstant;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.DesmoSimulation;
import hu.bme.mdsd.ztz.model.simulation.objectdelivery.model.ObjectDeliverySimulationModel;

public class SimulationRunner {
	public static void main(String[] args) {
		ObjectDeliverySimulationModel model = new DesmoSimulation(null, "RobotMissionSimulationModel", true, false);
		
		Experiment experiment = new Experiment("Experiment");
		//experiment.setEpsilon(TimeUnit.SECONDS);
		//experiment.setReferenceUnit(TimeUnit.SECONDS);
		
		model.connectToExperiment(experiment);
		
		// Turn on the simulation trace from the start to the end
		experiment.traceOn(new TimeInstant(0));
				
		// Set when to stop the simulation
		experiment.stop(new TimeInstant(8, TimeUnit.HOURS));
				
		experiment.start();
				
		// Create the report files
		experiment.report();
			
		experiment.finish();
	}
}
