/**
 */
package behaviourModel.impl;

import behaviourModel.BehaviourModelFactory;
import behaviourModel.BehaviourModelPackage;
import behaviourModel.Broadcast;
import behaviourModel.CommunicationAction;
import behaviourModel.Message;
import behaviourModel.Multicast;
import behaviourModel.Unicast;

import drone.DronePackage;

import drone.impl.DronePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourModelPackageImpl extends EPackageImpl implements BehaviourModelPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass unicastEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass multicastEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass broadcastEClass = null;

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
        private EClass messageEClass = null;

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
         * @see behaviourModel.BehaviourModelPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private BehaviourModelPackageImpl() {
                super(eNS_URI, BehaviourModelFactory.eINSTANCE);
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
         * <p>This method is used to initialize {@link BehaviourModelPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static BehaviourModelPackage init() {
                if (isInited) return (BehaviourModelPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourModelPackage.eNS_URI);

                // Obtain or create and register package
                BehaviourModelPackageImpl theBehaviourModelPackage = (BehaviourModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviourModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviourModelPackageImpl());

                isInited = true;

                // Obtain or create and register interdependencies
                DronePackageImpl theDronePackage = (DronePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI) instanceof DronePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI) : DronePackage.eINSTANCE);

                // Create package meta-data objects
                theBehaviourModelPackage.createPackageContents();
                theDronePackage.createPackageContents();

                // Initialize created meta-data
                theBehaviourModelPackage.initializePackageContents();
                theDronePackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theBehaviourModelPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(BehaviourModelPackage.eNS_URI, theBehaviourModelPackage);
                return theBehaviourModelPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getUnicast() {
                return unicastEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getUnicast_RobotToNotify() {
                return (EReference)unicastEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getMulticast() {
                return multicastEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMulticast_RobotsToNotify() {
                return (EReference)multicastEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getBroadcast() {
                return broadcastEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getBroadcast_RobotsToNotify() {
                return (EReference)broadcastEClass.getEStructuralFeatures().get(0);
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
        public EReference getCommunicationAction_Messages() {
                return (EReference)communicationActionEClass.getEStructuralFeatures().get(0);
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
        public EReference getMessage_Properties() {
                return (EReference)messageEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EReference getMessage_Tasks() {
                return (EReference)messageEClass.getEStructuralFeatures().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourModelFactory getBehaviourModelFactory() {
                return (BehaviourModelFactory)getEFactoryInstance();
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
                unicastEClass = createEClass(UNICAST);
                createEReference(unicastEClass, UNICAST__ROBOT_TO_NOTIFY);

                multicastEClass = createEClass(MULTICAST);
                createEReference(multicastEClass, MULTICAST__ROBOTS_TO_NOTIFY);

                broadcastEClass = createEClass(BROADCAST);
                createEReference(broadcastEClass, BROADCAST__ROBOTS_TO_NOTIFY);

                communicationActionEClass = createEClass(COMMUNICATION_ACTION);
                createEReference(communicationActionEClass, COMMUNICATION_ACTION__MESSAGES);

                messageEClass = createEClass(MESSAGE);
                createEReference(messageEClass, MESSAGE__PROPERTIES);
                createEReference(messageEClass, MESSAGE__TASKS);
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
                unicastEClass.getESuperTypes().add(this.getCommunicationAction());
                multicastEClass.getESuperTypes().add(this.getCommunicationAction());
                broadcastEClass.getESuperTypes().add(this.getCommunicationAction());
                communicationActionEClass.getESuperTypes().add(theDronePackage.getAction());

                // Initialize classes, features, and operations; add parameters
                initEClass(unicastEClass, Unicast.class, "Unicast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getUnicast_RobotToNotify(), theDronePackage.getRobot(), null, "robotToNotify", null, 1, 1, Unicast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(multicastEClass, Multicast.class, "Multicast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMulticast_RobotsToNotify(), theDronePackage.getRobot(), null, "robotsToNotify", null, 0, -1, Multicast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(broadcastEClass, Broadcast.class, "Broadcast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getBroadcast_RobotsToNotify(), theDronePackage.getRobot(), null, "robotsToNotify", null, 0, -1, Broadcast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(communicationActionEClass, CommunicationAction.class, "CommunicationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getCommunicationAction_Messages(), this.getMessage(), null, "messages", null, 1, 1, CommunicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEReference(getMessage_Properties(), theDronePackage.getProperty(), null, "properties", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
                initEReference(getMessage_Tasks(), theDronePackage.getTask(), null, "tasks", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                // Create resource
                createResource(eNS_URI);
        }

} //BehaviourModelPackageImpl
