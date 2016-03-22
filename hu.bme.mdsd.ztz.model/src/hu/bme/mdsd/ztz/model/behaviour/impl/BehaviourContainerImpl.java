/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl#getDynamicRobots <em>Dynamic Robots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourContainerImpl extends MinimalEObjectImpl.Container implements BehaviourContainer {
        /**
         * The cached value of the '{@link #getDynamicRobots() <em>Dynamic Robots</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDynamicRobots()
         * @generated
         * @ordered
         */
        protected EList<DynamicRobot> dynamicRobots;

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
                        dynamicRobots = new EObjectResolvingEList<DynamicRobot>(DynamicRobot.class, this, BehaviourPackage.BEHAVIOUR_CONTAINER__DYNAMIC_ROBOTS);
                }
                return dynamicRobots;
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
                }
                return super.eIsSet(featureID);
        }

} //BehaviourContainerImpl
