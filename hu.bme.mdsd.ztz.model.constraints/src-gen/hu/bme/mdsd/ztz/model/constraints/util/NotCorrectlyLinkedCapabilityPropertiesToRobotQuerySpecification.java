package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRobotMatch;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasCapabilityQuerySpecification;
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
 * A pattern-specific query specification that can instantiate NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher in a type-safe way.
 * 
 * @see NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher
 * @see NotCorrectlyLinkedCapabilityPropertiesToRobotMatch
 * 
 */
@SuppressWarnings("all")
public final class NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification extends BaseGeneratedEMFQuerySpecification<NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher> {
  private NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher.on(engine);
  }
  
  @Override
  public NotCorrectlyLinkedCapabilityPropertiesToRobotMatch newEmptyMatch() {
    return NotCorrectlyLinkedCapabilityPropertiesToRobotMatch.newEmptyMatch();
  }
  
  @Override
  public NotCorrectlyLinkedCapabilityPropertiesToRobotMatch newMatch(final Object... parameters) {
    return NotCorrectlyLinkedCapabilityPropertiesToRobotMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Capability) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification INSTANCE = make();
    
    public static NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification make() {
      return new NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.notCorrectlyLinkedCapabilityPropertiesToRobot";
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
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_capability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Capability")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_capability, "capability")
      		));
      		// 	Robot.capabilityProperties.capability(robot, capability)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "capabilityProperties")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "CapabilityProperties", "capability")));
      		new Equality(body, var__virtual_1_, var_capability);
      		// 	neg find robotHasCapability(robot, capability)
      		new NegativePatternCall(body, new FlatTuple(var_robot, var_capability), RobotHasCapabilityQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$robot$ has capability properties for unlinked capability ($capability$).");
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
