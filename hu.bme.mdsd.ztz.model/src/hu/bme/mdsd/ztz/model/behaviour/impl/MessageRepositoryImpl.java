/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;

import hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageRepositoryImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageRepositoryImpl#getReceivedMessages <em>Received Messages</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageRepositoryImpl#getSendedMessages <em>Sended Messages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageRepositoryImpl extends NamedElementImpl implements MessageRepository {
        /**
         * The cached value of the '{@link #getReceivedMessages() <em>Received Messages</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReceivedMessages()
         * @generated
         * @ordered
         */
        protected EList<Message> receivedMessages;

        /**
         * The cached value of the '{@link #getSendedMessages() <em>Sended Messages</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSendedMessages()
         * @generated
         * @ordered
         */
        protected EList<Message> sendedMessages;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MessageRepositoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.MESSAGE_REPOSITORY;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DynamicRobot getRobot() {
                if (eContainerFeatureID() != BehaviourPackage.MESSAGE_REPOSITORY__ROBOT) return null;
                return (DynamicRobot)eInternalContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetRobot(DynamicRobot newRobot, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newRobot, BehaviourPackage.MESSAGE_REPOSITORY__ROBOT, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setRobot(DynamicRobot newRobot) {
                if (newRobot != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.MESSAGE_REPOSITORY__ROBOT && newRobot != null)) {
                        if (EcoreUtil.isAncestor(this, newRobot))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newRobot != null)
                                msgs = ((InternalEObject)newRobot).eInverseAdd(this, BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY, DynamicRobot.class, msgs);
                        msgs = basicSetRobot(newRobot, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MESSAGE_REPOSITORY__ROBOT, newRobot, newRobot));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Message> getReceivedMessages() {
                if (receivedMessages == null) {
                        receivedMessages = new EObjectResolvingEList<Message>(Message.class, this, BehaviourPackage.MESSAGE_REPOSITORY__RECEIVED_MESSAGES);
                }
                return receivedMessages;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Message> getSendedMessages() {
                if (sendedMessages == null) {
                        sendedMessages = new EObjectResolvingEList<Message>(Message.class, this, BehaviourPackage.MESSAGE_REPOSITORY__SENDED_MESSAGES);
                }
                return sendedMessages;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetRobot((DynamicRobot)otherEnd, msgs);
                }
                return super.eInverseAdd(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                return basicSetRobot(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
                switch (eContainerFeatureID()) {
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                return eInternalContainer().eInverseRemove(this, BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY, DynamicRobot.class, msgs);
                }
                return super.eBasicRemoveFromContainerFeature(msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                return getRobot();
                        case BehaviourPackage.MESSAGE_REPOSITORY__RECEIVED_MESSAGES:
                                return getReceivedMessages();
                        case BehaviourPackage.MESSAGE_REPOSITORY__SENDED_MESSAGES:
                                return getSendedMessages();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                setRobot((DynamicRobot)newValue);
                                return;
                        case BehaviourPackage.MESSAGE_REPOSITORY__RECEIVED_MESSAGES:
                                getReceivedMessages().clear();
                                getReceivedMessages().addAll((Collection<? extends Message>)newValue);
                                return;
                        case BehaviourPackage.MESSAGE_REPOSITORY__SENDED_MESSAGES:
                                getSendedMessages().clear();
                                getSendedMessages().addAll((Collection<? extends Message>)newValue);
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
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                setRobot((DynamicRobot)null);
                                return;
                        case BehaviourPackage.MESSAGE_REPOSITORY__RECEIVED_MESSAGES:
                                getReceivedMessages().clear();
                                return;
                        case BehaviourPackage.MESSAGE_REPOSITORY__SENDED_MESSAGES:
                                getSendedMessages().clear();
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
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                return getRobot() != null;
                        case BehaviourPackage.MESSAGE_REPOSITORY__RECEIVED_MESSAGES:
                                return receivedMessages != null && !receivedMessages.isEmpty();
                        case BehaviourPackage.MESSAGE_REPOSITORY__SENDED_MESSAGES:
                                return sendedMessages != null && !sendedMessages.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //MessageRepositoryImpl
