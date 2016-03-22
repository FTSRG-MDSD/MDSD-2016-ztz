/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.NamedElement;
import hu.bme.mdsd.ztz.model.drone.Task;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getExecutors <em>Executors</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getStatus <em>Status</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskExecution()
 * @model
 * @generated
 */
public interface TaskExecution extends NamedElement {
        /**
         * Returns the value of the '<em><b>Executors</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Executors</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Executors</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskExecution_Executors()
         * @model
         * @generated
         */
        EList<DynamicRobot> getExecutors();

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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskExecution_ExecutionTime()
         * @model containment="true"
         * @generated
         */
        MeasureValue getExecutionTime();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getExecutionTime <em>Execution Time</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Execution Time</em>' containment reference.
         * @see #getExecutionTime()
         * @generated
         */
        void setExecutionTime(MeasureValue value);

        /**
         * Returns the value of the '<em><b>Status</b></em>' attribute.
         * The literals are from the enumeration {@link hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Status</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Status</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus
         * @see #setStatus(TaskExecutionStatus)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskExecution_Status()
         * @model unique="false" required="true"
         * @generated
         */
        TaskExecutionStatus getStatus();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getStatus <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Status</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus
         * @see #getStatus()
         * @generated
         */
        void setStatus(TaskExecutionStatus value);

        /**
         * Returns the value of the '<em><b>Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Task</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Task</em>' reference.
         * @see #setTask(Task)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskExecution_Task()
         * @model required="true"
         * @generated
         */
        Task getTask();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getTask <em>Task</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Task</em>' reference.
         * @see #getTask()
         * @generated
         */
        void setTask(Task value);

} // TaskExecution
