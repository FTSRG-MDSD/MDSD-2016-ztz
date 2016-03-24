package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionHasMessageMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.communicationActionHasMessage pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CommunicationActionHasMessageProcessor implements IMatchProcessor<CommunicationActionHasMessageMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCommunicationAction the value of pattern parameter communicationAction in the currently processed match
   * @param pMessage the value of pattern parameter message in the currently processed match
   * 
   */
  public abstract void process(final CommunicationAction pCommunicationAction, final Message pMessage);
  
  @Override
  public void process(final CommunicationActionHasMessageMatch match) {
    process(match.getCommunicationAction(), match.getMessage());
  }
}
