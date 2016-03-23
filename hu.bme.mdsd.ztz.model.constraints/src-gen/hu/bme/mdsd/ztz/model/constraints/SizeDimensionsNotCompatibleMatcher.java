package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsNotCompatibleMatch;
import hu.bme.mdsd.ztz.model.constraints.util.SizeDimensionsNotCompatibleQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.Size;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.sizeDimensionsNotCompatible pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SizeDimensionsNotCompatibleMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint (
 * 	key = {"robot", "size"},
 * 	severity = "error",
 * 	message = "Size dimensions of $robot$ are not compatible (cannot be converted).",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID"
 * )
 * pattern sizeDimensionsNotCompatible(robot: Robot, size: Size) {
 * 	find sizeDimensionsDiffer(robot, size);
 * 	Size.height.dimension(size, heightDim);
 * 	Size.length.dimension(size, lengthDim);
 * 	heightDim != lengthDim;
 * 	neg find conversionAvailable(heightDim, lengthDim);
 * } or {
 * 	find sizeDimensionsDiffer(robot, size);
 * 	Size.height.dimension(size, heightDim);
 * 	Size.width.dimension(size, widthDim);
 * 	heightDim != widthDim;
 * 	neg find conversionAvailable(heightDim, widthDim);
 * } or {
 * 	find sizeDimensionsDiffer(robot, size);
 * 	Size.length.dimension(size, lengthDim);
 * 	Size.width.dimension(size, widthDim);
 * 	lengthDim != widthDim;
 * 	neg find conversionAvailable(lengthDim, widthDim);
 * }
 * </pre></code>
 * 
 * @see SizeDimensionsNotCompatibleMatch
 * @see SizeDimensionsNotCompatibleProcessor
 * @see SizeDimensionsNotCompatibleQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SizeDimensionsNotCompatibleMatcher extends BaseMatcher<SizeDimensionsNotCompatibleMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SizeDimensionsNotCompatibleMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SizeDimensionsNotCompatibleMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SizeDimensionsNotCompatibleMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROBOT = 0;
  
  private final static int POSITION_SIZE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SizeDimensionsNotCompatibleMatcher.class);
  
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
  public SizeDimensionsNotCompatibleMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SizeDimensionsNotCompatibleMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @return matches represented as a SizeDimensionsNotCompatibleMatch object.
   * 
   */
  public Collection<SizeDimensionsNotCompatibleMatch> getAllMatches(final Robot pRobot, final Size pSize) {
    return rawGetAllMatches(new Object[]{pRobot, pSize});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @return a match represented as a SizeDimensionsNotCompatibleMatch object, or null if no match is found.
   * 
   */
  public SizeDimensionsNotCompatibleMatch getOneArbitraryMatch(final Robot pRobot, final Size pSize) {
    return rawGetOneArbitraryMatch(new Object[]{pRobot, pSize});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Robot pRobot, final Size pSize) {
    return rawHasMatch(new Object[]{pRobot, pSize});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Robot pRobot, final Size pSize) {
    return rawCountMatches(new Object[]{pRobot, pSize});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Robot pRobot, final Size pSize, final IMatchProcessor<? super SizeDimensionsNotCompatibleMatch> processor) {
    rawForEachMatch(new Object[]{pRobot, pSize}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Robot pRobot, final Size pSize, final IMatchProcessor<? super SizeDimensionsNotCompatibleMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRobot, pSize}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SizeDimensionsNotCompatibleMatch newMatch(final Robot pRobot, final Size pSize) {
    return SizeDimensionsNotCompatibleMatch.newMatch(pRobot, pSize);
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
  public Set<Robot> getAllValuesOfrobot(final SizeDimensionsNotCompatibleMatch partialMatch) {
    return rawAccumulateAllValuesOfrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Robot> getAllValuesOfrobot(final Size pSize) {
    return rawAccumulateAllValuesOfrobot(new Object[]{
    null, 
    pSize
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for size.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Size> rawAccumulateAllValuesOfsize(final Object[] parameters) {
    Set<Size> results = new HashSet<Size>();
    rawAccumulateAllValues(POSITION_SIZE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for size.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Size> getAllValuesOfsize() {
    return rawAccumulateAllValuesOfsize(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for size.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Size> getAllValuesOfsize(final SizeDimensionsNotCompatibleMatch partialMatch) {
    return rawAccumulateAllValuesOfsize(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for size.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Size> getAllValuesOfsize(final Robot pRobot) {
    return rawAccumulateAllValuesOfsize(new Object[]{
    pRobot, 
    null
    });
  }
  
  @Override
  protected SizeDimensionsNotCompatibleMatch tupleToMatch(final Tuple t) {
    try {
    	return SizeDimensionsNotCompatibleMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) t.get(POSITION_ROBOT), (hu.bme.mdsd.ztz.model.drone.Size) t.get(POSITION_SIZE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SizeDimensionsNotCompatibleMatch arrayToMatch(final Object[] match) {
    try {
    	return SizeDimensionsNotCompatibleMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Size) match[POSITION_SIZE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SizeDimensionsNotCompatibleMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SizeDimensionsNotCompatibleMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.Robot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.drone.Size) match[POSITION_SIZE]);
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
  public static IQuerySpecification<SizeDimensionsNotCompatibleMatcher> querySpecification() throws IncQueryException {
    return SizeDimensionsNotCompatibleQuerySpecification.instance();
  }
}
