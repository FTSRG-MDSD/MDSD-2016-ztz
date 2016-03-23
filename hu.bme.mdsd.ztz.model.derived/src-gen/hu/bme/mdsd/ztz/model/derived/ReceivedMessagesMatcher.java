package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.derived.ReceivedMessagesMatch;
import hu.bme.mdsd.ztz.model.derived.util.ReceivedMessagesQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.receivedMessages pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ReceivedMessagesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern receivedMessages(repository: MessageRepository, message: Message) {
 * 	DynamicRobot.actions(robotSender, action);
 * 	UnicastCommunication.target(action, robotReceiver);
 * 	robotSender != robotReceiver;
 * 	UnicastCommunication.message(action, message);
 * 	DynamicRobot.messageRepository(robotReceiver, repository);
 * 	}
 * 	or {
 * 	DynamicRobot.actions(robotSender, action);
 * 	MulticastCommunication.targets(action, robotReceiver);
 * 	robotSender != robotReceiver;
 * 	MulticastCommunication.message(action, message);
 * 	DynamicRobot.messageRepository(robotReceiver, repository);
 * 	} or {
 * 	DynamicRobot.actions(robotSender, action);
 * 	BroadcastCommunication.targets(action, robotReceiver);
 * 	robotSender != robotReceiver;
 * 	BroadcastCommunication.message(action, message);
 * 	DynamicRobot.messageRepository(robotReceiver, repository);
 * }
 * </pre></code>
 * 
 * @see ReceivedMessagesMatch
 * @see ReceivedMessagesProcessor
 * @see ReceivedMessagesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ReceivedMessagesMatcher extends BaseMatcher<ReceivedMessagesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ReceivedMessagesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ReceivedMessagesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ReceivedMessagesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REPOSITORY = 0;
  
  private final static int POSITION_MESSAGE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ReceivedMessagesMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public ReceivedMessagesMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public ReceivedMessagesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return matches represented as a ReceivedMessagesMatch object.
   * 
   */
  public Collection<ReceivedMessagesMatch> getAllMatches(final MessageRepository pRepository, final Message pMessage) {
    return rawGetAllMatches(new Object[]{pRepository, pMessage});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return a match represented as a ReceivedMessagesMatch object, or null if no match is found.
   * 
   */
  public ReceivedMessagesMatch getOneArbitraryMatch(final MessageRepository pRepository, final Message pMessage) {
    return rawGetOneArbitraryMatch(new Object[]{pRepository, pMessage});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MessageRepository pRepository, final Message pMessage) {
    return rawHasMatch(new Object[]{pRepository, pMessage});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MessageRepository pRepository, final Message pMessage) {
    return rawCountMatches(new Object[]{pRepository, pMessage});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MessageRepository pRepository, final Message pMessage, final IMatchProcessor<? super ReceivedMessagesMatch> processor) {
    rawForEachMatch(new Object[]{pRepository, pMessage}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MessageRepository pRepository, final Message pMessage, final IMatchProcessor<? super ReceivedMessagesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRepository, pMessage}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ReceivedMessagesMatch newMatch(final MessageRepository pRepository, final Message pMessage) {
    return ReceivedMessagesMatch.newMatch(pRepository, pMessage);
  }
  
  /**
   * Retrieve the set of values that occur in matches for repository.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MessageRepository> rawAccumulateAllValuesOfrepository(final Object[] parameters) {
    Set<MessageRepository> results = new HashSet<MessageRepository>();
    rawAccumulateAllValues(POSITION_REPOSITORY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for repository.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MessageRepository> getAllValuesOfrepository() {
    return rawAccumulateAllValuesOfrepository(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repository.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MessageRepository> getAllValuesOfrepository(final ReceivedMessagesMatch partialMatch) {
    return rawAccumulateAllValuesOfrepository(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for repository.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MessageRepository> getAllValuesOfrepository(final Message pMessage) {
    return rawAccumulateAllValuesOfrepository(new Object[]{
    null, 
    pMessage
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for message.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Message> rawAccumulateAllValuesOfmessage(final Object[] parameters) {
    Set<Message> results = new HashSet<Message>();
    rawAccumulateAllValues(POSITION_MESSAGE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for message.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Message> getAllValuesOfmessage() {
    return rawAccumulateAllValuesOfmessage(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for message.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Message> getAllValuesOfmessage(final ReceivedMessagesMatch partialMatch) {
    return rawAccumulateAllValuesOfmessage(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for message.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Message> getAllValuesOfmessage(final MessageRepository pRepository) {
    return rawAccumulateAllValuesOfmessage(new Object[]{
    pRepository, 
    null
    });
  }
  
  @Override
  protected ReceivedMessagesMatch tupleToMatch(final Tuple t) {
    try {
    	return ReceivedMessagesMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.MessageRepository) t.get(POSITION_REPOSITORY), (hu.bme.mdsd.ztz.model.behaviour.Message) t.get(POSITION_MESSAGE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ReceivedMessagesMatch arrayToMatch(final Object[] match) {
    try {
    	return ReceivedMessagesMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.MessageRepository) match[POSITION_REPOSITORY], (hu.bme.mdsd.ztz.model.behaviour.Message) match[POSITION_MESSAGE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ReceivedMessagesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ReceivedMessagesMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.MessageRepository) match[POSITION_REPOSITORY], (hu.bme.mdsd.ztz.model.behaviour.Message) match[POSITION_MESSAGE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ReceivedMessagesMatcher> querySpecification() throws IncQueryException {
    return ReceivedMessagesQuerySpecification.instance();
  }
}
