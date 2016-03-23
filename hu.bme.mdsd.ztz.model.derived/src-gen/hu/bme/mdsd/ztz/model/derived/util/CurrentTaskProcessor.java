package hu.bme.mdsd.ztz.model.derived.util;

import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.derived.CurrentTaskMatch;
import hu.bme.mdsd.ztz.model.drone.Task;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.derived.currentTask pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CurrentTaskProcessor implements IMatchProcessor<CurrentTaskMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAction the value of pattern parameter action in the currently processed match
   * @param pTask the value of pattern parameter task in the currently processed match
   * 
   */
  public abstract void process(final Action pAction, final Task pTask);
  
  @Override
  public void process(final CurrentTaskMatch match) {
    process(match.getAction(), match.getTask());
  }
}
