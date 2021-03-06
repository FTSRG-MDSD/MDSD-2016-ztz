/**
 */
package hu.bme.mdsd.ztz.model.drone;

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
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTargets <em>Targets</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskDescriptor()
 * @model
 * @generated
 */
public interface TaskDescriptor extends EObject {
        /**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.AreaObject}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Targets</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskDescriptor_Targets()
	 * @model
	 * @generated
	 */
        EList<AreaObject> getTargets();

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
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskDescriptor_Properties()
	 * @model containment="true"
	 * @generated
	 */
        EList<Property> getProperties();

        /**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.Task#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Task</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskDescriptor_Task()
	 * @see hu.bme.mdsd.ztz.model.drone.Task#getDescriptor
	 * @model opposite="descriptor" transient="false"
	 * @generated
	 */
        Task getTask();

        /**
	 * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
        void setTask(Task value);

} // TaskDescriptor
