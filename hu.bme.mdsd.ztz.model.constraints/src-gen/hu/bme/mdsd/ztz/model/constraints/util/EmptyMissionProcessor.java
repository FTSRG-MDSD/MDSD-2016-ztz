package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.EmptyMissionMatch;
import hu.bme.mdsd.ztz.model.drone.Mission;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.emptyMission pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyMissionProcessor implements IMatchProcessor<EmptyMissionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMission the value of pattern parameter mission in the currently processed match
   * 
   */
  public abstract void process(final Mission pMission);
  
  @Override
  public void process(final EmptyMissionMatch match) {
    process(match.getMission());
  }
}
