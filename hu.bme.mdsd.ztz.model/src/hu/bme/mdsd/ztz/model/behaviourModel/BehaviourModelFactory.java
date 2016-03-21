/**
 */
package hu.bme.mdsd.ztz.model.behaviourModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelPackage
 * @generated
 */
public interface BehaviourModelFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        BehaviourModelFactory eINSTANCE = hu.bme.mdsd.ztz.model.behaviourModel.impl.BehaviourModelFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Unicast</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Unicast</em>'.
         * @generated
         */
        Unicast createUnicast();

        /**
         * Returns a new object of class '<em>Multicast</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Multicast</em>'.
         * @generated
         */
        Multicast createMulticast();

        /**
         * Returns a new object of class '<em>Broadcast</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Broadcast</em>'.
         * @generated
         */
        Broadcast createBroadcast();

        /**
         * Returns a new object of class '<em>Communication Action</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Communication Action</em>'.
         * @generated
         */
        CommunicationAction createCommunicationAction();

        /**
         * Returns a new object of class '<em>Message</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Message</em>'.
         * @generated
         */
        Message createMessage();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        BehaviourModelPackage getBehaviourModelPackage();

} //BehaviourModelFactory
