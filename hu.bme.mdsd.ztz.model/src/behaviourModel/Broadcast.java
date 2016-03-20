/**
 */
package behaviourModel;

import drone.Robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourModel.Broadcast#getRobotsToNotify <em>Robots To Notify</em>}</li>
 * </ul>
 *
 * @see behaviourModel.BehaviourModelPackage#getBroadcast()
 * @model
 * @generated
 */
public interface Broadcast extends CommunicationAction {
        /**
         * Returns the value of the '<em><b>Robots To Notify</b></em>' reference list.
         * The list contents are of type {@link drone.Robot}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Robots To Notify</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Robots To Notify</em>' reference list.
         * @see behaviourModel.BehaviourModelPackage#getBroadcast_RobotsToNotify()
         * @model
         * @generated
         */
        EList<Robot> getRobotsToNotify();

} // Broadcast
