package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.derived.CurrentTaskMatch;
import hu.bme.mdsd.ztz.model.derived.util.CurrentTaskQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.currentTask pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CurrentTaskMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern currentTask(action: Action, task: Task) {
 * 	Action.currentTaskExecution.task(action, task);
 * }
 * </pre></code>
 * 
 * @see CurrentTaskMatch
 * @see CurrentTaskProcessor
 * @see CurrentTaskQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CurrentTaskMatcher extends BaseMatcher<CurrentTaskMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CurrentTaskMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CurrentTaskMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CurrentTaskMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ACTION = 0;
  
  private final static int POSITION_TASK = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CurrentTaskMatcher.class);
  
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
  public CurrentTaskMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CurrentTaskMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return matches represented as a CurrentTaskMatch object.
   * 
   */
  public Collection<CurrentTaskMatch> getAllMatches(final Action pAction, final Task pTask) {
    return rawGetAllMatches(new Object[]{pAction, pTask});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return a match represented as a CurrentTaskMatch object, or null if no match is found.
   * 
   */
  public CurrentTaskMatch getOneArbitraryMatch(final Action pAction, final Task pTask) {
    return rawGetOneArbitraryMatch(new Object[]{pAction, pTask});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Action pAction, final Task pTask) {
    return rawHasMatch(new Object[]{pAction, pTask});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Action pAction, final Task pTask) {
    return rawCountMatches(new Object[]{pAction, pTask});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Action pAction, final Task pTask, final IMatchProcessor<? super CurrentTaskMatch> processor) {
    rawForEachMatch(new Object[]{pAction, pTask}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Action pAction, final Task pTask, final IMatchProcessor<? super CurrentTaskMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pAction, pTask}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CurrentTaskMatch newMatch(final Action pAction, final Task pTask) {
    return CurrentTaskMatch.newMatch(pAction, pTask);
  }
  
  /**
   * Retrieve the set of values that occur in matches for action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Action> rawAccumulateAllValuesOfaction(final Object[] parameters) {
    Set<Action> results = new HashSet<Action>();
    rawAccumulateAllValues(POSITION_ACTION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Action> getAllValuesOfaction() {
    return rawAccumulateAllValuesOfaction(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Action> getAllValuesOfaction(final CurrentTaskMatch partialMatch) {
    return rawAccumulateAllValuesOfaction(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Action> getAllValuesOfaction(final Task pTask) {
    return rawAccumulateAllValuesOfaction(new Object[]{
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
  public Set<Task> getAllValuesOftask(final CurrentTaskMatch partialMatch) {
    return rawAccumulateAllValuesOftask(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask(final Action pAction) {
    return rawAccumulateAllValuesOftask(new Object[]{
    pAction, 
    null
    });
  }
  
  @Override
  protected CurrentTaskMatch tupleToMatch(final Tuple t) {
    try {
    	return CurrentTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.Action) t.get(POSITION_ACTION), (hu.bme.mdsd.ztz.model.drone.Task) t.get(POSITION_TASK));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CurrentTaskMatch arrayToMatch(final Object[] match) {
    try {
    	return CurrentTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.Action) match[POSITION_ACTION], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CurrentTaskMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CurrentTaskMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.Action) match[POSITION_ACTION], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
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
  public static IQuerySpecification<CurrentTaskMatcher> querySpecification() throws IncQueryException {
    return CurrentTaskQuerySpecification.instance();
  }
}
