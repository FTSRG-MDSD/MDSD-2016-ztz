/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.NamedElement;
import hu.bme.mdsd.ztz.model.drone.Property;

import hu.bme.mdsd.ztz.model.drone.Task;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Action#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Action#getCurrentTaskExecution <em>Current Task Execution</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Action#getCurrentTask <em>Current Task</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NamedElement {
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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getAction_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Current Task Execution</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Current Task Execution</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Current Task Execution</em>' reference.
         * @see #setCurrentTaskExecution(TaskExecution)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getAction_CurrentTaskExecution()
         * @model
         * @generated
         */
        TaskExecution getCurrentTaskExecution();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.Action#getCurrentTaskExecution <em>Current Task Execution</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Current Task Execution</em>' reference.
         * @see #getCurrentTaskExecution()
         * @generated
         */
        void setCurrentTaskExecution(TaskExecution value);

        /**
         * Returns the value of the '<em><b>Current Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Current Task</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Current Task</em>' reference.
         * @see #isSetCurrentTask()
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getAction_CurrentTask()
         * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
         *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mdsd.ztz.model.derived.currentTask'"
         * @generated
         */
        Task getCurrentTask();

        /**
         * Returns whether the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.Action#getCurrentTask <em>Current Task</em>}' reference is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Current Task</em>' reference is set.
         * @see #getCurrentTask()
         * @generated
         */
        boolean isSetCurrentTask();

} // Action
