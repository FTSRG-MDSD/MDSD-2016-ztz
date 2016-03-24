package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.NotEnoughExecutorsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.notEnoughExecutors pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NotEnoughExecutorsProcessor implements IMatchProcessor<NotEnoughExecutorsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pExecution the value of pattern parameter execution in the currently processed match
   * @param pRequiredNum the value of pattern parameter requiredNum in the currently processed match
   * @param pExecutorNum the value of pattern parameter executorNum in the currently processed match
   * 
   */
  public abstract void process(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum);
  
  @Override
  public void process(final NotEnoughExecutorsMatch match) {
    process(match.getExecution(), match.getRequiredNum(), match.getExecutorNum());
  }
}
