package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.util.EstimatedTimeQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Task;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.estimatedTime pattern,
 * to be used in conjunction with {@link EstimatedTimeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EstimatedTimeMatcher
 * @see EstimatedTimeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EstimatedTimeMatch extends BasePatternMatch {
  private Task fSourceTask;
  
  private MeasureValue fTargetMeasure;
  
  private static List<String> parameterNames = makeImmutableList("sourceTask", "targetMeasure");
  
  private EstimatedTimeMatch(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    this.fSourceTask = pSourceTask;
    this.fTargetMeasure = pTargetMeasure;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sourceTask".equals(parameterName)) return this.fSourceTask;
    if ("targetMeasure".equals(parameterName)) return this.fTargetMeasure;
    return null;
  }
  
  public Task getSourceTask() {
    return this.fSourceTask;
  }
  
  public MeasureValue getTargetMeasure() {
    return this.fTargetMeasure;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sourceTask".equals(parameterName) ) {
    	this.fSourceTask = (hu.bme.mdsd.ztz.model.drone.Task) newValue;
    	return true;
    }
    if ("targetMeasure".equals(parameterName) ) {
    	this.fTargetMeasure = (hu.bme.mdsd.ztz.model.drone.MeasureValue) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSourceTask(final Task pSourceTask) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSourceTask = pSourceTask;
  }
  
  public void setTargetMeasure(final MeasureValue pTargetMeasure) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTargetMeasure = pTargetMeasure;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.estimatedTime";
  }
  
  @Override
  public List<String> parameterNames() {
    return EstimatedTimeMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSourceTask, fTargetMeasure};
  }
  
  @Override
  public EstimatedTimeMatch toImmutable() {
    return isMutable() ? newMatch(fSourceTask, fTargetMeasure) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sourceTask\"=" + prettyPrintValue(fSourceTask) + ", ");
    
    result.append("\"targetMeasure\"=" + prettyPrintValue(fTargetMeasure)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSourceTask == null) ? 0 : fSourceTask.hashCode());
    result = prime * result + ((fTargetMeasure == null) ? 0 : fTargetMeasure.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EstimatedTimeMatch)) { // this should be infrequent
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
    EstimatedTimeMatch other = (EstimatedTimeMatch) obj;
    if (fSourceTask == null) {if (other.fSourceTask != null) return false;}
    else if (!fSourceTask.equals(other.fSourceTask)) return false;
    if (fTargetMeasure == null) {if (other.fTargetMeasure != null) return false;}
    else if (!fTargetMeasure.equals(other.fTargetMeasure)) return false;
    return true;
  }
  
  @Override
  public EstimatedTimeQuerySpecification specification() {
    try {
    	return EstimatedTimeQuerySpecification.instance();
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
  public static EstimatedTimeMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EstimatedTimeMatch newMutableMatch(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    return new Mutable(pSourceTask, pTargetMeasure);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSourceTask the fixed value of pattern parameter sourceTask, or null if not bound.
   * @param pTargetMeasure the fixed value of pattern parameter targetMeasure, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EstimatedTimeMatch newMatch(final Task pSourceTask, final MeasureValue pTargetMeasure) {
    return new Immutable(pSourceTask, pTargetMeasure);
  }
  
  private static final class Mutable extends EstimatedTimeMatch {
    Mutable(final Task pSourceTask, final MeasureValue pTargetMeasure) {
      super(pSourceTask, pTargetMeasure);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EstimatedTimeMatch {
    Immutable(final Task pSourceTask, final MeasureValue pTargetMeasure) {
      super(pSourceTask, pTargetMeasure);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
