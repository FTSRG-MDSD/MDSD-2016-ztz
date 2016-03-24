package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.util.MessageTargetQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.messageTarget pattern,
 * to be used in conjunction with {@link MessageTargetMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MessageTargetMatcher
 * @see MessageTargetProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MessageTargetMatch extends BasePatternMatch {
  private CommunicationAction fCommunicationAction;
  
  private DynamicRobot fTarget;
  
  private static List<String> parameterNames = makeImmutableList("communicationAction", "target");
  
  private MessageTargetMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    this.fCommunicationAction = pCommunicationAction;
    this.fTarget = pTarget;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("communicationAction".equals(parameterName)) return this.fCommunicationAction;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
  }
  
  public CommunicationAction getCommunicationAction() {
    return this.fCommunicationAction;
  }
  
  public DynamicRobot getTarget() {
    return this.fTarget;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("communicationAction".equals(parameterName) ) {
    	this.fCommunicationAction = (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) newValue;
    	return true;
    }
    return false;
  }
  
  public void setCommunicationAction(final CommunicationAction pCommunicationAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCommunicationAction = pCommunicationAction;
  }
  
  public void setTarget(final DynamicRobot pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.messageTarget";
  }
  
  @Override
  public List<String> parameterNames() {
    return MessageTargetMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCommunicationAction, fTarget};
  }
  
  @Override
  public MessageTargetMatch toImmutable() {
    return isMutable() ? newMatch(fCommunicationAction, fTarget) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"communicationAction\"=" + prettyPrintValue(fCommunicationAction) + ", ");
    
    result.append("\"target\"=" + prettyPrintValue(fTarget)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCommunicationAction == null) ? 0 : fCommunicationAction.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MessageTargetMatch)) { // this should be infrequent
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
    MessageTargetMatch other = (MessageTargetMatch) obj;
    if (fCommunicationAction == null) {if (other.fCommunicationAction != null) return false;}
    else if (!fCommunicationAction.equals(other.fCommunicationAction)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public MessageTargetQuerySpecification specification() {
    try {
    	return MessageTargetQuerySpecification.instance();
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
  public static MessageTargetMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MessageTargetMatch newMutableMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    return new Mutable(pCommunicationAction, pTarget);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MessageTargetMatch newMatch(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
    return new Immutable(pCommunicationAction, pTarget);
  }
  
  private static final class Mutable extends MessageTargetMatch {
    Mutable(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
      super(pCommunicationAction, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MessageTargetMatch {
    Immutable(final CommunicationAction pCommunicationAction, final DynamicRobot pTarget) {
      super(pCommunicationAction, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
