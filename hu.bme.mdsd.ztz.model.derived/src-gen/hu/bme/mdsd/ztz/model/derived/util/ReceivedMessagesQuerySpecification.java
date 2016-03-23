package hu.bme.mdsd.ztz.model.derived.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.derived.ReceivedMessagesMatch;
import hu.bme.mdsd.ztz.model.derived.ReceivedMessagesMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ReceivedMessagesMatcher in a type-safe way.
 * 
 * @see ReceivedMessagesMatcher
 * @see ReceivedMessagesMatch
 * 
 */
@SuppressWarnings("all")
public final class ReceivedMessagesQuerySpecification extends BaseGeneratedEMFQuerySpecification<ReceivedMessagesMatcher> {
  private ReceivedMessagesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ReceivedMessagesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ReceivedMessagesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ReceivedMessagesMatcher.on(engine);
  }
  
  @Override
  public ReceivedMessagesMatch newEmptyMatch() {
    return ReceivedMessagesMatch.newEmptyMatch();
  }
  
  @Override
  public ReceivedMessagesMatch newMatch(final Object... parameters) {
    return ReceivedMessagesMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.MessageRepository) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.Message) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ReceivedMessagesQuerySpecification INSTANCE = make();
    
    public static ReceivedMessagesQuerySpecification make() {
      return new ReceivedMessagesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ReceivedMessagesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.derived.receivedMessages";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("repository","message");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("repository", "hu.bme.mdsd.ztz.model.behaviour.MessageRepository"),new PParameter("message", "hu.bme.mdsd.ztz.model.behaviour.Message"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_repository = body.getOrCreateVariableByName("repository");
      		PVariable var_message = body.getOrCreateVariableByName("message");
      		PVariable var_robotSender = body.getOrCreateVariableByName("robotSender");
      		PVariable var_action = body.getOrCreateVariableByName("action");
      		PVariable var_robotReceiver = body.getOrCreateVariableByName("robotReceiver");
      		new TypeConstraint(body, new FlatTuple(var_repository), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MessageRepository")));
      		new TypeConstraint(body, new FlatTuple(var_message), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Message")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_repository, "repository"),
      		   new ExportedParameter(body, var_message, "message")
      		));
      		// 	DynamicRobot.actions(robotSender, action)
      		new TypeConstraint(body, new FlatTuple(var_robotSender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robotSender, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "actions")));
      		new Equality(body, var__virtual_0_, var_action);
      		// 	UnicastCommunication.target(action, robotReceiver)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "UnicastCommunication")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "UnicastCommunication", "target")));
      		new Equality(body, var__virtual_1_, var_robotReceiver);
      		// 	robotSender != robotReceiver
      		new Inequality(body, var_robotSender, var_robotReceiver);
      		// 	UnicastCommunication.message(action, message)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "UnicastCommunication")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction", "message")));
      		new Equality(body, var__virtual_2_, var_message);
      		// 	DynamicRobot.messageRepository(robotReceiver, repository)
      		new TypeConstraint(body, new FlatTuple(var_robotReceiver), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_robotReceiver, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "messageRepository")));
      		new Equality(body, var__virtual_3_, var_repository);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_repository = body.getOrCreateVariableByName("repository");
      		PVariable var_message = body.getOrCreateVariableByName("message");
      		PVariable var_robotSender = body.getOrCreateVariableByName("robotSender");
      		PVariable var_action = body.getOrCreateVariableByName("action");
      		PVariable var_robotReceiver = body.getOrCreateVariableByName("robotReceiver");
      		new TypeConstraint(body, new FlatTuple(var_repository), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MessageRepository")));
      		new TypeConstraint(body, new FlatTuple(var_message), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Message")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_repository, "repository"),
      		   new ExportedParameter(body, var_message, "message")
      		));
      		// 	DynamicRobot.actions(robotSender, action)
      		new TypeConstraint(body, new FlatTuple(var_robotSender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robotSender, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "actions")));
      		new Equality(body, var__virtual_0_, var_action);
      		// 	MulticastCommunication.targets(action, robotReceiver)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MulticastCommunication")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "MulticastCommunication", "targets")));
      		new Equality(body, var__virtual_1_, var_robotReceiver);
      		// 	robotSender != robotReceiver
      		new Inequality(body, var_robotSender, var_robotReceiver);
      		// 	MulticastCommunication.message(action, message)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MulticastCommunication")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction", "message")));
      		new Equality(body, var__virtual_2_, var_message);
      		// 	DynamicRobot.messageRepository(robotReceiver, repository)
      		new TypeConstraint(body, new FlatTuple(var_robotReceiver), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_robotReceiver, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "messageRepository")));
      		new Equality(body, var__virtual_3_, var_repository);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_repository = body.getOrCreateVariableByName("repository");
      		PVariable var_message = body.getOrCreateVariableByName("message");
      		PVariable var_robotSender = body.getOrCreateVariableByName("robotSender");
      		PVariable var_action = body.getOrCreateVariableByName("action");
      		PVariable var_robotReceiver = body.getOrCreateVariableByName("robotReceiver");
      		new TypeConstraint(body, new FlatTuple(var_repository), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MessageRepository")));
      		new TypeConstraint(body, new FlatTuple(var_message), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Message")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_repository, "repository"),
      		   new ExportedParameter(body, var_message, "message")
      		));
      		// 	DynamicRobot.actions(robotSender, action)
      		new TypeConstraint(body, new FlatTuple(var_robotSender), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_robotSender, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "actions")));
      		new Equality(body, var__virtual_0_, var_action);
      		// 	BroadcastCommunication.targets(action, robotReceiver)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "BroadcastCommunication")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "BroadcastCommunication", "targets")));
      		new Equality(body, var__virtual_1_, var_robotReceiver);
      		// 	robotSender != robotReceiver
      		new Inequality(body, var_robotSender, var_robotReceiver);
      		// 	BroadcastCommunication.message(action, message)
      		new TypeConstraint(body, new FlatTuple(var_action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "BroadcastCommunication")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_action, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction", "message")));
      		new Equality(body, var__virtual_2_, var_message);
      		// 	DynamicRobot.messageRepository(robotReceiver, repository)
      		new TypeConstraint(body, new FlatTuple(var_robotReceiver), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_robotReceiver, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot", "messageRepository")));
      		new Equality(body, var__virtual_3_, var_repository);
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
