package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.constraints.util.MessageNotFromRepositoryQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.messageNotFromRepository pattern,
 * to be used in conjunction with {@link MessageNotFromRepositoryMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MessageNotFromRepositoryMatcher
 * @see MessageNotFromRepositoryProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MessageNotFromRepositoryMatch extends BasePatternMatch {
  private Message fMessage;
  
  private CommunicationAction fAction;
  
  private static List<String> parameterNames = makeImmutableList("message", "action");
  
  private MessageNotFromRepositoryMatch(final Message pMessage, final CommunicationAction pAction) {
    this.fMessage = pMessage;
    this.fAction = pAction;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("message".equals(parameterName)) return this.fMessage;
    if ("action".equals(parameterName)) return this.fAction;
    return null;
  }
  
  public Message getMessage() {
    return this.fMessage;
  }
  
  public CommunicationAction getAction() {
    return this.fAction;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("message".equals(parameterName) ) {
    	this.fMessage = (hu.bme.mdsd.ztz.model.behaviour.Message) newValue;
    	return true;
    }
    if ("action".equals(parameterName) ) {
    	this.fAction = (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMessage(final Message pMessage) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMessage = pMessage;
  }
  
  public void setAction(final CommunicationAction pAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAction = pAction;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.messageNotFromRepository";
  }
  
  @Override
  public List<String> parameterNames() {
    return MessageNotFromRepositoryMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMessage, fAction};
  }
  
  @Override
  public MessageNotFromRepositoryMatch toImmutable() {
    return isMutable() ? newMatch(fMessage, fAction) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"message\"=" + prettyPrintValue(fMessage) + ", ");
    
    result.append("\"action\"=" + prettyPrintValue(fAction)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMessage == null) ? 0 : fMessage.hashCode());
    result = prime * result + ((fAction == null) ? 0 : fAction.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MessageNotFromRepositoryMatch)) { // this should be infrequent
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
    MessageNotFromRepositoryMatch other = (MessageNotFromRepositoryMatch) obj;
    if (fMessage == null) {if (other.fMessage != null) return false;}
    else if (!fMessage.equals(other.fMessage)) return false;
    if (fAction == null) {if (other.fAction != null) return false;}
    else if (!fAction.equals(other.fAction)) return false;
    return true;
  }
  
  @Override
  public MessageNotFromRepositoryQuerySpecification specification() {
    try {
    	return MessageNotFromRepositoryQuerySpecification.instance();
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
  public static MessageNotFromRepositoryMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MessageNotFromRepositoryMatch newMutableMatch(final Message pMessage, final CommunicationAction pAction) {
    return new Mutable(pMessage, pAction);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MessageNotFromRepositoryMatch newMatch(final Message pMessage, final CommunicationAction pAction) {
    return new Immutable(pMessage, pAction);
  }
  
  private static final class Mutable extends MessageNotFromRepositoryMatch {
    Mutable(final Message pMessage, final CommunicationAction pAction) {
      super(pMessage, pAction);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MessageNotFromRepositoryMatch {
    Immutable(final Message pMessage, final CommunicationAction pAction) {
      super(pMessage, pAction);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
