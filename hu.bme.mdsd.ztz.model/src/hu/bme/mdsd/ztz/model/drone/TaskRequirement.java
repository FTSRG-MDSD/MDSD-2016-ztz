/**
 */
package hu.bme.mdsd.ztz.model.drone;

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
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getTask <em>Task</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getParticipants <em>Participants</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getCapabilityProperties <em>Capability Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement()
 * @model
 * @generated
 */
public interface TaskRequirement extends EObject {
        /**
         * Returns the value of the '<em><b>Task</b></em>' container reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.Task#getRequirement <em>Requirement</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Task</em>' container reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Task</em>' container reference.
         * @see #setTask(Task)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement_Task()
         * @see hu.bme.mdsd.ztz.model.drone.Task#getRequirement
         * @model opposite="requirement" required="true" transient="false"
         * @generated
         */
        Task getTask();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getTask <em>Task</em>}' container reference.
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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement_Prerequisite()
         * @model
         * @generated
         */
        Task getPrerequisite();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getPrerequisite <em>Prerequisite</em>}' reference.
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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement_Participants()
         * @model required="true"
         * @generated
         */
        int getParticipants();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.TaskRequirement#getParticipants <em>Participants</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Participants</em>' attribute.
         * @see #getParticipants()
         * @generated
         */
        void setParticipants(int value);

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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Required Capabilities</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Capability}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Required Capabilities</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Required Capabilities</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement_RequiredCapabilities()
         * @model
         * @generated
         */
        EList<Capability> getRequiredCapabilities();

        /**
         * Returns the value of the '<em><b>Capability Properties</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capability Properties</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Capability Properties</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement_CapabilityProperties()
         * @model containment="true"
         * @generated
         */
        EList<CapabilityProperties> getCapabilityProperties();

        /**
         * Returns the value of the '<em><b>Descriptor</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Descriptor</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Descriptor</em>' reference.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getTaskRequirement_Descriptor()
         * @model transient="true" changeable="false" volatile="true" derived="true"
         * @generated
         */
        TaskDescriptor getDescriptor();

} // TaskRequirement
