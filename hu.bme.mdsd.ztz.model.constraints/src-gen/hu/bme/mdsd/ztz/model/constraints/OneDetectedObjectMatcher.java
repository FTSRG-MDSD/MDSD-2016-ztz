package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.OneDetectedObjectMatch;
import hu.bme.mdsd.ztz.model.constraints.util.OneDetectedObjectQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.DetectedObject;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.oneDetectedObject pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link OneDetectedObjectMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"detected1", "object"},
 * 	severity = "error",
 * 	message = "$object$ is detected more than once by the same robot!",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID"
 * )
 * pattern oneDetectedObject(object: AreaObject, detected1: DetectedObject) {
 * 	Robot.detectedObjects(robot, detected1);
 * 	Robot.detectedObjects(robot, detected2);
 * 	detected1 != detected2;
 * 	DetectedObject.object(detected1, object);
 * 	DetectedObject.object(detected2, object);
 * }
 * </pre></code>
 * 
 * @see OneDetectedObjectMatch
 * @see OneDetectedObjectProcessor
 * @see OneDetectedObjectQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class OneDetectedObjectMatcher extends BaseMatcher<OneDetectedObjectMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static OneDetectedObjectMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    OneDetectedObjectMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new OneDetectedObjectMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_OBJECT = 0;
  
  private final static int POSITION_DETECTED1 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(OneDetectedObjectMatcher.class);
  
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
  public OneDetectedObjectMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public OneDetectedObjectMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @return matches represented as a OneDetectedObjectMatch object.
   * 
   */
  public Collection<OneDetectedObjectMatch> getAllMatches(final AreaObject pObject, final DetectedObject pDetected1) {
    return rawGetAllMatches(new Object[]{pObject, pDetected1});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @return a match represented as a OneDetectedObjectMatch object, or null if no match is found.
   * 
   */
  public OneDetectedObjectMatch getOneArbitraryMatch(final AreaObject pObject, final DetectedObject pDetected1) {
    return rawGetOneArbitraryMatch(new Object[]{pObject, pDetected1});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final AreaObject pObject, final DetectedObject pDetected1) {
    return rawHasMatch(new Object[]{pObject, pDetected1});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final AreaObject pObject, final DetectedObject pDetected1) {
    return rawCountMatches(new Object[]{pObject, pDetected1});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final AreaObject pObject, final DetectedObject pDetected1, final IMatchProcessor<? super OneDetectedObjectMatch> processor) {
    rawForEachMatch(new Object[]{pObject, pDetected1}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final AreaObject pObject, final DetectedObject pDetected1, final IMatchProcessor<? super OneDetectedObjectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pObject, pDetected1}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public OneDetectedObjectMatch newMatch(final AreaObject pObject, final DetectedObject pDetected1) {
    return OneDetectedObjectMatch.newMatch(pObject, pDetected1);
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<AreaObject> rawAccumulateAllValuesOfobject(final Object[] parameters) {
    Set<AreaObject> results = new HashSet<AreaObject>();
    rawAccumulateAllValues(POSITION_OBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AreaObject> getAllValuesOfobject() {
    return rawAccumulateAllValuesOfobject(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AreaObject> getAllValuesOfobject(final OneDetectedObjectMatch partialMatch) {
    return rawAccumulateAllValuesOfobject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AreaObject> getAllValuesOfobject(final DetectedObject pDetected1) {
    return rawAccumulateAllValuesOfobject(new Object[]{
    null, 
    pDetected1
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for detected1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DetectedObject> rawAccumulateAllValuesOfdetected1(final Object[] parameters) {
    Set<DetectedObject> results = new HashSet<DetectedObject>();
    rawAccumulateAllValues(POSITION_DETECTED1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for detected1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DetectedObject> getAllValuesOfdetected1() {
    return rawAccumulateAllValuesOfdetected1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for detected1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DetectedObject> getAllValuesOfdetected1(final OneDetectedObjectMatch partialMatch) {
    return rawAccumulateAllValuesOfdetected1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for detected1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DetectedObject> getAllValuesOfdetected1(final AreaObject pObject) {
    return rawAccumulateAllValuesOfdetected1(new Object[]{
    pObject, 
    null
    });
  }
  
  @Override
  protected OneDetectedObjectMatch tupleToMatch(final Tuple t) {
    try {
    	return OneDetectedObjectMatch.newMatch((hu.bme.mdsd.ztz.model.drone.AreaObject) t.get(POSITION_OBJECT), (hu.bme.mdsd.ztz.model.drone.DetectedObject) t.get(POSITION_DETECTED1));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OneDetectedObjectMatch arrayToMatch(final Object[] match) {
    try {
    	return OneDetectedObjectMatch.newMatch((hu.bme.mdsd.ztz.model.drone.AreaObject) match[POSITION_OBJECT], (hu.bme.mdsd.ztz.model.drone.DetectedObject) match[POSITION_DETECTED1]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OneDetectedObjectMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return OneDetectedObjectMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.AreaObject) match[POSITION_OBJECT], (hu.bme.mdsd.ztz.model.drone.DetectedObject) match[POSITION_DETECTED1]);
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
  public static IQuerySpecification<OneDetectedObjectMatcher> querySpecification() throws IncQueryException {
    return OneDetectedObjectQuerySpecification.instance();
  }
}
