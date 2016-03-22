package hu.bme.mdsd.ztz.model.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.derived.EstimatedTimeMatch;
import hu.bme.mdsd.ztz.model.derived.EstimatedTimeMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate EstimatedTimeMatcher in a type-safe way.
 * 
 * @see EstimatedTimeMatcher
 * @see EstimatedTimeMatch
 * 
 */
@SuppressWarnings("all")
public final class EstimatedTimeQuerySpecification extends BaseGeneratedEMFQuerySpecification<EstimatedTimeMatcher> {
  private EstimatedTimeQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EstimatedTimeQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected EstimatedTimeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EstimatedTimeMatcher.on(engine);
  }
  
  @Override
  public EstimatedTimeMatch newEmptyMatch() {
    return EstimatedTimeMatch.newEmptyMatch();
  }
  
  @Override
  public EstimatedTimeMatch newMatch(final Object... parameters) {
    return EstimatedTimeMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Task) parameters[0], (hu.bme.mdsd.ztz.model.drone.MeasureValue) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static EstimatedTimeQuerySpecification INSTANCE = make();
    
    public static EstimatedTimeQuerySpecification make() {
      return new EstimatedTimeQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EstimatedTimeQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.derived.estimatedTime";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sourceTask","targetMeasure");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sourceTask", "hu.bme.mdsd.ztz.model.drone.Task"),new PParameter("targetMeasure", "hu.bme.mdsd.ztz.model.drone.MeasureValue"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_sourceTask = body.getOrCreateVariableByName("sourceTask");
      		PVariable var_targetMeasure = body.getOrCreateVariableByName("targetMeasure");
      		new TypeConstraint(body, new FlatTuple(var_sourceTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		new TypeConstraint(body, new FlatTuple(var_targetMeasure), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_sourceTask, "sourceTask"),
      		   new ExportedParameter(body, var_targetMeasure, "targetMeasure")
      		));
      		// 	Task.execution.executionTime(sourceTask, targetMeasure)
      		new TypeConstraint(body, new FlatTuple(var_sourceTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_sourceTask, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "execution")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "TaskExecution", "executionTime")));
      		new Equality(body, var__virtual_1_, var_targetMeasure);
      		// 	Task.estimatedTime(sourceTask, targetMeasure)
      		new TypeConstraint(body, new FlatTuple(var_sourceTask), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_sourceTask, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "estimatedTime")));
      		new Equality(body, var__virtual_2_, var_targetMeasure);
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
