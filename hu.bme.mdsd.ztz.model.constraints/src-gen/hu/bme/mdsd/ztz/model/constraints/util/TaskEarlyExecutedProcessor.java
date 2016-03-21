package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.TaskEarlyExecutedMatch;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskExecution;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.taskEarlyExecuted pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TaskEarlyExecutedProcessor implements IMatchProcessor<TaskEarlyExecutedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTask the value of pattern parameter task in the currently processed match
   * @param pExecution the value of pattern parameter execution in the currently processed match
   * 
   */
  public abstract void process(final Task pTask, final TaskExecution pExecution);
  
  @Override
  public void process(final TaskEarlyExecutedMatch match) {
    process(match.getTask(), match.getExecution());
  }
}
