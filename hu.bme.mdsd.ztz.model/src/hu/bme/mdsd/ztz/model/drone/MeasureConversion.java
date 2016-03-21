/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion#getRate <em>Rate</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getMeasureConversion()
 * @model
 * @generated
 */
public interface MeasureConversion extends EObject {
        /**
         * Returns the value of the '<em><b>Rate</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Rate</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Rate</em>' attribute.
         * @see #setRate(float)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getMeasureConversion_Rate()
         * @model
         * @generated
         */
        float getRate();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion#getRate <em>Rate</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Rate</em>' attribute.
         * @see #getRate()
         * @generated
         */
        void setRate(float value);

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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getMeasureConversion_Dimension()
         * @model required="true"
         * @generated
         */
        MeasureDimension getDimension();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion#getDimension <em>Dimension</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Dimension</em>' reference.
         * @see #getDimension()
         * @generated
         */
        void setDimension(MeasureDimension value);

} // MeasureConversion
