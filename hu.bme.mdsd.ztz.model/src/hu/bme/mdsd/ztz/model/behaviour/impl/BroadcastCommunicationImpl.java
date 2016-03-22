/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broadcast Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BroadcastCommunicationImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BroadcastCommunicationImpl extends CommunicationActionImpl implements BroadcastCommunication {
        /**
         * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTargets()
         * @generated
         * @ordered
         */
        protected EList<DynamicRobot> targets;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BroadcastCommunicationImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.BROADCAST_COMMUNICATION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<DynamicRobot> getTargets() {
                if (targets == null) {
                        targets = new EObjectResolvingEList<DynamicRobot>(DynamicRobot.class, this, BehaviourPackage.BROADCAST_COMMUNICATION__TARGETS);
                }
                return targets;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourPackage.BROADCAST_COMMUNICATION__TARGETS:
                                return getTargets();
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
                        case BehaviourPackage.BROADCAST_COMMUNICATION__TARGETS:
                                getTargets().clear();
                                getTargets().addAll((Collection<? extends DynamicRobot>)newValue);
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
                        case BehaviourPackage.BROADCAST_COMMUNICATION__TARGETS:
                                getTargets().clear();
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
                        case BehaviourPackage.BROADCAST_COMMUNICATION__TARGETS:
                                return targets != null && !targets.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //BroadcastCommunicationImpl
