/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.AreaObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detected Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject#getObject <em>Object</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject#isObstacle <em>Obstacle</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDetectedObject()
 * @model
 * @generated
 */
public interface DetectedObject extends EObject {
        /**
         * Returns the value of the '<em><b>Object</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Object</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Object</em>' reference.
         * @see #setObject(AreaObject)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDetectedObject_Object()
         * @model required="true"
         * @generated
         */
        AreaObject getObject();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject#getObject <em>Object</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Object</em>' reference.
         * @see #getObject()
         * @generated
         */
        void setObject(AreaObject value);

        /**
         * Returns the value of the '<em><b>Obstacle</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Obstacle</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Obstacle</em>' attribute.
         * @see #setObstacle(boolean)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDetectedObject_Obstacle()
         * @model
         * @generated
         */
        boolean isObstacle();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject#isObstacle <em>Obstacle</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Obstacle</em>' attribute.
         * @see #isObstacle()
         * @generated
         */
        void setObstacle(boolean value);

} // DetectedObject
