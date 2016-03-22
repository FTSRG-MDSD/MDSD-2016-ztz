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
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Task#getExecution <em>Execution</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Task#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Task#getStatus <em>Status</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Task#getEstimatedTime <em>Estimated Time</em>}</li>
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

        /**
         * Returns the value of the '<em><b>Execution</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.TaskExecution#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Execution</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Execution</em>' containment reference.
         * @see #setExecution(TaskExecution)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTask_Execution()
         * @see hu.bme.mdsd.ztz.model.drone.TaskExecution#getTask
         * @model opposite="task" containment="true"
         * @generated
         */
        TaskExecution getExecution();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Task#getExecution <em>Execution</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Execution</em>' containment reference.
         * @see #getExecution()
         * @generated
         */
        void setExecution(TaskExecution value);

        /**
         * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getTask <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Requirement</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Requirement</em>' containment reference.
         * @see #setRequirement(TaskRequirement)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTask_Requirement()
         * @see hu.bme.mdsd.ztz.model.drone.TaskRequirement#getTask
         * @model opposite="task" containment="true" required="true"
         * @generated
         */
        TaskRequirement getRequirement();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Task#getRequirement <em>Requirement</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Requirement</em>' containment reference.
         * @see #getRequirement()
         * @generated
         */
        void setRequirement(TaskRequirement value);

        /**
         * Returns the value of the '<em><b>Status</b></em>' attribute.
         * The literals are from the enumeration {@link hu.bme.mdsd.ztz.model.drone.TaskStatus}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Status</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Status</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.drone.TaskStatus
         * @see #setStatus(TaskStatus)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTask_Status()
         * @model
         * @generated
         */
        TaskStatus getStatus();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Task#getStatus <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Status</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.drone.TaskStatus
         * @see #getStatus()
         * @generated
         */
        void setStatus(TaskStatus value);

        /**
         * Returns the value of the '<em><b>Estimated Time</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Estimated Time</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Estimated Time</em>' reference.
         * @see #isSetEstimatedTime()
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTask_EstimatedTime()
         * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
         *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mdsd.ztz.model.derived.estimatedTime'"
         * @generated
         */
        MeasureValue getEstimatedTime();

        /**
         * Returns whether the value of the '{@link hu.bme.mdsd.ztz.model.drone.Task#getEstimatedTime <em>Estimated Time</em>}' reference is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Estimated Time</em>' reference is set.
         * @see #getEstimatedTime()
         * @generated
         */
        boolean isSetEstimatedTime();

} // Task
