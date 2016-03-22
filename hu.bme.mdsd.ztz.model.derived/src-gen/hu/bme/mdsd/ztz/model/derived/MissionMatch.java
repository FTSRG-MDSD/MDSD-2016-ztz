package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.util.MissionQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Robot;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.derived.mission pattern,
 * to be used in conjunction with {@link MissionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MissionMatcher
 * @see MissionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MissionMatch extends BasePatternMatch {
  private Robot fSourceRobot;
  
  private Mission fTargetMission;
  
  private static List<String> parameterNames = makeImmutableList("sourceRobot", "targetMission");
  
  private MissionMatch(final Robot pSourceRobot, final Mission pTargetMission) {
    this.fSourceRobot = pSourceRobot;
    this.fTargetMission = pTargetMission;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("sourceRobot".equals(parameterName)) return this.fSourceRobot;
    if ("targetMission".equals(parameterName)) return this.fTargetMission;
    return null;
  }
  
  public Robot getSourceRobot() {
    return this.fSourceRobot;
  }
  
  public Mission getTargetMission() {
    return this.fTargetMission;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("sourceRobot".equals(parameterName) ) {
    	this.fSourceRobot = (hu.bme.mdsd.ztz.model.drone.Robot) newValue;
    	return true;
    }
    if ("targetMission".equals(parameterName) ) {
    	this.fTargetMission = (hu.bme.mdsd.ztz.model.drone.Mission) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSourceRobot(final Robot pSourceRobot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSourceRobot = pSourceRobot;
  }
  
  public void setTargetMission(final Mission pTargetMission) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTargetMission = pTargetMission;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.derived.mission";
  }
  
  @Override
  public List<String> parameterNames() {
    return MissionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSourceRobot, fTargetMission};
  }
  
  @Override
  public MissionMatch toImmutable() {
    return isMutable() ? newMatch(fSourceRobot, fTargetMission) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"sourceRobot\"=" + prettyPrintValue(fSourceRobot) + ", ");
    
    result.append("\"targetMission\"=" + prettyPrintValue(fTargetMission)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSourceRobot == null) ? 0 : fSourceRobot.hashCode());
    result = prime * result + ((fTargetMission == null) ? 0 : fTargetMission.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MissionMatch)) { // this should be infrequent
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
    MissionMatch other = (MissionMatch) obj;
    if (fSourceRobot == null) {if (other.fSourceRobot != null) return false;}
    else if (!fSourceRobot.equals(other.fSourceRobot)) return false;
    if (fTargetMission == null) {if (other.fTargetMission != null) return false;}
    else if (!fTargetMission.equals(other.fTargetMission)) return false;
    return true;
  }
  
  @Override
  public MissionQuerySpecification specification() {
    try {
    	return MissionQuerySpecification.instance();
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
  public static MissionMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MissionMatch newMutableMatch(final Robot pSourceRobot, final Mission pTargetMission) {
    return new Mutable(pSourceRobot, pTargetMission);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSourceRobot the fixed value of pattern parameter sourceRobot, or null if not bound.
   * @param pTargetMission the fixed value of pattern parameter targetMission, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MissionMatch newMatch(final Robot pSourceRobot, final Mission pTargetMission) {
    return new Immutable(pSourceRobot, pTargetMission);
  }
  
  private static final class Mutable extends MissionMatch {
    Mutable(final Robot pSourceRobot, final Mission pTargetMission) {
      super(pSourceRobot, pTargetMission);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MissionMatch {
    Immutable(final Robot pSourceRobot, final Mission pTargetMission) {
      super(pSourceRobot, pTargetMission);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
