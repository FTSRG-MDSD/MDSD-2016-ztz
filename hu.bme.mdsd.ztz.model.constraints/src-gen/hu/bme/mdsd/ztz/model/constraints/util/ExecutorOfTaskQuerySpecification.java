package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.ExecutorOfTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.ExecutorOfTaskMatcher;
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
 * A pattern-specific query specification that can instantiate ExecutorOfTaskMatcher in a type-safe way.
 * 
 * @see ExecutorOfTaskMatcher
 * @see ExecutorOfTaskMatch
 * 
 */
@SuppressWarnings("all")
public final class ExecutorOfTaskQuerySpecification extends BaseGeneratedEMFQuerySpecification<ExecutorOfTaskMatcher> {
  private ExecutorOfTaskQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ExecutorOfTaskQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExecutorOfTaskMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ExecutorOfTaskMatcher.on(engine);
  }
  
  @Override
  public ExecutorOfTaskMatch newEmptyMatch() {
    return ExecutorOfTaskMatch.newEmptyMatch();
  }
  
  @Override
  public ExecutorOfTaskMatch newMatch(final Object... parameters) {
    return ExecutorOfTaskMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ExecutorOfTaskQuerySpecification INSTANCE = make();
    
    public static ExecutorOfTaskQuerySpecification make() {
      return new ExecutorOfTaskQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ExecutorOfTaskQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.executorOfTask";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","execution");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.behaviour.DynamicRobot"),new PParameter("execution", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_execution = body.getOrCreateVariableByName("execution");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		new TypeConstraint(body, new FlatTuple(var_execution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_execution, "execution")
      		));
      		// 	TaskExecution.executors(execution, robot)
      		new TypeConstraint(body, new FlatTuple(var_execution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_execution, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskExecution", "executors")));
      		new Equality(body, var__virtual_0_, var_robot);
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
