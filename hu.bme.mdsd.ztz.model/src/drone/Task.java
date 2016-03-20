/**
 */
package drone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.Task#getMission <em>Mission</em>}</li>
 *   <li>{@link drone.Task#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link drone.Task#getExecution <em>Execution</em>}</li>
 *   <li>{@link drone.Task#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link drone.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link drone.Task#getEstimatedTime <em>Estimated Time</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement {
        /**
         * Returns the value of the '<em><b>Mission</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link drone.Mission#getTasks <em>Tasks</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mission</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mission</em>' container reference.
         * @see #setMission(Mission)
         * @see drone.DronePackage#getTask_Mission()
         * @see drone.Mission#getTasks
         * @model opposite="tasks" required="true" transient="false"
         * @generated
         */
        Mission getMission();

        /**
         * Sets the value of the '{@link drone.Task#getMission <em>Mission</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mission</em>' container reference.
         * @see #getMission()
         * @generated
         */
        void setMission(Mission value);

        /**
         * Returns the value of the '<em><b>Descriptor</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link drone.TaskDescriptor#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Descriptor</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Descriptor</em>' containment reference.
         * @see #setDescriptor(TaskDescriptor)
         * @see drone.DronePackage#getTask_Descriptor()
         * @see drone.TaskDescriptor#getTask
         * @model opposite="task" containment="true" required="true"
         * @generated
         */
        TaskDescriptor getDescriptor();

        /**
         * Sets the value of the '{@link drone.Task#getDescriptor <em>Descriptor</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Descriptor</em>' containment reference.
         * @see #getDescriptor()
         * @generated
         */
        void setDescriptor(TaskDescriptor value);

        /**
         * Returns the value of the '<em><b>Execution</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link drone.TaskExecution#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Execution</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Execution</em>' containment reference.
         * @see #setExecution(TaskExecution)
         * @see drone.DronePackage#getTask_Execution()
         * @see drone.TaskExecution#getTask
         * @model opposite="task" containment="true"
         * @generated
         */
        TaskExecution getExecution();

        /**
         * Sets the value of the '{@link drone.Task#getExecution <em>Execution</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Execution</em>' containment reference.
         * @see #getExecution()
         * @generated
         */
        void setExecution(TaskExecution value);

        /**
         * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link drone.TaskRequirement#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Requirement</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Requirement</em>' containment reference.
         * @see #setRequirement(TaskRequirement)
         * @see drone.DronePackage#getTask_Requirement()
         * @see drone.TaskRequirement#getTask
         * @model opposite="task" containment="true" required="true"
         * @generated
         */
        TaskRequirement getRequirement();

        /**
         * Sets the value of the '{@link drone.Task#getRequirement <em>Requirement</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Requirement</em>' containment reference.
         * @see #getRequirement()
         * @generated
         */
        void setRequirement(TaskRequirement value);

        /**
         * Returns the value of the '<em><b>Status</b></em>' attribute.
         * The literals are from the enumeration {@link drone.TaskStatus}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Status</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Status</em>' attribute.
         * @see drone.TaskStatus
         * @see #setStatus(TaskStatus)
         * @see drone.DronePackage#getTask_Status()
         * @model
         * @generated
         */
        TaskStatus getStatus();

        /**
         * Sets the value of the '{@link drone.Task#getStatus <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Status</em>' attribute.
         * @see drone.TaskStatus
         * @see #getStatus()
         * @generated
         */
        void setStatus(TaskStatus value);

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
         * @see drone.DronePackage#getTask_EstimatedTime()
         * @model containment="true"
         * @generated
         */
        MeasureValue getEstimatedTime();

        /**
         * Sets the value of the '{@link drone.Task#getEstimatedTime <em>Estimated Time</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Estimated Time</em>' containment reference.
         * @see #getEstimatedTime()
         * @generated
         */
        void setEstimatedTime(MeasureValue value);

} // Task
