package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.MissionContainsTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.util.MissionContainsTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Mission;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.missionContainsTask pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MissionContainsTaskMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern missionContainsTask(mission: Mission, task: Task) {
 * 	Mission.tasks(mission, task);
 * }
 * </pre></code>
 * 
 * @see MissionContainsTaskMatch
 * @see MissionContainsTaskProcessor
 * @see MissionContainsTaskQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MissionContainsTaskMatcher extends BaseMatcher<MissionContainsTaskMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MissionContainsTaskMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MissionContainsTaskMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MissionContainsTaskMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_MISSION = 0;
  
  private final static int POSITION_TASK = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MissionContainsTaskMatcher.class);
  
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
  public MissionContainsTaskMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MissionContainsTaskMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return matches represented as a MissionContainsTaskMatch object.
   * 
   */
  public Collection<MissionContainsTaskMatch> getAllMatches(final Mission pMission, final Task pTask) {
    return rawGetAllMatches(new Object[]{pMission, pTask});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return a match represented as a MissionContainsTaskMatch object, or null if no match is found.
   * 
   */
  public MissionContainsTaskMatch getOneArbitraryMatch(final Mission pMission, final Task pTask) {
    return rawGetOneArbitraryMatch(new Object[]{pMission, pTask});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Mission pMission, final Task pTask) {
    return rawHasMatch(new Object[]{pMission, pTask});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Mission pMission, final Task pTask) {
    return rawCountMatches(new Object[]{pMission, pTask});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Mission pMission, final Task pTask, final IMatchProcessor<? super MissionContainsTaskMatch> processor) {
    rawForEachMatch(new Object[]{pMission, pTask}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Mission pMission, final Task pTask, final IMatchProcessor<? super MissionContainsTaskMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMission, pTask}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MissionContainsTaskMatch newMatch(final Mission pMission, final Task pTask) {
    return MissionContainsTaskMatch.newMatch(pMission, pTask);
  }
  
  /**
   * Retrieve the set of values that occur in matches for mission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Mission> rawAccumulateAllValuesOfmission(final Object[] parameters) {
    Set<Mission> results = new HashSet<Mission>();
    rawAccumulateAllValues(POSITION_MISSION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for mission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mission> getAllValuesOfmission() {
    return rawAccumulateAllValuesOfmission(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mission> getAllValuesOfmission(final MissionContainsTaskMatch partialMatch) {
    return rawAccumulateAllValuesOfmission(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mission> getAllValuesOfmission(final Task pTask) {
    return rawAccumulateAllValuesOfmission(new Object[]{
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
  public Set<Task> getAllValuesOftask(final MissionContainsTaskMatch partialMatch) {
    return rawAccumulateAllValuesOftask(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Task> getAllValuesOftask(final Mission pMission) {
    return rawAccumulateAllValuesOftask(new Object[]{
    pMission, 
    null
    });
  }
  
  @Override
  protected MissionContainsTaskMatch tupleToMatch(final Tuple t) {
    try {
    	return MissionContainsTaskMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Mission) t.get(POSITION_MISSION), (hu.bme.mdsd.ztz.model.drone.Task) t.get(POSITION_TASK));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MissionContainsTaskMatch arrayToMatch(final Object[] match) {
    try {
    	return MissionContainsTaskMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Mission) match[POSITION_MISSION], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MissionContainsTaskMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MissionContainsTaskMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.Mission) match[POSITION_MISSION], (hu.bme.mdsd.ztz.model.drone.Task) match[POSITION_TASK]);
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
  public static IQuerySpecification<MissionContainsTaskMatcher> querySpecification() throws IncQueryException {
    return MissionContainsTaskQuerySpecification.instance();
  }
}
