/**
 */
package drone.impl;

import drone.DronePackage;
import drone.MeasureValue;
import drone.Robot;
import drone.TaskExecution;
import drone.TaskExecutionStatus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.TaskExecutionImpl#getExecutors <em>Executors</em>}</li>
 *   <li>{@link drone.impl.TaskExecutionImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link drone.impl.TaskExecutionImpl#getStatus <em>Status</em>}</li>
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
                        executors = new EObjectResolvingEList<Robot>(Robot.class, this, DronePackage.TASK_EXECUTION__EXECUTORS);
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
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.TASK_EXECUTION__EXECUTION_TIME:
                                return basicSetExecutionTime(null, msgs);
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
                        case DronePackage.TASK_EXECUTION__EXECUTORS:
                                return getExecutors();
                        case DronePackage.TASK_EXECUTION__EXECUTION_TIME:
                                return getExecutionTime();
                        case DronePackage.TASK_EXECUTION__STATUS:
                                return getStatus();
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
