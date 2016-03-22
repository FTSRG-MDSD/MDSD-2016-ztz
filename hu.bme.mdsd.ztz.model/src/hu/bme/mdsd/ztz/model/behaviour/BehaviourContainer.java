/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getCommunicationActions <em>Communication Actions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getMessageRepositories <em>Message Repositories</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getBehaviourContainer()
 * @model
 * @generated
 */
public interface BehaviourContainer extends EObject {
        /**
         * Returns the value of the '<em><b>Communication Actions</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.CommunicationAction}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Communication Actions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Communication Actions</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getBehaviourContainer_CommunicationActions()
         * @model containment="true"
         * @generated
         */
        EList<CommunicationAction> getCommunicationActions();

        /**
         * Returns the value of the '<em><b>Message Repositories</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.MessageRepository}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Message Repositories</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Message Repositories</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getBehaviourContainer_MessageRepositories()
         * @model containment="true"
         * @generated
         */
        EList<MessageRepository> getMessageRepositories();

} // BehaviourContainer
