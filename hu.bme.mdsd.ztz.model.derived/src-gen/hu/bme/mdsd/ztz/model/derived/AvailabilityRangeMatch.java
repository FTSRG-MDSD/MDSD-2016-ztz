package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.derived.util.AvailabilityRangeQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.availabilityRange pattern,
 * to be used in conjunction with {@link AvailabilityRangeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AvailabilityRangeMatcher
 * @see AvailabilityRangeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AvailabilityRangeMatch extends BasePatternMatch {
  private RobotCollaboration fRobotCollaboration;
  
  private MeasureValue fMinimumRange;
  
  private static List<String> parameterNames = makeImmutableList("robotCollaboration", "minimumRange");
  
  private AvailabilityRangeMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    this.fRobotCollaboration = pRobotCollaboration;
    this.fMinimumRange = pMinimumRange;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robotCollaboration".equals(parameterName)) return this.fRobotCollaboration;
    if ("minimumRange".equals(parameterName)) return this.fMinimumRange;
    return null;
  }
  
  public RobotCollaboration getRobotCollaboration() {
    return this.fRobotCollaboration;
  }
  
  public MeasureValue getMinimumRange() {
    return this.fMinimumRange;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robotCollaboration".equals(parameterName) ) {
    	this.fRobotCollaboration = (hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration) newValue;
    	return true;
    }
    if ("minimumRange".equals(parameterName) ) {
    	this.fMinimumRange = (hu.bme.mdsd.ztz.model.drone.MeasureValue) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobotCollaboration(final RobotCollaboration pRobotCollaboration) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobotCollaboration = pRobotCollaboration;
  }
  
  public void setMinimumRange(final MeasureValue pMinimumRange) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMinimumRange = pMinimumRange;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.availabilityRange";
  }
  
  @Override
  public List<String> parameterNames() {
    return AvailabilityRangeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobotCollaboration, fMinimumRange};
  }
  
  @Override
  public AvailabilityRangeMatch toImmutable() {
    return isMutable() ? newMatch(fRobotCollaboration, fMinimumRange) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robotCollaboration\"=" + prettyPrintValue(fRobotCollaboration) + ", ");
    
    result.append("\"minimumRange\"=" + prettyPrintValue(fMinimumRange)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobotCollaboration == null) ? 0 : fRobotCollaboration.hashCode());
    result = prime * result + ((fMinimumRange == null) ? 0 : fMinimumRange.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AvailabilityRangeMatch)) { // this should be infrequent
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
    AvailabilityRangeMatch other = (AvailabilityRangeMatch) obj;
    if (fRobotCollaboration == null) {if (other.fRobotCollaboration != null) return false;}
    else if (!fRobotCollaboration.equals(other.fRobotCollaboration)) return false;
    if (fMinimumRange == null) {if (other.fMinimumRange != null) return false;}
    else if (!fMinimumRange.equals(other.fMinimumRange)) return false;
    return true;
  }
  
  @Override
  public AvailabilityRangeQuerySpecification specification() {
    try {
    	return AvailabilityRangeQuerySpecification.instance();
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
  public static AvailabilityRangeMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AvailabilityRangeMatch newMutableMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    return new Mutable(pRobotCollaboration, pMinimumRange);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobotCollaboration the fixed value of pattern parameter robotCollaboration, or null if not bound.
   * @param pMinimumRange the fixed value of pattern parameter minimumRange, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AvailabilityRangeMatch newMatch(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
    return new Immutable(pRobotCollaboration, pMinimumRange);
  }
  
  private static final class Mutable extends AvailabilityRangeMatch {
    Mutable(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
      super(pRobotCollaboration, pMinimumRange);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AvailabilityRangeMatch {
    Immutable(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange) {
      super(pRobotCollaboration, pMinimumRange);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
