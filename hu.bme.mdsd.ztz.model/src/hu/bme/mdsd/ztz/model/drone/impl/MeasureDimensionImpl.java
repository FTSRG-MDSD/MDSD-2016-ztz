/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.MeasureDimensionImpl#getConversions <em>Conversions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureDimensionImpl extends NamedElementImpl implements MeasureDimension {
        /**
	 * The cached value of the '{@link #getConversions() <em>Conversions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getConversions()
	 * @generated
	 * @ordered
	 */
        protected EList<MeasureConversion> conversions;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected MeasureDimensionImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return DronePackage.Literals.MEASURE_DIMENSION;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<MeasureConversion> getConversions() {
		if (conversions == null) {
			conversions = new EObjectContainmentEList<MeasureConversion>(MeasureConversion.class, this, DronePackage.MEASURE_DIMENSION__CONVERSIONS);
		}
		return conversions;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronePackage.MEASURE_DIMENSION__CONVERSIONS:
				return ((InternalEList<?>)getConversions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronePackage.MEASURE_DIMENSION__CONVERSIONS:
				return getConversions();
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
			case DronePackage.MEASURE_DIMENSION__CONVERSIONS:
				getConversions().clear();
				getConversions().addAll((Collection<? extends MeasureConversion>)newValue);
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
			case DronePackage.MEASURE_DIMENSION__CONVERSIONS:
				getConversions().clear();
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
			case DronePackage.MEASURE_DIMENSION__CONVERSIONS:
				return conversions != null && !conversions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureDimensionImpl
