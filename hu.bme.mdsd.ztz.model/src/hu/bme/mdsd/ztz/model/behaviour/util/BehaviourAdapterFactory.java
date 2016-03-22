/**
 */
package hu.bme.mdsd.ztz.model.behaviour.util;

import hu.bme.mdsd.ztz.model.behaviour.*;

import hu.bme.mdsd.ztz.model.drone.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage
 * @generated
 */
public class BehaviourAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static BehaviourPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = BehaviourPackage.eINSTANCE;
                }
        }

        /**
         * Returns whether this factory is applicable for the type of the object.
         * <!-- begin-user-doc -->
         * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
         * <!-- end-user-doc -->
         * @return whether this factory is applicable for the type of the object.
         * @generated
         */
        @Override
        public boolean isFactoryForType(Object object) {
                if (object == modelPackage) {
                        return true;
                }
                if (object instanceof EObject) {
                        return ((EObject)object).eClass().getEPackage() == modelPackage;
                }
                return false;
        }

        /**
         * The switch that delegates to the <code>createXXX</code> methods.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BehaviourSwitch<Adapter> modelSwitch =
                new BehaviourSwitch<Adapter>() {
                        @Override
                        public Adapter caseBehaviourContainer(BehaviourContainer object) {
                                return createBehaviourContainerAdapter();
                        }
                        @Override
                        public Adapter caseMessage(Message object) {
                                return createMessageAdapter();
                        }
                        @Override
                        public Adapter caseCommunicationAction(CommunicationAction object) {
                                return createCommunicationActionAdapter();
                        }
                        @Override
                        public Adapter caseUnicastCommunication(UnicastCommunication object) {
                                return createUnicastCommunicationAdapter();
                        }
                        @Override
                        public Adapter caseMulticastCommunication(MulticastCommunication object) {
                                return createMulticastCommunicationAdapter();
                        }
                        @Override
                        public Adapter caseBroadcastCommunication(BroadcastCommunication object) {
                                return createBroadcastCommunicationAdapter();
                        }
                        @Override
                        public Adapter caseMessageRepository(MessageRepository object) {
                                return createMessageRepositoryAdapter();
                        }
                        @Override
                        public Adapter caseAction(Action object) {
                                return createActionAdapter();
                        }
                        @Override
                        public Adapter caseTaskExecution(TaskExecution object) {
                                return createTaskExecutionAdapter();
                        }
                        @Override
                        public Adapter caseRobotCollaboration(RobotCollaboration object) {
                                return createRobotCollaborationAdapter();
                        }
                        @Override
                        public Adapter caseDetectedObject(DetectedObject object) {
                                return createDetectedObjectAdapter();
                        }
                        @Override
                        public Adapter caseDynamicRobot(DynamicRobot object) {
                                return createDynamicRobotAdapter();
                        }
                        @Override
                        public Adapter caseTaskRequirement(TaskRequirement object) {
                                return createTaskRequirementAdapter();
                        }
                        @Override
                        public Adapter caseNamedElement(NamedElement object) {
                                return createNamedElementAdapter();
                        }
                        @Override
                        public Adapter defaultCase(EObject object) {
                                return createEObjectAdapter();
                        }
                };

        /**
         * Creates an adapter for the <code>target</code>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param target the object to adapt.
         * @return the adapter for the <code>target</code>.
         * @generated
         */
        @Override
        public Adapter createAdapter(Notifier target) {
                return modelSwitch.doSwitch((EObject)target);
        }


        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer <em>Container</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer
         * @generated
         */
        public Adapter createBehaviourContainerAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.Message <em>Message</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.Message
         * @generated
         */
        public Adapter createMessageAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction <em>Communication Action</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationAction
         * @generated
         */
        public Adapter createCommunicationActionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication <em>Unicast Communication</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication
         * @generated
         */
        public Adapter createUnicastCommunicationAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication <em>Multicast Communication</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication
         * @generated
         */
        public Adapter createMulticastCommunicationAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication <em>Broadcast Communication</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication
         * @generated
         */
        public Adapter createBroadcastCommunicationAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository <em>Message Repository</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.MessageRepository
         * @generated
         */
        public Adapter createMessageRepositoryAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.Action <em>Action</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.Action
         * @generated
         */
        public Adapter createActionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution <em>Task Execution</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecution
         * @generated
         */
        public Adapter createTaskExecutionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration <em>Robot Collaboration</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
         * @generated
         */
        public Adapter createRobotCollaborationAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject <em>Detected Object</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.DetectedObject
         * @generated
         */
        public Adapter createDetectedObjectAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot <em>Dynamic Robot</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
         * @generated
         */
        public Adapter createDynamicRobotAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement <em>Task Requirement</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskRequirement
         * @generated
         */
        public Adapter createTaskRequirementAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.NamedElement <em>Named Element</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.NamedElement
         * @generated
         */
        public Adapter createNamedElementAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for the default case.
         * <!-- begin-user-doc -->
         * This default implementation returns null.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @generated
         */
        public Adapter createEObjectAdapter() {
                return null;
        }

} //BehaviourAdapterFactory
