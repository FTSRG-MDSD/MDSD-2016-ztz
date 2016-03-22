/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.NamedElement;
import hu.bme.mdsd.ztz.model.drone.Robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getRobot <em>Robot</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getReceivedMessages <em>Received Messages</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getSendedMessages <em>Sended Messages</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessageRepository()
 * @model
 * @generated
 */
public interface MessageRepository extends NamedElement {
        /**
         * Returns the value of the '<em><b>Robot</b></em>' reference.
         * It is bidirectional and its opposite is '{@link hu.bme.mdsd.ztz.model.drone.Robot#getMessageRepository <em>Message Repository</em>}'.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Robot</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Robot</em>' reference.
         * @see #setRobot(Robot)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessageRepository_Robot()
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getMessageRepository
         * @model opposite="messageRepository" required="true"
         * @generated
         */
        Robot getRobot();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository#getRobot <em>Robot</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Robot</em>' reference.
         * @see #getRobot()
         * @generated
         */
        void setRobot(Robot value);

        /**
         * Returns the value of the '<em><b>Received Messages</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.Message}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Received Messages</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Received Messages</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessageRepository_ReceivedMessages()
         * @model
         * @generated
         */
        EList<Message> getReceivedMessages();

        /**
         * Returns the value of the '<em><b>Sended Messages</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.Message}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Sended Messages</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Sended Messages</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessageRepository_SendedMessages()
         * @model
         * @generated
         */
        EList<Message> getSendedMessages();

} // MessageRepository
