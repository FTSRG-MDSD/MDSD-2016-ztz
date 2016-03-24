package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.TaskExecutionRequiresTaskExecutionMatch;
import hu.bme.mdsd.ztz.model.constraints.util.TaskExecutionRequiresTaskExecutionQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.taskExecutionRequiresTaskExecution pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TaskExecutionRequiresTaskExecutionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern taskExecutionRequiresTaskExecution(taskEx: TaskExecution, requiredTaskEx: TaskExecution) {
 * 	TaskRequirement.taskExecution(requirement, taskEx);
 * 	TaskRequirement.prerequisite(requirement, requiredTaskEx);
 * }
 * </pre></code>
 * 
 * @see TaskExecutionRequiresTaskExecutionMatch
 * @see TaskExecutionRequiresTaskExecutionProcessor
 * @see TaskExecutionRequiresTaskExecutionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TaskExecutionRequiresTaskExecutionMatcher extends BaseMatcher<TaskExecutionRequiresTaskExecutionMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TaskExecutionRequiresTaskExecutionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    TaskExecutionRequiresTaskExecutionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TaskExecutionRequiresTaskExecutionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TASKEX = 0;
  
  private final static int POSITION_REQUIREDTASKEX = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(TaskExecutionRequiresTaskExecutionMatcher.class);
  
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
  public TaskExecutionRequiresTaskExecutionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TaskExecutionRequiresTaskExecutionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @return matches represented as a TaskExecutionRequiresTaskExecutionMatch object.
   * 
   */
  public Collection<TaskExecutionRequiresTaskExecutionMatch> getAllMatches(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    return rawGetAllMatches(new Object[]{pTaskEx, pRequiredTaskEx});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @return a match represented as a TaskExecutionRequiresTaskExecutionMatch object, or null if no match is found.
   * 
   */
  public TaskExecutionRequiresTaskExecutionMatch getOneArbitraryMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    return rawGetOneArbitraryMatch(new Object[]{pTaskEx, pRequiredTaskEx});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    return rawHasMatch(new Object[]{pTaskEx, pRequiredTaskEx});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    return rawCountMatches(new Object[]{pTaskEx, pRequiredTaskEx});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx, final IMatchProcessor<? super TaskExecutionRequiresTaskExecutionMatch> processor) {
    rawForEachMatch(new Object[]{pTaskEx, pRequiredTaskEx}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx, final IMatchProcessor<? super TaskExecutionRequiresTaskExecutionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTaskEx, pRequiredTaskEx}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TaskExecutionRequiresTaskExecutionMatch newMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    return TaskExecutionRequiresTaskExecutionMatch.newMatch(pTaskEx, pRequiredTaskEx);
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskExecution> rawAccumulateAllValuesOftaskEx(final Object[] parameters) {
    Set<TaskExecution> results = new HashSet<TaskExecution>();
    rawAccumulateAllValues(POSITION_TASKEX, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskEx() {
    return rawAccumulateAllValuesOftaskEx(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskEx(final TaskExecutionRequiresTaskExecutionMatch partialMatch) {
    return rawAccumulateAllValuesOftaskEx(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskEx(final TaskExecution pRequiredTaskEx) {
    return rawAccumulateAllValuesOftaskEx(new Object[]{
    null, 
    pRequiredTaskEx
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredTaskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskExecution> rawAccumulateAllValuesOfrequiredTaskEx(final Object[] parameters) {
    Set<TaskExecution> results = new HashSet<TaskExecution>();
    rawAccumulateAllValues(POSITION_REQUIREDTASKEX, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredTaskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOfrequiredTaskEx() {
    return rawAccumulateAllValuesOfrequiredTaskEx(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredTaskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOfrequiredTaskEx(final TaskExecutionRequiresTaskExecutionMatch partialMatch) {
    return rawAccumulateAllValuesOfrequiredTaskEx(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredTaskEx.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOfrequiredTaskEx(final TaskExecution pTaskEx) {
    return rawAccumulateAllValuesOfrequiredTaskEx(new Object[]{
    pTaskEx, 
    null
    });
  }
  
  @Override
  protected TaskExecutionRequiresTaskExecutionMatch tupleToMatch(final Tuple t) {
    try {
    	return TaskExecutionRequiresTaskExecutionMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) t.get(POSITION_TASKEX), (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) t.get(POSITION_REQUIREDTASKEX));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TaskExecutionRequiresTaskExecutionMatch arrayToMatch(final Object[] match) {
    try {
    	return TaskExecutionRequiresTaskExecutionMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEX], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_REQUIREDTASKEX]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TaskExecutionRequiresTaskExecutionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TaskExecutionRequiresTaskExecutionMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEX], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_REQUIREDTASKEX]);
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
  public static IQuerySpecification<TaskExecutionRequiresTaskExecutionMatcher> querySpecification() throws IncQueryException {
    return TaskExecutionRequiresTaskExecutionQuerySpecification.instance();
  }
}
