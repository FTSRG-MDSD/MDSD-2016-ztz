/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.BehaviouralPropertyKeyContainer;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl#getDynamicRobots <em>Dynamic Robots</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl#getTaskExecutions <em>Task Executions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl#getTaskRequirements <em>Task Requirements</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl#getBehaviourKeysContainer <em>Behaviour Keys Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourContainerImpl extends MinimalEObjectImpl.Container implements BehaviourContainer {
        /**
         * The cached value of the '{@link #getDynamicRobots() <em>Dynamic Robots</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDynamicRobots()
         * @generated
         * @ordered
         */
        protected EList<DynamicRobot> dynamicRobots;

        /**
         * The cached value of the '{@link #getTaskExecutions() <em>Task Executions</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTaskExecutions()
         * @generated
         * @ordered
         */
        protected EList<TaskExecution> taskExecutions;

        /**
         * The cached value of the '{@link #getTaskRequirements() <em>Task Requirements</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTaskRequirements()
         * @generated
         * @ordered
         */
        protected EList<TaskRequirement> taskRequirements;

        /**
         * The cached value of the '{@link #getBehaviourKeysContainer() <em>Behaviour Keys Container</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBehaviourKeysContainer()
         * @generated
         * @ordered
         */
        protected BehaviouralPropertyKeyContainer behaviourKeysContainer;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BehaviourContainerImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.BEHAVIOUR_CONTAINER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<DynamicRobot> getDynamicRobots() {
                if (dynamicRobots == null) {
                        dynamicRobots = new EObjectContainmentEList<DynamicRobot>(DynamicRobot.class, this, BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS);
                }
                return dynamicRobots;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<TaskExecution> getTaskExecutions() {
                if (taskExecutions == null) {
                        taskExecutions = new EObjectContainmentEList<TaskExecution>(TaskExecution.class, this, BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS);
                }
                return taskExecutions;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<TaskRequirement> getTaskRequirements() {
                if (taskRequirements == null) {
                        taskRequirements = new EObjectContainmentEList<TaskRequirement>(TaskRequirement.class, this, BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS);
                }
                return taskRequirements;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviouralPropertyKeyContainer getBehaviourKeysContainer() {
                return behaviourKeysContainer;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetBehaviourKeysContainer(BehaviouralPropertyKeyContainer newBehaviourKeysContainer, NotificationChain msgs) {
                BehaviouralPropertyKeyContainer oldBehaviourKeysContainer = behaviourKeysContainer;
                behaviourKeysContainer = newBehaviourKeysContainer;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER, oldBehaviourKeysContainer, newBehaviourKeysContainer);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setBehaviourKeysContainer(BehaviouralPropertyKeyContainer newBehaviourKeysContainer) {
                if (newBehaviourKeysContainer != behaviourKeysContainer) {
                        NotificationChain msgs = null;
                        if (behaviourKeysContainer != null)
                                msgs = ((InternalEObject)behaviourKeysContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER, null, msgs);
                        if (newBehaviourKeysContainer != null)
                                msgs = ((InternalEObject)newBehaviourKeysContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER, null, msgs);
                        msgs = basicSetBehaviourKeysContainer(newBehaviourKeysContainer, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER, newBehaviourKeysContainer, newBehaviourKeysContainer));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS:
                                return ((InternalEList<?>)getDynamicRobots()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS:
                                return ((InternalEList<?>)getTaskExecutions()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS:
                                return ((InternalEList<?>)getTaskRequirements()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER:
                                return basicSetBehaviourKeysContainer(null, msgs);
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS:
                                return getDynamicRobots();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS:
                                return getTaskExecutions();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS:
                                return getTaskRequirements();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER:
                                return getBehaviourKeysContainer();
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS:
                                getDynamicRobots().clear();
                                getDynamicRobots().addAll((Collection<? extends DynamicRobot>)newValue);
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS:
                                getTaskExecutions().clear();
                                getTaskExecutions().addAll((Collection<? extends TaskExecution>)newValue);
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS:
                                getTaskRequirements().clear();
                                getTaskRequirements().addAll((Collection<? extends TaskRequirement>)newValue);
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER:
                                setBehaviourKeysContainer((BehaviouralPropertyKeyContainer)newValue);
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS:
                                getDynamicRobots().clear();
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS:
                                getTaskExecutions().clear();
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS:
                                getTaskRequirements().clear();
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER:
                                setBehaviourKeysContainer((BehaviouralPropertyKeyContainer)null);
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS:
                                return dynamicRobots != null && !dynamicRobots.isEmpty();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS:
                                return taskExecutions != null && !taskExecutions.isEmpty();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS:
                                return taskRequirements != null && !taskRequirements.isEmpty();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__BEHAVIOUR_KEYS_CONTAINER:
                                return behaviourKeysContainer != null;
                }
                return super.eIsSet(featureID);
        }

} //BehaviourContainerImpl
