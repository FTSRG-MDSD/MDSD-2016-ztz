package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.TaskEarlyFinishedMatch;
import hu.bme.mdsd.ztz.model.constraints.TaskEarlyFinishedMatcher;
import hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate TaskEarlyFinishedMatcher in a type-safe way.
 * 
 * @see TaskEarlyFinishedMatcher
 * @see TaskEarlyFinishedMatch
 * 
 */
@SuppressWarnings("all")
public final class TaskEarlyFinishedQuerySpecification extends BaseGeneratedEMFQuerySpecification<TaskEarlyFinishedMatcher> {
  private TaskEarlyFinishedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TaskEarlyFinishedQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TaskEarlyFinishedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TaskEarlyFinishedMatcher.on(engine);
  }
  
  @Override
  public TaskEarlyFinishedMatch newEmptyMatch() {
    return TaskEarlyFinishedMatch.newEmptyMatch();
  }
  
  @Override
  public TaskEarlyFinishedMatch newMatch(final Object... parameters) {
    return TaskEarlyFinishedMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Task) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static TaskEarlyFinishedQuerySpecification INSTANCE = make();
    
    public static TaskEarlyFinishedQuerySpecification make() {
      return new TaskEarlyFinishedQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TaskEarlyFinishedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.taskEarlyFinished";
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
      		PVariable var_status = body.getOrCreateVariableByName("status");
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_task, "task")
      		));
      		// 	Task.status(task, ::Finished)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.mdsd.hu/drone", "TaskStatus", "Finished").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "status")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	Task.execution.status(task, status)
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "execution")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "TaskExecution", "status")));
      		new Equality(body, var__virtual_3_, var_status);
      		// 	check (status != hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus.FINISHED)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern taskEarlyFinished";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("status");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus status = (hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus) provider.getValue("status");
      		                                    return evaluateExpression_1_1(status);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$task$ mustn't be finished when its execution status is still not finished!");
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
  
  private static boolean evaluateExpression_1_1(final TaskExecutionStatus status) {
    boolean _notEquals = (!Objects.equal(status, TaskExecutionStatus.FINISHED));
    return _notEquals;
  }
}
