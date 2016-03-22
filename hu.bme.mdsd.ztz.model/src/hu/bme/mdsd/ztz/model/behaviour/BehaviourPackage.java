/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.DronePackage;

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
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "behaviour";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.mdsd.hu/behaviour";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "behaviour";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        BehaviourPackage eINSTANCE = hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl.init();

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getBehaviourContainer()
         * @generated
         */
        int BEHAVIOUR_CONTAINER = 0;

        /**
         * The feature id for the '<em><b>Dynamic Robots</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS = 0;

        /**
         * The number of structural features of the '<em>Container</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOUR_CONTAINER_FEATURE_COUNT = 1;

        /**
         * The number of operations of the '<em>Container</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOUR_CONTAINER_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl <em>Message</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getMessage()
         * @generated
         */
        int MESSAGE = 1;

        /**
         * The feature id for the '<em><b>Tasks</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE__TASKS = 0;

        /**
         * The feature id for the '<em><b>Timestamp</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE__TIMESTAMP = 1;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE__PROPERTIES = 2;

        /**
         * The feature id for the '<em><b>Referred Objects</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE__REFERRED_OBJECTS = 3;

        /**
         * The number of structural features of the '<em>Message</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_FEATURE_COUNT = 4;

        /**
         * The number of operations of the '<em>Message</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.CommunicationActionImpl <em>Communication Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.CommunicationActionImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getCommunicationAction()
         * @generated
         */
        int COMMUNICATION_ACTION = 2;

        /**
         * The feature id for the '<em><b>Message</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION__MESSAGE = 0;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION__TYPE = 1;

        /**
         * The number of structural features of the '<em>Communication Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Communication Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.UnicastCommunicationImpl <em>Unicast Communication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.UnicastCommunicationImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getUnicastCommunication()
         * @generated
         */
        int UNICAST_COMMUNICATION = 3;

        /**
         * The feature id for the '<em><b>Message</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_COMMUNICATION__MESSAGE = COMMUNICATION_ACTION__MESSAGE;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_COMMUNICATION__TYPE = COMMUNICATION_ACTION__TYPE;

        /**
         * The feature id for the '<em><b>Target</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_COMMUNICATION__TARGET = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Unicast Communication</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_COMMUNICATION_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Unicast Communication</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_COMMUNICATION_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.MulticastCommunicationImpl <em>Multicast Communication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.MulticastCommunicationImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getMulticastCommunication()
         * @generated
         */
        int MULTICAST_COMMUNICATION = 4;

        /**
         * The feature id for the '<em><b>Message</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_COMMUNICATION__MESSAGE = COMMUNICATION_ACTION__MESSAGE;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_COMMUNICATION__TYPE = COMMUNICATION_ACTION__TYPE;

        /**
         * The feature id for the '<em><b>Targets</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_COMMUNICATION__TARGETS = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Multicast Communication</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_COMMUNICATION_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Multicast Communication</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_COMMUNICATION_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.BroadcastCommunicationImpl <em>Broadcast Communication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BroadcastCommunicationImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getBroadcastCommunication()
         * @generated
         */
        int BROADCAST_COMMUNICATION = 5;

        /**
         * The feature id for the '<em><b>Message</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_COMMUNICATION__MESSAGE = COMMUNICATION_ACTION__MESSAGE;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_COMMUNICATION__TYPE = COMMUNICATION_ACTION__TYPE;

        /**
         * The feature id for the '<em><b>Targets</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_COMMUNICATION__TARGETS = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Broadcast Communication</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_COMMUNICATION_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Broadcast Communication</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_COMMUNICATION_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageRepositoryImpl <em>Message Repository</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.MessageRepositoryImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getMessageRepository()
         * @generated
         */
        int MESSAGE_REPOSITORY = 6;

        /**
         * The feature id for the '<em><b>Name</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_REPOSITORY__NAME = DronePackage.NAMED_ELEMENT__NAME;

        /**
         * The feature id for the '<em><b>Robot</b></em>' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_REPOSITORY__ROBOT = DronePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Received Messages</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_REPOSITORY__RECEIVED_MESSAGES = DronePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

        /**
         * The feature id for the '<em><b>Sended Messages</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_REPOSITORY__SENDED_MESSAGES = DronePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

        /**
         * The number of structural features of the '<em>Message Repository</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_REPOSITORY_FEATURE_COUNT = DronePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

        /**
         * The number of operations of the '<em>Message Repository</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_REPOSITORY_OPERATION_COUNT = DronePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.ActionImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getAction()
         * @generated
         */
        int ACTION = 7;

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
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskExecutionImpl <em>Task Execution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.TaskExecutionImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getTaskExecution()
         * @generated
         */
        int TASK_EXECUTION = 8;

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
         * The feature id for the '<em><b>Task</b></em>' reference.
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
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.RobotCollaborationImpl <em>Robot Collaboration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.RobotCollaborationImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getRobotCollaboration()
         * @generated
         */
        int ROBOT_COLLABORATION = 9;

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
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_COLLABORATION__PROPERTIES = 2;

        /**
         * The number of structural features of the '<em>Robot Collaboration</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_COLLABORATION_FEATURE_COUNT = 3;

        /**
         * The number of operations of the '<em>Robot Collaboration</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int ROBOT_COLLABORATION_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.DetectedObjectImpl <em>Detected Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.DetectedObjectImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getDetectedObject()
         * @generated
         */
        int DETECTED_OBJECT = 10;

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
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl <em>Dynamic Robot</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getDynamicRobot()
         * @generated
         */
        int DYNAMIC_ROBOT = 11;

        /**
         * The feature id for the '<em><b>Robot</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT__ROBOT = 0;

        /**
         * The feature id for the '<em><b>Detected Objects</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT__DETECTED_OBJECTS = 1;

        /**
         * The feature id for the '<em><b>Collaborations</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT__COLLABORATIONS = 2;

        /**
         * The feature id for the '<em><b>Message Repository</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT__MESSAGE_REPOSITORY = 3;

        /**
         * The feature id for the '<em><b>Status</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT__STATUS = 4;

        /**
         * The feature id for the '<em><b>Actions</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT__ACTIONS = 5;

        /**
         * The number of structural features of the '<em>Dynamic Robot</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT_FEATURE_COUNT = 6;

        /**
         * The number of operations of the '<em>Dynamic Robot</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int DYNAMIC_ROBOT_OPERATION_COUNT = 0;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationType <em>Communication Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getCommunicationType()
         * @generated
         */
        int COMMUNICATION_TYPE = 12;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.RobotStatus <em>Robot Status</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotStatus
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getRobotStatus()
         * @generated
         */
        int ROBOT_STATUS = 13;

        /**
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus <em>Task Execution Status</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getTaskExecutionStatus()
         * @generated
         */
        int TASK_EXECUTION_STATUS = 14;


        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer <em>Container</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Container</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer
         * @generated
         */
        EClass getBehaviourContainer();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getDynamicRobots <em>Dynamic Robots</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Dynamic Robots</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getDynamicRobots()
         * @see #getBehaviourContainer()
         * @generated
         */
        EReference getBehaviourContainer_DynamicRobots();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.Message <em>Message</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Message</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Message
         * @generated
         */
        EClass getMessage();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.Message#getTasks <em>Tasks</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Tasks</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Message#getTasks()
         * @see #getMessage()
         * @generated
         */
        EReference getMessage_Tasks();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.behaviour.Message#getTimestamp <em>Timestamp</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Timestamp</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Message#getTimestamp()
         * @see #getMessage()
         * @generated
         */
        EAttribute getMessage_Timestamp();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.behaviour.Message#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Message#getProperties()
         * @see #getMessage()
         * @generated
         */
        EReference getMessage_Properties();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.Message#getReferredObjects <em>Referred Objects</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Referred Objects</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Message#getReferredObjects()
         * @see #getMessage()
         * @generated
         */
        EReference getMessage_ReferredObjects();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction <em>Communication Action</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Communication Action</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationAction
         * @generated
         */
        EClass getCommunicationAction();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getMessage <em>Message</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Message</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getMessage()
         * @see #getCommunicationAction()
         * @generated
         */
        EReference getCommunicationAction_Message();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getType <em>Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Type</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getType()
         * @see #getCommunicationAction()
         * @generated
         */
        EAttribute getCommunicationAction_Type();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication <em>Unicast Communication</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Unicast Communication</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication
         * @generated
         */
        EClass getUnicastCommunication();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication#getTarget <em>Target</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Target</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication#getTarget()
         * @see #getUnicastCommunication()
         * @generated
         */
        EReference getUnicastCommunication_Target();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication <em>Multicast Communication</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Multicast Communication</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication
         * @generated
         */
        EClass getMulticastCommunication();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication#getTargets <em>Targets</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Targets</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication#getTargets()
         * @see #getMulticastCommunication()
         * @generated
         */
        EReference getMulticastCommunication_Targets();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication <em>Broadcast Communication</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Broadcast Communication</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication
         * @generated
         */
        EClass getBroadcastCommunication();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication#getTargets <em>Targets</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Targets</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication#getTargets()
         * @see #getBroadcastCommunication()
         * @generated
         */
        EReference getBroadcastCommunication_Targets();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository <em>Message Repository</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Message Repository</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.MessageRepository
         * @generated
         */
        EClass getMessageRepository();

        /**
         * Returns the meta object for the container reference '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getRobot <em>Robot</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the container reference '<em>Robot</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getRobot()
         * @see #getMessageRepository()
         * @generated
         */
        EReference getMessageRepository_Robot();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getReceivedMessages <em>Received Messages</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Received Messages</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getReceivedMessages()
         * @see #getMessageRepository()
         * @generated
         */
        EReference getMessageRepository_ReceivedMessages();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getSendedMessages <em>Sended Messages</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Sended Messages</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getSendedMessages()
         * @see #getMessageRepository()
         * @generated
         */
        EReference getMessageRepository_SendedMessages();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.Action <em>Action</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Action</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Action
         * @generated
         */
        EClass getAction();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.behaviour.Action#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Action#getProperties()
         * @see #getAction()
         * @generated
         */
        EReference getAction_Properties();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.behaviour.Action#getCurrentTask <em>Current Task</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Current Task</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.Action#getCurrentTask()
         * @see #getAction()
         * @generated
         */
        EReference getAction_CurrentTask();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution <em>Task Execution</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Task Execution</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecution
         * @generated
         */
        EClass getTaskExecution();

        /**
         * Returns the meta object for the reference list '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getExecutors <em>Executors</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Executors</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getExecutors()
         * @see #getTaskExecution()
         * @generated
         */
        EReference getTaskExecution_Executors();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getExecutionTime <em>Execution Time</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Execution Time</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getExecutionTime()
         * @see #getTaskExecution()
         * @generated
         */
        EReference getTaskExecution_ExecutionTime();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getStatus <em>Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Status</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getStatus()
         * @see #getTaskExecution()
         * @generated
         */
        EAttribute getTaskExecution_Status();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Task</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getTask()
         * @see #getTaskExecution()
         * @generated
         */
        EReference getTaskExecution_Task();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration <em>Robot Collaboration</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Robot Collaboration</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
         * @generated
         */
        EClass getRobotCollaboration();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getCollaborator <em>Collaborator</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Collaborator</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getCollaborator()
         * @see #getRobotCollaboration()
         * @generated
         */
        EReference getRobotCollaboration_Collaborator();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getAvailabilityRange <em>Availability Range</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Availability Range</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getAvailabilityRange()
         * @see #getRobotCollaboration()
         * @generated
         */
        EReference getRobotCollaboration_AvailabilityRange();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Properties</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getProperties()
         * @see #getRobotCollaboration()
         * @generated
         */
        EReference getRobotCollaboration_Properties();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject <em>Detected Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Detected Object</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DetectedObject
         * @generated
         */
        EClass getDetectedObject();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject#getObject <em>Object</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Object</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DetectedObject#getObject()
         * @see #getDetectedObject()
         * @generated
         */
        EReference getDetectedObject_Object();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject#isObstacle <em>Obstacle</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Obstacle</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DetectedObject#isObstacle()
         * @see #getDetectedObject()
         * @generated
         */
        EAttribute getDetectedObject_Obstacle();

        /**
         * Returns the meta object for class '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot <em>Dynamic Robot</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Dynamic Robot</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
         * @generated
         */
        EClass getDynamicRobot();

        /**
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getRobot <em>Robot</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Robot</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getRobot()
         * @see #getDynamicRobot()
         * @generated
         */
        EReference getDynamicRobot_Robot();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getDetectedObjects <em>Detected Objects</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Detected Objects</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getDetectedObjects()
         * @see #getDynamicRobot()
         * @generated
         */
        EReference getDynamicRobot_DetectedObjects();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getCollaborations <em>Collaborations</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Collaborations</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getCollaborations()
         * @see #getDynamicRobot()
         * @generated
         */
        EReference getDynamicRobot_Collaborations();

        /**
         * Returns the meta object for the containment reference '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getMessageRepository <em>Message Repository</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Message Repository</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getMessageRepository()
         * @see #getDynamicRobot()
         * @generated
         */
        EReference getDynamicRobot_MessageRepository();

        /**
         * Returns the meta object for the attribute '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getStatus <em>Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Status</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getStatus()
         * @see #getDynamicRobot()
         * @generated
         */
        EAttribute getDynamicRobot_Status();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getActions <em>Actions</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Actions</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getActions()
         * @see #getDynamicRobot()
         * @generated
         */
        EReference getDynamicRobot_Actions();

        /**
         * Returns the meta object for enum '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationType <em>Communication Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Communication Type</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
         * @generated
         */
        EEnum getCommunicationType();

        /**
         * Returns the meta object for enum '{@link hu.bme.mdsd.ztz.model.behaviour.RobotStatus <em>Robot Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Robot Status</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotStatus
         * @generated
         */
        EEnum getRobotStatus();

        /**
         * Returns the meta object for enum '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus <em>Task Execution Status</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Task Execution Status</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus
         * @generated
         */
        EEnum getTaskExecutionStatus();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        BehaviourFactory getBehaviourFactory();

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
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl <em>Container</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getBehaviourContainer()
                 * @generated
                 */
                EClass BEHAVIOUR_CONTAINER = eINSTANCE.getBehaviourContainer();

                /**
                 * The meta object literal for the '<em><b>Dynamic Robots</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS = eINSTANCE.getBehaviourContainer_DynamicRobots();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl <em>Message</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getMessage()
                 * @generated
                 */
                EClass MESSAGE = eINSTANCE.getMessage();

                /**
                 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE__TASKS = eINSTANCE.getMessage_Tasks();

                /**
                 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute MESSAGE__TIMESTAMP = eINSTANCE.getMessage_Timestamp();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE__PROPERTIES = eINSTANCE.getMessage_Properties();

                /**
                 * The meta object literal for the '<em><b>Referred Objects</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE__REFERRED_OBJECTS = eINSTANCE.getMessage_ReferredObjects();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.CommunicationActionImpl <em>Communication Action</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.CommunicationActionImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getCommunicationAction()
                 * @generated
                 */
                EClass COMMUNICATION_ACTION = eINSTANCE.getCommunicationAction();

                /**
                 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference COMMUNICATION_ACTION__MESSAGE = eINSTANCE.getCommunicationAction_Message();

                /**
                 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute COMMUNICATION_ACTION__TYPE = eINSTANCE.getCommunicationAction_Type();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.UnicastCommunicationImpl <em>Unicast Communication</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.UnicastCommunicationImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getUnicastCommunication()
                 * @generated
                 */
                EClass UNICAST_COMMUNICATION = eINSTANCE.getUnicastCommunication();

                /**
                 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference UNICAST_COMMUNICATION__TARGET = eINSTANCE.getUnicastCommunication_Target();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.MulticastCommunicationImpl <em>Multicast Communication</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.MulticastCommunicationImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getMulticastCommunication()
                 * @generated
                 */
                EClass MULTICAST_COMMUNICATION = eINSTANCE.getMulticastCommunication();

                /**
                 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MULTICAST_COMMUNICATION__TARGETS = eINSTANCE.getMulticastCommunication_Targets();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.BroadcastCommunicationImpl <em>Broadcast Communication</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BroadcastCommunicationImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getBroadcastCommunication()
                 * @generated
                 */
                EClass BROADCAST_COMMUNICATION = eINSTANCE.getBroadcastCommunication();

                /**
                 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BROADCAST_COMMUNICATION__TARGETS = eINSTANCE.getBroadcastCommunication_Targets();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageRepositoryImpl <em>Message Repository</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.MessageRepositoryImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getMessageRepository()
                 * @generated
                 */
                EClass MESSAGE_REPOSITORY = eINSTANCE.getMessageRepository();

                /**
                 * The meta object literal for the '<em><b>Robot</b></em>' container reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE_REPOSITORY__ROBOT = eINSTANCE.getMessageRepository_Robot();

                /**
                 * The meta object literal for the '<em><b>Received Messages</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE_REPOSITORY__RECEIVED_MESSAGES = eINSTANCE.getMessageRepository_ReceivedMessages();

                /**
                 * The meta object literal for the '<em><b>Sended Messages</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE_REPOSITORY__SENDED_MESSAGES = eINSTANCE.getMessageRepository_SendedMessages();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.ActionImpl <em>Action</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.ActionImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getAction()
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
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskExecutionImpl <em>Task Execution</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.TaskExecutionImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getTaskExecution()
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
                 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference TASK_EXECUTION__TASK = eINSTANCE.getTaskExecution_Task();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.RobotCollaborationImpl <em>Robot Collaboration</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.RobotCollaborationImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getRobotCollaboration()
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
                 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference ROBOT_COLLABORATION__PROPERTIES = eINSTANCE.getRobotCollaboration_Properties();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.DetectedObjectImpl <em>Detected Object</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.DetectedObjectImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getDetectedObject()
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
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl <em>Dynamic Robot</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getDynamicRobot()
                 * @generated
                 */
                EClass DYNAMIC_ROBOT = eINSTANCE.getDynamicRobot();

                /**
                 * The meta object literal for the '<em><b>Robot</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DYNAMIC_ROBOT__ROBOT = eINSTANCE.getDynamicRobot_Robot();

                /**
                 * The meta object literal for the '<em><b>Detected Objects</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DYNAMIC_ROBOT__DETECTED_OBJECTS = eINSTANCE.getDynamicRobot_DetectedObjects();

                /**
                 * The meta object literal for the '<em><b>Collaborations</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DYNAMIC_ROBOT__COLLABORATIONS = eINSTANCE.getDynamicRobot_Collaborations();

                /**
                 * The meta object literal for the '<em><b>Message Repository</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DYNAMIC_ROBOT__MESSAGE_REPOSITORY = eINSTANCE.getDynamicRobot_MessageRepository();

                /**
                 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute DYNAMIC_ROBOT__STATUS = eINSTANCE.getDynamicRobot_Status();

                /**
                 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference DYNAMIC_ROBOT__ACTIONS = eINSTANCE.getDynamicRobot_Actions();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationType <em>Communication Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getCommunicationType()
                 * @generated
                 */
                EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.RobotStatus <em>Robot Status</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.RobotStatus
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getRobotStatus()
                 * @generated
                 */
                EEnum ROBOT_STATUS = eINSTANCE.getRobotStatus();

                /**
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus <em>Task Execution Status</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getTaskExecutionStatus()
                 * @generated
                 */
                EEnum TASK_EXECUTION_STATUS = eINSTANCE.getTaskExecutionStatus();

        }

} //BehaviourPackage