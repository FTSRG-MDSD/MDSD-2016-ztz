/**
 */
package drone.impl;

import drone.DronePackage;
import drone.MeasureValue;
import drone.Robot;
import drone.RobotCollaboration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.RobotCollaborationImpl#getCollaborator <em>Collaborator</em>}</li>
 *   <li>{@link drone.impl.RobotCollaborationImpl#getAvailabilityRange <em>Availability Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotCollaborationImpl extends MinimalEObjectImpl.Container implements RobotCollaboration {
        /**
         * The cached value of the '{@link #getCollaborator() <em>Collaborator</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCollaborator()
         * @generated
         * @ordered
         */
        protected Robot collaborator;

        /**
         * The cached value of the '{@link #getAvailabilityRange() <em>Availability Range</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getAvailabilityRange()
         * @generated
         * @ordered
         */
        protected MeasureValue availabilityRange;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected RobotCollaborationImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.ROBOT_COLLABORATION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Robot getCollaborator() {
                if (collaborator != null && collaborator.eIsProxy()) {
                        InternalEObject oldCollaborator = (InternalEObject)collaborator;
                        collaborator = (Robot)eResolveProxy(oldCollaborator);
                        if (collaborator != oldCollaborator) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.ROBOT_COLLABORATION__COLLABORATOR, oldCollaborator, collaborator));
                        }
                }
                return collaborator;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Robot basicGetCollaborator() {
                return collaborator;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCollaborator(Robot newCollaborator) {
                Robot oldCollaborator = collaborator;
                collaborator = newCollaborator;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT_COLLABORATION__COLLABORATOR, oldCollaborator, collaborator));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getAvailabilityRange() {
                return availabilityRange;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetAvailabilityRange(MeasureValue newAvailabilityRange, NotificationChain msgs) {
                MeasureValue oldAvailabilityRange = availabilityRange;
                availabilityRange = newAvailabilityRange;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE, oldAvailabilityRange, newAvailabilityRange);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setAvailabilityRange(MeasureValue newAvailabilityRange) {
                if (newAvailabilityRange != availabilityRange) {
                        NotificationChain msgs = null;
                        if (availabilityRange != null)
                                msgs = ((InternalEObject)availabilityRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE, null, msgs);
                        if (newAvailabilityRange != null)
                                msgs = ((InternalEObject)newAvailabilityRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE, null, msgs);
                        msgs = basicSetAvailabilityRange(newAvailabilityRange, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE, newAvailabilityRange, newAvailabilityRange));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE:
                                return basicSetAvailabilityRange(null, msgs);
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
                        case DronePackage.ROBOT_COLLABORATION__COLLABORATOR:
                                if (resolve) return getCollaborator();
                                return basicGetCollaborator();
                        case DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE:
                                return getAvailabilityRange();
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
                        case DronePackage.ROBOT_COLLABORATION__COLLABORATOR:
                                setCollaborator((Robot)newValue);
                                return;
                        case DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE:
                                setAvailabilityRange((MeasureValue)newValue);
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
                        case DronePackage.ROBOT_COLLABORATION__COLLABORATOR:
                                setCollaborator((Robot)null);
                                return;
                        case DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE:
                                setAvailabilityRange((MeasureValue)null);
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
                        case DronePackage.ROBOT_COLLABORATION__COLLABORATOR:
                                return collaborator != null;
                        case DronePackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE:
                                return availabilityRange != null;
                }
                return super.eIsSet(featureID);
        }

} //RobotCollaborationImpl
