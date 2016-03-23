package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.ConversionAvailableMatch;
import hu.bme.mdsd.ztz.model.constraints.util.ConversionAvailableQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.conversionAvailable pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ConversionAvailableMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern conversionAvailable(dim1: MeasureDimension, dim2: MeasureDimension) {
 * 	find directConversionAvailable+(dim1, dim2);
 * 	dim1 != dim2;
 * }
 * </pre></code>
 * 
 * @see ConversionAvailableMatch
 * @see ConversionAvailableProcessor
 * @see ConversionAvailableQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ConversionAvailableMatcher extends BaseMatcher<ConversionAvailableMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ConversionAvailableMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ConversionAvailableMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ConversionAvailableMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DIM1 = 0;
  
  private final static int POSITION_DIM2 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ConversionAvailableMatcher.class);
  
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
  public ConversionAvailableMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ConversionAvailableMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @return matches represented as a ConversionAvailableMatch object.
   * 
   */
  public Collection<ConversionAvailableMatch> getAllMatches(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    return rawGetAllMatches(new Object[]{pDim1, pDim2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @return a match represented as a ConversionAvailableMatch object, or null if no match is found.
   * 
   */
  public ConversionAvailableMatch getOneArbitraryMatch(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    return rawGetOneArbitraryMatch(new Object[]{pDim1, pDim2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    return rawHasMatch(new Object[]{pDim1, pDim2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    return rawCountMatches(new Object[]{pDim1, pDim2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MeasureDimension pDim1, final MeasureDimension pDim2, final IMatchProcessor<? super ConversionAvailableMatch> processor) {
    rawForEachMatch(new Object[]{pDim1, pDim2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MeasureDimension pDim1, final MeasureDimension pDim2, final IMatchProcessor<? super ConversionAvailableMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDim1, pDim2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ConversionAvailableMatch newMatch(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    return ConversionAvailableMatch.newMatch(pDim1, pDim2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureDimension> rawAccumulateAllValuesOfdim1(final Object[] parameters) {
    Set<MeasureDimension> results = new HashSet<MeasureDimension>();
    rawAccumulateAllValues(POSITION_DIM1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfdim1() {
    return rawAccumulateAllValuesOfdim1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfdim1(final ConversionAvailableMatch partialMatch) {
    return rawAccumulateAllValuesOfdim1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfdim1(final MeasureDimension pDim2) {
    return rawAccumulateAllValuesOfdim1(new Object[]{
    null, 
    pDim2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureDimension> rawAccumulateAllValuesOfdim2(final Object[] parameters) {
    Set<MeasureDimension> results = new HashSet<MeasureDimension>();
    rawAccumulateAllValues(POSITION_DIM2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfdim2() {
    return rawAccumulateAllValuesOfdim2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfdim2(final ConversionAvailableMatch partialMatch) {
    return rawAccumulateAllValuesOfdim2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dim2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureDimension> getAllValuesOfdim2(final MeasureDimension pDim1) {
    return rawAccumulateAllValuesOfdim2(new Object[]{
    pDim1, 
    null
    });
  }
  
  @Override
  protected ConversionAvailableMatch tupleToMatch(final Tuple t) {
    try {
    	return ConversionAvailableMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) t.get(POSITION_DIM1), (hu.bme.mdsd.ztz.model.drone.MeasureDimension) t.get(POSITION_DIM2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ConversionAvailableMatch arrayToMatch(final Object[] match) {
    try {
    	return ConversionAvailableMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_DIM1], (hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_DIM2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ConversionAvailableMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ConversionAvailableMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_DIM1], (hu.bme.mdsd.ztz.model.drone.MeasureDimension) match[POSITION_DIM2]);
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
  public static IQuerySpecification<ConversionAvailableMatcher> querySpecification() throws IncQueryException {
    return ConversionAvailableQuerySpecification.instance();
  }
}
