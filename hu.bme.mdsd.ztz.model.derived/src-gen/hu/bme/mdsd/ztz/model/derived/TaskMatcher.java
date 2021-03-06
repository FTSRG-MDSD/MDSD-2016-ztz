package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.derived.TaskMatch;
import hu.bme.mdsd.ztz.model.derived.util.TaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Task;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.task pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TaskMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern task(requirement: TaskRequirement, task: Task) {
 * 	TaskRequirement.taskExecution.task(requirement, task);
 * }
 * </pre></code>
 * 
 * @see TaskMatch
 * @see TaskProcessor
 * @see TaskQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TaskMatcher extends BaseMatcher<TaskMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TaskMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    TaskMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TaskMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REQUIREMENT = 0;
  
  private final static int POSITION_TASK = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(TaskMatcher.class);
  
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
  public TaskMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TaskMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return matches represented as a TaskMatch object.
   * 
   */
  public Collection<TaskMatch> getAllMatches(final TaskRequirement pRequirement, final Task pTask) {
    return rawGetAllMatches(new Object[]{pRequirement, pTask});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return a match represented as a TaskMatch object, or null if no match is found.
   * 
   */
  public TaskMatch getOneArbitraryMatch(final TaskRequirement pRequirement, final Task pTask) {
    return rawGetOneArbitraryMatch(new Object[]{pRequirement, pTask});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskRequirement pRequirement, final Task pTask) {
    return rawHasMatch(new Object[]{pRequirement, pTask});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskRequirement pRequirement, final Task pTask) {
    return rawCountMatches(new Object[]{pRequirement, pTask});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskRequirement pRequirement, final Task pTask, final IMatchProcessor<? super TaskMatch> processor) {
    rawForEachMatch(new Object[]{pRequirement, pTask}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskRequirement pRequirement, final Task pTask, final IMatchProcessor<? super TaskMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRequirement, pTask}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TaskMatch newMatch(final TaskRequirement pRequirement, final Task pTask) {
    return TaskMatch.newMatch(pRequirement, pTask);
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
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfrequirement(final TaskMatch partialMatch) {
    return rawAccumulateAllValuesOfrequirement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfrequirement(final Task pTask) {
    return rawAccumulateAllValuesOfrequirement(new Object[]{
    null, 
    pTask
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Task> rawAccumulateAllValuesOftask(final Object[] parameters) {
    Set<Task> results = new HashSet<Task>();
    rawAccumulateAllValues(POSITION_TASK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask() {
    return rawAccumulateAllValuesOftask(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask(final TaskMatch partialMatch) {
    return rawAccumulateAllValuesOftask(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask(final TaskRequirement pRequirement) {
    return rawAccumulateAllValuesOftask(new Object[]{
    pRequirement, 
    null
    });
  }
  
  @Override
  protected TaskMatch tupleToMatch(final Tuple t) {
    try {
    	return TaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) t.get(POSITION_REQUIREMENT), (hu.bme.mdsd.ztz.model.drone.Task) t.get(POSITION_TASK));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TaskMatch arrayToMatch(final Object[] match) {
    try {
    	return TaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_REQUIREMENT], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TaskMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TaskMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_REQUIREMENT], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
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
  public static IQuerySpecification<TaskMatcher> querySpecification() throws IncQueryException {
    return TaskQuerySpecification.instance();
  }
}
