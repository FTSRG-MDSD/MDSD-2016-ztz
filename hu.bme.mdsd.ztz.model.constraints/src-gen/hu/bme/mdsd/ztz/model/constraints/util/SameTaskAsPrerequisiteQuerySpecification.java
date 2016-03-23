package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.SameTaskAsPrerequisiteMatch;
import hu.bme.mdsd.ztz.model.constraints.SameTaskAsPrerequisiteMatcher;
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
 * A pattern-specific query specification that can instantiate SameTaskAsPrerequisiteMatcher in a type-safe way.
 * 
 * @see SameTaskAsPrerequisiteMatcher
 * @see SameTaskAsPrerequisiteMatch
 * 
 */
@SuppressWarnings("all")
public final class SameTaskAsPrerequisiteQuerySpecification extends BaseGeneratedEMFQuerySpecification<SameTaskAsPrerequisiteMatcher> {
  private SameTaskAsPrerequisiteQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SameTaskAsPrerequisiteQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SameTaskAsPrerequisiteMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SameTaskAsPrerequisiteMatcher.on(engine);
  }
  
  @Override
  public SameTaskAsPrerequisiteMatch newEmptyMatch() {
    return SameTaskAsPrerequisiteMatch.newEmptyMatch();
  }
  
  @Override
  public SameTaskAsPrerequisiteMatch newMatch(final Object... parameters) {
    return SameTaskAsPrerequisiteMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SameTaskAsPrerequisiteQuerySpecification INSTANCE = make();
    
    public static SameTaskAsPrerequisiteQuerySpecification make() {
      return new SameTaskAsPrerequisiteQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SameTaskAsPrerequisiteQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.sameTaskAsPrerequisite";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("taskRequirement","taskExecution");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("taskRequirement", "hu.bme.mdsd.ztz.model.behaviour.TaskRequirement"),new PParameter("taskExecution", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_taskRequirement = body.getOrCreateVariableByName("taskRequirement");
      		PVariable var_taskExecution = body.getOrCreateVariableByName("taskExecution");
      		new TypeConstraint(body, new FlatTuple(var_taskRequirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_taskRequirement, "taskRequirement"),
      		   new ExportedParameter(body, var_taskExecution, "taskExecution")
      		));
      		// 	TaskRequirement.prerequisite(taskRequirement, taskExecution)
      		new TypeConstraint(body, new FlatTuple(var_taskRequirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_taskRequirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "prerequisite")));
      		new Equality(body, var__virtual_0_, var_taskExecution);
      		// 	TaskRequirement.taskExecution(taskRequirement, taskExecution)
      		new TypeConstraint(body, new FlatTuple(var_taskRequirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_taskRequirement, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "taskExecution")));
      		new Equality(body, var__virtual_1_, var_taskExecution);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "The prerequisite task of $taskExecution$ is the same!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "taskExecution", 
      		                "taskRequirement"
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
