/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationType;
import hu.bme.mdsd.ztz.model.behaviour.Message;

import hu.bme.mdsd.ztz.model.drone.impl.ActionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.CommunicationActionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommunicationActionImpl extends ActionImpl implements CommunicationAction {
        /**
         * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMessage()
         * @generated
         * @ordered
         */
        protected Message message;

        /**
         * The default value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected static final CommunicationType TYPE_EDEFAULT = CommunicationType.SYNCHRONOUS;

        /**
         * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getType()
         * @generated
         * @ordered
         */
        protected CommunicationType type = TYPE_EDEFAULT;

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
                return message;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
                Message oldMessage = message;
                message = newMessage;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.COMMUNICATION_ACTION__MESSAGE, oldMessage, newMessage);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMessage(Message newMessage) {
                if (newMessage != message) {
                        NotificationChain msgs = null;
                        if (message != null)
                                msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.COMMUNICATION_ACTION__MESSAGE, null, msgs);
                        if (newMessage != null)
                                msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.COMMUNICATION_ACTION__MESSAGE, null, msgs);
                        msgs = basicSetMessage(newMessage, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.COMMUNICATION_ACTION__MESSAGE, newMessage, newMessage));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CommunicationType getType() {
                return type;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setType(CommunicationType newType) {
                CommunicationType oldType = type;
                type = newType == null ? TYPE_EDEFAULT : newType;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.COMMUNICATION_ACTION__TYPE, oldType, type));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.COMMUNICATION_ACTION__MESSAGE:
                                return basicSetMessage(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
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
                                return getMessage();
                        case BehaviourPackage.COMMUNICATION_ACTION__TYPE:
                                return getType();
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
                        case BehaviourPackage.COMMUNICATION_ACTION__TYPE:
                                setType((CommunicationType)newValue);
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
                        case BehaviourPackage.COMMUNICATION_ACTION__TYPE:
                                setType(TYPE_EDEFAULT);
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
                        case BehaviourPackage.COMMUNICATION_ACTION__TYPE:
                                return type != TYPE_EDEFAULT;
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (type: ");
                result.append(type);
                result.append(')');
                return result.toString();
        }

} //CommunicationActionImpl
