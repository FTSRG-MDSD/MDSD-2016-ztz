package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.RobotHasTaskMatch;
import hu.bme.mdsd.ztz.model.drone.Task;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.robotHasTask pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RobotHasTaskProcessor implements IMatchProcessor<RobotHasTaskMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * @param pTask the value of pattern parameter task in the currently processed match
   * 
   */
  public abstract void process(final DynamicRobot pRobot, final Task pTask);
  
  @Override
  public void process(final RobotHasTaskMatch match) {
    process(match.getRobot(), match.getTask());
  }
}
