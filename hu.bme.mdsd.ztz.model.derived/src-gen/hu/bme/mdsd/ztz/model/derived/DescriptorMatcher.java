package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.derived.DescriptorMatch;
import hu.bme.mdsd.ztz.model.derived.util.DescriptorQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.derived.descriptor pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DescriptorMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern descriptor(sourceRequirement: TaskRequirement, targetDescriptor: TaskDescriptor) {
 * 	TaskRequirement.task(sourceRequirement, taskExecution);
 * 	TaskExecution.task.descriptor(taskExecution, targetDescriptor);
 * }
 * </pre></code>
 * 
 * @see DescriptorMatch
 * @see DescriptorProcessor
 * @see DescriptorQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DescriptorMatcher extends BaseMatcher<DescriptorMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DescriptorMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    DescriptorMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new DescriptorMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SOURCEREQUIREMENT = 0;
  
  private final static int POSITION_TARGETDESCRIPTOR = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(DescriptorMatcher.class);
  
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
  public DescriptorMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public DescriptorMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @return matches represented as a DescriptorMatch object.
   * 
   */
  public Collection<DescriptorMatch> getAllMatches(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    return rawGetAllMatches(new Object[]{pSourceRequirement, pTargetDescriptor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @return a match represented as a DescriptorMatch object, or null if no match is found.
   * 
   */
  public DescriptorMatch getOneArbitraryMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    return rawGetOneArbitraryMatch(new Object[]{pSourceRequirement, pTargetDescriptor});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    return rawHasMatch(new Object[]{pSourceRequirement, pTargetDescriptor});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    return rawCountMatches(new Object[]{pSourceRequirement, pTargetDescriptor});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor, final IMatchProcessor<? super DescriptorMatch> processor) {
    rawForEachMatch(new Object[]{pSourceRequirement, pTargetDescriptor}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor, final IMatchProcessor<? super DescriptorMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSourceRequirement, pTargetDescriptor}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DescriptorMatch newMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    return DescriptorMatch.newMatch(pSourceRequirement, pTargetDescriptor);
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskRequirement> rawAccumulateAllValuesOfsourceRequirement(final Object[] parameters) {
    Set<TaskRequirement> results = new HashSet<TaskRequirement>();
    rawAccumulateAllValues(POSITION_SOURCEREQUIREMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfsourceRequirement() {
    return rawAccumulateAllValuesOfsourceRequirement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfsourceRequirement(final DescriptorMatch partialMatch) {
    return rawAccumulateAllValuesOfsourceRequirement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sourceRequirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfsourceRequirement(final TaskDescriptor pTargetDescriptor) {
    return rawAccumulateAllValuesOfsourceRequirement(new Object[]{
    null, 
    pTargetDescriptor
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetDescriptor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskDescriptor> rawAccumulateAllValuesOftargetDescriptor(final Object[] parameters) {
    Set<TaskDescriptor> results = new HashSet<TaskDescriptor>();
    rawAccumulateAllValues(POSITION_TARGETDESCRIPTOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetDescriptor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskDescriptor> getAllValuesOftargetDescriptor() {
    return rawAccumulateAllValuesOftargetDescriptor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetDescriptor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskDescriptor> getAllValuesOftargetDescriptor(final DescriptorMatch partialMatch) {
    return rawAccumulateAllValuesOftargetDescriptor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for targetDescriptor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskDescriptor> getAllValuesOftargetDescriptor(final TaskRequirement pSourceRequirement) {
    return rawAccumulateAllValuesOftargetDescriptor(new Object[]{
    pSourceRequirement, 
    null
    });
  }
  
  @Override
  protected DescriptorMatch tupleToMatch(final Tuple t) {
    try {
    	return DescriptorMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) t.get(POSITION_SOURCEREQUIREMENT), (hu.bme.mdsd.ztz.model.drone.TaskDescriptor) t.get(POSITION_TARGETDESCRIPTOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DescriptorMatch arrayToMatch(final Object[] match) {
    try {
    	return DescriptorMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_SOURCEREQUIREMENT], (hu.bme.mdsd.ztz.model.drone.TaskDescriptor) match[POSITION_TARGETDESCRIPTOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DescriptorMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DescriptorMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_SOURCEREQUIREMENT], (hu.bme.mdsd.ztz.model.drone.TaskDescriptor) match[POSITION_TARGETDESCRIPTOR]);
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
  public static IQuerySpecification<DescriptorMatcher> querySpecification() throws IncQueryException {
    return DescriptorQuerySpecification.instance();
  }
}
