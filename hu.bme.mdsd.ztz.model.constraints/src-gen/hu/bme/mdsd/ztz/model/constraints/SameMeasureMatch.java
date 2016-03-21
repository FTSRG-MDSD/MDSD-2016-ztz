package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.SameMeasureQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.sameMeasure pattern,
 * to be used in conjunction with {@link SameMeasureMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SameMeasureMatcher
 * @see SameMeasureProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SameMeasureMatch extends BasePatternMatch {
  private MeasureDimension fMeasure;
  
  private MeasureDimension fConvertedMeasure;
  
  private static List<String> parameterNames = makeImmutableList("measure", "convertedMeasure");
  
  private SameMeasureMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    this.fMeasure = pMeasure;
    this.fConvertedMeasure = pConvertedMeasure;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("measure".equals(parameterName)) return this.fMeasure;
    if ("convertedMeasure".equals(parameterName)) return this.fConvertedMeasure;
    return null;
  }
  
  public MeasureDimension getMeasure() {
    return this.fMeasure;
  }
  
  public MeasureDimension getConvertedMeasure() {
    return this.fConvertedMeasure;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("measure".equals(parameterName) ) {
    	this.fMeasure = (hu.bme.mdsd.ztz.model.drone.MeasureDimension) newValue;
    	return true;
    }
    if ("convertedMeasure".equals(parameterName) ) {
    	this.fConvertedMeasure = (hu.bme.mdsd.ztz.model.drone.MeasureDimension) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMeasure(final MeasureDimension pMeasure) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMeasure = pMeasure;
  }
  
  public void setConvertedMeasure(final MeasureDimension pConvertedMeasure) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fConvertedMeasure = pConvertedMeasure;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.sameMeasure";
  }
  
  @Override
  public List<String> parameterNames() {
    return SameMeasureMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMeasure, fConvertedMeasure};
  }
  
  @Override
  public SameMeasureMatch toImmutable() {
    return isMutable() ? newMatch(fMeasure, fConvertedMeasure) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"measure\"=" + prettyPrintValue(fMeasure) + ", ");
    
    result.append("\"convertedMeasure\"=" + prettyPrintValue(fConvertedMeasure)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMeasure == null) ? 0 : fMeasure.hashCode());
    result = prime * result + ((fConvertedMeasure == null) ? 0 : fConvertedMeasure.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SameMeasureMatch)) { // this should be infrequent
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
    SameMeasureMatch other = (SameMeasureMatch) obj;
    if (fMeasure == null) {if (other.fMeasure != null) return false;}
    else if (!fMeasure.equals(other.fMeasure)) return false;
    if (fConvertedMeasure == null) {if (other.fConvertedMeasure != null) return false;}
    else if (!fConvertedMeasure.equals(other.fConvertedMeasure)) return false;
    return true;
  }
  
  @Override
  public SameMeasureQuerySpecification specification() {
    try {
    	return SameMeasureQuerySpecification.instance();
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
  public static SameMeasureMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SameMeasureMatch newMutableMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    return new Mutable(pMeasure, pConvertedMeasure);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMeasure the fixed value of pattern parameter measure, or null if not bound.
   * @param pConvertedMeasure the fixed value of pattern parameter convertedMeasure, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SameMeasureMatch newMatch(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
    return new Immutable(pMeasure, pConvertedMeasure);
  }
  
  private static final class Mutable extends SameMeasureMatch {
    Mutable(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
      super(pMeasure, pConvertedMeasure);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SameMeasureMatch {
    Immutable(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure) {
      super(pMeasure, pConvertedMeasure);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
