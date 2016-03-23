package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.SizeDimensionsDifferQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.Size;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.sizeDimensionsDiffer pattern,
 * to be used in conjunction with {@link SizeDimensionsDifferMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SizeDimensionsDifferMatcher
 * @see SizeDimensionsDifferProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SizeDimensionsDifferMatch extends BasePatternMatch {
  private Robot fRobot;
  
  private Size fSize;
  
  private static List<String> parameterNames = makeImmutableList("robot", "size");
  
  private SizeDimensionsDifferMatch(final Robot pRobot, final Size pSize) {
    this.fRobot = pRobot;
    this.fSize = pSize;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robot".equals(parameterName)) return this.fRobot;
    if ("size".equals(parameterName)) return this.fSize;
    return null;
  }
  
  public Robot getRobot() {
    return this.fRobot;
  }
  
  public Size getSize() {
    return this.fSize;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robot".equals(parameterName) ) {
    	this.fRobot = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    if ("size".equals(parameterName) ) {
    	this.fSize = (hu.bme.mdsd.ztz.model.drone.Size) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobot(final Robot pRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobot = pRobot;
  }
  
  public void setSize(final Size pSize) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSize = pSize;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.sizeDimensionsDiffer";
  }
  
  @Override
  public List<String> parameterNames() {
    return SizeDimensionsDifferMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobot, fSize};
  }
  
  @Override
  public SizeDimensionsDifferMatch toImmutable() {
    return isMutable() ? newMatch(fRobot, fSize) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robot\"=" + prettyPrintValue(fRobot) + ", ");
    
    result.append("\"size\"=" + prettyPrintValue(fSize)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobot == null) ? 0 : fRobot.hashCode());
    result = prime * result + ((fSize == null) ? 0 : fSize.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SizeDimensionsDifferMatch)) { // this should be infrequent
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
    SizeDimensionsDifferMatch other = (SizeDimensionsDifferMatch) obj;
    if (fRobot == null) {if (other.fRobot != null) return false;}
    else if (!fRobot.equals(other.fRobot)) return false;
    if (fSize == null) {if (other.fSize != null) return false;}
    else if (!fSize.equals(other.fSize)) return false;
    return true;
  }
  
  @Override
  public SizeDimensionsDifferQuerySpecification specification() {
    try {
    	return SizeDimensionsDifferQuerySpecification.instance();
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
  public static SizeDimensionsDifferMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SizeDimensionsDifferMatch newMutableMatch(final Robot pRobot, final Size pSize) {
    return new Mutable(pRobot, pSize);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pSize the fixed value of pattern parameter size, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SizeDimensionsDifferMatch newMatch(final Robot pRobot, final Size pSize) {
    return new Immutable(pRobot, pSize);
  }
  
  private static final class Mutable extends SizeDimensionsDifferMatch {
    Mutable(final Robot pRobot, final Size pSize) {
      super(pRobot, pSize);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SizeDimensionsDifferMatch {
    Immutable(final Robot pRobot, final Size pSize) {
      super(pRobot, pSize);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
