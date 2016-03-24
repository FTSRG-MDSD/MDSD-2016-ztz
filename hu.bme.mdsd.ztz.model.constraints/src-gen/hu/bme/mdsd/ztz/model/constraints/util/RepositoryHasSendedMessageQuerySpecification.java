package hu.bme.mdsd.ztz.model.constraints.util;

import com.google.common.collect.Sets;
import hu.bme.mdsd.ztz.model.constraints.RepositoryHasSendedMessageMatch;
import hu.bme.mdsd.ztz.model.constraints.RepositoryHasSendedMessageMatcher;
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
 * A pattern-specific query specification that can instantiate RepositoryHasSendedMessageMatcher in a type-safe way.
 * 
 * @see RepositoryHasSendedMessageMatcher
 * @see RepositoryHasSendedMessageMatch
 * 
 */
@SuppressWarnings("all")
public final class RepositoryHasSendedMessageQuerySpecification extends BaseGeneratedEMFQuerySpecification<RepositoryHasSendedMessageMatcher> {
  private RepositoryHasSendedMessageQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RepositoryHasSendedMessageQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected RepositoryHasSendedMessageMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return RepositoryHasSendedMessageMatcher.on(engine);
  }
  
  @Override
  public RepositoryHasSendedMessageMatch newEmptyMatch() {
    return RepositoryHasSendedMessageMatch.newEmptyMatch();
  }
  
  @Override
  public RepositoryHasSendedMessageMatch newMatch(final Object... parameters) {
    return RepositoryHasSendedMessageMatch.newMatch((hu.bme.mdsd.ztz.model.behaviour.MessageRepository) parameters[0], (hu.bme.mdsd.ztz.model.behaviour.Message) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static RepositoryHasSendedMessageQuerySpecification INSTANCE = make();
    
    public static RepositoryHasSendedMessageQuerySpecification make() {
      return new RepositoryHasSendedMessageQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RepositoryHasSendedMessageQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mdsd.ztz.model.constraints.repositoryHasSendedMessage";
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
      		new TypeConstraint(body, new FlatTuple(var_repository), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MessageRepository")));
      		new TypeConstraint(body, new FlatTuple(var_message), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "Message")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_repository, "repository"),
      		   new ExportedParameter(body, var_message, "message")
      		));
      		// 	MessageRepository.sendedMessages(repository, message)
      		new TypeConstraint(body, new FlatTuple(var_repository), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdsd.hu/behaviour", "MessageRepository")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_repository, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdsd.hu/behaviour", "MessageRepository", "sendedMessages")));
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
