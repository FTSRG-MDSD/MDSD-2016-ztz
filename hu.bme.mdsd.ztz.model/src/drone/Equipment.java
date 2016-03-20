/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.Equipment#getProperties <em>Properties</em>}</li>
 *   <li>{@link drone.Equipment#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends NamedElement {
        /**
         * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
         * The list contents are of type {@link drone.Property}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Properties</em>' containment reference list.
         * @see drone.DronePackage#getEquipment_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Capability</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capability</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Capability</em>' reference.
         * @see #setCapability(Capability)
         * @see drone.DronePackage#getEquipment_Capability()
         * @model
         * @generated
         */
        Capability getCapability();

        /**
         * Sets the value of the '{@link drone.Equipment#getCapability <em>Capability</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Capability</em>' reference.
         * @see #getCapability()
         * @generated
         */
        void setCapability(Capability value);

} // Equipment
