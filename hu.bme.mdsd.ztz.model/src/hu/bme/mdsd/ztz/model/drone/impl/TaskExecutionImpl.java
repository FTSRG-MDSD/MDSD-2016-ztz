/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskExecution;
import hu.bme.mdsd.ztz.model.drone.TaskExecutionStatus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl#getExecutors <em>Executors</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskExecutionImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskExecutionImpl extends MinimalEObjectImpl.Container implements TaskExecution {
        /**
         * The cached value of the '{@link #getExecutors() <em>Executors</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExecutors()
         * @generated
         * @ordered
         */
        protected EList<Robot> executors;

        /**
         * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExecutionTime()
         * @generated
         * @ordered
         */
        protected MeasureValue executionTime;

        /**
         * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStatus()
         * @generated
         * @ordered
         */
        protected static final TaskExecutionStatus STATUS_EDEFAULT = TaskExecutionStatus.READY;

        /**
         * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getStatus()
         * @generated
         * @ordered
         */
        protected TaskExecutionStatus status = STATUS_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskExecutionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.TASK_EXECUTION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Robot> getExecutors() {
                if (executors == null) {
                        executors = new EObjectWithInverseResolvingEList<Robot>(Robot.class, this, DronePackage.TASK_EXECUTION__EXECUTORS, DronePackage.ROBOT__EXECUTE);
                }
                return executors;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getExecutionTime() {
                return executionTime;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetExecutionTime(MeasureValue newExecutionTime, NotificationChain msgs) {
                MeasureValue oldExecutionTime = executionTime;
                executionTime = newExecutionTime;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.TASK_EXECUTION__EXECUTION_TIME, oldExecutionTime, newExecutionTime);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setExecutionTime(MeasureValue newExecutionTime) {
                if (newExecutionTime != executionTime) {
                        NotificationChain msgs = null;
                        if (executionTime != null)
                                msgs = ((InternalEObject)executionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK_EXECUTION__EXECUTION_TIME, null, msgs);
                        if (newExecutionTime != null)
                                msgs = ((InternalEObject)newExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.TASK_EXECUTION__EXECUTION_TIME, null, msgs);
                        msgs = basicSetExecutionTime(newExecutionTime, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK_EXECUTION__EXECUTION_TIME, newExecutionTime, newExecutionTime));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecutionStatus getStatus() {
                return status;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setStatus(TaskExecutionStatus newStatus) {
                TaskExecutionStatus oldStatus = status;
                status = newStatus == null ? STATUS_EDEFAULT : newStatus;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK_EXECUTION__STATUS, oldStatus, status));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task getTask() {
                if (eContainerFeatureID() != DronePackage.TASK_EXECUTION__TASK) return null;
                return (Task)eInternalContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newTask, DronePackage.TASK_EXECUTION__TASK, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTask(Task newTask) {
                if (newTask != eInternalContainer() || (eContainerFeatureID() != DronePackage.TASK_EXECUTION__TASK && newTask != null)) {
                        if (EcoreUtil.isAncestor(this, newTask))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newTask != null)
                                msgs = ((InternalEObject)newTask).eInverseAdd(this, DronePackage.TASK__EXECUTION, Task.class, msgs);
                        msgs = basicSetTask(newTask, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK_EXECUTION__TASK, newTask, newTask));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.TASK_EXECUTION__EXECUTORS:
                                return ((InternalEList<InternalEObject>)(InternalEList<?>)getExecutors()).basicAdd(otherEnd, msgs);
                        case DronePackage.TASK_EXECUTION__TASK:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetTask((Task)otherEnd, msgs);
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
                        case DronePackage.TASK_EXECUTION__EXECUTORS:
                                return ((InternalEList<?>)getExecutors()).basicRemove(otherEnd, msgs);
                        case DronePackage.TASK_EXECUTION__EXECUTION_TIME:
                                return basicSetExecutionTime(null, msgs);
                        case DronePackage.TASK_EXECUTION__TASK:
                                return basicSetTask(null, msgs);
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
                        case DronePackage.TASK_EXECUTION__TASK:
                                return eInternalContainer().eInverseRemove(this, DronePackage.TASK__EXECUTION, Task.class, msgs);
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
                        case DronePackage.TASK_EXECUTION__EXECUTORS:
                                return getExecutors();
                        case DronePackage.TASK_EXECUTION__EXECUTION_TIME:
                                return getExecutionTime();
                        case DronePackage.TASK_EXECUTION__STATUS:
                                return getStatus();
                        case DronePackage.TASK_EXECUTION__TASK:
                                return getTask();
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
                        case DronePackage.TASK_EXECUTION__EXECUTORS:
                                getExecutors().clear();
                                getExecutors().addAll((Collection<? extends Robot>)newValue);
                                return;
                        case DronePackage.TASK_EXECUTION__EXECUTION_TIME:
                                setExecutionTime((MeasureValue)newValue);
                                return;
                        case DronePackage.TASK_EXECUTION__STATUS:
                                setStatus((TaskExecutionStatus)newValue);
                                return;
                        case DronePackage.TASK_EXECUTION__TASK:
                                setTask((Task)newValue);
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
                        case DronePackage.TASK_EXECUTION__EXECUTORS:
                                getExecutors().clear();
                                return;
                        case DronePackage.TASK_EXECUTION__EXECUTION_TIME:
                                setExecutionTime((MeasureValue)null);
                                return;
                        case DronePackage.TASK_EXECUTION__STATUS:
                                setStatus(STATUS_EDEFAULT);
                                return;
                        case DronePackage.TASK_EXECUTION__TASK:
                                setTask((Task)null);
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
                        case DronePackage.TASK_EXECUTION__EXECUTORS:
                                return executors != null && !executors.isEmpty();
                        case DronePackage.TASK_EXECUTION__EXECUTION_TIME:
                                return executionTime != null;
                        case DronePackage.TASK_EXECUTION__STATUS:
                                return status != STATUS_EDEFAULT;
                        case DronePackage.TASK_EXECUTION__TASK:
                                return getTask() != null;
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

} //TaskExecutionImpl
