package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.CollaborationRangeDimensionsNotCompatibleMatch;
import hu.bme.mdsd.ztz.model.constraints.CollaborationRangeDimensionsNotCompatibleMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.DirectConversionAvailableQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CollaborationRangeDimensionsNotCompatibleMatcher in a type-safe way.
 * 
 * @see CollaborationRangeDimensionsNotCompatibleMatcher
 * @see CollaborationRangeDimensionsNotCompatibleMatch
 * 
 */
@SuppressWarnings("all")
public final class CollaborationRangeDimensionsNotCompatibleQuerySpecification extends BaseGeneratedEMFQuerySpecification<CollaborationRangeDimensionsNotCompatibleMatcher> {
  private CollaborationRangeDimensionsNotCompatibleQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CollaborationRangeDimensionsNotCompatibleQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CollaborationRangeDimensionsNotCompatibleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CollaborationRangeDimensionsNotCompatibleMatcher.on(engine);
  }
  
  @Override
  public CollaborationRangeDimensionsNotCompatibleMatch newEmptyMatch() {
    return CollaborationRangeDimensionsNotCompatibleMatch.newEmptyMatch();
  }
  
  @Override
  public CollaborationRangeDimensionsNotCompatibleMatch newMatch(final Object... parameters) {
    return CollaborationRangeDimensionsNotCompatibleMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Robot) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CollaborationRangeDimensionsNotCompatibleQuerySpecification INSTANCE = make();
    
    public static CollaborationRangeDimensionsNotCompatibleQuerySpecification make() {
      return new CollaborationRangeDimensionsNotCompatibleQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CollaborationRangeDimensionsNotCompatibleQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.collaborationRangeDimensionsNotCompatible";
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
      		PVariable var_robotCollaboration = body.getOrCreateVariableByName("robotCollaboration");
      		PVariable var_dim1 = body.getOrCreateVariableByName("dim1");
      		PVariable var_dcollaborator = body.getOrCreateVariableByName("dcollaborator");
      		PVariable var_dim2 = body.getOrCreateVariableByName("dim2");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_collaborator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_collaborator, "collaborator")
      		));
      		// 	DynamicRobot.collaborations(drobot, robotCollaboration)
      		new TypeConstraint(body, new FlatTuple(var_drobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drobot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "collaborations")));
      		new Equality(body, var__virtual_0_, var_robotCollaboration);
      		// 	DynamicRobot.robot(drobot, robot)
      		new TypeConstraint(body, new FlatTuple(var_drobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_drobot, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_1_, var_robot);
      		// 	Robot.communicationRange.dimension(robot, dim1)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_3_, var_dim1);
      		// 		RobotCollaboration.collaborator(robotCollaboration, dcollaborator)
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration", "collaborator")));
      		new Equality(body, var__virtual_4_, var_dcollaborator);
      		// 	DynamicRobot.robot(dcollaborator, collaborator)
      		new TypeConstraint(body, new FlatTuple(var_dcollaborator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_dcollaborator, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_5_, var_collaborator);
      		// 	Robot.communicationRange.dimension(collaborator, dim2)
      		new TypeConstraint(body, new FlatTuple(var_collaborator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_collaborator, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_6_, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_7_, var_dim2);
      		// 		dim1 != dim2
      		new Inequality(body, var_dim1, var_dim2);
      		// 	neg find directConversionAvailable(dim1, dim2)
      		new NegativePatternCall(body, new FlatTuple(var_dim1, var_dim2), DirectConversionAvailableQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Communication range dimensions of $robot$ and $collaborator$ are not compatible (cannot be directly converted).");
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
