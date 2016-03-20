/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.Mission#getTasks <em>Tasks</em>}</li>
 *   <li>{@link drone.Mission#getEstimatedTime <em>Estimated Time</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends NamedElement {
        /**
         * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
         * The list contents are of type {@link drone.Task}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Tasks</em>' containment reference list.
         * @see drone.DronePackage#getMission_Tasks()
         * @model containment="true" required="true"
         * @generated
         */
        EList<Task> getTasks();

        /**
         * Returns the value of the '<em><b>Estimated Time</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Estimated Time</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Estimated Time</em>' containment reference.
         * @see #setEstimatedTime(MeasureValue)
         * @see drone.DronePackage#getMission_EstimatedTime()
         * @model containment="true"
         * @generated
         */
        MeasureValue getEstimatedTime();

        /**
         * Sets the value of the '{@link drone.Mission#getEstimatedTime <em>Estimated Time</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Estimated Time</em>' containment reference.
         * @see #getEstimatedTime()
         * @generated
         */
        void setEstimatedTime(MeasureValue value);

} // Mission
