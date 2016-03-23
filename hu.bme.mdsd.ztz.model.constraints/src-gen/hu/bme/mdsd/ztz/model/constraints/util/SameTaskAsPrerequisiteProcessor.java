package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.SameTaskAsPrerequisiteMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.sameTaskAsPrerequisite pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SameTaskAsPrerequisiteProcessor implements IMatchProcessor<SameTaskAsPrerequisiteMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTaskRequirement the value of pattern parameter taskRequirement in the currently processed match
   * @param pTaskExecution the value of pattern parameter taskExecution in the currently processed match
   * 
   */
  public abstract void process(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution);
  
  @Override
  public void process(final SameTaskAsPrerequisiteMatch match) {
    process(match.getTaskRequirement(), match.getTaskExecution());
  }
}
