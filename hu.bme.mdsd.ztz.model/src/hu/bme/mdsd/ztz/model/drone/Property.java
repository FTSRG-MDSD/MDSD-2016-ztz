/**
 */
package hu.bme.mdsd.ztz.model.drone;

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
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Property#getValue <em>Value</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Property#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
        /**
         * Returns the value of the '<em><b>Key</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Key</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Key</em>' reference.
         * @see #setKey(PropertyKey)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getProperty_Key()
         * @model required="true"
         * @generated
         */
        PropertyKey getKey();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Property#getKey <em>Key</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Key</em>' reference.
         * @see #getKey()
         * @generated
         */
        void setKey(PropertyKey value);

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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getProperty_Value()
         * @model containment="true" required="true"
         * @generated
         */
        PropertyValue getValue();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Property#getValue <em>Value</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Value</em>' containment reference.
         * @see #getValue()
         * @generated
         */
        void setValue(PropertyValue value);

} // Property
