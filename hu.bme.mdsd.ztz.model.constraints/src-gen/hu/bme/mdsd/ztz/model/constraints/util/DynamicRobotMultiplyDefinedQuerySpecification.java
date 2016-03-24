package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.DynamicRobotMultiplyDefinedMatch;
import hu.bme.mdsd.ztz.model.constraints.DynamicRobotMultiplyDefinedMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DynamicRobotMultiplyDefinedMatcher in a type-safe way.
 * 
 * @see DynamicRobotMultiplyDefinedMatcher
 * @see DynamicRobotMultiplyDefinedMatch
 * 
 */
@SuppressWarnings("all")
public final class DynamicRobotMultiplyDefinedQuerySpecification extends BaseGeneratedEMFQuerySpecification<DynamicRobotMultiplyDefinedMatcher> {
  private DynamicRobotMultiplyDefinedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DynamicRobotMultiplyDefinedQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DynamicRobotMultiplyDefinedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DynamicRobotMultiplyDefinedMatcher.on(engine);
  }
  
  @Override
  public DynamicRobotMultiplyDefinedMatch newEmptyMatch() {
    return DynamicRobotMultiplyDefinedMatch.newEmptyMatch();
  }
  
  @Override
  public DynamicRobotMultiplyDefinedMatch newMatch(final Object... parameters) {
    return DynamicRobotMultiplyDefinedMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static DynamicRobotMultiplyDefinedQuerySpecification INSTANCE = make();
    
    public static DynamicRobotMultiplyDefinedQuerySpecification make() {
      return new DynamicRobotMultiplyDefinedQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DynamicRobotMultiplyDefinedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.dynamicRobotMultiplyDefined";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.drone.Robot"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_drobot1 = body.getOrCreateVariableByName("drobot1");
      		PVariable var_drobot2 = body.getOrCreateVariableByName("drobot2");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot")
      		));
      		// 	DynamicRobot.robot(drobot1, robot)
      		new TypeConstraint(body, new FlatTuple(var_drobot1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drobot1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_0_, var_robot);
      		// 	DynamicRobot.robot(drobot2, robot)
      		new TypeConstraint(body, new FlatTuple(var_drobot2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_drobot2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_1_, var_robot);
      		// 		drobot1 != drobot2
      		new Inequality(body, var_drobot1, var_drobot2);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Dynamic behaviour of $robot$ is multiply defined.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "robot"
      		                }));
      		addAnnotation(annotation);
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
