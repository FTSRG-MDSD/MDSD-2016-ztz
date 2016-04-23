/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Battery#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Battery#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Battery#getRechargeTime <em>Recharge Time</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Battery#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends EObject {
        /**
	 * Returns the value of the '<em><b>Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capacity</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' containment reference.
	 * @see #setCapacity(MeasureValue)
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getBattery_Capacity()
	 * @model containment="true" required="true"
	 * @generated
	 */
        MeasureValue getCapacity();

        /**
	 * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Battery#getCapacity <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' containment reference.
	 * @see #getCapacity()
	 * @generated
	 */
        void setCapacity(MeasureValue value);

        /**
	 * Returns the value of the '<em><b>Voltage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Voltage</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' containment reference.
	 * @see #setVoltage(MeasureValue)
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getBattery_Voltage()
	 * @model containment="true" required="true"
	 * @generated
	 */
        MeasureValue getVoltage();

        /**
	 * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Battery#getVoltage <em>Voltage</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' containment reference.
	 * @see #getVoltage()
	 * @generated
	 */
        void setVoltage(MeasureValue value);

        /**
	 * Returns the value of the '<em><b>Recharge Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Recharge Time</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Recharge Time</em>' containment reference.
	 * @see #setRechargeTime(MeasureValue)
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getBattery_RechargeTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
        MeasureValue getRechargeTime();

        /**
	 * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Battery#getRechargeTime <em>Recharge Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recharge Time</em>' containment reference.
	 * @see #getRechargeTime()
	 * @generated
	 */
        void setRechargeTime(MeasureValue value);

        /**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Property}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getBattery_Properties()
	 * @model containment="true"
	 * @generated
	 */
        EList<Property> getProperties();

} // Battery
