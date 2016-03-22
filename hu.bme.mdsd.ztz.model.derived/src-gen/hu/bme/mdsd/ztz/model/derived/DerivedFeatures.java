package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.DescriptorMatcher;
import hu.bme.mdsd.ztz.model.derived.MissionMatcher;
import hu.bme.mdsd.ztz.model.derived.util.DescriptorQuerySpecification;
import hu.bme.mdsd.ztz.model.derived.util.MissionQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in derivedFeatures.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file derivedFeatures.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mdsd.ztz.model.derived, the group contains the definition of the following patterns: <ul>
 * <li>mission</li>
 * <li>descriptor</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class DerivedFeatures extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DerivedFeatures instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new DerivedFeatures();
    }
    return INSTANCE;
  }
  
  private static DerivedFeatures INSTANCE;
  
  private DerivedFeatures() throws IncQueryException {
    querySpecifications.add(MissionQuerySpecification.instance());
    querySpecifications.add(DescriptorQuerySpecification.instance());
  }
  
  public MissionQuerySpecification getMission() throws IncQueryException {
    return MissionQuerySpecification.instance();
  }
  
  public MissionMatcher getMission(final IncQueryEngine engine) throws IncQueryException {
    return MissionMatcher.on(engine);
  }
  
  public DescriptorQuerySpecification getDescriptor() throws IncQueryException {
    return DescriptorQuerySpecification.instance();
  }
  
  public DescriptorMatcher getDescriptor(final IncQueryEngine engine) throws IncQueryException {
    return DescriptorMatcher.on(engine);
  }
}
