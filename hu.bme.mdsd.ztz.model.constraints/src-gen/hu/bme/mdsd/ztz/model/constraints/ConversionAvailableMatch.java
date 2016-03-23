package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.ConversionAvailableQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.conversionAvailable pattern,
 * to be used in conjunction with {@link ConversionAvailableMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ConversionAvailableMatcher
 * @see ConversionAvailableProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ConversionAvailableMatch extends BasePatternMatch {
  private MeasureDimension fDim1;
  
  private MeasureDimension fDim2;
  
  private static List<String> parameterNames = makeImmutableList("dim1", "dim2");
  
  private ConversionAvailableMatch(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    this.fDim1 = pDim1;
    this.fDim2 = pDim2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("dim1".equals(parameterName)) return this.fDim1;
    if ("dim2".equals(parameterName)) return this.fDim2;
    return null;
  }
  
  public MeasureDimension getDim1() {
    return this.fDim1;
  }
  
  public MeasureDimension getDim2() {
    return this.fDim2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("dim1".equals(parameterName) ) {
    	this.fDim1 = (hu.bme.mdsd.ztz.model.drone.MeasureDimension) newValue;
    	return true;
    }
    if ("dim2".equals(parameterName) ) {
    	this.fDim2 = (hu.bme.mdsd.ztz.model.drone.MeasureDimension) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDim1(final MeasureDimension pDim1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDim1 = pDim1;
  }
  
  public void setDim2(final MeasureDimension pDim2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDim2 = pDim2;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.conversionAvailable";
  }
  
  @Override
  public List<String> parameterNames() {
    return ConversionAvailableMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDim1, fDim2};
  }
  
  @Override
  public ConversionAvailableMatch toImmutable() {
    return isMutable() ? newMatch(fDim1, fDim2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"dim1\"=" + prettyPrintValue(fDim1) + ", ");
    
    result.append("\"dim2\"=" + prettyPrintValue(fDim2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDim1 == null) ? 0 : fDim1.hashCode());
    result = prime * result + ((fDim2 == null) ? 0 : fDim2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ConversionAvailableMatch)) { // this should be infrequent
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
    ConversionAvailableMatch other = (ConversionAvailableMatch) obj;
    if (fDim1 == null) {if (other.fDim1 != null) return false;}
    else if (!fDim1.equals(other.fDim1)) return false;
    if (fDim2 == null) {if (other.fDim2 != null) return false;}
    else if (!fDim2.equals(other.fDim2)) return false;
    return true;
  }
  
  @Override
  public ConversionAvailableQuerySpecification specification() {
    try {
    	return ConversionAvailableQuerySpecification.instance();
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
  public static ConversionAvailableMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ConversionAvailableMatch newMutableMatch(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    return new Mutable(pDim1, pDim2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDim1 the fixed value of pattern parameter dim1, or null if not bound.
   * @param pDim2 the fixed value of pattern parameter dim2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ConversionAvailableMatch newMatch(final MeasureDimension pDim1, final MeasureDimension pDim2) {
    return new Immutable(pDim1, pDim2);
  }
  
  private static final class Mutable extends ConversionAvailableMatch {
    Mutable(final MeasureDimension pDim1, final MeasureDimension pDim2) {
      super(pDim1, pDim2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ConversionAvailableMatch {
    Immutable(final MeasureDimension pDim1, final MeasureDimension pDim2) {
      super(pDim1, pDim2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
