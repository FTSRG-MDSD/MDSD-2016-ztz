package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionHasMessageMatch;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionHasMessageMatcher;
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
 * A pattern-specific query specification that can instantiate CommunicationActionHasMessageMatcher in a type-safe way.
 * 
 * @see CommunicationActionHasMessageMatcher
 * @see CommunicationActionHasMessageMatch
 * 
 */
@SuppressWarnings("all")
public final class CommunicationActionHasMessageQuerySpecification extends BaseGeneratedEMFQuerySpecification<CommunicationActionHasMessageMatcher> {
  private CommunicationActionHasMessageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CommunicationActionHasMessageQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CommunicationActionHasMessageMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CommunicationActionHasMessageMatcher.on(engine);
  }
  
  @Override
  public CommunicationActionHasMessageMatch newEmptyMatch() {
    return CommunicationActionHasMessageMatch.newEmptyMatch();
  }
  
  @Override
  public CommunicationActionHasMessageMatch newMatch(final Object... parameters) {
    return CommunicationActionHasMessageMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.Message) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CommunicationActionHasMessageQuerySpecification INSTANCE = make();
    
    public static CommunicationActionHasMessageQuerySpecification make() {
      return new CommunicationActionHasMessageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CommunicationActionHasMessageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.communicationActionHasMessage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("communicationAction","message");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("communicationAction", "hu.bme.mdsd.ztz.model.behaviour.CommunicationAction"),new PParameter("message", "hu.bme.mdsd.ztz.model.behaviour.Message"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_communicationAction = body.getOrCreateVariableByName("communicationAction");
      		PVariable var_message = body.getOrCreateVariableByName("message");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		new TypeConstraint(body, new FlatTuple(var_message), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Message")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_communicationAction, "communicationAction"),
      		   new ExportedParameter(body, var_message, "message")
      		));
      		// 	CommunicationAction.message(communicationAction, message)
      		new TypeConstraint(body, new FlatTuple(var_communicationAction), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_communicationAction, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "CommunicationAction", "message")));
      		new Equality(body, var__virtual_0_, var_message);
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
