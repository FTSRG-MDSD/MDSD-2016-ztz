/**
 */
package drone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.Coordinate#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link drone.Coordinate#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link drone.Coordinate#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getCoordinate()
 * @model
 * @generated
 */
public interface Coordinate extends EObject {
        /**
         * Returns the value of the '<em><b>Latitude</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Latitude</em>' attribute.
         * @see #setLatitude(float)
         * @see drone.DronePackage#getCoordinate_Latitude()
         * @model unique="false" required="true"
         * @generated
         */
        float getLatitude();

        /**
         * Sets the value of the '{@link drone.Coordinate#getLatitude <em>Latitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Latitude</em>' attribute.
         * @see #getLatitude()
         * @generated
         */
        void setLatitude(float value);

        /**
         * Returns the value of the '<em><b>Longitude</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Longitude</em>' attribute.
         * @see #setLongitude(float)
         * @see drone.DronePackage#getCoordinate_Longitude()
         * @model unique="false" required="true"
         * @generated
         */
        float getLongitude();

        /**
         * Sets the value of the '{@link drone.Coordinate#getLongitude <em>Longitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Longitude</em>' attribute.
         * @see #getLongitude()
         * @generated
         */
        void setLongitude(float value);

        /**
         * Returns the value of the '<em><b>Altitude</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Altitude</em>' attribute.
         * @see #setAltitude(float)
         * @see drone.DronePackage#getCoordinate_Altitude()
         * @model unique="false" required="true"
         * @generated
         */
        float getAltitude();

        /**
         * Sets the value of the '{@link drone.Coordinate#getAltitude <em>Altitude</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Altitude</em>' attribute.
         * @see #getAltitude()
         * @generated
         */
        void setAltitude(float value);

} // Coordinate
