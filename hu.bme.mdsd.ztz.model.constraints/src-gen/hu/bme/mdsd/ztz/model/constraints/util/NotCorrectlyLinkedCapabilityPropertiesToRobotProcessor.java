package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRobotMatch;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.Robot;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.notCorrectlyLinkedCapabilityPropertiesToRobot pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NotCorrectlyLinkedCapabilityPropertiesToRobotProcessor implements IMatchProcessor<NotCorrectlyLinkedCapabilityPropertiesToRobotMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * @param pCapability the value of pattern parameter capability in the currently processed match
   * 
   */
  public abstract void process(final Robot pRobot, final Capability pCapability);
  
  @Override
  public void process(final NotCorrectlyLinkedCapabilityPropertiesToRobotMatch match) {
    process(match.getRobot(), match.getCapability());
  }
}
