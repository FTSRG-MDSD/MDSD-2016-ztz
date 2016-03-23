package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.CollaboratorRangeDimensionsNotCompatibleMatcher;
import hu.bme.mdsd.ztz.model.constraints.ConversionAvailableMatcher;
import hu.bme.mdsd.ztz.model.constraints.DirectConversionAvailableMatcher;
import hu.bme.mdsd.ztz.model.constraints.IncorrectWaitingTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.IsNotWaitingTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.NoBatteryMatcher;
import hu.bme.mdsd.ztz.model.constraints.NonPositiveParticipantsMatcher;
import hu.bme.mdsd.ztz.model.constraints.NullMeasureConversionValueMatcher;
import hu.bme.mdsd.ztz.model.constraints.OneDetectedObjectMatcher;
import hu.bme.mdsd.ztz.model.constraints.RequiredCapabilityMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotCannotExecuteTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotExecutingUnlinkedTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotHasBatteryMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotHasCapabilityMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotHasTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.SameCollaboratorRobotMatcher;
import hu.bme.mdsd.ztz.model.constraints.SameMeasureMatcher;
import hu.bme.mdsd.ztz.model.constraints.SameTaskAsPrerequisiteMatcher;
import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsDifferMatcher;
import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsNotCompatibleMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.CollaboratorRangeDimensionsNotCompatibleQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.ConversionAvailableQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.DirectConversionAvailableQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.IncorrectWaitingTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.IsNotWaitingTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NoBatteryQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NonPositiveParticipantsQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NullMeasureConversionValueQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.OneDetectedObjectQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RequiredCapabilityQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotCannotExecuteTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotExecutingUnlinkedTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasBatteryQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasCapabilityQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SameCollaboratorRobotQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SameMeasureQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SameTaskAsPrerequisiteQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SizeDimensionsDifferQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SizeDimensionsNotCompatibleQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in constraints.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file constraints.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mdsd.ztz.model.constraints, the group contains the definition of the following patterns: <ul>
 * <li>sameMeasure</li>
 * <li>nullMeasureConversionValue</li>
 * <li>sameTaskAsPrerequisite</li>
 * <li>nonPositiveParticipants</li>
 * <li>incorrectWaitingTask</li>
 * <li>isNotWaitingTask</li>
 * <li>sameCollaboratorRobot</li>
 * <li>oneDetectedObject</li>
 * <li>robotCannotExecuteTask</li>
 * <li>requiredCapability</li>
 * <li>robotHasCapability</li>
 * <li>robotExecutingUnlinkedTask</li>
 * <li>robotHasTask</li>
 * <li>noBattery</li>
 * <li>robotHasBattery</li>
 * <li>sizeDimensionsDiffer</li>
 * <li>sizeDimensionsNotCompatible</li>
 * <li>directConversionAvailable</li>
 * <li>conversionAvailable</li>
 * <li>collaboratorRangeDimensionsNotCompatible</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Constraints extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Constraints instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Constraints();
    }
    return INSTANCE;
  }
  
  private static Constraints INSTANCE;
  
  private Constraints() throws IncQueryException {
    querySpecifications.add(SameMeasureQuerySpecification.instance());
    querySpecifications.add(NullMeasureConversionValueQuerySpecification.instance());
    querySpecifications.add(SameTaskAsPrerequisiteQuerySpecification.instance());
    querySpecifications.add(NonPositiveParticipantsQuerySpecification.instance());
    querySpecifications.add(IncorrectWaitingTaskQuerySpecification.instance());
    querySpecifications.add(IsNotWaitingTaskQuerySpecification.instance());
    querySpecifications.add(SameCollaboratorRobotQuerySpecification.instance());
    querySpecifications.add(OneDetectedObjectQuerySpecification.instance());
    querySpecifications.add(RobotCannotExecuteTaskQuerySpecification.instance());
    querySpecifications.add(RequiredCapabilityQuerySpecification.instance());
    querySpecifications.add(RobotHasCapabilityQuerySpecification.instance());
    querySpecifications.add(RobotExecutingUnlinkedTaskQuerySpecification.instance());
    querySpecifications.add(RobotHasTaskQuerySpecification.instance());
    querySpecifications.add(NoBatteryQuerySpecification.instance());
    querySpecifications.add(RobotHasBatteryQuerySpecification.instance());
    querySpecifications.add(SizeDimensionsDifferQuerySpecification.instance());
    querySpecifications.add(SizeDimensionsNotCompatibleQuerySpecification.instance());
    querySpecifications.add(DirectConversionAvailableQuerySpecification.instance());
    querySpecifications.add(ConversionAvailableQuerySpecification.instance());
    querySpecifications.add(CollaboratorRangeDimensionsNotCompatibleQuerySpecification.instance());
  }
  
  public SameMeasureQuerySpecification getSameMeasure() throws IncQueryException {
    return SameMeasureQuerySpecification.instance();
  }
  
  public SameMeasureMatcher getSameMeasure(final IncQueryEngine engine) throws IncQueryException {
    return SameMeasureMatcher.on(engine);
  }
  
  public NullMeasureConversionValueQuerySpecification getNullMeasureConversionValue() throws IncQueryException {
    return NullMeasureConversionValueQuerySpecification.instance();
  }
  
  public NullMeasureConversionValueMatcher getNullMeasureConversionValue(final IncQueryEngine engine) throws IncQueryException {
    return NullMeasureConversionValueMatcher.on(engine);
  }
  
  public SameTaskAsPrerequisiteQuerySpecification getSameTaskAsPrerequisite() throws IncQueryException {
    return SameTaskAsPrerequisiteQuerySpecification.instance();
  }
  
  public SameTaskAsPrerequisiteMatcher getSameTaskAsPrerequisite(final IncQueryEngine engine) throws IncQueryException {
    return SameTaskAsPrerequisiteMatcher.on(engine);
  }
  
  public NonPositiveParticipantsQuerySpecification getNonPositiveParticipants() throws IncQueryException {
    return NonPositiveParticipantsQuerySpecification.instance();
  }
  
  public NonPositiveParticipantsMatcher getNonPositiveParticipants(final IncQueryEngine engine) throws IncQueryException {
    return NonPositiveParticipantsMatcher.on(engine);
  }
  
  public IncorrectWaitingTaskQuerySpecification getIncorrectWaitingTask() throws IncQueryException {
    return IncorrectWaitingTaskQuerySpecification.instance();
  }
  
  public IncorrectWaitingTaskMatcher getIncorrectWaitingTask(final IncQueryEngine engine) throws IncQueryException {
    return IncorrectWaitingTaskMatcher.on(engine);
  }
  
  public IsNotWaitingTaskQuerySpecification getIsNotWaitingTask() throws IncQueryException {
    return IsNotWaitingTaskQuerySpecification.instance();
  }
  
  public IsNotWaitingTaskMatcher getIsNotWaitingTask(final IncQueryEngine engine) throws IncQueryException {
    return IsNotWaitingTaskMatcher.on(engine);
  }
  
  public SameCollaboratorRobotQuerySpecification getSameCollaboratorRobot() throws IncQueryException {
    return SameCollaboratorRobotQuerySpecification.instance();
  }
  
  public SameCollaboratorRobotMatcher getSameCollaboratorRobot(final IncQueryEngine engine) throws IncQueryException {
    return SameCollaboratorRobotMatcher.on(engine);
  }
  
  public OneDetectedObjectQuerySpecification getOneDetectedObject() throws IncQueryException {
    return OneDetectedObjectQuerySpecification.instance();
  }
  
  public OneDetectedObjectMatcher getOneDetectedObject(final IncQueryEngine engine) throws IncQueryException {
    return OneDetectedObjectMatcher.on(engine);
  }
  
  public RobotCannotExecuteTaskQuerySpecification getRobotCannotExecuteTask() throws IncQueryException {
    return RobotCannotExecuteTaskQuerySpecification.instance();
  }
  
  public RobotCannotExecuteTaskMatcher getRobotCannotExecuteTask(final IncQueryEngine engine) throws IncQueryException {
    return RobotCannotExecuteTaskMatcher.on(engine);
  }
  
  public RequiredCapabilityQuerySpecification getRequiredCapability() throws IncQueryException {
    return RequiredCapabilityQuerySpecification.instance();
  }
  
  public RequiredCapabilityMatcher getRequiredCapability(final IncQueryEngine engine) throws IncQueryException {
    return RequiredCapabilityMatcher.on(engine);
  }
  
  public RobotHasCapabilityQuerySpecification getRobotHasCapability() throws IncQueryException {
    return RobotHasCapabilityQuerySpecification.instance();
  }
  
  public RobotHasCapabilityMatcher getRobotHasCapability(final IncQueryEngine engine) throws IncQueryException {
    return RobotHasCapabilityMatcher.on(engine);
  }
  
  public RobotExecutingUnlinkedTaskQuerySpecification getRobotExecutingUnlinkedTask() throws IncQueryException {
    return RobotExecutingUnlinkedTaskQuerySpecification.instance();
  }
  
  public RobotExecutingUnlinkedTaskMatcher getRobotExecutingUnlinkedTask(final IncQueryEngine engine) throws IncQueryException {
    return RobotExecutingUnlinkedTaskMatcher.on(engine);
  }
  
  public RobotHasTaskQuerySpecification getRobotHasTask() throws IncQueryException {
    return RobotHasTaskQuerySpecification.instance();
  }
  
  public RobotHasTaskMatcher getRobotHasTask(final IncQueryEngine engine) throws IncQueryException {
    return RobotHasTaskMatcher.on(engine);
  }
  
  public NoBatteryQuerySpecification getNoBattery() throws IncQueryException {
    return NoBatteryQuerySpecification.instance();
  }
  
  public NoBatteryMatcher getNoBattery(final IncQueryEngine engine) throws IncQueryException {
    return NoBatteryMatcher.on(engine);
  }
  
  public RobotHasBatteryQuerySpecification getRobotHasBattery() throws IncQueryException {
    return RobotHasBatteryQuerySpecification.instance();
  }
  
  public RobotHasBatteryMatcher getRobotHasBattery(final IncQueryEngine engine) throws IncQueryException {
    return RobotHasBatteryMatcher.on(engine);
  }
  
  public SizeDimensionsDifferQuerySpecification getSizeDimensionsDiffer() throws IncQueryException {
    return SizeDimensionsDifferQuerySpecification.instance();
  }
  
  public SizeDimensionsDifferMatcher getSizeDimensionsDiffer(final IncQueryEngine engine) throws IncQueryException {
    return SizeDimensionsDifferMatcher.on(engine);
  }
  
  public SizeDimensionsNotCompatibleQuerySpecification getSizeDimensionsNotCompatible() throws IncQueryException {
    return SizeDimensionsNotCompatibleQuerySpecification.instance();
  }
  
  public SizeDimensionsNotCompatibleMatcher getSizeDimensionsNotCompatible(final IncQueryEngine engine) throws IncQueryException {
    return SizeDimensionsNotCompatibleMatcher.on(engine);
  }
  
  public DirectConversionAvailableQuerySpecification getDirectConversionAvailable() throws IncQueryException {
    return DirectConversionAvailableQuerySpecification.instance();
  }
  
  public DirectConversionAvailableMatcher getDirectConversionAvailable(final IncQueryEngine engine) throws IncQueryException {
    return DirectConversionAvailableMatcher.on(engine);
  }
  
  public ConversionAvailableQuerySpecification getConversionAvailable() throws IncQueryException {
    return ConversionAvailableQuerySpecification.instance();
  }
  
  public ConversionAvailableMatcher getConversionAvailable(final IncQueryEngine engine) throws IncQueryException {
    return ConversionAvailableMatcher.on(engine);
  }
  
  public CollaboratorRangeDimensionsNotCompatibleQuerySpecification getCollaboratorRangeDimensionsNotCompatible() throws IncQueryException {
    return CollaboratorRangeDimensionsNotCompatibleQuerySpecification.instance();
  }
  
  public CollaboratorRangeDimensionsNotCompatibleMatcher getCollaboratorRangeDimensionsNotCompatible(final IncQueryEngine engine) throws IncQueryException {
    return CollaboratorRangeDimensionsNotCompatibleMatcher.on(engine);
  }
}
