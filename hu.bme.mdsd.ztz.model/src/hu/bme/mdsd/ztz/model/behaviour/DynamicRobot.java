/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.NamedElement;
import hu.bme.mdsd.ztz.model.drone.Robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getRobot <em>Robot</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getDetectedObjects <em>Detected Objects</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getMessageRepository <em>Message Repository</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getStatus <em>Status</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getActions <em>Actions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getExecutedTasks <em>Executed Tasks</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot()
 * @model
 * @generated
 */
public interface DynamicRobot extends NamedElement {
        /**
         * Returns the value of the '<em><b>Robot</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Robot</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Robot</em>' reference.
         * @see #setRobot(Robot)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot_Robot()
         * @model required="true"
         * @generated
         */
        Robot getRobot();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getRobot <em>Robot</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Robot</em>' reference.
         * @see #getRobot()
         * @generated
         */
        void setRobot(Robot value);

        /**
         * Returns the value of the '<em><b>Detected Objects</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.DetectedObject}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Detected Objects</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Detected Objects</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot_DetectedObjects()
         * @model containment="true"
         * @generated
         */
        EList<DetectedObject> getDetectedObjects();

        /**
         * Returns the value of the '<em><b>Collaborations</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Collaborations</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Collaborations</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot_Collaborations()
         * @model containment="true"
         * @generated
         */
        EList<RobotCollaboration> getCollaborations();

        /**
         * Returns the value of the '<em><b>Message Repository</b></em>' containment reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getRobot <em>Robot</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message Repository</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message Repository</em>' containment reference.
         * @see #setMessageRepository(MessageRepository)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot_MessageRepository()
         * @see hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getRobot
         * @model opposite="robot" containment="true"
         * @generated
         */
        MessageRepository getMessageRepository();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getMessageRepository <em>Message Repository</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Message Repository</em>' containment reference.
         * @see #getMessageRepository()
         * @generated
         */
        void setMessageRepository(MessageRepository value);

        /**
         * Returns the value of the '<em><b>Status</b></em>' attribute.
         * The literals are from the enumeration {@link hu.bme.mdsd.ztz.model.behaviour.RobotStatus}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Status</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Status</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotStatus
         * @see #setStatus(RobotStatus)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot_Status()
         * @model required="true"
         * @generated
         */
        RobotStatus getStatus();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot#getStatus <em>Status</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Status</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.behaviour.RobotStatus
         * @see #getStatus()
         * @generated
         */
        void setStatus(RobotStatus value);

        /**
         * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.Action}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Actions</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot_Actions()
         * @model containment="true"
         * @generated
         */
        EList<Action> getActions();

        /**
         * Returns the value of the '<em><b>Executed Tasks</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Executed Tasks</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Executed Tasks</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getDynamicRobot_ExecutedTasks()
         * @model
         * @generated
         */
        EList<TaskExecution> getExecutedTasks();

} // DynamicRobot
