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
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer#getDynamicRobots <em>Dynamic Robots</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getBehaviourContainer()
 * @model
 * @generated
 */
public interface BehaviourContainer extends EObject {
        /**
         * Returns the value of the '<em><b>Dynamic Robots</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Dynamic Robots</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Dynamic Robots</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getBehaviourContainer_DynamicRobots()
         * @model
         * @generated
         */
        EList<DynamicRobot> getDynamicRobots();

} // BehaviourContainer
