/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationType;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.RobotStatus;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;

import hu.bme.mdsd.ztz.model.drone.DronePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourPackageImpl extends EPackageImpl implements BehaviourPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass behaviourContainerEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass messageEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass communicationActionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass unicastCommunicationEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass multicastCommunicationEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass broadcastCommunicationEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass messageRepositoryEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass actionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass taskExecutionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass robotCollaborationEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass detectedObjectEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass dynamicRobotEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass taskRequirementEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum communicationTypeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum robotStatusEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum taskExecutionStatusEEnum = null;

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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private BehaviourPackageImpl() {
                super(eNS_URI, BehaviourFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link BehaviourPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static BehaviourPackage init() {
                if (isInited) return (BehaviourPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI);

                // Obtain or create and register package
                BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviourPackageImpl());

                isInited = true;

                // Initialize simple dependencies
                DronePackage.eINSTANCE.eClass();

                // Create package meta-data objects
                theBehaviourPackage.createPackageContents();

                // Initialize created meta-data
                theBehaviourPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theBehaviourPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(BehaviourPackage.eNS_URI, theBehaviourPackage);
                return theBehaviourPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getBehaviourContainer() {
                return behaviourContainerEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviourContainer_DynamicRobots() {
                return (EReference)behaviourContainerEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviourContainer_TaskExecutions() {
                return (EReference)behaviourContainerEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviourContainer_TaskRequirements() {
                return (EReference)behaviourContainerEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMessage() {
                return messageEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessage_Tasks() {
                return (EReference)messageEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getMessage_Timestamp() {
                return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessage_Properties() {
                return (EReference)messageEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessage_ReferredObjects() {
                return (EReference)messageEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getCommunicationAction() {
                return communicationActionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getCommunicationAction_Message() {
                return (EReference)communicationActionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getCommunicationAction_Type() {
                return (EAttribute)communicationActionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getUnicastCommunication() {
                return unicastCommunicationEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getUnicastCommunication_Target() {
                return (EReference)unicastCommunicationEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMulticastCommunication() {
                return multicastCommunicationEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMulticastCommunication_Targets() {
                return (EReference)multicastCommunicationEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getBroadcastCommunication() {
                return broadcastCommunicationEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBroadcastCommunication_Targets() {
                return (EReference)broadcastCommunicationEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMessageRepository() {
                return messageRepositoryEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessageRepository_Robot() {
                return (EReference)messageRepositoryEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessageRepository_ReceivedMessages() {
                return (EReference)messageRepositoryEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessageRepository_SendedMessages() {
                return (EReference)messageRepositoryEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getAction() {
                return actionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAction_Properties() {
                return (EReference)actionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getAction_CurrentTask() {
                return (EReference)actionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTaskExecution() {
                return taskExecutionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskExecution_Executors() {
                return (EReference)taskExecutionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskExecution_ExecutionTime() {
                return (EReference)taskExecutionEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTaskExecution_Status() {
                return (EAttribute)taskExecutionEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskExecution_Task() {
                return (EReference)taskExecutionEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getRobotCollaboration() {
                return robotCollaborationEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotCollaboration_Collaborator() {
                return (EReference)robotCollaborationEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotCollaboration_AvailabilityRange() {
                return (EReference)robotCollaborationEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getRobotCollaboration_Properties() {
                return (EReference)robotCollaborationEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDetectedObject() {
                return detectedObjectEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDetectedObject_Object() {
                return (EReference)detectedObjectEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDetectedObject_Obstacle() {
                return (EAttribute)detectedObjectEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getDynamicRobot() {
                return dynamicRobotEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDynamicRobot_Robot() {
                return (EReference)dynamicRobotEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDynamicRobot_DetectedObjects() {
                return (EReference)dynamicRobotEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDynamicRobot_Collaborations() {
                return (EReference)dynamicRobotEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDynamicRobot_MessageRepository() {
                return (EReference)dynamicRobotEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getDynamicRobot_Status() {
                return (EAttribute)dynamicRobotEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getDynamicRobot_Actions() {
                return (EReference)dynamicRobotEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getTaskRequirement() {
                return taskRequirementEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_Task() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_Prerequisite() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getTaskRequirement_Participants() {
                return (EAttribute)taskRequirementEClass.getEStructuralFeatures().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_Properties() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(3);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_RequiredCapabilities() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(4);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_CapabilityProperties() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(5);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getTaskRequirement_Descriptor() {
                return (EReference)taskRequirementEClass.getEStructuralFeatures().get(6);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getCommunicationType() {
                return communicationTypeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getRobotStatus() {
                return robotStatusEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getTaskExecutionStatus() {
                return taskExecutionStatusEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourFactory getBehaviourFactory() {
                return (BehaviourFactory)getEFactoryInstance();
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
                behaviourContainerEClass = createEClass(BEHAVIOUR_CONTAINER);
                createEReference(behaviourContainerEClass, BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS);
                createEReference(behaviourContainerEClass, BEHAVIOUR_CONTAINER__TASK_EXECUTIONS);
                createEReference(behaviourContainerEClass, BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS);

                messageEClass = createEClass(MESSAGE);
                createEReference(messageEClass, MESSAGE__TASKS);
                createEAttribute(messageEClass, MESSAGE__TIMESTAMP);
                createEReference(messageEClass, MESSAGE__PROPERTIES);
                createEReference(messageEClass, MESSAGE__REFERRED_OBJECTS);

                communicationActionEClass = createEClass(COMMUNICATION_ACTION);
                createEReference(communicationActionEClass, COMMUNICATION_ACTION__MESSAGE);
                createEAttribute(communicationActionEClass, COMMUNICATION_ACTION__TYPE);

                unicastCommunicationEClass = createEClass(UNICAST_COMMUNICATION);
                createEReference(unicastCommunicationEClass, UNICAST_COMMUNICATION__TARGET);

                multicastCommunicationEClass = createEClass(MULTICAST_COMMUNICATION);
                createEReference(multicastCommunicationEClass, MULTICAST_COMMUNICATION__TARGETS);

                broadcastCommunicationEClass = createEClass(BROADCAST_COMMUNICATION);
                createEReference(broadcastCommunicationEClass, BROADCAST_COMMUNICATION__TARGETS);

                messageRepositoryEClass = createEClass(MESSAGE_REPOSITORY);
                createEReference(messageRepositoryEClass, MESSAGE_REPOSITORY__ROBOT);
                createEReference(messageRepositoryEClass, MESSAGE_REPOSITORY__RECEIVED_MESSAGES);
                createEReference(messageRepositoryEClass, MESSAGE_REPOSITORY__SENDED_MESSAGES);

                actionEClass = createEClass(ACTION);
                createEReference(actionEClass, ACTION__PROPERTIES);
                createEReference(actionEClass, ACTION__CURRENT_TASK);

                taskExecutionEClass = createEClass(TASK_EXECUTION);
                createEReference(taskExecutionEClass, TASK_EXECUTION__EXECUTORS);
                createEReference(taskExecutionEClass, TASK_EXECUTION__EXECUTION_TIME);
                createEAttribute(taskExecutionEClass, TASK_EXECUTION__STATUS);
                createEReference(taskExecutionEClass, TASK_EXECUTION__TASK);

                robotCollaborationEClass = createEClass(ROBOT_COLLABORATION);
                createEReference(robotCollaborationEClass, ROBOT_COLLABORATION__COLLABORATOR);
                createEReference(robotCollaborationEClass, ROBOT_COLLABORATION__AVAILABILITY_RANGE);
                createEReference(robotCollaborationEClass, ROBOT_COLLABORATION__PROPERTIES);

                detectedObjectEClass = createEClass(DETECTED_OBJECT);
                createEReference(detectedObjectEClass, DETECTED_OBJECT__OBJECT);
                createEAttribute(detectedObjectEClass, DETECTED_OBJECT__OBSTACLE);

                dynamicRobotEClass = createEClass(DYNAMIC_ROBOT);
                createEReference(dynamicRobotEClass, DYNAMIC_ROBOT__ROBOT);
                createEReference(dynamicRobotEClass, DYNAMIC_ROBOT__DETECTED_OBJECTS);
                createEReference(dynamicRobotEClass, DYNAMIC_ROBOT__COLLABORATIONS);
                createEReference(dynamicRobotEClass, DYNAMIC_ROBOT__MESSAGE_REPOSITORY);
                createEAttribute(dynamicRobotEClass, DYNAMIC_ROBOT__STATUS);
                createEReference(dynamicRobotEClass, DYNAMIC_ROBOT__ACTIONS);

                taskRequirementEClass = createEClass(TASK_REQUIREMENT);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__TASK);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__PREREQUISITE);
                createEAttribute(taskRequirementEClass, TASK_REQUIREMENT__PARTICIPANTS);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__PROPERTIES);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__REQUIRED_CAPABILITIES);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__CAPABILITY_PROPERTIES);
                createEReference(taskRequirementEClass, TASK_REQUIREMENT__DESCRIPTOR);

                // Create enums
                communicationTypeEEnum = createEEnum(COMMUNICATION_TYPE);
                robotStatusEEnum = createEEnum(ROBOT_STATUS);
                taskExecutionStatusEEnum = createEEnum(TASK_EXECUTION_STATUS);
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

                // Obtain other dependent packages
                DronePackage theDronePackage = (DronePackage)EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes
                unicastCommunicationEClass.getESuperTypes().add(this.getCommunicationAction());
                multicastCommunicationEClass.getESuperTypes().add(this.getCommunicationAction());
                broadcastCommunicationEClass.getESuperTypes().add(this.getCommunicationAction());
                messageRepositoryEClass.getESuperTypes().add(theDronePackage.getNamedElement());
                actionEClass.getESuperTypes().add(theDronePackage.getNamedElement());
                taskExecutionEClass.getESuperTypes().add(theDronePackage.getNamedElement());
                dynamicRobotEClass.getESuperTypes().add(theDronePackage.getNamedElement());
                taskRequirementEClass.getESuperTypes().add(theDronePackage.getNamedElement());

                // Initialize classes, features, and operations; add parameters
                initEClass(behaviourContainerEClass, BehaviourContainer.class, "BehaviourContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBehaviourContainer_DynamicRobots(), this.getDynamicRobot(), null, "dynamicRobots", null, 0, -1, BehaviourContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBehaviourContainer_TaskExecutions(), this.getTaskExecution(), null, "taskExecutions", null, 0, -1, BehaviourContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBehaviourContainer_TaskRequirements(), this.getTaskRequirement(), null, "taskRequirements", null, 0, -1, BehaviourContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMessage_Tasks(), this.getTaskExecution(), null, "tasks", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessage_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessage_Properties(), theDronePackage.getProperty(), null, "properties", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessage_ReferredObjects(), theDronePackage.getAreaObject(), null, "referredObjects", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(communicationActionEClass, CommunicationAction.class, "CommunicationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getCommunicationAction_Message(), this.getMessage(), null, "message", null, 1, 1, CommunicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getCommunicationAction_Type(), this.getCommunicationType(), "type", null, 1, 1, CommunicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(unicastCommunicationEClass, UnicastCommunication.class, "UnicastCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getUnicastCommunication_Target(), this.getDynamicRobot(), null, "target", null, 1, 1, UnicastCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(multicastCommunicationEClass, MulticastCommunication.class, "MulticastCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMulticastCommunication_Targets(), this.getDynamicRobot(), null, "targets", null, 1, -1, MulticastCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(broadcastCommunicationEClass, BroadcastCommunication.class, "BroadcastCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBroadcastCommunication_Targets(), this.getDynamicRobot(), null, "targets", null, 1, -1, BroadcastCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageRepositoryEClass, MessageRepository.class, "MessageRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMessageRepository_Robot(), this.getDynamicRobot(), this.getDynamicRobot_MessageRepository(), "robot", null, 1, 1, MessageRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessageRepository_ReceivedMessages(), this.getMessage(), null, "receivedMessages", null, 0, -1, MessageRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessageRepository_SendedMessages(), this.getMessage(), null, "sendedMessages", null, 0, -1, MessageRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getAction_Properties(), theDronePackage.getProperty(), null, "properties", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getAction_CurrentTask(), this.getTaskExecution(), null, "currentTask", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(taskExecutionEClass, TaskExecution.class, "TaskExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getTaskExecution_Executors(), this.getDynamicRobot(), null, "executors", null, 0, -1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskExecution_ExecutionTime(), theDronePackage.getMeasureValue(), null, "executionTime", null, 0, 1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTaskExecution_Status(), this.getTaskExecutionStatus(), "status", null, 1, 1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskExecution_Task(), theDronePackage.getTask(), null, "task", null, 1, 1, TaskExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(robotCollaborationEClass, RobotCollaboration.class, "RobotCollaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getRobotCollaboration_Collaborator(), this.getDynamicRobot(), null, "collaborator", null, 1, 1, RobotCollaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobotCollaboration_AvailabilityRange(), theDronePackage.getMeasureValue(), null, "availabilityRange", null, 0, 1, RobotCollaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getRobotCollaboration_Properties(), theDronePackage.getProperty(), null, "properties", null, 0, -1, RobotCollaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(detectedObjectEClass, DetectedObject.class, "DetectedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDetectedObject_Object(), theDronePackage.getAreaObject(), null, "object", null, 1, 1, DetectedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDetectedObject_Obstacle(), ecorePackage.getEBoolean(), "obstacle", null, 0, 1, DetectedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(dynamicRobotEClass, DynamicRobot.class, "DynamicRobot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getDynamicRobot_Robot(), theDronePackage.getRobot(), null, "robot", null, 1, 1, DynamicRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDynamicRobot_DetectedObjects(), this.getDetectedObject(), null, "detectedObjects", null, 0, -1, DynamicRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDynamicRobot_Collaborations(), this.getRobotCollaboration(), null, "collaborations", null, 0, 1, DynamicRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDynamicRobot_MessageRepository(), this.getMessageRepository(), this.getMessageRepository_Robot(), "messageRepository", null, 0, 1, DynamicRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getDynamicRobot_Status(), this.getRobotStatus(), "status", null, 1, 1, DynamicRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getDynamicRobot_Actions(), this.getAction(), null, "actions", null, 0, -1, DynamicRobot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(taskRequirementEClass, TaskRequirement.class, "TaskRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getTaskRequirement_Task(), this.getTaskExecution(), null, "task", null, 1, 1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_Prerequisite(), this.getTaskExecution(), null, "prerequisite", null, 0, 1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getTaskRequirement_Participants(), ecorePackage.getEInt(), "participants", null, 1, 1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_Properties(), theDronePackage.getProperty(), null, "properties", null, 0, -1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_RequiredCapabilities(), theDronePackage.getCapability(), null, "requiredCapabilities", null, 0, -1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_CapabilityProperties(), theDronePackage.getCapabilityProperties(), null, "capabilityProperties", null, 0, -1, TaskRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getTaskRequirement_Descriptor(), theDronePackage.getTaskDescriptor(), null, "descriptor", null, 0, 1, TaskRequirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

                // Initialize enums and add enum literals
                initEEnum(communicationTypeEEnum, CommunicationType.class, "CommunicationType");
                addEEnumLiteral(communicationTypeEEnum, CommunicationType.SYNCHRONOUS);
                addEEnumLiteral(communicationTypeEEnum, CommunicationType.ASYNCHRONOUS);

                initEEnum(robotStatusEEnum, RobotStatus.class, "RobotStatus");
                addEEnumLiteral(robotStatusEEnum, RobotStatus.READY);
                addEEnumLiteral(robotStatusEEnum, RobotStatus.TURNED_OFF);
                addEEnumLiteral(robotStatusEEnum, RobotStatus.WAITING);
                addEEnumLiteral(robotStatusEEnum, RobotStatus.EXECUTING);

                initEEnum(taskExecutionStatusEEnum, TaskExecutionStatus.class, "TaskExecutionStatus");
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.READY);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.FINISHED);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.SUSPENDED);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.IN_PROGRESS);
                addEEnumLiteral(taskExecutionStatusEEnum, TaskExecutionStatus.WAITING);

                // Create resource
                createResource(eNS_URI);

                // Create annotations
                // org.eclipse.incquery.querybasedfeature
                createOrgAnnotations();
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
                  (getTaskRequirement_Descriptor(), 
                   source, 
                   new String[] {
                         "patternFQN", "hu.bme.mdsd.ztz.model.derived.descriptor"
                   });
        }

} //BehaviourPackageImpl
