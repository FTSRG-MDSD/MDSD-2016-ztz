/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.Coordinate;
import hu.bme.mdsd.ztz.model.drone.DronePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.CoordinateImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.CoordinateImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.CoordinateImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinateImpl extends MinimalEObjectImpl.Container implements Coordinate {
        /**
         * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLatitude()
         * @generated
         * @ordered
         */
        protected static final float LATITUDE_EDEFAULT = 0.0F;

        /**
         * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLatitude()
         * @generated
         * @ordered
         */
        protected float latitude = LATITUDE_EDEFAULT;

        /**
         * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLongitude()
         * @generated
         * @ordered
         */
        protected static final float LONGITUDE_EDEFAULT = 0.0F;

        /**
         * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLongitude()
         * @generated
         * @ordered
         */
        protected float longitude = LONGITUDE_EDEFAULT;

        /**
         * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getAltitude()
         * @generated
         * @ordered
         */
        protected static final float ALTITUDE_EDEFAULT = 0.0F;

        /**
         * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getAltitude()
         * @generated
         * @ordered
         */
        protected float altitude = ALTITUDE_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CoordinateImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.COORDINATE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public float getLatitude() {
                return latitude;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setLatitude(float newLatitude) {
                float oldLatitude = latitude;
                latitude = newLatitude;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.COORDINATE__LATITUDE, oldLatitude, latitude));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public float getLongitude() {
                return longitude;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setLongitude(float newLongitude) {
                float oldLongitude = longitude;
                longitude = newLongitude;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.COORDINATE__LONGITUDE, oldLongitude, longitude));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public float getAltitude() {
                return altitude;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setAltitude(float newAltitude) {
                float oldAltitude = altitude;
                altitude = newAltitude;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.COORDINATE__ALTITUDE, oldAltitude, altitude));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DronePackage.COORDINATE__LATITUDE:
                                return getLatitude();
                        case DronePackage.COORDINATE__LONGITUDE:
                                return getLongitude();
                        case DronePackage.COORDINATE__ALTITUDE:
                                return getAltitude();
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
                        case DronePackage.COORDINATE__LATITUDE:
                                setLatitude((Float)newValue);
                                return;
                        case DronePackage.COORDINATE__LONGITUDE:
                                setLongitude((Float)newValue);
                                return;
                        case DronePackage.COORDINATE__ALTITUDE:
                                setAltitude((Float)newValue);
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
                        case DronePackage.COORDINATE__LATITUDE:
                                setLatitude(LATITUDE_EDEFAULT);
                                return;
                        case DronePackage.COORDINATE__LONGITUDE:
                                setLongitude(LONGITUDE_EDEFAULT);
                                return;
                        case DronePackage.COORDINATE__ALTITUDE:
                                setAltitude(ALTITUDE_EDEFAULT);
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
                        case DronePackage.COORDINATE__LATITUDE:
                                return latitude != LATITUDE_EDEFAULT;
                        case DronePackage.COORDINATE__LONGITUDE:
                                return longitude != LONGITUDE_EDEFAULT;
                        case DronePackage.COORDINATE__ALTITUDE:
                                return altitude != ALTITUDE_EDEFAULT;
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
                result.append(" (latitude: ");
                result.append(latitude);
                result.append(", longitude: ");
                result.append(longitude);
                result.append(", altitude: ");
                result.append(altitude);
                result.append(')');
                return result.toString();
        }

} //CoordinateImpl
