/**
 */
package drone;

import behaviourModel.CommunicationAction;

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
 *   <li>{@link drone.Robot#getPosition <em>Position</em>}</li>
 *   <li>{@link drone.Robot#getSize <em>Size</em>}</li>
 *   <li>{@link drone.Robot#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link drone.Robot#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link drone.Robot#getDetectedObjects <em>Detected Objects</em>}</li>
 *   <li>{@link drone.Robot#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link drone.Robot#getTasks <em>Tasks</em>}</li>
 *   <li>{@link drone.Robot#getProperties <em>Properties</em>}</li>
 *   <li>{@link drone.Robot#getCommunicationRange <em>Communication Range</em>}</li>
 *   <li>{@link drone.Robot#getWeight <em>Weight</em>}</li>
 *   <li>{@link drone.Robot#getMission <em>Mission</em>}</li>
 *   <li>{@link drone.Robot#getActions <em>Actions</em>}</li>
 *   <li>{@link drone.Robot#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link drone.Robot#getCommunicationAction <em>Communication Action</em>}</li>
 *   <li>{@link drone.Robot#getCapabilityProperties <em>Capability Properties</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getRobot()
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
         * @see drone.DronePackage#getRobot_Position()
         * @model containment="true" required="true"
         * @generated
         */
        Position getPosition();

        /**
         * Sets the value of the '{@link drone.Robot#getPosition <em>Position</em>}' containment reference.
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
         * @see drone.DronePackage#getRobot_Size()
         * @model containment="true" required="true"
         * @generated
         */
        Size getSize();

        /**
         * Sets the value of the '{@link drone.Robot#getSize <em>Size</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Size</em>' containment reference.
         * @see #getSize()
         * @generated
         */
        void setSize(Size value);

        /**
         * Returns the value of the '<em><b>Batteries</b></em>' containment reference list.
         * The list contents are of type {@link drone.Battery}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Batteries</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Batteries</em>' containment reference list.
         * @see drone.DronePackage#getRobot_Batteries()
         * @model containment="true"
         * @generated
         */
        EList<Battery> getBatteries();

        /**
         * Returns the value of the '<em><b>Collaborations</b></em>' containment reference list.
         * The list contents are of type {@link drone.RobotCollaboration}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Collaborations</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Collaborations</em>' containment reference list.
         * @see drone.DronePackage#getRobot_Collaborations()
         * @model containment="true"
         * @generated
         */
        EList<RobotCollaboration> getCollaborations();

        /**
         * Returns the value of the '<em><b>Detected Objects</b></em>' containment reference list.
         * The list contents are of type {@link drone.DetectedObject}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Detected Objects</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Detected Objects</em>' containment reference list.
         * @see drone.DronePackage#getRobot_DetectedObjects()
         * @model containment="true"
         * @generated
         */
        EList<DetectedObject> getDetectedObjects();

        /**
         * Returns the value of the '<em><b>Equipments</b></em>' containment reference list.
         * The list contents are of type {@link drone.Equipment}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Equipments</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Equipments</em>' containment reference list.
         * @see drone.DronePackage#getRobot_Equipments()
         * @model containment="true"
         * @generated
         */
        EList<Equipment> getEquipments();

        /**
         * Returns the value of the '<em><b>Tasks</b></em>' reference list.
         * The list contents are of type {@link drone.Task}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Tasks</em>' reference list.
         * @see drone.DronePackage#getRobot_Tasks()
         * @model
         * @generated
         */
        EList<Task> getTasks();

        /**
         * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
         * The list contents are of type {@link drone.Property}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Properties</em>' containment reference list.
         * @see drone.DronePackage#getRobot_Properties()
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
         * @see drone.DronePackage#getRobot_CommunicationRange()
         * @model containment="true"
         * @generated
         */
        MeasureValue getCommunicationRange();

        /**
         * Sets the value of the '{@link drone.Robot#getCommunicationRange <em>Communication Range</em>}' containment reference.
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
         * @see drone.DronePackage#getRobot_Weight()
         * @model containment="true"
         * @generated
         */
        MeasureValue getWeight();

        /**
         * Sets the value of the '{@link drone.Robot#getWeight <em>Weight</em>}' containment reference.
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
         * @see #setMission(Mission)
         * @see drone.DronePackage#getRobot_Mission()
         * @model
         * @generated
         */
        Mission getMission();

        /**
         * Sets the value of the '{@link drone.Robot#getMission <em>Mission</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Mission</em>' reference.
         * @see #getMission()
         * @generated
         */
        void setMission(Mission value);

        /**
         * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
         * The list contents are of type {@link drone.Action}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Actions</em>' containment reference list.
         * @see drone.DronePackage#getRobot_Actions()
         * @model containment="true"
         * @generated
         */
        EList<Action> getActions();

        /**
         * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
         * The list contents are of type {@link drone.Capability}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Capabilities</em>' reference list.
         * @see drone.DronePackage#getRobot_Capabilities()
         * @model
         * @generated
         */
        EList<Capability> getCapabilities();

        /**
         * Returns the value of the '<em><b>Communication Action</b></em>' reference list.
         * The list contents are of type {@link behaviourModel.CommunicationAction}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Communication Action</em>' reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Communication Action</em>' reference list.
         * @see drone.DronePackage#getRobot_CommunicationAction()
         * @model
         * @generated
         */
        EList<CommunicationAction> getCommunicationAction();

        /**
         * Returns the value of the '<em><b>Capability Properties</b></em>' containment reference list.
         * The list contents are of type {@link drone.CapabilityProperties}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capability Properties</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Capability Properties</em>' containment reference list.
         * @see drone.DronePackage#getRobot_CapabilityProperties()
         * @model containment="true"
         * @generated
         */
        EList<CapabilityProperties> getCapabilityProperties();

} // Robot
