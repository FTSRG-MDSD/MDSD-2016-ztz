/**
 */
package hu.bme.mdsd.ztz.model.behaviour;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unicast Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getUnicastCommunication()
 * @model
 * @generated
 */
public interface UnicastCommunication extends CommunicationAction {
        /**
         * Returns the value of the '<em><b>Target</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Target</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Target</em>' reference.
         * @see #setTarget(DynamicRobot)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getUnicastCommunication_Target()
         * @model required="true"
         * @generated
         */
        DynamicRobot getTarget();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication#getTarget <em>Target</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Target</em>' reference.
         * @see #getTarget()
         * @generated
         */
        void setTarget(DynamicRobot value);

} // UnicastCommunication
