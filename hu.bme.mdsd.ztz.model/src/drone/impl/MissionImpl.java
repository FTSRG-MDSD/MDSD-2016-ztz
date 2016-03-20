/**
 */
package drone.impl;

import drone.DronePackage;
import drone.MeasureValue;
import drone.Mission;
import drone.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.MissionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link drone.impl.MissionImpl#getEstimatedTime <em>Estimated Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends NamedElementImpl implements Mission {
        /**
         * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTasks()
         * @generated
         * @ordered
         */
        protected EList<Task> tasks;

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
        protected MissionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.MISSION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Task> getTasks() {
                if (tasks == null) {
                        tasks = new EObjectContainmentWithInverseEList<Task>(Task.class, this, DronePackage.MISSION__TASKS, DronePackage.TASK__MISSION);
                }
                return tasks;
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
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.MISSION__ESTIMATED_TIME, oldEstimatedTime, newEstimatedTime);
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
                                msgs = ((InternalEObject)estimatedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.MISSION__ESTIMATED_TIME, null, msgs);
                        if (newEstimatedTime != null)
                                msgs = ((InternalEObject)newEstimatedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.MISSION__ESTIMATED_TIME, null, msgs);
                        msgs = basicSetEstimatedTime(newEstimatedTime, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.MISSION__ESTIMATED_TIME, newEstimatedTime, newEstimatedTime));
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
                        case DronePackage.MISSION__TASKS:
                                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
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
                        case DronePackage.MISSION__TASKS:
                                return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
                        case DronePackage.MISSION__ESTIMATED_TIME:
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
                        case DronePackage.MISSION__TASKS:
                                return getTasks();
                        case DronePackage.MISSION__ESTIMATED_TIME:
                                return getEstimatedTime();
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
                        case DronePackage.MISSION__TASKS:
                                getTasks().clear();
                                getTasks().addAll((Collection<? extends Task>)newValue);
                                return;
                        case DronePackage.MISSION__ESTIMATED_TIME:
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
                        case DronePackage.MISSION__TASKS:
                                getTasks().clear();
                                return;
                        case DronePackage.MISSION__ESTIMATED_TIME:
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
                        case DronePackage.MISSION__TASKS:
                                return tasks != null && !tasks.isEmpty();
                        case DronePackage.MISSION__ESTIMATED_TIME:
                                return estimatedTime != null;
                }
                return super.eIsSet(featureID);
        }

} //MissionImpl
