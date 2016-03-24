package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.MultipleCapabilityPropertiesMatch;
import hu.bme.mdsd.ztz.model.constraints.MultipleCapabilityPropertiesMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MultipleCapabilityPropertiesMatcher in a type-safe way.
 * 
 * @see MultipleCapabilityPropertiesMatcher
 * @see MultipleCapabilityPropertiesMatch
 * 
 */
@SuppressWarnings("all")
public final class MultipleCapabilityPropertiesQuerySpecification extends BaseGeneratedEMFQuerySpecification<MultipleCapabilityPropertiesMatcher> {
  private MultipleCapabilityPropertiesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MultipleCapabilityPropertiesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MultipleCapabilityPropertiesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MultipleCapabilityPropertiesMatcher.on(engine);
  }
  
  @Override
  public MultipleCapabilityPropertiesMatch newEmptyMatch() {
    return MultipleCapabilityPropertiesMatch.newEmptyMatch();
  }
  
  @Override
  public MultipleCapabilityPropertiesMatch newMatch(final Object... parameters) {
    return MultipleCapabilityPropertiesMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Capability) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MultipleCapabilityPropertiesQuerySpecification INSTANCE = make();
    
    public static MultipleCapabilityPropertiesQuerySpecification make() {
      return new MultipleCapabilityPropertiesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MultipleCapabilityPropertiesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.multipleCapabilityProperties";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","capability");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.drone.Robot"),new PParameter("capability", "hu.bme.mdsd.ztz.model.drone.Capability"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_capability = body.getOrCreateVariableByName("capability");
      		PVariable var_capProp1 = body.getOrCreateVariableByName("capProp1");
      		PVariable var_capProp2 = body.getOrCreateVariableByName("capProp2");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_capability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Capability")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_capability, "capability")
      		));
      		// 	Robot.capabilityProperties(robot, capProp1)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "capabilityProperties")));
      		new Equality(body, var__virtual_0_, var_capProp1);
      		// 	CapabilityProperties.capability(capProp1, capability)
      		new TypeConstraint(body, new FlatTuple(var_capProp1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "CapabilityProperties")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_capProp1, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "CapabilityProperties", "capability")));
      		new Equality(body, var__virtual_1_, var_capability);
      		// 	Robot.capabilityProperties(robot, capProp2)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "capabilityProperties")));
      		new Equality(body, var__virtual_2_, var_capProp2);
      		// 	CapabilityProperties.capability(capProp2, capability)
      		new TypeConstraint(body, new FlatTuple(var_capProp2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "CapabilityProperties")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_capProp2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "CapabilityProperties", "capability")));
      		new Equality(body, var__virtual_3_, var_capability);
      		// 		capProp1 != capProp2
      		new Inequality(body, var_capProp1, var_capProp2);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Capability properties for $capability$ are multiply defined in $robot$.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "robot", 
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
