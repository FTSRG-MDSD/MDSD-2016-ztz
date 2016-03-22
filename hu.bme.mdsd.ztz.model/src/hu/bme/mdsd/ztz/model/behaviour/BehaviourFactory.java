/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage
 * @generated
 */
public interface BehaviourFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        BehaviourFactory eINSTANCE = hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Container</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Container</em>'.
         * @generated
         */
        BehaviourContainer createBehaviourContainer();

        /**
         * Returns a new object of class '<em>Message</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Message</em>'.
         * @generated
         */
        Message createMessage();

        /**
         * Returns a new object of class '<em>Unicast Communication</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Unicast Communication</em>'.
         * @generated
         */
        UnicastCommunication createUnicastCommunication();

        /**
         * Returns a new object of class '<em>Multicast Communication</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Multicast Communication</em>'.
         * @generated
         */
        MulticastCommunication createMulticastCommunication();

        /**
         * Returns a new object of class '<em>Broadcast Communication</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Broadcast Communication</em>'.
         * @generated
         */
        BroadcastCommunication createBroadcastCommunication();

        /**
         * Returns a new object of class '<em>Message Repository</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Message Repository</em>'.
         * @generated
         */
        MessageRepository createMessageRepository();

        /**
         * Returns a new object of class '<em>Action</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Action</em>'.
         * @generated
         */
        Action createAction();

        /**
         * Returns a new object of class '<em>Task Execution</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Task Execution</em>'.
         * @generated
         */
        TaskExecution createTaskExecution();

        /**
         * Returns a new object of class '<em>Robot Collaboration</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Robot Collaboration</em>'.
         * @generated
         */
        RobotCollaboration createRobotCollaboration();

        /**
         * Returns a new object of class '<em>Detected Object</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Detected Object</em>'.
         * @generated
         */
        DetectedObject createDetectedObject();

        /**
         * Returns a new object of class '<em>Dynamic Robot</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Dynamic Robot</em>'.
         * @generated
         */
        DynamicRobot createDynamicRobot();

        /**
         * Returns a new object of class '<em>Task Requirement</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Task Requirement</em>'.
         * @generated
         */
        TaskRequirement createTaskRequirement();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        BehaviourPackage getBehaviourPackage();

} //BehaviourFactory
