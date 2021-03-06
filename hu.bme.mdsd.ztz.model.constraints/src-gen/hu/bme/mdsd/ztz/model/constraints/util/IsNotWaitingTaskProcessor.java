package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.IsNotWaitingTaskMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.isNotWaitingTask pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class IsNotWaitingTaskProcessor implements IMatchProcessor<IsNotWaitingTaskMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTaskExecution the value of pattern parameter taskExecution in the currently processed match
   * 
   */
  public abstract void process(final TaskExecution pTaskExecution);
  
  @Override
  public void process(final IsNotWaitingTaskMatch match) {
    process(match.getTaskExecution());
  }
}
