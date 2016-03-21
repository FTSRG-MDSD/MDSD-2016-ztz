package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.IsNotWaitingTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.IsNotWaitingTaskMatcher;
import hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus;
import hu.bme.mdsd.ztz.model.drone.TaskStatus;
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
    return IsNotWaitingTaskMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Task) parameters[0]);
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
      return Arrays.asList("task");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("task", "hu.bme.mdsd.ztz.model.drone.Task"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_task = body.getOrCreateVariableByName("task");
      		PVariable var_preStatus = body.getOrCreateVariableByName("preStatus");
      		PVariable var_taskStatus = body.getOrCreateVariableByName("taskStatus");
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_task, "task")
      		));
      		// 	Task.requirement.prerequisite.status(task, preStatus)
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "requirement")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "TaskRequirement", "prerequisite")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "status")));
      		new Equality(body, var__virtual_2_, var_preStatus);
      		// 	Task.status(task, taskStatus)
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "status")));
      		new Equality(body, var__virtual_3_, var_taskStatus);
      		// 	check(preStatus != hu.bme.mdsd.ztz.model.drone.TaskStatus.FINISHED && 		taskStatus != hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus.WAITING	)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern isNotWaitingTask";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("preStatus", "taskStatus");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    hu.bme.mdsd.ztz.model.drone.TaskStatus preStatus = (hu.bme.mdsd.ztz.model.drone.TaskStatus) provider.getValue("preStatus");
      		                                    hu.bme.mdsd.ztz.model.drone.TaskStatus taskStatus = (hu.bme.mdsd.ztz.model.drone.TaskStatus) provider.getValue("taskStatus");
      		                                    return evaluateExpression_1_1(preStatus, taskStatus);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$task$ must be waiting when its prerequisite is not finished!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "task"
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
  
  private static boolean evaluateExpression_1_1(final TaskStatus preStatus, final TaskStatus taskStatus) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(preStatus, TaskStatus.FINISHED));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(taskStatus, TaskExecutionStatus.WAITING));
      _and = _notEquals_1;
    }
    return _and;
  }
}
