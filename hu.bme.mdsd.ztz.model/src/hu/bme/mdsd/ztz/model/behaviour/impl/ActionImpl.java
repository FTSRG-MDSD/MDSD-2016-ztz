/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;

import hu.bme.mdsd.ztz.model.drone.Property;

import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.ActionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.ActionImpl#getCurrentTaskExecution <em>Current Task Execution</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.ActionImpl#getCurrentTask <em>Current Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends NamedElementImpl implements Action {
        /**
         * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getProperties()
         * @generated
         * @ordered
         */
        protected EList<Property> properties;

        /**
         * The cached value of the '{@link #getCurrentTaskExecution() <em>Current Task Execution</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCurrentTaskExecution()
         * @generated
         * @ordered
         */
        protected TaskExecution currentTaskExecution;

        /**
         * The cached setting delegate for the '{@link #getCurrentTask() <em>Current Task</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCurrentTask()
         * @generated
         * @ordered
         */
        protected EStructuralFeature.Internal.SettingDelegate CURRENT_TASK__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BehaviourPackage.Literals.ACTION__CURRENT_TASK).getSettingDelegate();

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected ActionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.ACTION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, BehaviourPackage.ACTION__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution getCurrentTaskExecution() {
                if (currentTaskExecution != null && currentTaskExecution.eIsProxy()) {
                        InternalEObject oldCurrentTaskExecution = (InternalEObject)currentTaskExecution;
                        currentTaskExecution = (TaskExecution)eResolveProxy(oldCurrentTaskExecution);
                        if (currentTaskExecution != oldCurrentTaskExecution) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.ACTION__CURRENT_TASK_EXECUTION, oldCurrentTaskExecution, currentTaskExecution));
                        }
                }
                return currentTaskExecution;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution basicGetCurrentTaskExecution() {
                return currentTaskExecution;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCurrentTaskExecution(TaskExecution newCurrentTaskExecution) {
                TaskExecution oldCurrentTaskExecution = currentTaskExecution;
                currentTaskExecution = newCurrentTaskExecution;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.ACTION__CURRENT_TASK_EXECUTION, oldCurrentTaskExecution, currentTaskExecution));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task getCurrentTask() {
                return (Task)CURRENT_TASK__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task basicGetCurrentTask() {
                return (Task)CURRENT_TASK__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetCurrentTask() {
                return CURRENT_TASK__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.ACTION__PROPERTIES:
                                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
                        case BehaviourPackage.ACTION__PROPERTIES:
                                return getProperties();
                        case BehaviourPackage.ACTION__CURRENT_TASK_EXECUTION:
                                if (resolve) return getCurrentTaskExecution();
                                return basicGetCurrentTaskExecution();
                        case BehaviourPackage.ACTION__CURRENT_TASK:
                                if (resolve) return getCurrentTask();
                                return basicGetCurrentTask();
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
                        case BehaviourPackage.ACTION__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case BehaviourPackage.ACTION__CURRENT_TASK_EXECUTION:
                                setCurrentTaskExecution((TaskExecution)newValue);
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
                        case BehaviourPackage.ACTION__PROPERTIES:
                                getProperties().clear();
                                return;
                        case BehaviourPackage.ACTION__CURRENT_TASK_EXECUTION:
                                setCurrentTaskExecution((TaskExecution)null);
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
                        case BehaviourPackage.ACTION__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case BehaviourPackage.ACTION__CURRENT_TASK_EXECUTION:
                                return currentTaskExecution != null;
                        case BehaviourPackage.ACTION__CURRENT_TASK:
                                return isSetCurrentTask();
                }
                return super.eIsSet(featureID);
        }

} //ActionImpl
