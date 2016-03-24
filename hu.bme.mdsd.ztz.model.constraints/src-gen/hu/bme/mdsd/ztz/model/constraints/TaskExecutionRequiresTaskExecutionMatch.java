package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.util.TaskExecutionRequiresTaskExecutionQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.taskExecutionRequiresTaskExecution pattern,
 * to be used in conjunction with {@link TaskExecutionRequiresTaskExecutionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TaskExecutionRequiresTaskExecutionMatcher
 * @see TaskExecutionRequiresTaskExecutionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TaskExecutionRequiresTaskExecutionMatch extends BasePatternMatch {
  private TaskExecution fTaskEx;
  
  private TaskExecution fRequiredTaskEx;
  
  private static List<String> parameterNames = makeImmutableList("taskEx", "requiredTaskEx");
  
  private TaskExecutionRequiresTaskExecutionMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    this.fTaskEx = pTaskEx;
    this.fRequiredTaskEx = pRequiredTaskEx;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("taskEx".equals(parameterName)) return this.fTaskEx;
    if ("requiredTaskEx".equals(parameterName)) return this.fRequiredTaskEx;
    return null;
  }
  
  public TaskExecution getTaskEx() {
    return this.fTaskEx;
  }
  
  public TaskExecution getRequiredTaskEx() {
    return this.fRequiredTaskEx;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("taskEx".equals(parameterName) ) {
    	this.fTaskEx = (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) newValue;
    	return true;
    }
    if ("requiredTaskEx".equals(parameterName) ) {
    	this.fRequiredTaskEx = (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTaskEx(final TaskExecution pTaskEx) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTaskEx = pTaskEx;
  }
  
  public void setRequiredTaskEx(final TaskExecution pRequiredTaskEx) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRequiredTaskEx = pRequiredTaskEx;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.taskExecutionRequiresTaskExecution";
  }
  
  @Override
  public List<String> parameterNames() {
    return TaskExecutionRequiresTaskExecutionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTaskEx, fRequiredTaskEx};
  }
  
  @Override
  public TaskExecutionRequiresTaskExecutionMatch toImmutable() {
    return isMutable() ? newMatch(fTaskEx, fRequiredTaskEx) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"taskEx\"=" + prettyPrintValue(fTaskEx) + ", ");
    
    result.append("\"requiredTaskEx\"=" + prettyPrintValue(fRequiredTaskEx)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTaskEx == null) ? 0 : fTaskEx.hashCode());
    result = prime * result + ((fRequiredTaskEx == null) ? 0 : fRequiredTaskEx.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TaskExecutionRequiresTaskExecutionMatch)) { // this should be infrequent
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
    TaskExecutionRequiresTaskExecutionMatch other = (TaskExecutionRequiresTaskExecutionMatch) obj;
    if (fTaskEx == null) {if (other.fTaskEx != null) return false;}
    else if (!fTaskEx.equals(other.fTaskEx)) return false;
    if (fRequiredTaskEx == null) {if (other.fRequiredTaskEx != null) return false;}
    else if (!fRequiredTaskEx.equals(other.fRequiredTaskEx)) return false;
    return true;
  }
  
  @Override
  public TaskExecutionRequiresTaskExecutionQuerySpecification specification() {
    try {
    	return TaskExecutionRequiresTaskExecutionQuerySpecification.instance();
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
  public static TaskExecutionRequiresTaskExecutionMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TaskExecutionRequiresTaskExecutionMatch newMutableMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    return new Mutable(pTaskEx, pRequiredTaskEx);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTaskEx the fixed value of pattern parameter taskEx, or null if not bound.
   * @param pRequiredTaskEx the fixed value of pattern parameter requiredTaskEx, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TaskExecutionRequiresTaskExecutionMatch newMatch(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
    return new Immutable(pTaskEx, pRequiredTaskEx);
  }
  
  private static final class Mutable extends TaskExecutionRequiresTaskExecutionMatch {
    Mutable(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
      super(pTaskEx, pRequiredTaskEx);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TaskExecutionRequiresTaskExecutionMatch {
    Immutable(final TaskExecution pTaskEx, final TaskExecution pRequiredTaskEx) {
      super(pTaskEx, pRequiredTaskEx);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
