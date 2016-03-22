/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
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
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS:
                                return ((InternalEList<?>)getDynamicRobots()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__TASK_EXECUTIONS:
                                return ((InternalEList<?>)getTaskExecutions()).basicRemove(otherEnd, msgs);
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
                }
                return super.eIsSet(featureID);
        }

} //BehaviourContainerImpl
