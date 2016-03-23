package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.NullMeasureConversionValueMatch;
import hu.bme.mdsd.ztz.model.constraints.util.NullMeasureConversionValueQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.nullMeasureConversionValue pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NullMeasureConversionValueMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"conversion"},
 * 	severity = "error",
 * 	message = "Conversion rate must not be zero!",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID"
 * )
 * pattern nullMeasureConversionValue(conversion: MeasureConversion) {
 * 	MeasureConversion.rate(conversion, rate);
 * 	check (rate == 0.0);
 * }
 * </pre></code>
 * 
 * @see NullMeasureConversionValueMatch
 * @see NullMeasureConversionValueProcessor
 * @see NullMeasureConversionValueQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NullMeasureConversionValueMatcher extends BaseMatcher<NullMeasureConversionValueMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NullMeasureConversionValueMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NullMeasureConversionValueMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NullMeasureConversionValueMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CONVERSION = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NullMeasureConversionValueMatcher.class);
  
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
  public NullMeasureConversionValueMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NullMeasureConversionValueMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @return matches represented as a NullMeasureConversionValueMatch object.
   * 
   */
  public Collection<NullMeasureConversionValueMatch> getAllMatches(final MeasureConversion pConversion) {
    return rawGetAllMatches(new Object[]{pConversion});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @return a match represented as a NullMeasureConversionValueMatch object, or null if no match is found.
   * 
   */
  public NullMeasureConversionValueMatch getOneArbitraryMatch(final MeasureConversion pConversion) {
    return rawGetOneArbitraryMatch(new Object[]{pConversion});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MeasureConversion pConversion) {
    return rawHasMatch(new Object[]{pConversion});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MeasureConversion pConversion) {
    return rawCountMatches(new Object[]{pConversion});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MeasureConversion pConversion, final IMatchProcessor<? super NullMeasureConversionValueMatch> processor) {
    rawForEachMatch(new Object[]{pConversion}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MeasureConversion pConversion, final IMatchProcessor<? super NullMeasureConversionValueMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pConversion}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NullMeasureConversionValueMatch newMatch(final MeasureConversion pConversion) {
    return NullMeasureConversionValueMatch.newMatch(pConversion);
  }
  
  /**
   * Retrieve the set of values that occur in matches for conversion.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MeasureConversion> rawAccumulateAllValuesOfconversion(final Object[] parameters) {
    Set<MeasureConversion> results = new HashSet<MeasureConversion>();
    rawAccumulateAllValues(POSITION_CONVERSION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for conversion.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MeasureConversion> getAllValuesOfconversion() {
    return rawAccumulateAllValuesOfconversion(emptyArray());
  }
  
  @Override
  protected NullMeasureConversionValueMatch tupleToMatch(final Tuple t) {
    try {
    	return NullMeasureConversionValueMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureConversion) t.get(POSITION_CONVERSION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NullMeasureConversionValueMatch arrayToMatch(final Object[] match) {
    try {
    	return NullMeasureConversionValueMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureConversion) match[POSITION_CONVERSION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NullMeasureConversionValueMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NullMeasureConversionValueMatch.newMutableMatch((hu.bme.mdsd.ztz.model.drone.MeasureConversion) match[POSITION_CONVERSION]);
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
  public static IQuerySpecification<NullMeasureConversionValueMatcher> querySpecification() throws IncQueryException {
    return NullMeasureConversionValueQuerySpecification.instance();
  }
}
