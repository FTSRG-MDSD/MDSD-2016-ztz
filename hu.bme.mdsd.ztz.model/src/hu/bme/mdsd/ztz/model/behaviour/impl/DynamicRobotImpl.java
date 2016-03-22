/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.RobotStatus;

import hu.bme.mdsd.ztz.model.drone.Robot;

import hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl#getRobot <em>Robot</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl#getDetectedObjects <em>Detected Objects</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl#getMessageRepository <em>Message Repository</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.DynamicRobotImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicRobotImpl extends NamedElementImpl implements DynamicRobot {
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
         * The cached value of the '{@link #getDetectedObjects() <em>Detected Objects</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDetectedObjects()
         * @generated
         * @ordered
         */
        protected EList<DetectedObject> detectedObjects;

        /**
         * The cached value of the '{@link #getCollaborations() <em>Collaborations</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCollaborations()
         * @generated
         * @ordered
         */
        protected RobotCollaboration collaborations;

        /**
         * The cached value of the '{@link #getMessageRepository() <em>Message Repository</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMessageRepository()
         * @generated
         * @ordered
         */
        protected MessageRepository messageRepository;

        /**
         * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStatus()
         * @generated
         * @ordered
         */
        protected static final RobotStatus STATUS_EDEFAULT = RobotStatus.READY;

        /**
         * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStatus()
         * @generated
         * @ordered
         */
        protected RobotStatus status = STATUS_EDEFAULT;

        /**
         * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getActions()
         * @generated
         * @ordered
         */
        protected EList<Action> actions;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DynamicRobotImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.DYNAMIC_ROBOT;
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
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.DYNAMIC_ROBOT__ROBOT, oldRobot, robot));
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
        public void setRobot(Robot newRobot) {
                Robot oldRobot = robot;
                robot = newRobot;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DYNAMIC_ROBOT__ROBOT, oldRobot, robot));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<DetectedObject> getDetectedObjects() {
                if (detectedObjects == null) {
                        detectedObjects = new EObjectContainmentEList<DetectedObject>(DetectedObject.class, this, BehaviourPackage.DYNAMIC_ROBOT__DETECTED_OBJECTS);
                }
                return detectedObjects;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotCollaboration getCollaborations() {
                return collaborations;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetCollaborations(RobotCollaboration newCollaborations, NotificationChain msgs) {
                RobotCollaboration oldCollaborations = collaborations;
                collaborations = newCollaborations;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS, oldCollaborations, newCollaborations);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCollaborations(RobotCollaboration newCollaborations) {
                if (newCollaborations != collaborations) {
                        NotificationChain msgs = null;
                        if (collaborations != null)
                                msgs = ((InternalEObject)collaborations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS, null, msgs);
                        if (newCollaborations != null)
                                msgs = ((InternalEObject)newCollaborations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS, null, msgs);
                        msgs = basicSetCollaborations(newCollaborations, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS, newCollaborations, newCollaborations));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MessageRepository getMessageRepository() {
                return messageRepository;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMessageRepository(MessageRepository newMessageRepository, NotificationChain msgs) {
                MessageRepository oldMessageRepository = messageRepository;
                messageRepository = newMessageRepository;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY, oldMessageRepository, newMessageRepository);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMessageRepository(MessageRepository newMessageRepository) {
                if (newMessageRepository != messageRepository) {
                        NotificationChain msgs = null;
                        if (messageRepository != null)
                                msgs = ((InternalEObject)messageRepository).eInverseRemove(this, BehaviourPackage.MESSAGE_REPOSITORY__ROBOT, MessageRepository.class, msgs);
                        if (newMessageRepository != null)
                                msgs = ((InternalEObject)newMessageRepository).eInverseAdd(this, BehaviourPackage.MESSAGE_REPOSITORY__ROBOT, MessageRepository.class, msgs);
                        msgs = basicSetMessageRepository(newMessageRepository, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY, newMessageRepository, newMessageRepository));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotStatus getStatus() {
                return status;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setStatus(RobotStatus newStatus) {
                RobotStatus oldStatus = status;
                status = newStatus == null ? STATUS_EDEFAULT : newStatus;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.DYNAMIC_ROBOT__STATUS, oldStatus, status));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Action> getActions() {
                if (actions == null) {
                        actions = new EObjectContainmentEList<Action>(Action.class, this, BehaviourPackage.DYNAMIC_ROBOT__ACTIONS);
                }
                return actions;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY:
                                if (messageRepository != null)
                                        msgs = ((InternalEObject)messageRepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY, null, msgs);
                                return basicSetMessageRepository((MessageRepository)otherEnd, msgs);
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
                        case BehaviourPackage.DYNAMIC_ROBOT__DETECTED_OBJECTS:
                                return ((InternalEList<?>)getDetectedObjects()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS:
                                return basicSetCollaborations(null, msgs);
                        case BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY:
                                return basicSetMessageRepository(null, msgs);
                        case BehaviourPackage.DYNAMIC_ROBOT__ACTIONS:
                                return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
                        case BehaviourPackage.DYNAMIC_ROBOT__ROBOT:
                                if (resolve) return getRobot();
                                return basicGetRobot();
                        case BehaviourPackage.DYNAMIC_ROBOT__DETECTED_OBJECTS:
                                return getDetectedObjects();
                        case BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS:
                                return getCollaborations();
                        case BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY:
                                return getMessageRepository();
                        case BehaviourPackage.DYNAMIC_ROBOT__STATUS:
                                return getStatus();
                        case BehaviourPackage.DYNAMIC_ROBOT__ACTIONS:
                                return getActions();
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
                        case BehaviourPackage.DYNAMIC_ROBOT__ROBOT:
                                setRobot((Robot)newValue);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__DETECTED_OBJECTS:
                                getDetectedObjects().clear();
                                getDetectedObjects().addAll((Collection<? extends DetectedObject>)newValue);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS:
                                setCollaborations((RobotCollaboration)newValue);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY:
                                setMessageRepository((MessageRepository)newValue);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__STATUS:
                                setStatus((RobotStatus)newValue);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__ACTIONS:
                                getActions().clear();
                                getActions().addAll((Collection<? extends Action>)newValue);
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
                        case BehaviourPackage.DYNAMIC_ROBOT__ROBOT:
                                setRobot((Robot)null);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__DETECTED_OBJECTS:
                                getDetectedObjects().clear();
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS:
                                setCollaborations((RobotCollaboration)null);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY:
                                setMessageRepository((MessageRepository)null);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__STATUS:
                                setStatus(STATUS_EDEFAULT);
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__ACTIONS:
                                getActions().clear();
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
                        case BehaviourPackage.DYNAMIC_ROBOT__ROBOT:
                                return robot != null;
                        case BehaviourPackage.DYNAMIC_ROBOT__DETECTED_OBJECTS:
                                return detectedObjects != null && !detectedObjects.isEmpty();
                        case BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS:
                                return collaborations != null;
                        case BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY:
                                return messageRepository != null;
                        case BehaviourPackage.DYNAMIC_ROBOT__STATUS:
                                return status != STATUS_EDEFAULT;
                        case BehaviourPackage.DYNAMIC_ROBOT__ACTIONS:
                                return actions != null && !actions.isEmpty();
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
                result.append(" (status: ");
                result.append(status);
                result.append(')');
                return result.toString();
        }

} //DynamicRobotImpl
