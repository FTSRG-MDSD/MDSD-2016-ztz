package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.MultipleCapabilityPropertiesQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.Robot;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.multipleCapabilityProperties pattern,
 * to be used in conjunction with {@link MultipleCapabilityPropertiesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MultipleCapabilityPropertiesMatcher
 * @see MultipleCapabilityPropertiesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MultipleCapabilityPropertiesMatch extends BasePatternMatch {
  private Robot fRobot;
  
  private Capability fCapability;
  
  private static List<String> parameterNames = makeImmutableList("robot", "capability");
  
  private MultipleCapabilityPropertiesMatch(final Robot pRobot, final Capability pCapability) {
    this.fRobot = pRobot;
    this.fCapability = pCapability;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robot".equals(parameterName)) return this.fRobot;
    if ("capability".equals(parameterName)) return this.fCapability;
    return null;
  }
  
  public Robot getRobot() {
    return this.fRobot;
  }
  
  public Capability getCapability() {
    return this.fCapability;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robot".equals(parameterName) ) {
    	this.fRobot = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    if ("capability".equals(parameterName) ) {
    	this.fCapability = (hu.bme.mdsd.ztz.model.drone.Capability) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobot(final Robot pRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobot = pRobot;
  }
  
  public void setCapability(final Capability pCapability) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCapability = pCapability;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.multipleCapabilityProperties";
  }
  
  @Override
  public List<String> parameterNames() {
    return MultipleCapabilityPropertiesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobot, fCapability};
  }
  
  @Override
  public MultipleCapabilityPropertiesMatch toImmutable() {
    return isMutable() ? newMatch(fRobot, fCapability) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robot\"=" + prettyPrintValue(fRobot) + ", ");
    
    result.append("\"capability\"=" + prettyPrintValue(fCapability)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobot == null) ? 0 : fRobot.hashCode());
    result = prime * result + ((fCapability == null) ? 0 : fCapability.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MultipleCapabilityPropertiesMatch)) { // this should be infrequent
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
    MultipleCapabilityPropertiesMatch other = (MultipleCapabilityPropertiesMatch) obj;
    if (fRobot == null) {if (other.fRobot != null) return false;}
    else if (!fRobot.equals(other.fRobot)) return false;
    if (fCapability == null) {if (other.fCapability != null) return false;}
    else if (!fCapability.equals(other.fCapability)) return false;
    return true;
  }
  
  @Override
  public MultipleCapabilityPropertiesQuerySpecification specification() {
    try {
    	return MultipleCapabilityPropertiesQuerySpecification.instance();
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
  public static MultipleCapabilityPropertiesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MultipleCapabilityPropertiesMatch newMutableMatch(final Robot pRobot, final Capability pCapability) {
    return new Mutable(pRobot, pCapability);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MultipleCapabilityPropertiesMatch newMatch(final Robot pRobot, final Capability pCapability) {
    return new Immutable(pRobot, pCapability);
  }
  
  private static final class Mutable extends MultipleCapabilityPropertiesMatch {
    Mutable(final Robot pRobot, final Capability pCapability) {
      super(pRobot, pCapability);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MultipleCapabilityPropertiesMatch {
    Immutable(final Robot pRobot, final Capability pCapability) {
      super(pRobot, pCapability);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
