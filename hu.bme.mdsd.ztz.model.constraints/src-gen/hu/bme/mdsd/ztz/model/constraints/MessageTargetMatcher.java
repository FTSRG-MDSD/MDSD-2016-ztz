package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.MessageTargetMatch;
import hu.bme.mdsd.ztz.model.constraints.util.MessageTargetQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.messageTarget pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MessageTargetMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern messageTarget(communicationAction: CommunicationAction, target: DynamicRobot) {
 * 	UnicastCommunication.target(communicationAction, target);
 * } or {
 * 	MulticastCommunication.targets(communicationAction, target);
 * } or {
 * 	BroadcastCommunication.targets(communicationAction, target);
 * }
 * </pre></code>
 * 
 * @see MessageTargetMatch
 * @see MessageTargetProcessor
 * @see MessageTargetQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MessageTargetMatcher extends BaseMatcher<MessageTargetMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MessageTargetMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MessageTargetMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MessageTargetMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_COMMUNICATIONACTION = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MessageTargetMatcher.class);
  
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
  public MessageTargetMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MessageTargetMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return matches represented as a MessageTargetMatch object.
   * 
   */
  public Collection<MessageTargetMatch> getAllMatches(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    return rawGetAllMatches(new Object[]{pCommunicationAction, pTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return a match represented as a MessageTargetMatch object, or null if no match is found.
   * 
   */
  public MessageTargetMatch getOneArbitraryMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    return rawGetOneArbitraryMatch(new Object[]{pCommunicationAction, pTarget});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    return rawHasMatch(new Object[]{pCommunicationAction, pTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    return rawCountMatches(new Object[]{pCommunicationAction, pTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget, final IMatchProcessor<? super MessageTargetMatch> processor) {
    rawForEachMatch(new Object[]{pCommunicationAction, pTarget}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget, final IMatchProcessor<? super MessageTargetMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCommunicationAction, pTarget}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MessageTargetMatch newMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    return MessageTargetMatch.newMatch(pCommunicationAction, pTarget);
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
  public Set<CommunicationAction> getAllValuesOfcommunicationAction(final MessageTargetMatch partialMatch) {
    return rawAccumulateAllValuesOfcommunicationAction(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for communicationAction.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CommunicationAction> getAllValuesOfcommunicationAction(final DynamicRobot pTarget) {
    return rawAccumulateAllValuesOfcommunicationAction(new Object[]{
    null, 
    pTarget
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DynamicRobot> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<DynamicRobot> results = new HashSet<DynamicRobot>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOftarget(final MessageTargetMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOftarget(final CommunicationAction pCommunicationAction) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pCommunicationAction, 
    null
    });
  }
  
  @Override
  protected MessageTargetMatch tupleToMatch(final Tuple t) {
    try {
    	return MessageTargetMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) t.get(POSITION_COMMUNICATIONACTION), (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) t.get(POSITION_TARGET));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MessageTargetMatch arrayToMatch(final Object[] match) {
    try {
    	return MessageTargetMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) match[POSITION_COMMUNICATIONACTION], (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MessageTargetMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MessageTargetMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) match[POSITION_COMMUNICATIONACTION], (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_TARGET]);
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
  public static IQuerySpecification<MessageTargetMatcher> querySpecification() throws IncQueryException {
    return MessageTargetQuerySpecification.instance();
  }
}
