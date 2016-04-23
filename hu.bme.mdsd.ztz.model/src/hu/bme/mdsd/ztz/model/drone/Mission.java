/**
 */
package hu.bme.mdsd.ztz.model.drone;

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
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Mission#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends NamedElement {
        /**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Task}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.Task#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getMission_Tasks()
	 * @see hu.bme.mdsd.ztz.model.drone.Task#getMission
	 * @model opposite="mission" containment="true" required="true"
	 * @generated
	 */
        EList<Task> getTasks();

} // Mission
