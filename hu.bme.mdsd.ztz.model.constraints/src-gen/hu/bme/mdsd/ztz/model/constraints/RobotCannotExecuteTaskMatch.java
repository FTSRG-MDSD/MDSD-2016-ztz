package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.constraints.util.RobotCannotExecuteTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Capability;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.robotCannotExecuteTask pattern,
 * to be used in conjunction with {@link RobotCannotExecuteTaskMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see RobotCannotExecuteTaskMatcher
 * @see RobotCannotExecuteTaskProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class RobotCannotExecuteTaskMatch extends BasePatternMatch {
  private DynamicRobot fDrobot;
  
  private TaskExecution fTaskExecution;
  
  private Capability fCapability;
  
  private static List<String> parameterNames = makeImmutableList("drobot", "taskExecution", "capability");
  
  private RobotCannotExecuteTaskMatch(final DynamicRobot pDrobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    this.fDrobot = pDrobot;
    this.fTaskExecution = pTaskExecution;
    this.fCapability = pCapability;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("drobot".equals(parameterName)) return this.fDrobot;
    if ("taskExecution".equals(parameterName)) return this.fTaskExecution;
    if ("capability".equals(parameterName)) return this.fCapability;
    return null;
  }
  
  public DynamicRobot getDrobot() {
    return this.fDrobot;
  }
  
  public TaskExecution getTaskExecution() {
    return this.fTaskExecution;
  }
  
  public Capability getCapability() {
    return this.fCapability;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("drobot".equals(parameterName) ) {
    	this.fDrobot = (hu.bme.mdsd.ztz.model.behaviour.DynamicRobot) newValue;
    	return true;
    }
    if ("taskExecution".equals(parameterName) ) {
    	this.fTaskExecution = (hu.bme.mdsd.ztz.model.behaviour.TaskExecution) newValue;
    	return true;
    }
    if ("capability".equals(parameterName) ) {
    	this.fCapability = (hu.bme.mdsd.ztz.model.drone.Capability) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDrobot(final DynamicRobot pDrobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDrobot = pDrobot;
  }
  
  public void setTaskExecution(final TaskExecution pTaskExecution) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTaskExecution = pTaskExecution;
  }
  
  public void setCapability(final Capability pCapability) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCapability = pCapability;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.robotCannotExecuteTask";
  }
  
  @Override
  public List<String> parameterNames() {
    return RobotCannotExecuteTaskMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDrobot, fTaskExecution, fCapability};
  }
  
  @Override
  public RobotCannotExecuteTaskMatch toImmutable() {
    return isMutable() ? newMatch(fDrobot, fTaskExecution, fCapability) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"drobot\"=" + prettyPrintValue(fDrobot) + ", ");
    
    result.append("\"taskExecution\"=" + prettyPrintValue(fTaskExecution) + ", ");
    
    result.append("\"capability\"=" + prettyPrintValue(fCapability)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDrobot == null) ? 0 : fDrobot.hashCode());
    result = prime * result + ((fTaskExecution == null) ? 0 : fTaskExecution.hashCode());
    result = prime * result + ((fCapability == null) ? 0 : fCapability.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof RobotCannotExecuteTaskMatch)) { // this should be infrequent
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
    RobotCannotExecuteTaskMatch other = (RobotCannotExecuteTaskMatch) obj;
    if (fDrobot == null) {if (other.fDrobot != null) return false;}
    else if (!fDrobot.equals(other.fDrobot)) return false;
    if (fTaskExecution == null) {if (other.fTaskExecution != null) return false;}
    else if (!fTaskExecution.equals(other.fTaskExecution)) return false;
    if (fCapability == null) {if (other.fCapability != null) return false;}
    else if (!fCapability.equals(other.fCapability)) return false;
    return true;
  }
  
  @Override
  public RobotCannotExecuteTaskQuerySpecification specification() {
    try {
    	return RobotCannotExecuteTaskQuerySpecification.instance();
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
  public static RobotCannotExecuteTaskMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static RobotCannotExecuteTaskMatch newMutableMatch(final DynamicRobot pDrobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    return new Mutable(pDrobot, pTaskExecution, pCapability);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrobot the fixed value of pattern parameter drobot, or null if not bound.
   * @param pTaskExecution the fixed value of pattern parameter taskExecution, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static RobotCannotExecuteTaskMatch newMatch(final DynamicRobot pDrobot, final TaskExecution pTaskExecution, final Capability pCapability) {
    return new Immutable(pDrobot, pTaskExecution, pCapability);
  }
  
  private static final class Mutable extends RobotCannotExecuteTaskMatch {
    Mutable(final DynamicRobot pDrobot, final TaskExecution pTaskExecution, final Capability pCapability) {
      super(pDrobot, pTaskExecution, pCapability);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends RobotCannotExecuteTaskMatch {
    Immutable(final DynamicRobot pDrobot, final TaskExecution pTaskExecution, final Capability pCapability) {
      super(pDrobot, pTaskExecution, pCapability);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
