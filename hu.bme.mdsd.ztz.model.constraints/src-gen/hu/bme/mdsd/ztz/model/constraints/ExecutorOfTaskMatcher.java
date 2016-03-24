package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.ExecutorOfTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.util.ExecutorOfTaskQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.executorOfTask pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ExecutorOfTaskMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern executorOfTask(robot: DynamicRobot, execution: TaskExecution) {
 * 	TaskExecution.executors(execution, robot);
 * }
 * </pre></code>
 * 
 * @see ExecutorOfTaskMatch
 * @see ExecutorOfTaskProcessor
 * @see ExecutorOfTaskQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ExecutorOfTaskMatcher extends BaseMatcher<ExecutorOfTaskMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ExecutorOfTaskMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ExecutorOfTaskMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ExecutorOfTaskMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROBOT = 0;
  
  private final static int POSITION_EXECUTION = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ExecutorOfTaskMatcher.class);
  
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
  public ExecutorOfTaskMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ExecutorOfTaskMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @return matches represented as a ExecutorOfTaskMatch object.
   * 
   */
  public Collection<ExecutorOfTaskMatch> getAllMatches(final DynamicRobot pRobot, final TaskExecution pExecution) {
    return rawGetAllMatches(new Object[]{pRobot, pExecution});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @return a match represented as a ExecutorOfTaskMatch object, or null if no match is found.
   * 
   */
  public ExecutorOfTaskMatch getOneArbitraryMatch(final DynamicRobot pRobot, final TaskExecution pExecution) {
    return rawGetOneArbitraryMatch(new Object[]{pRobot, pExecution});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DynamicRobot pRobot, final TaskExecution pExecution) {
    return rawHasMatch(new Object[]{pRobot, pExecution});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DynamicRobot pRobot, final TaskExecution pExecution) {
    return rawCountMatches(new Object[]{pRobot, pExecution});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DynamicRobot pRobot, final TaskExecution pExecution, final IMatchProcessor<? super ExecutorOfTaskMatch> processor) {
    rawForEachMatch(new Object[]{pRobot, pExecution}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DynamicRobot pRobot, final TaskExecution pExecution, final IMatchProcessor<? super ExecutorOfTaskMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRobot, pExecution}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ExecutorOfTaskMatch newMatch(final DynamicRobot pRobot, final TaskExecution pExecution) {
    return ExecutorOfTaskMatch.newMatch(pRobot, pExecution);
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DynamicRobot> rawAccumulateAllValuesOfrobot(final Object[] parameters) {
    Set<DynamicRobot> results = new HashSet<DynamicRobot>();
    rawAccumulateAllValues(POSITION_ROBOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot() {
    return rawAccumulateAllValuesOfrobot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot(final ExecutorOfTaskMatch partialMatch) {
    return rawAccumulateAllValuesOfrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot(final TaskExecution pExecution) {
    return rawAccumulateAllValuesOfrobot(new Object[]{
    null, 
    pExecution
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for execution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskExecution> rawAccumulateAllValuesOfexecution(final Object[] parameters) {
    Set<TaskExecution> results = new HashSet<TaskExecution>();
    rawAccumulateAllValues(POSITION_EXECUTION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for execution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOfexecution() {
    return rawAccumulateAllValuesOfexecution(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for execution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOfexecution(final ExecutorOfTaskMatch partialMatch) {
    return rawAccumulateAllValuesOfexecution(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for execution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOfexecution(final DynamicRobot pRobot) {
    return rawAccumulateAllValuesOfexecution(new Object[]{
    pRobot, 
    null
    });
  }
  
  @Override
  protected ExecutorOfTaskMatch tupleToMatch(final Tuple t) {
    try {
    	return ExecutorOfTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) t.get(POSITION_ROBOT), (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) t.get(POSITION_EXECUTION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ExecutorOfTaskMatch arrayToMatch(final Object[] match) {
    try {
    	return ExecutorOfTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_EXECUTION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ExecutorOfTaskMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ExecutorOfTaskMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_EXECUTION]);
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
  public static IQuerySpecification<ExecutorOfTaskMatcher> querySpecification() throws IncQueryException {
    return ExecutorOfTaskQuerySpecification.instance();
  }
}
