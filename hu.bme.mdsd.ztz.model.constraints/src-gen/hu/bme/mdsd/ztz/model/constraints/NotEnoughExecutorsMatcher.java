package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.NotEnoughExecutorsMatch;
import hu.bme.mdsd.ztz.model.constraints.util.NotEnoughExecutorsQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.notEnoughExecutors pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NotEnoughExecutorsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"execution", "requiredNum", "executorNum"},
 * 	severity = "error",
 * 	message = "Not enough executors for $execution$. (required: $requiredNum$, available: $executorNum$)",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID"
 * )
 * pattern notEnoughExecutors(execution: TaskExecution, requiredNum, executorNum) {
 * 	TaskRequirement.taskExecution(requirement, execution);
 * 	TaskExecution.status(execution, status);
 * 	check(status == hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus.IN_PROGRESS);
 * 	TaskRequirement.participants(requirement, requiredNum);
 * 	
 * 	executorNum == count find executorOfTask(_, execution);
 * 	
 * 	check(executorNum {@literal <} requiredNum);
 * }
 * </pre></code>
 * 
 * @see NotEnoughExecutorsMatch
 * @see NotEnoughExecutorsProcessor
 * @see NotEnoughExecutorsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NotEnoughExecutorsMatcher extends BaseMatcher<NotEnoughExecutorsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NotEnoughExecutorsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NotEnoughExecutorsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NotEnoughExecutorsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_EXECUTION = 0;
  
  private final static int POSITION_REQUIREDNUM = 1;
  
  private final static int POSITION_EXECUTORNUM = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NotEnoughExecutorsMatcher.class);
  
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
  public NotEnoughExecutorsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NotEnoughExecutorsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @return matches represented as a NotEnoughExecutorsMatch object.
   * 
   */
  public Collection<NotEnoughExecutorsMatch> getAllMatches(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    return rawGetAllMatches(new Object[]{pExecution, pRequiredNum, pExecutorNum});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @return a match represented as a NotEnoughExecutorsMatch object, or null if no match is found.
   * 
   */
  public NotEnoughExecutorsMatch getOneArbitraryMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    return rawGetOneArbitraryMatch(new Object[]{pExecution, pRequiredNum, pExecutorNum});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    return rawHasMatch(new Object[]{pExecution, pRequiredNum, pExecutorNum});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    return rawCountMatches(new Object[]{pExecution, pRequiredNum, pExecutorNum});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum, final IMatchProcessor<? super NotEnoughExecutorsMatch> processor) {
    rawForEachMatch(new Object[]{pExecution, pRequiredNum, pExecutorNum}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum, final IMatchProcessor<? super NotEnoughExecutorsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pExecution, pRequiredNum, pExecutorNum}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NotEnoughExecutorsMatch newMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    return NotEnoughExecutorsMatch.newMatch(pExecution, pRequiredNum, pExecutorNum);
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
  public Set<TaskExecution> getAllValuesOfexecution(final NotEnoughExecutorsMatch partialMatch) {
    return rawAccumulateAllValuesOfexecution(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for execution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOfexecution(final Integer pRequiredNum, final Integer pExecutorNum) {
    return rawAccumulateAllValuesOfexecution(new Object[]{
    null, 
    pRequiredNum, 
    pExecutorNum
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfrequiredNum(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_REQUIREDNUM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfrequiredNum() {
    return rawAccumulateAllValuesOfrequiredNum(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfrequiredNum(final NotEnoughExecutorsMatch partialMatch) {
    return rawAccumulateAllValuesOfrequiredNum(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for requiredNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfrequiredNum(final TaskExecution pExecution, final Integer pExecutorNum) {
    return rawAccumulateAllValuesOfrequiredNum(new Object[]{
    pExecution, 
    null, 
    pExecutorNum
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for executorNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfexecutorNum(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_EXECUTORNUM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for executorNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfexecutorNum() {
    return rawAccumulateAllValuesOfexecutorNum(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for executorNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfexecutorNum(final NotEnoughExecutorsMatch partialMatch) {
    return rawAccumulateAllValuesOfexecutorNum(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for executorNum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfexecutorNum(final TaskExecution pExecution, final Integer pRequiredNum) {
    return rawAccumulateAllValuesOfexecutorNum(new Object[]{
    pExecution, 
    pRequiredNum, 
    null
    });
  }
  
  @Override
  protected NotEnoughExecutorsMatch tupleToMatch(final Tuple t) {
    try {
    	return NotEnoughExecutorsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) t.get(POSITION_EXECUTION), (java.lang.Integer) t.get(POSITION_REQUIREDNUM), (java.lang.Integer) t.get(POSITION_EXECUTORNUM));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NotEnoughExecutorsMatch arrayToMatch(final Object[] match) {
    try {
    	return NotEnoughExecutorsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_EXECUTION], (java.lang.Integer) match[POSITION_REQUIREDNUM], (java.lang.Integer) match[POSITION_EXECUTORNUM]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NotEnoughExecutorsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NotEnoughExecutorsMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_EXECUTION], (java.lang.Integer) match[POSITION_REQUIREDNUM], (java.lang.Integer) match[POSITION_EXECUTORNUM]);
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
  public static IQuerySpecification<NotEnoughExecutorsMatcher> querySpecification() throws IncQueryException {
    return NotEnoughExecutorsQuerySpecification.instance();
  }
}
