/**
 */
package hu.bme.mdsd.ztz.model.behaviour.util;

import hu.bme.mdsd.ztz.model.behaviour.*;

import hu.bme.mdsd.ztz.model.drone.Action;
import hu.bme.mdsd.ztz.model.drone.NamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage
 * @generated
 */
public class BehaviourSwitch<T> extends Switch<T> {
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static BehaviourPackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourSwitch() {
                if (modelPackage == null) {
                        modelPackage = BehaviourPackage.eINSTANCE;
                }
        }

        /**
         * Checks whether this is a switch for the given package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param ePackage the package in question.
         * @return whether this is a switch for the given package.
         * @generated
         */
        @Override
        protected boolean isSwitchFor(EPackage ePackage) {
                return ePackage == modelPackage;
        }

        /**
         * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the first non-null result returned by a <code>caseXXX</code> call.
         * @generated
         */
        @Override
        protected T doSwitch(int classifierID, EObject theEObject) {
                switch (classifierID) {
                        case BehaviourPackage.BEHAVIOUR_CONTAINER: {
                                BehaviourContainer behaviourContainer = (BehaviourContainer)theEObject;
                                T result = caseBehaviourContainer(behaviourContainer);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourPackage.MESSAGE: {
                                Message message = (Message)theEObject;
                                T result = caseMessage(message);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourPackage.COMMUNICATION_ACTION: {
                                CommunicationAction communicationAction = (CommunicationAction)theEObject;
                                T result = caseCommunicationAction(communicationAction);
                                if (result == null) result = caseAction(communicationAction);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourPackage.UNICAST_COMMUNICATION: {
                                UnicastCommunication unicastCommunication = (UnicastCommunication)theEObject;
                                T result = caseUnicastCommunication(unicastCommunication);
                                if (result == null) result = caseCommunicationAction(unicastCommunication);
                                if (result == null) result = caseAction(unicastCommunication);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourPackage.MULTICAST_COMMUNICATION: {
                                MulticastCommunication multicastCommunication = (MulticastCommunication)theEObject;
                                T result = caseMulticastCommunication(multicastCommunication);
                                if (result == null) result = caseCommunicationAction(multicastCommunication);
                                if (result == null) result = caseAction(multicastCommunication);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourPackage.BROADCAST_COMMUNICATION: {
                                BroadcastCommunication broadcastCommunication = (BroadcastCommunication)theEObject;
                                T result = caseBroadcastCommunication(broadcastCommunication);
                                if (result == null) result = caseCommunicationAction(broadcastCommunication);
                                if (result == null) result = caseAction(broadcastCommunication);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case BehaviourPackage.MESSAGE_REPOSITORY: {
                                MessageRepository messageRepository = (MessageRepository)theEObject;
                                T result = caseMessageRepository(messageRepository);
                                if (result == null) result = caseNamedElement(messageRepository);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Container</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseBehaviourContainer(BehaviourContainer object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Message</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMessage(Message object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Communication Action</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Communication Action</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCommunicationAction(CommunicationAction object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Unicast Communication</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Unicast Communication</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseUnicastCommunication(UnicastCommunication object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Multicast Communication</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Multicast Communication</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMulticastCommunication(MulticastCommunication object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Broadcast Communication</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Broadcast Communication</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseBroadcastCommunication(BroadcastCommunication object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Message Repository</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Message Repository</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMessageRepository(MessageRepository object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Action</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseAction(Action object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseNamedElement(NamedElement object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch, but this is the last case anyway.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject)
         * @generated
         */
        @Override
        public T defaultCase(EObject object) {
                return null;
        }

} //BehaviourSwitch
