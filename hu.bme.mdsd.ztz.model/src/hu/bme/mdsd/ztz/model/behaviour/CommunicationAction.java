/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.Action;

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
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getCommunicationAction()
 * @model abstract="true"
 * @generated
 */
public interface CommunicationAction extends Action {
        /**
         * Returns the value of the '<em><b>Message</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message</em>' containment reference.
         * @see #setMessage(Message)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getCommunicationAction_Message()
         * @model containment="true" required="true"
         * @generated
         */
        Message getMessage();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getMessage <em>Message</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Message</em>' containment reference.
         * @see #getMessage()
         * @generated
         */
        void setMessage(Message value);

        /**
         * Returns the value of the '<em><b>Type</b></em>' attribute.
         * The literals are from the enumeration {@link hu.bme.mdsd.ztz.model.behaviour.CommunicationType}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Type</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Type</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
         * @see #setType(CommunicationType)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getCommunicationAction_Type()
         * @model
         * @generated
         */
        CommunicationType getType();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction#getType <em>Type</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Type</em>' attribute.
         * @see hu.bme.mdsd.ztz.model.behaviour.CommunicationType
         * @see #getType()
         * @generated
         */
        void setType(CommunicationType value);

} // CommunicationAction
