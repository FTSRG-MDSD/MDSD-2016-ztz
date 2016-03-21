/**
 */
package hu.bme.mdsd.ztz.model.drone;

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
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Equipment#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Equipment#getFacilitate <em>Facilitate</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends NamedElement {
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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getEquipment_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Facilitate</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Capability}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Facilitate</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Facilitate</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getEquipment_Facilitate()
         * @model
         * @generated
         */
        EList<Capability> getFacilitate();

} // Equipment
