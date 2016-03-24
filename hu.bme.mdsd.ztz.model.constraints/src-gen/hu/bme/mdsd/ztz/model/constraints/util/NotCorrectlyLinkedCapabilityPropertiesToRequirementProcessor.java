package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch;
import hu.bme.mdsd.ztz.model.drone.Capability;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.notCorrectlyLinkedCapabilityPropertiesToRequirement pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NotCorrectlyLinkedCapabilityPropertiesToRequirementProcessor implements IMatchProcessor<NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRequirement the value of pattern parameter requirement in the currently processed match
   * @param pCapability the value of pattern parameter capability in the currently processed match
   * 
   */
  public abstract void process(final TaskRequirement pRequirement, final Capability pCapability);
  
  @Override
  public void process(final NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch match) {
    process(match.getRequirement(), match.getCapability());
  }
}
