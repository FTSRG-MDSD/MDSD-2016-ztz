/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.*;

import org.eclipse.emf.ecore.EClass;
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
			case DronePackage.STRING_VALUE: return createStringValue();
			case DronePackage.SIZE: return createSize();
			case DronePackage.BATTERY: return createBattery();
			case DronePackage.EQUIPMENT: return createEquipment();
			case DronePackage.MEASURE_VALUE: return createMeasureValue();
			case DronePackage.MEASURE_CONVERSION: return createMeasureConversion();
			case DronePackage.MEASURE_DIMENSION: return createMeasureDimension();
			case DronePackage.ROBOT_MISSION_CONTAINER: return createRobotMissionContainer();
			case DronePackage.PROPERTY_KEY_CONTAINER: return createPropertyKeyContainer();
			case DronePackage.PROPERTY_KEY: return createPropertyKey();
			case DronePackage.CAPABILITY: return createCapability();
			case DronePackage.CAPABILITY_PROPERTIES: return createCapabilityProperties();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
        public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
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
        public Equipment createEquipment() {
		EquipmentImpl equipment = new EquipmentImpl();
		return equipment;
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
        public RobotMissionContainer createRobotMissionContainer() {
		RobotMissionContainerImpl robotMissionContainer = new RobotMissionContainerImpl();
		return robotMissionContainer;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public PropertyKeyContainer createPropertyKeyContainer() {
		PropertyKeyContainerImpl propertyKeyContainer = new PropertyKeyContainerImpl();
		return propertyKeyContainer;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public PropertyKey createPropertyKey() {
		PropertyKeyImpl propertyKey = new PropertyKeyImpl();
		return propertyKey;
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
        public CapabilityProperties createCapabilityProperties() {
		CapabilityPropertiesImpl capabilityProperties = new CapabilityPropertiesImpl();
		return capabilityProperties;
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
