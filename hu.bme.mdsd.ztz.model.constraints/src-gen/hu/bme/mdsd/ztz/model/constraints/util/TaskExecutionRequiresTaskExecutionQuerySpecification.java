package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.TaskExecutionRequiresTaskExecutionMatch;
import hu.bme.mdsd.ztz.model.constraints.TaskExecutionRequiresTaskExecutionMatcher;
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
 * A pattern-specific query specification that can instantiate TaskExecutionRequiresTaskExecutionMatcher in a type-safe way.
 * 
 * @see TaskExecutionRequiresTaskExecutionMatcher
 * @see TaskExecutionRequiresTaskExecutionMatch
 * 
 */
@SuppressWarnings("all")
public final class TaskExecutionRequiresTaskExecutionQuerySpecification extends BaseGeneratedEMFQuerySpecification<TaskExecutionRequiresTaskExecutionMatcher> {
  private TaskExecutionRequiresTaskExecutionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TaskExecutionRequiresTaskExecutionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TaskExecutionRequiresTaskExecutionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TaskExecutionRequiresTaskExecutionMatcher.on(engine);
  }
  
  @Override
  public TaskExecutionRequiresTaskExecutionMatch newEmptyMatch() {
    return TaskExecutionRequiresTaskExecutionMatch.newEmptyMatch();
  }
  
  @Override
  public TaskExecutionRequiresTaskExecutionMatch newMatch(final Object... parameters) {
    return TaskExecutionRequiresTaskExecutionMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TaskExecutionRequiresTaskExecutionQuerySpecification INSTANCE = make();
    
    public static TaskExecutionRequiresTaskExecutionQuerySpecification make() {
      return new TaskExecutionRequiresTaskExecutionQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TaskExecutionRequiresTaskExecutionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.taskExecutionRequiresTaskExecution";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("taskEx","requiredTaskEx");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("taskEx", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"),new PParameter("requiredTaskEx", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_taskEx = body.getOrCreateVariableByName("taskEx");
      		PVariable var_requiredTaskEx = body.getOrCreateVariableByName("requiredTaskEx");
      		PVariable var_requirement = body.getOrCreateVariableByName("requirement");
      		new TypeConstraint(body, new FlatTuple(var_taskEx), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		new TypeConstraint(body, new FlatTuple(var_requiredTaskEx), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_taskEx, "taskEx"),
      		   new ExportedParameter(body, var_requiredTaskEx, "requiredTaskEx")
      		));
      		// 	TaskRequirement.taskExecution(requirement, taskEx)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "taskExecution")));
      		new Equality(body, var__virtual_0_, var_taskEx);
      		// 	TaskRequirement.prerequisite(requirement, requiredTaskEx)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "prerequisite")));
      		new Equality(body, var__virtual_1_, var_requiredTaskEx);
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
