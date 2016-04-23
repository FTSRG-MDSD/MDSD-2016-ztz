/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Mission Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getMissions <em>Missions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getRobots <em>Robots</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getMeasureDimensions <em>Measure Dimensions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getAreaObjects <em>Area Objects</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getPropertyKeyContainer <em>Property Key Container</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getTemporalElements <em>Temporal Elements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer()
 * @model
 * @generated
 */
public interface RobotMissionContainer extends EObject {
        /**
	 * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Mission}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Missions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer_Missions()
	 * @model containment="true"
	 * @generated
	 */
        EList<Mission> getMissions();

        /**
	 * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Robot}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Robots</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer_Robots()
	 * @model containment="true"
	 * @generated
	 */
        EList<Robot> getRobots();

        /**
	 * Returns the value of the '<em><b>Measure Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.MeasureDimension}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Measure Dimensions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Dimensions</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer_MeasureDimensions()
	 * @model containment="true"
	 * @generated
	 */
        EList<MeasureDimension> getMeasureDimensions();

        /**
	 * Returns the value of the '<em><b>Area Objects</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.AreaObject}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Area Objects</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Objects</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer_AreaObjects()
	 * @model containment="true"
	 * @generated
	 */
        EList<AreaObject> getAreaObjects();

        /**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mdsd.ztz.model.drone.Capability}.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
        EList<Capability> getCapabilities();

        /**
	 * Returns the value of the '<em><b>Property Key Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Property Key Container</em>' containment reference isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Key Container</em>' containment reference.
	 * @see #setPropertyKeyContainer(PropertyKeyContainer)
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer_PropertyKeyContainer()
	 * @model containment="true"
	 * @generated
	 */
        PropertyKeyContainer getPropertyKeyContainer();

        /**
	 * Sets the value of the '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer#getPropertyKeyContainer <em>Property Key Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Key Container</em>' containment reference.
	 * @see #getPropertyKeyContainer()
	 * @generated
	 */
        void setPropertyKeyContainer(PropertyKeyContainer value);

								/**
	 * Returns the value of the '<em><b>Temporal Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Elements</em>' containment reference list.
	 * @see hu.bme.mdsd.ztz.model.drone.DronePackage#getRobotMissionContainer_TemporalElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getTemporalElements();

} // RobotMissionContainer
