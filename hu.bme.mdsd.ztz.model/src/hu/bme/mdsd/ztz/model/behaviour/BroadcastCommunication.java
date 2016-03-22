/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.Robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getBroadcastCommunication()
 * @model
 * @generated
 */
public interface BroadcastCommunication extends CommunicationAction {
        /**
         * Returns the value of the '<em><b>Targets</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Robot}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Targets</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Targets</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getBroadcastCommunication_Targets()
         * @model required="true"
         * @generated
         */
        EList<Robot> getTargets();

} // BroadcastCommunication
