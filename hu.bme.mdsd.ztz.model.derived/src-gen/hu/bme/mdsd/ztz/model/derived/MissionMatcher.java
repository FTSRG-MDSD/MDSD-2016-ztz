package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.MissionMatch;
import hu.bme.mdsd.ztz.model.derived.util.MissionQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Robot;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.mission pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MissionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern mission(sourceRobot: Robot, targetMission: Mission) {
 * 	Robot.tasks(sourceRobot, task);
 * 	Task.mission(task, targetMission);
 * }
 * </pre></code>
 * 
 * @see MissionMatch
 * @see MissionProcessor
 * @see MissionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MissionMatcher extends BaseMatcher<MissionMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MissionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MissionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MissionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SOURCEROBOT = 0;
  
  private final static int POSITION_TARGETMISSION = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MissionMatcher.class);
  
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
  public MissionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MissionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @return matches represented as a MissionMatch object.
   * 
   */
  public Collection<MissionMatch> getAllMatches(final Robot pSourceRobot, final Mission pTargetMission) {
    return rawGetAllMatches(new Object[]{pSourceRobot, pTargetMission});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @return a match represented as a MissionMatch object, or null if no match is found.
   * 
   */
  public MissionMatch getOneArbitraryMatch(final Robot pSourceRobot, final Mission pTargetMission) {
    return rawGetOneArbitraryMatch(new Object[]{pSourceRobot, pTargetMission});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Robot pSourceRobot, final Mission pTargetMission) {
    return rawHasMatch(new Object[]{pSourceRobot, pTargetMission});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Robot pSourceRobot, final Mission pTargetMission) {
    return rawCountMatches(new Object[]{pSourceRobot, pTargetMission});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Robot pSourceRobot, final Mission pTargetMission, final IMatchProcessor<? super MissionMatch> processor) {
    rawForEachMatch(new Object[]{pSourceRobot, pTargetMission}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Robot pSourceRobot, final Mission pTargetMission, final IMatchProcessor<? super MissionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSourceRobot, pTargetMission}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MissionMatch newMatch(final Robot pSourceRobot, final Mission pTargetMission) {
    return MissionMatch.newMatch(pSourceRobot, pTargetMission);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Robot> rawAccumulateAllValuesOfsourceRobot(final Object[] parameters) {
    Set<Robot> results = new HashSet<Robot>();
    rawAccumulateAllValues(POSITION_SOURCEROBOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfsourceRobot() {
    return rawAccumulateAllValuesOfsourceRobot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfsourceRobot(final MissionMatch partialMatch) {
    return rawAccumulateAllValuesOfsourceRobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfsourceRobot(final Mission pTargetMission) {
    return rawAccumulateAllValuesOfsourceRobot(new Object[]{
    null, 
    pTargetMission
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Mission> rawAccumulateAllValuesOftargetMission(final Object[] parameters) {
    Set<Mission> results = new HashSet<Mission>();
    rawAccumulateAllValues(POSITION_TARGETMISSION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mission> getAllValuesOftargetMission() {
    return rawAccumulateAllValuesOftargetMission(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mission> getAllValuesOftargetMission(final MissionMatch partialMatch) {
    return rawAccumulateAllValuesOftargetMission(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetMission.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Mission> getAllValuesOftargetMission(final Robot pSourceRobot) {
    return rawAccumulateAllValuesOftargetMission(new Object[]{
    pSourceRobot, 
    null
    });
  }
  
  @Override
  protected MissionMatch tupleToMatch(final Tuple t) {
    try {
    	return MissionMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) t.get(POSITION_SOURCEROBOT), (hu.bme.mdsd.ztz.model.drone.Mission) t.get(POSITION_TARGETMISSION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MissionMatch arrayToMatch(final Object[] match) {
    try {
    	return MissionMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_SOURCEROBOT], (hu.bme.mdsd.ztz.model.drone.Mission) match[POSITION_TARGETMISSION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MissionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MissionMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_SOURCEROBOT], (hu.bme.mdsd.ztz.model.drone.Mission) match[POSITION_TARGETMISSION]);
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
  public static IQuerySpecification<MissionMatcher> querySpecification() throws IncQueryException {
    return MissionQuerySpecification.instance();
  }
}
