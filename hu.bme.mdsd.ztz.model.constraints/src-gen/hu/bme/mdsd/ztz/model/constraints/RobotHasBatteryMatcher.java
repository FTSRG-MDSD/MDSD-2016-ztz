package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.RobotHasBatteryMatch;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasBatteryQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Battery;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.robotHasBattery pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RobotHasBatteryMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern robotHasBattery(robot: Robot, battery: Battery) {
 * 	Robot.batteries(robot, battery);
 * }
 * </pre></code>
 * 
 * @see RobotHasBatteryMatch
 * @see RobotHasBatteryProcessor
 * @see RobotHasBatteryQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RobotHasBatteryMatcher extends BaseMatcher<RobotHasBatteryMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RobotHasBatteryMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RobotHasBatteryMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RobotHasBatteryMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROBOT = 0;
  
  private final static int POSITION_BATTERY = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RobotHasBatteryMatcher.class);
  
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
  public RobotHasBatteryMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RobotHasBatteryMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @return matches represented as a RobotHasBatteryMatch object.
   * 
   */
  public Collection<RobotHasBatteryMatch> getAllMatches(final Robot pRobot, final Battery pBattery) {
    return rawGetAllMatches(new Object[]{pRobot, pBattery});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @return a match represented as a RobotHasBatteryMatch object, or null if no match is found.
   * 
   */
  public RobotHasBatteryMatch getOneArbitraryMatch(final Robot pRobot, final Battery pBattery) {
    return rawGetOneArbitraryMatch(new Object[]{pRobot, pBattery});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Robot pRobot, final Battery pBattery) {
    return rawHasMatch(new Object[]{pRobot, pBattery});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Robot pRobot, final Battery pBattery) {
    return rawCountMatches(new Object[]{pRobot, pBattery});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Robot pRobot, final Battery pBattery, final IMatchProcessor<? super RobotHasBatteryMatch> processor) {
    rawForEachMatch(new Object[]{pRobot, pBattery}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Robot pRobot, final Battery pBattery, final IMatchProcessor<? super RobotHasBatteryMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRobot, pBattery}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RobotHasBatteryMatch newMatch(final Robot pRobot, final Battery pBattery) {
    return RobotHasBatteryMatch.newMatch(pRobot, pBattery);
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
  public Set<Robot> getAllValuesOfrobot(final RobotHasBatteryMatch partialMatch) {
    return rawAccumulateAllValuesOfrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfrobot(final Battery pBattery) {
    return rawAccumulateAllValuesOfrobot(new Object[]{
    null, 
    pBattery
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for battery.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Battery> rawAccumulateAllValuesOfbattery(final Object[] parameters) {
    Set<Battery> results = new HashSet<Battery>();
    rawAccumulateAllValues(POSITION_BATTERY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for battery.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfbattery() {
    return rawAccumulateAllValuesOfbattery(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for battery.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfbattery(final RobotHasBatteryMatch partialMatch) {
    return rawAccumulateAllValuesOfbattery(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for battery.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Battery> getAllValuesOfbattery(final Robot pRobot) {
    return rawAccumulateAllValuesOfbattery(new Object[]{
    pRobot, 
    null
    });
  }
  
  @Override
  protected RobotHasBatteryMatch tupleToMatch(final Tuple t) {
    try {
    	return RobotHasBatteryMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) t.get(POSITION_ROBOT), (hu.bme.mdsd.ztz.model.drone.Battery) t.get(POSITION_BATTERY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RobotHasBatteryMatch arrayToMatch(final Object[] match) {
    try {
    	return RobotHasBatteryMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Battery) match[POSITION_BATTERY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RobotHasBatteryMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RobotHasBatteryMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Battery) match[POSITION_BATTERY]);
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
  public static IQuerySpecification<RobotHasBatteryMatcher> querySpecification() throws IncQueryException {
    return RobotHasBatteryQuerySpecification.instance();
  }
}
