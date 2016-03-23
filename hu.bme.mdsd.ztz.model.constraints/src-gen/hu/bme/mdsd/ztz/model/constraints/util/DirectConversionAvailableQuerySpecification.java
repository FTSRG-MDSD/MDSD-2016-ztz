package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.DirectConversionAvailableMatch;
import hu.bme.mdsd.ztz.model.constraints.DirectConversionAvailableMatcher;
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
 * A pattern-specific query specification that can instantiate DirectConversionAvailableMatcher in a type-safe way.
 * 
 * @see DirectConversionAvailableMatcher
 * @see DirectConversionAvailableMatch
 * 
 */
@SuppressWarnings("all")
public final class DirectConversionAvailableQuerySpecification extends BaseGeneratedEMFQuerySpecification<DirectConversionAvailableMatcher> {
  private DirectConversionAvailableQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DirectConversionAvailableQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DirectConversionAvailableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DirectConversionAvailableMatcher.on(engine);
  }
  
  @Override
  public DirectConversionAvailableMatch newEmptyMatch() {
    return DirectConversionAvailableMatch.newEmptyMatch();
  }
  
  @Override
  public DirectConversionAvailableMatch newMatch(final Object... parameters) {
    return DirectConversionAvailableMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) parameters[0], (hu.bme.mdsd.ztz.model.drone.MeasureDimension) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static DirectConversionAvailableQuerySpecification INSTANCE = make();
    
    public static DirectConversionAvailableQuerySpecification make() {
      return new DirectConversionAvailableQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DirectConversionAvailableQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.directConversionAvailable";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("dim1","dim2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("dim1", "hu.bme.mdsd.ztz.model.drone.MeasureDimension"),new PParameter("dim2", "hu.bme.mdsd.ztz.model.drone.MeasureDimension"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_dim1 = body.getOrCreateVariableByName("dim1");
      		PVariable var_dim2 = body.getOrCreateVariableByName("dim2");
      		new TypeConstraint(body, new FlatTuple(var_dim1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		new TypeConstraint(body, new FlatTuple(var_dim2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_dim1, "dim1"),
      		   new ExportedParameter(body, var_dim2, "dim2")
      		));
      		// 	MeasureDimension.conversions.dimension(dim1, dim2)
      		new TypeConstraint(body, new FlatTuple(var_dim1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_dim1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureDimension", "conversions")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "dimension")));
      		new Equality(body, var__virtual_1_, var_dim2);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_dim1 = body.getOrCreateVariableByName("dim1");
      		PVariable var_dim2 = body.getOrCreateVariableByName("dim2");
      		new TypeConstraint(body, new FlatTuple(var_dim1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		new TypeConstraint(body, new FlatTuple(var_dim2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_dim1, "dim1"),
      		   new ExportedParameter(body, var_dim2, "dim2")
      		));
      		// 	MeasureDimension.conversions.dimension(dim2, dim1)
      		new TypeConstraint(body, new FlatTuple(var_dim2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_dim2, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureDimension", "conversions")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "dimension")));
      		new Equality(body, var__virtual_1_, var_dim1);
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
