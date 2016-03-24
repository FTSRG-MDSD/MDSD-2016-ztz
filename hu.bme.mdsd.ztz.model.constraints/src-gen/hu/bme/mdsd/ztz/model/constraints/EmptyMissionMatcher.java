package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.EmptyMissionMatch;
import hu.bme.mdsd.ztz.model.constraints.util.EmptyMissionQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Mission;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.emptyMission pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EmptyMissionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"mission"},
 * 	severity = "warning",
 * 	message = "$mission$ does not contain any tasks.",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID"
 * )
 * pattern emptyMission(mission: Mission) {
 * 	neg find missionContainsTask(mission, _);
 * }
 * </pre></code>
 * 
 * @see EmptyMissionMatch
 * @see EmptyMissionProcessor
 * @see EmptyMissionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EmptyMissionMatcher extends BaseMatcher<EmptyMissionMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EmptyMissionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EmptyMissionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EmptyMissionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_MISSION = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(EmptyMissionMatcher.class);
  
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
  public EmptyMissionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EmptyMissionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @return matches represented as a EmptyMissionMatch object.
   * 
   */
  public Collection<EmptyMissionMatch> getAllMatches(final Mission pMission) {
    return rawGetAllMatches(new Object[]{pMission});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @return a match represented as a EmptyMissionMatch object, or null if no match is found.
   * 
   */
  public EmptyMissionMatch getOneArbitraryMatch(final Mission pMission) {
    return rawGetOneArbitraryMatch(new Object[]{pMission});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Mission pMission) {
    return rawHasMatch(new Object[]{pMission});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Mission pMission) {
    return rawCountMatches(new Object[]{pMission});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Mission pMission, final IMatchProcessor<? super EmptyMissionMatch> processor) {
    rawForEachMatch(new Object[]{pMission}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Mission pMission, final IMatchProcessor<? super EmptyMissionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMission}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EmptyMissionMatch newMatch(final Mission pMission) {
    return EmptyMissionMatch.newMatch(pMission);
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
  
  @Override
  protected EmptyMissionMatch tupleToMatch(final Tuple t) {
    try {
    	return EmptyMissionMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Mission) t.get(POSITION_MISSION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyMissionMatch arrayToMatch(final Object[] match) {
    try {
    	return EmptyMissionMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Mission) match[POSITION_MISSION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected EmptyMissionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return EmptyMissionMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.Mission) match[POSITION_MISSION]);
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
  public static IQuerySpecification<EmptyMissionMatcher> querySpecification() throws IncQueryException {
    return EmptyMissionQuerySpecification.instance();
  }
}
