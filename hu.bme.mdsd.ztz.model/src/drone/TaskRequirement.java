/**
 */
package drone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link drone.TaskRequirement#getTask <em>Task</em>}</li>
 *   <li>{@link drone.TaskRequirement#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link drone.TaskRequirement#getParticipants <em>Participants</em>}</li>
 *   <li>{@link drone.TaskRequirement#getProperties <em>Properties</em>}</li>
 *   <li>{@link drone.TaskRequirement#getRequiredCapability <em>Required Capability</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getTaskRequirement()
 * @model
 * @generated
 */
public interface TaskRequirement extends EObject {
        /**
         * Returns the value of the '<em><b>Task</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link drone.Task#getRequirement <em>Requirement</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Task</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Task</em>' container reference.
         * @see #setTask(Task)
         * @see drone.DronePackage#getTaskRequirement_Task()
         * @see drone.Task#getRequirement
         * @model opposite="requirement" required="true" transient="false"
         * @generated
         */
        Task getTask();

        /**
         * Sets the value of the '{@link drone.TaskRequirement#getTask <em>Task</em>}' container reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Task</em>' container reference.
         * @see #getTask()
         * @generated
         */
        void setTask(Task value);

        /**
         * Returns the value of the '<em><b>Prerequisite</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Prerequisite</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Prerequisite</em>' reference.
         * @see #setPrerequisite(Task)
         * @see drone.DronePackage#getTaskRequirement_Prerequisite()
         * @model
         * @generated
         */
        Task getPrerequisite();

        /**
         * Sets the value of the '{@link drone.TaskRequirement#getPrerequisite <em>Prerequisite</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Prerequisite</em>' reference.
         * @see #getPrerequisite()
         * @generated
         */
        void setPrerequisite(Task value);

        /**
         * Returns the value of the '<em><b>Participants</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Participants</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Participants</em>' attribute.
         * @see #setParticipants(int)
         * @see drone.DronePackage#getTaskRequirement_Participants()
         * @model required="true"
         * @generated
         */
        int getParticipants();

        /**
         * Sets the value of the '{@link drone.TaskRequirement#getParticipants <em>Participants</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Participants</em>' attribute.
         * @see #getParticipants()
         * @generated
         */
        void setParticipants(int value);

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
         * @see drone.DronePackage#getTaskRequirement_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Required Capability</b></em>' reference list.
         * The list contents are of type {@link drone.Capability}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Required Capability</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Required Capability</em>' reference list.
         * @see drone.DronePackage#getTaskRequirement_RequiredCapability()
         * @model
         * @generated
         */
        EList<Capability> getRequiredCapability();

} // TaskRequirement
