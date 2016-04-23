/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Position#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Position#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
        /**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Coordinate}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Coordinates</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getPosition_Coordinates()
	 * @model containment="true"
	 * @generated
	 */
        EList<Coordinate> getCoordinates();

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
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getPosition_Properties()
	 * @model containment="true"
	 * @generated
	 */
        EList<Property> getProperties();

} // Position
