package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.RobotHasCapabilityMatch;
import hu.bme.mdsd.ztz.model.constraints.RobotHasCapabilityMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RobotHasCapabilityMatcher in a type-safe way.
 * 
 * @see RobotHasCapabilityMatcher
 * @see RobotHasCapabilityMatch
 * 
 */
@SuppressWarnings("all")
public final class RobotHasCapabilityQuerySpecification extends BaseGeneratedEMFQuerySpecification<RobotHasCapabilityMatcher> {
  private RobotHasCapabilityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RobotHasCapabilityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RobotHasCapabilityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RobotHasCapabilityMatcher.on(engine);
  }
  
  @Override
  public RobotHasCapabilityMatch newEmptyMatch() {
    return RobotHasCapabilityMatch.newEmptyMatch();
  }
  
  @Override
  public RobotHasCapabilityMatch newMatch(final Object... parameters) {
    return RobotHasCapabilityMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Capability) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static RobotHasCapabilityQuerySpecification INSTANCE = make();
    
    public static RobotHasCapabilityQuerySpecification make() {
      return new RobotHasCapabilityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RobotHasCapabilityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.robotHasCapability";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","capability");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.behaviour.DynamicRobot"),new PParameter("capability", "hu.bme.mdsd.ztz.model.drone.Capability"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_capability = body.getOrCreateVariableByName("capability");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		new TypeConstraint(body, new FlatTuple(var_capability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Capability")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_capability, "capability")
      		));
      		// 	DynamicRobot.robot.capabilities(robot, capability)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "capabilities")));
      		new Equality(body, var__virtual_1_, var_capability);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
