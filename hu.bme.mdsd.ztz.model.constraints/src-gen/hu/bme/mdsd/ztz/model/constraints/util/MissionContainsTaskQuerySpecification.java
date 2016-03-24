package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.MissionContainsTaskMatch;
import hu.bme.mdsd.ztz.model.constraints.MissionContainsTaskMatcher;
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
 * A pattern-specific query specification that can instantiate MissionContainsTaskMatcher in a type-safe way.
 * 
 * @see MissionContainsTaskMatcher
 * @see MissionContainsTaskMatch
 * 
 */
@SuppressWarnings("all")
public final class MissionContainsTaskQuerySpecification extends BaseGeneratedEMFQuerySpecification<MissionContainsTaskMatcher> {
  private MissionContainsTaskQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MissionContainsTaskQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MissionContainsTaskMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MissionContainsTaskMatcher.on(engine);
  }
  
  @Override
  public MissionContainsTaskMatch newEmptyMatch() {
    return MissionContainsTaskMatch.newEmptyMatch();
  }
  
  @Override
  public MissionContainsTaskMatch newMatch(final Object... parameters) {
    return MissionContainsTaskMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Mission) parameters[0], (hu.bme.mdsd.ztz.model.drone.Task) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MissionContainsTaskQuerySpecification INSTANCE = make();
    
    public static MissionContainsTaskQuerySpecification make() {
      return new MissionContainsTaskQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MissionContainsTaskQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.missionContainsTask";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("mission","task");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("mission", "hu.bme.mdsd.ztz.model.drone.Mission"),new PParameter("task", "hu.bme.mdsd.ztz.model.drone.Task"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_mission = body.getOrCreateVariableByName("mission");
      		PVariable var_task = body.getOrCreateVariableByName("task");
      		new TypeConstraint(body, new FlatTuple(var_mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Mission")));
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_mission, "mission"),
      		   new ExportedParameter(body, var_task, "task")
      		));
      		// 	Mission.tasks(mission, task)
      		new TypeConstraint(body, new FlatTuple(var_mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Mission")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_mission, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Mission", "tasks")));
      		new Equality(body, var__virtual_0_, var_task);
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
