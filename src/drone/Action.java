/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.Action#getProperties <em>Properties</em>}</li>
 *   <li>{@link drone.Action#getCurrentTask <em>Current Task</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
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
         * @see drone.DronePackage#getAction_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Current Task</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Current Task</em>' reference.
         * @see #setCurrentTask(Task)
         * @see drone.DronePackage#getAction_CurrentTask()
         * @model
         * @generated
         */
        Task getCurrentTask();

        /**
         * Sets the value of the '{@link drone.Action#getCurrentTask <em>Current Task</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Current Task</em>' reference.
         * @see #getCurrentTask()
         * @generated
         */
        void setCurrentTask(Task value);

} // Action
