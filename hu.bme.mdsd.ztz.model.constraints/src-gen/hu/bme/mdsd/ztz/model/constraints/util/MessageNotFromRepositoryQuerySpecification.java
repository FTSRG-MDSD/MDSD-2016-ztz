package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.MessageNotFromRepositoryMatch;
import hu.bme.mdsd.ztz.model.constraints.MessageNotFromRepositoryMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.RepositoryHasSendedMessageQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MessageNotFromRepositoryMatcher in a type-safe way.
 * 
 * @see MessageNotFromRepositoryMatcher
 * @see MessageNotFromRepositoryMatch
 * 
 */
@SuppressWarnings("all")
public final class MessageNotFromRepositoryQuerySpecification extends BaseGeneratedEMFQuerySpecification<MessageNotFromRepositoryMatcher> {
  private MessageNotFromRepositoryQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MessageNotFromRepositoryQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MessageNotFromRepositoryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MessageNotFromRepositoryMatcher.on(engine);
  }
  
  @Override
  public MessageNotFromRepositoryMatch newEmptyMatch() {
    return MessageNotFromRepositoryMatch.newEmptyMatch();
  }
  
  @Override
  public MessageNotFromRepositoryMatch newMatch(final Object... parameters) {
    return MessageNotFromRepositoryMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.Message) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MessageNotFromRepositoryQuerySpecification INSTANCE = make();
    
    public static MessageNotFromRepositoryQuerySpecification make() {
      return new MessageNotFromRepositoryQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MessageNotFromRepositoryQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.messageNotFromRepository";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("message","action");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("message", "hu.bme.mdsd.ztz.model.behaviour.Message"),new PParameter("action", "hu.bme.mdsd.ztz.model.behaviour.CommunicationAction"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_message = body.getOrCreateVariableByName("message");
      		PVariable var_action = body.getOrCreateVariableByName("action");
      		PVariable var_robot = body.getOrCreateVariableByName("robot");
      		PVariable var_repository = body.getOrCreateVariableByName("repository");
      		new TypeConstraint(body, new FlatTuple(var_message), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Message")));
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_message, "message"),
      		   new ExportedParameter(body, var_action, "action")
      		));
      		// 	DynamicRobot.actions(robot, action)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "actions")));
      		new Equality(body, var__virtual_0_, var_action);
      		// 	DynamicRobot.messageRepository(robot, repository)
      		new TypeConstraint(body, new FlatTuple(var_robot), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_robot, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "messageRepository")));
      		new Equality(body, var__virtual_1_, var_repository);
      		// 	CommunicationAction.message(action, message)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction", "message")));
      		new Equality(body, var__virtual_2_, var_message);
      		// 	neg find repositoryHasSendedMessage(repository, message)
      		new NegativePatternCall(body, new FlatTuple(var_repository, var_message), RepositoryHasSendedMessageQuerySpecification.instance().getInternalQueryRepresentation());
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "The message ($message$) of the action is not in the message repository as a sendedMessage.");
      		annotation.addAttribute("targetEditorId", "hu.bme.mdsd.ztz.model.behaviour.presentation.BehaviourEditorID");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "action", 
      		                "message"
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
