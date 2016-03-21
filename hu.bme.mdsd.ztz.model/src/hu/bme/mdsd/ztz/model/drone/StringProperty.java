/**
 */
package hu.bme.mdsd.ztz.model.drone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.StringProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getStringProperty()
 * @model
 * @generated
 */
public interface StringProperty extends PropertyValue {
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(String)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getStringProperty_Value()
         * @model required="true"
         * @generated
         */
        String getValue();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.StringProperty#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(String value);

} // StringProperty
