/**
 */
package hu.bme.mdsd.ztz.model.behaviourModel;

import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviourModel.Message#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviourModel.Message#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
        /**
         * Returns the value of the '<em><b>Properties</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Property}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Properties</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Properties</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelPackage#getMessage_Properties()
         * @model
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Tasks</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Task}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Tasks</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelPackage#getMessage_Tasks()
         * @model
         * @generated
         */
        EList<Task> getTasks();

} // Message