/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getTasks <em>Tasks</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getCommunicationRange <em>Communication Range</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getWeight <em>Weight</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getMission <em>Mission</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getCapabilityProperties <em>Capability Properties</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends NamedElement {
        /**
         * Returns the value of the '<em><b>Position</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Position</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Position</em>' containment reference.
         * @see #setPosition(Position)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Position()
         * @model containment="true" required="true"
         * @generated
         */
        Position getPosition();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Robot#getPosition <em>Position</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Position</em>' containment reference.
         * @see #getPosition()
         * @generated
         */
        void setPosition(Position value);

        /**
         * Returns the value of the '<em><b>Size</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Size</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Size</em>' containment reference.
         * @see #setSize(Size)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Size()
         * @model containment="true" required="true"
         * @generated
         */
        Size getSize();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Robot#getSize <em>Size</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Size</em>' containment reference.
         * @see #getSize()
         * @generated
         */
        void setSize(Size value);

        /**
         * Returns the value of the '<em><b>Batteries</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Battery}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Batteries</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Batteries</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Batteries()
         * @model containment="true"
         * @generated
         */
        EList<Battery> getBatteries();

        /**
         * Returns the value of the '<em><b>Equipments</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Equipment}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Equipments</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Equipments</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Equipments()
         * @model containment="true"
         * @generated
         */
        EList<Equipment> getEquipments();

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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Tasks()
         * @model
         * @generated
         */
        EList<Task> getTasks();

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
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Properties()
         * @model containment="true"
         * @generated
         */
        EList<Property> getProperties();

        /**
         * Returns the value of the '<em><b>Communication Range</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Communication Range</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Communication Range</em>' containment reference.
         * @see #setCommunicationRange(MeasureValue)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_CommunicationRange()
         * @model containment="true"
         * @generated
         */
        MeasureValue getCommunicationRange();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Robot#getCommunicationRange <em>Communication Range</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Communication Range</em>' containment reference.
         * @see #getCommunicationRange()
         * @generated
         */
        void setCommunicationRange(MeasureValue value);

        /**
         * Returns the value of the '<em><b>Weight</b></em>' containment reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Weight</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Weight</em>' containment reference.
         * @see #setWeight(MeasureValue)
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Weight()
         * @model containment="true"
         * @generated
         */
        MeasureValue getWeight();

        /**
         * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.Robot#getWeight <em>Weight</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Weight</em>' containment reference.
         * @see #getWeight()
         * @generated
         */
        void setWeight(MeasureValue value);

        /**
         * Returns the value of the '<em><b>Mission</b></em>' reference.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Mission</em>' reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Mission</em>' reference.
         * @see #isSetMission()
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Mission()
         * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
         *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mdsd.ztz.model.derived.mission'"
         * @generated
         */
        Mission getMission();

        /**
         * Returns whether the value of the '{@link hu.bme.mdsd.ztz.model.drone.Robot#getMission <em>Mission</em>}' reference is set.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return whether the value of the '<em>Mission</em>' reference is set.
         * @see #getMission()
         * @generated
         */
        boolean isSetMission();

        /**
         * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Capability}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Capabilities</em>' reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_Capabilities()
         * @model
         * @generated
         */
        EList<Capability> getCapabilities();

        /**
         * Returns the value of the '<em><b>Capability Properties</b></em>' containment reference list.
         * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capability Properties</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Capability Properties</em>' containment reference list.
         * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobot_CapabilityProperties()
         * @model containment="true"
         * @generated
         */
        EList<CapabilityProperties> getCapabilityProperties();

} // Robot
