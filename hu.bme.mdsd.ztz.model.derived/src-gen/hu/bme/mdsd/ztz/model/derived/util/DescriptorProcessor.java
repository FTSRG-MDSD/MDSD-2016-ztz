package hu.bme.mdsd.ztz.model.derived.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.derived.DescriptorMatch;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.derived.descriptor pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DescriptorProcessor implements IMatchProcessor<DescriptorMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSourceRequirement the value of pattern parameter sourceRequirement in the currently processed match
   * @param pTargetDescriptor the value of pattern parameter targetDescriptor in the currently processed match
   * 
   */
  public abstract void process(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor);
  
  @Override
  public void process(final DescriptorMatch match) {
    process(match.getSourceRequirement(), match.getTargetDescriptor());
  }
}
