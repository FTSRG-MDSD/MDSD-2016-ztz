/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationType;
import hu.bme.mdsd.ztz.model.behaviour.Message;

import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;
import hu.bme.mdsd.ztz.model.drone.DronePackage;

import hu.bme.mdsd.ztz.model.drone.impl.DronePackageImpl;
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
        private EEnum communicationTypeEEnum = null;

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

                // Obtain or create and register interdependencies
                DronePackageImpl theDronePackage = (DronePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI) instanceof DronePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI) : DronePackage.eINSTANCE);

                // Create package meta-data objects
                theBehaviourPackage.createPackageContents();
                theDronePackage.createPackageContents();

                // Initialize created meta-data
                theBehaviourPackage.initializePackageContents();
                theDronePackage.initializePackageContents();

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
        public EReference getBehaviourContainer_CommunicationActions() {
                return (EReference)behaviourContainerEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBehaviourContainer_MessageRepositories() {
                return (EReference)behaviourContainerEClass.getEStructuralFeatures().get(1);
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
        public EEnum getCommunicationType() {
                return communicationTypeEEnum;
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
                createEReference(behaviourContainerEClass, BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS);
                createEReference(behaviourContainerEClass, BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES);

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

                // Create enums
                communicationTypeEEnum = createEEnum(COMMUNICATION_TYPE);
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
                communicationActionEClass.getESuperTypes().add(theDronePackage.getAction());
                unicastCommunicationEClass.getESuperTypes().add(this.getCommunicationAction());
                multicastCommunicationEClass.getESuperTypes().add(this.getCommunicationAction());
                broadcastCommunicationEClass.getESuperTypes().add(this.getCommunicationAction());
                messageRepositoryEClass.getESuperTypes().add(theDronePackage.getNamedElement());

                // Initialize classes, features, and operations; add parameters
                initEClass(behaviourContainerEClass, BehaviourContainer.class, "BehaviourContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBehaviourContainer_CommunicationActions(), this.getCommunicationAction(), null, "communicationActions", null, 0, -1, BehaviourContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getBehaviourContainer_MessageRepositories(), this.getMessageRepository(), null, "messageRepositories", null, 0, -1, BehaviourContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMessage_Tasks(), theDronePackage.getTask(), null, "tasks", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getMessage_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessage_Properties(), theDronePackage.getProperty(), null, "properties", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessage_ReferredObjects(), theDronePackage.getAreaObject(), null, "referredObjects", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(communicationActionEClass, CommunicationAction.class, "CommunicationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getCommunicationAction_Message(), this.getMessage(), null, "message", null, 1, 1, CommunicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEAttribute(getCommunicationAction_Type(), this.getCommunicationType(), "type", null, 0, 1, CommunicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(unicastCommunicationEClass, UnicastCommunication.class, "UnicastCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getUnicastCommunication_Target(), theDronePackage.getRobot(), null, "target", null, 1, 1, UnicastCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(multicastCommunicationEClass, MulticastCommunication.class, "MulticastCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMulticastCommunication_Targets(), theDronePackage.getRobot(), null, "targets", null, 1, -1, MulticastCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(broadcastCommunicationEClass, BroadcastCommunication.class, "BroadcastCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBroadcastCommunication_Targets(), theDronePackage.getRobot(), null, "targets", null, 1, -1, BroadcastCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageRepositoryEClass, MessageRepository.class, "MessageRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMessageRepository_Robot(), theDronePackage.getRobot(), theDronePackage.getRobot_MessageRepository(), "robot", null, 1, 1, MessageRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessageRepository_ReceivedMessages(), this.getMessage(), null, "receivedMessages", null, 0, -1, MessageRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessageRepository_SendedMessages(), this.getMessage(), null, "sendedMessages", null, 0, -1, MessageRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Initialize enums and add enum literals
                initEEnum(communicationTypeEEnum, CommunicationType.class, "CommunicationType");
                addEEnumLiteral(communicationTypeEEnum, CommunicationType.SYNCHRONOUS);
                addEEnumLiteral(communicationTypeEEnum, CommunicationType.ASYNCHRONOUS);

                // Create resource
                createResource(eNS_URI);
        }

} //BehaviourPackageImpl
