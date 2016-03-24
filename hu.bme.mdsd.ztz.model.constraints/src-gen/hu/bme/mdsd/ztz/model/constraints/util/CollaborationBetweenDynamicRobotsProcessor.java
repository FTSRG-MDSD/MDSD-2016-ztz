package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.CollaborationBetweenDynamicRobotsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.collaborationBetweenDynamicRobots pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CollaborationBetweenDynamicRobotsProcessor implements IMatchProcessor<CollaborationBetweenDynamicRobotsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDrobot the value of pattern parameter drobot in the currently processed match
   * @param pDcollaborator the value of pattern parameter dcollaborator in the currently processed match
   * 
   */
  public abstract void process(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator);
  
  @Override
  public void process(final CollaborationBetweenDynamicRobotsMatch match) {
    process(match.getDrobot(), match.getDcollaborator());
  }
}
