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
         * The feature id for the '<em><b>Communication Actions</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS = 0;

        /**
         * The feature id for the '<em><b>Message Repositories</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES = 1;

        /**
         * The number of structural features of the '<em>Container</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BEHAVIOUR_CONTAINER_FEATURE_COUNT = 2;

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
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION__PROPERTIES = DronePackage.ACTION__PROPERTIES;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION__CURRENT_TASK = DronePackage.ACTION__CURRENT_TASK;

        /**
         * The feature id for the '<em><b>Message</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION__MESSAGE = DronePackage.ACTION_FEATURE_COUNT + 0;

        /**
         * The feature id for the '<em><b>Type</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION__TYPE = DronePackage.ACTION_FEATURE_COUNT + 1;

        /**
         * The number of structural features of the '<em>Communication Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION_FEATURE_COUNT = DronePackage.ACTION_FEATURE_COUNT + 2;

        /**
         * The number of operations of the '<em>Communication Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION_OPERATION_COUNT = DronePackage.ACTION_OPERATION_COUNT + 0;

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
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_COMMUNICATION__PROPERTIES = COMMUNICATION_ACTION__PROPERTIES;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_COMMUNICATION__CURRENT_TASK = COMMUNICATION_ACTION__CURRENT_TASK;

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
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_COMMUNICATION__PROPERTIES = COMMUNICATION_ACTION__PROPERTIES;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_COMMUNICATION__CURRENT_TASK = COMMUNICATION_ACTION__CURRENT_TASK;

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
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_COMMUNICATION__PROPERTIES = COMMUNICATION_ACTION__PROPERTIES;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_COMMUNICATION__CURRENT_TASK = COMMUNICATION_ACTION__CURRENT_TASK;

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
         * The feature id for the '<em><b>Robot</b></em>' reference.
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
         * The meta object id for the '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationType <em>Communication Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
         * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getCommunicationType()
         * @generated
         */
        int COMMUNICATION_TYPE = 7;


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
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getCommunicationActions <em>Communication Actions</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Communication Actions</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getCommunicationActions()
         * @see #getBehaviourContainer()
         * @generated
         */
        EReference getBehaviourContainer_CommunicationActions();

        /**
         * Returns the meta object for the containment reference list '{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getMessageRepositories <em>Message Repositories</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference list '<em>Message Repositories</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getMessageRepositories()
         * @see #getBehaviourContainer()
         * @generated
         */
        EReference getBehaviourContainer_MessageRepositories();

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
         * Returns the meta object for the reference '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getRobot <em>Robot</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Robot</em>'.
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
         * Returns the meta object for enum '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationType <em>Communication Type</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Communication Type</em>'.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
         * @generated
         */
        EEnum getCommunicationType();

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
                 * The meta object literal for the '<em><b>Communication Actions</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS = eINSTANCE.getBehaviourContainer_CommunicationActions();

                /**
                 * The meta object literal for the '<em><b>Message Repositories</b></em>' containment reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES = eINSTANCE.getBehaviourContainer_MessageRepositories();

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
                 * The meta object literal for the '<em><b>Robot</b></em>' reference feature.
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
                 * The meta object literal for the '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationType <em>Communication Type</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
                 * @see hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourPackageImpl#getCommunicationType()
                 * @generated
                 */
                EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

        }

} //BehaviourPackage
