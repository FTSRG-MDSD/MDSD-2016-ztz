package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.derived.util.DescriptorQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.descriptor pattern,
 * to be used in conjunction with {@link DescriptorMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DescriptorMatcher
 * @see DescriptorProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DescriptorMatch extends BasePatternMatch {
  private TaskRequirement fSourceRequirement;
  
  private TaskDescriptor fTargetDescriptor;
  
  private static List<String> parameterNames = makeImmutableList("sourceRequirement", "targetDescriptor");
  
  private DescriptorMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    this.fSourceRequirement = pSourceRequirement;
    this.fTargetDescriptor = pTargetDescriptor;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sourceRequirement".equals(parameterName)) return this.fSourceRequirement;
    if ("targetDescriptor".equals(parameterName)) return this.fTargetDescriptor;
    return null;
  }
  
  public TaskRequirement getSourceRequirement() {
    return this.fSourceRequirement;
  }
  
  public TaskDescriptor getTargetDescriptor() {
    return this.fTargetDescriptor;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sourceRequirement".equals(parameterName) ) {
    	this.fSourceRequirement = (hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) newValue;
    	return true;
    }
    if ("targetDescriptor".equals(parameterName) ) {
    	this.fTargetDescriptor = (hu.bme.mdsd.ztz.model.drone.TaskDescriptor) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSourceRequirement(final TaskRequirement pSourceRequirement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSourceRequirement = pSourceRequirement;
  }
  
  public void setTargetDescriptor(final TaskDescriptor pTargetDescriptor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTargetDescriptor = pTargetDescriptor;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.descriptor";
  }
  
  @Override
  public List<String> parameterNames() {
    return DescriptorMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSourceRequirement, fTargetDescriptor};
  }
  
  @Override
  public DescriptorMatch toImmutable() {
    return isMutable() ? newMatch(fSourceRequirement, fTargetDescriptor) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sourceRequirement\"=" + prettyPrintValue(fSourceRequirement) + ", ");
    
    result.append("\"targetDescriptor\"=" + prettyPrintValue(fTargetDescriptor)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSourceRequirement == null) ? 0 : fSourceRequirement.hashCode());
    result = prime * result + ((fTargetDescriptor == null) ? 0 : fTargetDescriptor.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DescriptorMatch)) { // this should be infrequent
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
    DescriptorMatch other = (DescriptorMatch) obj;
    if (fSourceRequirement == null) {if (other.fSourceRequirement != null) return false;}
    else if (!fSourceRequirement.equals(other.fSourceRequirement)) return false;
    if (fTargetDescriptor == null) {if (other.fTargetDescriptor != null) return false;}
    else if (!fTargetDescriptor.equals(other.fTargetDescriptor)) return false;
    return true;
  }
  
  @Override
  public DescriptorQuerySpecification specification() {
    try {
    	return DescriptorQuerySpecification.instance();
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
  public static DescriptorMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DescriptorMatch newMutableMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    return new Mutable(pSourceRequirement, pTargetDescriptor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSourceRequirement the fixed value of pattern parameter sourceRequirement, or null if not bound.
   * @param pTargetDescriptor the fixed value of pattern parameter targetDescriptor, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DescriptorMatch newMatch(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
    return new Immutable(pSourceRequirement, pTargetDescriptor);
  }
  
  private static final class Mutable extends DescriptorMatch {
    Mutable(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
      super(pSourceRequirement, pTargetDescriptor);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DescriptorMatch {
    Immutable(final TaskRequirement pSourceRequirement, final TaskDescriptor pTargetDescriptor) {
      super(pSourceRequirement, pTargetDescriptor);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
