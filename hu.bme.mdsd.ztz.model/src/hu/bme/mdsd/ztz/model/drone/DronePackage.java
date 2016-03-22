/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.drone.DroneFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.eclipse.incquery.querybasedfeature'"
 * @generated
 */
public interface DronePackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "drone";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.mdsd.hu/drone";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "drone";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        DronePackage eINSTANCE = hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl.init();

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getNamedElement()
         * @generated
         */
        int NAMED_ELEMENT = 14;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NAMED_ELEMENT__NAME = 0;

        /**
         * The number of structural features of the '<em>Named Element</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NAMED_ELEMENT_FEATURE_COUNT = 1;

        /**
         * The number of operations of the '<em>Named Element</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int NAMED_ELEMENT_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MissionImpl <em>Mission</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.MissionImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMission()
         * @generated
         */
        int MISSION = 0;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MISSION__NAME = NAMED_ELEMENT__NAME;

        /**
         * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MISSION__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Estimated Time</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MISSION__ESTIMATED_TIME = NAMED_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Mission</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MISSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Mission</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MISSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl <em>Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.TaskImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTask()
         * @generated
         */
        int TASK = 1;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK__NAME = NAMED_ELEMENT__NAME;

        /**
         * The feature id for the '<em><b>Mission</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK__MISSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Descriptor</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK__DESCRIPTOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Execution</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK__EXECUTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The feature id for the '<em><b>Requirement</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK__REQUIREMENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The feature id for the '<em><b>Status</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 4;

        /**
         * The feature id for the '<em><b>Estimated Time</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK__ESTIMATED_TIME = NAMED_ELEMENT_FEATURE_COUNT + 5;

        /**
         * The number of structural features of the '<em>Task</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

        /**
         * The number of operations of the '<em>Task</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskDescriptorImpl <em>Task Descriptor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.TaskDescriptorImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskDescriptor()
         * @generated
         */
        int TASK_DESCRIPTOR = 2;

        /**
         * The feature id for the '<em><b>Targets</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_DESCRIPTOR__TARGETS = 0;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_DESCRIPTOR__PROPERTIES = 1;

        /**
         * The feature id for the '<em><b>Task</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_DESCRIPTOR__TASK = 2;

        /**
         * The number of structural features of the '<em>Task Descriptor</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_DESCRIPTOR_FEATURE_COUNT = 3;

        /**
         * The number of operations of the '<em>Task Descriptor</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_DESCRIPTOR_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.PositionImpl <em>Position</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.PositionImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getPosition()
         * @generated
         */
        int POSITION = 3;

        /**
         * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POSITION__COORDINATES = 0;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POSITION__PROPERTIES = 1;

        /**
         * The number of structural features of the '<em>Position</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POSITION_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Position</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int POSITION_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.AreaObjectImpl <em>Area Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.AreaObjectImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getAreaObject()
         * @generated
         */
        int AREA_OBJECT = 4;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_OBJECT__NAME = NAMED_ELEMENT__NAME;

        /**
         * The feature id for the '<em><b>Positions</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_OBJECT__POSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Size</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_OBJECT__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_OBJECT__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>Area Object</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The number of operations of the '<em>Area Object</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int AREA_OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.CoordinateImpl <em>Coordinate</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.CoordinateImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getCoordinate()
         * @generated
         */
        int COORDINATE = 5;

        /**
         * The feature id for the '<em><b>Latitude</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COORDINATE__LATITUDE = 0;

        /**
         * The feature id for the '<em><b>Longitude</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COORDINATE__LONGITUDE = 1;

        /**
         * The feature id for the '<em><b>Altitude</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COORDINATE__ALTITUDE = 2;

        /**
         * The number of structural features of the '<em>Coordinate</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COORDINATE_FEATURE_COUNT = 3;

        /**
         * The number of operations of the '<em>Coordinate</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COORDINATE_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.PropertyImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getProperty()
         * @generated
         */
        int PROPERTY = 6;

        /**
         * The feature id for the '<em><b>Key</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY__KEY = 0;

        /**
         * The feature id for the '<em><b>Value</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY__VALUE = 1;

        /**
         * The number of structural features of the '<em>Property</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Property</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl <em>Robot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.RobotImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getRobot()
         * @generated
         */
        int ROBOT = 7;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__NAME = NAMED_ELEMENT__NAME;

        /**
         * The feature id for the '<em><b>Position</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__POSITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Size</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Batteries</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__BATTERIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The feature id for the '<em><b>Collaborations</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__COLLABORATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The feature id for the '<em><b>Detected Objects</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__DETECTED_OBJECTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

        /**
         * The feature id for the '<em><b>Equipments</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__EQUIPMENTS = NAMED_ELEMENT_FEATURE_COUNT + 5;

        /**
         * The feature id for the '<em><b>Tasks</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 6;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 7;

        /**
         * The feature id for the '<em><b>Communication Range</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__COMMUNICATION_RANGE = NAMED_ELEMENT_FEATURE_COUNT + 8;

        /**
         * The feature id for the '<em><b>Weight</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__WEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 9;

        /**
         * The feature id for the '<em><b>Mission</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__MISSION = NAMED_ELEMENT_FEATURE_COUNT + 10;

        /**
         * The feature id for the '<em><b>Actions</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 11;

        /**
         * The feature id for the '<em><b>Capabilities</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__CAPABILITIES = NAMED_ELEMENT_FEATURE_COUNT + 12;

        /**
         * The feature id for the '<em><b>Communication Action</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__COMMUNICATION_ACTION = NAMED_ELEMENT_FEATURE_COUNT + 13;

        /**
         * The feature id for the '<em><b>Capability Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__CAPABILITY_PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 14;

        /**
         * The feature id for the '<em><b>Execute</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT__EXECUTE = NAMED_ELEMENT_FEATURE_COUNT + 15;

        /**
         * The number of structural features of the '<em>Robot</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 16;

        /**
         * The number of operations of the '<em>Robot</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.PropertyValue <em>Property Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.PropertyValue
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getPropertyValue()
         * @generated
         */
        int PROPERTY_VALUE = 22;

        /**
         * The number of structural features of the '<em>Property Value</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY_VALUE_FEATURE_COUNT = 0;

        /**
         * The number of operations of the '<em>Property Value</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int PROPERTY_VALUE_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.StringPropertyImpl <em>String Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.StringPropertyImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getStringProperty()
         * @generated
         */
        int STRING_PROPERTY = 8;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PROPERTY__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>String Property</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PROPERTY_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>String Property</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int STRING_PROPERTY_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl <em>Task Execution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskExecution()
         * @generated
         */
        int TASK_EXECUTION = 9;

        /**
         * The feature id for the '<em><b>Executors</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_EXECUTION__EXECUTORS = 0;

        /**
         * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_EXECUTION__EXECUTION_TIME = 1;

        /**
         * The feature id for the '<em><b>Status</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_EXECUTION__STATUS = 2;

        /**
         * The feature id for the '<em><b>Task</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_EXECUTION__TASK = 3;

        /**
         * The number of structural features of the '<em>Task Execution</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_EXECUTION_FEATURE_COUNT = 4;

        /**
         * The number of operations of the '<em>Task Execution</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_EXECUTION_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.RobotCollaborationImpl <em>Robot Collaboration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.RobotCollaborationImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getRobotCollaboration()
         * @generated
         */
        int ROBOT_COLLABORATION = 10;

        /**
         * The feature id for the '<em><b>Collaborator</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_COLLABORATION__COLLABORATOR = 0;

        /**
         * The feature id for the '<em><b>Availability Range</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_COLLABORATION__AVAILABILITY_RANGE = 1;

        /**
         * The number of structural features of the '<em>Robot Collaboration</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_COLLABORATION_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Robot Collaboration</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_COLLABORATION_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskRequirementImpl <em>Task Requirement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.TaskRequirementImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskRequirement()
         * @generated
         */
        int TASK_REQUIREMENT = 11;

        /**
         * The feature id for the '<em><b>Task</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT__TASK = 0;

        /**
         * The feature id for the '<em><b>Prerequisite</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT__PREREQUISITE = 1;

        /**
         * The feature id for the '<em><b>Participants</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT__PARTICIPANTS = 2;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT__PROPERTIES = 3;

        /**
         * The feature id for the '<em><b>Required Capabilities</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT__REQUIRED_CAPABILITIES = 4;

        /**
         * The feature id for the '<em><b>Capability Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT__CAPABILITY_PROPERTIES = 5;

        /**
         * The feature id for the '<em><b>Descriptor</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT__DESCRIPTOR = 6;

        /**
         * The number of structural features of the '<em>Task Requirement</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT_FEATURE_COUNT = 7;

        /**
         * The number of operations of the '<em>Task Requirement</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int TASK_REQUIREMENT_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.SizeImpl <em>Size</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.SizeImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getSize()
         * @generated
         */
        int SIZE = 12;

        /**
         * The feature id for the '<em><b>Width</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SIZE__WIDTH = 0;

        /**
         * The feature id for the '<em><b>Height</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SIZE__HEIGHT = 1;

        /**
         * The feature id for the '<em><b>Length</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SIZE__LENGTH = 2;

        /**
         * The number of structural features of the '<em>Size</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SIZE_FEATURE_COUNT = 3;

        /**
         * The number of operations of the '<em>Size</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SIZE_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl <em>Battery</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getBattery()
         * @generated
         */
        int BATTERY = 13;

        /**
         * The feature id for the '<em><b>Capacity</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BATTERY__CAPACITY = 0;

        /**
         * The feature id for the '<em><b>Voltage</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BATTERY__VOLTAGE = 1;

        /**
         * The feature id for the '<em><b>Recharge Time</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BATTERY__RECHARGE_TIME = 2;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BATTERY__PROPERTIES = 3;

        /**
         * The number of structural features of the '<em>Battery</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BATTERY_FEATURE_COUNT = 4;

        /**
         * The number of operations of the '<em>Battery</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BATTERY_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.DetectedObjectImpl <em>Detected Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.DetectedObjectImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getDetectedObject()
         * @generated
         */
        int DETECTED_OBJECT = 15;

        /**
         * The feature id for the '<em><b>Object</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DETECTED_OBJECT__OBJECT = 0;

        /**
         * The feature id for the '<em><b>Obstacle</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DETECTED_OBJECT__OBSTACLE = 1;

        /**
         * The number of structural features of the '<em>Detected Object</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DETECTED_OBJECT_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Detected Object</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DETECTED_OBJECT_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.EquipmentImpl <em>Equipment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.EquipmentImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getEquipment()
         * @generated
         */
        int EQUIPMENT = 16;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EQUIPMENT__NAME = NAMED_ELEMENT__NAME;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EQUIPMENT__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Facilitate</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EQUIPMENT__FACILITATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Equipment</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EQUIPMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Equipment</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int EQUIPMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.ActionImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getAction()
         * @generated
         */
        int ACTION = 17;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACTION__PROPERTIES = 0;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACTION__CURRENT_TASK = 1;

        /**
         * The number of structural features of the '<em>Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACTION_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ACTION_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureValueImpl <em>Measure Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.MeasureValueImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureValue()
         * @generated
         */
        int MEASURE_VALUE = 18;

        /**
         * The feature id for the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_VALUE__VALUE = 0;

        /**
         * The feature id for the '<em><b>Dimension</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_VALUE__DIMENSION = 1;

        /**
         * The number of structural features of the '<em>Measure Value</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_VALUE_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Measure Value</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_VALUE_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureConversionImpl <em>Measure Conversion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.MeasureConversionImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureConversion()
         * @generated
         */
        int MEASURE_CONVERSION = 19;

        /**
         * The feature id for the '<em><b>Rate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_CONVERSION__RATE = 0;

        /**
         * The feature id for the '<em><b>Dimension</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_CONVERSION__DIMENSION = 1;

        /**
         * The number of structural features of the '<em>Measure Conversion</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_CONVERSION_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Measure Conversion</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_CONVERSION_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureDimensionImpl <em>Measure Dimension</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.MeasureDimensionImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureDimension()
         * @generated
         */
        int MEASURE_DIMENSION = 20;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_DIMENSION__NAME = NAMED_ELEMENT__NAME;

        /**
         * The feature id for the '<em><b>Conversions</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_DIMENSION__CONVERSIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Measure Dimension</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_DIMENSION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Measure Dimension</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_DIMENSION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasurePropertyImpl <em>Measure Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.MeasurePropertyImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureProperty()
         * @generated
         */
        int MEASURE_PROPERTY = 21;

        /**
         * The feature id for the '<em><b>Value</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_PROPERTY__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Measure Property</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_PROPERTY_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Measure Property</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MEASURE_PROPERTY_OPERATION_COUNT = PROPERTY_VALUE_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl <em>Robot Mission Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getRobotMissionContainer()
         * @generated
         */
        int ROBOT_MISSION_CONTAINER = 23;

        /**
         * The feature id for the '<em><b>Missions</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_MISSION_CONTAINER__MISSIONS = 0;

        /**
         * The feature id for the '<em><b>Robots</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_MISSION_CONTAINER__ROBOTS = 1;

        /**
         * The feature id for the '<em><b>Measure Dimensions</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS = 2;

        /**
         * The feature id for the '<em><b>Area Objects</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_MISSION_CONTAINER__AREA_OBJECTS = 3;

        /**
         * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_MISSION_CONTAINER__CAPABILITIES = 4;

        /**
         * The number of structural features of the '<em>Robot Mission Container</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_MISSION_CONTAINER_FEATURE_COUNT = 5;

        /**
         * The number of operations of the '<em>Robot Mission Container</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_MISSION_CONTAINER_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.CapabilityImpl <em>Capability</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.CapabilityImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getCapability()
         * @generated
         */
        int CAPABILITY = 24;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CAPABILITY__NAME = NAMED_ELEMENT__NAME;

        /**
         * The number of structural features of the '<em>Capability</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CAPABILITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The number of operations of the '<em>Capability</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CAPABILITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.impl.CapabilityPropertiesImpl <em>Capability Properties</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.impl.CapabilityPropertiesImpl
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getCapabilityProperties()
         * @generated
         */
        int CAPABILITY_PROPERTIES = 25;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CAPABILITY_PROPERTIES__PROPERTIES = 0;

        /**
         * The feature id for the '<em><b>Capability</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CAPABILITY_PROPERTIES__CAPABILITY = 1;

        /**
         * The number of structural features of the '<em>Capability Properties</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CAPABILITY_PROPERTIES_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Capability Properties</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int CAPABILITY_PROPERTIES_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus <em>Task Execution Status</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskExecutionStatus()
         * @generated
         */
        int TASK_EXECUTION_STATUS = 26;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.drone.TaskStatus <em>Task Status</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.TaskStatus
         * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskStatus()
         * @generated
         */
        int TASK_STATUS = 27;


        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Mission <em>Mission</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Mission</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Mission
         * @generated
         */
        EClass getMission();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Mission#getTasks <em>Tasks</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Tasks</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Mission#getTasks()
         * @see #getMission()
         * @generated
         */
        EReference getMission_Tasks();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Mission#getEstimatedTime <em>Estimated Time</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Estimated Time</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Mission#getEstimatedTime()
         * @see #getMission()
         * @generated
         */
        EReference getMission_EstimatedTime();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Task <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Task</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Task
         * @generated
         */
        EClass getTask();

        /**
         * Returns the meta object for the container reference '{@link hu.bme.mdsd.ztz.model.drone.Task#getMission <em>Mission</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Mission</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Task#getMission()
         * @see #getTask()
         * @generated
         */
        EReference getTask_Mission();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Task#getDescriptor <em>Descriptor</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Descriptor</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Task#getDescriptor()
         * @see #getTask()
         * @generated
         */
        EReference getTask_Descriptor();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Task#getExecution <em>Execution</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Execution</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Task#getExecution()
         * @see #getTask()
         * @generated
         */
        EReference getTask_Execution();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Task#getRequirement <em>Requirement</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Requirement</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Task#getRequirement()
         * @see #getTask()
         * @generated
         */
        EReference getTask_Requirement();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.Task#getStatus <em>Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Status</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Task#getStatus()
         * @see #getTask()
         * @generated
         */
        EAttribute getTask_Status();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.Task#getEstimatedTime <em>Estimated Time</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Estimated Time</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Task#getEstimatedTime()
         * @see #getTask()
         * @generated
         */
        EReference getTask_EstimatedTime();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor <em>Task Descriptor</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Task Descriptor</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskDescriptor
         * @generated
         */
        EClass getTaskDescriptor();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTargets <em>Targets</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Targets</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTargets()
         * @see #getTaskDescriptor()
         * @generated
         */
        EReference getTaskDescriptor_Targets();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getProperties()
         * @see #getTaskDescriptor()
         * @generated
         */
        EReference getTaskDescriptor_Properties();

        /**
         * Returns the meta object for the container reference '{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Task</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTask()
         * @see #getTaskDescriptor()
         * @generated
         */
        EReference getTaskDescriptor_Task();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Position <em>Position</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Position</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Position
         * @generated
         */
        EClass getPosition();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Position#getCoordinates <em>Coordinates</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Coordinates</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Position#getCoordinates()
         * @see #getPosition()
         * @generated
         */
        EReference getPosition_Coordinates();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Position#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Position#getProperties()
         * @see #getPosition()
         * @generated
         */
        EReference getPosition_Properties();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.AreaObject <em>Area Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Area Object</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.AreaObject
         * @generated
         */
        EClass getAreaObject();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.AreaObject#getPositions <em>Positions</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Positions</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.AreaObject#getPositions()
         * @see #getAreaObject()
         * @generated
         */
        EReference getAreaObject_Positions();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.AreaObject#getSize <em>Size</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Size</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.AreaObject#getSize()
         * @see #getAreaObject()
         * @generated
         */
        EReference getAreaObject_Size();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.AreaObject#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.AreaObject#getProperties()
         * @see #getAreaObject()
         * @generated
         */
        EReference getAreaObject_Properties();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Coordinate <em>Coordinate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Coordinate</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Coordinate
         * @generated
         */
        EClass getCoordinate();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.Coordinate#getLatitude <em>Latitude</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Latitude</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Coordinate#getLatitude()
         * @see #getCoordinate()
         * @generated
         */
        EAttribute getCoordinate_Latitude();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.Coordinate#getLongitude <em>Longitude</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Longitude</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Coordinate#getLongitude()
         * @see #getCoordinate()
         * @generated
         */
        EAttribute getCoordinate_Longitude();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.Coordinate#getAltitude <em>Altitude</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Altitude</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Coordinate#getAltitude()
         * @see #getCoordinate()
         * @generated
         */
        EAttribute getCoordinate_Altitude();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Property <em>Property</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Property</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Property
         * @generated
         */
        EClass getProperty();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.Property#getKey <em>Key</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Key</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Property#getKey()
         * @see #getProperty()
         * @generated
         */
        EAttribute getProperty_Key();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Property#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Value</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Property#getValue()
         * @see #getProperty()
         * @generated
         */
        EReference getProperty_Value();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Robot <em>Robot</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Robot</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot
         * @generated
         */
        EClass getRobot();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Robot#getPosition <em>Position</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Position</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getPosition()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Position();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Robot#getSize <em>Size</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Size</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getSize()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Size();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getBatteries <em>Batteries</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Batteries</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getBatteries()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Batteries();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getCollaborations <em>Collaborations</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Collaborations</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getCollaborations()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Collaborations();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getDetectedObjects <em>Detected Objects</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Detected Objects</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getDetectedObjects()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_DetectedObjects();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getEquipments <em>Equipments</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Equipments</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getEquipments()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Equipments();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getTasks <em>Tasks</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Tasks</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getTasks()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Tasks();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getProperties()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Properties();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Robot#getCommunicationRange <em>Communication Range</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Communication Range</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getCommunicationRange()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_CommunicationRange();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Robot#getWeight <em>Weight</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Weight</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getWeight()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Weight();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.Robot#getMission <em>Mission</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Mission</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getMission()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Mission();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getActions <em>Actions</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Actions</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getActions()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Actions();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getCapabilities <em>Capabilities</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Capabilities</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getCapabilities()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Capabilities();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getCommunicationAction <em>Communication Action</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Communication Action</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getCommunicationAction()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_CommunicationAction();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Robot#getCapabilityProperties <em>Capability Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Capability Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getCapabilityProperties()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_CapabilityProperties();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.Robot#getExecute <em>Execute</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Execute</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getExecute()
         * @see #getRobot()
         * @generated
         */
        EReference getRobot_Execute();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.StringProperty <em>String Property</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>String Property</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.StringProperty
         * @generated
         */
        EClass getStringProperty();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.StringProperty#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.StringProperty#getValue()
         * @see #getStringProperty()
         * @generated
         */
        EAttribute getStringProperty_Value();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.TaskExecution <em>Task Execution</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Task Execution</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecution
         * @generated
         */
        EClass getTaskExecution();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.drone.TaskExecution#getExecutors <em>Executors</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Executors</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecution#getExecutors()
         * @see #getTaskExecution()
         * @generated
         */
        EReference getTaskExecution_Executors();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.TaskExecution#getExecutionTime <em>Execution Time</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Execution Time</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecution#getExecutionTime()
         * @see #getTaskExecution()
         * @generated
         */
        EReference getTaskExecution_ExecutionTime();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.TaskExecution#getStatus <em>Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Status</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecution#getStatus()
         * @see #getTaskExecution()
         * @generated
         */
        EAttribute getTaskExecution_Status();

        /**
         * Returns the meta object for the container reference '{@link hu.bme.mdsd.ztz.model.drone.TaskExecution#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Task</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecution#getTask()
         * @see #getTaskExecution()
         * @generated
         */
        EReference getTaskExecution_Task();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.RobotCollaboration <em>Robot Collaboration</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Robot Collaboration</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotCollaboration
         * @generated
         */
        EClass getRobotCollaboration();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.RobotCollaboration#getCollaborator <em>Collaborator</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Collaborator</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotCollaboration#getCollaborator()
         * @see #getRobotCollaboration()
         * @generated
         */
        EReference getRobotCollaboration_Collaborator();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.RobotCollaboration#getAvailabilityRange <em>Availability Range</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Availability Range</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotCollaboration#getAvailabilityRange()
         * @see #getRobotCollaboration()
         * @generated
         */
        EReference getRobotCollaboration_AvailabilityRange();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement <em>Task Requirement</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Task Requirement</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement
         * @generated
         */
        EClass getTaskRequirement();

        /**
         * Returns the meta object for the container reference '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Task</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getTask()
         * @see #getTaskRequirement()
         * @generated
         */
        EReference getTaskRequirement_Task();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getPrerequisite <em>Prerequisite</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Prerequisite</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getPrerequisite()
         * @see #getTaskRequirement()
         * @generated
         */
        EReference getTaskRequirement_Prerequisite();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getParticipants <em>Participants</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Participants</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getParticipants()
         * @see #getTaskRequirement()
         * @generated
         */
        EAttribute getTaskRequirement_Participants();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getProperties()
         * @see #getTaskRequirement()
         * @generated
         */
        EReference getTaskRequirement_Properties();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getRequiredCapabilities <em>Required Capabilities</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Required Capabilities</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getRequiredCapabilities()
         * @see #getTaskRequirement()
         * @generated
         */
        EReference getTaskRequirement_RequiredCapabilities();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getCapabilityProperties <em>Capability Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Capability Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getCapabilityProperties()
         * @see #getTaskRequirement()
         * @generated
         */
        EReference getTaskRequirement_CapabilityProperties();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getDescriptor <em>Descriptor</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Descriptor</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getDescriptor()
         * @see #getTaskRequirement()
         * @generated
         */
        EReference getTaskRequirement_Descriptor();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Size <em>Size</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Size</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Size
         * @generated
         */
        EClass getSize();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Size#getWidth <em>Width</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Width</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Size#getWidth()
         * @see #getSize()
         * @generated
         */
        EReference getSize_Width();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Size#getHeight <em>Height</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Height</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Size#getHeight()
         * @see #getSize()
         * @generated
         */
        EReference getSize_Height();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Size#getLength <em>Length</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Length</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Size#getLength()
         * @see #getSize()
         * @generated
         */
        EReference getSize_Length();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Battery <em>Battery</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Battery</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Battery
         * @generated
         */
        EClass getBattery();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Battery#getCapacity <em>Capacity</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Capacity</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Battery#getCapacity()
         * @see #getBattery()
         * @generated
         */
        EReference getBattery_Capacity();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Battery#getVoltage <em>Voltage</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Voltage</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Battery#getVoltage()
         * @see #getBattery()
         * @generated
         */
        EReference getBattery_Voltage();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.Battery#getRechargeTime <em>Recharge Time</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Recharge Time</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Battery#getRechargeTime()
         * @see #getBattery()
         * @generated
         */
        EReference getBattery_RechargeTime();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Battery#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Battery#getProperties()
         * @see #getBattery()
         * @generated
         */
        EReference getBattery_Properties();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.NamedElement <em>Named Element</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Named Element</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.NamedElement
         * @generated
         */
        EClass getNamedElement();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.NamedElement#getName <em>Name</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Name</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.NamedElement#getName()
         * @see #getNamedElement()
         * @generated
         */
        EAttribute getNamedElement_Name();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.DetectedObject <em>Detected Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Detected Object</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.DetectedObject
         * @generated
         */
        EClass getDetectedObject();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.DetectedObject#getObject <em>Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Object</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.DetectedObject#getObject()
         * @see #getDetectedObject()
         * @generated
         */
        EReference getDetectedObject_Object();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.DetectedObject#isObstacle <em>Obstacle</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Obstacle</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.DetectedObject#isObstacle()
         * @see #getDetectedObject()
         * @generated
         */
        EAttribute getDetectedObject_Obstacle();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Equipment <em>Equipment</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Equipment</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Equipment
         * @generated
         */
        EClass getEquipment();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Equipment#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Equipment#getProperties()
         * @see #getEquipment()
         * @generated
         */
        EReference getEquipment_Properties();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.drone.Equipment#getFacilitate <em>Facilitate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Facilitate</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Equipment#getFacilitate()
         * @see #getEquipment()
         * @generated
         */
        EReference getEquipment_Facilitate();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Action <em>Action</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Action</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Action
         * @generated
         */
        EClass getAction();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.Action#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Action#getProperties()
         * @see #getAction()
         * @generated
         */
        EReference getAction_Properties();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.Action#getCurrentTask <em>Current Task</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Current Task</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Action#getCurrentTask()
         * @see #getAction()
         * @generated
         */
        EReference getAction_CurrentTask();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.MeasureValue <em>Measure Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Measure Value</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureValue
         * @generated
         */
        EClass getMeasureValue();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.MeasureValue#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Value</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureValue#getValue()
         * @see #getMeasureValue()
         * @generated
         */
        EAttribute getMeasureValue_Value();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.MeasureValue#getDimension <em>Dimension</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Dimension</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureValue#getDimension()
         * @see #getMeasureValue()
         * @generated
         */
        EReference getMeasureValue_Dimension();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion <em>Measure Conversion</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Measure Conversion</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureConversion
         * @generated
         */
        EClass getMeasureConversion();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion#getRate <em>Rate</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Rate</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureConversion#getRate()
         * @see #getMeasureConversion()
         * @generated
         */
        EAttribute getMeasureConversion_Rate();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion#getDimension <em>Dimension</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Dimension</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureConversion#getDimension()
         * @see #getMeasureConversion()
         * @generated
         */
        EReference getMeasureConversion_Dimension();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.MeasureDimension <em>Measure Dimension</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Measure Dimension</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureDimension
         * @generated
         */
        EClass getMeasureDimension();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.MeasureDimension#getConversions <em>Conversions</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Conversions</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureDimension#getConversions()
         * @see #getMeasureDimension()
         * @generated
         */
        EReference getMeasureDimension_Conversions();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.MeasureProperty <em>Measure Property</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Measure Property</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureProperty
         * @generated
         */
        EClass getMeasureProperty();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.drone.MeasureProperty#getValue <em>Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Value</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureProperty#getValue()
         * @see #getMeasureProperty()
         * @generated
         */
        EReference getMeasureProperty_Value();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.PropertyValue <em>Property Value</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Property Value</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.PropertyValue
         * @generated
         */
        EClass getPropertyValue();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer <em>Robot Mission Container</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Robot Mission Container</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotMissionContainer
         * @generated
         */
        EClass getRobotMissionContainer();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getMissions <em>Missions</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Missions</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getMissions()
         * @see #getRobotMissionContainer()
         * @generated
         */
        EReference getRobotMissionContainer_Missions();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getRobots <em>Robots</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Robots</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getRobots()
         * @see #getRobotMissionContainer()
         * @generated
         */
        EReference getRobotMissionContainer_Robots();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getMeasureDimensions <em>Measure Dimensions</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Measure Dimensions</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getMeasureDimensions()
         * @see #getRobotMissionContainer()
         * @generated
         */
        EReference getRobotMissionContainer_MeasureDimensions();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getAreaObjects <em>Area Objects</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Area Objects</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getAreaObjects()
         * @see #getRobotMissionContainer()
         * @generated
         */
        EReference getRobotMissionContainer_AreaObjects();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getCapabilities <em>Capabilities</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Capabilities</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getCapabilities()
         * @see #getRobotMissionContainer()
         * @generated
         */
        EReference getRobotMissionContainer_Capabilities();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.Capability <em>Capability</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Capability</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.Capability
         * @generated
         */
        EClass getCapability();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties <em>Capability Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Capability Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.CapabilityProperties
         * @generated
         */
        EClass getCapabilityProperties();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.CapabilityProperties#getProperties()
         * @see #getCapabilityProperties()
         * @generated
         */
        EReference getCapabilityProperties_Properties();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties#getCapability <em>Capability</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Capability</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.CapabilityProperties#getCapability()
         * @see #getCapabilityProperties()
         * @generated
         */
        EReference getCapabilityProperties_Capability();

        /**
         * Returns the meta object for enum '{@link hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus <em>Task Execution Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Task Execution Status</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus
         * @generated
         */
        EEnum getTaskExecutionStatus();

        /**
         * Returns the meta object for enum '{@link hu.bme.mdsd.ztz.model.drone.TaskStatus <em>Task Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Task Status</em>'.
         * @see hu.bme.mdsd.ztz.model.drone.TaskStatus
         * @generated
         */
        EEnum getTaskStatus();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        DroneFactory getDroneFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each operation of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals {
                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MissionImpl <em>Mission</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.MissionImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMission()
                 * @generated
                 */
                EClass MISSION = eINSTANCE.getMission();

                /**
                 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MISSION__TASKS = eINSTANCE.getMission_Tasks();

                /**
                 * The meta object literal for the '<em><b>Estimated Time</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MISSION__ESTIMATED_TIME = eINSTANCE.getMission_EstimatedTime();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl <em>Task</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.TaskImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTask()
                 * @generated
                 */
                EClass TASK = eINSTANCE.getTask();

                /**
                 * The meta object literal for the '<em><b>Mission</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK__MISSION = eINSTANCE.getTask_Mission();

                /**
                 * The meta object literal for the '<em><b>Descriptor</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK__DESCRIPTOR = eINSTANCE.getTask_Descriptor();

                /**
                 * The meta object literal for the '<em><b>Execution</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK__EXECUTION = eINSTANCE.getTask_Execution();

                /**
                 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK__REQUIREMENT = eINSTANCE.getTask_Requirement();

                /**
                 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

                /**
                 * The meta object literal for the '<em><b>Estimated Time</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK__ESTIMATED_TIME = eINSTANCE.getTask_EstimatedTime();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskDescriptorImpl <em>Task Descriptor</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.TaskDescriptorImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskDescriptor()
                 * @generated
                 */
                EClass TASK_DESCRIPTOR = eINSTANCE.getTaskDescriptor();

                /**
                 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_DESCRIPTOR__TARGETS = eINSTANCE.getTaskDescriptor_Targets();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_DESCRIPTOR__PROPERTIES = eINSTANCE.getTaskDescriptor_Properties();

                /**
                 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_DESCRIPTOR__TASK = eINSTANCE.getTaskDescriptor_Task();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.PositionImpl <em>Position</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.PositionImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getPosition()
                 * @generated
                 */
                EClass POSITION = eINSTANCE.getPosition();

                /**
                 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference POSITION__COORDINATES = eINSTANCE.getPosition_Coordinates();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference POSITION__PROPERTIES = eINSTANCE.getPosition_Properties();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.AreaObjectImpl <em>Area Object</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.AreaObjectImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getAreaObject()
                 * @generated
                 */
                EClass AREA_OBJECT = eINSTANCE.getAreaObject();

                /**
                 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AREA_OBJECT__POSITIONS = eINSTANCE.getAreaObject_Positions();

                /**
                 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AREA_OBJECT__SIZE = eINSTANCE.getAreaObject_Size();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference AREA_OBJECT__PROPERTIES = eINSTANCE.getAreaObject_Properties();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.CoordinateImpl <em>Coordinate</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.CoordinateImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getCoordinate()
                 * @generated
                 */
                EClass COORDINATE = eINSTANCE.getCoordinate();

                /**
                 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute COORDINATE__LATITUDE = eINSTANCE.getCoordinate_Latitude();

                /**
                 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute COORDINATE__LONGITUDE = eINSTANCE.getCoordinate_Longitude();

                /**
                 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute COORDINATE__ALTITUDE = eINSTANCE.getCoordinate_Altitude();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.PropertyImpl <em>Property</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.PropertyImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getProperty()
                 * @generated
                 */
                EClass PROPERTY = eINSTANCE.getProperty();

                /**
                 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl <em>Robot</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.RobotImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getRobot()
                 * @generated
                 */
                EClass ROBOT = eINSTANCE.getRobot();

                /**
                 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__POSITION = eINSTANCE.getRobot_Position();

                /**
                 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__SIZE = eINSTANCE.getRobot_Size();

                /**
                 * The meta object literal for the '<em><b>Batteries</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__BATTERIES = eINSTANCE.getRobot_Batteries();

                /**
                 * The meta object literal for the '<em><b>Collaborations</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__COLLABORATIONS = eINSTANCE.getRobot_Collaborations();

                /**
                 * The meta object literal for the '<em><b>Detected Objects</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__DETECTED_OBJECTS = eINSTANCE.getRobot_DetectedObjects();

                /**
                 * The meta object literal for the '<em><b>Equipments</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__EQUIPMENTS = eINSTANCE.getRobot_Equipments();

                /**
                 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__TASKS = eINSTANCE.getRobot_Tasks();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__PROPERTIES = eINSTANCE.getRobot_Properties();

                /**
                 * The meta object literal for the '<em><b>Communication Range</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__COMMUNICATION_RANGE = eINSTANCE.getRobot_CommunicationRange();

                /**
                 * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__WEIGHT = eINSTANCE.getRobot_Weight();

                /**
                 * The meta object literal for the '<em><b>Mission</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__MISSION = eINSTANCE.getRobot_Mission();

                /**
                 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__ACTIONS = eINSTANCE.getRobot_Actions();

                /**
                 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__CAPABILITIES = eINSTANCE.getRobot_Capabilities();

                /**
                 * The meta object literal for the '<em><b>Communication Action</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__COMMUNICATION_ACTION = eINSTANCE.getRobot_CommunicationAction();

                /**
                 * The meta object literal for the '<em><b>Capability Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__CAPABILITY_PROPERTIES = eINSTANCE.getRobot_CapabilityProperties();

                /**
                 * The meta object literal for the '<em><b>Execute</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT__EXECUTE = eINSTANCE.getRobot_Execute();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.StringPropertyImpl <em>String Property</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.StringPropertyImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getStringProperty()
                 * @generated
                 */
                EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute STRING_PROPERTY__VALUE = eINSTANCE.getStringProperty_Value();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl <em>Task Execution</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskExecution()
                 * @generated
                 */
                EClass TASK_EXECUTION = eINSTANCE.getTaskExecution();

                /**
                 * The meta object literal for the '<em><b>Executors</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_EXECUTION__EXECUTORS = eINSTANCE.getTaskExecution_Executors();

                /**
                 * The meta object literal for the '<em><b>Execution Time</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_EXECUTION__EXECUTION_TIME = eINSTANCE.getTaskExecution_ExecutionTime();

                /**
                 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TASK_EXECUTION__STATUS = eINSTANCE.getTaskExecution_Status();

                /**
                 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_EXECUTION__TASK = eINSTANCE.getTaskExecution_Task();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.RobotCollaborationImpl <em>Robot Collaboration</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.RobotCollaborationImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getRobotCollaboration()
                 * @generated
                 */
                EClass ROBOT_COLLABORATION = eINSTANCE.getRobotCollaboration();

                /**
                 * The meta object literal for the '<em><b>Collaborator</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_COLLABORATION__COLLABORATOR = eINSTANCE.getRobotCollaboration_Collaborator();

                /**
                 * The meta object literal for the '<em><b>Availability Range</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_COLLABORATION__AVAILABILITY_RANGE = eINSTANCE.getRobotCollaboration_AvailabilityRange();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.TaskRequirementImpl <em>Task Requirement</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.TaskRequirementImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskRequirement()
                 * @generated
                 */
                EClass TASK_REQUIREMENT = eINSTANCE.getTaskRequirement();

                /**
                 * The meta object literal for the '<em><b>Task</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_REQUIREMENT__TASK = eINSTANCE.getTaskRequirement_Task();

                /**
                 * The meta object literal for the '<em><b>Prerequisite</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_REQUIREMENT__PREREQUISITE = eINSTANCE.getTaskRequirement_Prerequisite();

                /**
                 * The meta object literal for the '<em><b>Participants</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute TASK_REQUIREMENT__PARTICIPANTS = eINSTANCE.getTaskRequirement_Participants();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_REQUIREMENT__PROPERTIES = eINSTANCE.getTaskRequirement_Properties();

                /**
                 * The meta object literal for the '<em><b>Required Capabilities</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_REQUIREMENT__REQUIRED_CAPABILITIES = eINSTANCE.getTaskRequirement_RequiredCapabilities();

                /**
                 * The meta object literal for the '<em><b>Capability Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_REQUIREMENT__CAPABILITY_PROPERTIES = eINSTANCE.getTaskRequirement_CapabilityProperties();

                /**
                 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_REQUIREMENT__DESCRIPTOR = eINSTANCE.getTaskRequirement_Descriptor();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.SizeImpl <em>Size</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.SizeImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getSize()
                 * @generated
                 */
                EClass SIZE = eINSTANCE.getSize();

                /**
                 * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SIZE__WIDTH = eINSTANCE.getSize_Width();

                /**
                 * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SIZE__HEIGHT = eINSTANCE.getSize_Height();

                /**
                 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference SIZE__LENGTH = eINSTANCE.getSize_Length();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl <em>Battery</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getBattery()
                 * @generated
                 */
                EClass BATTERY = eINSTANCE.getBattery();

                /**
                 * The meta object literal for the '<em><b>Capacity</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BATTERY__CAPACITY = eINSTANCE.getBattery_Capacity();

                /**
                 * The meta object literal for the '<em><b>Voltage</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BATTERY__VOLTAGE = eINSTANCE.getBattery_Voltage();

                /**
                 * The meta object literal for the '<em><b>Recharge Time</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BATTERY__RECHARGE_TIME = eINSTANCE.getBattery_RechargeTime();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BATTERY__PROPERTIES = eINSTANCE.getBattery_Properties();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl <em>Named Element</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getNamedElement()
                 * @generated
                 */
                EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

                /**
                 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.DetectedObjectImpl <em>Detected Object</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DetectedObjectImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getDetectedObject()
                 * @generated
                 */
                EClass DETECTED_OBJECT = eINSTANCE.getDetectedObject();

                /**
                 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DETECTED_OBJECT__OBJECT = eINSTANCE.getDetectedObject_Object();

                /**
                 * The meta object literal for the '<em><b>Obstacle</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DETECTED_OBJECT__OBSTACLE = eINSTANCE.getDetectedObject_Obstacle();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.EquipmentImpl <em>Equipment</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.EquipmentImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getEquipment()
                 * @generated
                 */
                EClass EQUIPMENT = eINSTANCE.getEquipment();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference EQUIPMENT__PROPERTIES = eINSTANCE.getEquipment_Properties();

                /**
                 * The meta object literal for the '<em><b>Facilitate</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference EQUIPMENT__FACILITATE = eINSTANCE.getEquipment_Facilitate();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.ActionImpl <em>Action</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.ActionImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getAction()
                 * @generated
                 */
                EClass ACTION = eINSTANCE.getAction();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ACTION__PROPERTIES = eINSTANCE.getAction_Properties();

                /**
                 * The meta object literal for the '<em><b>Current Task</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ACTION__CURRENT_TASK = eINSTANCE.getAction_CurrentTask();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureValueImpl <em>Measure Value</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.MeasureValueImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureValue()
                 * @generated
                 */
                EClass MEASURE_VALUE = eINSTANCE.getMeasureValue();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MEASURE_VALUE__VALUE = eINSTANCE.getMeasureValue_Value();

                /**
                 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MEASURE_VALUE__DIMENSION = eINSTANCE.getMeasureValue_Dimension();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureConversionImpl <em>Measure Conversion</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.MeasureConversionImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureConversion()
                 * @generated
                 */
                EClass MEASURE_CONVERSION = eINSTANCE.getMeasureConversion();

                /**
                 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MEASURE_CONVERSION__RATE = eINSTANCE.getMeasureConversion_Rate();

                /**
                 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MEASURE_CONVERSION__DIMENSION = eINSTANCE.getMeasureConversion_Dimension();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureDimensionImpl <em>Measure Dimension</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.MeasureDimensionImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureDimension()
                 * @generated
                 */
                EClass MEASURE_DIMENSION = eINSTANCE.getMeasureDimension();

                /**
                 * The meta object literal for the '<em><b>Conversions</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MEASURE_DIMENSION__CONVERSIONS = eINSTANCE.getMeasureDimension_Conversions();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.MeasurePropertyImpl <em>Measure Property</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.MeasurePropertyImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getMeasureProperty()
                 * @generated
                 */
                EClass MEASURE_PROPERTY = eINSTANCE.getMeasureProperty();

                /**
                 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MEASURE_PROPERTY__VALUE = eINSTANCE.getMeasureProperty_Value();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.PropertyValue <em>Property Value</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.PropertyValue
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getPropertyValue()
                 * @generated
                 */
                EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl <em>Robot Mission Container</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getRobotMissionContainer()
                 * @generated
                 */
                EClass ROBOT_MISSION_CONTAINER = eINSTANCE.getRobotMissionContainer();

                /**
                 * The meta object literal for the '<em><b>Missions</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_MISSION_CONTAINER__MISSIONS = eINSTANCE.getRobotMissionContainer_Missions();

                /**
                 * The meta object literal for the '<em><b>Robots</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_MISSION_CONTAINER__ROBOTS = eINSTANCE.getRobotMissionContainer_Robots();

                /**
                 * The meta object literal for the '<em><b>Measure Dimensions</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS = eINSTANCE.getRobotMissionContainer_MeasureDimensions();

                /**
                 * The meta object literal for the '<em><b>Area Objects</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_MISSION_CONTAINER__AREA_OBJECTS = eINSTANCE.getRobotMissionContainer_AreaObjects();

                /**
                 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_MISSION_CONTAINER__CAPABILITIES = eINSTANCE.getRobotMissionContainer_Capabilities();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.CapabilityImpl <em>Capability</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.CapabilityImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getCapability()
                 * @generated
                 */
                EClass CAPABILITY = eINSTANCE.getCapability();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.impl.CapabilityPropertiesImpl <em>Capability Properties</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.impl.CapabilityPropertiesImpl
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getCapabilityProperties()
                 * @generated
                 */
                EClass CAPABILITY_PROPERTIES = eINSTANCE.getCapabilityProperties();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference CAPABILITY_PROPERTIES__PROPERTIES = eINSTANCE.getCapabilityProperties_Properties();

                /**
                 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference CAPABILITY_PROPERTIES__CAPABILITY = eINSTANCE.getCapabilityProperties_Capability();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus <em>Task Execution Status</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskExecutionStatus()
                 * @generated
                 */
                EEnum TASK_EXECUTION_STATUS = eINSTANCE.getTaskExecutionStatus();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.drone.TaskStatus <em>Task Status</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.drone.TaskStatus
                 * @see hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl#getTaskStatus()
                 * @generated
                 */
                EEnum TASK_STATUS = eINSTANCE.getTaskStatus();

        }

} //DronePackage
