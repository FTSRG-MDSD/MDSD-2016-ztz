package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.CollaborationNotSymmetricMatch;
import hu.bme.mdsd.ztz.model.constraints.CollaborationNotSymmetricMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.CollaborationBetweenDynamicRobotsQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CollaborationNotSymmetricMatcher in a type-safe way.
 * 
 * @see CollaborationNotSymmetricMatcher
 * @see CollaborationNotSymmetricMatch
 * 
 */
@SuppressWarnings("all")
public final class CollaborationNotSymmetricQuerySpecification extends BaseGeneratedEMFQuerySpecification<CollaborationNotSymmetricMatcher> {
  private CollaborationNotSymmetricQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CollaborationNotSymmetricQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CollaborationNotSymmetricMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CollaborationNotSymmetricMatcher.on(engine);
  }
  
  @Override
  public CollaborationNotSymmetricMatch newEmptyMatch() {
    return CollaborationNotSymmetricMatch.newEmptyMatch();
  }
  
  @Override
  public CollaborationNotSymmetricMatch newMatch(final Object... parameters) {
    return CollaborationNotSymmetricMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Robot) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CollaborationNotSymmetricQuerySpecification INSTANCE = make();
    
    public static CollaborationNotSymmetricQuerySpecification make() {
      return new CollaborationNotSymmetricQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CollaborationNotSymmetricQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.collaborationNotSymmetric";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","collaborator");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.drone.Robot"),new PParameter("collaborator", "hu.bme.mdsd.ztz.model.drone.Robot"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_collaborator = body.getOrCreateVariableByName("collaborator");
      		PVariable var_drobot = body.getOrCreateVariableByName("drobot");
      		PVariable var_dcollaborator = body.getOrCreateVariableByName("dcollaborator");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_collaborator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_collaborator, "collaborator")
      		));
      		// 	DynamicRobot.robot(drobot, robot)
      		new TypeConstraint(body, new FlatTuple(var_drobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drobot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_0_, var_robot);
      		// 	DynamicRobot.robot(dcollaborator, collaborator)
      		new TypeConstraint(body, new FlatTuple(var_dcollaborator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_dcollaborator, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_1_, var_collaborator);
      		// 		find collaborationBetweenDynamicRobots(drobot, dcollaborator)
      		new PositivePatternCall(body, new FlatTuple(var_drobot, var_dcollaborator), CollaborationBetweenDynamicRobotsQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	neg find collaborationBetweenDynamicRobots(dcollaborator, drobot)
      		new NegativePatternCall(body, new FlatTuple(var_dcollaborator, var_drobot), CollaborationBetweenDynamicRobotsQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Collaboration between $robot$ and $collaborator$ is not symmetric.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "robot", 
      		                "collaborator"
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
