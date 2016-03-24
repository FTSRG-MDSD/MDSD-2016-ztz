package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.CollaborationBetweenDynamicRobotsMatch;
import hu.bme.mdsd.ztz.model.constraints.CollaborationBetweenDynamicRobotsMatcher;
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
 * A pattern-specific query specification that can instantiate CollaborationBetweenDynamicRobotsMatcher in a type-safe way.
 * 
 * @see CollaborationBetweenDynamicRobotsMatcher
 * @see CollaborationBetweenDynamicRobotsMatch
 * 
 */
@SuppressWarnings("all")
public final class CollaborationBetweenDynamicRobotsQuerySpecification extends BaseGeneratedEMFQuerySpecification<CollaborationBetweenDynamicRobotsMatcher> {
  private CollaborationBetweenDynamicRobotsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CollaborationBetweenDynamicRobotsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CollaborationBetweenDynamicRobotsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CollaborationBetweenDynamicRobotsMatcher.on(engine);
  }
  
  @Override
  public CollaborationBetweenDynamicRobotsMatch newEmptyMatch() {
    return CollaborationBetweenDynamicRobotsMatch.newEmptyMatch();
  }
  
  @Override
  public CollaborationBetweenDynamicRobotsMatch newMatch(final Object... parameters) {
    return CollaborationBetweenDynamicRobotsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CollaborationBetweenDynamicRobotsQuerySpecification INSTANCE = make();
    
    public static CollaborationBetweenDynamicRobotsQuerySpecification make() {
      return new CollaborationBetweenDynamicRobotsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CollaborationBetweenDynamicRobotsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.collaborationBetweenDynamicRobots";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("drobot","dcollaborator");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("drobot", "hu.bme.mdsd.ztz.model.behaviour.DynamicRobot"),new PParameter("dcollaborator", "hu.bme.mdsd.ztz.model.behaviour.DynamicRobot"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_drobot = body.getOrCreateVariableByName("drobot");
      		PVariable var_dcollaborator = body.getOrCreateVariableByName("dcollaborator");
      		PVariable var_robotCollaboration = body.getOrCreateVariableByName("robotCollaboration");
      		new TypeConstraint(body, new FlatTuple(var_drobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		new TypeConstraint(body, new FlatTuple(var_dcollaborator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drobot, "drobot"),
      		   new ExportedParameter(body, var_dcollaborator, "dcollaborator")
      		));
      		// 	DynamicRobot.collaborations(drobot, robotCollaboration)
      		new TypeConstraint(body, new FlatTuple(var_drobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drobot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "collaborations")));
      		new Equality(body, var__virtual_0_, var_robotCollaboration);
      		// 	RobotCollaboration.collaborator(robotCollaboration, dcollaborator)
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration", "collaborator")));
      		new Equality(body, var__virtual_1_, var_dcollaborator);
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
