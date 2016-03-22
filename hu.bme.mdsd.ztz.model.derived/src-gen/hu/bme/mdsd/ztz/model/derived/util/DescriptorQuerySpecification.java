package hu.bme.mdsd.ztz.model.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.derived.DescriptorMatch;
import hu.bme.mdsd.ztz.model.derived.DescriptorMatcher;
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
 * A pattern-specific query specification that can instantiate DescriptorMatcher in a type-safe way.
 * 
 * @see DescriptorMatcher
 * @see DescriptorMatch
 * 
 */
@SuppressWarnings("all")
public final class DescriptorQuerySpecification extends BaseGeneratedEMFQuerySpecification<DescriptorMatcher> {
  private DescriptorQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DescriptorQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DescriptorMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DescriptorMatcher.on(engine);
  }
  
  @Override
  public DescriptorMatch newEmptyMatch() {
    return DescriptorMatch.newEmptyMatch();
  }
  
  @Override
  public DescriptorMatch newMatch(final Object... parameters) {
    return DescriptorMatch.newMatch((hu.bme.mdsd.ztz.model.drone.TaskRequirement) parameters[0], (hu.bme.mdsd.ztz.model.drone.TaskDescriptor) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static DescriptorQuerySpecification INSTANCE = make();
    
    public static DescriptorQuerySpecification make() {
      return new DescriptorQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DescriptorQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.derived.descriptor";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("sourceRequirement","targetDescriptor");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("sourceRequirement", "hu.bme.mdsd.ztz.model.drone.TaskRequirement"),new PParameter("targetDescriptor", "hu.bme.mdsd.ztz.model.drone.TaskDescriptor"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_sourceRequirement = body.getOrCreateVariableByName("sourceRequirement");
      		PVariable var_targetDescriptor = body.getOrCreateVariableByName("targetDescriptor");
      		PVariable var_task = body.getOrCreateVariableByName("task");
      		new TypeConstraint(body, new FlatTuple(var_sourceRequirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "TaskRequirement")));
      		new TypeConstraint(body, new FlatTuple(var_targetDescriptor), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "TaskDescriptor")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_sourceRequirement, "sourceRequirement"),
      		   new ExportedParameter(body, var_targetDescriptor, "targetDescriptor")
      		));
      		// 	Task.requirement(task, sourceRequirement)
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "requirement")));
      		new Equality(body, var__virtual_0_, var_sourceRequirement);
      		// 	Task.descriptor(task, targetDescriptor)
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/drone", "Task")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/drone", "Task", "descriptor")));
      		new Equality(body, var__virtual_1_, var_targetDescriptor);
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
