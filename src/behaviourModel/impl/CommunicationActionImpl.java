/**
 */
package behaviourModel.impl;

import behaviourModel.BehaviourModelPackage;
import behaviourModel.CommunicationAction;
import behaviourModel.Message;

import drone.impl.ActionImpl;

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
 *   <li>{@link behaviourModel.impl.CommunicationActionImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationActionImpl extends ActionImpl implements CommunicationAction {
        /**
         * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMessages()
         * @generated
         * @ordered
         */
        protected Message messages;

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
                return BehaviourModelPackage.Literals.COMMUNICATION_ACTION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Message getMessages() {
                return messages;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMessages(Message newMessages, NotificationChain msgs) {
                Message oldMessages = messages;
                messages = newMessages;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES, oldMessages, newMessages);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMessages(Message newMessages) {
                if (newMessages != messages) {
                        NotificationChain msgs = null;
                        if (messages != null)
                                msgs = ((InternalEObject)messages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES, null, msgs);
                        if (newMessages != null)
                                msgs = ((InternalEObject)newMessages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES, null, msgs);
                        msgs = basicSetMessages(newMessages, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES, newMessages, newMessages));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES:
                                return basicSetMessages(null, msgs);
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
                        case BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES:
                                return getMessages();
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
                        case BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES:
                                setMessages((Message)newValue);
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
                        case BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES:
                                setMessages((Message)null);
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
                        case BehaviourModelPackage.COMMUNICATION_ACTION__MESSAGES:
                                return messages != null;
                }
                return super.eIsSet(featureID);
        }

} //CommunicationActionImpl
