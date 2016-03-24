package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.util.NotEnoughExecutorsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.notEnoughExecutors pattern,
 * to be used in conjunction with {@link NotEnoughExecutorsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NotEnoughExecutorsMatcher
 * @see NotEnoughExecutorsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NotEnoughExecutorsMatch extends BasePatternMatch {
  private TaskExecution fExecution;
  
  private Integer fRequiredNum;
  
  private Integer fExecutorNum;
  
  private static List<String> parameterNames = makeImmutableList("execution", "requiredNum", "executorNum");
  
  private NotEnoughExecutorsMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    this.fExecution = pExecution;
    this.fRequiredNum = pRequiredNum;
    this.fExecutorNum = pExecutorNum;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("execution".equals(parameterName)) return this.fExecution;
    if ("requiredNum".equals(parameterName)) return this.fRequiredNum;
    if ("executorNum".equals(parameterName)) return this.fExecutorNum;
    return null;
  }
  
  public TaskExecution getExecution() {
    return this.fExecution;
  }
  
  public Integer getRequiredNum() {
    return this.fRequiredNum;
  }
  
  public Integer getExecutorNum() {
    return this.fExecutorNum;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("execution".equals(parameterName) ) {
    	this.fExecution = (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) newValue;
    	return true;
    }
    if ("requiredNum".equals(parameterName) ) {
    	this.fRequiredNum = (java.lang.Integer) newValue;
    	return true;
    }
    if ("executorNum".equals(parameterName) ) {
    	this.fExecutorNum = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
  }
  
  public void setExecution(final TaskExecution pExecution) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fExecution = pExecution;
  }
  
  public void setRequiredNum(final Integer pRequiredNum) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRequiredNum = pRequiredNum;
  }
  
  public void setExecutorNum(final Integer pExecutorNum) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fExecutorNum = pExecutorNum;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.notEnoughExecutors";
  }
  
  @Override
  public List<String> parameterNames() {
    return NotEnoughExecutorsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fExecution, fRequiredNum, fExecutorNum};
  }
  
  @Override
  public NotEnoughExecutorsMatch toImmutable() {
    return isMutable() ? newMatch(fExecution, fRequiredNum, fExecutorNum) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"execution\"=" + prettyPrintValue(fExecution) + ", ");
    
    result.append("\"requiredNum\"=" + prettyPrintValue(fRequiredNum) + ", ");
    
    result.append("\"executorNum\"=" + prettyPrintValue(fExecutorNum)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fExecution == null) ? 0 : fExecution.hashCode());
    result = prime * result + ((fRequiredNum == null) ? 0 : fRequiredNum.hashCode());
    result = prime * result + ((fExecutorNum == null) ? 0 : fExecutorNum.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NotEnoughExecutorsMatch)) { // this should be infrequent
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
    NotEnoughExecutorsMatch other = (NotEnoughExecutorsMatch) obj;
    if (fExecution == null) {if (other.fExecution != null) return false;}
    else if (!fExecution.equals(other.fExecution)) return false;
    if (fRequiredNum == null) {if (other.fRequiredNum != null) return false;}
    else if (!fRequiredNum.equals(other.fRequiredNum)) return false;
    if (fExecutorNum == null) {if (other.fExecutorNum != null) return false;}
    else if (!fExecutorNum.equals(other.fExecutorNum)) return false;
    return true;
  }
  
  @Override
  public NotEnoughExecutorsQuerySpecification specification() {
    try {
    	return NotEnoughExecutorsQuerySpecification.instance();
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
  public static NotEnoughExecutorsMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NotEnoughExecutorsMatch newMutableMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    return new Mutable(pExecution, pRequiredNum, pExecutorNum);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pExecution the fixed value of pattern parameter execution, or null if not bound.
   * @param pRequiredNum the fixed value of pattern parameter requiredNum, or null if not bound.
   * @param pExecutorNum the fixed value of pattern parameter executorNum, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NotEnoughExecutorsMatch newMatch(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
    return new Immutable(pExecution, pRequiredNum, pExecutorNum);
  }
  
  private static final class Mutable extends NotEnoughExecutorsMatch {
    Mutable(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
      super(pExecution, pRequiredNum, pExecutorNum);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NotEnoughExecutorsMatch {
    Immutable(final TaskExecution pExecution, final Integer pRequiredNum, final Integer pExecutorNum) {
      super(pExecution, pRequiredNum, pExecutorNum);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
