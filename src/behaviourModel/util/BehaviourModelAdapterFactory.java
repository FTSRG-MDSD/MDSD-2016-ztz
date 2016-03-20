/**
 */
package behaviourModel.util;

import behaviourModel.*;

import drone.Action;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behaviourModel.BehaviourModelPackage
 * @generated
 */
public class BehaviourModelAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static BehaviourModelPackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourModelAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = BehaviourModelPackage.eINSTANCE;
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
        protected BehaviourModelSwitch<Adapter> modelSwitch =
                new BehaviourModelSwitch<Adapter>() {
                        @Override
                        public Adapter caseUnicast(Unicast object) {
                                return createUnicastAdapter();
                        }
                        @Override
                        public Adapter caseMulticast(Multicast object) {
                                return createMulticastAdapter();
                        }
                        @Override
                        public Adapter caseBroadcast(Broadcast object) {
                                return createBroadcastAdapter();
                        }
                        @Override
                        public Adapter caseCommunicationAction(CommunicationAction object) {
                                return createCommunicationActionAdapter();
                        }
                        @Override
                        public Adapter caseMessage(Message object) {
                                return createMessageAdapter();
                        }
                        @Override
                        public Adapter caseAction(Action object) {
                                return createActionAdapter();
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
         * Creates a new adapter for an object of class '{@link behaviourModel.Unicast <em>Unicast</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see behaviourModel.Unicast
         * @generated
         */
        public Adapter createUnicastAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link behaviourModel.Multicast <em>Multicast</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see behaviourModel.Multicast
         * @generated
         */
        public Adapter createMulticastAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link behaviourModel.Broadcast <em>Broadcast</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see behaviourModel.Broadcast
         * @generated
         */
        public Adapter createBroadcastAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link behaviourModel.CommunicationAction <em>Communication Action</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see behaviourModel.CommunicationAction
         * @generated
         */
        public Adapter createCommunicationActionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link behaviourModel.Message <em>Message</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see behaviourModel.Message
         * @generated
         */
        public Adapter createMessageAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Action <em>Action</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Action
         * @generated
         */
        public Adapter createActionAdapter() {
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

} //BehaviourModelAdapterFactory
