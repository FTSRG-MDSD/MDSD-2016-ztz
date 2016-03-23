package hu.bme.mdsd.ztz.model.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.derived.MinMeasureMatch;
import hu.bme.mdsd.ztz.model.derived.MinMeasureMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MinMeasureMatcher in a type-safe way.
 * 
 * @see MinMeasureMatcher
 * @see MinMeasureMatch
 * 
 */
@SuppressWarnings("all")
public final class MinMeasureQuerySpecification extends BaseGeneratedEMFQuerySpecification<MinMeasureMatcher> {
  private MinMeasureQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MinMeasureQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MinMeasureMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MinMeasureMatcher.on(engine);
  }
  
  @Override
  public MinMeasureMatch newEmptyMatch() {
    return MinMeasureMatch.newEmptyMatch();
  }
  
  @Override
  public MinMeasureMatch newMatch(final Object... parameters) {
    return MinMeasureMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Robot) parameters[1], (hu.bme.mdsd.ztz.model.drone.MeasureValue) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static MinMeasureQuerySpecification INSTANCE = make();
    
    public static MinMeasureQuerySpecification make() {
      return new MinMeasureQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MinMeasureQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.derived.minMeasure";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","cooperator","minimum");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.drone.Robot"),new PParameter("cooperator", "hu.bme.mdsd.ztz.model.drone.Robot"),new PParameter("minimum", "hu.bme.mdsd.ztz.model.drone.MeasureValue"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_cooperator = body.getOrCreateVariableByName("cooperator");
      		PVariable var_minimum = body.getOrCreateVariableByName("minimum");
      		PVariable var_mvalue1 = body.getOrCreateVariableByName("mvalue1");
      		PVariable var_mvalue2 = body.getOrCreateVariableByName("mvalue2");
      		PVariable var_commonDimension = body.getOrCreateVariableByName("commonDimension");
      		PVariable var_value1 = body.getOrCreateVariableByName("value1");
      		PVariable var_value2 = body.getOrCreateVariableByName("value2");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_cooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_minimum), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_cooperator, "cooperator"),
      		   new ExportedParameter(body, var_minimum, "minimum")
      		));
      		// 	Robot.communicationRange(robot, mvalue1)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		new Equality(body, var__virtual_0_, var_mvalue1);
      		// 	Robot.communicationRange(cooperator, mvalue2)
      		new TypeConstraint(body, new FlatTuple(var_cooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_cooperator, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		new Equality(body, var__virtual_1_, var_mvalue2);
      		// 		MeasureValue.dimension(mvalue1, commonDimension)
      		new TypeConstraint(body, new FlatTuple(var_mvalue1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_2_, var_commonDimension);
      		// 	MeasureValue.dimension(mvalue2, commonDimension)
      		new TypeConstraint(body, new FlatTuple(var_mvalue2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_3_, var_commonDimension);
      		// 	MeasureValue.value(mvalue1, value1)
      		new TypeConstraint(body, new FlatTuple(var_mvalue1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue1, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "value")));
      		new Equality(body, var__virtual_4_, var_value1);
      		// 	MeasureValue.value(mvalue2, value2)
      		new TypeConstraint(body, new FlatTuple(var_mvalue2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue2, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "value")));
      		new Equality(body, var__virtual_5_, var_value2);
      		// 		MeasureValue.dimension(minimum, commonDimension)
      		new TypeConstraint(body, new FlatTuple(var_minimum), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_minimum, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_6_, var_commonDimension);
      		// 	MeasureValue.value(minimum, eval(Math.min(value1, value2)))
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern minMeasure";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("value1", "value2");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float value1 = (java.lang.Float) provider.getValue("value1");
      		                                    java.lang.Float value2 = (java.lang.Float) provider.getValue("value2");
      		                                    return evaluateExpression_1_1(value1, value2);
      		                                }
      		
      		                        },  var__virtual_7_ ); new TypeConstraint(body, new FlatTuple(var_minimum), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var_minimum, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "value")));
      		new Equality(body, var__virtual_8_, var__virtual_7_);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_cooperator = body.getOrCreateVariableByName("cooperator");
      		PVariable var_minimum = body.getOrCreateVariableByName("minimum");
      		PVariable var_mvalue1 = body.getOrCreateVariableByName("mvalue1");
      		PVariable var_mvalue2 = body.getOrCreateVariableByName("mvalue2");
      		PVariable var_dimension1 = body.getOrCreateVariableByName("dimension1");
      		PVariable var_dimension2 = body.getOrCreateVariableByName("dimension2");
      		PVariable var_value1 = body.getOrCreateVariableByName("value1");
      		PVariable var_value2 = body.getOrCreateVariableByName("value2");
      		PVariable var_conv = body.getOrCreateVariableByName("conv");
      		PVariable var_convRate = body.getOrCreateVariableByName("convRate");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_cooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_minimum), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_cooperator, "cooperator"),
      		   new ExportedParameter(body, var_minimum, "minimum")
      		));
      		// 	Robot.communicationRange(robot, mvalue1)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		new Equality(body, var__virtual_0_, var_mvalue1);
      		// 	Robot.communicationRange(cooperator, mvalue2)
      		new TypeConstraint(body, new FlatTuple(var_cooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_cooperator, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		new Equality(body, var__virtual_1_, var_mvalue2);
      		// 		MeasureValue.dimension(mvalue1, dimension1)
      		new TypeConstraint(body, new FlatTuple(var_mvalue1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_2_, var_dimension1);
      		// 	MeasureValue.dimension(mvalue2, dimension2)
      		new TypeConstraint(body, new FlatTuple(var_mvalue2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_3_, var_dimension2);
      		// 	MeasureValue.value(mvalue1, value1)
      		new TypeConstraint(body, new FlatTuple(var_mvalue1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue1, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "value")));
      		new Equality(body, var__virtual_4_, var_value1);
      		// 	MeasureValue.value(mvalue2, value2)
      		new TypeConstraint(body, new FlatTuple(var_mvalue2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue2, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "value")));
      		new Equality(body, var__virtual_5_, var_value2);
      		// 		MeasureDimension.conversions(dimension1, conv)
      		new TypeConstraint(body, new FlatTuple(var_dimension1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_dimension1, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureDimension", "conversions")));
      		new Equality(body, var__virtual_6_, var_conv);
      		// 	MeasureConversion.dimension(conv, dimension2)
      		new TypeConstraint(body, new FlatTuple(var_conv), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureConversion")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var_conv, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "dimension")));
      		new Equality(body, var__virtual_7_, var_dimension2);
      		// 	MeasureConversion.rate(conv, convRate)
      		new TypeConstraint(body, new FlatTuple(var_conv), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureConversion")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var_conv, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "rate")));
      		new Equality(body, var__virtual_8_, var_convRate);
      		// 		check(value2 <= value1*convRate)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern minMeasure";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("convRate", "value1", "value2");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float convRate = (java.lang.Float) provider.getValue("convRate");
      		                                    java.lang.Float value1 = (java.lang.Float) provider.getValue("value1");
      		                                    java.lang.Float value2 = (java.lang.Float) provider.getValue("value2");
      		                                    return evaluateExpression_2_1(convRate, value1, value2);
      		                                }
      		
      		                        },  null); // 	minimum == mvalue2
      		new Equality(body, var_minimum, var_mvalue2);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_cooperator = body.getOrCreateVariableByName("cooperator");
      		PVariable var_minimum = body.getOrCreateVariableByName("minimum");
      		PVariable var_mvalue1 = body.getOrCreateVariableByName("mvalue1");
      		PVariable var_mvalue2 = body.getOrCreateVariableByName("mvalue2");
      		PVariable var_dimension1 = body.getOrCreateVariableByName("dimension1");
      		PVariable var_dimension2 = body.getOrCreateVariableByName("dimension2");
      		PVariable var_value1 = body.getOrCreateVariableByName("value1");
      		PVariable var_value2 = body.getOrCreateVariableByName("value2");
      		PVariable var_conv = body.getOrCreateVariableByName("conv");
      		PVariable var_convRate = body.getOrCreateVariableByName("convRate");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_cooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_minimum), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_cooperator, "cooperator"),
      		   new ExportedParameter(body, var_minimum, "minimum")
      		));
      		// 	Robot.communicationRange(robot, mvalue1)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		new Equality(body, var__virtual_0_, var_mvalue1);
      		// 	Robot.communicationRange(cooperator, mvalue2)
      		new TypeConstraint(body, new FlatTuple(var_cooperator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_cooperator, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "communicationRange")));
      		new Equality(body, var__virtual_1_, var_mvalue2);
      		// 		MeasureValue.dimension(mvalue1, dimension1)
      		new TypeConstraint(body, new FlatTuple(var_mvalue1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_2_, var_dimension1);
      		// 	MeasureValue.dimension(mvalue2, dimension2)
      		new TypeConstraint(body, new FlatTuple(var_mvalue2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "dimension")));
      		new Equality(body, var__virtual_3_, var_dimension2);
      		// 	MeasureValue.value(mvalue1, value1)
      		new TypeConstraint(body, new FlatTuple(var_mvalue1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue1, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "value")));
      		new Equality(body, var__virtual_4_, var_value1);
      		// 	MeasureValue.value(mvalue2, value2)
      		new TypeConstraint(body, new FlatTuple(var_mvalue2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureValue")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_mvalue2, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureValue", "value")));
      		new Equality(body, var__virtual_5_, var_value2);
      		// 		MeasureDimension.conversions(dimension1, conv)
      		new TypeConstraint(body, new FlatTuple(var_dimension1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureDimension")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_dimension1, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureDimension", "conversions")));
      		new Equality(body, var__virtual_6_, var_conv);
      		// 	MeasureConversion.dimension(conv, dimension2)
      		new TypeConstraint(body, new FlatTuple(var_conv), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureConversion")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var_conv, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "dimension")));
      		new Equality(body, var__virtual_7_, var_dimension2);
      		// 	MeasureConversion.rate(conv, convRate)
      		new TypeConstraint(body, new FlatTuple(var_conv), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "MeasureConversion")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var_conv, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "MeasureConversion", "rate")));
      		new Equality(body, var__virtual_8_, var_convRate);
      		// 		check(value1*convRate < value2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern minMeasure";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("convRate", "value1", "value2");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Float convRate = (java.lang.Float) provider.getValue("convRate");
      		                                    java.lang.Float value1 = (java.lang.Float) provider.getValue("value1");
      		                                    java.lang.Float value2 = (java.lang.Float) provider.getValue("value2");
      		                                    return evaluateExpression_3_1(convRate, value1, value2);
      		                                }
      		
      		                        },  null); // 	minimum == mvalue1
      		new Equality(body, var_minimum, var_mvalue1);
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
  
  private static float evaluateExpression_1_1(final Float value1, final Float value2) {
    float _min = Math.min((value1).floatValue(), (value2).floatValue());
    return _min;
  }
  
  private static boolean evaluateExpression_2_1(final Float convRate, final Float value1, final Float value2) {
    return ((value2).floatValue() <= ((value1).floatValue() * (convRate).floatValue()));
  }
  
  private static boolean evaluateExpression_3_1(final Float convRate, final Float value1, final Float value2) {
    return (((value1).floatValue() * (convRate).floatValue()) < (value2).floatValue());
  }
}
