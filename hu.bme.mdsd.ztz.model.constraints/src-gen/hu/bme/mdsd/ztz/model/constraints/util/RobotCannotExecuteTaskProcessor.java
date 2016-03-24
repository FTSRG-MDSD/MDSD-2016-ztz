package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.RobotCannotExecuteTaskMatch;
import hu.bme.mdsd.ztz.model.drone.Capability;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.robotCannotExecuteTask pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RobotCannotExecuteTaskProcessor implements IMatchProcessor<RobotCannotExecuteTaskMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDrobot the value of pattern parameter drobot in the currently processed match
   * @param pTaskExecution the value of pattern parameter taskExecution in the currently processed match
   * @param pCapability the value of pattern parameter capability in the currently processed match
   * 
   */
  public abstract void process(final DynamicRobot pDrobot, final TaskExecution pTaskExecution, final Capability pCapability);
  
  @Override
  public void process(final RobotCannotExecuteTaskMatch match) {
    process(match.getDrobot(), match.getTaskExecution(), match.getCapability());
  }
}
