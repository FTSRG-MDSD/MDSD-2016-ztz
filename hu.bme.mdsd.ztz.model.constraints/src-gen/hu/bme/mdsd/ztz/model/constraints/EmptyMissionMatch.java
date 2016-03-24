package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.util.EmptyMissionQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Mission;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.emptyMission pattern,
 * to be used in conjunction with {@link EmptyMissionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EmptyMissionMatcher
 * @see EmptyMissionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyMissionMatch extends BasePatternMatch {
  private Mission fMission;
  
  private static List<String> parameterNames = makeImmutableList("mission");
  
  private EmptyMissionMatch(final Mission pMission) {
    this.fMission = pMission;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("mission".equals(parameterName)) return this.fMission;
    return null;
  }
  
  public Mission getMission() {
    return this.fMission;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("mission".equals(parameterName) ) {
    	this.fMission = (hu.bme.mdsd.ztz.model.drone.Mission) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMission(final Mission pMission) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMission = pMission;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.emptyMission";
  }
  
  @Override
  public List<String> parameterNames() {
    return EmptyMissionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMission};
  }
  
  @Override
  public EmptyMissionMatch toImmutable() {
    return isMutable() ? newMatch(fMission) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"mission\"=" + prettyPrintValue(fMission)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMission == null) ? 0 : fMission.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EmptyMissionMatch)) { // this should be infrequent
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
    EmptyMissionMatch other = (EmptyMissionMatch) obj;
    if (fMission == null) {if (other.fMission != null) return false;}
    else if (!fMission.equals(other.fMission)) return false;
    return true;
  }
  
  @Override
  public EmptyMissionQuerySpecification specification() {
    try {
    	return EmptyMissionQuerySpecification.instance();
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
  public static EmptyMissionMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EmptyMissionMatch newMutableMatch(final Mission pMission) {
    return new Mutable(pMission);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMission the fixed value of pattern parameter mission, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EmptyMissionMatch newMatch(final Mission pMission) {
    return new Immutable(pMission);
  }
  
  private static final class Mutable extends EmptyMissionMatch {
    Mutable(final Mission pMission) {
      super(pMission);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EmptyMissionMatch {
    Immutable(final Mission pMission) {
      super(pMission);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
