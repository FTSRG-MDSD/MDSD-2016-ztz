package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.SameMeasureMatch;
import hu.bme.mdsd.ztz.model.constraints.SameMeasureMatcher;
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
 * A pattern-specific query specification that can instantiate SameMeasureMatcher in a type-safe way.
 * 
 * @see SameMeasureMatcher
 * @see SameMeasureMatch
 * 
 */
@SuppressWarnings("all")
public final class SameMeasureQuerySpecification extends BaseGeneratedEMFQuerySpecification<SameMeasureMatcher> {
  private SameMeasureQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SameMeasureQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SameMeasureMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SameMeasureMatcher.on(engine);
  }
  
  @Override
  public SameMeasureMatch newEmptyMatch() {
    return SameMeasureMatch.newEmptyMatch();
  }
  
  @Override
  public SameMeasureMatch newMatch(final Object... parameters) {
    return SameMeasureMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) parameters[0], (hu.bme.mdsd.ztz.model.drone.MeasureDimension) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SameMeasureQuerySpecification INSTANCE = make();
    
    public static SameMeasureQuerySpecification make() {
      return new SameMeasureQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SameMeasureQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.sameMeasure";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("measure","convertedMeasure");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("measure", "hu.bme.mdsd.ztz.model.drone.MeasureDimension"),new PParameter("convertedMeasure", "hu.bme.mdsd.ztz.model.drone.MeasureDimension"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_measure = body.getOrCreateVariableByName("measure");
      		PVariable var_convertedMeasure = body.getOrCreateVariableByName("convertedMeasure");
      		new TypeConstraint(body, new FlatTuple(var_measure), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		new TypeConstraint(body, new FlatTuple(var_convertedMeasure), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_measure, "measure"),
      		   new ExportedParameter(body, var_convertedMeasure, "convertedMeasure")
      		));
      		// 	MeasureDimension.conversions.dimension(measure, convertedMeasure)
      		new TypeConstraint(body, new FlatTuple(var_measure), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_measure, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureDimension", "conversions")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "dimension")));
      		new Equality(body, var__virtual_1_, var_convertedMeasure);
      		// 	convertedMeasure == measure
      		new Equality(body, var_convertedMeasure, var_measure);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "$measure$ has the same converted measure!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "measure"
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
