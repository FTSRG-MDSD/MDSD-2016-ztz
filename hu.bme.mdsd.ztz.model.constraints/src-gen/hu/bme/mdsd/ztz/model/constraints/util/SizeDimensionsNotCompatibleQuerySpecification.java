package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsNotCompatibleMatch;
import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsNotCompatibleMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.ConversionAvailableQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SizeDimensionsDifferQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SizeDimensionsNotCompatibleMatcher in a type-safe way.
 * 
 * @see SizeDimensionsNotCompatibleMatcher
 * @see SizeDimensionsNotCompatibleMatch
 * 
 */
@SuppressWarnings("all")
public final class SizeDimensionsNotCompatibleQuerySpecification extends BaseGeneratedEMFQuerySpecification<SizeDimensionsNotCompatibleMatcher> {
  private SizeDimensionsNotCompatibleQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SizeDimensionsNotCompatibleQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SizeDimensionsNotCompatibleMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SizeDimensionsNotCompatibleMatcher.on(engine);
  }
  
  @Override
  public SizeDimensionsNotCompatibleMatch newEmptyMatch() {
    return SizeDimensionsNotCompatibleMatch.newEmptyMatch();
  }
  
  @Override
  public SizeDimensionsNotCompatibleMatch newMatch(final Object... parameters) {
    return SizeDimensionsNotCompatibleMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Size) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SizeDimensionsNotCompatibleQuerySpecification INSTANCE = make();
    
    public static SizeDimensionsNotCompatibleQuerySpecification make() {
      return new SizeDimensionsNotCompatibleQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SizeDimensionsNotCompatibleQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.sizeDimensionsNotCompatible";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","size");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.drone.Robot"),new PParameter("size", "hu.bme.mdsd.ztz.model.drone.Size"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_size = body.getOrCreateVariableByName("size");
      		PVariable var_heightDim = body.getOrCreateVariableByName("heightDim");
      		PVariable var_lengthDim = body.getOrCreateVariableByName("lengthDim");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_size, "size")
      		));
      		// 	find sizeDimensionsDiffer(robot, size)
      		new PositivePatternCall(body, new FlatTuple(var_robot, var_size), SizeDimensionsDifferQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Size.height.dimension(size, heightDim)
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_size, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Size", "height")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_1_, var_heightDim);
      		// 	Size.length.dimension(size, lengthDim)
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_size, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Size", "length")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_3_, var_lengthDim);
      		// 	heightDim != lengthDim
      		new Inequality(body, var_heightDim, var_lengthDim);
      		// 	neg find conversionAvailable(heightDim, lengthDim)
      		new NegativePatternCall(body, new FlatTuple(var_heightDim, var_lengthDim), ConversionAvailableQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_size = body.getOrCreateVariableByName("size");
      		PVariable var_heightDim = body.getOrCreateVariableByName("heightDim");
      		PVariable var_widthDim = body.getOrCreateVariableByName("widthDim");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_size, "size")
      		));
      		// 	find sizeDimensionsDiffer(robot, size)
      		new PositivePatternCall(body, new FlatTuple(var_robot, var_size), SizeDimensionsDifferQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Size.height.dimension(size, heightDim)
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_size, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Size", "height")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_1_, var_heightDim);
      		// 	Size.width.dimension(size, widthDim)
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_size, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Size", "width")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_3_, var_widthDim);
      		// 	heightDim != widthDim
      		new Inequality(body, var_heightDim, var_widthDim);
      		// 	neg find conversionAvailable(heightDim, widthDim)
      		new NegativePatternCall(body, new FlatTuple(var_heightDim, var_widthDim), ConversionAvailableQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_size = body.getOrCreateVariableByName("size");
      		PVariable var_lengthDim = body.getOrCreateVariableByName("lengthDim");
      		PVariable var_widthDim = body.getOrCreateVariableByName("widthDim");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_size, "size")
      		));
      		// 	find sizeDimensionsDiffer(robot, size)
      		new PositivePatternCall(body, new FlatTuple(var_robot, var_size), SizeDimensionsDifferQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Size.length.dimension(size, lengthDim)
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_size, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Size", "length")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_1_, var_lengthDim);
      		// 	Size.width.dimension(size, widthDim)
      		new TypeConstraint(body, new FlatTuple(var_size), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Size")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_size, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Size", "width")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_3_, var_widthDim);
      		// 	lengthDim != widthDim
      		new Inequality(body, var_lengthDim, var_widthDim);
      		// 	neg find conversionAvailable(lengthDim, widthDim)
      		new NegativePatternCall(body, new FlatTuple(var_lengthDim, var_widthDim), ConversionAvailableQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Size dimensions of $robot$ are not compatible (cannot be converted).");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.drone.presentation.DroneEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "robot", 
      		                "size"
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
