/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.MeasureDimension#getConversions <em>Conversions</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getMeasureDimension()
 * @model
 * @generated
 */
public interface MeasureDimension extends NamedElement {
        /**
         * Returns the value of the '<em><b>Conversions</b></em>' containment reference list.
         * The list contents are of type {@link drone.MeasureConversion}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Conversions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Conversions</em>' containment reference list.
         * @see drone.DronePackage#getMeasureDimension_Conversions()
         * @model containment="true"
         * @generated
         */
        EList<MeasureConversion> getConversions();

} // MeasureDimension
