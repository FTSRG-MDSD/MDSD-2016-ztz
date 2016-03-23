package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.MinMeasureMatch;
import hu.bme.mdsd.ztz.model.derived.util.MinMeasureQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.minMeasure pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MinMeasureMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern minMeasure(robot: Robot, cooperator: Robot, minimum: MeasureValue) {
 * 	Robot.communicationRange(robot, mvalue1);
 * 	Robot.communicationRange(cooperator, mvalue2);
 * 	
 * 	MeasureValue.dimension(mvalue1, commonDimension);
 * 	MeasureValue.dimension(mvalue2, commonDimension);
 * 	MeasureValue.value(mvalue1, value1);
 * 	MeasureValue.value(mvalue2, value2);
 * 	
 * 	MeasureValue.dimension(minimum, commonDimension);
 * 	MeasureValue.value(minimum, eval(Math.min(value1, value2)));
 * } or {
 * 	Robot.communicationRange(robot, mvalue1);
 * 	Robot.communicationRange(cooperator, mvalue2);
 * 	
 * 	MeasureValue.dimension(mvalue1, dimension1);
 * 	MeasureValue.dimension(mvalue2, dimension2);
 * 	MeasureValue.value(mvalue1, value1);
 * 	MeasureValue.value(mvalue2, value2);
 * 	
 * 	MeasureDimension.conversions(dimension1, conv);
 * 	MeasureConversion.dimension(conv, dimension2);
 * 	MeasureConversion.rate(conv, convRate);
 * 	
 * 	check(value2 {@literal <}= value1convRate);
 * 	minimum == mvalue2;
 * } or {
 * 	Robot.communicationRange(robot, mvalue1);
 * 	Robot.communicationRange(cooperator, mvalue2);
 * 	
 * 	MeasureValue.dimension(mvalue1, dimension1);
 * 	MeasureValue.dimension(mvalue2, dimension2);
 * 	MeasureValue.value(mvalue1, value1);
 * 	MeasureValue.value(mvalue2, value2);
 * 	
 * 	MeasureDimension.conversions(dimension1, conv);
 * 	MeasureConversion.dimension(conv, dimension2);
 * 	MeasureConversion.rate(conv, convRate);
 * 	
 * 	check(value1convRate {@literal <} value2);
 * 	minimum == mvalue1;
 * }
 * </pre></code>
 * 
 * @see MinMeasureMatch
 * @see MinMeasureProcessor
 * @see MinMeasureQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MinMeasureMatcher extends BaseMatcher<MinMeasureMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MinMeasureMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MinMeasureMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MinMeasureMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROBOT = 0;
  
  private final static int POSITION_COOPERATOR = 1;
  
  private final static int POSITION_MINIMUM = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MinMeasureMatcher.class);
  
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
  public MinMeasureMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MinMeasureMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @return matches represented as a MinMeasureMatch object.
   * 
   */
  public Collection<MinMeasureMatch> getAllMatches(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    return rawGetAllMatches(new Object[]{pRobot, pCooperator, pMinimum});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @return a match represented as a MinMeasureMatch object, or null if no match is found.
   * 
   */
  public MinMeasureMatch getOneArbitraryMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    return rawGetOneArbitraryMatch(new Object[]{pRobot, pCooperator, pMinimum});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    return rawHasMatch(new Object[]{pRobot, pCooperator, pMinimum});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    return rawCountMatches(new Object[]{pRobot, pCooperator, pMinimum});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum, final IMatchProcessor<? super MinMeasureMatch> processor) {
    rawForEachMatch(new Object[]{pRobot, pCooperator, pMinimum}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum, final IMatchProcessor<? super MinMeasureMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRobot, pCooperator, pMinimum}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MinMeasureMatch newMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    return MinMeasureMatch.newMatch(pRobot, pCooperator, pMinimum);
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Robot> rawAccumulateAllValuesOfrobot(final Object[] parameters) {
    Set<Robot> results = new HashSet<Robot>();
    rawAccumulateAllValues(POSITION_ROBOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfrobot() {
    return rawAccumulateAllValuesOfrobot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfrobot(final MinMeasureMatch partialMatch) {
    return rawAccumulateAllValuesOfrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfrobot(final Robot pCooperator, final MeasureValue pMinimum) {
    return rawAccumulateAllValuesOfrobot(new Object[]{
    null, 
    pCooperator, 
    pMinimum
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for cooperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Robot> rawAccumulateAllValuesOfcooperator(final Object[] parameters) {
    Set<Robot> results = new HashSet<Robot>();
    rawAccumulateAllValues(POSITION_COOPERATOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for cooperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfcooperator() {
    return rawAccumulateAllValuesOfcooperator(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cooperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfcooperator(final MinMeasureMatch partialMatch) {
    return rawAccumulateAllValuesOfcooperator(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for cooperator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfcooperator(final Robot pRobot, final MeasureValue pMinimum) {
    return rawAccumulateAllValuesOfcooperator(new Object[]{
    pRobot, 
    null, 
    pMinimum
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureValue> rawAccumulateAllValuesOfminimum(final Object[] parameters) {
    Set<MeasureValue> results = new HashSet<MeasureValue>();
    rawAccumulateAllValues(POSITION_MINIMUM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOfminimum() {
    return rawAccumulateAllValuesOfminimum(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOfminimum(final MinMeasureMatch partialMatch) {
    return rawAccumulateAllValuesOfminimum(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for minimum.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureValue> getAllValuesOfminimum(final Robot pRobot, final Robot pCooperator) {
    return rawAccumulateAllValuesOfminimum(new Object[]{
    pRobot, 
    pCooperator, 
    null
    });
  }
  
  @Override
  protected MinMeasureMatch tupleToMatch(final Tuple t) {
    try {
    	return MinMeasureMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) t.get(POSITION_ROBOT), (hu.bme.mdsd.ztz.model.drone.Robot) t.get(POSITION_COOPERATOR), (hu.bme.mdsd.ztz.model.drone.MeasureValue) t.get(POSITION_MINIMUM));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MinMeasureMatch arrayToMatch(final Object[] match) {
    try {
    	return MinMeasureMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_COOPERATOR], (hu.bme.mdsd.ztz.model.drone.MeasureValue) match[POSITION_MINIMUM]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MinMeasureMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MinMeasureMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_COOPERATOR], (hu.bme.mdsd.ztz.model.drone.MeasureValue) match[POSITION_MINIMUM]);
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
  public static IQuerySpecification<MinMeasureMatcher> querySpecification() throws IncQueryException {
    return MinMeasureQuerySpecification.instance();
  }
}
