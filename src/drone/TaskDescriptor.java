/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.TaskDescriptor#getTargets <em>Targets</em>}</li>
 *   <li>{@link drone.TaskDescriptor#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getTaskDescriptor()
 * @model
 * @generated
 */
public interface TaskDescriptor extends EObject {
        /**
         * Returns the value of the '<em><b>Targets</b></em>' reference list.
         * The list contents are of type {@link drone.AreaObject}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Targets</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Targets</em>' reference list.
         * @see drone.DronePackage#getTaskDescriptor_Targets()
         * @model
         * @generated
         */
        EList<AreaObject> getTargets();

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
         * @see drone.DronePackage#getTaskDescriptor_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

} // TaskDescriptor
