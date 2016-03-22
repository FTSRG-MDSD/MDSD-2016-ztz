/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS:
                                return ((InternalEList<?>)getDynamicRobots()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS:
                                return ((InternalEList<?>)getTaskExecutions()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_REQUIREMENTS:
                                return ((InternalEList<?>)getTaskRequirements()).basicRemove(otherEnd, msgs);
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
                }
                return super.eIsSet(featureID);
        }

} //BehaviourContainerImpl
