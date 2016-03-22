/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;
import hu.bme.mdsd.ztz.model.drone.TaskRequirement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl#getMission <em>Mission</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
        /**
         * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDescriptor()
         * @generated
         * @ordered
         */
        protected TaskDescriptor descriptor;

        /**
         * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRequirement()
         * @generated
         * @ordered
         */
        protected TaskRequirement requirement;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.TASK;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Mission getMission() {
                if (eContainerFeatureID() != DronePackage.TASK__MISSION) return null;
                return (Mission)eInternalContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetMission(Mission newMission, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newMission, DronePackage.TASK__MISSION, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMission(Mission newMission) {
                if (newMission != eInternalContainer() || (eContainerFeatureID() != DronePackage.TASK__MISSION && newMission != null)) {
                        if (EcoreUtil.isAncestor(this, newMission))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newMission != null)
                                msgs = ((InternalEObject)newMission).eInverseAdd(this, DronePackage.MISSION__TASKS, Mission.class, msgs);
                        msgs = basicSetMission(newMission, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK__MISSION, newMission, newMission));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskDescriptor getDescriptor() {
                return descriptor;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetDescriptor(TaskDescriptor newDescriptor, NotificationChain msgs) {
                TaskDescriptor oldDescriptor = descriptor;
                descriptor = newDescriptor;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.TASK__DESCRIPTOR, oldDescriptor, newDescriptor);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setDescriptor(TaskDescriptor newDescriptor) {
                if (newDescriptor != descriptor) {
                        NotificationChain msgs = null;
                        if (descriptor != null)
                                msgs = ((InternalEObject)descriptor).eInverseRemove(this, DronePackage.TASK_DESCRIPTOR__TASK, TaskDescriptor.class, msgs);
                        if (newDescriptor != null)
                                msgs = ((InternalEObject)newDescriptor).eInverseAdd(this, DronePackage.TASK_DESCRIPTOR__TASK, TaskDescriptor.class, msgs);
                        msgs = basicSetDescriptor(newDescriptor, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK__DESCRIPTOR, newDescriptor, newDescriptor));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskRequirement getRequirement() {
                return requirement;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetRequirement(TaskRequirement newRequirement, NotificationChain msgs) {
                TaskRequirement oldRequirement = requirement;
                requirement = newRequirement;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.TASK__REQUIREMENT, oldRequirement, newRequirement);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setRequirement(TaskRequirement newRequirement) {
                if (newRequirement != requirement) {
                        NotificationChain msgs = null;
                        if (requirement != null)
                                msgs = ((InternalEObject)requirement).eInverseRemove(this, DronePackage.TASK_REQUIREMENT__TASK, TaskRequirement.class, msgs);
                        if (newRequirement != null)
                                msgs = ((InternalEObject)newRequirement).eInverseAdd(this, DronePackage.TASK_REQUIREMENT__TASK, TaskRequirement.class, msgs);
                        msgs = basicSetRequirement(newRequirement, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK__REQUIREMENT, newRequirement, newRequirement));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.TASK__MISSION:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetMission((Mission)otherEnd, msgs);
                        case DronePackage.TASK__DESCRIPTOR:
                                if (descriptor != null)
                                        msgs = ((InternalEObject)descriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__DESCRIPTOR, null, msgs);
                                return basicSetDescriptor((TaskDescriptor)otherEnd, msgs);
                        case DronePackage.TASK__REQUIREMENT:
                                if (requirement != null)
                                        msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__REQUIREMENT, null, msgs);
                                return basicSetRequirement((TaskRequirement)otherEnd, msgs);
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
                        case DronePackage.TASK__MISSION:
                                return basicSetMission(null, msgs);
                        case DronePackage.TASK__DESCRIPTOR:
                                return basicSetDescriptor(null, msgs);
                        case DronePackage.TASK__REQUIREMENT:
                                return basicSetRequirement(null, msgs);
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
                        case DronePackage.TASK__MISSION:
                                return eInternalContainer().eInverseRemove(this, DronePackage.MISSION__TASKS, Mission.class, msgs);
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
                        case DronePackage.TASK__MISSION:
                                return getMission();
                        case DronePackage.TASK__DESCRIPTOR:
                                return getDescriptor();
                        case DronePackage.TASK__REQUIREMENT:
                                return getRequirement();
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
                        case DronePackage.TASK__MISSION:
                                setMission((Mission)newValue);
                                return;
                        case DronePackage.TASK__DESCRIPTOR:
                                setDescriptor((TaskDescriptor)newValue);
                                return;
                        case DronePackage.TASK__REQUIREMENT:
                                setRequirement((TaskRequirement)newValue);
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
                        case DronePackage.TASK__MISSION:
                                setMission((Mission)null);
                                return;
                        case DronePackage.TASK__DESCRIPTOR:
                                setDescriptor((TaskDescriptor)null);
                                return;
                        case DronePackage.TASK__REQUIREMENT:
                                setRequirement((TaskRequirement)null);
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
                        case DronePackage.TASK__MISSION:
                                return getMission() != null;
                        case DronePackage.TASK__DESCRIPTOR:
                                return descriptor != null;
                        case DronePackage.TASK__REQUIREMENT:
                                return requirement != null;
                }
                return super.eIsSet(featureID);
        }

} //TaskImpl
