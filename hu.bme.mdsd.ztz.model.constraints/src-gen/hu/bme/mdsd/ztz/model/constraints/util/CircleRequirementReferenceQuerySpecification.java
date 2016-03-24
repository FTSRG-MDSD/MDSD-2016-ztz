package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.CircleRequirementReferenceMatch;
import hu.bme.mdsd.ztz.model.constraints.CircleRequirementReferenceMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.TaskExecutionRequiresTaskExecutionQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CircleRequirementReferenceMatcher in a type-safe way.
 * 
 * @see CircleRequirementReferenceMatcher
 * @see CircleRequirementReferenceMatch
 * 
 */
@SuppressWarnings("all")
public final class CircleRequirementReferenceQuerySpecification extends BaseGeneratedEMFQuerySpecification<CircleRequirementReferenceMatcher> {
  private CircleRequirementReferenceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CircleRequirementReferenceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CircleRequirementReferenceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CircleRequirementReferenceMatcher.on(engine);
  }
  
  @Override
  public CircleRequirementReferenceMatch newEmptyMatch() {
    return CircleRequirementReferenceMatch.newEmptyMatch();
  }
  
  @Override
  public CircleRequirementReferenceMatch newMatch(final Object... parameters) {
    return CircleRequirementReferenceMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskExecution) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CircleRequirementReferenceQuerySpecification INSTANCE = make();
    
    public static CircleRequirementReferenceQuerySpecification make() {
      return new CircleRequirementReferenceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CircleRequirementReferenceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.circleRequirementReference";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("taskExecution");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("taskExecution", "hu.bme.mdsd.ztz.model.behaviour.TaskExecution"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_taskExecution = body.getOrCreateVariableByName("taskExecution");
      		new TypeConstraint(body, new FlatTuple(var_taskExecution), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskExecution")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_taskExecution, "taskExecution")
      		));
      		// 	find taskExecutionRequiresTaskExecution+(taskExecution, taskExecution)
      		new BinaryTransitiveClosure(body, new FlatTuple(var_taskExecution, var_taskExecution), TaskExecutionRequiresTaskExecutionQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "TaskExecution $taskExecution$ is prerequisite of itself.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "taskExecution"
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
