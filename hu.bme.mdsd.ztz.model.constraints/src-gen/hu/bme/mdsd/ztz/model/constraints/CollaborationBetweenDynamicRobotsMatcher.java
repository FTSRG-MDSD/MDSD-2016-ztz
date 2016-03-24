package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.CollaborationBetweenDynamicRobotsMatch;
import hu.bme.mdsd.ztz.model.constraints.util.CollaborationBetweenDynamicRobotsQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mdsd.ztz.model.constraints.collaborationBetweenDynamicRobots pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CollaborationBetweenDynamicRobotsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern collaborationBetweenDynamicRobots(drobot: DynamicRobot, dcollaborator: DynamicRobot) {
 * 	DynamicRobot.collaborations(drobot, robotCollaboration);
 * 	RobotCollaboration.collaborator(robotCollaboration, dcollaborator);
 * }
 * </pre></code>
 * 
 * @see CollaborationBetweenDynamicRobotsMatch
 * @see CollaborationBetweenDynamicRobotsProcessor
 * @see CollaborationBetweenDynamicRobotsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CollaborationBetweenDynamicRobotsMatcher extends BaseMatcher<CollaborationBetweenDynamicRobotsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CollaborationBetweenDynamicRobotsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CollaborationBetweenDynamicRobotsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CollaborationBetweenDynamicRobotsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DROBOT = 0;
  
  private final static int POSITION_DCOLLABORATOR = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CollaborationBetweenDynamicRobotsMatcher.class);
  
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
  public CollaborationBetweenDynamicRobotsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CollaborationBetweenDynamicRobotsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pDcollaborator the fixed value of pattern parameter dcollaborator, or null if not bound.
   * @return matches represented as a CollaborationBetweenDynamicRobotsMatch object.
   * 
   */
  public Collection<CollaborationBetweenDynamicRobotsMatch> getAllMatches(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator) {
    return rawGetAllMatches(new Object[]{pDrobot, pDcollaborator});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pDcollaborator the fixed value of pattern parameter dcollaborator, or null if not bound.
   * @return a match represented as a CollaborationBetweenDynamicRobotsMatch object, or null if no match is found.
   * 
   */
  public CollaborationBetweenDynamicRobotsMatch getOneArbitraryMatch(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator) {
    return rawGetOneArbitraryMatch(new Object[]{pDrobot, pDcollaborator});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pDcollaborator the fixed value of pattern parameter dcollaborator, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator) {
    return rawHasMatch(new Object[]{pDrobot, pDcollaborator});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pDcollaborator the fixed value of pattern parameter dcollaborator, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator) {
    return rawCountMatches(new Object[]{pDrobot, pDcollaborator});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pDcollaborator the fixed value of pattern parameter dcollaborator, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator, final IMatchProcessor<? super CollaborationBetweenDynamicRobotsMatch> processor) {
    rawForEachMatch(new Object[]{pDrobot, pDcollaborator}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pDcollaborator the fixed value of pattern parameter dcollaborator, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator, final IMatchProcessor<? super CollaborationBetweenDynamicRobotsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDrobot, pDcollaborator}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pDcollaborator the fixed value of pattern parameter dcollaborator, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CollaborationBetweenDynamicRobotsMatch newMatch(final DynamicRobot pDrobot, final DynamicRobot pDcollaborator) {
    return CollaborationBetweenDynamicRobotsMatch.newMatch(pDrobot, pDcollaborator);
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DynamicRobot> rawAccumulateAllValuesOfdrobot(final Object[] parameters) {
    Set<DynamicRobot> results = new HashSet<DynamicRobot>();
    rawAccumulateAllValues(POSITION_DROBOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdrobot() {
    return rawAccumulateAllValuesOfdrobot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdrobot(final CollaborationBetweenDynamicRobotsMatch partialMatch) {
    return rawAccumulateAllValuesOfdrobot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drobot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdrobot(final DynamicRobot pDcollaborator) {
    return rawAccumulateAllValuesOfdrobot(new Object[]{
    null, 
    pDcollaborator
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for dcollaborator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DynamicRobot> rawAccumulateAllValuesOfdcollaborator(final Object[] parameters) {
    Set<DynamicRobot> results = new HashSet<DynamicRobot>();
    rawAccumulateAllValues(POSITION_DCOLLABORATOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for dcollaborator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdcollaborator() {
    return rawAccumulateAllValuesOfdcollaborator(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dcollaborator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdcollaborator(final CollaborationBetweenDynamicRobotsMatch partialMatch) {
    return rawAccumulateAllValuesOfdcollaborator(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for dcollaborator.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DynamicRobot> getAllValuesOfdcollaborator(final DynamicRobot pDrobot) {
    return rawAccumulateAllValuesOfdcollaborator(new Object[]{
    pDrobot, 
    null
    });
  }
  
  @Override
  protected CollaborationBetweenDynamicRobotsMatch tupleToMatch(final Tuple t) {
    try {
    	return CollaborationBetweenDynamicRobotsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) t.get(POSITION_DROBOT), (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) t.get(POSITION_DCOLLABORATOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CollaborationBetweenDynamicRobotsMatch arrayToMatch(final Object[] match) {
    try {
    	return CollaborationBetweenDynamicRobotsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_DROBOT], (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_DCOLLABORATOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CollaborationBetweenDynamicRobotsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CollaborationBetweenDynamicRobotsMatch.newMutableMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_DROBOT], (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) match[POSITION_DCOLLABORATOR]);
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
  public static IQuerySpecification<CollaborationBetweenDynamicRobotsMatcher> querySpecification() throws IncQueryException {
    return CollaborationBetweenDynamicRobotsQuerySpecification.instance();
  }
}
