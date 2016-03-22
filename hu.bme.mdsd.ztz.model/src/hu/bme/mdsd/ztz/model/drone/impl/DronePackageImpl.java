/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Battery;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.Coordinate;
import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.Equipment;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureProperty;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.NamedElement;
import hu.bme.mdsd.ztz.model.drone.Position;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;
import hu.bme.mdsd.ztz.model.drone.Size;
import hu.bme.mdsd.ztz.model.drone.StringProperty;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
        private EClass equipmentEClass = null;

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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#eNS_URI
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

                // Create package meta-data objects
                theDronePackage.createPackageContents();

                // Initialize created meta-data
                theDronePackage.initializePackageContents();

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
        public EReference getRobot_Equipments() {
                return (EReference)robotEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Tasks() {
                return (EReference)robotEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Properties() {
                return (EReference)robotEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_CommunicationRange() {
                return (EReference)robotEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Weight() {
                return (EReference)robotEClass.getEStructuralFeatures().get(7);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Mission() {
                return (EReference)robotEClass.getEStructuralFeatures().get(8);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_Capabilities() {
                return (EReference)robotEClass.getEStructuralFeatures().get(9);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobot_CapabilityProperties() {
                return (EReference)robotEClass.getEStructuralFeatures().get(10);
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

                taskEClass = createEClass(TASK);
                createEReference(taskEClass, TASK__MISSION);
                createEReference(taskEClass, TASK__DESCRIPTOR);

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
                createEReference(robotEClass, ROBOT__EQUIPMENTS);
                createEReference(robotEClass, ROBOT__TASKS);
                createEReference(robotEClass, ROBOT__PROPERTIES);
                createEReference(robotEClass, ROBOT__COMMUNICATION_RANGE);
                createEReference(robotEClass, ROBOT__WEIGHT);
                createEReference(robotEClass, ROBOT__MISSION);
                createEReference(robotEClass, ROBOT__CAPABILITIES);
                createEReference(robotEClass, ROBOT__CAPABILITY_PROPERTIES);

                stringPropertyEClass = createEClass(STRING_PROPERTY);
                createEAttribute(stringPropertyEClass, STRING_PROPERTY__VALUE);

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

                equipmentEClass = createEClass(EQUIPMENT);
                createEReference(equipmentEClass, EQUIPMENT__PROPERTIES);
                createEReference(equipmentEClass, EQUIPMENT__FACILITATE);

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

                initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getTask_Mission(), this.getMission(), this.getMission_Tasks(), "mission", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTask_Descriptor(), this.getTaskDescriptor(), this.getTaskDescriptor_Task(), "descriptor", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
                initEReference(getRobot_Equipments(), this.getEquipment(), null, "equipments", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Properties(), this.getProperty(), null, "properties", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_CommunicationRange(), this.getMeasureValue(), null, "communicationRange", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Weight(), this.getMeasureValue(), null, "weight", null, 0, 1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Mission(), this.getMission(), null, "mission", null, 0, 1, Robot.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobot_CapabilityProperties(), this.getCapabilityProperties(), null, "capabilityProperties", null, 0, -1, Robot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getStringProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

                initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getEquipment_Properties(), this.getProperty(), null, "properties", null, 0, -1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getEquipment_Facilitate(), this.getCapability(), null, "facilitate", null, 0, -1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

                // Create resource
                createResource(eNS_URI);

                // Create annotations
                // http://www.eclipse.org/emf/2002/Ecore
                createEcoreAnnotations();
                // org.eclipse.incquery.querybasedfeature
                createOrgAnnotations();
        }

        /**
         * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void createEcoreAnnotations() {
                String source = "http://www.eclipse.org/emf/2002/Ecore";	
                addAnnotation
                  (this, 
                   source, 
                   new String[] {
                         "settingDelegates", "org.eclipse.incquery.querybasedfeature"
                   });
        }

        /**
         * Initializes the annotations for <b>org.eclipse.incquery.querybasedfeature</b>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void createOrgAnnotations() {
                String source = "org.eclipse.incquery.querybasedfeature";	
                addAnnotation
                  (getRobot_Mission(), 
                   source, 
                   new String[] {
                         "patternFQN", "hu.bme.mdsd.ztz.model.derived.mission"
                   });
        }

} //DronePackageImpl
