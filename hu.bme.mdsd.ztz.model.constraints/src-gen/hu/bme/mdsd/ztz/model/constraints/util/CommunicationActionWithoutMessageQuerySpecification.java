package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionWithoutMessageMatch;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionWithoutMessageMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.CommunicationActionHasMessageQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CommunicationActionWithoutMessageMatcher in a type-safe way.
 * 
 * @see CommunicationActionWithoutMessageMatcher
 * @see CommunicationActionWithoutMessageMatch
 * 
 */
@SuppressWarnings("all")
public final class CommunicationActionWithoutMessageQuerySpecification extends BaseGeneratedEMFQuerySpecification<CommunicationActionWithoutMessageMatcher> {
  private CommunicationActionWithoutMessageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CommunicationActionWithoutMessageQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CommunicationActionWithoutMessageMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CommunicationActionWithoutMessageMatcher.on(engine);
  }
  
  @Override
  public CommunicationActionWithoutMessageMatch newEmptyMatch() {
    return CommunicationActionWithoutMessageMatch.newEmptyMatch();
  }
  
  @Override
  public CommunicationActionWithoutMessageMatch newMatch(final Object... parameters) {
    return CommunicationActionWithoutMessageMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static CommunicationActionWithoutMessageQuerySpecification INSTANCE = make();
    
    public static CommunicationActionWithoutMessageQuerySpecification make() {
      return new CommunicationActionWithoutMessageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CommunicationActionWithoutMessageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.communicationActionWithoutMessage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("communicationAction");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("communicationAction", "hu.bme.mdsd.ztz.model.behaviour.CommunicationAction"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_communicationAction = body.getOrCreateVariableByName("communicationAction");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_communicationAction, "communicationAction")
      		));
      		// 	neg find communicationActionHasMessage(communicationAction, _)
      		new NegativePatternCall(body, new FlatTuple(var_communicationAction, var___0_), CommunicationActionHasMessageQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "warning");
      		annotation.addAttribute("message", "$communicationAction$ does not contain a message.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "communicationAction"
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
