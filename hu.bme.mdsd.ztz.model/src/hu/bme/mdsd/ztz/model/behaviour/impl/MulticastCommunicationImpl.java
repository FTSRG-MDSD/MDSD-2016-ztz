/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;

import hu.bme.mdsd.ztz.model.drone.Robot;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multicast Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MulticastCommunicationImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MulticastCommunicationImpl extends CommunicationActionImpl implements MulticastCommunication {
        /**
         * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTargets()
         * @generated
         * @ordered
         */
        protected EList<Robot> targets;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MulticastCommunicationImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.MULTICAST_COMMUNICATION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Robot> getTargets() {
                if (targets == null) {
                        targets = new EObjectResolvingEList<Robot>(Robot.class, this, BehaviourPackage.MULTICAST_COMMUNICATION__TARGETS);
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
                        case BehaviourPackage.MULTICAST_COMMUNICATION__TARGETS:
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
                        case BehaviourPackage.MULTICAST_COMMUNICATION__TARGETS:
                                getTargets().clear();
                                getTargets().addAll((Collection<? extends Robot>)newValue);
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
                        case BehaviourPackage.MULTICAST_COMMUNICATION__TARGETS:
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
                        case BehaviourPackage.MULTICAST_COMMUNICATION__TARGETS:
                                return targets != null && !targets.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //MulticastCommunicationImpl
