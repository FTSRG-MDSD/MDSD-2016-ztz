package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.MissionContainsTaskMatch;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Task;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.missionContainsTask pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MissionContainsTaskProcessor implements IMatchProcessor<MissionContainsTaskMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMission the value of pattern parameter mission in the currently processed match
   * @param pTask the value of pattern parameter task in the currently processed match
   * 
   */
  public abstract void process(final Mission pMission, final Task pTask);
  
  @Override
  public void process(final MissionContainsTaskMatch match) {
    process(match.getMission(), match.getTask());
  }
}
