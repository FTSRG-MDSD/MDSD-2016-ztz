package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.NonPositiveParticipantsMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.nonPositiveParticipants pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NonPositiveParticipantsProcessor implements IMatchProcessor<NonPositiveParticipantsMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRequirement the value of pattern parameter requirement in the currently processed match
   * 
   */
  public abstract void process(final TaskRequirement pRequirement);
  
  @Override
  public void process(final NonPositiveParticipantsMatch match) {
    process(match.getRequirement());
  }
}
