package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.TaskRequirementHasCapabilityQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher in a type-safe way.
 * 
 * @see NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher
 * @see NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch
 * 
 */
@SuppressWarnings("all")
public final class NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification extends BaseGeneratedEMFQuerySpecification<NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher> {
  private NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher.on(engine);
  }
  
  @Override
  public NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch newEmptyMatch() {
    return NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch.newEmptyMatch();
  }
  
  @Override
  public NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch newMatch(final Object... parameters) {
    return NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) parameters[0], (hu.bme.mdsd.ztz.model.drone.Capability) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification INSTANCE = make();
    
    public static NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification make() {
      return new NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.notCorrectlyLinkedCapabilityPropertiesToRequirement";
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
      		// 	TaskRequirement.capabilityProperties.capability(requirement, capability)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "capabilityProperties")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "CapabilityProperties", "capability")));
      		new Equality(body, var__virtual_1_, var_capability);
      		// 	neg find taskRequirementHasCapability(requirement, capability)
      		new NegativePatternCall(body, new FlatTuple(var_requirement, var_capability), TaskRequirementHasCapabilityQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$requirement$ has capability properties for unlinked capability ($capability$).");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "requirement", 
      		                "capability"
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
