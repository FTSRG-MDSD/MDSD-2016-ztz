/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.Message;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.CommunicationActionImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommunicationActionImpl extends ActionImpl implements CommunicationAction {
        /**
         * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMessage()
         * @generated
         * @ordered
         */
        protected Message message;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CommunicationActionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.COMMUNICATION_ACTION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Message getMessage() {
                if (message != null && message.eIsProxy()) {
                        InternalEObject oldMessage = (InternalEObject)message;
                        message = (Message)eResolveProxy(oldMessage);
                        if (message != oldMessage) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.COMMUNICATION_ACTION__MESSAGE, oldMessage, message));
                        }
                }
                return message;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Message basicGetMessage() {
                return message;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMessage(Message newMessage) {
                Message oldMessage = message;
                message = newMessage;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.COMMUNICATION_ACTION__MESSAGE, oldMessage, message));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourPackage.COMMUNICATION_ACTION__MESSAGE:
                                if (resolve) return getMessage();
                                return basicGetMessage();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case BehaviourPackage.COMMUNICATION_ACTION__MESSAGE:
                                setMessage((Message)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case BehaviourPackage.COMMUNICATION_ACTION__MESSAGE:
                                setMessage((Message)null);
                                return;
                }
                super.eUnset(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case BehaviourPackage.COMMUNICATION_ACTION__MESSAGE:
                                return message != null;
                }
                return super.eIsSet(featureID);
        }

} //CommunicationActionImpl
