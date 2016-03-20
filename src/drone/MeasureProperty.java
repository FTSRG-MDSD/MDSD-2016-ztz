/**
 */
package drone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.MeasureProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getMeasureProperty()
 * @model
 * @generated
 */
public interface MeasureProperty extends PropertyValue {
        /**
         * Returns the value of the '<em><b>Value</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' containment reference.
         * @see #setValue(MeasureValue)
         * @see drone.DronePackage#getMeasureProperty_Value()
         * @model containment="true" required="true"
         * @generated
         */
        MeasureValue getValue();

        /**
         * Sets the value of the '{@link drone.MeasureProperty#getValue <em>Value</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' containment reference.
         * @see #getValue()
         * @generated
         */
        void setValue(MeasureValue value);

} // MeasureProperty
