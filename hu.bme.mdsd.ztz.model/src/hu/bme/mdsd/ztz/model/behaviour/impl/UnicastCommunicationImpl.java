/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unicast Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.UnicastCommunicationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnicastCommunicationImpl extends CommunicationActionImpl implements UnicastCommunication {
        /**
         * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTarget()
         * @generated
         * @ordered
         */
        protected DynamicRobot target;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected UnicastCommunicationImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.UNICAST_COMMUNICATION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DynamicRobot getTarget() {
                if (target != null && target.eIsProxy()) {
                        InternalEObject oldTarget = (InternalEObject)target;
                        target = (DynamicRobot)eResolveProxy(oldTarget);
                        if (target != oldTarget) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.UNICAST_COMMUNICATION__TARGET, oldTarget, target));
                        }
                }
                return target;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DynamicRobot basicGetTarget() {
                return target;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTarget(DynamicRobot newTarget) {
                DynamicRobot oldTarget = target;
                target = newTarget;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.UNICAST_COMMUNICATION__TARGET, oldTarget, target));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourPackage.UNICAST_COMMUNICATION__TARGET:
                                if (resolve) return getTarget();
                                return basicGetTarget();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case BehaviourPackage.UNICAST_COMMUNICATION__TARGET:
                                setTarget((DynamicRobot)newValue);
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
                        case BehaviourPackage.UNICAST_COMMUNICATION__TARGET:
                                setTarget((DynamicRobot)null);
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
                        case BehaviourPackage.UNICAST_COMMUNICATION__TARGET:
                                return target != null;
                }
                return super.eIsSet(featureID);
        }

} //UnicastCommunicationImpl
