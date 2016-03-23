package hu.bme.mdsd.ztz.model.derived;

import hu.bme.mdsd.ztz.model.derived.AvailabilityRangeMatcher;
import hu.bme.mdsd.ztz.model.derived.CurrentTaskMatcher;
import hu.bme.mdsd.ztz.model.derived.DescriptorMatcher;
import hu.bme.mdsd.ztz.model.derived.MinMeasureMatcher;
import hu.bme.mdsd.ztz.model.derived.MissionMatcher;
import hu.bme.mdsd.ztz.model.derived.ReceivedMessagesMatcher;
import hu.bme.mdsd.ztz.model.derived.TaskMatcher;
import hu.bme.mdsd.ztz.model.derived.util.AvailabilityRangeQuerySpecification;
import hu.bme.mdsd.ztz.model.derived.util.CurrentTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.derived.util.DescriptorQuerySpecification;
import hu.bme.mdsd.ztz.model.derived.util.MinMeasureQuerySpecification;
import hu.bme.mdsd.ztz.model.derived.util.MissionQuerySpecification;
import hu.bme.mdsd.ztz.model.derived.util.ReceivedMessagesQuerySpecification;
import hu.bme.mdsd.ztz.model.derived.util.TaskQuerySpecification;
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
 * <li>task</li>
 * <li>currentTask</li>
 * <li>receivedMessages</li>
 * <li>availabilityRange</li>
 * <li>minMeasure</li>
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
    querySpecifications.add(TaskQuerySpecification.instance());
    querySpecifications.add(CurrentTaskQuerySpecification.instance());
    querySpecifications.add(ReceivedMessagesQuerySpecification.instance());
    querySpecifications.add(AvailabilityRangeQuerySpecification.instance());
    querySpecifications.add(MinMeasureQuerySpecification.instance());
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
  
  public TaskQuerySpecification getTask() throws IncQueryException {
    return TaskQuerySpecification.instance();
  }
  
  public TaskMatcher getTask(final IncQueryEngine engine) throws IncQueryException {
    return TaskMatcher.on(engine);
  }
  
  public CurrentTaskQuerySpecification getCurrentTask() throws IncQueryException {
    return CurrentTaskQuerySpecification.instance();
  }
  
  public CurrentTaskMatcher getCurrentTask(final IncQueryEngine engine) throws IncQueryException {
    return CurrentTaskMatcher.on(engine);
  }
  
  public ReceivedMessagesQuerySpecification getReceivedMessages() throws IncQueryException {
    return ReceivedMessagesQuerySpecification.instance();
  }
  
  public ReceivedMessagesMatcher getReceivedMessages(final IncQueryEngine engine) throws IncQueryException {
    return ReceivedMessagesMatcher.on(engine);
  }
  
  public AvailabilityRangeQuerySpecification getAvailabilityRange() throws IncQueryException {
    return AvailabilityRangeQuerySpecification.instance();
  }
  
  public AvailabilityRangeMatcher getAvailabilityRange(final IncQueryEngine engine) throws IncQueryException {
    return AvailabilityRangeMatcher.on(engine);
  }
  
  public MinMeasureQuerySpecification getMinMeasure() throws IncQueryException {
    return MinMeasureQuerySpecification.instance();
  }
  
  public MinMeasureMatcher getMinMeasure(final IncQueryEngine engine) throws IncQueryException {
    return MinMeasureMatcher.on(engine);
  }
}
