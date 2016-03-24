package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.MessageToSelfMatch;
import hu.bme.mdsd.ztz.model.constraints.util.MessageToSelfQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.messageToSelf pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MessageToSelfMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"drobot", "communicationAction"},
 * 	severity = "warning",
 * 	message = "$drobot$ sends a message to itself in $communicationAction$.",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID"
 * )
 * pattern messageToSelf(drobot: DynamicRobot, communicationAction: CommunicationAction) {
 * 	DynamicRobot.actions(drobot, communicationAction);
 * 	find messageTarget(communicationAction, drobot);
 * }
 * </pre></code>
 * 
 * @see MessageToSelfMatch
 * @see MessageToSelfProcessor
 * @see MessageToSelfQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MessageToSelfMatcher extends BaseMatcher<MessageToSelfMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MessageToSelfMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MessageToSelfMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MessageToSelfMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DROBOT = 0;
  
  private final static int POSITION_COMMUNICATIONACTION = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MessageToSelfMatcher.class);
  
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
  public MessageToSelfMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MessageToSelfMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return matches represented as a MessageToSelfMatch object.
   * 
   */
  public Collection<MessageToSelfMatch> getAllMatches(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    return rawGetAllMatches(new Object[]{pDrobot, pCommunicationAction});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return a match represented as a MessageToSelfMatch object, or null if no match is found.
   * 
   */
  public MessageToSelfMatch getOneArbitraryMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    return rawGetOneArbitraryMatch(new Object[]{pDrobot, pCommunicationAction});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    return rawHasMatch(new Object[]{pDrobot, pCommunicationAction});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    return rawCountMatches(new Object[]{pDrobot, pCommunicationAction});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction, final IMatchProcessor<? super MessageToSelfMatch> processor) {
    rawForEachMatch(new Object[]{pDrobot, pCommunicationAction}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction, final IMatchProcessor<? super MessageToSelfMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDrobot, pCommunicationAction}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MessageToSelfMatch newMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    return MessageToSelfMatch.newMatch(pDrobot, pCommunicationAction);
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DynamicRobot> rawAccumulateAllValuesOfdrobot(final Object[] parameters) {
    Set<DynamicRobot> results = new HashSet<DynamicRobot>();
    rawAccumulateAllValues(POSITION_DROBOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdrobot() {
    return rawAccumulateAllValuesOfdrobot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdrobot(final MessageToSelfMatch partialMatch) {
    return rawAccumulateAllValuesOfdrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdrobot(final CommunicationAction pCommunicationAction) {
    return rawAccumulateAllValuesOfdrobot(new Object[]{
    null, 
    pCommunicationAction
    });
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
  public Set<CommunicationAction> getAllValuesOfcommunicationAction(final MessageToSelfMatch partialMatch) {
    return rawAccumulateAllValuesOfcommunicationAction(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for communicationAction.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CommunicationAction> getAllValuesOfcommunicationAction(final DynamicRobot pDrobot) {
    return rawAccumulateAllValuesOfcommunicationAction(new Object[]{
    pDrobot, 
    null
    });
  }
  
  @Override
  protected MessageToSelfMatch tupleToMatch(final Tuple t) {
    try {
    	return MessageToSelfMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) t.get(POSITION_DROBOT), (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) t.get(POSITION_COMMUNICATIONACTION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MessageToSelfMatch arrayToMatch(final Object[] match) {
    try {
    	return MessageToSelfMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_DROBOT], (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) match[POSITION_COMMUNICATIONACTION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MessageToSelfMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MessageToSelfMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_DROBOT], (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) match[POSITION_COMMUNICATIONACTION]);
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
  public static IQuerySpecification<MessageToSelfMatcher> querySpecification() throws IncQueryException {
    return MessageToSelfQuerySpecification.instance();
  }
}
