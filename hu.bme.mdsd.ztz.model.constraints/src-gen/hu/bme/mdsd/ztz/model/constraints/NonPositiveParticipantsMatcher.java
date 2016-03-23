package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.NonPositiveParticipantsMatch;
import hu.bme.mdsd.ztz.model.constraints.util.NonPositiveParticipantsQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.nonPositiveParticipants pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NonPositiveParticipantsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"requirement"},
 * 	severity = "error",
 * 	message = "The number of participants has to be positive!",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID"
 * )
 * pattern nonPositiveParticipants(requirement: TaskRequirement) {
 * 	TaskRequirement.participants(requirement, participants);
 * 	check(participants {@literal <}= 0);
 * }
 * </pre></code>
 * 
 * @see NonPositiveParticipantsMatch
 * @see NonPositiveParticipantsProcessor
 * @see NonPositiveParticipantsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NonPositiveParticipantsMatcher extends BaseMatcher<NonPositiveParticipantsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NonPositiveParticipantsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NonPositiveParticipantsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NonPositiveParticipantsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REQUIREMENT = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NonPositiveParticipantsMatcher.class);
  
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
  public NonPositiveParticipantsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NonPositiveParticipantsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @return matches represented as a NonPositiveParticipantsMatch object.
   * 
   */
  public Collection<NonPositiveParticipantsMatch> getAllMatches(final TaskRequirement pRequirement) {
    return rawGetAllMatches(new Object[]{pRequirement});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @return a match represented as a NonPositiveParticipantsMatch object, or null if no match is found.
   * 
   */
  public NonPositiveParticipantsMatch getOneArbitraryMatch(final TaskRequirement pRequirement) {
    return rawGetOneArbitraryMatch(new Object[]{pRequirement});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskRequirement pRequirement) {
    return rawHasMatch(new Object[]{pRequirement});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskRequirement pRequirement) {
    return rawCountMatches(new Object[]{pRequirement});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskRequirement pRequirement, final IMatchProcessor<? super NonPositiveParticipantsMatch> processor) {
    rawForEachMatch(new Object[]{pRequirement}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskRequirement pRequirement, final IMatchProcessor<? super NonPositiveParticipantsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRequirement}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NonPositiveParticipantsMatch newMatch(final TaskRequirement pRequirement) {
    return NonPositiveParticipantsMatch.newMatch(pRequirement);
  }
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskRequirement> rawAccumulateAllValuesOfrequirement(final Object[] parameters) {
    Set<TaskRequirement> results = new HashSet<TaskRequirement>();
    rawAccumulateAllValues(POSITION_REQUIREMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfrequirement() {
    return rawAccumulateAllValuesOfrequirement(emptyArray());
  }
  
  @Override
  protected NonPositiveParticipantsMatch tupleToMatch(final Tuple t) {
    try {
    	return NonPositiveParticipantsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) t.get(POSITION_REQUIREMENT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NonPositiveParticipantsMatch arrayToMatch(final Object[] match) {
    try {
    	return NonPositiveParticipantsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_REQUIREMENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NonPositiveParticipantsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NonPositiveParticipantsMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_REQUIREMENT]);
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
  public static IQuerySpecification<NonPositiveParticipantsMatcher> querySpecification() throws IncQueryException {
    return NonPositiveParticipantsQuerySpecification.instance();
  }
}
