package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.util.MinMeasureQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.minMeasure pattern,
 * to be used in conjunction with {@link MinMeasureMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MinMeasureMatcher
 * @see MinMeasureProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MinMeasureMatch extends BasePatternMatch {
  private Robot fRobot;
  
  private Robot fCooperator;
  
  private MeasureValue fMinimum;
  
  private static List<String> parameterNames = makeImmutableList("robot", "cooperator", "minimum");
  
  private MinMeasureMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    this.fRobot = pRobot;
    this.fCooperator = pCooperator;
    this.fMinimum = pMinimum;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robot".equals(parameterName)) return this.fRobot;
    if ("cooperator".equals(parameterName)) return this.fCooperator;
    if ("minimum".equals(parameterName)) return this.fMinimum;
    return null;
  }
  
  public Robot getRobot() {
    return this.fRobot;
  }
  
  public Robot getCooperator() {
    return this.fCooperator;
  }
  
  public MeasureValue getMinimum() {
    return this.fMinimum;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robot".equals(parameterName) ) {
    	this.fRobot = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    if ("cooperator".equals(parameterName) ) {
    	this.fCooperator = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    if ("minimum".equals(parameterName) ) {
    	this.fMinimum = (hu.bme.mdsd.ztz.model.drone.MeasureValue) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobot(final Robot pRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobot = pRobot;
  }
  
  public void setCooperator(final Robot pCooperator) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCooperator = pCooperator;
  }
  
  public void setMinimum(final MeasureValue pMinimum) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMinimum = pMinimum;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.minMeasure";
  }
  
  @Override
  public List<String> parameterNames() {
    return MinMeasureMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobot, fCooperator, fMinimum};
  }
  
  @Override
  public MinMeasureMatch toImmutable() {
    return isMutable() ? newMatch(fRobot, fCooperator, fMinimum) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robot\"=" + prettyPrintValue(fRobot) + ", ");
    
    result.append("\"cooperator\"=" + prettyPrintValue(fCooperator) + ", ");
    
    result.append("\"minimum\"=" + prettyPrintValue(fMinimum)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobot == null) ? 0 : fRobot.hashCode());
    result = prime * result + ((fCooperator == null) ? 0 : fCooperator.hashCode());
    result = prime * result + ((fMinimum == null) ? 0 : fMinimum.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MinMeasureMatch)) { // this should be infrequent
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
    MinMeasureMatch other = (MinMeasureMatch) obj;
    if (fRobot == null) {if (other.fRobot != null) return false;}
    else if (!fRobot.equals(other.fRobot)) return false;
    if (fCooperator == null) {if (other.fCooperator != null) return false;}
    else if (!fCooperator.equals(other.fCooperator)) return false;
    if (fMinimum == null) {if (other.fMinimum != null) return false;}
    else if (!fMinimum.equals(other.fMinimum)) return false;
    return true;
  }
  
  @Override
  public MinMeasureQuerySpecification specification() {
    try {
    	return MinMeasureQuerySpecification.instance();
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
  public static MinMeasureMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MinMeasureMatch newMutableMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    return new Mutable(pRobot, pCooperator, pMinimum);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCooperator the fixed value of pattern parameter cooperator, or null if not bound.
   * @param pMinimum the fixed value of pattern parameter minimum, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MinMeasureMatch newMatch(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
    return new Immutable(pRobot, pCooperator, pMinimum);
  }
  
  private static final class Mutable extends MinMeasureMatch {
    Mutable(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
      super(pRobot, pCooperator, pMinimum);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MinMeasureMatch {
    Immutable(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum) {
      super(pRobot, pCooperator, pMinimum);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
