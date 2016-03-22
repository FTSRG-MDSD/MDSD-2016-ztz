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
                        case BehaviourPackage.COMMUNICATION_TYPE:
                                return createCommunicationTypeFromString(eDataType, initialValue);
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
                        case BehaviourPackage.COMMUNICATION_TYPE:
                                return convertCommunicationTypeToString(eDataType, instanceValue);
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
        public CommunicationType createCommunicationTypeFromString(EDataType eDataType, String initialValue) {
                CommunicationType result = CommunicationType.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertCommunicationTypeToString(EDataType eDataType, Object instanceValue) {
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
