package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus;
import hu.bme.mdsd.ztz.model.constraints.NotEnoughExecutorsMatch;
import hu.bme.mdsd.ztz.model.constraints.NotEnoughExecutorsMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.ExecutorOfTaskQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NotEnoughExecutorsMatcher in a type-safe way.
 * 
 * @see NotEnoughExecutorsMatcher
 * @see NotEnoughExecutorsMatch
 * 
 */
@SuppressWarnings("all")
public final class NotEnoughExecutorsQuerySpecification extends BaseGeneratedEMFQuerySpecification<NotEnoughExecutorsMatcher> {
  private NotEnoughExecutorsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotEnoughExecutorsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotEnoughExecutorsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NotEnoughExecutorsMatcher.on(engine);
  }
  
  @Override
  public NotEnoughExecutorsMatch newEmptyMatch() {
    return NotEnoughExecutorsMatch.newEmptyMatch();
  }
  
  @Override
  public NotEnoughExecutorsMatch newMatch(final Object... parameters) {
    return NotEnoughExecutorsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[0], (java.lang.Integer) parameters[1], (java.lang.Integer) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static NotEnoughExecutorsQuerySpecification INSTANCE = make();
    
    public static NotEnoughExecutorsQuerySpecification make() {
      return new NotEnoughExecutorsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NotEnoughExecutorsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.notEnoughExecutors";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("execution","requiredNum","executorNum");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("execution", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"),new PParameter("requiredNum", "java.lang.Integer"),new PParameter("executorNum", "java.lang.Integer"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_execution = body.getOrCreateVariableByName("execution");
      		PVariable var_requiredNum = body.getOrCreateVariableByName("requiredNum");
      		PVariable var_executorNum = body.getOrCreateVariableByName("executorNum");
      		PVariable var_requirement = body.getOrCreateVariableByName("requirement");
      		PVariable var_status = body.getOrCreateVariableByName("status");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_execution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_execution, "execution"),
      		   new ExportedParameter(body, var_requiredNum, "requiredNum"),
      		   new ExportedParameter(body, var_executorNum, "executorNum")
      		));
      		// 	TaskRequirement.taskExecution(requirement, execution)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "taskExecution")));
      		new Equality(body, var__virtual_0_, var_execution);
      		// 	TaskExecution.status(execution, status)
      		new TypeConstraint(body, new FlatTuple(var_execution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_execution, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "status")));
      		new Equality(body, var__virtual_1_, var_status);
      		// 	check(status == hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus.IN_PROGRESS)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern notEnoughExecutors";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("status");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus status = (hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus) provider.getValue("status");
      		                                    return evaluateExpression_1_1(status);
      		                                }
      		
      		                        },  null); // 	TaskRequirement.participants(requirement, requiredNum)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "participants")));
      		new Equality(body, var__virtual_2_, var_requiredNum);
      		// 		executorNum == count find executorOfTask(_, execution)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var___0_, var_execution), ExecutorOfTaskQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_executorNum, var__virtual_3_);
      		// 		check(executorNum < requiredNum)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern notEnoughExecutors";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("executorNum", "requiredNum");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer executorNum = (java.lang.Integer) provider.getValue("executorNum");
      		                                    java.lang.Integer requiredNum = (java.lang.Integer) provider.getValue("requiredNum");
      		                                    return evaluateExpression_1_2(executorNum, requiredNum);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Not enough executors for $execution$. (required: $requiredNum$, available: $executorNum$)");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "execution", 
      		                "requiredNum", 
      		                "executorNum"
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
    boolean _equals = Objects.equal(status, TaskExecutionStatus.IN_PROGRESS);
    return _equals;
  }
  
  private static boolean evaluateExpression_1_2(final Integer executorNum, final Integer requiredNum) {
    boolean _lessThan = (executorNum.compareTo(requiredNum) < 0);
    return _lessThan;
  }
}
