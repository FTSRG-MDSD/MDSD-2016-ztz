/**
 */
package behaviourModel;

import drone.Robot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourModel.Multicast#getRobotsToNotify <em>Robots To Notify</em>}</li>
 * </ul>
 *
 * @see behaviourModel.BehaviourModelPackage#getMulticast()
 * @model
 * @generated
 */
public interface Multicast extends CommunicationAction {
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
         * @see behaviourModel.BehaviourModelPackage#getMulticast_RobotsToNotify()
         * @model
         * @generated
         */
        EList<Robot> getRobotsToNotify();

} // Multicast
