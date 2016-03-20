/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.TaskExecution#getExecutors <em>Executors</em>}</li>
 *   <li>{@link drone.TaskExecution#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link drone.TaskExecution#getStatus <em>Status</em>}</li>
 *   <li>{@link drone.TaskExecution#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getTaskExecution()
 * @model
 * @generated
 */
public interface TaskExecution extends EObject {
        /**
         * Returns the value of the '<em><b>Executors</b></em>' reference list.
         * The list contents are of type {@link drone.Robot}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Executors</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Executors</em>' reference list.
         * @see drone.DronePackage#getTaskExecution_Executors()
         * @model required="true"
         * @generated
         */
        EList<Robot> getExecutors();

        /**
         * Returns the value of the '<em><b>Execution Time</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Execution Time</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Execution Time</em>' containment reference.
         * @see #setExecutionTime(MeasureValue)
         * @see drone.DronePackage#getTaskExecution_ExecutionTime()
         * @model containment="true"
         * @generated
         */
        MeasureValue getExecutionTime();

        /**
         * Sets the value of the '{@link drone.TaskExecution#getExecutionTime <em>Execution Time</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Execution Time</em>' containment reference.
         * @see #getExecutionTime()
         * @generated
         */
        void setExecutionTime(MeasureValue value);

        /**
         * Returns the value of the '<em><b>Status</b></em>' attribute.
         * The literals are from the enumeration {@link drone.TaskExecutionStatus}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Status</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Status</em>' attribute.
         * @see drone.TaskExecutionStatus
         * @see #setStatus(TaskExecutionStatus)
         * @see drone.DronePackage#getTaskExecution_Status()
         * @model unique="false" required="true"
         * @generated
         */
        TaskExecutionStatus getStatus();

        /**
         * Sets the value of the '{@link drone.TaskExecution#getStatus <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Status</em>' attribute.
         * @see drone.TaskExecutionStatus
         * @see #getStatus()
         * @generated
         */
        void setStatus(TaskExecutionStatus value);

        /**
         * Returns the value of the '<em><b>Task</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link drone.Task#getExecution <em>Execution</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Task</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Task</em>' container reference.
         * @see #setTask(Task)
         * @see drone.DronePackage#getTaskExecution_Task()
         * @see drone.Task#getExecution
         * @model opposite="execution" transient="false"
         * @generated
         */
        Task getTask();

        /**
         * Sets the value of the '{@link drone.TaskExecution#getTask <em>Task</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Task</em>' container reference.
         * @see #getTask()
         * @generated
         */
        void setTask(Task value);

} // TaskExecution
