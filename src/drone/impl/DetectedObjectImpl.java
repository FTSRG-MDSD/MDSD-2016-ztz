/**
 */
package drone.impl;

import drone.AreaObject;
import drone.DetectedObject;
import drone.DronePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detected Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.DetectedObjectImpl#getObject <em>Object</em>}</li>
 *   <li>{@link drone.impl.DetectedObjectImpl#isObstacle <em>Obstacle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetectedObjectImpl extends MinimalEObjectImpl.Container implements DetectedObject {
        /**
         * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getObject()
         * @generated
         * @ordered
         */
        protected AreaObject object;

        /**
         * The default value of the '{@link #isObstacle() <em>Obstacle</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isObstacle()
         * @generated
         * @ordered
         */
        protected static final boolean OBSTACLE_EDEFAULT = false;

        /**
         * The cached value of the '{@link #isObstacle() <em>Obstacle</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isObstacle()
         * @generated
         * @ordered
         */
        protected boolean obstacle = OBSTACLE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DetectedObjectImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.DETECTED_OBJECT;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AreaObject getObject() {
                if (object != null && object.eIsProxy()) {
                        InternalEObject oldObject = (InternalEObject)object;
                        object = (AreaObject)eResolveProxy(oldObject);
                        if (object != oldObject) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.DETECTED_OBJECT__OBJECT, oldObject, object));
                        }
                }
                return object;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public AreaObject basicGetObject() {
                return object;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setObject(AreaObject newObject) {
                AreaObject oldObject = object;
                object = newObject;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DETECTED_OBJECT__OBJECT, oldObject, object));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isObstacle() {
                return obstacle;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setObstacle(boolean newObstacle) {
                boolean oldObstacle = obstacle;
                obstacle = newObstacle;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DETECTED_OBJECT__OBSTACLE, oldObstacle, obstacle));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DronePackage.DETECTED_OBJECT__OBJECT:
                                if (resolve) return getObject();
                                return basicGetObject();
                        case DronePackage.DETECTED_OBJECT__OBSTACLE:
                                return isObstacle();
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
                        case DronePackage.DETECTED_OBJECT__OBJECT:
                                setObject((AreaObject)newValue);
                                return;
                        case DronePackage.DETECTED_OBJECT__OBSTACLE:
                                setObstacle((Boolean)newValue);
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
                        case DronePackage.DETECTED_OBJECT__OBJECT:
                                setObject((AreaObject)null);
                                return;
                        case DronePackage.DETECTED_OBJECT__OBSTACLE:
                                setObstacle(OBSTACLE_EDEFAULT);
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
                        case DronePackage.DETECTED_OBJECT__OBJECT:
                                return object != null;
                        case DronePackage.DETECTED_OBJECT__OBSTACLE:
                                return obstacle != OBSTACLE_EDEFAULT;
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (obstacle: ");
                result.append(obstacle);
                result.append(')');
                return result.toString();
        }

} //DetectedObjectImpl
