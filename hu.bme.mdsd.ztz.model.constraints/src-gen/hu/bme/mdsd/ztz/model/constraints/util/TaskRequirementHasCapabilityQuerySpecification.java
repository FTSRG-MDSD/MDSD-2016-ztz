package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.TaskRequirementHasCapabilityMatch;
import hu.bme.mdsd.ztz.model.constraints.TaskRequirementHasCapabilityMatcher;
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
 * A pattern-specific query specification that can instantiate TaskRequirementHasCapabilityMatcher in a type-safe way.
 * 
 * @see TaskRequirementHasCapabilityMatcher
 * @see TaskRequirementHasCapabilityMatch
 * 
 */
@SuppressWarnings("all")
public final class TaskRequirementHasCapabilityQuerySpecification extends BaseGeneratedEMFQuerySpecification<TaskRequirementHasCapabilityMatcher> {
  private TaskRequirementHasCapabilityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TaskRequirementHasCapabilityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TaskRequirementHasCapabilityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TaskRequirementHasCapabilityMatcher.on(engine);
  }
  
  @Override
  public TaskRequirementHasCapabilityMatch newEmptyMatch() {
    return TaskRequirementHasCapabilityMatch.newEmptyMatch();
  }
  
  @Override
  public TaskRequirementHasCapabilityMatch newMatch(final Object... parameters) {
    return TaskRequirementHasCapabilityMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) parameters[0], (hu.bme.mdsd.ztz.model.drone.Capability) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TaskRequirementHasCapabilityQuerySpecification INSTANCE = make();
    
    public static TaskRequirementHasCapabilityQuerySpecification make() {
      return new TaskRequirementHasCapabilityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TaskRequirementHasCapabilityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.taskRequirementHasCapability";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("requirement","capability");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("requirement", "hu.bme.mdsd.ztz.model.behaviour.TaskRequirement"),new PParameter("capability", "hu.bme.mdsd.ztz.model.drone.Capability"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_requirement = body.getOrCreateVariableByName("requirement");
      		PVariable var_capability = body.getOrCreateVariableByName("capability");
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		new TypeConstraint(body, new FlatTuple(var_capability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Capability")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_requirement, "requirement"),
      		   new ExportedParameter(body, var_capability, "capability")
      		));
      		// 	TaskRequirement.requiredCapabilities(requirement, capability)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "requiredCapabilities")));
      		new Equality(body, var__virtual_0_, var_capability);
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
