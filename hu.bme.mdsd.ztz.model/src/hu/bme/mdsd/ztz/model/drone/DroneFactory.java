/**
 */
package hu.bme.mdsd.ztz.model.drone;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage
 * @generated
 */
public interface DroneFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        DroneFactory eINSTANCE = hu.bme.mdsd.ztz.model.drone.impl.DroneFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Mission</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Mission</em>'.
         * @generated
         */
        Mission createMission();

        /**
         * Returns a new object of class '<em>Task</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Task</em>'.
         * @generated
         */
        Task createTask();

        /**
         * Returns a new object of class '<em>Task Descriptor</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Task Descriptor</em>'.
         * @generated
         */
        TaskDescriptor createTaskDescriptor();

        /**
         * Returns a new object of class '<em>Position</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Position</em>'.
         * @generated
         */
        Position createPosition();

        /**
         * Returns a new object of class '<em>Area Object</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Area Object</em>'.
         * @generated
         */
        AreaObject createAreaObject();

        /**
         * Returns a new object of class '<em>Coordinate</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Coordinate</em>'.
         * @generated
         */
        Coordinate createCoordinate();

        /**
         * Returns a new object of class '<em>Property</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Property</em>'.
         * @generated
         */
        Property createProperty();

        /**
         * Returns a new object of class '<em>Robot</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Robot</em>'.
         * @generated
         */
        Robot createRobot();

        /**
         * Returns a new object of class '<em>String Property</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>String Property</em>'.
         * @generated
         */
        StringProperty createStringProperty();

        /**
         * Returns a new object of class '<em>Task Requirement</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Task Requirement</em>'.
         * @generated
         */
        TaskRequirement createTaskRequirement();

        /**
         * Returns a new object of class '<em>Size</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Size</em>'.
         * @generated
         */
        Size createSize();

        /**
         * Returns a new object of class '<em>Battery</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Battery</em>'.
         * @generated
         */
        Battery createBattery();

        /**
         * Returns a new object of class '<em>Equipment</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Equipment</em>'.
         * @generated
         */
        Equipment createEquipment();

        /**
         * Returns a new object of class '<em>Measure Value</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Measure Value</em>'.
         * @generated
         */
        MeasureValue createMeasureValue();

        /**
         * Returns a new object of class '<em>Measure Conversion</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Measure Conversion</em>'.
         * @generated
         */
        MeasureConversion createMeasureConversion();

        /**
         * Returns a new object of class '<em>Measure Dimension</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Measure Dimension</em>'.
         * @generated
         */
        MeasureDimension createMeasureDimension();

        /**
         * Returns a new object of class '<em>Measure Property</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Measure Property</em>'.
         * @generated
         */
        MeasureProperty createMeasureProperty();

        /**
         * Returns a new object of class '<em>Robot Mission Container</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Robot Mission Container</em>'.
         * @generated
         */
        RobotMissionContainer createRobotMissionContainer();

        /**
         * Returns a new object of class '<em>Capability</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Capability</em>'.
         * @generated
         */
        Capability createCapability();

        /**
         * Returns a new object of class '<em>Capability Properties</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Capability Properties</em>'.
         * @generated
         */
        CapabilityProperties createCapabilityProperties();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        DronePackage getDronePackage();

} //DroneFactory
