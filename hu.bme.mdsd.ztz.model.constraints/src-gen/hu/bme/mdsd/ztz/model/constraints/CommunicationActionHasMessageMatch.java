package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.constraints.util.CommunicationActionHasMessageQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.communicationActionHasMessage pattern,
 * to be used in conjunction with {@link CommunicationActionHasMessageMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CommunicationActionHasMessageMatcher
 * @see CommunicationActionHasMessageProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CommunicationActionHasMessageMatch extends BasePatternMatch {
  private CommunicationAction fCommunicationAction;
  
  private Message fMessage;
  
  private static List<String> parameterNames = makeImmutableList("communicationAction", "message");
  
  private CommunicationActionHasMessageMatch(final CommunicationAction pCommunicationAction, final Message pMessage) {
    this.fCommunicationAction = pCommunicationAction;
    this.fMessage = pMessage;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("communicationAction".equals(parameterName)) return this.fCommunicationAction;
    if ("message".equals(parameterName)) return this.fMessage;
    return null;
  }
  
  public CommunicationAction getCommunicationAction() {
    return this.fCommunicationAction;
  }
  
  public Message getMessage() {
    return this.fMessage;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("communicationAction".equals(parameterName) ) {
    	this.fCommunicationAction = (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) newValue;
    	return true;
    }
    if ("message".equals(parameterName) ) {
    	this.fMessage = (hu.bme.mdsd.ztz.model.behaviour.Message) newValue;
    	return true;
    }
    return false;
  }
  
  public void setCommunicationAction(final CommunicationAction pCommunicationAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCommunicationAction = pCommunicationAction;
  }
  
  public void setMessage(final Message pMessage) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMessage = pMessage;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.communicationActionHasMessage";
  }
  
  @Override
  public List<String> parameterNames() {
    return CommunicationActionHasMessageMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCommunicationAction, fMessage};
  }
  
  @Override
  public CommunicationActionHasMessageMatch toImmutable() {
    return isMutable() ? newMatch(fCommunicationAction, fMessage) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"communicationAction\"=" + prettyPrintValue(fCommunicationAction) + ", ");
    
    result.append("\"message\"=" + prettyPrintValue(fMessage)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCommunicationAction == null) ? 0 : fCommunicationAction.hashCode());
    result = prime * result + ((fMessage == null) ? 0 : fMessage.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CommunicationActionHasMessageMatch)) { // this should be infrequent
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
    CommunicationActionHasMessageMatch other = (CommunicationActionHasMessageMatch) obj;
    if (fCommunicationAction == null) {if (other.fCommunicationAction != null) return false;}
    else if (!fCommunicationAction.equals(other.fCommunicationAction)) return false;
    if (fMessage == null) {if (other.fMessage != null) return false;}
    else if (!fMessage.equals(other.fMessage)) return false;
    return true;
  }
  
  @Override
  public CommunicationActionHasMessageQuerySpecification specification() {
    try {
    	return CommunicationActionHasMessageQuerySpecification.instance();
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
  public static CommunicationActionHasMessageMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CommunicationActionHasMessageMatch newMutableMatch(final CommunicationAction pCommunicationAction, final Message pMessage) {
    return new Mutable(pCommunicationAction, pMessage);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pMessage the fixed value of pattern parameter message, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CommunicationActionHasMessageMatch newMatch(final CommunicationAction pCommunicationAction, final Message pMessage) {
    return new Immutable(pCommunicationAction, pMessage);
  }
  
  private static final class Mutable extends CommunicationActionHasMessageMatch {
    Mutable(final CommunicationAction pCommunicationAction, final Message pMessage) {
      super(pCommunicationAction, pMessage);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CommunicationActionHasMessageMatch {
    Immutable(final CommunicationAction pCommunicationAction, final Message pMessage) {
      super(pCommunicationAction, pMessage);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
