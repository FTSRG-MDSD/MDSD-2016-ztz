package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.NullMeasureConversionValueMatch;
import hu.bme.mdsd.ztz.model.constraints.NullMeasureConversionValueMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NullMeasureConversionValueMatcher in a type-safe way.
 * 
 * @see NullMeasureConversionValueMatcher
 * @see NullMeasureConversionValueMatch
 * 
 */
@SuppressWarnings("all")
public final class NullMeasureConversionValueQuerySpecification extends BaseGeneratedEMFQuerySpecification<NullMeasureConversionValueMatcher> {
  private NullMeasureConversionValueQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NullMeasureConversionValueQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NullMeasureConversionValueMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NullMeasureConversionValueMatcher.on(engine);
  }
  
  @Override
  public NullMeasureConversionValueMatch newEmptyMatch() {
    return NullMeasureConversionValueMatch.newEmptyMatch();
  }
  
  @Override
  public NullMeasureConversionValueMatch newMatch(final Object... parameters) {
    return NullMeasureConversionValueMatch.newMatch((hu.bme.mdsd.ztz.model.drone.MeasureConversion) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static NullMeasureConversionValueQuerySpecification INSTANCE = make();
    
    public static NullMeasureConversionValueQuerySpecification make() {
      return new NullMeasureConversionValueQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NullMeasureConversionValueQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.nullMeasureConversionValue";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("conversion");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("conversion", "hu.bme.mdsd.ztz.model.drone.MeasureConversion"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_conversion = body.getOrCreateVariableByName("conversion");
      		PVariable var_rate = body.getOrCreateVariableByName("rate");
      		new TypeConstraint(body, new FlatTuple(var_conversion), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureConversion")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_conversion, "conversion")
      		));
      		// 	MeasureConversion.rate(conversion, rate)
      		new TypeConstraint(body, new FlatTuple(var_conversion), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureConversion")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_conversion, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "rate")));
      		new Equality(body, var__virtual_0_, var_rate);
      		// 	check (rate == 0.0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern nullMeasureConversionValue";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("rate");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float rate = (java.lang.Float) provider.getValue("rate");
      		                                    return evaluateExpression_1_1(rate);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Conversion rate must not be zero!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "conversion"
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
  
  private static boolean evaluateExpression_1_1(final Float rate) {
    return ((rate).floatValue() == 0.0);
  }
}
