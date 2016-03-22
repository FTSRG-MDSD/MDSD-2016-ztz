/**
 */
package hu.bme.mdsd.ztz.model.drone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Task#getMission <em>Mission</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Task#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement {
        /**
         * Returns the value of the '<em><b>Mission</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.Mission#getTasks <em>Tasks</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mission</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mission</em>' container reference.
         * @see #setMission(Mission)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTask_Mission()
         * @see hu.bme.mdsd.ztz.model.drone.Mission#getTasks
         * @model opposite="tasks" required="true" transient="false"
         * @generated
         */
        Mission getMission();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Task#getMission <em>Mission</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mission</em>' container reference.
         * @see #getMission()
         * @generated
         */
        void setMission(Mission value);

        /**
         * Returns the value of the '<em><b>Descriptor</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Descriptor</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Descriptor</em>' containment reference.
         * @see #setDescriptor(TaskDescriptor)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTask_Descriptor()
         * @see hu.bme.mdsd.ztz.model.drone.TaskDescriptor#getTask
         * @model opposite="task" containment="true" required="true"
         * @generated
         */
        TaskDescriptor getDescriptor();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Task#getDescriptor <em>Descriptor</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Descriptor</em>' containment reference.
         * @see #getDescriptor()
         * @generated
         */
        void setDescriptor(TaskDescriptor value);

} // Task
