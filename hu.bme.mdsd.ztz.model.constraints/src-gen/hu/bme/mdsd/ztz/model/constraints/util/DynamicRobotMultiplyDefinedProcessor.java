package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.DynamicRobotMultiplyDefinedMatch;
import hu.bme.mdsd.ztz.model.drone.Robot;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.dynamicRobotMultiplyDefined pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DynamicRobotMultiplyDefinedProcessor implements IMatchProcessor<DynamicRobotMultiplyDefinedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * 
   */
  public abstract void process(final Robot pRobot);
  
  @Override
  public void process(final DynamicRobotMultiplyDefinedMatch match) {
    process(match.getRobot());
  }
}
