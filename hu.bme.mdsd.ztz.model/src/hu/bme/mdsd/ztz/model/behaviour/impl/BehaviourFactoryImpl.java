/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class BehaviourFactoryImpl extends EFactoryImpl implements BehaviourFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static BehaviourFactory init() {
                try {
                        BehaviourFactory theBehaviourFactory = (BehaviourFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourPackage.eNS_URI);
                        if (theBehaviourFactory != null) {
                                return theBehaviourFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new BehaviourFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourFactoryImpl() {
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER: return createBehaviourContainer();
                        case BehaviourPackage.MESSAGE: return createMessage();
                        case BehaviourPackage.UNICAST_COMMUNICATION: return createUnicastCommunication();
                        case BehaviourPackage.MULTICAST_COMMUNICATION: return createMulticastCommunication();
                        case BehaviourPackage.BROADCAST_COMMUNICATION: return createBroadcastCommunication();
                        case BehaviourPackage.MESSAGE_REPOSITORY: return createMessageRepository();
                        case BehaviourPackage.ACTION: return createAction();
                        case BehaviourPackage.TASK_EXECUTION: return createTaskExecution();
                        case BehaviourPackage.ROBOT_COLLABORATION: return createRobotCollaboration();
                        case BehaviourPackage.DETECTED_OBJECT: return createDetectedObject();
                        case BehaviourPackage.DYNAMIC_ROBOT: return createDynamicRobot();
                        case BehaviourPackage.TASK_REQUIREMENT: return createTaskRequirement();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object createFromString(EDataType eDataType, String initialValue) {
                switch (eDataType.getClassifierID()) {
                        case BehaviourPackage.ROBOT_STATUS:
                                return createRobotStatusFromString(eDataType, initialValue);
                        case BehaviourPackage.TASK_EXECUTION_STATUS:
                                return createTaskExecutionStatusFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String convertToString(EDataType eDataType, Object instanceValue) {
                switch (eDataType.getClassifierID()) {
                        case BehaviourPackage.ROBOT_STATUS:
                                return convertRobotStatusToString(eDataType, instanceValue);
                        case BehaviourPackage.TASK_EXECUTION_STATUS:
                                return convertTaskExecutionStatusToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourContainer createBehaviourContainer() {
                BehaviourContainerImpl behaviourContainer = new BehaviourContainerImpl();
                return behaviourContainer;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Message createMessage() {
                MessageImpl message = new MessageImpl();
                return message;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public UnicastCommunication createUnicastCommunication() {
                UnicastCommunicationImpl unicastCommunication = new UnicastCommunicationImpl();
                return unicastCommunication;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MulticastCommunication createMulticastCommunication() {
                MulticastCommunicationImpl multicastCommunication = new MulticastCommunicationImpl();
                return multicastCommunication;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BroadcastCommunication createBroadcastCommunication() {
                BroadcastCommunicationImpl broadcastCommunication = new BroadcastCommunicationImpl();
                return broadcastCommunication;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MessageRepository createMessageRepository() {
                MessageRepositoryImpl messageRepository = new MessageRepositoryImpl();
                return messageRepository;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Action createAction() {
                ActionImpl action = new ActionImpl();
                return action;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution createTaskExecution() {
                TaskExecutionImpl taskExecution = new TaskExecutionImpl();
                return taskExecution;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotCollaboration createRobotCollaboration() {
                RobotCollaborationImpl robotCollaboration = new RobotCollaborationImpl();
                return robotCollaboration;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DetectedObject createDetectedObject() {
                DetectedObjectImpl detectedObject = new DetectedObjectImpl();
                return detectedObject;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DynamicRobot createDynamicRobot() {
                DynamicRobotImpl dynamicRobot = new DynamicRobotImpl();
                return dynamicRobot;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskRequirement createTaskRequirement() {
                TaskRequirementImpl taskRequirement = new TaskRequirementImpl();
                return taskRequirement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotStatus createRobotStatusFromString(EDataType eDataType, String initialValue) {
                RobotStatus result = RobotStatus.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertRobotStatusToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecutionStatus createTaskExecutionStatusFromString(EDataType eDataType, String initialValue) {
                TaskExecutionStatus result = TaskExecutionStatus.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertTaskExecutionStatusToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourPackage getBehaviourPackage() {
                return (BehaviourPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static BehaviourPackage getPackage() {
                return BehaviourPackage.eINSTANCE;
        }

} //BehaviourFactoryImpl
