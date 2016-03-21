/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureValueImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureValueImpl extends MinimalEObjectImpl.Container implements MeasureValue {
        /**
         * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected static final float VALUE_EDEFAULT = 0.0F;

        /**
         * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getValue()
         * @generated
         * @ordered
         */
        protected float value = VALUE_EDEFAULT;

        /**
         * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDimension()
         * @generated
         * @ordered
         */
        protected MeasureDimension dimension;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MeasureValueImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.MEASURE_VALUE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public float getValue() {
                return value;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setValue(float newValue) {
                float oldValue = value;
                value = newValue;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.MEASURE_VALUE__VALUE, oldValue, value));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureDimension getDimension() {
                if (dimension != null && dimension.eIsProxy()) {
                        InternalEObject oldDimension = (InternalEObject)dimension;
                        dimension = (MeasureDimension)eResolveProxy(oldDimension);
                        if (dimension != oldDimension) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.MEASURE_VALUE__DIMENSION, oldDimension, dimension));
                        }
                }
                return dimension;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureDimension basicGetDimension() {
                return dimension;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setDimension(MeasureDimension newDimension) {
                MeasureDimension oldDimension = dimension;
                dimension = newDimension;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.MEASURE_VALUE__DIMENSION, oldDimension, dimension));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DronePackage.MEASURE_VALUE__VALUE:
                                return getValue();
                        case DronePackage.MEASURE_VALUE__DIMENSION:
                                if (resolve) return getDimension();
                                return basicGetDimension();
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
                        case DronePackage.MEASURE_VALUE__VALUE:
                                setValue((Float)newValue);
                                return;
                        case DronePackage.MEASURE_VALUE__DIMENSION:
                                setDimension((MeasureDimension)newValue);
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
                        case DronePackage.MEASURE_VALUE__VALUE:
                                setValue(VALUE_EDEFAULT);
                                return;
                        case DronePackage.MEASURE_VALUE__DIMENSION:
                                setDimension((MeasureDimension)null);
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
                        case DronePackage.MEASURE_VALUE__VALUE:
                                return value != VALUE_EDEFAULT;
                        case DronePackage.MEASURE_VALUE__DIMENSION:
                                return dimension != null;
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
                result.append(" (value: ");
                result.append(value);
                result.append(')');
                return result.toString();
        }

} //MeasureValueImpl
