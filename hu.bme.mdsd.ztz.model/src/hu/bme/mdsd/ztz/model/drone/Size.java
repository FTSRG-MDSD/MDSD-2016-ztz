/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Size#getWidth <em>Width</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Size#getHeight <em>Height</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Size#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getSize()
 * @model
 * @generated
 */
public interface Size extends EObject {
        /**
         * Returns the value of the '<em><b>Width</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Width</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Width</em>' containment reference.
         * @see #setWidth(MeasureValue)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getSize_Width()
         * @model containment="true" required="true"
         * @generated
         */
        MeasureValue getWidth();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Size#getWidth <em>Width</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Width</em>' containment reference.
         * @see #getWidth()
         * @generated
         */
        void setWidth(MeasureValue value);

        /**
         * Returns the value of the '<em><b>Height</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Height</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Height</em>' containment reference.
         * @see #setHeight(MeasureValue)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getSize_Height()
         * @model containment="true" required="true"
         * @generated
         */
        MeasureValue getHeight();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Size#getHeight <em>Height</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Height</em>' containment reference.
         * @see #getHeight()
         * @generated
         */
        void setHeight(MeasureValue value);

        /**
         * Returns the value of the '<em><b>Length</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Length</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Length</em>' containment reference.
         * @see #setLength(MeasureValue)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getSize_Length()
         * @model containment="true" required="true"
         * @generated
         */
        MeasureValue getLength();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Size#getLength <em>Length</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Length</em>' containment reference.
         * @see #getLength()
         * @generated
         */
        void setLength(MeasureValue value);

} // Size
