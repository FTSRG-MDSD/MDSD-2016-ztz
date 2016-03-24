package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.TaskExecutionRequiresTaskExecutionMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.taskExecutionRequiresTaskExecution pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TaskExecutionRequiresTaskExecutionProcessor implements IMatchProcessor<TaskExecutionRequiresTaskExecutionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTaskEx the value of pattern parameter taskEx in the currently processed match
   * @param pRequiredTaskEx the value of pattern parameter requiredTaskEx in the currently processed match
   * 
   */
  public abstract void process(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx);
  
  @Override
  public void process(final TaskExecutionRequiresTaskExecutionMatch match) {
    process(match.getTaskEx(), match.getRequiredTaskEx());
  }
}
