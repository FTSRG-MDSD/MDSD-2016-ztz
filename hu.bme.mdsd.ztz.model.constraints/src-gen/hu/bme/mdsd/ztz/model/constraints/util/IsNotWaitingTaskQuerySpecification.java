package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus;
import hu.bme.mdsd.ztz.model.constraints.IsNotWaitingTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.IsNotWaitingTaskMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate IsNotWaitingTaskMatcher in a type-safe way.
 * 
 * @see IsNotWaitingTaskMatcher
 * @see IsNotWaitingTaskMatch
 * 
 */
@SuppressWarnings("all")
public final class IsNotWaitingTaskQuerySpecification extends BaseGeneratedEMFQuerySpecification<IsNotWaitingTaskMatcher> {
  private IsNotWaitingTaskQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IsNotWaitingTaskQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IsNotWaitingTaskMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return IsNotWaitingTaskMatcher.on(engine);
  }
  
  @Override
  public IsNotWaitingTaskMatch newEmptyMatch() {
    return IsNotWaitingTaskMatch.newEmptyMatch();
  }
  
  @Override
  public IsNotWaitingTaskMatch newMatch(final Object... parameters) {
    return IsNotWaitingTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static IsNotWaitingTaskQuerySpecification INSTANCE = make();
    
    public static IsNotWaitingTaskQuerySpecification make() {
      return new IsNotWaitingTaskQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static IsNotWaitingTaskQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.isNotWaitingTask";
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
      		PVariable var_status = body.getOrCreateVariableByName("status");
      		PVariable var_preStatus = body.getOrCreateVariableByName("preStatus");
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_taskExecution, "taskExecution")
      		));
      		// 	TaskRequirement.task(requirement, taskExecution)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "task")));
      		new Equality(body, var__virtual_0_, var_taskExecution);
      		// 	TaskExecution.status(taskExecution, status)
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_taskExecution, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "status")));
      		new Equality(body, var__virtual_1_, var_status);
      		// 	TaskRequirement.prerequisite.status(requirement, preStatus)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "prerequisite")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "status")));
      		new Equality(body, var__virtual_3_, var_preStatus);
      		// 	check(preStatus != hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus.FINISHED && 		status != hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus.WAITING	)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern isNotWaitingTask";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("preStatus", "status");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus preStatus = (hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus) provider.getValue("preStatus");
      		                                    hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus status = (hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus) provider.getValue("status");
      		                                    return evaluateExpression_1_1(preStatus, status);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$taskExecution$ must be waiting when its prerequisite is not finished!");
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
  
  private static boolean evaluateExpression_1_1(final TaskExecutionStatus preStatus, final TaskExecutionStatus status) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(preStatus, TaskExecutionStatus.FINISHED));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(status, TaskExecutionStatus.WAITING));
      _and = _notEquals_1;
    }
    return _and;
  }
}
