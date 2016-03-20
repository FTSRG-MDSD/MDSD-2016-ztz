/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.Capability#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends NamedElement {

        /**
         * Returns the value of the '<em><b>Properties</b></em>' reference list.
         * The list contents are of type {@link drone.Property}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Properties</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Properties</em>' reference list.
         * @see drone.DronePackage#getCapability_Properties()
         * @model
         * @generated
         */
        EList<Property> getProperties();
} // Capability
