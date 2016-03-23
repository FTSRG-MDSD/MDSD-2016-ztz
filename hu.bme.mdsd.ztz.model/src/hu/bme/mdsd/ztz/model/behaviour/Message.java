/**
 */
package hu.bme.mdsd.ztz.model.behaviour;

import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.NamedElement;
import hu.bme.mdsd.ztz.model.drone.Property;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Message#getInvolvedTaskExecutions <em>Involved Task Executions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Message#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Message#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Message#getReferredObjects <em>Referred Objects</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Message#isNeedResponse <em>Need Response</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.Message#getTTL <em>TTL</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends NamedElement {
        /**
         * Returns the value of the '<em><b>Involved Task Executions</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.behaviour.TaskExecution}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Involved Task Executions</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Involved Task Executions</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessage_InvolvedTaskExecutions()
         * @model
         * @generated
         */
        EList<TaskExecution> getInvolvedTaskExecutions();

        /**
         * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Timestamp</em>' attribute.
         * @see #setTimestamp(Date)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessage_Timestamp()
         * @model required="true"
         * @generated
         */
        Date getTimestamp();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.Message#getTimestamp <em>Timestamp</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Timestamp</em>' attribute.
         * @see #getTimestamp()
         * @generated
         */
        void setTimestamp(Date value);

        /**
         * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Property}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Properties</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessage_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Referred Objects</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.AreaObject}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Referred Objects</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Referred Objects</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessage_ReferredObjects()
         * @model
         * @generated
         */
        EList<AreaObject> getReferredObjects();

        /**
         * Returns the value of the '<em><b>Need Response</b></em>' attribute.
         * The default value is <code>"false"</code>.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Need Response</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Need Response</em>' attribute.
         * @see #setNeedResponse(boolean)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessage_NeedResponse()
         * @model default="false" required="true"
         * @generated
         */
        boolean isNeedResponse();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.Message#isNeedResponse <em>Need Response</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Need Response</em>' attribute.
         * @see #isNeedResponse()
         * @generated
         */
        void setNeedResponse(boolean value);

        /**
         * Returns the value of the '<em><b>TTL</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>TTL</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>TTL</em>' containment reference.
         * @see #setTTL(MeasureValue)
         * @see hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage#getMessage_TTL()
         * @model containment="true"
         * @generated
         */
        MeasureValue getTTL();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.behaviour.Message#getTTL <em>TTL</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>TTL</em>' containment reference.
         * @see #getTTL()
         * @generated
         */
        void setTTL(MeasureValue value);

} // Message
