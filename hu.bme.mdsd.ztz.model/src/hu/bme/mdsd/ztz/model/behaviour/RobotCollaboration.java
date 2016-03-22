/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getCollaborator <em>Collaborator</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getAvailabilityRange <em>Availability Range</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getRobotCollaboration()
 * @model
 * @generated
 */
public interface RobotCollaboration extends EObject {
        /**
         * Returns the value of the '<em><b>Collaborator</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Collaborator</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Collaborator</em>' reference.
         * @see #setCollaborator(DynamicRobot)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getRobotCollaboration_Collaborator()
         * @model required="true"
         * @generated
         */
        DynamicRobot getCollaborator();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getCollaborator <em>Collaborator</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Collaborator</em>' reference.
         * @see #getCollaborator()
         * @generated
         */
        void setCollaborator(DynamicRobot value);

        /**
         * Returns the value of the '<em><b>Availability Range</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Availability Range</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Availability Range</em>' containment reference.
         * @see #setAvailabilityRange(MeasureValue)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getRobotCollaboration_AvailabilityRange()
         * @model containment="true"
         * @generated
         */
        MeasureValue getAvailabilityRange();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration#getAvailabilityRange <em>Availability Range</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Availability Range</em>' containment reference.
         * @see #getAvailabilityRange()
         * @generated
         */
        void setAvailabilityRange(MeasureValue value);

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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getRobotCollaboration_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

} // RobotCollaboration
