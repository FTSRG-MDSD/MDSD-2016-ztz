package hu.bme.mdsd.ztz.model.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.derived.AvailabilityRangeMatch;
import hu.bme.mdsd.ztz.model.derived.AvailabilityRangeMatcher;
import hu.bme.mdsd.ztz.model.derived.util.MinMeasureQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AvailabilityRangeMatcher in a type-safe way.
 * 
 * @see AvailabilityRangeMatcher
 * @see AvailabilityRangeMatch
 * 
 */
@SuppressWarnings("all")
public final class AvailabilityRangeQuerySpecification extends BaseGeneratedEMFQuerySpecification<AvailabilityRangeMatcher> {
  private AvailabilityRangeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AvailabilityRangeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AvailabilityRangeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AvailabilityRangeMatcher.on(engine);
  }
  
  @Override
  public AvailabilityRangeMatch newEmptyMatch() {
    return AvailabilityRangeMatch.newEmptyMatch();
  }
  
  @Override
  public AvailabilityRangeMatch newMatch(final Object... parameters) {
    return AvailabilityRangeMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration) parameters[0], (hu.bme.mdsd.ztz.model.drone.MeasureValue) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static AvailabilityRangeQuerySpecification INSTANCE = make();
    
    public static AvailabilityRangeQuerySpecification make() {
      return new AvailabilityRangeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AvailabilityRangeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.derived.availabilityRange";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robotCollaboration","minimumRange");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robotCollaboration", "hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration"),new PParameter("minimumRange", "hu.bme.mdsd.ztz.model.drone.MeasureValue"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robotCollaboration = body.getOrCreateVariableByName("robotCollaboration");
      		PVariable var_minimumRange = body.getOrCreateVariableByName("minimumRange");
      		PVariable var_dynRobot = body.getOrCreateVariableByName("dynRobot");
      		PVariable var_dynCooperator = body.getOrCreateVariableByName("dynCooperator");
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_cooperator = body.getOrCreateVariableByName("cooperator");
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration")));
      		new TypeConstraint(body, new FlatTuple(var_minimumRange), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robotCollaboration, "robotCollaboration"),
      		   new ExportedParameter(body, var_minimumRange, "minimumRange")
      		));
      		// 	DynamicRobot.collaborations(dynRobot, robotCollaboration)
      		new TypeConstraint(body, new FlatTuple(var_dynRobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_dynRobot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "collaborations")));
      		new Equality(body, var__virtual_0_, var_robotCollaboration);
      		// 	RobotCollaboration.collaborator(robotCollaboration, dynCooperator)
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration", "collaborator")));
      		new Equality(body, var__virtual_1_, var_dynCooperator);
      		// 	DynamicRobot.robot(dynRobot, robot)
      		new TypeConstraint(body, new FlatTuple(var_dynRobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_dynRobot, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_2_, var_robot);
      		// 	DynamicRobot.robot(dynCooperator, cooperator)
      		new TypeConstraint(body, new FlatTuple(var_dynCooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_dynCooperator, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_3_, var_cooperator);
      		// 		find minMeasure(robot, cooperator, minimumRange)
      		new PositivePatternCall(body, new FlatTuple(var_robot, var_cooperator, var_minimumRange), MinMeasureQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_robotCollaboration = body.getOrCreateVariableByName("robotCollaboration");
      		PVariable var_minimumRange = body.getOrCreateVariableByName("minimumRange");
      		PVariable var_dynRobot = body.getOrCreateVariableByName("dynRobot");
      		PVariable var_dynCooperator = body.getOrCreateVariableByName("dynCooperator");
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_cooperator = body.getOrCreateVariableByName("cooperator");
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration")));
      		new TypeConstraint(body, new FlatTuple(var_minimumRange), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robotCollaboration, "robotCollaboration"),
      		   new ExportedParameter(body, var_minimumRange, "minimumRange")
      		));
      		// 	DynamicRobot.collaborations(dynRobot, robotCollaboration)
      		new TypeConstraint(body, new FlatTuple(var_dynRobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_dynRobot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "collaborations")));
      		new Equality(body, var__virtual_0_, var_robotCollaboration);
      		// 	RobotCollaboration.collaborator(robotCollaboration, dynCooperator)
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_robotCollaboration, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "RobotCollaboration", "collaborator")));
      		new Equality(body, var__virtual_1_, var_dynCooperator);
      		// 	DynamicRobot.robot(dynRobot, robot)
      		new TypeConstraint(body, new FlatTuple(var_dynRobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_dynRobot, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_2_, var_robot);
      		// 	DynamicRobot.robot(dynCooperator, cooperator)
      		new TypeConstraint(body, new FlatTuple(var_dynCooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_dynCooperator, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "robot")));
      		new Equality(body, var__virtual_3_, var_cooperator);
      		// 		find minMeasure(cooperator, robot, minimumRange)
      		new PositivePatternCall(body, new FlatTuple(var_cooperator, var_robot, var_minimumRange), MinMeasureQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
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
