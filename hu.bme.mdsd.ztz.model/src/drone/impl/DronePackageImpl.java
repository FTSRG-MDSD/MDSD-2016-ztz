/**
 */
package drone.impl;

import behaviourModel.BehaviourModelPackage;

import behaviourModel.impl.BehaviourModelPackageImpl;

import drone.Action;
import drone.AreaObject;
import drone.Battery;
import drone.Capability;
import drone.CapabilityProperties;
import drone.Coordinate;
import drone.DetectedObject;
import drone.DroneFactory;
import drone.DronePackage;
import drone.Equipment;
import drone.MeasureConversion;
import drone.MeasureDimension;
import drone.MeasureProperty;
import drone.MeasureValue;
import drone.Mission;
import drone.NamedElement;
import drone.Position;
import drone.Property;
import drone.PropertyValue;
import drone.Robot;
import drone.RobotCollaboration;
import drone.RobotMissionContainer;
import drone.Size;
import drone.StringProperty;
import drone.Task;
import drone.TaskDescriptor;
import drone.TaskExecution;
import drone.TaskExecutionStatus;
import drone.TaskRequirement;
import drone.TaskStatus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronePackageImpl extends EPackageImpl implements DronePackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass missionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass taskEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass taskDescriptorEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass positionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass areaObjectEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass coordinateEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass propertyEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass robotEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass stringPropertyEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass taskExecutionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass robotCollaborationEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass taskRequirementEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass sizeEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass batteryEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass namedElementEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass detectedObjectEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass equipmentEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass actionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass measureValueEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass measureConversionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass measureDimensionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass measurePropertyEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass propertyValueEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass robotMissionContainerEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass capabilityEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass capabilityPropertiesEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum taskExecutionStatusEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum taskStatusEEnum = null;

        /**
         * Creates an instance of the model <b>Package</b>, registered with
         * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
         * package URI value.
         * <p>Note: the correct way to create the package is via the static
         * factory method {@link #init init()}, which also performs
         * initialization of the package, or returns the registered package,
         * if one already exists.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.ecore.EPackage.Registry
         * @see drone.DronePackage#eNS_URI
         * @see #init()
         * @generated
         */
        private DronePackageImpl() {
                super(eNS_URI, DroneFactory.eINSTANCE);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static boolean isInited = false;

        /**
         * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
         * 
         * <p>This method is used to initialize {@link DronePackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static DronePackage init() {
                if (isInited) return (DronePackage)EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI);

                // Obtain or create and register package
                DronePackageImpl theDronePackage = (DronePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DronePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DronePackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                BehaviourModelPackageImpl theBehaviourModelPackage = (BehaviourModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourModelPackage.eNS_URI) instanceof BehaviourModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourModelPackage.eNS_URI) : BehaviourModelPackage.eINSTANCE);

                // Create package meta-data objects
                theDronePackage.createPackageContents();
                theBehaviourModelPackage.createPackageContents();

                // Initialize created meta-data
                theDronePackage.initializePackageContents();
                theBehaviourModelPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theDronePackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(DronePackage.eNS_URI, theDronePackage);
                return theDronePackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMission() {
                return missionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMission_Tasks() {
                return (EReference)missionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMission_EstimatedTime() {
                return (EReference)missionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTask() {
                return taskEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTask_Mission() {
                return (EReference)taskEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTask_Descriptor() {
                return (EReference)taskEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTask_Execution() {
                return (EReference)taskEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTask_Requirement() {
                return (EReference)taskEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTask_Status() {
                return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTask_EstimatedTime() {
                return (EReference)taskEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTaskDescriptor() {
                return taskDescriptorEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskDescriptor_Targets() {
                return (EReference)taskDescriptorEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskDescriptor_Properties() {
                return (EReference)taskDescriptorEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskDescriptor_Task() {
                return (EReference)taskDescriptorEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getPosition() {
                return positionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getPosition_Coordinates() {
                return (EReference)positionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getPosition_Properties() {
                return (EReference)positionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAreaObject() {
                return areaObjectEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAreaObject_Positions() {
                return (EReference)areaObjectEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAreaObject_Size() {
                return (EReference)areaObjectEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAreaObject_Properties() {
                return (EReference)areaObjectEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getCoordinate() {
                return coordinateEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getCoordinate_Latitude() {
                return (EAttribute)coordinateEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getCoordinate_Longitude() {
                return (EAttribute)coordinateEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getCoordinate_Altitude() {
                return (EAttribute)coordinateEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getProperty() {
                return propertyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getProperty_Key() {
                return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getProperty_Value() {
                return (EReference)propertyEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getRobot() {
                return robotEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Position() {
                return (EReference)robotEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Size() {
                return (EReference)robotEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Batteries() {
                return (EReference)robotEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Collaborations() {
                return (EReference)robotEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_DetectedObjects() {
                return (EReference)robotEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Equipments() {
                return (EReference)robotEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Tasks() {
                return (EReference)robotEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Properties() {
                return (EReference)robotEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_CommunicationRange() {
                return (EReference)robotEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Weight() {
                return (EReference)robotEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Mission() {
                return (EReference)robotEClass.getEStructuralFeatures().get(10);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Actions() {
                return (EReference)robotEClass.getEStructuralFeatures().get(11);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Capabilities() {
                return (EReference)robotEClass.getEStructuralFeatures().get(12);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_CommunicationAction() {
                return (EReference)robotEClass.getEStructuralFeatures().get(13);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_CapabilityProperties() {
                return (EReference)robotEClass.getEStructuralFeatures().get(14);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getStringProperty() {
                return stringPropertyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getStringProperty_Value() {
                return (EAttribute)stringPropertyEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTaskExecution() {
                return taskExecutionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskExecution_Executors() {
                return (EReference)taskExecutionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskExecution_ExecutionTime() {
                return (EReference)taskExecutionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTaskExecution_Status() {
                return (EAttribute)taskExecutionEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskExecution_Task() {
                return (EReference)taskExecutionEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getRobotCollaboration() {
                return robotCollaborationEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotCollaboration_Collaborator() {
                return (EReference)robotCollaborationEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotCollaboration_AvailabilityRange() {
                return (EReference)robotCollaborationEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTaskRequirement() {
                return taskRequirementEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_Task() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_Prerequisite() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTaskRequirement_Participants() {
                return (EAttribute)taskRequirementEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_Properties() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_RequiredCapabilities() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_CapabilityProperties() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSize() {
                return sizeEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSize_Width() {
                return (EReference)sizeEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSize_Height() {
                return (EReference)sizeEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getSize_Length() {
                return (EReference)sizeEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getBattery() {
                return batteryEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBattery_Capacity() {
                return (EReference)batteryEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBattery_Voltage() {
                return (EReference)batteryEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBattery_RechargeTime() {
                return (EReference)batteryEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBattery_Properties() {
                return (EReference)batteryEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getNamedElement() {
                return namedElementEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getNamedElement_Name() {
                return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDetectedObject() {
                return detectedObjectEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDetectedObject_Object() {
                return (EReference)detectedObjectEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDetectedObject_Obstacle() {
                return (EAttribute)detectedObjectEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getEquipment() {
                return equipmentEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getEquipment_Properties() {
                return (EReference)equipmentEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getEquipment_Facilitate() {
                return (EReference)equipmentEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAction() {
                return actionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAction_Properties() {
                return (EReference)actionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAction_CurrentTask() {
                return (EReference)actionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMeasureValue() {
                return measureValueEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMeasureValue_Value() {
                return (EAttribute)measureValueEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMeasureValue_Dimension() {
                return (EReference)measureValueEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMeasureConversion() {
                return measureConversionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMeasureConversion_Rate() {
                return (EAttribute)measureConversionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMeasureConversion_Dimension() {
                return (EReference)measureConversionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMeasureDimension() {
                return measureDimensionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMeasureDimension_Conversions() {
                return (EReference)measureDimensionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMeasureProperty() {
                return measurePropertyEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMeasureProperty_Value() {
                return (EReference)measurePropertyEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getPropertyValue() {
                return propertyValueEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getRobotMissionContainer() {
                return robotMissionContainerEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotMissionContainer_Missions() {
                return (EReference)robotMissionContainerEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotMissionContainer_Robots() {
                return (EReference)robotMissionContainerEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotMissionContainer_MeasureDimensions() {
                return (EReference)robotMissionContainerEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotMissionContainer_AreaObjects() {
                return (EReference)robotMissionContainerEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotMissionContainer_Capabilities() {
                return (EReference)robotMissionContainerEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getCapability() {
                return capabilityEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getCapabilityProperties() {
                return capabilityPropertiesEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getCapabilityProperties_Properties() {
                return (EReference)capabilityPropertiesEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getCapabilityProperties_Capability() {
                return (EReference)capabilityPropertiesEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getTaskExecutionStatus() {
                return taskExecutionStatusEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getTaskStatus() {
                return taskStatusEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DroneFactory getDroneFactory() {
                return (DroneFactory)getEFactoryInstance();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isCreated = false;

        /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createPackageContents() {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                missionEClass = createEClass(MISSION);
                createEReference(missionEClass, MISSION__TASKS);
                createEReference(missionEClass, MISSION__ESTIMATED_TIME);

                taskEClass = createEClass(TASK);
                createEReference(taskEClass, TASK__MISSION);
                createEReference(taskEClass, TASK__DESCRIPTOR);
                createEReference(taskEClass, TASK__EXECUTION);
                createEReference(taskEClass, TASK__REQUIREMENT);
                createEAttribute(taskEClass, TASK__STATUS);
                createEReference(taskEClass, TASK__ESTIMATED_TIME);

                taskDescriptorEClass = createEClass(TASK_DESCRIPTOR);
                createEReference(taskDescriptorEClass, TASK_DESCRIPTOR__TARGETS);
                createEReference(taskDescriptorEClass, TASK_DESCRIPTOR__PROPERTIES);
                createEReference(taskDescriptorEClass, TASK_DESCRIPTOR__TASK);

                positionEClass = createEClass(POSITION);
                createEReference(positionEClass, POSITION__COORDINATES);
                createEReference(positionEClass, POSITION__PROPERTIES);

                areaObjectEClass = createEClass(AREA_OBJECT);
                createEReference(areaObjectEClass, AREA_OBJECT__POSITIONS);
                createEReference(areaObjectEClass, AREA_OBJECT__SIZE);
                createEReference(areaObjectEClass, AREA_OBJECT__PROPERTIES);

                coordinateEClass = createEClass(COORDINATE);
                createEAttribute(coordinateEClass, COORDINATE__LATITUDE);
                createEAttribute(coordinateEClass, COORDINATE__LONGITUDE);
                createEAttribute(coordinateEClass, COORDINATE__ALTITUDE);

                propertyEClass = createEClass(PROPERTY);
                createEAttribute(propertyEClass, PROPERTY__KEY);
                createEReference(propertyEClass, PROPERTY__VALUE);

                robotEClass = createEClass(ROBOT);
                createEReference(robotEClass, ROBOT__POSITION);
                createEReference(robotEClass, ROBOT__SIZE);
                createEReference(robotEClass, ROBOT__BATTERIES);
                createEReference(robotEClass, ROBOT__COLLABORATIONS);
                createEReference(robotEClass, ROBOT__DETECTED_OBJECTS);
                createEReference(robotEClass, ROBOT__EQUIPMENTS);
                createEReference(robotEClass, ROBOT__TASKS);
                createEReference(robotEClass, ROBOT__PROPERTIES);
                createEReference(robotEClass, ROBOT__COMMUNICATION_RANGE);
                createEReference(robotEClass, ROBOT__WEIGHT);
                createEReference(robotEClass, ROBOT__MISSION);
                createEReference(robotEClass, ROBOT__ACTIONS);
                createEReference(robotEClass, ROBOT__CAPABILITIES);
                createEReference(robotEClass, ROBOT__COMMUNICATION_ACTION);
                createEReference(robotEClass, ROBOT__CAPABILITY_PROPERTIES);

                stringPropertyEClass = createEClass(STRING_PROPERTY);
                createEAttribute(stringPropertyEClass, STRING_PROPERTY__VALUE);

                taskExecutionEClass = createEClass(TASK_EXECUTION);
                createEReference(taskExecutionEClass, TASK_EXECUTION__EXECUTORS);
                createEReference(taskExecutionEClass, TASK_EXECUTION__EXECUTION_TIME);
                createEAttribute(taskExecutionEClass, TASK_EXECUTION__STATUS);
                createEReference(taskExecutionEClass, TASK_EXECUTION__TASK);

                robotCollaborationEClass = createEClass(ROBOT_COLLABORATION);
                createEReference(robotCollaborationEClass, ROBOT_COLLABORATION__COLLABORATOR);
                createEReference(robotCollaborationEClass, ROBOT_COLLABORATION__AVAILABILITY_RANGE);

                taskRequirementEClass = createEClass(TASK_REQUIREMENT);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__TASK);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__PREREQUISITE);
                createEAttribute(taskRequirementEClass, TASK_REQUIREMENT__PARTICIPANTS);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__PROPERTIES);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__REQUIRED_CAPABILITIES);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__CAPABILITY_PROPERTIES);

                sizeEClass = createEClass(SIZE);
                createEReference(sizeEClass, SIZE__WIDTH);
                createEReference(sizeEClass, SIZE__HEIGHT);
                createEReference(sizeEClass, SIZE__LENGTH);

                batteryEClass = createEClass(BATTERY);
                createEReference(batteryEClass, BATTERY__CAPACITY);
                createEReference(batteryEClass, BATTERY__VOLTAGE);
                createEReference(batteryEClass, BATTERY__RECHARGE_TIME);
                createEReference(batteryEClass, BATTERY__PROPERTIES);

                namedElementEClass = createEClass(NAMED_ELEMENT);
                createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

                detectedObjectEClass = createEClass(DETECTED_OBJECT);
                createEReference(detectedObjectEClass, DETECTED_OBJECT__OBJECT);
                createEAttribute(detectedObjectEClass, DETECTED_OBJECT__OBSTACLE);

                equipmentEClass = createEClass(EQUIPMENT);
                createEReference(equipmentEClass, EQUIPMENT__PROPERTIES);
                createEReference(equipmentEClass, EQUIPMENT__FACILITATE);

                actionEClass = createEClass(ACTION);
                createEReference(actionEClass, ACTION__PROPERTIES);
                createEReference(actionEClass, ACTION__CURRENT_TASK);

                measureValueEClass = createEClass(MEASURE_VALUE);
                createEAttribute(measureValueEClass, MEASURE_VALUE__VALUE);
                createEReference(measureValueEClass, MEASURE_VALUE__DIMENSION);

                measureConversionEClass = createEClass(MEASURE_CONVERSION);
                createEAttribute(measureConversionEClass, MEASURE_CONVERSION__RATE);
                createEReference(measureConversionEClass, MEASURE_CONVERSION__DIMENSION);

                measureDimensionEClass = createEClass(MEASURE_DIMENSION);
                createEReference(measureDimensionEClass, MEASURE_DIMENSION__CONVERSIONS);

                measurePropertyEClass = createEClass(MEASURE_PROPERTY);
                createEReference(measurePropertyEClass, MEASURE_PROPERTY__VALUE);

                propertyValueEClass = createEClass(PROPERTY_VALUE);

                robotMissionContainerEClass = createEClass(ROBOT_MISSION_CONTAINER);
                createEReference(robotMissionContainerEClass, ROBOT_MISSION_CONTAINER__MISSIONS);
                createEReference(robotMissionContainerEClass, ROBOT_MISSION_CONTAINER__ROBOTS);
                createEReference(robotMissionContainerEClass, ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS);
                createEReference(robotMissionContainerEClass, ROBOT_MISSION_CONTAINER__AREA_OBJECTS);
                createEReference(robotMissionContainerEClass, ROBOT_MISSION_CONTAINER__CAPABILITIES);

                capabilityEClass = createEClass(CAPABILITY);

                capabilityPropertiesEClass = createEClass(CAPABILITY_PROPERTIES);
                createEReference(capabilityPropertiesEClass, CAPABILITY_PROPERTIES__PROPERTIES);
                createEReference(capabilityPropertiesEClass, CAPABILITY_PROPERTIES__CAPABILITY);

                // Create enums
                taskExecutionStatusEEnum = createEEnum(TASK_EXECUTION_STATUS);
                taskStatusEEnum = createEEnum(TASK_STATUS);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isInitialized = false;

        /**
         * Complete the initialization of the package and its meta-model.  This
         * method is guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void initializePackageContents() {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Obtain other dependent packages
                BehaviourModelPackage theBehaviourModelPackage = (BehaviourModelPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourModelPackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                missionEClass.getESuperTypes().add(this.getNamedElement());
                taskEClass.getESuperTypes().add(this.getNamedElement());
                areaObjectEClass.getESuperTypes().add(this.getNamedElement());
                robotEClass.getESuperTypes().add(this.getNamedElement());
                stringPropertyEClass.getESuperTypes().add(this.getPropertyValue());
                equipmentEClass.getESuperTypes().add(this.getNamedElement());
                measureDimensionEClass.getESuperTypes().add(this.getNamedElement());
                measurePropertyEClass.getESuperTypes().add(this.getPropertyValue());
                capabilityEClass.getESuperTypes().add(this.getNamedElement());

                // Initialize classes, features, and operations; add parameters
                initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMission_Tasks(), this.getTask(), this.getTask_Mission(), "tasks", null, 1, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMission_EstimatedTime(), this.getMeasureValue(), null, "estimatedTime", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getTask_Mission(), this.getMission(), this.getMission_Tasks(), "mission", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTask_Descriptor(), this.getTaskDescriptor(), this.getTaskDescriptor_Task(), "descriptor", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTask_Execution(), this.getTaskExecution(), this.getTaskExecution_Task(), "execution", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTask_Requirement(), this.getTaskRequirement(), this.getTaskRequirement_Task(), "requirement", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTask_Status(), this.getTaskStatus(), "status", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTask_EstimatedTime(), this.getMeasureValue(), null, "estimatedTime", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(taskDescriptorEClass, TaskDescriptor.class, "TaskDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getTaskDescriptor_Targets(), this.getAreaObject(), null, "targets", null, 0, -1, TaskDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskDescriptor_Properties(), this.getProperty(), null, "properties", null, 0, -1, TaskDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskDescriptor_Task(), this.getTask(), this.getTask_Descriptor(), "task", null, 0, 1, TaskDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getPosition_Coordinates(), this.getCoordinate(), null, "coordinates", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getPosition_Properties(), this.getProperty(), null, "properties", null, 0, -1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(areaObjectEClass, AreaObject.class, "AreaObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAreaObject_Positions(), this.getPosition(), null, "positions", null, 0, -1, AreaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getAreaObject_Size(), this.getSize(), null, "size", null, 0, 1, AreaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getAreaObject_Properties(), this.getProperty(), null, "properties", null, 0, -1, AreaObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(coordinateEClass, Coordinate.class, "Coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getCoordinate_Latitude(), ecorePackage.getEFloat(), "latitude", null, 1, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getCoordinate_Longitude(), ecorePackage.getEFloat(), "longitude", null, 1, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getCoordinate_Altitude(), ecorePackage.getEFloat(), "altitude", null, 1, 1, Coordinate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getProperty_Key(), ecorePackage.getEString(), "key", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getProperty_Value(), this.getPropertyValue(), null, "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getRobot_Position(), this.getPosition(), null, "position", null, 1, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Size(), this.getSize(), null, "size", null, 1, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Batteries(), this.getBattery(), null, "batteries", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Collaborations(), this.getRobotCollaboration(), null, "collaborations", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_DetectedObjects(), this.getDetectedObject(), null, "detectedObjects", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Equipments(), this.getEquipment(), null, "equipments", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Properties(), this.getProperty(), null, "properties", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_CommunicationRange(), this.getMeasureValue(), null, "communicationRange", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Weight(), this.getMeasureValue(), null, "weight", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Mission(), this.getMission(), null, "mission", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Actions(), this.getAction(), null, "actions", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_CommunicationAction(), theBehaviourModelPackage.getCommunicationAction(), null, "communicationAction", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_CapabilityProperties(), this.getCapabilityProperties(), null, "capabilityProperties", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getStringProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(taskExecutionEClass, TaskExecution.class, "TaskExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getTaskExecution_Executors(), this.getRobot(), null, "executors", null, 1, -1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskExecution_ExecutionTime(), this.getMeasureValue(), null, "executionTime", null, 0, 1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTaskExecution_Status(), this.getTaskExecutionStatus(), "status", null, 1, 1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskExecution_Task(), this.getTask(), this.getTask_Execution(), "task", null, 0, 1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(robotCollaborationEClass, RobotCollaboration.class, "RobotCollaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getRobotCollaboration_Collaborator(), this.getRobot(), null, "collaborator", null, 1, 1, RobotCollaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobotCollaboration_AvailabilityRange(), this.getMeasureValue(), null, "availabilityRange", null, 0, 1, RobotCollaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(taskRequirementEClass, TaskRequirement.class, "TaskRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getTaskRequirement_Task(), this.getTask(), this.getTask_Requirement(), "task", null, 1, 1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_Prerequisite(), this.getTask(), null, "prerequisite", null, 0, 1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTaskRequirement_Participants(), ecorePackage.getEInt(), "participants", null, 1, 1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_Properties(), this.getProperty(), null, "properties", null, 0, -1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_RequiredCapabilities(), this.getCapability(), null, "requiredCapabilities", null, 0, -1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_CapabilityProperties(), this.getCapabilityProperties(), null, "capabilityProperties", null, 0, -1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getSize_Width(), this.getMeasureValue(), null, "width", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getSize_Height(), this.getMeasureValue(), null, "height", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getSize_Length(), this.getMeasureValue(), null, "length", null, 1, 1, Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBattery_Capacity(), this.getMeasureValue(), null, "capacity", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBattery_Voltage(), this.getMeasureValue(), null, "voltage", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBattery_RechargeTime(), this.getMeasureValue(), null, "rechargeTime", null, 1, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBattery_Properties(), this.getProperty(), null, "properties", null, 0, -1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(detectedObjectEClass, DetectedObject.class, "DetectedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDetectedObject_Object(), this.getAreaObject(), null, "object", null, 1, 1, DetectedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDetectedObject_Obstacle(), ecorePackage.getEBoolean(), "obstacle", null, 0, 1, DetectedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getEquipment_Properties(), this.getProperty(), null, "properties", null, 0, -1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getEquipment_Facilitate(), this.getCapability(), null, "facilitate", null, 0, -1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAction_Properties(), this.getProperty(), null, "properties", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getAction_CurrentTask(), this.getTask(), null, "currentTask", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(measureValueEClass, MeasureValue.class, "MeasureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMeasureValue_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, MeasureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMeasureValue_Dimension(), this.getMeasureDimension(), null, "dimension", null, 1, 1, MeasureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(measureConversionEClass, MeasureConversion.class, "MeasureConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getMeasureConversion_Rate(), ecorePackage.getEFloat(), "rate", null, 0, 1, MeasureConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMeasureConversion_Dimension(), this.getMeasureDimension(), null, "dimension", null, 1, 1, MeasureConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(measureDimensionEClass, MeasureDimension.class, "MeasureDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMeasureDimension_Conversions(), this.getMeasureConversion(), null, "conversions", null, 0, -1, MeasureDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(measurePropertyEClass, MeasureProperty.class, "MeasureProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMeasureProperty_Value(), this.getMeasureValue(), null, "value", null, 1, 1, MeasureProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(robotMissionContainerEClass, RobotMissionContainer.class, "RobotMissionContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getRobotMissionContainer_Missions(), this.getMission(), null, "missions", null, 0, -1, RobotMissionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobotMissionContainer_Robots(), this.getRobot(), null, "robots", null, 0, -1, RobotMissionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobotMissionContainer_MeasureDimensions(), this.getMeasureDimension(), null, "measureDimensions", null, 0, -1, RobotMissionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobotMissionContainer_AreaObjects(), this.getAreaObject(), null, "areaObjects", null, 0, -1, RobotMissionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobotMissionContainer_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, RobotMissionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

                initEClass(capabilityPropertiesEClass, CapabilityProperties.class, "CapabilityProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getCapabilityProperties_Properties(), this.getProperty(), null, "properties", null, 0, -1, CapabilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getCapabilityProperties_Capability(), this.getCapability(), null, "capability", null, 1, 1, CapabilityProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Initialize enums and add enum literals
                initEEnum(taskExecutionStatusEEnum, TaskExecutionStatus.class, "TaskExecutionStatus");
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.READY);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.FINISHED);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.SUSPENDED);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.IN_PROGRESS);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.WAITING);

                initEEnum(taskStatusEEnum, TaskStatus.class, "TaskStatus");
                addEEnumLiteral(taskStatusEEnum, TaskStatus.READY);
                addEEnumLiteral(taskStatusEEnum, TaskStatus.FINISHED);
                addEEnumLiteral(taskStatusEEnum, TaskStatus.WAITING);

                // Create resource
                createResource(eNS_URI);
        }

} //DronePackageImpl
