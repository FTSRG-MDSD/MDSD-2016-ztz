/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.Battery;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl#getRechargeTime <em>Recharge Time</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.BatteryImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryImpl extends MinimalEObjectImpl.Container implements Battery {
        /**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
        protected MeasureValue capacity;

        /**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
        protected MeasureValue voltage;

        /**
	 * The cached value of the '{@link #getRechargeTime() <em>Recharge Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getRechargeTime()
	 * @generated
	 * @ordered
	 */
        protected MeasureValue rechargeTime;

        /**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
        protected EList<Property> properties;

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected BatteryImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return DronePackage.Literals.BATTERY;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MeasureValue getCapacity() {
		return capacity;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetCapacity(MeasureValue newCapacity, NotificationChain msgs) {
		MeasureValue oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setCapacity(MeasureValue newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.BATTERY__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.BATTERY__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__CAPACITY, newCapacity, newCapacity));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MeasureValue getVoltage() {
		return voltage;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetVoltage(MeasureValue newVoltage, NotificationChain msgs) {
		MeasureValue oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__VOLTAGE, oldVoltage, newVoltage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setVoltage(MeasureValue newVoltage) {
		if (newVoltage != voltage) {
			NotificationChain msgs = null;
			if (voltage != null)
				msgs = ((InternalEObject)voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.BATTERY__VOLTAGE, null, msgs);
			if (newVoltage != null)
				msgs = ((InternalEObject)newVoltage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.BATTERY__VOLTAGE, null, msgs);
			msgs = basicSetVoltage(newVoltage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__VOLTAGE, newVoltage, newVoltage));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public MeasureValue getRechargeTime() {
		return rechargeTime;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetRechargeTime(MeasureValue newRechargeTime, NotificationChain msgs) {
		MeasureValue oldRechargeTime = rechargeTime;
		rechargeTime = newRechargeTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__RECHARGE_TIME, oldRechargeTime, newRechargeTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setRechargeTime(MeasureValue newRechargeTime) {
		if (newRechargeTime != rechargeTime) {
			NotificationChain msgs = null;
			if (rechargeTime != null)
				msgs = ((InternalEObject)rechargeTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.BATTERY__RECHARGE_TIME, null, msgs);
			if (newRechargeTime != null)
				msgs = ((InternalEObject)newRechargeTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.BATTERY__RECHARGE_TIME, null, msgs);
			msgs = basicSetRechargeTime(newRechargeTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.BATTERY__RECHARGE_TIME, newRechargeTime, newRechargeTime));
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, DronePackage.BATTERY__PROPERTIES);
		}
		return properties;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronePackage.BATTERY__CAPACITY:
				return basicSetCapacity(null, msgs);
			case DronePackage.BATTERY__VOLTAGE:
				return basicSetVoltage(null, msgs);
			case DronePackage.BATTERY__RECHARGE_TIME:
				return basicSetRechargeTime(null, msgs);
			case DronePackage.BATTERY__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case DronePackage.BATTERY__CAPACITY:
				return getCapacity();
			case DronePackage.BATTERY__VOLTAGE:
				return getVoltage();
			case DronePackage.BATTERY__RECHARGE_TIME:
				return getRechargeTime();
			case DronePackage.BATTERY__PROPERTIES:
				return getProperties();
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
			case DronePackage.BATTERY__CAPACITY:
				setCapacity((MeasureValue)newValue);
				return;
			case DronePackage.BATTERY__VOLTAGE:
				setVoltage((MeasureValue)newValue);
				return;
			case DronePackage.BATTERY__RECHARGE_TIME:
				setRechargeTime((MeasureValue)newValue);
				return;
			case DronePackage.BATTERY__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case DronePackage.BATTERY__CAPACITY:
				setCapacity((MeasureValue)null);
				return;
			case DronePackage.BATTERY__VOLTAGE:
				setVoltage((MeasureValue)null);
				return;
			case DronePackage.BATTERY__RECHARGE_TIME:
				setRechargeTime((MeasureValue)null);
				return;
			case DronePackage.BATTERY__PROPERTIES:
				getProperties().clear();
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
			case DronePackage.BATTERY__CAPACITY:
				return capacity != null;
			case DronePackage.BATTERY__VOLTAGE:
				return voltage != null;
			case DronePackage.BATTERY__RECHARGE_TIME:
				return rechargeTime != null;
			case DronePackage.BATTERY__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BatteryImpl
