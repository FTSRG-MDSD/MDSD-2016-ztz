package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.SameTaskAsPrerequisiteMatch;
import hu.bme.mdsd.ztz.model.constraints.util.SameTaskAsPrerequisiteQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.sameTaskAsPrerequisite pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SameTaskAsPrerequisiteMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"taskExecution", "taskRequirement"},
 * 	severity = "error",
 * 	message = "The prerequisite task of $taskExecution$ is the same!",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID"
 * )
 * pattern sameTaskAsPrerequisite(taskRequirement: TaskRequirement, taskExecution: TaskExecution) {
 * 	TaskRequirement.prerequisite(taskRequirement, taskExecution);
 * 	TaskRequirement.taskExecution(taskRequirement, taskExecution);
 * }
 * </pre></code>
 * 
 * @see SameTaskAsPrerequisiteMatch
 * @see SameTaskAsPrerequisiteProcessor
 * @see SameTaskAsPrerequisiteQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SameTaskAsPrerequisiteMatcher extends BaseMatcher<SameTaskAsPrerequisiteMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SameTaskAsPrerequisiteMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SameTaskAsPrerequisiteMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SameTaskAsPrerequisiteMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TASKREQUIREMENT = 0;
  
  private final static int POSITION_TASKEXECUTION = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SameTaskAsPrerequisiteMatcher.class);
  
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
  public SameTaskAsPrerequisiteMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SameTaskAsPrerequisiteMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return matches represented as a SameTaskAsPrerequisiteMatch object.
   * 
   */
  public Collection<SameTaskAsPrerequisiteMatch> getAllMatches(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    return rawGetAllMatches(new Object[]{pTaskRequirement, pTaskExecution});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return a match represented as a SameTaskAsPrerequisiteMatch object, or null if no match is found.
   * 
   */
  public SameTaskAsPrerequisiteMatch getOneArbitraryMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    return rawGetOneArbitraryMatch(new Object[]{pTaskRequirement, pTaskExecution});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    return rawHasMatch(new Object[]{pTaskRequirement, pTaskExecution});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    return rawCountMatches(new Object[]{pTaskRequirement, pTaskExecution});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution, final IMatchProcessor<? super SameTaskAsPrerequisiteMatch> processor) {
    rawForEachMatch(new Object[]{pTaskRequirement, pTaskExecution}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution, final IMatchProcessor<? super SameTaskAsPrerequisiteMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTaskRequirement, pTaskExecution}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SameTaskAsPrerequisiteMatch newMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    return SameTaskAsPrerequisiteMatch.newMatch(pTaskRequirement, pTaskExecution);
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskRequirement> rawAccumulateAllValuesOftaskRequirement(final Object[] parameters) {
    Set<TaskRequirement> results = new HashSet<TaskRequirement>();
    rawAccumulateAllValues(POSITION_TASKREQUIREMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOftaskRequirement() {
    return rawAccumulateAllValuesOftaskRequirement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOftaskRequirement(final SameTaskAsPrerequisiteMatch partialMatch) {
    return rawAccumulateAllValuesOftaskRequirement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOftaskRequirement(final TaskExecution pTaskExecution) {
    return rawAccumulateAllValuesOftaskRequirement(new Object[]{
    null, 
    pTaskExecution
    });
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
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskExecution(final SameTaskAsPrerequisiteMatch partialMatch) {
    return rawAccumulateAllValuesOftaskExecution(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskExecution(final TaskRequirement pTaskRequirement) {
    return rawAccumulateAllValuesOftaskExecution(new Object[]{
    pTaskRequirement, 
    null
    });
  }
  
  @Override
  protected SameTaskAsPrerequisiteMatch tupleToMatch(final Tuple t) {
    try {
    	return SameTaskAsPrerequisiteMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) t.get(POSITION_TASKREQUIREMENT), (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) t.get(POSITION_TASKEXECUTION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameTaskAsPrerequisiteMatch arrayToMatch(final Object[] match) {
    try {
    	return SameTaskAsPrerequisiteMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_TASKREQUIREMENT], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEXECUTION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameTaskAsPrerequisiteMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SameTaskAsPrerequisiteMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_TASKREQUIREMENT], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEXECUTION]);
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
  public static IQuerySpecification<SameTaskAsPrerequisiteMatcher> querySpecification() throws IncQueryException {
    return SameTaskAsPrerequisiteQuerySpecification.instance();
  }
}
