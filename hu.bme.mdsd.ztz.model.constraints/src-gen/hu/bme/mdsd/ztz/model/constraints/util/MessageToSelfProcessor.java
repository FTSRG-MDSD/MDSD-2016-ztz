package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.MessageToSelfMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.messageToSelf pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MessageToSelfProcessor implements IMatchProcessor<MessageToSelfMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDrobot the value of pattern parameter drobot in the currently processed match
   * @param pCommunicationAction the value of pattern parameter communicationAction in the currently processed match
   * 
   */
  public abstract void process(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction);
  
  @Override
  public void process(final MessageToSelfMatch match) {
    process(match.getDrobot(), match.getCommunicationAction());
  }
}
