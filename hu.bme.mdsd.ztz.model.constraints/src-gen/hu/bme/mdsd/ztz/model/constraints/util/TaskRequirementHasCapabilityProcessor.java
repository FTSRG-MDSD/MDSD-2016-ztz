package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.TaskRequirementHasCapabilityMatch;
import hu.bme.mdsd.ztz.model.drone.Capability;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.taskRequirementHasCapability pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TaskRequirementHasCapabilityProcessor implements IMatchProcessor<TaskRequirementHasCapabilityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRequirement the value of pattern parameter requirement in the currently processed match
   * @param pCapability the value of pattern parameter capability in the currently processed match
   * 
   */
  public abstract void process(final TaskRequirement pRequirement, final Capability pCapability);
  
  @Override
  public void process(final TaskRequirementHasCapabilityMatch match) {
    process(match.getRequirement(), match.getCapability());
  }
}
