package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.TaskRequirementHasCapabilityMatch;
import hu.bme.mdsd.ztz.model.constraints.util.TaskRequirementHasCapabilityQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Capability;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.taskRequirementHasCapability pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TaskRequirementHasCapabilityMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern taskRequirementHasCapability(requirement: TaskRequirement, capability: Capability) {
 * 	TaskRequirement.requiredCapabilities(requirement, capability);
 * }
 * </pre></code>
 * 
 * @see TaskRequirementHasCapabilityMatch
 * @see TaskRequirementHasCapabilityProcessor
 * @see TaskRequirementHasCapabilityQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TaskRequirementHasCapabilityMatcher extends BaseMatcher<TaskRequirementHasCapabilityMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TaskRequirementHasCapabilityMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    TaskRequirementHasCapabilityMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TaskRequirementHasCapabilityMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REQUIREMENT = 0;
  
  private final static int POSITION_CAPABILITY = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(TaskRequirementHasCapabilityMatcher.class);
  
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
  public TaskRequirementHasCapabilityMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TaskRequirementHasCapabilityMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return matches represented as a TaskRequirementHasCapabilityMatch object.
   * 
   */
  public Collection<TaskRequirementHasCapabilityMatch> getAllMatches(final TaskRequirement pRequirement, final Capability pCapability) {
    return rawGetAllMatches(new Object[]{pRequirement, pCapability});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return a match represented as a TaskRequirementHasCapabilityMatch object, or null if no match is found.
   * 
   */
  public TaskRequirementHasCapabilityMatch getOneArbitraryMatch(final TaskRequirement pRequirement, final Capability pCapability) {
    return rawGetOneArbitraryMatch(new Object[]{pRequirement, pCapability});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskRequirement pRequirement, final Capability pCapability) {
    return rawHasMatch(new Object[]{pRequirement, pCapability});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskRequirement pRequirement, final Capability pCapability) {
    return rawCountMatches(new Object[]{pRequirement, pCapability});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskRequirement pRequirement, final Capability pCapability, final IMatchProcessor<? super TaskRequirementHasCapabilityMatch> processor) {
    rawForEachMatch(new Object[]{pRequirement, pCapability}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskRequirement pRequirement, final Capability pCapability, final IMatchProcessor<? super TaskRequirementHasCapabilityMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRequirement, pCapability}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TaskRequirementHasCapabilityMatch newMatch(final TaskRequirement pRequirement, final Capability pCapability) {
    return TaskRequirementHasCapabilityMatch.newMatch(pRequirement, pCapability);
  }
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskRequirement> rawAccumulateAllValuesOfrequirement(final Object[] parameters) {
    Set<TaskRequirement> results = new HashSet<TaskRequirement>();
    rawAccumulateAllValues(POSITION_REQUIREMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfrequirement() {
    return rawAccumulateAllValuesOfrequirement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfrequirement(final TaskRequirementHasCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfrequirement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for requirement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskRequirement> getAllValuesOfrequirement(final Capability pCapability) {
    return rawAccumulateAllValuesOfrequirement(new Object[]{
    null, 
    pCapability
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Capability> rawAccumulateAllValuesOfcapability(final Object[] parameters) {
    Set<Capability> results = new HashSet<Capability>();
    rawAccumulateAllValues(POSITION_CAPABILITY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfcapability() {
    return rawAccumulateAllValuesOfcapability(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfcapability(final TaskRequirementHasCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfcapability(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfcapability(final TaskRequirement pRequirement) {
    return rawAccumulateAllValuesOfcapability(new Object[]{
    pRequirement, 
    null
    });
  }
  
  @Override
  protected TaskRequirementHasCapabilityMatch tupleToMatch(final Tuple t) {
    try {
    	return TaskRequirementHasCapabilityMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) t.get(POSITION_REQUIREMENT), (hu.bme.mdsd.ztz.model.drone.Capability) t.get(POSITION_CAPABILITY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TaskRequirementHasCapabilityMatch arrayToMatch(final Object[] match) {
    try {
    	return TaskRequirementHasCapabilityMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_REQUIREMENT], (hu.bme.mdsd.ztz.model.drone.Capability) match[POSITION_CAPABILITY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TaskRequirementHasCapabilityMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TaskRequirementHasCapabilityMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) match[POSITION_REQUIREMENT], (hu.bme.mdsd.ztz.model.drone.Capability) match[POSITION_CAPABILITY]);
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
  public static IQuerySpecification<TaskRequirementHasCapabilityMatcher> querySpecification() throws IncQueryException {
    return TaskRequirementHasCapabilityQuerySpecification.instance();
  }
}
