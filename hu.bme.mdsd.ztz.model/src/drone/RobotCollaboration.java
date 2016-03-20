/**
 */
package drone;

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
 *   <li>{@link drone.RobotCollaboration#getCollaborator <em>Collaborator</em>}</li>
 *   <li>{@link drone.RobotCollaboration#getAvailabilityRange <em>Availability Range</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getRobotCollaboration()
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
         * @see #setCollaborator(Robot)
         * @see drone.DronePackage#getRobotCollaboration_Collaborator()
         * @model required="true"
         * @generated
         */
        Robot getCollaborator();

        /**
         * Sets the value of the '{@link drone.RobotCollaboration#getCollaborator <em>Collaborator</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Collaborator</em>' reference.
         * @see #getCollaborator()
         * @generated
         */
        void setCollaborator(Robot value);

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
         * @see drone.DronePackage#getRobotCollaboration_AvailabilityRange()
         * @model containment="true"
         * @generated
         */
        MeasureValue getAvailabilityRange();

        /**
         * Sets the value of the '{@link drone.RobotCollaboration#getAvailabilityRange <em>Availability Range</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Availability Range</em>' containment reference.
         * @see #getAvailabilityRange()
         * @generated
         */
        void setAvailabilityRange(MeasureValue value);

} // RobotCollaboration
