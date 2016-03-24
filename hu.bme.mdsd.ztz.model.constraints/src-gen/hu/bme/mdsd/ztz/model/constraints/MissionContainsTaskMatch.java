package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.MissionContainsTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Task;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.missionContainsTask pattern,
 * to be used in conjunction with {@link MissionContainsTaskMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MissionContainsTaskMatcher
 * @see MissionContainsTaskProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MissionContainsTaskMatch extends BasePatternMatch {
  private Mission fMission;
  
  private Task fTask;
  
  private static List<String> parameterNames = makeImmutableList("mission", "task");
  
  private MissionContainsTaskMatch(final Mission pMission, final Task pTask) {
    this.fMission = pMission;
    this.fTask = pTask;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("mission".equals(parameterName)) return this.fMission;
    if ("task".equals(parameterName)) return this.fTask;
    return null;
  }
  
  public Mission getMission() {
    return this.fMission;
  }
  
  public Task getTask() {
    return this.fTask;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("mission".equals(parameterName) ) {
    	this.fMission = (hu.bme.mdsd.ztz.model.drone.Mission) newValue;
    	return true;
    }
    if ("task".equals(parameterName) ) {
    	this.fTask = (hu.bme.mdsd.ztz.model.drone.Task) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMission(final Mission pMission) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMission = pMission;
  }
  
  public void setTask(final Task pTask) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTask = pTask;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.missionContainsTask";
  }
  
  @Override
  public List<String> parameterNames() {
    return MissionContainsTaskMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMission, fTask};
  }
  
  @Override
  public MissionContainsTaskMatch toImmutable() {
    return isMutable() ? newMatch(fMission, fTask) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"mission\"=" + prettyPrintValue(fMission) + ", ");
    
    result.append("\"task\"=" + prettyPrintValue(fTask)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMission == null) ? 0 : fMission.hashCode());
    result = prime * result + ((fTask == null) ? 0 : fTask.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MissionContainsTaskMatch)) { // this should be infrequent
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
    MissionContainsTaskMatch other = (MissionContainsTaskMatch) obj;
    if (fMission == null) {if (other.fMission != null) return false;}
    else if (!fMission.equals(other.fMission)) return false;
    if (fTask == null) {if (other.fTask != null) return false;}
    else if (!fTask.equals(other.fTask)) return false;
    return true;
  }
  
  @Override
  public MissionContainsTaskQuerySpecification specification() {
    try {
    	return MissionContainsTaskQuerySpecification.instance();
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
  public static MissionContainsTaskMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MissionContainsTaskMatch newMutableMatch(final Mission pMission, final Task pTask) {
    return new Mutable(pMission, pTask);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MissionContainsTaskMatch newMatch(final Mission pMission, final Task pTask) {
    return new Immutable(pMission, pTask);
  }
  
  private static final class Mutable extends MissionContainsTaskMatch {
    Mutable(final Mission pMission, final Task pTask) {
      super(pMission, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MissionContainsTaskMatch {
    Immutable(final Mission pMission, final Task pTask) {
      super(pMission, pTask);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
