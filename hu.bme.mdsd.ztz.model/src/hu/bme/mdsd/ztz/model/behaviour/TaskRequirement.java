/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.NamedElement;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getTaskExecution <em>Task Execution</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getParticipants <em>Participants</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getCapabilityProperties <em>Capability Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement()
 * @model
 * @generated
 */
public interface TaskRequirement extends NamedElement {
        /**
         * Returns the value of the '<em><b>Task Execution</b></em>' reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getRequirement <em>Requirement</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Task Execution</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Task Execution</em>' reference.
         * @see #setTaskExecution(TaskExecution)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_TaskExecution()
         * @see hu.bme.mdsd.ztz.model.behaviour.TaskExecution#getRequirement
         * @model opposite="requirement" required="true"
         * @generated
         */
        TaskExecution getTaskExecution();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getTaskExecution <em>Task Execution</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Task Execution</em>' reference.
         * @see #getTaskExecution()
         * @generated
         */
        void setTaskExecution(TaskExecution value);

        /**
         * Returns the value of the '<em><b>Task</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Task</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Task</em>' reference.
         * @see #isSetTask()
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_Task()
         * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
         *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mdsd.ztz.model.derived.task'"
         * @generated
         */
        Task getTask();

        /**
         * Returns whether the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getTask <em>Task</em>}' reference is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Task</em>' reference is set.
         * @see #getTask()
         * @generated
         */
        boolean isSetTask();

        /**
         * Returns the value of the '<em><b>Prerequisite</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Prerequisite</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Prerequisite</em>' reference.
         * @see #setPrerequisite(TaskExecution)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_Prerequisite()
         * @model
         * @generated
         */
        TaskExecution getPrerequisite();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getPrerequisite <em>Prerequisite</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Prerequisite</em>' reference.
         * @see #getPrerequisite()
         * @generated
         */
        void setPrerequisite(TaskExecution value);

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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_Participants()
         * @model required="true"
         * @generated
         */
        int getParticipants();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement#getParticipants <em>Participants</em>}' attribute.
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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_Properties()
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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_RequiredCapabilities()
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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_CapabilityProperties()
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
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getTaskRequirement_Descriptor()
         * @model transient="true" changeable="false" volatile="true" derived="true"
         *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mdsd.ztz.model.derived.descriptor'"
         * @generated
         */
        TaskDescriptor getDescriptor();

} // TaskRequirement
