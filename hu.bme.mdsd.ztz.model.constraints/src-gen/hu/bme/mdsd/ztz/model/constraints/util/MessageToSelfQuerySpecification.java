package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.MessageToSelfMatch;
import hu.bme.mdsd.ztz.model.constraints.MessageToSelfMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.MessageTargetQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MessageToSelfMatcher in a type-safe way.
 * 
 * @see MessageToSelfMatcher
 * @see MessageToSelfMatch
 * 
 */
@SuppressWarnings("all")
public final class MessageToSelfQuerySpecification extends BaseGeneratedEMFQuerySpecification<MessageToSelfMatcher> {
  private MessageToSelfQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MessageToSelfQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MessageToSelfMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MessageToSelfMatcher.on(engine);
  }
  
  @Override
  public MessageToSelfMatch newEmptyMatch() {
    return MessageToSelfMatch.newEmptyMatch();
  }
  
  @Override
  public MessageToSelfMatch newMatch(final Object... parameters) {
    return MessageToSelfMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MessageToSelfQuerySpecification INSTANCE = make();
    
    public static MessageToSelfQuerySpecification make() {
      return new MessageToSelfQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MessageToSelfQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.messageToSelf";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("drobot","communicationAction");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("drobot", "hu.bme.mdsd.ztz.model.behaviour.DynamicRobot"),new PParameter("communicationAction", "hu.bme.mdsd.ztz.model.behaviour.CommunicationAction"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_drobot = body.getOrCreateVariableByName("drobot");
      		PVariable var_communicationAction = body.getOrCreateVariableByName("communicationAction");
      		new TypeConstraint(body, new FlatTuple(var_drobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drobot, "drobot"),
      		   new ExportedParameter(body, var_communicationAction, "communicationAction")
      		));
      		// 	DynamicRobot.actions(drobot, communicationAction)
      		new TypeConstraint(body, new FlatTuple(var_drobot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drobot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "actions")));
      		new Equality(body, var__virtual_0_, var_communicationAction);
      		// 	find messageTarget(communicationAction, drobot)
      		new PositivePatternCall(body, new FlatTuple(var_communicationAction, var_drobot), MessageTargetQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "warning");
      		annotation.addAttribute("message", "$drobot$ sends a message to itself in $communicationAction$.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "drobot", 
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
