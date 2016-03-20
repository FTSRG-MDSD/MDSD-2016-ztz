/**
 */
package behaviourModel.impl;

import behaviourModel.*;

import org.eclipse.emf.ecore.EClass;
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
public class BehaviourModelFactoryImpl extends EFactoryImpl implements BehaviourModelFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static BehaviourModelFactory init() {
                try {
                        BehaviourModelFactory theBehaviourModelFactory = (BehaviourModelFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourModelPackage.eNS_URI);
                        if (theBehaviourModelFactory != null) {
                                return theBehaviourModelFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new BehaviourModelFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourModelFactoryImpl() {
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
                        case BehaviourModelPackage.UNICAST: return createUnicast();
                        case BehaviourModelPackage.MULTICAST: return createMulticast();
                        case BehaviourModelPackage.BROADCAST: return createBroadcast();
                        case BehaviourModelPackage.COMMUNICATION_ACTION: return createCommunicationAction();
                        case BehaviourModelPackage.MESSAGE: return createMessage();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Unicast createUnicast() {
                UnicastImpl unicast = new UnicastImpl();
                return unicast;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Multicast createMulticast() {
                MulticastImpl multicast = new MulticastImpl();
                return multicast;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Broadcast createBroadcast() {
                BroadcastImpl broadcast = new BroadcastImpl();
                return broadcast;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CommunicationAction createCommunicationAction() {
                CommunicationActionImpl communicationAction = new CommunicationActionImpl();
                return communicationAction;
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
        public BehaviourModelPackage getBehaviourModelPackage() {
                return (BehaviourModelPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static BehaviourModelPackage getPackage() {
                return BehaviourModelPackage.eINSTANCE;
        }

} //BehaviourModelFactoryImpl
