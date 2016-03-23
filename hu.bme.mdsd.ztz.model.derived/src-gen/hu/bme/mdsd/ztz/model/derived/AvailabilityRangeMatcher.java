package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.derived.AvailabilityRangeMatch;
import hu.bme.mdsd.ztz.model.derived.util.AvailabilityRangeQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.availabilityRange pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AvailabilityRangeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern availabilityRange(robotCollaboration: RobotCollaboration, minimumRange: MeasureValue) {
 * 	DynamicRobot.collaborations(dynRobot, robotCollaboration);
 * 	RobotCollaboration.collaborator(robotCollaboration, dynCooperator);
 * 	DynamicRobot.robot(dynRobot, robot);
 * 	DynamicRobot.robot(dynCooperator, cooperator);
 * 	
 * 	find minMeasure(robot, cooperator, minimumRange);
 * } or {
 * 	DynamicRobot.collaborations(dynRobot, robotCollaboration);
 * 	RobotCollaboration.collaborator(robotCollaboration, dynCooperator);
 * 	DynamicRobot.robot(dynRobot, robot);
 * 	DynamicRobot.robot(dynCooperator, cooperator);
 * 	
 * 	find minMeasure(cooperator, robot, minimumRange);
 * }
 * </pre></code>
 * 
 * @see AvailabilityRangeMatch
 * @see AvailabilityRangeProcessor
 * @see AvailabilityRangeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AvailabilityRangeMatcher extends BaseMatcher<AvailabilityRangeMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AvailabilityRangeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    AvailabilityRangeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new AvailabilityRangeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROBOTCOLLABORATION = 0;
  
  private final static int POSITION_MINIMUMRANGE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(AvailabilityRangeMatcher.class);
  
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
  public AvailabilityRangeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AvailabilityRangeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @return matches represented as a AvailabilityRangeMatch object.
   * 
   */
  public Collection<AvailabilityRangeMatch> getAllMatches(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    return rawGetAllMatches(new Object[]{pRobotCollaboration, pMinimumRange});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @return a match represented as a AvailabilityRangeMatch object, or null if no match is found.
   * 
   */
  public AvailabilityRangeMatch getOneArbitraryMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    return rawGetOneArbitraryMatch(new Object[]{pRobotCollaboration, pMinimumRange});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    return rawHasMatch(new Object[]{pRobotCollaboration, pMinimumRange});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    return rawCountMatches(new Object[]{pRobotCollaboration, pMinimumRange});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange, final IMatchProcessor<? super AvailabilityRangeMatch> processor) {
    rawForEachMatch(new Object[]{pRobotCollaboration, pMinimumRange}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange, final IMatchProcessor<? super AvailabilityRangeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRobotCollaboration, pMinimumRange}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AvailabilityRangeMatch newMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    return AvailabilityRangeMatch.newMatch(pRobotCollaboration, pMinimumRange);
  }
  
  /**
   * Retrieve the set of values that occur in matches for robotCollaboration.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<RobotCollaboration> rawAccumulateAllValuesOfrobotCollaboration(final Object[] parameters) {
    Set<RobotCollaboration> results = new HashSet<RobotCollaboration>();
    rawAccumulateAllValues(POSITION_ROBOTCOLLABORATION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for robotCollaboration.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RobotCollaboration> getAllValuesOfrobotCollaboration() {
    return rawAccumulateAllValuesOfrobotCollaboration(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robotCollaboration.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RobotCollaboration> getAllValuesOfrobotCollaboration(final AvailabilityRangeMatch partialMatch) {
    return rawAccumulateAllValuesOfrobotCollaboration(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robotCollaboration.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RobotCollaboration> getAllValuesOfrobotCollaboration(final MeasureValue pMinimumRange) {
    return rawAccumulateAllValuesOfrobotCollaboration(new Object[]{
    null, 
    pMinimumRange
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimumRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureValue> rawAccumulateAllValuesOfminimumRange(final Object[] parameters) {
    Set<MeasureValue> results = new HashSet<MeasureValue>();
    rawAccumulateAllValues(POSITION_MINIMUMRANGE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimumRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOfminimumRange() {
    return rawAccumulateAllValuesOfminimumRange(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimumRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOfminimumRange(final AvailabilityRangeMatch partialMatch) {
    return rawAccumulateAllValuesOfminimumRange(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimumRange.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOfminimumRange(final RobotCollaboration pRobotCollaboration) {
    return rawAccumulateAllValuesOfminimumRange(new Object[]{
    pRobotCollaboration, 
    null
    });
  }
  
  @Override
  protected AvailabilityRangeMatch tupleToMatch(final Tuple t) {
    try {
    	return AvailabilityRangeMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration) t.get(POSITION_ROBOTCOLLABORATION), (hu.bme.mdsd.ztz.model.drone.MeasureValue) t.get(POSITION_MINIMUMRANGE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AvailabilityRangeMatch arrayToMatch(final Object[] match) {
    try {
    	return AvailabilityRangeMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration) match[POSITION_ROBOTCOLLABORATION], (hu.bme.mdsd.ztz.model.drone.MeasureValue) match[POSITION_MINIMUMRANGE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AvailabilityRangeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AvailabilityRangeMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration) match[POSITION_ROBOTCOLLABORATION], (hu.bme.mdsd.ztz.model.drone.MeasureValue) match[POSITION_MINIMUMRANGE]);
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
  public static IQuerySpecification<AvailabilityRangeMatcher> querySpecification() throws IncQueryException {
    return AvailabilityRangeQuerySpecification.instance();
  }
}
