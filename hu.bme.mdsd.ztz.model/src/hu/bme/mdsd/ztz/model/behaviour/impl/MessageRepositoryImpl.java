/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.Robot;

import hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
         * The cached value of the '{@link #getRobot() <em>Robot</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRobot()
         * @generated
         * @ordered
         */
        protected Robot robot;

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
        public Robot getRobot() {
                if (robot != null && robot.eIsProxy()) {
                        InternalEObject oldRobot = (InternalEObject)robot;
                        robot = (Robot)eResolveProxy(oldRobot);
                        if (robot != oldRobot) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.MESSAGE_REPOSITORY__ROBOT, oldRobot, robot));
                        }
                }
                return robot;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Robot basicGetRobot() {
                return robot;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetRobot(Robot newRobot, NotificationChain msgs) {
                Robot oldRobot = robot;
                robot = newRobot;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.MESSAGE_REPOSITORY__ROBOT, oldRobot, newRobot);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setRobot(Robot newRobot) {
                if (newRobot != robot) {
                        NotificationChain msgs = null;
                        if (robot != null)
                                msgs = ((InternalEObject)robot).eInverseRemove(this, DronePackage.ROBOT__MESSAGE_REPOSITORY, Robot.class, msgs);
                        if (newRobot != null)
                                msgs = ((InternalEObject)newRobot).eInverseAdd(this, DronePackage.ROBOT__MESSAGE_REPOSITORY, Robot.class, msgs);
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
                                if (robot != null)
                                        msgs = ((InternalEObject)robot).eInverseRemove(this, DronePackage.ROBOT__MESSAGE_REPOSITORY, Robot.class, msgs);
                                return basicSetRobot((Robot)otherEnd, msgs);
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
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourPackage.MESSAGE_REPOSITORY__ROBOT:
                                if (resolve) return getRobot();
                                return basicGetRobot();
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
                                setRobot((Robot)newValue);
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
                                setRobot((Robot)null);
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
                                return robot != null;
                        case BehaviourPackage.MESSAGE_REPOSITORY__RECEIVED_MESSAGES:
                                return receivedMessages != null && !receivedMessages.isEmpty();
                        case BehaviourPackage.MESSAGE_REPOSITORY__SENDED_MESSAGES:
                                return sendedMessages != null && !sendedMessages.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //MessageRepositoryImpl
