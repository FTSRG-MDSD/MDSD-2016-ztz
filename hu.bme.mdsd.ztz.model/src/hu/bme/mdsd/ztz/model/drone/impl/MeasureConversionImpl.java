/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureConversionImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureConversionImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureConversionImpl extends MinimalEObjectImpl.Container implements MeasureConversion {
        /**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
        protected static final float RATE_EDEFAULT = 0.0F;

        /**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
        protected float rate = RATE_EDEFAULT;

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
        protected MeasureConversionImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return DronePackage.Literals.MEASURE_CONVERSION;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public float getRate() {
		return rate;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setRate(float newRate) {
		float oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.MEASURE_CONVERSION__RATE, oldRate, rate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.MEASURE_CONVERSION__DIMENSION, oldDimension, dimension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.MEASURE_CONVERSION__DIMENSION, oldDimension, dimension));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronePackage.MEASURE_CONVERSION__RATE:
				return getRate();
			case DronePackage.MEASURE_CONVERSION__DIMENSION:
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
			case DronePackage.MEASURE_CONVERSION__RATE:
				setRate((Float)newValue);
				return;
			case DronePackage.MEASURE_CONVERSION__DIMENSION:
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
			case DronePackage.MEASURE_CONVERSION__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case DronePackage.MEASURE_CONVERSION__DIMENSION:
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
			case DronePackage.MEASURE_CONVERSION__RATE:
				return rate != RATE_EDEFAULT;
			case DronePackage.MEASURE_CONVERSION__DIMENSION:
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
		result.append(" (rate: ");
		result.append(rate);
		result.append(')');
		return result.toString();
	}

} //MeasureConversionImpl
