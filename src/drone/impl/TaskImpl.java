/**
 */
package drone.impl;

import drone.DronePackage;
import drone.MeasureValue;
import drone.Mission;
import drone.Task;
import drone.TaskDescriptor;
import drone.TaskExecution;
import drone.TaskRequirement;
import drone.TaskStatus;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.TaskImpl#getMission <em>Mission</em>}</li>
 *   <li>{@link drone.impl.TaskImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link drone.impl.TaskImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link drone.impl.TaskImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link drone.impl.TaskImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link drone.impl.TaskImpl#getEstimatedTime <em>Estimated Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
        /**
         * The cached value of the '{@link #getMission() <em>Mission</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMission()
         * @generated
         * @ordered
         */
        protected Mission mission;

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
         * The cached value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getEstimatedTime()
         * @generated
         * @ordered
         */
        protected MeasureValue estimatedTime;

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
                if (mission != null && mission.eIsProxy()) {
                        InternalEObject oldMission = (InternalEObject)mission;
                        mission = (Mission)eResolveProxy(oldMission);
                        if (mission != oldMission) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.TASK__MISSION, oldMission, mission));
                        }
                }
                return mission;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Mission basicGetMission() {
                return mission;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setMission(Mission newMission) {
                Mission oldMission = mission;
                mission = newMission;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK__MISSION, oldMission, mission));
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
                                msgs = ((InternalEObject)descriptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__DESCRIPTOR, null, msgs);
                        if (newDescriptor != null)
                                msgs = ((InternalEObject)newDescriptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__DESCRIPTOR, null, msgs);
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
                                msgs = ((InternalEObject)execution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__EXECUTION, null, msgs);
                        if (newExecution != null)
                                msgs = ((InternalEObject)newExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__EXECUTION, null, msgs);
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
                return estimatedTime;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetEstimatedTime(MeasureValue newEstimatedTime, NotificationChain msgs) {
                MeasureValue oldEstimatedTime = estimatedTime;
                estimatedTime = newEstimatedTime;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.TASK__ESTIMATED_TIME, oldEstimatedTime, newEstimatedTime);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setEstimatedTime(MeasureValue newEstimatedTime) {
                if (newEstimatedTime != estimatedTime) {
                        NotificationChain msgs = null;
                        if (estimatedTime != null)
                                msgs = ((InternalEObject)estimatedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__ESTIMATED_TIME, null, msgs);
                        if (newEstimatedTime != null)
                                msgs = ((InternalEObject)newEstimatedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK__ESTIMATED_TIME, null, msgs);
                        msgs = basicSetEstimatedTime(newEstimatedTime, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK__ESTIMATED_TIME, newEstimatedTime, newEstimatedTime));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
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
                        case DronePackage.TASK__DESCRIPTOR:
                                return basicSetDescriptor(null, msgs);
                        case DronePackage.TASK__EXECUTION:
                                return basicSetExecution(null, msgs);
                        case DronePackage.TASK__REQUIREMENT:
                                return basicSetRequirement(null, msgs);
                        case DronePackage.TASK__ESTIMATED_TIME:
                                return basicSetEstimatedTime(null, msgs);
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
                        case DronePackage.TASK__MISSION:
                                if (resolve) return getMission();
                                return basicGetMission();
                        case DronePackage.TASK__DESCRIPTOR:
                                return getDescriptor();
                        case DronePackage.TASK__EXECUTION:
                                return getExecution();
                        case DronePackage.TASK__REQUIREMENT:
                                return getRequirement();
                        case DronePackage.TASK__STATUS:
                                return getStatus();
                        case DronePackage.TASK__ESTIMATED_TIME:
                                return getEstimatedTime();
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
                        case DronePackage.TASK__ESTIMATED_TIME:
                                setEstimatedTime((MeasureValue)newValue);
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
                        case DronePackage.TASK__ESTIMATED_TIME:
                                setEstimatedTime((MeasureValue)null);
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
                                return mission != null;
                        case DronePackage.TASK__DESCRIPTOR:
                                return descriptor != null;
                        case DronePackage.TASK__EXECUTION:
                                return execution != null;
                        case DronePackage.TASK__REQUIREMENT:
                                return requirement != null;
                        case DronePackage.TASK__STATUS:
                                return status != STATUS_EDEFAULT;
                        case DronePackage.TASK__ESTIMATED_TIME:
                                return estimatedTime != null;
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
