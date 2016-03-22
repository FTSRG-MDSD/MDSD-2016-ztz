/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;
import hu.bme.mdsd.ztz.model.drone.TaskExecution;
import hu.bme.mdsd.ztz.model.drone.TaskRequirement;
import hu.bme.mdsd.ztz.model.drone.TaskStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskImpl#getEstimatedTime <em>Estimated Time</em>}</li>
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
         * The cached value of the '{@link #getExecution() <em>Execution</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExecution()
         * @generated
         * @ordered
         */
        protected TaskExecution execution;

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
         * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStatus()
         * @generated
         * @ordered
         */
        protected static final TaskStatus STATUS_EDEFAULT = TaskStatus.READY;

        /**
         * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStatus()
         * @generated
         * @ordered
         */
        protected TaskStatus status = STATUS_EDEFAULT;

        /**
         * The cached setting delegate for the '{@link #getEstimatedTime() <em>Estimated Time</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getEstimatedTime()
         * @generated
         * @ordered
         */
        protected EStructuralFeature.Internal.SettingDelegate ESTIMATED_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DronePackage.Literals.TASK__ESTIMATED_TIME).getSettingDelegate();

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
        public TaskExecution getExecution() {
                return execution;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetExecution(TaskExecution newExecution, NotificationChain msgs) {
                TaskExecution oldExecution = execution;
                execution = newExecution;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.TASK__EXECUTION, oldExecution, newExecution);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setExecution(TaskExecution newExecution) {
                if (newExecution != execution) {
                        NotificationChain msgs = null;
                        if (execution != null)
                                msgs = ((InternalEObject)execution).eInverseRemove(this, DronePackage.TASK_EXECUTION__TASK, TaskExecution.class, msgs);
                        if (newExecution != null)
                                msgs = ((InternalEObject)newExecution).eInverseAdd(this, DronePackage.TASK_EXECUTION__TASK, TaskExecution.class, msgs);
                        msgs = basicSetExecution(newExecution, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK__EXECUTION, newExecution, newExecution));
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
        public TaskStatus getStatus() {
                return status;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setStatus(TaskStatus newStatus) {
                TaskStatus oldStatus = status;
                status = newStatus == null ? STATUS_EDEFAULT : newStatus;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK__STATUS, oldStatus, status));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getEstimatedTime() {
                return (MeasureValue)ESTIMATED_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue basicGetEstimatedTime() {
                return (MeasureValue)ESTIMATED_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetEstimatedTime() {
                return ESTIMATED_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
                        case DronePackage.TASK__EXECUTION:
                                if (execution != null)
                                        msgs = ((InternalEObject)execution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__EXECUTION, null, msgs);
                                return basicSetExecution((TaskExecution)otherEnd, msgs);
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
                        case DronePackage.TASK__EXECUTION:
                                return basicSetExecution(null, msgs);
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
                        case DronePackage.TASK__EXECUTION:
                                return getExecution();
                        case DronePackage.TASK__REQUIREMENT:
                                return getRequirement();
                        case DronePackage.TASK__STATUS:
                                return getStatus();
                        case DronePackage.TASK__ESTIMATED_TIME:
                                if (resolve) return getEstimatedTime();
                                return basicGetEstimatedTime();
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
                        case DronePackage.TASK__EXECUTION:
                                setExecution((TaskExecution)newValue);
                                return;
                        case DronePackage.TASK__REQUIREMENT:
                                setRequirement((TaskRequirement)newValue);
                                return;
                        case DronePackage.TASK__STATUS:
                                setStatus((TaskStatus)newValue);
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
                        case DronePackage.TASK__EXECUTION:
                                setExecution((TaskExecution)null);
                                return;
                        case DronePackage.TASK__REQUIREMENT:
                                setRequirement((TaskRequirement)null);
                                return;
                        case DronePackage.TASK__STATUS:
                                setStatus(STATUS_EDEFAULT);
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
                        case DronePackage.TASK__EXECUTION:
                                return execution != null;
                        case DronePackage.TASK__REQUIREMENT:
                                return requirement != null;
                        case DronePackage.TASK__STATUS:
                                return status != STATUS_EDEFAULT;
                        case DronePackage.TASK__ESTIMATED_TIME:
                                return isSetEstimatedTime();
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

} //TaskImpl
