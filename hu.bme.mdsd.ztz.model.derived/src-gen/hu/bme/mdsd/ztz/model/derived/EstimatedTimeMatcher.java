package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.EstimatedTimeMatch;
import hu.bme.mdsd.ztz.model.derived.util.EstimatedTimeQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.estimatedTime pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EstimatedTimeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern estimatedTime(sourceTask:Task, targetMeasure: MeasureValue) {
 * 	Task.execution.executionTime(sourceTask, targetMeasure);
 * 	Task.estimatedTime(sourceTask, targetMeasure);
 * }
 * </pre></code>
 * 
 * @see EstimatedTimeMatch
 * @see EstimatedTimeProcessor
 * @see EstimatedTimeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EstimatedTimeMatcher extends BaseMatcher<EstimatedTimeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EstimatedTimeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EstimatedTimeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EstimatedTimeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SOURCETASK = 0;
  
  private final static int POSITION_TARGETMEASURE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EstimatedTimeMatcher.class);
  
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
  public EstimatedTimeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EstimatedTimeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @return matches represented as a EstimatedTimeMatch object.
   * 
   */
  public Collection<EstimatedTimeMatch> getAllMatches(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    return rawGetAllMatches(new Object[]{pSourceTask, pTargetMeasure});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @return a match represented as a EstimatedTimeMatch object, or null if no match is found.
   * 
   */
  public EstimatedTimeMatch getOneArbitraryMatch(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    return rawGetOneArbitraryMatch(new Object[]{pSourceTask, pTargetMeasure});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    return rawHasMatch(new Object[]{pSourceTask, pTargetMeasure});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    return rawCountMatches(new Object[]{pSourceTask, pTargetMeasure});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Task pSourceTask, final MeasureValue pTargetMeasure, final IMatchProcessor<? super EstimatedTimeMatch> processor) {
    rawForEachMatch(new Object[]{pSourceTask, pTargetMeasure}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Task pSourceTask, final MeasureValue pTargetMeasure, final IMatchProcessor<? super EstimatedTimeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSourceTask, pTargetMeasure}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EstimatedTimeMatch newMatch(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    return EstimatedTimeMatch.newMatch(pSourceTask, pTargetMeasure);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceTask.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Task> rawAccumulateAllValuesOfsourceTask(final Object[] parameters) {
    Set<Task> results = new HashSet<Task>();
    rawAccumulateAllValues(POSITION_SOURCETASK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceTask.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOfsourceTask() {
    return rawAccumulateAllValuesOfsourceTask(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceTask.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOfsourceTask(final EstimatedTimeMatch partialMatch) {
    return rawAccumulateAllValuesOfsourceTask(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceTask.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOfsourceTask(final MeasureValue pTargetMeasure) {
    return rawAccumulateAllValuesOfsourceTask(new Object[]{
    null, 
    pTargetMeasure
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureValue> rawAccumulateAllValuesOftargetMeasure(final Object[] parameters) {
    Set<MeasureValue> results = new HashSet<MeasureValue>();
    rawAccumulateAllValues(POSITION_TARGETMEASURE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOftargetMeasure() {
    return rawAccumulateAllValuesOftargetMeasure(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOftargetMeasure(final EstimatedTimeMatch partialMatch) {
    return rawAccumulateAllValuesOftargetMeasure(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOftargetMeasure(final Task pSourceTask) {
    return rawAccumulateAllValuesOftargetMeasure(new Object[]{
    pSourceTask, 
    null
    });
  }
  
  @Override
  protected EstimatedTimeMatch tupleToMatch(final Tuple t) {
    try {
    	return EstimatedTimeMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Task) t.get(POSITION_SOURCETASK), (hu.bme.mdsd.ztz.model.drone.MeasureValue) t.get(POSITION_TARGETMEASURE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EstimatedTimeMatch arrayToMatch(final Object[] match) {
    try {
    	return EstimatedTimeMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_SOURCETASK], (hu.bme.mdsd.ztz.model.drone.MeasureValue) match[POSITION_TARGETMEASURE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EstimatedTimeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EstimatedTimeMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_SOURCETASK], (hu.bme.mdsd.ztz.model.drone.MeasureValue) match[POSITION_TARGETMEASURE]);
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
  public static IQuerySpecification<EstimatedTimeMatcher> querySpecification() throws IncQueryException {
    return EstimatedTimeQuerySpecification.instance();
  }
}
