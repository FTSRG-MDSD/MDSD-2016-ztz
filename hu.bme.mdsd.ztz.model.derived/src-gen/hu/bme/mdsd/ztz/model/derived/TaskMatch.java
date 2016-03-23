package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.derived.util.TaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Task;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.task pattern,
 * to be used in conjunction with {@link TaskMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TaskMatcher
 * @see TaskProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TaskMatch extends BasePatternMatch {
  private TaskRequirement fRequirement;
  
  private Task fTask;
  
  private static List<String> parameterNames = makeImmutableList("requirement", "task");
  
  private TaskMatch(final TaskRequirement pRequirement, final Task pTask) {
    this.fRequirement = pRequirement;
    this.fTask = pTask;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("requirement".equals(parameterName)) return this.fRequirement;
    if ("task".equals(parameterName)) return this.fTask;
    return null;
  }
  
  public TaskRequirement getRequirement() {
    return this.fRequirement;
  }
  
  public Task getTask() {
    return this.fTask;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("requirement".equals(parameterName) ) {
    	this.fRequirement = (hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) newValue;
    	return true;
    }
    if ("task".equals(parameterName) ) {
    	this.fTask = (hu.bme.mdsd.ztz.model.drone.Task) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRequirement(final TaskRequirement pRequirement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRequirement = pRequirement;
  }
  
  public void setTask(final Task pTask) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTask = pTask;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.task";
  }
  
  @Override
  public List<String> parameterNames() {
    return TaskMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRequirement, fTask};
  }
  
  @Override
  public TaskMatch toImmutable() {
    return isMutable() ? newMatch(fRequirement, fTask) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"requirement\"=" + prettyPrintValue(fRequirement) + ", ");
    
    result.append("\"task\"=" + prettyPrintValue(fTask)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRequirement == null) ? 0 : fRequirement.hashCode());
    result = prime * result + ((fTask == null) ? 0 : fTask.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TaskMatch)) { // this should be infrequent
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
    TaskMatch other = (TaskMatch) obj;
    if (fRequirement == null) {if (other.fRequirement != null) return false;}
    else if (!fRequirement.equals(other.fRequirement)) return false;
    if (fTask == null) {if (other.fTask != null) return false;}
    else if (!fTask.equals(other.fTask)) return false;
    return true;
  }
  
  @Override
  public TaskQuerySpecification specification() {
    try {
    	return TaskQuerySpecification.instance();
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
  public static TaskMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TaskMatch newMutableMatch(final TaskRequirement pRequirement, final Task pTask) {
    return new Mutable(pRequirement, pTask);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TaskMatch newMatch(final TaskRequirement pRequirement, final Task pTask) {
    return new Immutable(pRequirement, pTask);
  }
  
  private static final class Mutable extends TaskMatch {
    Mutable(final TaskRequirement pRequirement, final Task pTask) {
      super(pRequirement, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TaskMatch {
    Immutable(final TaskRequirement pRequirement, final Task pTask) {
      super(pRequirement, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
