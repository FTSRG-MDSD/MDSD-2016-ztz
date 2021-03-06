package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.SameCollaboratorRobotMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.sameCollaboratorRobot pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SameCollaboratorRobotProcessor implements IMatchProcessor<SameCollaboratorRobotMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * 
   */
  public abstract void process(final DynamicRobot pRobot);
  
  @Override
  public void process(final SameCollaboratorRobotMatch match) {
    process(match.getRobot());
  }
}
