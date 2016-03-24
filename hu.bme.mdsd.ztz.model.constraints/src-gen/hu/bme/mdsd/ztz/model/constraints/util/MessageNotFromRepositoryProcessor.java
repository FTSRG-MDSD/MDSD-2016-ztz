package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.constraints.MessageNotFromRepositoryMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.messageNotFromRepository pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MessageNotFromRepositoryProcessor implements IMatchProcessor<MessageNotFromRepositoryMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMessage the value of pattern parameter message in the currently processed match
   * @param pAction the value of pattern parameter action in the currently processed match
   * 
   */
  public abstract void process(final Message pMessage, final CommunicationAction pAction);
  
  @Override
  public void process(final MessageNotFromRepositoryMatch match) {
    process(match.getMessage(), match.getAction());
  }
}
