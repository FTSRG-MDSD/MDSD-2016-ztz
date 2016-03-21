package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.SameCollaboratorRobotQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Robot;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.sameCollaboratorRobot pattern,
 * to be used in conjunction with {@link SameCollaboratorRobotMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SameCollaboratorRobotMatcher
 * @see SameCollaboratorRobotProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SameCollaboratorRobotMatch extends BasePatternMatch {
  private Robot fRobot;
  
  private static List<String> parameterNames = makeImmutableList("robot");
  
  private SameCollaboratorRobotMatch(final Robot pRobot) {
    this.fRobot = pRobot;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robot".equals(parameterName)) return this.fRobot;
    return null;
  }
  
  public Robot getRobot() {
    return this.fRobot;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robot".equals(parameterName) ) {
    	this.fRobot = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobot(final Robot pRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobot = pRobot;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.sameCollaboratorRobot";
  }
  
  @Override
  public List<String> parameterNames() {
    return SameCollaboratorRobotMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobot};
  }
  
  @Override
  public SameCollaboratorRobotMatch toImmutable() {
    return isMutable() ? newMatch(fRobot) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robot\"=" + prettyPrintValue(fRobot)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobot == null) ? 0 : fRobot.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SameCollaboratorRobotMatch)) { // this should be infrequent
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
    SameCollaboratorRobotMatch other = (SameCollaboratorRobotMatch) obj;
    if (fRobot == null) {if (other.fRobot != null) return false;}
    else if (!fRobot.equals(other.fRobot)) return false;
    return true;
  }
  
  @Override
  public SameCollaboratorRobotQuerySpecification specification() {
    try {
    	return SameCollaboratorRobotQuerySpecification.instance();
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
  public static SameCollaboratorRobotMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SameCollaboratorRobotMatch newMutableMatch(final Robot pRobot) {
    return new Mutable(pRobot);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SameCollaboratorRobotMatch newMatch(final Robot pRobot) {
    return new Immutable(pRobot);
  }
  
  private static final class Mutable extends SameCollaboratorRobotMatch {
    Mutable(final Robot pRobot) {
      super(pRobot);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SameCollaboratorRobotMatch {
    Immutable(final Robot pRobot) {
      super(pRobot);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
