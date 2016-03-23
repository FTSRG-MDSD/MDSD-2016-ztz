package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.RobotHasBatteryMatch;
import hu.bme.mdsd.ztz.model.constraints.RobotHasBatteryMatcher;
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
 * A pattern-specific query specification that can instantiate RobotHasBatteryMatcher in a type-safe way.
 * 
 * @see RobotHasBatteryMatcher
 * @see RobotHasBatteryMatch
 * 
 */
@SuppressWarnings("all")
public final class RobotHasBatteryQuerySpecification extends BaseGeneratedEMFQuerySpecification<RobotHasBatteryMatcher> {
  private RobotHasBatteryQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RobotHasBatteryQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RobotHasBatteryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RobotHasBatteryMatcher.on(engine);
  }
  
  @Override
  public RobotHasBatteryMatch newEmptyMatch() {
    return RobotHasBatteryMatch.newEmptyMatch();
  }
  
  @Override
  public RobotHasBatteryMatch newMatch(final Object... parameters) {
    return RobotHasBatteryMatch.newMatch((hu.bme.mdsd.ztz.model.drone.Robot) parameters[0], (hu.bme.mdsd.ztz.model.drone.Battery) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static RobotHasBatteryQuerySpecification INSTANCE = make();
    
    public static RobotHasBatteryQuerySpecification make() {
      return new RobotHasBatteryQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RobotHasBatteryQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.robotHasBattery";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("robot","battery");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("robot", "hu.bme.mdsd.ztz.model.drone.Robot"),new PParameter("battery", "hu.bme.mdsd.ztz.model.drone.Battery"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_battery = body.getOrCreateVariableByName("battery");
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		new TypeConstraint(body, new FlatTuple(var_battery), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Battery")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_robot, "robot"),
      		   new ExportedParameter(body, var_battery, "battery")
      		));
      		// 	Robot.batteries(robot, battery)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Robot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Robot", "batteries")));
      		new Equality(body, var__virtual_0_, var_battery);
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
