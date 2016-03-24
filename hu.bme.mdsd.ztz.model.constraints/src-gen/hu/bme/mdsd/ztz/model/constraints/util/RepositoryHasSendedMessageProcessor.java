package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.constraints.RepositoryHasSendedMessageMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.repositoryHasSendedMessage pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RepositoryHasSendedMessageProcessor implements IMatchProcessor<RepositoryHasSendedMessageMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRepository the value of pattern parameter repository in the currently processed match
   * @param pMessage the value of pattern parameter message in the currently processed match
   * 
   */
  public abstract void process(final MessageRepository pRepository, final Message pMessage);
  
  @Override
  public void process(final RepositoryHasSendedMessageMatch match) {
    process(match.getRepository(), match.getMessage());
  }
}
