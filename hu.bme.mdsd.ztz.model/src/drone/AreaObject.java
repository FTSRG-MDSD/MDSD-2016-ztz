/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.AreaObject#getPositions <em>Positions</em>}</li>
 *   <li>{@link drone.AreaObject#getSize <em>Size</em>}</li>
 *   <li>{@link drone.AreaObject#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getAreaObject()
 * @model
 * @generated
 */
public interface AreaObject extends NamedElement {
        /**
         * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
         * The list contents are of type {@link drone.Position}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Positions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Positions</em>' containment reference list.
         * @see drone.DronePackage#getAreaObject_Positions()
         * @model containment="true"
         * @generated
         */
        EList<Position> getPositions();

        /**
         * Returns the value of the '<em><b>Size</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Size</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Size</em>' containment reference.
         * @see #setSize(Size)
         * @see drone.DronePackage#getAreaObject_Size()
         * @model containment="true"
         * @generated
         */
        Size getSize();

        /**
         * Sets the value of the '{@link drone.AreaObject#getSize <em>Size</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Size</em>' containment reference.
         * @see #getSize()
         * @generated
         */
        void setSize(Size value);

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
         * @see drone.DronePackage#getAreaObject_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

} // AreaObject
