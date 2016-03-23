package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.IncorrectWaitingTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.IncorrectWaitingTaskMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate IncorrectWaitingTaskMatcher in a type-safe way.
 * 
 * @see IncorrectWaitingTaskMatcher
 * @see IncorrectWaitingTaskMatch
 * 
 */
@SuppressWarnings("all")
public final class IncorrectWaitingTaskQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncorrectWaitingTaskMatcher> {
  private IncorrectWaitingTaskQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IncorrectWaitingTaskQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IncorrectWaitingTaskMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IncorrectWaitingTaskMatcher.on(engine);
  }
  
  @Override
  public IncorrectWaitingTaskMatch newEmptyMatch() {
    return IncorrectWaitingTaskMatch.newEmptyMatch();
  }
  
  @Override
  public IncorrectWaitingTaskMatch newMatch(final Object... parameters) {
    return IncorrectWaitingTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static IncorrectWaitingTaskQuerySpecification INSTANCE = make();
    
    public static IncorrectWaitingTaskQuerySpecification make() {
      return new IncorrectWaitingTaskQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static IncorrectWaitingTaskQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.incorrectWaitingTask";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("taskExecution");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("taskExecution", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_taskExecution = body.getOrCreateVariableByName("taskExecution");
      		PVariable var_requirement = body.getOrCreateVariableByName("requirement");
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_taskExecution, "taskExecution")
      		));
      		// 	TaskRequirement.taskExecution(requirement, taskExecution)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "taskExecution")));
      		new Equality(body, var__virtual_0_, var_taskExecution);
      		// 	TaskExecution.status(taskExecution, ::Waiting)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://www.mdsd.hu/behaviour", "TaskExecutionStatus", "Waiting").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_taskExecution, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "status")));
      		new Equality(body, var__virtual_2_, var__virtual_1_);
      		// 	TaskRequirement.prerequisite.status(requirement, ::Finished)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new ConstantValue(body, var__virtual_3_, getEnumLiteral("http://www.mdsd.hu/behaviour", "TaskExecutionStatus", "Finished").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "prerequisite")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "status")));
      		new Equality(body, var__virtual_5_, var__virtual_3_);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$taskExecution$ must not be in Waiting status when its prerequisite task is finished!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
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
