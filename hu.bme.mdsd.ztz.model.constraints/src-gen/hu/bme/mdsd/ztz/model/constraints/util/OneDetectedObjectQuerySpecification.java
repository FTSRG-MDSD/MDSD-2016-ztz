package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.OneDetectedObjectMatch;
import hu.bme.mdsd.ztz.model.constraints.OneDetectedObjectMatcher;
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
 * A pattern-specific query specification that can instantiate OneDetectedObjectMatcher in a type-safe way.
 * 
 * @see OneDetectedObjectMatcher
 * @see OneDetectedObjectMatch
 * 
 */
@SuppressWarnings("all")
public final class OneDetectedObjectQuerySpecification extends BaseGeneratedEMFQuerySpecification<OneDetectedObjectMatcher> {
  private OneDetectedObjectQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static OneDetectedObjectQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected OneDetectedObjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return OneDetectedObjectMatcher.on(engine);
  }
  
  @Override
  public OneDetectedObjectMatch newEmptyMatch() {
    return OneDetectedObjectMatch.newEmptyMatch();
  }
  
  @Override
  public OneDetectedObjectMatch newMatch(final Object... parameters) {
    return OneDetectedObjectMatch.newMatch((hu.bme.mdsd.ztz.model.drone.AreaObject) parameters[0], (hu.bme.mdsd.ztz.model.drone.DetectedObject) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static OneDetectedObjectQuerySpecification INSTANCE = make();
    
    public static OneDetectedObjectQuerySpecification make() {
      return new OneDetectedObjectQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static OneDetectedObjectQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.oneDetectedObject";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("object","detected1");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("object", "hu.bme.mdsd.ztz.model.drone.AreaObject"),new PParameter("detected1", "hu.bme.mdsd.ztz.model.drone.DetectedObject"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_object = body.getOrCreateVariableByName("object");
      		PVariable var_detected1 = body.getOrCreateVariableByName("detected1");
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_detected2 = body.getOrCreateVariableByName("detected2");
      		new TypeConstraint(body, new FlatTuple(var_object), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "AreaObject")));
      		new TypeConstraint(body, new FlatTuple(var_detected1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "DetectedObject")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_object, "object"),
      		   new ExportedParameter(body, var_detected1, "detected1")
      		));
      		// 	Robot.detectedObjects(robot, detected1)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "detectedObjects")));
      		new Equality(body, var__virtual_0_, var_detected1);
      		// 	Robot.detectedObjects(robot, detected2)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "detectedObjects")));
      		new Equality(body, var__virtual_1_, var_detected2);
      		// 	detected1 != detected2
      		new Inequality(body, var_detected1, var_detected2);
      		// 	DetectedObject.object(detected1, object)
      		new TypeConstraint(body, new FlatTuple(var_detected1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "DetectedObject")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_detected1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "DetectedObject", "object")));
      		new Equality(body, var__virtual_2_, var_object);
      		// 	DetectedObject.object(detected2, object)
      		new TypeConstraint(body, new FlatTuple(var_detected2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "DetectedObject")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_detected2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "DetectedObject", "object")));
      		new Equality(body, var__virtual_3_, var_object);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$object$ is detected more than once by the same robot!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "detected1", 
      		                "object"
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
