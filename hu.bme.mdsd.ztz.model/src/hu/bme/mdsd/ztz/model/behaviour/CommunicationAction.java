/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getCommunicationAction()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationAction extends Action {
        /**
         * Returns the value of the '<em><b>Message</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message</em>' reference.
         * @see #setMessage(Message)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getCommunicationAction_Message()
         * @model required="true"
         * @generated
         */
        Message getMessage();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getMessage <em>Message</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Message</em>' reference.
         * @see #getMessage()
         * @generated
         */
        void setMessage(Message value);

} // CommunicationAction
