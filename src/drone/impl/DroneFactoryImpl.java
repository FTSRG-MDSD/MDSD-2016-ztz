/**
 */
package drone.impl;

import drone.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroneFactoryImpl extends EFactoryImpl implements DroneFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static DroneFactory init() {
                try {
                        DroneFactory theDroneFactory = (DroneFactory)EPackage.Registry.INSTANCE.getEFactory(DronePackage.eNS_URI);
                        if (theDroneFactory != null) {
                                return theDroneFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new DroneFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DroneFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case DronePackage.MISSION: return createMission();
                        case DronePackage.TASK: return createTask();
                        case DronePackage.TASK_DESCRIPTOR: return createTaskDescriptor();
                        case DronePackage.POSITION: return createPosition();
                        case DronePackage.AREA_OBJECT: return createAreaObject();
                        case DronePackage.COORDINATE: return createCoordinate();
                        case DronePackage.PROPERTY: return createProperty();
                        case DronePackage.ROBOT: return createRobot();
                        case DronePackage.STRING_PROPERTY: return createStringProperty();
                        case DronePackage.TASK_EXECUTION: return createTaskExecution();
                        case DronePackage.ROBOT_COLLABORATION: return createRobotCollaboration();
                        case DronePackage.TASK_REQUIREMENT: return createTaskRequirement();
                        case DronePackage.SIZE: return createSize();
                        case DronePackage.BATTERY: return createBattery();
                        case DronePackage.DETECTED_OBJECT: return createDetectedObject();
                        case DronePackage.EQUIPMENT: return createEquipment();
                        case DronePackage.ACTION: return createAction();
                        case DronePackage.MEASURE_VALUE: return createMeasureValue();
                        case DronePackage.MEASURE_CONVERSION: return createMeasureConversion();
                        case DronePackage.MEASURE_DIMENSION: return createMeasureDimension();
                        case DronePackage.MEASURE_PROPERTY: return createMeasureProperty();
                        case DronePackage.ROBOT_MISSION_CONTAINER: return createRobotMissionContainer();
                        case DronePackage.CAPABILITY: return createCapability();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object createFromString(EDataType eDataType, String initialValue) {
                switch (eDataType.getClassifierID()) {
                        case DronePackage.CONDITION:
                                return createConditionFromString(eDataType, initialValue);
                        case DronePackage.TASK_EXECUTION_STATUS:
                                return createTaskExecutionStatusFromString(eDataType, initialValue);
                        case DronePackage.TASK_STATUS:
                                return createTaskStatusFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String convertToString(EDataType eDataType, Object instanceValue) {
                switch (eDataType.getClassifierID()) {
                        case DronePackage.CONDITION:
                                return convertConditionToString(eDataType, instanceValue);
                        case DronePackage.TASK_EXECUTION_STATUS:
                                return convertTaskExecutionStatusToString(eDataType, instanceValue);
                        case DronePackage.TASK_STATUS:
                                return convertTaskStatusToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Mission createMission() {
                MissionImpl mission = new MissionImpl();
                return mission;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task createTask() {
                TaskImpl task = new TaskImpl();
                return task;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskDescriptor createTaskDescriptor() {
                TaskDescriptorImpl taskDescriptor = new TaskDescriptorImpl();
                return taskDescriptor;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Position createPosition() {
                PositionImpl position = new PositionImpl();
                return position;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AreaObject createAreaObject() {
                AreaObjectImpl areaObject = new AreaObjectImpl();
                return areaObject;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Coordinate createCoordinate() {
                CoordinateImpl coordinate = new CoordinateImpl();
                return coordinate;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Property createProperty() {
                PropertyImpl property = new PropertyImpl();
                return property;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Robot createRobot() {
                RobotImpl robot = new RobotImpl();
                return robot;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StringProperty createStringProperty() {
                StringPropertyImpl stringProperty = new StringPropertyImpl();
                return stringProperty;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution createTaskExecution() {
                TaskExecutionImpl taskExecution = new TaskExecutionImpl();
                return taskExecution;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotCollaboration createRobotCollaboration() {
                RobotCollaborationImpl robotCollaboration = new RobotCollaborationImpl();
                return robotCollaboration;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskRequirement createTaskRequirement() {
                TaskRequirementImpl taskRequirement = new TaskRequirementImpl();
                return taskRequirement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Size createSize() {
                SizeImpl size = new SizeImpl();
                return size;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Battery createBattery() {
                BatteryImpl battery = new BatteryImpl();
                return battery;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DetectedObject createDetectedObject() {
                DetectedObjectImpl detectedObject = new DetectedObjectImpl();
                return detectedObject;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Equipment createEquipment() {
                EquipmentImpl equipment = new EquipmentImpl();
                return equipment;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Action createAction() {
                ActionImpl action = new ActionImpl();
                return action;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue createMeasureValue() {
                MeasureValueImpl measureValue = new MeasureValueImpl();
                return measureValue;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureConversion createMeasureConversion() {
                MeasureConversionImpl measureConversion = new MeasureConversionImpl();
                return measureConversion;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureDimension createMeasureDimension() {
                MeasureDimensionImpl measureDimension = new MeasureDimensionImpl();
                return measureDimension;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureProperty createMeasureProperty() {
                MeasurePropertyImpl measureProperty = new MeasurePropertyImpl();
                return measureProperty;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotMissionContainer createRobotMissionContainer() {
                RobotMissionContainerImpl robotMissionContainer = new RobotMissionContainerImpl();
                return robotMissionContainer;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Capability createCapability() {
                CapabilityImpl capability = new CapabilityImpl();
                return capability;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Condition createConditionFromString(EDataType eDataType, String initialValue) {
                Condition result = Condition.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertConditionToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecutionStatus createTaskExecutionStatusFromString(EDataType eDataType, String initialValue) {
                TaskExecutionStatus result = TaskExecutionStatus.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertTaskExecutionStatusToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskStatus createTaskStatusFromString(EDataType eDataType, String initialValue) {
                TaskStatus result = TaskStatus.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertTaskStatusToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DronePackage getDronePackage() {
                return (DronePackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static DronePackage getPackage() {
                return DronePackage.eINSTANCE;
        }

} //DroneFactoryImpl
