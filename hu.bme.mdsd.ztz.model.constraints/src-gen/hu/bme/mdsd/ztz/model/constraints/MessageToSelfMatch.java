package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.util.MessageToSelfQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.messageToSelf pattern,
 * to be used in conjunction with {@link MessageToSelfMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MessageToSelfMatcher
 * @see MessageToSelfProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MessageToSelfMatch extends BasePatternMatch {
  private DynamicRobot fDrobot;
  
  private CommunicationAction fCommunicationAction;
  
  private static List<String> parameterNames = makeImmutableList("drobot", "communicationAction");
  
  private MessageToSelfMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    this.fDrobot = pDrobot;
    this.fCommunicationAction = pCommunicationAction;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("drobot".equals(parameterName)) return this.fDrobot;
    if ("communicationAction".equals(parameterName)) return this.fCommunicationAction;
    return null;
  }
  
  public DynamicRobot getDrobot() {
    return this.fDrobot;
  }
  
  public CommunicationAction getCommunicationAction() {
    return this.fCommunicationAction;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("drobot".equals(parameterName) ) {
    	this.fDrobot = (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) newValue;
    	return true;
    }
    if ("communicationAction".equals(parameterName) ) {
    	this.fCommunicationAction = (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDrobot(final DynamicRobot pDrobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDrobot = pDrobot;
  }
  
  public void setCommunicationAction(final CommunicationAction pCommunicationAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCommunicationAction = pCommunicationAction;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.messageToSelf";
  }
  
  @Override
  public List<String> parameterNames() {
    return MessageToSelfMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDrobot, fCommunicationAction};
  }
  
  @Override
  public MessageToSelfMatch toImmutable() {
    return isMutable() ? newMatch(fDrobot, fCommunicationAction) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"drobot\"=" + prettyPrintValue(fDrobot) + ", ");
    
    result.append("\"communicationAction\"=" + prettyPrintValue(fCommunicationAction)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDrobot == null) ? 0 : fDrobot.hashCode());
    result = prime * result + ((fCommunicationAction == null) ? 0 : fCommunicationAction.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MessageToSelfMatch)) { // this should be infrequent
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
    MessageToSelfMatch other = (MessageToSelfMatch) obj;
    if (fDrobot == null) {if (other.fDrobot != null) return false;}
    else if (!fDrobot.equals(other.fDrobot)) return false;
    if (fCommunicationAction == null) {if (other.fCommunicationAction != null) return false;}
    else if (!fCommunicationAction.equals(other.fCommunicationAction)) return false;
    return true;
  }
  
  @Override
  public MessageToSelfQuerySpecification specification() {
    try {
    	return MessageToSelfQuerySpecification.instance();
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
  public static MessageToSelfMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MessageToSelfMatch newMutableMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    return new Mutable(pDrobot, pCommunicationAction);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MessageToSelfMatch newMatch(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
    return new Immutable(pDrobot, pCommunicationAction);
  }
  
  private static final class Mutable extends MessageToSelfMatch {
    Mutable(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
      super(pDrobot, pCommunicationAction);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MessageToSelfMatch {
    Immutable(final DynamicRobot pDrobot, final CommunicationAction pCommunicationAction) {
      super(pDrobot, pCommunicationAction);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
