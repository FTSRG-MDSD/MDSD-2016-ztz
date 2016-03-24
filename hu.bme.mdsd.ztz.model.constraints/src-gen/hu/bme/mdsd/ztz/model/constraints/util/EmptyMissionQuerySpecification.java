package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.EmptyMissionMatch;
import hu.bme.mdsd.ztz.model.constraints.EmptyMissionMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.MissionContainsTaskQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EmptyMissionMatcher in a type-safe way.
 * 
 * @see EmptyMissionMatcher
 * @see EmptyMissionMatch
 * 
 */
@SuppressWarnings("all")
public final class EmptyMissionQuerySpecification extends BaseGeneratedEMFQuerySpecification<EmptyMissionMatcher> {
  private EmptyMissionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EmptyMissionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EmptyMissionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EmptyMissionMatcher.on(engine);
  }
  
  @Override
  public EmptyMissionMatch newEmptyMatch() {
    return EmptyMissionMatch.newEmptyMatch();
  }
  
  @Override
  public EmptyMissionMatch newMatch(final Object... parameters) {
    return EmptyMissionMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Mission) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static EmptyMissionQuerySpecification INSTANCE = make();
    
    public static EmptyMissionQuerySpecification make() {
      return new EmptyMissionQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EmptyMissionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.emptyMission";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("mission");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("mission", "hu.bme.mdsd.ztz.model.drone.Mission"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_mission = body.getOrCreateVariableByName("mission");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Mission")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_mission, "mission")
      		));
      		// 	neg find missionContainsTask(mission, _)
      		new NegativePatternCall(body, new FlatTuple(var_mission, var___0_), MissionContainsTaskQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "warning");
      		annotation.addAttribute("message", "$mission$ does not contain any tasks.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "mission"
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
