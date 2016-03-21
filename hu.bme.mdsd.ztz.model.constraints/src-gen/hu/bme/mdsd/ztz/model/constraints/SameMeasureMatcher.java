package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.SameMeasureMatch;
import hu.bme.mdsd.ztz.model.constraints.util.SameMeasureQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.sameMeasure pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SameMeasureMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"measure"},
 * 	severity = "error", 
 * 	message = "$measure$ has the same converted measure!",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID"
 * )
 * pattern sameMeasure(measure: MeasureDimension, convertedMeasure: MeasureDimension) {
 * 	MeasureDimension.conversions.dimension(measure, convertedMeasure);
 * 	convertedMeasure == measure;
 * }
 * </pre></code>
 * 
 * @see SameMeasureMatch
 * @see SameMeasureProcessor
 * @see SameMeasureQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SameMeasureMatcher extends BaseMatcher<SameMeasureMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SameMeasureMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SameMeasureMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SameMeasureMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_MEASURE = 0;
  
  private final static int POSITION_CONVERTEDMEASURE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SameMeasureMatcher.class);
  
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
  public SameMeasureMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SameMeasureMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @return matches represented as a SameMeasureMatch object.
   * 
   */
  public Collection<SameMeasureMatch> getAllMatches(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    return rawGetAllMatches(new Object[]{pMeasure, pConvertedMeasure});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @return a match represented as a SameMeasureMatch object, or null if no match is found.
   * 
   */
  public SameMeasureMatch getOneArbitraryMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    return rawGetOneArbitraryMatch(new Object[]{pMeasure, pConvertedMeasure});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    return rawHasMatch(new Object[]{pMeasure, pConvertedMeasure});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    return rawCountMatches(new Object[]{pMeasure, pConvertedMeasure});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure, final IMatchProcessor<? super SameMeasureMatch> processor) {
    rawForEachMatch(new Object[]{pMeasure, pConvertedMeasure}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure, final IMatchProcessor<? super SameMeasureMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMeasure, pConvertedMeasure}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SameMeasureMatch newMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    return SameMeasureMatch.newMatch(pMeasure, pConvertedMeasure);
  }
  
  /**
   * Retrieve the set of values that occur in matches for measure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureDimension> rawAccumulateAllValuesOfmeasure(final Object[] parameters) {
    Set<MeasureDimension> results = new HashSet<MeasureDimension>();
    rawAccumulateAllValues(POSITION_MEASURE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for measure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfmeasure() {
    return rawAccumulateAllValuesOfmeasure(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for measure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfmeasure(final SameMeasureMatch partialMatch) {
    return rawAccumulateAllValuesOfmeasure(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for measure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfmeasure(final MeasureDimension pConvertedMeasure) {
    return rawAccumulateAllValuesOfmeasure(new Object[]{
    null, 
    pConvertedMeasure
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for convertedMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureDimension> rawAccumulateAllValuesOfconvertedMeasure(final Object[] parameters) {
    Set<MeasureDimension> results = new HashSet<MeasureDimension>();
    rawAccumulateAllValues(POSITION_CONVERTEDMEASURE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for convertedMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfconvertedMeasure() {
    return rawAccumulateAllValuesOfconvertedMeasure(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for convertedMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfconvertedMeasure(final SameMeasureMatch partialMatch) {
    return rawAccumulateAllValuesOfconvertedMeasure(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for convertedMeasure.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfconvertedMeasure(final MeasureDimension pMeasure) {
    return rawAccumulateAllValuesOfconvertedMeasure(new Object[]{
    pMeasure, 
    null
    });
  }
  
  @Override
  protected SameMeasureMatch tupleToMatch(final Tuple t) {
    try {
    	return SameMeasureMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) t.get(POSITION_MEASURE), (hu.bme.mdsd.ztz.model.drone.MeasureDimension) t.get(POSITION_CONVERTEDMEASURE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameMeasureMatch arrayToMatch(final Object[] match) {
    try {
    	return SameMeasureMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_MEASURE], (hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_CONVERTEDMEASURE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SameMeasureMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SameMeasureMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_MEASURE], (hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_CONVERTEDMEASURE]);
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
  public static IQuerySpecification<SameMeasureMatcher> querySpecification() throws IncQueryException {
    return SameMeasureQuerySpecification.instance();
  }
}
