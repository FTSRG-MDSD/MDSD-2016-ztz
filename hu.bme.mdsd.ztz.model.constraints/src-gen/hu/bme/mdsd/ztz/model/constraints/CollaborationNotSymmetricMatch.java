package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.CollaborationNotSymmetricQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Robot;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.collaborationNotSymmetric pattern,
 * to be used in conjunction with {@link CollaborationNotSymmetricMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CollaborationNotSymmetricMatcher
 * @see CollaborationNotSymmetricProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CollaborationNotSymmetricMatch extends BasePatternMatch {
  private Robot fRobot;
  
  private Robot fCollaborator;
  
  private static List<String> parameterNames = makeImmutableList("robot", "collaborator");
  
  private CollaborationNotSymmetricMatch(final Robot pRobot, final Robot pCollaborator) {
    this.fRobot = pRobot;
    this.fCollaborator = pCollaborator;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robot".equals(parameterName)) return this.fRobot;
    if ("collaborator".equals(parameterName)) return this.fCollaborator;
    return null;
  }
  
  public Robot getRobot() {
    return this.fRobot;
  }
  
  public Robot getCollaborator() {
    return this.fCollaborator;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robot".equals(parameterName) ) {
    	this.fRobot = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    if ("collaborator".equals(parameterName) ) {
    	this.fCollaborator = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobot(final Robot pRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobot = pRobot;
  }
  
  public void setCollaborator(final Robot pCollaborator) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCollaborator = pCollaborator;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.collaborationNotSymmetric";
  }
  
  @Override
  public List<String> parameterNames() {
    return CollaborationNotSymmetricMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobot, fCollaborator};
  }
  
  @Override
  public CollaborationNotSymmetricMatch toImmutable() {
    return isMutable() ? newMatch(fRobot, fCollaborator) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robot\"=" + prettyPrintValue(fRobot) + ", ");
    
    result.append("\"collaborator\"=" + prettyPrintValue(fCollaborator)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobot == null) ? 0 : fRobot.hashCode());
    result = prime * result + ((fCollaborator == null) ? 0 : fCollaborator.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CollaborationNotSymmetricMatch)) { // this should be infrequent
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
    CollaborationNotSymmetricMatch other = (CollaborationNotSymmetricMatch) obj;
    if (fRobot == null) {if (other.fRobot != null) return false;}
    else if (!fRobot.equals(other.fRobot)) return false;
    if (fCollaborator == null) {if (other.fCollaborator != null) return false;}
    else if (!fCollaborator.equals(other.fCollaborator)) return false;
    return true;
  }
  
  @Override
  public CollaborationNotSymmetricQuerySpecification specification() {
    try {
    	return CollaborationNotSymmetricQuerySpecification.instance();
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
  public static CollaborationNotSymmetricMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCollaborator the fixed value of pattern parameter collaborator, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CollaborationNotSymmetricMatch newMutableMatch(final Robot pRobot, final Robot pCollaborator) {
    return new Mutable(pRobot, pCollaborator);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCollaborator the fixed value of pattern parameter collaborator, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CollaborationNotSymmetricMatch newMatch(final Robot pRobot, final Robot pCollaborator) {
    return new Immutable(pRobot, pCollaborator);
  }
  
  private static final class Mutable extends CollaborationNotSymmetricMatch {
    Mutable(final Robot pRobot, final Robot pCollaborator) {
      super(pRobot, pCollaborator);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CollaborationNotSymmetricMatch {
    Immutable(final Robot pRobot, final Robot pCollaborator) {
      super(pRobot, pCollaborator);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
