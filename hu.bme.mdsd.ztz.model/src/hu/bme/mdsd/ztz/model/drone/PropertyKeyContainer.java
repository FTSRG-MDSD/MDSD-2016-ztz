/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Key Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.PropertyKeyContainer#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getPropertyKeyContainer()
 * @model
 * @generated
 */
public interface PropertyKeyContainer extends NamedElement {
        /**
         * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.PropertyKey}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Keys</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Keys</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getPropertyKeyContainer_Keys()
         * @model containment="true"
         * @generated
         */
        EList<PropertyKey> getKeys();

} // PropertyKeyContainer
