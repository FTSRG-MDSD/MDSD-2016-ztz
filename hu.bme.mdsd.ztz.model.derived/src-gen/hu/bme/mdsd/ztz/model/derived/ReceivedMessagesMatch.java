package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.derived.util.ReceivedMessagesQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.receivedMessages pattern,
 * to be used in conjunction with {@link ReceivedMessagesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReceivedMessagesMatcher
 * @see ReceivedMessagesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReceivedMessagesMatch extends BasePatternMatch {
  private MessageRepository fRepository;
  
  private Message fMessage;
  
  private static List<String> parameterNames = makeImmutableList("repository", "message");
  
  private ReceivedMessagesMatch(final MessageRepository pRepository, final Message pMessage) {
    this.fRepository = pRepository;
    this.fMessage = pMessage;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("repository".equals(parameterName)) return this.fRepository;
    if ("message".equals(parameterName)) return this.fMessage;
    return null;
  }
  
  public MessageRepository getRepository() {
    return this.fRepository;
  }
  
  public Message getMessage() {
    return this.fMessage;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("repository".equals(parameterName) ) {
    	this.fRepository = (hu.bme.mdsd.ztz.model.behaviour.MessageRepository) newValue;
    	return true;
    }
    if ("message".equals(parameterName) ) {
    	this.fMessage = (hu.bme.mdsd.ztz.model.behaviour.Message) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRepository(final MessageRepository pRepository) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRepository = pRepository;
  }
  
  public void setMessage(final Message pMessage) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMessage = pMessage;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.receivedMessages";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReceivedMessagesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRepository, fMessage};
  }
  
  @Override
  public ReceivedMessagesMatch toImmutable() {
    return isMutable() ? newMatch(fRepository, fMessage) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"repository\"=" + prettyPrintValue(fRepository) + ", ");
    
    result.append("\"message\"=" + prettyPrintValue(fMessage)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRepository == null) ? 0 : fRepository.hashCode());
    result = prime * result + ((fMessage == null) ? 0 : fMessage.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ReceivedMessagesMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ReceivedMessagesMatch other = (ReceivedMessagesMatch) obj;
    if (fRepository == null) {if (other.fRepository != null) return false;}
    else if (!fRepository.equals(other.fRepository)) return false;
    if (fMessage == null) {if (other.fMessage != null) return false;}
    else if (!fMessage.equals(other.fMessage)) return false;
    return true;
  }
  
  @Override
  public ReceivedMessagesQuerySpecification specification() {
    try {
    	return ReceivedMessagesQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static ReceivedMessagesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReceivedMessagesMatch newMutableMatch(final MessageRepository pRepository, final Message pMessage) {
    return new Mutable(pRepository, pMessage);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRepository the fixed value of pattern parameter repository, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReceivedMessagesMatch newMatch(final MessageRepository pRepository, final Message pMessage) {
    return new Immutable(pRepository, pMessage);
  }
  
  private static final class Mutable extends ReceivedMessagesMatch {
    Mutable(final MessageRepository pRepository, final Message pMessage) {
      super(pRepository, pMessage);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReceivedMessagesMatch {
    Immutable(final MessageRepository pRepository, final Message pMessage) {
      super(pRepository, pMessage);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
