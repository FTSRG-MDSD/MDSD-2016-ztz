package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.MessageTargetMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.messageTarget pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MessageTargetProcessor implements IMatchProcessor<MessageTargetMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCommunicationAction the value of pattern parameter communicationAction in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget);
  
  @Override
  public void process(final MessageTargetMatch match) {
    process(match.getCommunicationAction(), match.getTarget());
  }
}
