package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.util.IncorrectWaitingTaskQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.incorrectWaitingTask pattern,
 * to be used in conjunction with {@link IncorrectWaitingTaskMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see IncorrectWaitingTaskMatcher
 * @see IncorrectWaitingTaskProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class IncorrectWaitingTaskMatch extends BasePatternMatch {
  private TaskExecution fTaskExecution;
  
  private static List<String> parameterNames = makeImmutableList("taskExecution");
  
  private IncorrectWaitingTaskMatch(final TaskExecution pTaskExecution) {
    this.fTaskExecution = pTaskExecution;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("taskExecution".equals(parameterName)) return this.fTaskExecution;
    return null;
  }
  
  public TaskExecution getTaskExecution() {
    return this.fTaskExecution;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("taskExecution".equals(parameterName) ) {
    	this.fTaskExecution = (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTaskExecution(final TaskExecution pTaskExecution) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTaskExecution = pTaskExecution;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.incorrectWaitingTask";
  }
  
  @Override
  public List<String> parameterNames() {
    return IncorrectWaitingTaskMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTaskExecution};
  }
  
  @Override
  public IncorrectWaitingTaskMatch toImmutable() {
    return isMutable() ? newMatch(fTaskExecution) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"taskExecution\"=" + prettyPrintValue(fTaskExecution)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTaskExecution == null) ? 0 : fTaskExecution.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof IncorrectWaitingTaskMatch)) { // this should be infrequent
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
    IncorrectWaitingTaskMatch other = (IncorrectWaitingTaskMatch) obj;
    if (fTaskExecution == null) {if (other.fTaskExecution != null) return false;}
    else if (!fTaskExecution.equals(other.fTaskExecution)) return false;
    return true;
  }
  
  @Override
  public IncorrectWaitingTaskQuerySpecification specification() {
    try {
    	return IncorrectWaitingTaskQuerySpecification.instance();
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
  public static IncorrectWaitingTaskMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static IncorrectWaitingTaskMatch newMutableMatch(final TaskExecution pTaskExecution) {
    return new Mutable(pTaskExecution);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static IncorrectWaitingTaskMatch newMatch(final TaskExecution pTaskExecution) {
    return new Immutable(pTaskExecution);
  }
  
  private static final class Mutable extends IncorrectWaitingTaskMatch {
    Mutable(final TaskExecution pTaskExecution) {
      super(pTaskExecution);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends IncorrectWaitingTaskMatch {
    Immutable(final TaskExecution pTaskExecution) {
      super(pTaskExecution);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
