package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.ConversionAvailableMatch;
import hu.bme.mdsd.ztz.model.constraints.ConversionAvailableMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.DirectConversionAvailableQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ConversionAvailableMatcher in a type-safe way.
 * 
 * @see ConversionAvailableMatcher
 * @see ConversionAvailableMatch
 * 
 */
@SuppressWarnings("all")
public final class ConversionAvailableQuerySpecification extends BaseGeneratedEMFQuerySpecification<ConversionAvailableMatcher> {
  private ConversionAvailableQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ConversionAvailableQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConversionAvailableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ConversionAvailableMatcher.on(engine);
  }
  
  @Override
  public ConversionAvailableMatch newEmptyMatch() {
    return ConversionAvailableMatch.newEmptyMatch();
  }
  
  @Override
  public ConversionAvailableMatch newMatch(final Object... parameters) {
    return ConversionAvailableMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureDimension) parameters[0], (hu.bme.mdsd.ztz.model.drone.MeasureDimension) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ConversionAvailableQuerySpecification INSTANCE = make();
    
    public static ConversionAvailableQuerySpecification make() {
      return new ConversionAvailableQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ConversionAvailableQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.conversionAvailable";
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
      		// 	find directConversionAvailable+(dim1, dim2)
      		new BinaryTransitiveClosure(body, new FlatTuple(var_dim1, var_dim2), DirectConversionAvailableQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	dim1 != dim2
      		new Inequality(body, var_dim1, var_dim2);
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
