package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionWithoutMessageMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.communicationActionWithoutMessage pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CommunicationActionWithoutMessageProcessor implements IMatchProcessor<CommunicationActionWithoutMessageMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pCommunicationAction the value of pattern parameter communicationAction in the currently processed match
   * 
   */
  public abstract void process(final CommunicationAction pCommunicationAction);
  
  @Override
  public void process(final CommunicationActionWithoutMessageMatch match) {
    process(match.getCommunicationAction());
  }
}
