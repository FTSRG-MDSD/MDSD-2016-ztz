package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.RobotHasBatteryQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Battery;
import hu.bme.mdsd.ztz.model.drone.Robot;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.robotHasBattery pattern,
 * to be used in conjunction with {@link RobotHasBatteryMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RobotHasBatteryMatcher
 * @see RobotHasBatteryProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RobotHasBatteryMatch extends BasePatternMatch {
  private Robot fRobot;
  
  private Battery fBattery;
  
  private static List<String> parameterNames = makeImmutableList("robot", "battery");
  
  private RobotHasBatteryMatch(final Robot pRobot, final Battery pBattery) {
    this.fRobot = pRobot;
    this.fBattery = pBattery;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robot".equals(parameterName)) return this.fRobot;
    if ("battery".equals(parameterName)) return this.fBattery;
    return null;
  }
  
  public Robot getRobot() {
    return this.fRobot;
  }
  
  public Battery getBattery() {
    return this.fBattery;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robot".equals(parameterName) ) {
    	this.fRobot = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    if ("battery".equals(parameterName) ) {
    	this.fBattery = (hu.bme.mdsd.ztz.model.drone.Battery) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobot(final Robot pRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobot = pRobot;
  }
  
  public void setBattery(final Battery pBattery) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fBattery = pBattery;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.robotHasBattery";
  }
  
  @Override
  public List<String> parameterNames() {
    return RobotHasBatteryMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobot, fBattery};
  }
  
  @Override
  public RobotHasBatteryMatch toImmutable() {
    return isMutable() ? newMatch(fRobot, fBattery) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robot\"=" + prettyPrintValue(fRobot) + ", ");
    
    result.append("\"battery\"=" + prettyPrintValue(fBattery)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobot == null) ? 0 : fRobot.hashCode());
    result = prime * result + ((fBattery == null) ? 0 : fBattery.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RobotHasBatteryMatch)) { // this should be infrequent
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
    RobotHasBatteryMatch other = (RobotHasBatteryMatch) obj;
    if (fRobot == null) {if (other.fRobot != null) return false;}
    else if (!fRobot.equals(other.fRobot)) return false;
    if (fBattery == null) {if (other.fBattery != null) return false;}
    else if (!fBattery.equals(other.fBattery)) return false;
    return true;
  }
  
  @Override
  public RobotHasBatteryQuerySpecification specification() {
    try {
    	return RobotHasBatteryQuerySpecification.instance();
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
  public static RobotHasBatteryMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RobotHasBatteryMatch newMutableMatch(final Robot pRobot, final Battery pBattery) {
    return new Mutable(pRobot, pBattery);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pBattery the fixed value of pattern parameter battery, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RobotHasBatteryMatch newMatch(final Robot pRobot, final Battery pBattery) {
    return new Immutable(pRobot, pBattery);
  }
  
  private static final class Mutable extends RobotHasBatteryMatch {
    Mutable(final Robot pRobot, final Battery pBattery) {
      super(pRobot, pBattery);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RobotHasBatteryMatch {
    Immutable(final Robot pRobot, final Battery pBattery) {
      super(pRobot, pBattery);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
