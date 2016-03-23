package hu.bme.mdsd.ztz.model.derived.util;

import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.derived.ReceivedMessagesMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.derived.receivedMessages pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReceivedMessagesProcessor implements IMatchProcessor<ReceivedMessagesMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepository the value of pattern parameter repository in the currently processed match
   * @param pMessage the value of pattern parameter message in the currently processed match
   * 
   */
  public abstract void process(final MessageRepository pRepository, final Message pMessage);
  
  @Override
  public void process(final ReceivedMessagesMatch match) {
    process(match.getRepository(), match.getMessage());
  }
}
