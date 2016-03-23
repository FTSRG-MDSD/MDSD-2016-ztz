package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.RobotCannotExecuteTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.util.RobotCannotExecuteTaskQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.robotCannotExecuteTask pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RobotCannotExecuteTaskMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint (
 * 	key = {"robot", "taskExecution"},
 * 	severity = "error",
 * 	message = "$robot$ is not capable of executing linked task: $taskExecution$, capability of $capability$ is missing!",
 * 	targetEditorId = "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID"
 * )
 * pattern robotCannotExecuteTask(robot: DynamicRobot, taskExecution: TaskExecution, capability: Capability) {
 * 	TaskRequirement.taskExecution(requirement, taskExecution);
 * 	TaskExecution.executors(taskExecution, robot);
 * 	TaskRequirement.requiredCapabilities(requirement, capability);
 * 	N1 == count find requiredCapability(requirement, capability);
 * 	N2 == count find robotHasCapability(robot, capability);
 * 	N1 != N2;
 * }
 * </pre></code>
 * 
 * @see RobotCannotExecuteTaskMatch
 * @see RobotCannotExecuteTaskProcessor
 * @see RobotCannotExecuteTaskQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RobotCannotExecuteTaskMatcher extends BaseMatcher<RobotCannotExecuteTaskMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RobotCannotExecuteTaskMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RobotCannotExecuteTaskMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RobotCannotExecuteTaskMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROBOT = 0;
  
  private final static int POSITION_TASKEXECUTION = 1;
  
  private final static int POSITION_CAPABILITY = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RobotCannotExecuteTaskMatcher.class);
  
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
  public RobotCannotExecuteTaskMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public RobotCannotExecuteTaskMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return matches represented as a RobotCannotExecuteTaskMatch object.
   * 
   */
  public Collection<RobotCannotExecuteTaskMatch> getAllMatches(final DynamicRobot pRobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    return rawGetAllMatches(new Object[]{pRobot, pTaskExecution, pCapability});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return a match represented as a RobotCannotExecuteTaskMatch object, or null if no match is found.
   * 
   */
  public RobotCannotExecuteTaskMatch getOneArbitraryMatch(final DynamicRobot pRobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    return rawGetOneArbitraryMatch(new Object[]{pRobot, pTaskExecution, pCapability});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DynamicRobot pRobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    return rawHasMatch(new Object[]{pRobot, pTaskExecution, pCapability});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DynamicRobot pRobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    return rawCountMatches(new Object[]{pRobot, pTaskExecution, pCapability});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DynamicRobot pRobot, final TaskExecution pTaskExecution, final Capability pCapability, final IMatchProcessor<? super RobotCannotExecuteTaskMatch> processor) {
    rawForEachMatch(new Object[]{pRobot, pTaskExecution, pCapability}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DynamicRobot pRobot, final TaskExecution pTaskExecution, final Capability pCapability, final IMatchProcessor<? super RobotCannotExecuteTaskMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRobot, pTaskExecution, pCapability}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RobotCannotExecuteTaskMatch newMatch(final DynamicRobot pRobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    return RobotCannotExecuteTaskMatch.newMatch(pRobot, pTaskExecution, pCapability);
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DynamicRobot> rawAccumulateAllValuesOfrobot(final Object[] parameters) {
    Set<DynamicRobot> results = new HashSet<DynamicRobot>();
    rawAccumulateAllValues(POSITION_ROBOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot() {
    return rawAccumulateAllValuesOfrobot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot(final RobotCannotExecuteTaskMatch partialMatch) {
    return rawAccumulateAllValuesOfrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for robot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfrobot(final TaskExecution pTaskExecution, final Capability pCapability) {
    return rawAccumulateAllValuesOfrobot(new Object[]{
    null, 
    pTaskExecution, 
    pCapability
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskExecution> rawAccumulateAllValuesOftaskExecution(final Object[] parameters) {
    Set<TaskExecution> results = new HashSet<TaskExecution>();
    rawAccumulateAllValues(POSITION_TASKEXECUTION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskExecution() {
    return rawAccumulateAllValuesOftaskExecution(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskExecution(final RobotCannotExecuteTaskMatch partialMatch) {
    return rawAccumulateAllValuesOftaskExecution(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for taskExecution.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskExecution> getAllValuesOftaskExecution(final DynamicRobot pRobot, final Capability pCapability) {
    return rawAccumulateAllValuesOftaskExecution(new Object[]{
    pRobot, 
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
  public Set<Capability> getAllValuesOfcapability(final RobotCannotExecuteTaskMatch partialMatch) {
    return rawAccumulateAllValuesOfcapability(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfcapability(final DynamicRobot pRobot, final TaskExecution pTaskExecution) {
    return rawAccumulateAllValuesOfcapability(new Object[]{
    pRobot, 
    pTaskExecution, 
    null
    });
  }
  
  @Override
  protected RobotCannotExecuteTaskMatch tupleToMatch(final Tuple t) {
    try {
    	return RobotCannotExecuteTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) t.get(POSITION_ROBOT), (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) t.get(POSITION_TASKEXECUTION), (hu.bme.mdsd.ztz.model.drone.Capability) t.get(POSITION_CAPABILITY));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RobotCannotExecuteTaskMatch arrayToMatch(final Object[] match) {
    try {
    	return RobotCannotExecuteTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEXECUTION], (hu.bme.mdsd.ztz.model.drone.Capability) match[POSITION_CAPABILITY]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RobotCannotExecuteTaskMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RobotCannotExecuteTaskMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_ROBOT], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) match[POSITION_TASKEXECUTION], (hu.bme.mdsd.ztz.model.drone.Capability) match[POSITION_CAPABILITY]);
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
  public static IQuerySpecification<RobotCannotExecuteTaskMatcher> querySpecification() throws IncQueryException {
    return RobotCannotExecuteTaskQuerySpecification.instance();
  }
}
