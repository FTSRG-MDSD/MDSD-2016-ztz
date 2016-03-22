package hu.bme.mdsd.ztz.model.derived.util;

import hu.bme.mdsd.ztz.model.derived.MissionMatch;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Robot;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.derived.mission pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MissionProcessor implements IMatchProcessor<MissionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSourceRobot the value of pattern parameter sourceRobot in the currently processed match
   * @param pTargetMission the value of pattern parameter targetMission in the currently processed match
   * 
   */
  public abstract void process(final Robot pSourceRobot, final Mission pTargetMission);
  
  @Override
  public void process(final MissionMatch match) {
    process(match.getSourceRobot(), match.getTargetMission());
  }
}
