package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.CircleRequirementReferenceMatch;
import hu.bme.mdsd.ztz.model.constraints.util.CircleRequirementReferenceQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.circleRequirementReference pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CircleRequirementReferenceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"taskExecution"},
 * 	severity = "error",
 * 	message = "TaskExecution $taskExecution$ is prerequisite of itself.",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID"
 * )
 * pattern circleRequirementReference(taskExecution: TaskExecution) {
 * 	find taskExecutionRequiresTaskExecution+(taskExecution, taskExecution);
 * }
 * </pre></code>
 * 
 * @see CircleRequirementReferenceMatch
 * @see CircleRequirementReferenceProcessor
 * @see CircleRequirementReferenceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CircleRequirementReferenceMatcher extends BaseMatcher<CircleRequirementReferenceMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CircleRequirementReferenceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CircleRequirementReferenceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CircleRequirementReferenceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TASKEXECUTION = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CircleRequirementReferenceMatcher.class);
  
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
  public CircleRequirementReferenceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CircleRequirementReferenceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return matches represented as a CircleRequirementReferenceMatch object.
   * 
   */
  public Collection<CircleRequirementReferenceMatch> getAllMatches(final TaskExecution pTaskExecution) {
    return rawGetAllMatches(new Object[]{pTaskExecution});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return a match represented as a CircleRequirementReferenceMatch object, or null if no match is found.
   * 
   */
  public CircleRequirementReferenceMatch getOneArbitraryMatch(final TaskExecution pTaskExecution) {
    return rawGetOneArbitraryMatch(new Object[]{pTaskExecution});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskExecution pTaskExecution) {
    return rawHasMatch(new Object[]{pTaskExecution});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskExecution pTaskExecution) {
    return rawCountMatches(new Object[]{pTaskExecution});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskExecution pTaskExecution, final IMatchProcessor<? super CircleRequirementReferenceMatch> processor) {
    rawForEachMatch(new Object[]{pTaskExecution}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskExecution pTaskExecution, final IMatchProcessor<? super CircleRequirementReferenceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTaskExecution}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CircleRequirementReferenceMatch newMatch(final TaskExecution pTaskExecution) {
    return CircleRequirementReferenceMatch.newMatch(pTaskExecution);
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskExecution> rawAccumulateAllValuesOftaskExecution(final Object[] parameters) {
    Set<TaskExecution> results = new HashSet<TaskExecution>();
    rawAccumulateAllValues(POSITION_TASKEXECUTION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskExecution() {
    return rawAccumulateAllValuesOftaskExecution(emptyArray());
  }
  
  @Override
  protected CircleRequirementReferenceMatch tupleToMatch(final Tuple t) {
    try {
    	return CircleRequirementReferenceMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) t.get(POSITION_TASKEXECUTION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CircleRequirementReferenceMatch arrayToMatch(final Object[] match) {
    try {
    	return CircleRequirementReferenceMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEXECUTION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CircleRequirementReferenceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CircleRequirementReferenceMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEXECUTION]);
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
  public static IQuerySpecification<CircleRequirementReferenceMatcher> querySpecification() throws IncQueryException {
    return CircleRequirementReferenceQuerySpecification.instance();
  }
}
