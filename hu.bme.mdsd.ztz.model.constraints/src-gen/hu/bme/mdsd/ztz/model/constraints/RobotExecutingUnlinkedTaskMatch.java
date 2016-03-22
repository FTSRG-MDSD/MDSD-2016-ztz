package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.constraints.util.RobotExecutingUnlinkedTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Task;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.robotExecutingUnlinkedTask pattern,
 * to be used in conjunction with {@link RobotExecutingUnlinkedTaskMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RobotExecutingUnlinkedTaskMatcher
 * @see RobotExecutingUnlinkedTaskProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RobotExecutingUnlinkedTaskMatch extends BasePatternMatch {
  private DynamicRobot fRobot;
  
  private Task fTask;
  
  private static List<String> parameterNames = makeImmutableList("robot", "task");
  
  private RobotExecutingUnlinkedTaskMatch(final DynamicRobot pRobot, final Task pTask) {
    this.fRobot = pRobot;
    this.fTask = pTask;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("robot".equals(parameterName)) return this.fRobot;
    if ("task".equals(parameterName)) return this.fTask;
    return null;
  }
  
  public DynamicRobot getRobot() {
    return this.fRobot;
  }
  
  public Task getTask() {
    return this.fTask;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("robot".equals(parameterName) ) {
    	this.fRobot = (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) newValue;
    	return true;
    }
    if ("task".equals(parameterName) ) {
    	this.fTask = (hu.bme.mdsd.ztz.model.drone.Task) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRobot(final DynamicRobot pRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRobot = pRobot;
  }
  
  public void setTask(final Task pTask) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTask = pTask;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.robotExecutingUnlinkedTask";
  }
  
  @Override
  public List<String> parameterNames() {
    return RobotExecutingUnlinkedTaskMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRobot, fTask};
  }
  
  @Override
  public RobotExecutingUnlinkedTaskMatch toImmutable() {
    return isMutable() ? newMatch(fRobot, fTask) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"robot\"=" + prettyPrintValue(fRobot) + ", ");
    
    result.append("\"task\"=" + prettyPrintValue(fTask)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRobot == null) ? 0 : fRobot.hashCode());
    result = prime * result + ((fTask == null) ? 0 : fTask.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RobotExecutingUnlinkedTaskMatch)) { // this should be infrequent
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
    RobotExecutingUnlinkedTaskMatch other = (RobotExecutingUnlinkedTaskMatch) obj;
    if (fRobot == null) {if (other.fRobot != null) return false;}
    else if (!fRobot.equals(other.fRobot)) return false;
    if (fTask == null) {if (other.fTask != null) return false;}
    else if (!fTask.equals(other.fTask)) return false;
    return true;
  }
  
  @Override
  public RobotExecutingUnlinkedTaskQuerySpecification specification() {
    try {
    	return RobotExecutingUnlinkedTaskQuerySpecification.instance();
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
  public static RobotExecutingUnlinkedTaskMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RobotExecutingUnlinkedTaskMatch newMutableMatch(final DynamicRobot pRobot, final Task pTask) {
    return new Mutable(pRobot, pTask);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRobot the fixed value of pattern parameter robot, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RobotExecutingUnlinkedTaskMatch newMatch(final DynamicRobot pRobot, final Task pTask) {
    return new Immutable(pRobot, pTask);
  }
  
  private static final class Mutable extends RobotExecutingUnlinkedTaskMatch {
    Mutable(final DynamicRobot pRobot, final Task pTask) {
      super(pRobot, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RobotExecutingUnlinkedTaskMatch {
    Immutable(final DynamicRobot pRobot, final Task pTask) {
      super(pRobot, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
