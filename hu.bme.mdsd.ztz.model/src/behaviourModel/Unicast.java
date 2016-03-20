/**
 */
package behaviourModel;

import drone.Robot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unicast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviourModel.Unicast#getRobotToNotify <em>Robot To Notify</em>}</li>
 * </ul>
 *
 * @see behaviourModel.BehaviourModelPackage#getUnicast()
 * @model
 * @generated
 */
public interface Unicast extends CommunicationAction {
        /**
         * Returns the value of the '<em><b>Robot To Notify</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Robot To Notify</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Robot To Notify</em>' reference.
         * @see #setRobotToNotify(Robot)
         * @see behaviourModel.BehaviourModelPackage#getUnicast_RobotToNotify()
         * @model required="true"
         * @generated
         */
        Robot getRobotToNotify();

        /**
         * Sets the value of the '{@link behaviourModel.Unicast#getRobotToNotify <em>Robot To Notify</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Robot To Notify</em>' reference.
         * @see #getRobotToNotify()
         * @generated
         */
        void setRobotToNotify(Robot value);

} // Unicast
