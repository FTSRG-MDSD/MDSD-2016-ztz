/**
 */
package drone;

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
 *   <li>{@link drone.RobotMissionContainer#getMissions <em>Missions</em>}</li>
 *   <li>{@link drone.RobotMissionContainer#getRobots <em>Robots</em>}</li>
 *   <li>{@link drone.RobotMissionContainer#getMeasureDimensions <em>Measure Dimensions</em>}</li>
 *   <li>{@link drone.RobotMissionContainer#getAreaObjects <em>Area Objects</em>}</li>
 *   <li>{@link drone.RobotMissionContainer#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see drone.DronePackage#getRobotMissionContainer()
 * @model
 * @generated
 */
public interface RobotMissionContainer extends EObject {
        /**
         * Returns the value of the '<em><b>Missions</b></em>' containment reference list.
         * The list contents are of type {@link drone.Mission}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Missions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Missions</em>' containment reference list.
         * @see drone.DronePackage#getRobotMissionContainer_Missions()
         * @model containment="true"
         * @generated
         */
        EList<Mission> getMissions();

        /**
         * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
         * The list contents are of type {@link drone.Robot}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Robots</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Robots</em>' containment reference list.
         * @see drone.DronePackage#getRobotMissionContainer_Robots()
         * @model containment="true"
         * @generated
         */
        EList<Robot> getRobots();

        /**
         * Returns the value of the '<em><b>Measure Dimensions</b></em>' containment reference list.
         * The list contents are of type {@link drone.MeasureDimension}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Measure Dimensions</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Measure Dimensions</em>' containment reference list.
         * @see drone.DronePackage#getRobotMissionContainer_MeasureDimensions()
         * @model containment="true"
         * @generated
         */
        EList<MeasureDimension> getMeasureDimensions();

        /**
         * Returns the value of the '<em><b>Area Objects</b></em>' containment reference list.
         * The list contents are of type {@link drone.AreaObject}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Area Objects</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Area Objects</em>' containment reference list.
         * @see drone.DronePackage#getRobotMissionContainer_AreaObjects()
         * @model containment="true"
         * @generated
         */
        EList<AreaObject> getAreaObjects();

        /**
         * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
         * The list contents are of type {@link drone.Capability}.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Capabilities</em>' containment reference list.
         * @see drone.DronePackage#getRobotMissionContainer_Capabilities()
         * @model containment="true"
         * @generated
         */
        EList<Capability> getCapabilities();

} // RobotMissionContainer
