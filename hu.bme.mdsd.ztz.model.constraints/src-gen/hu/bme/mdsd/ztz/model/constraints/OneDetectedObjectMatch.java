package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.OneDetectedObjectQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.DetectedObject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.oneDetectedObject pattern,
 * to be used in conjunction with {@link OneDetectedObjectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see OneDetectedObjectMatcher
 * @see OneDetectedObjectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class OneDetectedObjectMatch extends BasePatternMatch {
  private AreaObject fObject;
  
  private DetectedObject fDetected1;
  
  private static List<String> parameterNames = makeImmutableList("object", "detected1");
  
  private OneDetectedObjectMatch(final AreaObject pObject, final DetectedObject pDetected1) {
    this.fObject = pObject;
    this.fDetected1 = pDetected1;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("object".equals(parameterName)) return this.fObject;
    if ("detected1".equals(parameterName)) return this.fDetected1;
    return null;
  }
  
  public AreaObject getObject() {
    return this.fObject;
  }
  
  public DetectedObject getDetected1() {
    return this.fDetected1;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("object".equals(parameterName) ) {
    	this.fObject = (hu.bme.mdsd.ztz.model.drone.AreaObject) newValue;
    	return true;
    }
    if ("detected1".equals(parameterName) ) {
    	this.fDetected1 = (hu.bme.mdsd.ztz.model.drone.DetectedObject) newValue;
    	return true;
    }
    return false;
  }
  
  public void setObject(final AreaObject pObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fObject = pObject;
  }
  
  public void setDetected1(final DetectedObject pDetected1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDetected1 = pDetected1;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.oneDetectedObject";
  }
  
  @Override
  public List<String> parameterNames() {
    return OneDetectedObjectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fObject, fDetected1};
  }
  
  @Override
  public OneDetectedObjectMatch toImmutable() {
    return isMutable() ? newMatch(fObject, fDetected1) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"object\"=" + prettyPrintValue(fObject) + ", ");
    
    result.append("\"detected1\"=" + prettyPrintValue(fDetected1)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fObject == null) ? 0 : fObject.hashCode());
    result = prime * result + ((fDetected1 == null) ? 0 : fDetected1.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof OneDetectedObjectMatch)) { // this should be infrequent
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
    OneDetectedObjectMatch other = (OneDetectedObjectMatch) obj;
    if (fObject == null) {if (other.fObject != null) return false;}
    else if (!fObject.equals(other.fObject)) return false;
    if (fDetected1 == null) {if (other.fDetected1 != null) return false;}
    else if (!fDetected1.equals(other.fDetected1)) return false;
    return true;
  }
  
  @Override
  public OneDetectedObjectQuerySpecification specification() {
    try {
    	return OneDetectedObjectQuerySpecification.instance();
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
  public static OneDetectedObjectMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static OneDetectedObjectMatch newMutableMatch(final AreaObject pObject, final DetectedObject pDetected1) {
    return new Mutable(pObject, pDetected1);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param pDetected1 the fixed value of pattern parameter detected1, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static OneDetectedObjectMatch newMatch(final AreaObject pObject, final DetectedObject pDetected1) {
    return new Immutable(pObject, pDetected1);
  }
  
  private static final class Mutable extends OneDetectedObjectMatch {
    Mutable(final AreaObject pObject, final DetectedObject pDetected1) {
      super(pObject, pDetected1);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends OneDetectedObjectMatch {
    Immutable(final AreaObject pObject, final DetectedObject pDetected1) {
      super(pObject, pDetected1);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
