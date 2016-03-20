/**
 */
package drone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.MeasureValue#getValue <em>Value</em>}</li>
 *   <li>{@link drone.MeasureValue#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getMeasureValue()
 * @model
 * @generated
 */
public interface MeasureValue extends EObject {
        /**
         * Returns the value of the '<em><b>Value</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' attribute.
         * @see #setValue(float)
         * @see drone.DronePackage#getMeasureValue_Value()
         * @model
         * @generated
         */
        float getValue();

        /**
         * Sets the value of the '{@link drone.MeasureValue#getValue <em>Value</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' attribute.
         * @see #getValue()
         * @generated
         */
        void setValue(float value);

        /**
         * Returns the value of the '<em><b>Dimension</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Dimension</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Dimension</em>' reference.
         * @see #setDimension(MeasureDimension)
         * @see drone.DronePackage#getMeasureValue_Dimension()
         * @model required="true"
         * @generated
         */
        MeasureDimension getDimension();

        /**
         * Sets the value of the '{@link drone.MeasureValue#getDimension <em>Dimension</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Dimension</em>' reference.
         * @see #getDimension()
         * @generated
         */
        void setDimension(MeasureDimension value);

} // MeasureValue
