package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.ExecutorOfTaskMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.executorOfTask pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ExecutorOfTaskProcessor implements IMatchProcessor<ExecutorOfTaskMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * @param pExecution the value of pattern parameter execution in the currently processed match
   * 
   */
  public abstract void process(final DynamicRobot pRobot, final TaskExecution pExecution);
  
  @Override
  public void process(final ExecutorOfTaskMatch match) {
    process(match.getRobot(), match.getExecution());
  }
}
