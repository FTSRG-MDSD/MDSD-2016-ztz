/**
 */
package behaviourModel.impl;

import behaviourModel.BehaviourModelPackage;
import behaviourModel.Unicast;

import drone.Robot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unicast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourModel.impl.UnicastImpl#getRobotToNotify <em>Robot To Notify</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnicastImpl extends CommunicationActionImpl implements Unicast {
        /**
         * The cached value of the '{@link #getRobotToNotify() <em>Robot To Notify</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRobotToNotify()
         * @generated
         * @ordered
         */
        protected Robot robotToNotify;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected UnicastImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourModelPackage.Literals.UNICAST;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Robot getRobotToNotify() {
                if (robotToNotify != null && robotToNotify.eIsProxy()) {
                        InternalEObject oldRobotToNotify = (InternalEObject)robotToNotify;
                        robotToNotify = (Robot)eResolveProxy(oldRobotToNotify);
                        if (robotToNotify != oldRobotToNotify) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourModelPackage.UNICAST__ROBOT_TO_NOTIFY, oldRobotToNotify, robotToNotify));
                        }
                }
                return robotToNotify;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Robot basicGetRobotToNotify() {
                return robotToNotify;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setRobotToNotify(Robot newRobotToNotify) {
                Robot oldRobotToNotify = robotToNotify;
                robotToNotify = newRobotToNotify;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourModelPackage.UNICAST__ROBOT_TO_NOTIFY, oldRobotToNotify, robotToNotify));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourModelPackage.UNICAST__ROBOT_TO_NOTIFY:
                                if (resolve) return getRobotToNotify();
                                return basicGetRobotToNotify();
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
                        case BehaviourModelPackage.UNICAST__ROBOT_TO_NOTIFY:
                                setRobotToNotify((Robot)newValue);
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
                        case BehaviourModelPackage.UNICAST__ROBOT_TO_NOTIFY:
                                setRobotToNotify((Robot)null);
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
                        case BehaviourModelPackage.UNICAST__ROBOT_TO_NOTIFY:
                                return robotToNotify != null;
                }
                return super.eIsSet(featureID);
        }

} //UnicastImpl
