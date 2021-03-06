package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.util.NonPositiveParticipantsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.nonPositiveParticipants pattern,
 * to be used in conjunction with {@link NonPositiveParticipantsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NonPositiveParticipantsMatcher
 * @see NonPositiveParticipantsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NonPositiveParticipantsMatch extends BasePatternMatch {
  private TaskRequirement fRequirement;
  
  private static List<String> parameterNames = makeImmutableList("requirement");
  
  private NonPositiveParticipantsMatch(final TaskRequirement pRequirement) {
    this.fRequirement = pRequirement;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("requirement".equals(parameterName)) return this.fRequirement;
    return null;
  }
  
  public TaskRequirement getRequirement() {
    return this.fRequirement;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("requirement".equals(parameterName) ) {
    	this.fRequirement = (hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRequirement(final TaskRequirement pRequirement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRequirement = pRequirement;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.nonPositiveParticipants";
  }
  
  @Override
  public List<String> parameterNames() {
    return NonPositiveParticipantsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRequirement};
  }
  
  @Override
  public NonPositiveParticipantsMatch toImmutable() {
    return isMutable() ? newMatch(fRequirement) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"requirement\"=" + prettyPrintValue(fRequirement)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRequirement == null) ? 0 : fRequirement.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NonPositiveParticipantsMatch)) { // this should be infrequent
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
    NonPositiveParticipantsMatch other = (NonPositiveParticipantsMatch) obj;
    if (fRequirement == null) {if (other.fRequirement != null) return false;}
    else if (!fRequirement.equals(other.fRequirement)) return false;
    return true;
  }
  
  @Override
  public NonPositiveParticipantsQuerySpecification specification() {
    try {
    	return NonPositiveParticipantsQuerySpecification.instance();
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
  public static NonPositiveParticipantsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NonPositiveParticipantsMatch newMutableMatch(final TaskRequirement pRequirement) {
    return new Mutable(pRequirement);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NonPositiveParticipantsMatch newMatch(final TaskRequirement pRequirement) {
    return new Immutable(pRequirement);
  }
  
  private static final class Mutable extends NonPositiveParticipantsMatch {
    Mutable(final TaskRequirement pRequirement) {
      super(pRequirement);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NonPositiveParticipantsMatch {
    Immutable(final TaskRequirement pRequirement) {
      super(pRequirement);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
