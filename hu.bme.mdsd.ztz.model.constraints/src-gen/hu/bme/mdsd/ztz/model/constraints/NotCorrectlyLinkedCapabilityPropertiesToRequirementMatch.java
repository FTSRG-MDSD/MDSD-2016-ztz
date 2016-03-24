package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.constraints.util.NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification;
import hu.bme.mdsd.ztz.model.drone.Capability;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mdsd.ztz.model.constraints.notCorrectlyLinkedCapabilityPropertiesToRequirement pattern,
 * to be used in conjunction with {@link NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher
 * @see NotCorrectlyLinkedCapabilityPropertiesToRequirementProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch extends BasePatternMatch {
  private TaskRequirement fRequirement;
  
  private Capability fCapability;
  
  private static List<String> parameterNames = makeImmutableList("requirement", "capability");
  
  private NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch(final TaskRequirement pRequirement, final Capability pCapability) {
    this.fRequirement = pRequirement;
    this.fCapability = pCapability;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("requirement".equals(parameterName)) return this.fRequirement;
    if ("capability".equals(parameterName)) return this.fCapability;
    return null;
  }
  
  public TaskRequirement getRequirement() {
    return this.fRequirement;
  }
  
  public Capability getCapability() {
    return this.fCapability;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("requirement".equals(parameterName) ) {
    	this.fRequirement = (hu.bme.mdsd.ztz.model.behaviour.TaskRequirement) newValue;
    	return true;
    }
    if ("capability".equals(parameterName) ) {
    	this.fCapability = (hu.bme.mdsd.ztz.model.drone.Capability) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRequirement(final TaskRequirement pRequirement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRequirement = pRequirement;
  }
  
  public void setCapability(final Capability pCapability) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCapability = pCapability;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mdsd.ztz.model.constraints.notCorrectlyLinkedCapabilityPropertiesToRequirement";
  }
  
  @Override
  public List<String> parameterNames() {
    return NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRequirement, fCapability};
  }
  
  @Override
  public NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch toImmutable() {
    return isMutable() ? newMatch(fRequirement, fCapability) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"requirement\"=" + prettyPrintValue(fRequirement) + ", ");
    
    result.append("\"capability\"=" + prettyPrintValue(fCapability)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRequirement == null) ? 0 : fRequirement.hashCode());
    result = prime * result + ((fCapability == null) ? 0 : fCapability.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch)) { // this should be infrequent
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
    NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch other = (NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch) obj;
    if (fRequirement == null) {if (other.fRequirement != null) return false;}
    else if (!fRequirement.equals(other.fRequirement)) return false;
    if (fCapability == null) {if (other.fCapability != null) return false;}
    else if (!fCapability.equals(other.fCapability)) return false;
    return true;
  }
  
  @Override
  public NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification specification() {
    try {
    	return NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification.instance();
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
  public static NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch newMutableMatch(final TaskRequirement pRequirement, final Capability pCapability) {
    return new Mutable(pRequirement, pCapability);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequirement the fixed value of pattern parameter requirement, or null if not bound.
   * @param pCapability the fixed value of pattern parameter capability, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch newMatch(final TaskRequirement pRequirement, final Capability pCapability) {
    return new Immutable(pRequirement, pCapability);
  }
  
  private static final class Mutable extends NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch {
    Mutable(final TaskRequirement pRequirement, final Capability pCapability) {
      super(pRequirement, pCapability);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NotCorrectlyLinkedCapabilityPropertiesToRequirementMatch {
    Immutable(final TaskRequirement pRequirement, final Capability pCapability) {
      super(pRequirement, pCapability);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
