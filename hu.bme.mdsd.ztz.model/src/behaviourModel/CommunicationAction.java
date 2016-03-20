/**
 */
package behaviourModel;

import drone.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourModel.CommunicationAction#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see behaviourModel.BehaviourModelPackage#getCommunicationAction()
 * @model
 * @generated
 */
public interface CommunicationAction extends Action {
        /**
         * Returns the value of the '<em><b>Messages</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Messages</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Messages</em>' containment reference.
         * @see #setMessages(Message)
         * @see behaviourModel.BehaviourModelPackage#getCommunicationAction_Messages()
         * @model containment="true" required="true"
         * @generated
         */
        Message getMessages();

        /**
         * Sets the value of the '{@link behaviourModel.CommunicationAction#getMessages <em>Messages</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Messages</em>' containment reference.
         * @see #getMessages()
         * @generated
         */
        void setMessages(Message value);

} // CommunicationAction
