package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.RobotCannotExecuteTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.RobotCannotExecuteTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.RequiredCapabilityQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasCapabilityQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate RobotCannotExecuteTaskMatcher in a type-safe way.
 * 
 * @see RobotCannotExecuteTaskMatcher
 * @see RobotCannotExecuteTaskMatch
 * 
 */
@SuppressWarnings("all")
public final class RobotCannotExecuteTaskQuerySpecification extends BaseGeneratedEMFQuerySpecification<RobotCannotExecuteTaskMatcher> {
  private RobotCannotExecuteTaskQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RobotCannotExecuteTaskQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RobotCannotExecuteTaskMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RobotCannotExecuteTaskMatcher.on(engine);
  }
  
  @Override
  public RobotCannotExecuteTaskMatch newEmptyMatch() {
    return RobotCannotExecuteTaskMatch.newEmptyMatch();
  }
  
  @Override
  public RobotCannotExecuteTaskMatch newMatch(final Object... parameters) {
    return RobotCannotExecuteTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[1], (hu.bme.mdsd.ztz.model.drone.Capability) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static RobotCannotExecuteTaskQuerySpecification INSTANCE = make();
    
    public static RobotCannotExecuteTaskQuerySpecification make() {
      return new RobotCannotExecuteTaskQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RobotCannotExecuteTaskQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.robotCannotExecuteTask";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","taskExecution","capability");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.behaviour.DynamicRobot"),new PParameter("taskExecution", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"),new PParameter("capability", "hu.bme.mdsd.ztz.model.drone.Capability"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_taskExecution = body.getOrCreateVariableByName("taskExecution");
      		PVariable var_capability = body.getOrCreateVariableByName("capability");
      		PVariable var_requirement = body.getOrCreateVariableByName("requirement");
      		PVariable var_N1 = body.getOrCreateVariableByName("N1");
      		PVariable var_N2 = body.getOrCreateVariableByName("N2");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		new TypeConstraint(body, new FlatTuple(var_capability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Capability")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_taskExecution, "taskExecution"),
      		   new ExportedParameter(body, var_capability, "capability")
      		));
      		// 	TaskRequirement.task(requirement, taskExecution)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "task")));
      		new Equality(body, var__virtual_0_, var_taskExecution);
      		// 	TaskExecution.executors(taskExecution, robot)
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_taskExecution, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "executors")));
      		new Equality(body, var__virtual_1_, var_robot);
      		// 	TaskRequirement.requiredCapabilities(requirement, capability)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "requiredCapabilities")));
      		new Equality(body, var__virtual_2_, var_capability);
      		// 	N1 == count find requiredCapability(requirement, capability)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_requirement, var_capability), RequiredCapabilityQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_N1, var__virtual_3_);
      		// 	N2 == count find robotHasCapability(robot, capability)
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new PatternMatchCounter(body, new FlatTuple(var_robot, var_capability), RobotHasCapabilityQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_4_);
      		new Equality(body, var_N2, var__virtual_4_);
      		// 	N1 != N2
      		new Inequality(body, var_N1, var_N2);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$robot$ is not capable of executing linked task: $taskExecution$, capability of $capability$ is missing!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "robot", 
      		                "taskExecution"
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
