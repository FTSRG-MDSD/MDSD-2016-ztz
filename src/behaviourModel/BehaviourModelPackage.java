/**
 */
package behaviourModel;

import drone.DronePackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see behaviourModel.BehaviourModelFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourModelPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "behaviourModel";

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
        String eNS_PREFIX = "behaviourModel";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        BehaviourModelPackage eINSTANCE = behaviourModel.impl.BehaviourModelPackageImpl.init();

        /**
         * The meta object id for the '{@link behaviourModel.impl.CommunicationActionImpl <em>Communication Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behaviourModel.impl.CommunicationActionImpl
         * @see behaviourModel.impl.BehaviourModelPackageImpl#getCommunicationAction()
         * @generated
         */
        int COMMUNICATION_ACTION = 3;

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
         * The feature id for the '<em><b>Messages</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION__MESSAGES = DronePackage.ACTION_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Communication Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION_FEATURE_COUNT = DronePackage.ACTION_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Communication Action</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int COMMUNICATION_ACTION_OPERATION_COUNT = DronePackage.ACTION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link behaviourModel.impl.UnicastImpl <em>Unicast</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behaviourModel.impl.UnicastImpl
         * @see behaviourModel.impl.BehaviourModelPackageImpl#getUnicast()
         * @generated
         */
        int UNICAST = 0;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST__PROPERTIES = COMMUNICATION_ACTION__PROPERTIES;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST__CURRENT_TASK = COMMUNICATION_ACTION__CURRENT_TASK;

        /**
         * The feature id for the '<em><b>Messages</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST__MESSAGES = COMMUNICATION_ACTION__MESSAGES;

        /**
         * The feature id for the '<em><b>Robot To Notify</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST__ROBOT_TO_NOTIFY = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Unicast</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Unicast</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int UNICAST_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link behaviourModel.impl.MulticastImpl <em>Multicast</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behaviourModel.impl.MulticastImpl
         * @see behaviourModel.impl.BehaviourModelPackageImpl#getMulticast()
         * @generated
         */
        int MULTICAST = 1;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST__PROPERTIES = COMMUNICATION_ACTION__PROPERTIES;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST__CURRENT_TASK = COMMUNICATION_ACTION__CURRENT_TASK;

        /**
         * The feature id for the '<em><b>Messages</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST__MESSAGES = COMMUNICATION_ACTION__MESSAGES;

        /**
         * The feature id for the '<em><b>Robots To Notify</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST__ROBOTS_TO_NOTIFY = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Multicast</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Multicast</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MULTICAST_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link behaviourModel.impl.BroadcastImpl <em>Broadcast</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behaviourModel.impl.BroadcastImpl
         * @see behaviourModel.impl.BehaviourModelPackageImpl#getBroadcast()
         * @generated
         */
        int BROADCAST = 2;

        /**
         * The feature id for the '<em><b>Properties</b></em>' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST__PROPERTIES = COMMUNICATION_ACTION__PROPERTIES;

        /**
         * The feature id for the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST__CURRENT_TASK = COMMUNICATION_ACTION__CURRENT_TASK;

        /**
         * The feature id for the '<em><b>Messages</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST__MESSAGES = COMMUNICATION_ACTION__MESSAGES;

        /**
         * The feature id for the '<em><b>Robots To Notify</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST__ROBOTS_TO_NOTIFY = COMMUNICATION_ACTION_FEATURE_COUNT + 0;

        /**
         * The number of structural features of the '<em>Broadcast</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_FEATURE_COUNT = COMMUNICATION_ACTION_FEATURE_COUNT + 1;

        /**
         * The number of operations of the '<em>Broadcast</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int BROADCAST_OPERATION_COUNT = COMMUNICATION_ACTION_OPERATION_COUNT + 0;

        /**
         * The meta object id for the '{@link behaviourModel.impl.MessageImpl <em>Message</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see behaviourModel.impl.MessageImpl
         * @see behaviourModel.impl.BehaviourModelPackageImpl#getMessage()
         * @generated
         */
        int MESSAGE = 4;

        /**
         * The feature id for the '<em><b>Properties</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE__PROPERTIES = 0;

        /**
         * The feature id for the '<em><b>Tasks</b></em>' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE__TASKS = 1;

        /**
         * The number of structural features of the '<em>Message</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_FEATURE_COUNT = 2;

        /**
         * The number of operations of the '<em>Message</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int MESSAGE_OPERATION_COUNT = 0;


        /**
         * Returns the meta object for class '{@link behaviourModel.Unicast <em>Unicast</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Unicast</em>'.
         * @see behaviourModel.Unicast
         * @generated
         */
        EClass getUnicast();

        /**
         * Returns the meta object for the reference '{@link behaviourModel.Unicast#getRobotToNotify <em>Robot To Notify</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference '<em>Robot To Notify</em>'.
         * @see behaviourModel.Unicast#getRobotToNotify()
         * @see #getUnicast()
         * @generated
         */
        EReference getUnicast_RobotToNotify();

        /**
         * Returns the meta object for class '{@link behaviourModel.Multicast <em>Multicast</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Multicast</em>'.
         * @see behaviourModel.Multicast
         * @generated
         */
        EClass getMulticast();

        /**
         * Returns the meta object for the reference list '{@link behaviourModel.Multicast#getRobotsToNotify <em>Robots To Notify</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Robots To Notify</em>'.
         * @see behaviourModel.Multicast#getRobotsToNotify()
         * @see #getMulticast()
         * @generated
         */
        EReference getMulticast_RobotsToNotify();

        /**
         * Returns the meta object for class '{@link behaviourModel.Broadcast <em>Broadcast</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Broadcast</em>'.
         * @see behaviourModel.Broadcast
         * @generated
         */
        EClass getBroadcast();

        /**
         * Returns the meta object for the reference list '{@link behaviourModel.Broadcast#getRobotsToNotify <em>Robots To Notify</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Robots To Notify</em>'.
         * @see behaviourModel.Broadcast#getRobotsToNotify()
         * @see #getBroadcast()
         * @generated
         */
        EReference getBroadcast_RobotsToNotify();

        /**
         * Returns the meta object for class '{@link behaviourModel.CommunicationAction <em>Communication Action</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Communication Action</em>'.
         * @see behaviourModel.CommunicationAction
         * @generated
         */
        EClass getCommunicationAction();

        /**
         * Returns the meta object for the containment reference '{@link behaviourModel.CommunicationAction#getMessages <em>Messages</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the containment reference '<em>Messages</em>'.
         * @see behaviourModel.CommunicationAction#getMessages()
         * @see #getCommunicationAction()
         * @generated
         */
        EReference getCommunicationAction_Messages();

        /**
         * Returns the meta object for class '{@link behaviourModel.Message <em>Message</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Message</em>'.
         * @see behaviourModel.Message
         * @generated
         */
        EClass getMessage();

        /**
         * Returns the meta object for the reference list '{@link behaviourModel.Message#getProperties <em>Properties</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Properties</em>'.
         * @see behaviourModel.Message#getProperties()
         * @see #getMessage()
         * @generated
         */
        EReference getMessage_Properties();

        /**
         * Returns the meta object for the reference list '{@link behaviourModel.Message#getTasks <em>Tasks</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the reference list '<em>Tasks</em>'.
         * @see behaviourModel.Message#getTasks()
         * @see #getMessage()
         * @generated
         */
        EReference getMessage_Tasks();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        BehaviourModelFactory getBehaviourModelFactory();

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
                 * The meta object literal for the '{@link behaviourModel.impl.UnicastImpl <em>Unicast</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see behaviourModel.impl.UnicastImpl
                 * @see behaviourModel.impl.BehaviourModelPackageImpl#getUnicast()
                 * @generated
                 */
                EClass UNICAST = eINSTANCE.getUnicast();

                /**
                 * The meta object literal for the '<em><b>Robot To Notify</b></em>' reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference UNICAST__ROBOT_TO_NOTIFY = eINSTANCE.getUnicast_RobotToNotify();

                /**
                 * The meta object literal for the '{@link behaviourModel.impl.MulticastImpl <em>Multicast</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see behaviourModel.impl.MulticastImpl
                 * @see behaviourModel.impl.BehaviourModelPackageImpl#getMulticast()
                 * @generated
                 */
                EClass MULTICAST = eINSTANCE.getMulticast();

                /**
                 * The meta object literal for the '<em><b>Robots To Notify</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MULTICAST__ROBOTS_TO_NOTIFY = eINSTANCE.getMulticast_RobotsToNotify();

                /**
                 * The meta object literal for the '{@link behaviourModel.impl.BroadcastImpl <em>Broadcast</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see behaviourModel.impl.BroadcastImpl
                 * @see behaviourModel.impl.BehaviourModelPackageImpl#getBroadcast()
                 * @generated
                 */
                EClass BROADCAST = eINSTANCE.getBroadcast();

                /**
                 * The meta object literal for the '<em><b>Robots To Notify</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference BROADCAST__ROBOTS_TO_NOTIFY = eINSTANCE.getBroadcast_RobotsToNotify();

                /**
                 * The meta object literal for the '{@link behaviourModel.impl.CommunicationActionImpl <em>Communication Action</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see behaviourModel.impl.CommunicationActionImpl
                 * @see behaviourModel.impl.BehaviourModelPackageImpl#getCommunicationAction()
                 * @generated
                 */
                EClass COMMUNICATION_ACTION = eINSTANCE.getCommunicationAction();

                /**
                 * The meta object literal for the '<em><b>Messages</b></em>' containment reference feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference COMMUNICATION_ACTION__MESSAGES = eINSTANCE.getCommunicationAction_Messages();

                /**
                 * The meta object literal for the '{@link behaviourModel.impl.MessageImpl <em>Message</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see behaviourModel.impl.MessageImpl
                 * @see behaviourModel.impl.BehaviourModelPackageImpl#getMessage()
                 * @generated
                 */
                EClass MESSAGE = eINSTANCE.getMessage();

                /**
                 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE__PROPERTIES = eINSTANCE.getMessage_Properties();

                /**
                 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EReference MESSAGE__TASKS = eINSTANCE.getMessage_Tasks();

        }

} //BehaviourModelPackage
