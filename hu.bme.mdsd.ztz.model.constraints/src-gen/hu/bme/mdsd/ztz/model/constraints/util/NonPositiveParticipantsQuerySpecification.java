package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.NonPositiveParticipantsMatch;
import hu.bme.mdsd.ztz.model.constraints.NonPositiveParticipantsMatcher;
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
 * A pattern-specific query specification that can instantiate NonPositiveParticipantsMatcher in a type-safe way.
 * 
 * @see NonPositiveParticipantsMatcher
 * @see NonPositiveParticipantsMatch
 * 
 */
@SuppressWarnings("all")
public final class NonPositiveParticipantsQuerySpecification extends BaseGeneratedEMFQuerySpecification<NonPositiveParticipantsMatcher> {
  private NonPositiveParticipantsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NonPositiveParticipantsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NonPositiveParticipantsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NonPositiveParticipantsMatcher.on(engine);
  }
  
  @Override
  public NonPositiveParticipantsMatch newEmptyMatch() {
    return NonPositiveParticipantsMatch.newEmptyMatch();
  }
  
  @Override
  public NonPositiveParticipantsMatch newMatch(final Object... parameters) {
    return NonPositiveParticipantsMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static NonPositiveParticipantsQuerySpecification INSTANCE = make();
    
    public static NonPositiveParticipantsQuerySpecification make() {
      return new NonPositiveParticipantsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NonPositiveParticipantsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.nonPositiveParticipants";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("requirement");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("requirement", "hu.bme.mdsd.ztz.model.behaviour.TaskRequirement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_requirement = body.getOrCreateVariableByName("requirement");
      		PVariable var_participants = body.getOrCreateVariableByName("participants");
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_requirement, "requirement")
      		));
      		// 	TaskRequirement.participants(requirement, participants)
      		new TypeConstraint(body, new FlatTuple(var_requirement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_requirement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "TaskRequirement", "participants")));
      		new Equality(body, var__virtual_0_, var_participants);
      		// 	check(participants <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern nonPositiveParticipants";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("participants");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer participants = (java.lang.Integer) provider.getValue("participants");
      		                                    return evaluateExpression_1_1(participants);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "The number of participants has to be positive!");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "requirement"
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
  
  private static boolean evaluateExpression_1_1(final Integer participants) {
    return ((participants).intValue() <= 0);
  }
}
