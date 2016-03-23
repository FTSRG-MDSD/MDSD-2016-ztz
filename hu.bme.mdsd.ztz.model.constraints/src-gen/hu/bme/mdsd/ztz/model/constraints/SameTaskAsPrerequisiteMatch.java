package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.util.SameTaskAsPrerequisiteQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.sameTaskAsPrerequisite pattern,
 * to be used in conjunction with {@link SameTaskAsPrerequisiteMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SameTaskAsPrerequisiteMatcher
 * @see SameTaskAsPrerequisiteProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SameTaskAsPrerequisiteMatch extends BasePatternMatch {
  private TaskRequirement fTaskRequirement;
  
  private TaskExecution fTaskExecution;
  
  private static List<String> parameterNames = makeImmutableList("taskRequirement", "taskExecution");
  
  private SameTaskAsPrerequisiteMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    this.fTaskRequirement = pTaskRequirement;
    this.fTaskExecution = pTaskExecution;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("taskRequirement".equals(parameterName)) return this.fTaskRequirement;
    if ("taskExecution".equals(parameterName)) return this.fTaskExecution;
    return null;
  }
  
  public TaskRequirement getTaskRequirement() {
    return this.fTaskRequirement;
  }
  
  public TaskExecution getTaskExecution() {
    return this.fTaskExecution;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("taskRequirement".equals(parameterName) ) {
    	this.fTaskRequirement = (hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) newValue;
    	return true;
    }
    if ("taskExecution".equals(parameterName) ) {
    	this.fTaskExecution = (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTaskRequirement(final TaskRequirement pTaskRequirement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTaskRequirement = pTaskRequirement;
  }
  
  public void setTaskExecution(final TaskExecution pTaskExecution) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTaskExecution = pTaskExecution;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.sameTaskAsPrerequisite";
  }
  
  @Override
  public List<String> parameterNames() {
    return SameTaskAsPrerequisiteMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTaskRequirement, fTaskExecution};
  }
  
  @Override
  public SameTaskAsPrerequisiteMatch toImmutable() {
    return isMutable() ? newMatch(fTaskRequirement, fTaskExecution) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"taskRequirement\"=" + prettyPrintValue(fTaskRequirement) + ", ");
    
    result.append("\"taskExecution\"=" + prettyPrintValue(fTaskExecution)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTaskRequirement == null) ? 0 : fTaskRequirement.hashCode());
    result = prime * result + ((fTaskExecution == null) ? 0 : fTaskExecution.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SameTaskAsPrerequisiteMatch)) { // this should be infrequent
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
    SameTaskAsPrerequisiteMatch other = (SameTaskAsPrerequisiteMatch) obj;
    if (fTaskRequirement == null) {if (other.fTaskRequirement != null) return false;}
    else if (!fTaskRequirement.equals(other.fTaskRequirement)) return false;
    if (fTaskExecution == null) {if (other.fTaskExecution != null) return false;}
    else if (!fTaskExecution.equals(other.fTaskExecution)) return false;
    return true;
  }
  
  @Override
  public SameTaskAsPrerequisiteQuerySpecification specification() {
    try {
    	return SameTaskAsPrerequisiteQuerySpecification.instance();
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
  public static SameTaskAsPrerequisiteMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SameTaskAsPrerequisiteMatch newMutableMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    return new Mutable(pTaskRequirement, pTaskExecution);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTaskRequirement the fixed value of pattern parameter taskRequirement, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SameTaskAsPrerequisiteMatch newMatch(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
    return new Immutable(pTaskRequirement, pTaskExecution);
  }
  
  private static final class Mutable extends SameTaskAsPrerequisiteMatch {
    Mutable(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
      super(pTaskRequirement, pTaskExecution);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SameTaskAsPrerequisiteMatch {
    Immutable(final TaskRequirement pTaskRequirement, final TaskExecution pTaskExecution) {
      super(pTaskRequirement, pTaskExecution);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
