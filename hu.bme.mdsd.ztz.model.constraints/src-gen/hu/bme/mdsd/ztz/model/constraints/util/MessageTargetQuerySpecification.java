package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.MessageTargetMatch;
import hu.bme.mdsd.ztz.model.constraints.MessageTargetMatcher;
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
 * A pattern-specific query specification that can instantiate MessageTargetMatcher in a type-safe way.
 * 
 * @see MessageTargetMatcher
 * @see MessageTargetMatch
 * 
 */
@SuppressWarnings("all")
public final class MessageTargetQuerySpecification extends BaseGeneratedEMFQuerySpecification<MessageTargetMatcher> {
  private MessageTargetQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MessageTargetQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MessageTargetMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MessageTargetMatcher.on(engine);
  }
  
  @Override
  public MessageTargetMatch newEmptyMatch() {
    return MessageTargetMatch.newEmptyMatch();
  }
  
  @Override
  public MessageTargetMatch newMatch(final Object... parameters) {
    return MessageTargetMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MessageTargetQuerySpecification INSTANCE = make();
    
    public static MessageTargetQuerySpecification make() {
      return new MessageTargetQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MessageTargetQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.messageTarget";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("communicationAction","target");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("communicationAction", "hu.bme.mdsd.ztz.model.behaviour.CommunicationAction"),new PParameter("target", "hu.bme.mdsd.ztz.model.behaviour.DynamicRobot"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_communicationAction = body.getOrCreateVariableByName("communicationAction");
      		PVariable var_target = body.getOrCreateVariableByName("target");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		new TypeConstraint(body, new FlatTuple(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_communicationAction, "communicationAction"),
      		   new ExportedParameter(body, var_target, "target")
      		));
      		// 	UnicastCommunication.target(communicationAction, target)
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "UnicastCommunication")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "UnicastCommunication", "target")));
      		new Equality(body, var__virtual_0_, var_target);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_communicationAction = body.getOrCreateVariableByName("communicationAction");
      		PVariable var_target = body.getOrCreateVariableByName("target");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		new TypeConstraint(body, new FlatTuple(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_communicationAction, "communicationAction"),
      		   new ExportedParameter(body, var_target, "target")
      		));
      		// 	MulticastCommunication.targets(communicationAction, target)
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MulticastCommunication")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "MulticastCommunication", "targets")));
      		new Equality(body, var__virtual_0_, var_target);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_communicationAction = body.getOrCreateVariableByName("communicationAction");
      		PVariable var_target = body.getOrCreateVariableByName("target");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		new TypeConstraint(body, new FlatTuple(var_target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "DynamicRobot")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_communicationAction, "communicationAction"),
      		   new ExportedParameter(body, var_target, "target")
      		));
      		// 	BroadcastCommunication.targets(communicationAction, target)
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "BroadcastCommunication")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "BroadcastCommunication", "targets")));
      		new Equality(body, var__virtual_0_, var_target);
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
