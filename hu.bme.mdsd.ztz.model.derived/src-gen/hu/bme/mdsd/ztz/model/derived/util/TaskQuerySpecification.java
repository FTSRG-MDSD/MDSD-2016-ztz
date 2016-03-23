package hu.bme.mdsd.ztz.model.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.derived.TaskMatch;
import hu.bme.mdsd.ztz.model.derived.TaskMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate TaskMatcher in a type-safe way.
 * 
 * @see TaskMatcher
 * @see TaskMatch
 * 
 */
@SuppressWarnings("all")
public final class TaskQuerySpecification extends BaseGeneratedEMFQuerySpecification<TaskMatcher> {
  private TaskQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TaskQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TaskMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TaskMatcher.on(engine);
  }
  
  @Override
  public TaskMatch newEmptyMatch() {
    return TaskMatch.newEmptyMatch();
  }
  
  @Override
  public TaskMatch newMatch(final Object... parameters) {
    return TaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) parameters[0], (hu.bme.mdsd.ztz.model.drone.Task) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TaskQuerySpecification INSTANCE = make();
    
    public static TaskQuerySpecification make() {
      return new TaskQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TaskQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.derived.task";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("requirement","task");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("requirement", "hu.bme.mdsd.ztz.model.behaviour.TaskRequirement"),new PParameter("task", "hu.bme.mdsd.ztz.model.drone.Task"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_requirement = body.getOrCreateVariableByName("requirement");
      		PVariable var_task = body.getOrCreateVariableByName("task");
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_requirement, "requirement"),
      		   new ExportedParameter(body, var_task, "task")
      		));
      		// 	TaskRequirement.taskExecution.task(requirement, task)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "taskExecution")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "task")));
      		new Equality(body, var__virtual_1_, var_task);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
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
