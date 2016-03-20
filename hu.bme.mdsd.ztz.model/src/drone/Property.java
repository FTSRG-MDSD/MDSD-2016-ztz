/**
 */
package drone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.Property#getKey <em>Key</em>}</li>
 *   <li>{@link drone.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
        /**
         * Returns the value of the '<em><b>Key</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Key</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Key</em>' attribute.
         * @see #setKey(String)
         * @see drone.DronePackage#getProperty_Key()
         * @model required="true"
         * @generated
         */
        String getKey();

        /**
         * Sets the value of the '{@link drone.Property#getKey <em>Key</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Key</em>' attribute.
         * @see #getKey()
         * @generated
         */
        void setKey(String value);

        /**
         * Returns the value of the '<em><b>Value</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Value</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Value</em>' containment reference.
         * @see #setValue(PropertyValue)
         * @see drone.DronePackage#getProperty_Value()
         * @model containment="true" required="true"
         * @generated
         */
        PropertyValue getValue();

        /**
         * Sets the value of the '{@link drone.Property#getValue <em>Value</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' containment reference.
         * @see #getValue()
         * @generated
         */
        void setValue(PropertyValue value);

} // Property
