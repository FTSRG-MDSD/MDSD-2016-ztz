/**
 */
package hu.bme.mdsd.ztz.model.behaviourModel.impl;

import hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelPackage;
import hu.bme.mdsd.ztz.model.behaviourModel.Broadcast;

import hu.bme.mdsd.ztz.model.drone.Robot;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broadcast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviourModel.impl.BroadcastImpl#getRobotsToNotify <em>Robots To Notify</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BroadcastImpl extends CommunicationActionImpl implements Broadcast {
        /**
         * The cached value of the '{@link #getRobotsToNotify() <em>Robots To Notify</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRobotsToNotify()
         * @generated
         * @ordered
         */
        protected EList<Robot> robotsToNotify;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BroadcastImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourModelPackage.Literals.BROADCAST;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Robot> getRobotsToNotify() {
                if (robotsToNotify == null) {
                        robotsToNotify = new EObjectResolvingEList<Robot>(Robot.class, this, BehaviourModelPackage.BROADCAST__ROBOTS_TO_NOTIFY);
                }
                return robotsToNotify;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourModelPackage.BROADCAST__ROBOTS_TO_NOTIFY:
                                return getRobotsToNotify();
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
                        case BehaviourModelPackage.BROADCAST__ROBOTS_TO_NOTIFY:
                                getRobotsToNotify().clear();
                                getRobotsToNotify().addAll((Collection<? extends Robot>)newValue);
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
                        case BehaviourModelPackage.BROADCAST__ROBOTS_TO_NOTIFY:
                                getRobotsToNotify().clear();
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
                        case BehaviourModelPackage.BROADCAST__ROBOTS_TO_NOTIFY:
                                return robotsToNotify != null && !robotsToNotify.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //BroadcastImpl
