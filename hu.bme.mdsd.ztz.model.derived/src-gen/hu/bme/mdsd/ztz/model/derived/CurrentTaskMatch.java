package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.derived.util.CurrentTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Task;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.currentTask pattern,
 * to be used in conjunction with {@link CurrentTaskMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CurrentTaskMatcher
 * @see CurrentTaskProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CurrentTaskMatch extends BasePatternMatch {
  private Action fAction;
  
  private Task fTask;
  
  private static List<String> parameterNames = makeImmutableList("action", "task");
  
  private CurrentTaskMatch(final Action pAction, final Task pTask) {
    this.fAction = pAction;
    this.fTask = pTask;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("action".equals(parameterName)) return this.fAction;
    if ("task".equals(parameterName)) return this.fTask;
    return null;
  }
  
  public Action getAction() {
    return this.fAction;
  }
  
  public Task getTask() {
    return this.fTask;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("action".equals(parameterName) ) {
    	this.fAction = (hu.bme.mdsd.ztz.model.behaviour.Action) newValue;
    	return true;
    }
    if ("task".equals(parameterName) ) {
    	this.fTask = (hu.bme.mdsd.ztz.model.drone.Task) newValue;
    	return true;
    }
    return false;
  }
  
  public void setAction(final Action pAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAction = pAction;
  }
  
  public void setTask(final Task pTask) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTask = pTask;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.currentTask";
  }
  
  @Override
  public List<String> parameterNames() {
    return CurrentTaskMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAction, fTask};
  }
  
  @Override
  public CurrentTaskMatch toImmutable() {
    return isMutable() ? newMatch(fAction, fTask) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"action\"=" + prettyPrintValue(fAction) + ", ");
    
    result.append("\"task\"=" + prettyPrintValue(fTask)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAction == null) ? 0 : fAction.hashCode());
    result = prime * result + ((fTask == null) ? 0 : fTask.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CurrentTaskMatch)) { // this should be infrequent
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
    CurrentTaskMatch other = (CurrentTaskMatch) obj;
    if (fAction == null) {if (other.fAction != null) return false;}
    else if (!fAction.equals(other.fAction)) return false;
    if (fTask == null) {if (other.fTask != null) return false;}
    else if (!fTask.equals(other.fTask)) return false;
    return true;
  }
  
  @Override
  public CurrentTaskQuerySpecification specification() {
    try {
    	return CurrentTaskQuerySpecification.instance();
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
  public static CurrentTaskMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CurrentTaskMatch newMutableMatch(final Action pAction, final Task pTask) {
    return new Mutable(pAction, pTask);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAction the fixed value of pattern parameter action, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CurrentTaskMatch newMatch(final Action pAction, final Task pTask) {
    return new Immutable(pAction, pTask);
  }
  
  private static final class Mutable extends CurrentTaskMatch {
    Mutable(final Action pAction, final Task pTask) {
      super(pAction, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CurrentTaskMatch {
    Immutable(final Action pAction, final Task pTask) {
      super(pAction, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
