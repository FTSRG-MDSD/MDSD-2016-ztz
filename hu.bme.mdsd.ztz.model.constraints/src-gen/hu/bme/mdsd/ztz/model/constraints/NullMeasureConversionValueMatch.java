package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.NullMeasureConversionValueQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.nullMeasureConversionValue pattern,
 * to be used in conjunction with {@link NullMeasureConversionValueMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NullMeasureConversionValueMatcher
 * @see NullMeasureConversionValueProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NullMeasureConversionValueMatch extends BasePatternMatch {
  private MeasureConversion fConversion;
  
  private static List<String> parameterNames = makeImmutableList("conversion");
  
  private NullMeasureConversionValueMatch(final MeasureConversion pConversion) {
    this.fConversion = pConversion;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("conversion".equals(parameterName)) return this.fConversion;
    return null;
  }
  
  public MeasureConversion getConversion() {
    return this.fConversion;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("conversion".equals(parameterName) ) {
    	this.fConversion = (hu.bme.mdsd.ztz.model.drone.MeasureConversion) newValue;
    	return true;
    }
    return false;
  }
  
  public void setConversion(final MeasureConversion pConversion) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fConversion = pConversion;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.nullMeasureConversionValue";
  }
  
  @Override
  public List<String> parameterNames() {
    return NullMeasureConversionValueMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fConversion};
  }
  
  @Override
  public NullMeasureConversionValueMatch toImmutable() {
    return isMutable() ? newMatch(fConversion) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"conversion\"=" + prettyPrintValue(fConversion)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fConversion == null) ? 0 : fConversion.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NullMeasureConversionValueMatch)) { // this should be infrequent
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
    NullMeasureConversionValueMatch other = (NullMeasureConversionValueMatch) obj;
    if (fConversion == null) {if (other.fConversion != null) return false;}
    else if (!fConversion.equals(other.fConversion)) return false;
    return true;
  }
  
  @Override
  public NullMeasureConversionValueQuerySpecification specification() {
    try {
    	return NullMeasureConversionValueQuerySpecification.instance();
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
  public static NullMeasureConversionValueMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NullMeasureConversionValueMatch newMutableMatch(final MeasureConversion pConversion) {
    return new Mutable(pConversion);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConversion the fixed value of pattern parameter conversion, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NullMeasureConversionValueMatch newMatch(final MeasureConversion pConversion) {
    return new Immutable(pConversion);
  }
  
  private static final class Mutable extends NullMeasureConversionValueMatch {
    Mutable(final MeasureConversion pConversion) {
      super(pConversion);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NullMeasureConversionValueMatch {
    Immutable(final MeasureConversion pConversion) {
      super(pConversion);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
