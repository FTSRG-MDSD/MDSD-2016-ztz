package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.constraints.util.CommunicationActionWithoutMessageQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.communicationActionWithoutMessage pattern,
 * to be used in conjunction with {@link CommunicationActionWithoutMessageMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CommunicationActionWithoutMessageMatcher
 * @see CommunicationActionWithoutMessageProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CommunicationActionWithoutMessageMatch extends BasePatternMatch {
  private CommunicationAction fCommunicationAction;
  
  private static List<String> parameterNames = makeImmutableList("communicationAction");
  
  private CommunicationActionWithoutMessageMatch(final CommunicationAction pCommunicationAction) {
    this.fCommunicationAction = pCommunicationAction;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("communicationAction".equals(parameterName)) return this.fCommunicationAction;
    return null;
  }
  
  public CommunicationAction getCommunicationAction() {
    return this.fCommunicationAction;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("communicationAction".equals(parameterName) ) {
    	this.fCommunicationAction = (hu.bme.mdsd.ztz.model.behaviour.CommunicationAction) newValue;
    	return true;
    }
    return false;
  }
  
  public void setCommunicationAction(final CommunicationAction pCommunicationAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCommunicationAction = pCommunicationAction;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.communicationActionWithoutMessage";
  }
  
  @Override
  public List<String> parameterNames() {
    return CommunicationActionWithoutMessageMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCommunicationAction};
  }
  
  @Override
  public CommunicationActionWithoutMessageMatch toImmutable() {
    return isMutable() ? newMatch(fCommunicationAction) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"communicationAction\"=" + prettyPrintValue(fCommunicationAction)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCommunicationAction == null) ? 0 : fCommunicationAction.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CommunicationActionWithoutMessageMatch)) { // this should be infrequent
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
    CommunicationActionWithoutMessageMatch other = (CommunicationActionWithoutMessageMatch) obj;
    if (fCommunicationAction == null) {if (other.fCommunicationAction != null) return false;}
    else if (!fCommunicationAction.equals(other.fCommunicationAction)) return false;
    return true;
  }
  
  @Override
  public CommunicationActionWithoutMessageQuerySpecification specification() {
    try {
    	return CommunicationActionWithoutMessageQuerySpecification.instance();
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
  public static CommunicationActionWithoutMessageMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CommunicationActionWithoutMessageMatch newMutableMatch(final CommunicationAction pCommunicationAction) {
    return new Mutable(pCommunicationAction);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCommunicationAction the fixed value of pattern parameter communicationAction, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CommunicationActionWithoutMessageMatch newMatch(final CommunicationAction pCommunicationAction) {
    return new Immutable(pCommunicationAction);
  }
  
  private static final class Mutable extends CommunicationActionWithoutMessageMatch {
    Mutable(final CommunicationAction pCommunicationAction) {
      super(pCommunicationAction);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CommunicationActionWithoutMessageMatch {
    Immutable(final CommunicationAction pCommunicationAction) {
      super(pCommunicationAction);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
