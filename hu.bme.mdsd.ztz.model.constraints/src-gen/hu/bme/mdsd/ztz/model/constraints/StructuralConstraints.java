package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.ConversionAvailableMatcher;
import hu.bme.mdsd.ztz.model.constraints.DirectConversionAvailableMatcher;
import hu.bme.mdsd.ztz.model.constraints.EmptyMissionMatcher;
import hu.bme.mdsd.ztz.model.constraints.MissionContainsTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.MultipleCapabilityPropertiesMatcher;
import hu.bme.mdsd.ztz.model.constraints.MultipleMissionMatcher;
import hu.bme.mdsd.ztz.model.constraints.NoBatteryMatcher;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedEquipmentToRobotMatcher;
import hu.bme.mdsd.ztz.model.constraints.NullMeasureConversionValueMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotHasBatteryMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotHasCapabilityMatcher;
import hu.bme.mdsd.ztz.model.constraints.SameMeasureMatcher;
import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsDifferMatcher;
import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsNotCompatibleMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.ConversionAvailableQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.DirectConversionAvailableQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.EmptyMissionQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.MissionContainsTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.MultipleCapabilityPropertiesQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.MultipleMissionQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NoBatteryQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NotCorrectlyLinkedEquipmentToRobotQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NullMeasureConversionValueQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasBatteryQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasCapabilityQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SameMeasureQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SizeDimensionsDifferQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SizeDimensionsNotCompatibleQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in structuralConstraints.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file structuralConstraints.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mdsd.ztz.model.constraints, the group contains the definition of the following patterns: <ul>
 * <li>sameMeasure</li>
 * <li>nullMeasureConversionValue</li>
 * <li>robotHasCapability</li>
 * <li>noBattery</li>
 * <li>robotHasBattery</li>
 * <li>sizeDimensionsDiffer</li>
 * <li>sizeDimensionsNotCompatible</li>
 * <li>directConversionAvailable</li>
 * <li>conversionAvailable</li>
 * <li>multipleMission</li>
 * <li>emptyMission</li>
 * <li>missionContainsTask</li>
 * <li>multipleCapabilityProperties</li>
 * <li>notCorrectlyLinkedCapabilityPropertiesToRobot</li>
 * <li>notCorrectlyLinkedEquipmentToRobot</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class StructuralConstraints extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static StructuralConstraints instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new StructuralConstraints();
    }
    return INSTANCE;
  }
  
  private static StructuralConstraints INSTANCE;
  
  private StructuralConstraints() throws IncQueryException {
    querySpecifications.add(SameMeasureQuerySpecification.instance());
    querySpecifications.add(NullMeasureConversionValueQuerySpecification.instance());
    querySpecifications.add(RobotHasCapabilityQuerySpecification.instance());
    querySpecifications.add(NoBatteryQuerySpecification.instance());
    querySpecifications.add(RobotHasBatteryQuerySpecification.instance());
    querySpecifications.add(SizeDimensionsDifferQuerySpecification.instance());
    querySpecifications.add(SizeDimensionsNotCompatibleQuerySpecification.instance());
    querySpecifications.add(DirectConversionAvailableQuerySpecification.instance());
    querySpecifications.add(ConversionAvailableQuerySpecification.instance());
    querySpecifications.add(MultipleMissionQuerySpecification.instance());
    querySpecifications.add(EmptyMissionQuerySpecification.instance());
    querySpecifications.add(MissionContainsTaskQuerySpecification.instance());
    querySpecifications.add(MultipleCapabilityPropertiesQuerySpecification.instance());
    querySpecifications.add(NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification.instance());
    querySpecifications.add(NotCorrectlyLinkedEquipmentToRobotQuerySpecification.instance());
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
  
  public RobotHasCapabilityQuerySpecification getRobotHasCapability() throws IncQueryException {
    return RobotHasCapabilityQuerySpecification.instance();
  }
  
  public RobotHasCapabilityMatcher getRobotHasCapability(final IncQueryEngine engine) throws IncQueryException {
    return RobotHasCapabilityMatcher.on(engine);
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
  
  public MultipleMissionQuerySpecification getMultipleMission() throws IncQueryException {
    return MultipleMissionQuerySpecification.instance();
  }
  
  public MultipleMissionMatcher getMultipleMission(final IncQueryEngine engine) throws IncQueryException {
    return MultipleMissionMatcher.on(engine);
  }
  
  public EmptyMissionQuerySpecification getEmptyMission() throws IncQueryException {
    return EmptyMissionQuerySpecification.instance();
  }
  
  public EmptyMissionMatcher getEmptyMission(final IncQueryEngine engine) throws IncQueryException {
    return EmptyMissionMatcher.on(engine);
  }
  
  public MissionContainsTaskQuerySpecification getMissionContainsTask() throws IncQueryException {
    return MissionContainsTaskQuerySpecification.instance();
  }
  
  public MissionContainsTaskMatcher getMissionContainsTask(final IncQueryEngine engine) throws IncQueryException {
    return MissionContainsTaskMatcher.on(engine);
  }
  
  public MultipleCapabilityPropertiesQuerySpecification getMultipleCapabilityProperties() throws IncQueryException {
    return MultipleCapabilityPropertiesQuerySpecification.instance();
  }
  
  public MultipleCapabilityPropertiesMatcher getMultipleCapabilityProperties(final IncQueryEngine engine) throws IncQueryException {
    return MultipleCapabilityPropertiesMatcher.on(engine);
  }
  
  public NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification getNotCorrectlyLinkedCapabilityPropertiesToRobot() throws IncQueryException {
    return NotCorrectlyLinkedCapabilityPropertiesToRobotQuerySpecification.instance();
  }
  
  public NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher getNotCorrectlyLinkedCapabilityPropertiesToRobot(final IncQueryEngine engine) throws IncQueryException {
    return NotCorrectlyLinkedCapabilityPropertiesToRobotMatcher.on(engine);
  }
  
  public NotCorrectlyLinkedEquipmentToRobotQuerySpecification getNotCorrectlyLinkedEquipmentToRobot() throws IncQueryException {
    return NotCorrectlyLinkedEquipmentToRobotQuerySpecification.instance();
  }
  
  public NotCorrectlyLinkedEquipmentToRobotMatcher getNotCorrectlyLinkedEquipmentToRobot(final IncQueryEngine engine) throws IncQueryException {
    return NotCorrectlyLinkedEquipmentToRobotMatcher.on(engine);
  }
}
