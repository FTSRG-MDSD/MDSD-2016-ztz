package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.TaskEarlyExecutedQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskExecution;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.taskEarlyExecuted pattern,
 * to be used in conjunction with {@link TaskEarlyExecutedMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TaskEarlyExecutedMatcher
 * @see TaskEarlyExecutedProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TaskEarlyExecutedMatch extends BasePatternMatch {
  private Task fTask;
  
  private TaskExecution fExecution;
  
  private static List<String> parameterNames = makeImmutableList("task", "execution");
  
  private TaskEarlyExecutedMatch(final Task pTask, final TaskExecution pExecution) {
    this.fTask = pTask;
    this.fExecution = pExecution;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("task".equals(parameterName)) return this.fTask;
    if ("execution".equals(parameterName)) return this.fExecution;
    return null;
  }
  
  public Task getTask() {
    return this.fTask;
  }
  
  public TaskExecution getExecution() {
    return this.fExecution;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("task".equals(parameterName) ) {
    	this.fTask = (hu.bme.mdsd.ztz.model.drone.Task) newValue;
    	return true;
    }
    if ("execution".equals(parameterName) ) {
    	this.fExecution = (hu.bme.mdsd.ztz.model.drone.TaskExecution) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTask(final Task pTask) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTask = pTask;
  }
  
  public void setExecution(final TaskExecution pExecution) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fExecution = pExecution;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.taskEarlyExecuted";
  }
  
  @Override
  public List<String> parameterNames() {
    return TaskEarlyExecutedMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTask, fExecution};
  }
  
  @Override
  public TaskEarlyExecutedMatch toImmutable() {
    return isMutable() ? newMatch(fTask, fExecution) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"task\"=" + prettyPrintValue(fTask) + ", ");
    
    result.append("\"execution\"=" + prettyPrintValue(fExecution)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTask == null) ? 0 : fTask.hashCode());
    result = prime * result + ((fExecution == null) ? 0 : fExecution.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TaskEarlyExecutedMatch)) { // this should be infrequent
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
    TaskEarlyExecutedMatch other = (TaskEarlyExecutedMatch) obj;
    if (fTask == null) {if (other.fTask != null) return false;}
    else if (!fTask.equals(other.fTask)) return false;
    if (fExecution == null) {if (other.fExecution != null) return false;}
    else if (!fExecution.equals(other.fExecution)) return false;
    return true;
  }
  
  @Override
  public TaskEarlyExecutedQuerySpecification specification() {
    try {
    	return TaskEarlyExecutedQuerySpecification.instance();
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
  public static TaskEarlyExecutedMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TaskEarlyExecutedMatch newMutableMatch(final Task pTask, final TaskExecution pExecution) {
    return new Mutable(pTask, pExecution);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TaskEarlyExecutedMatch newMatch(final Task pTask, final TaskExecution pExecution) {
    return new Immutable(pTask, pExecution);
  }
  
  private static final class Mutable extends TaskEarlyExecutedMatch {
    Mutable(final Task pTask, final TaskExecution pExecution) {
      super(pTask, pExecution);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TaskEarlyExecutedMatch {
    Immutable(final Task pTask, final TaskExecution pExecution) {
      super(pTask, pExecution);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
