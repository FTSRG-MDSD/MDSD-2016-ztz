package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionHasMessageMatch;
import hu.bme.mdsd.ztz.model.constraints.util.CommunicationActionHasMessageQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.communicationActionHasMessage pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CommunicationActionHasMessageMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern communicationActionHasMessage(communicationAction: CommunicationAction, message: Message) {
 * 	CommunicationAction.message(communicationAction, message);
 * }
 * </pre></code>
 * 
 * @see CommunicationActionHasMessageMatch
 * @see CommunicationActionHasMessageProcessor
 * @see CommunicationActionHasMessageQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CommunicationActionHasMessageMatcher extends BaseMatcher<CommunicationActionHasMessageMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CommunicationActionHasMessageMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CommunicationActionHasMessageMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CommunicationActionHasMessageMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_COMMUNICATIONACTION = 0;
  
  private final static int POSITION_MESSAGE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CommunicationActionHasMessageMatcher.class);
  
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
  public CommunicationActionHasMessageMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CommunicationActionHasMessageMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return matches represented as a CommunicationActionHasMessageMatch object.
   * 
   */
  public Collection<CommunicationActionHasMessageMatch> getAllMatches(final CommunicationAction pCommunicationAction, final Message pMessage) {
    return rawGetAllMatches(new Object[]{pCommunicationAction, pMessage});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return a match represented as a CommunicationActionHasMessageMatch object, or null if no match is found.
   * 
   */
  public CommunicationActionHasMessageMatch getOneArbitraryMatch(final CommunicationAction pCommunicationAction, final Message pMessage) {
    return rawGetOneArbitraryMatch(new Object[]{pCommunicationAction, pMessage});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CommunicationAction pCommunicationAction, final Message pMessage) {
    return rawHasMatch(new Object[]{pCommunicationAction, pMessage});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CommunicationAction pCommunicationAction, final Message pMessage) {
    return rawCountMatches(new Object[]{pCommunicationAction, pMessage});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CommunicationAction pCommunicationAction, final Message pMessage, final IMatchProcessor<? super CommunicationActionHasMessageMatch> processor) {
    rawForEachMatch(new Object[]{pCommunicationAction, pMessage}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CommunicationAction pCommunicationAction, final Message pMessage, final IMatchProcessor<? super CommunicationActionHasMessageMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCommunicationAction, pMessage}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CommunicationActionHasMessageMatch newMatch(final CommunicationAction pCommunicationAction, final Message pMessage) {
    return CommunicationActionHasMessageMatch.newMatch(pCommunicationAction, pMessage);
  }
  
  /**
   * Retrieve the set of values that occur in matches for communicationAction.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<CommunicationAction> rawAccumulateAllValuesOfcommunicationAction(final Object[] parameters) {
    Set<CommunicationAction> results = new HashSet<CommunicationAction>();
    rawAccumulateAllValues(POSITION_COMMUNICATIONACTION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for communicationAction.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CommunicationAction> getAllValuesOfcommunicationAction() {
    return rawAccumulateAllValuesOfcommunicationAction(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for communicationAction.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CommunicationAction> getAllValuesOfcommunicationAction(final CommunicationActionHasMessageMatch partialMatch) {
    return rawAccumulateAllValuesOfcommunicationAction(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for communicationAction.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CommunicationAction> getAllValuesOfcommunicationAction(final Message pMessage) {
    return rawAccumulateAllValuesOfcommunicationAction(new Object[]{
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
  public Set<Message> getAllValuesOfmessage(final CommunicationActionHasMessageMatch partialMatch) {
    return rawAccumulateAllValuesOfmessage(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for message.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Message> getAllValuesOfmessage(final CommunicationAction pCommunicationAction) {
    return rawAccumulateAllValuesOfmessage(new Object[]{
    pCommunicationAction, 
    null
    });
  }
  
  @Override
  protected CommunicationActionHasMessageMatch tupleToMatch(final Tuple t) {
    try {
    	return CommunicationActionHasMessageMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) t.get(POSITION_COMMUNICATIONACTION), (hu.bme.mdsd.ztz.model.behaviour.Message) t.get(POSITION_MESSAGE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CommunicationActionHasMessageMatch arrayToMatch(final Object[] match) {
    try {
    	return CommunicationActionHasMessageMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) match[POSITION_COMMUNICATIONACTION], (hu.bme.mdsd.ztz.model.behaviour.Message) match[POSITION_MESSAGE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CommunicationActionHasMessageMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CommunicationActionHasMessageMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) match[POSITION_COMMUNICATIONACTION], (hu.bme.mdsd.ztz.model.behaviour.Message) match[POSITION_MESSAGE]);
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
  public static IQuerySpecification<CommunicationActionHasMessageMatcher> querySpecification() throws IncQueryException {
    return CommunicationActionHasMessageQuerySpecification.instance();
  }
}
