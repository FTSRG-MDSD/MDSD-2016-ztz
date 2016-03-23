/**
 */
package hu.bme.mdsd.ztz.model.drone.util;

import hu.bme.mdsd.ztz.model.drone.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage
 * @generated
 */
public class DroneAdapterFactory extends AdapterFactoryImpl {
        /**
         * The cached model package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static DronePackage modelPackage;

        /**
         * Creates an instance of the adapter factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DroneAdapterFactory() {
                if (modelPackage == null) {
                        modelPackage = DronePackage.eINSTANCE;
                }
        }

        /**
         * Returns whether this factory is applicable for the type of the object.
         * <!-- begin-user-doc -->
         * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
         * <!-- end-user-doc -->
         * @return whether this factory is applicable for the type of the object.
         * @generated
         */
        @Override
        public boolean isFactoryForType(Object object) {
                if (object == modelPackage) {
                        return true;
                }
                if (object instanceof EObject) {
                        return ((EObject)object).eClass().getEPackage() == modelPackage;
                }
                return false;
        }

        /**
         * The switch that delegates to the <code>createXXX</code> methods.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DroneSwitch<Adapter> modelSwitch =
                new DroneSwitch<Adapter>() {
                        @Override
                        public Adapter caseMission(Mission object) {
                                return createMissionAdapter();
                        }
                        @Override
                        public Adapter caseTask(Task object) {
                                return createTaskAdapter();
                        }
                        @Override
                        public Adapter caseTaskDescriptor(TaskDescriptor object) {
                                return createTaskDescriptorAdapter();
                        }
                        @Override
                        public Adapter casePosition(Position object) {
                                return createPositionAdapter();
                        }
                        @Override
                        public Adapter caseAreaObject(AreaObject object) {
                                return createAreaObjectAdapter();
                        }
                        @Override
                        public Adapter caseCoordinate(Coordinate object) {
                                return createCoordinateAdapter();
                        }
                        @Override
                        public Adapter caseProperty(Property object) {
                                return createPropertyAdapter();
                        }
                        @Override
                        public Adapter caseRobot(Robot object) {
                                return createRobotAdapter();
                        }
                        @Override
                        public Adapter caseStringValue(StringValue object) {
                                return createStringValueAdapter();
                        }
                        @Override
                        public Adapter caseSize(Size object) {
                                return createSizeAdapter();
                        }
                        @Override
                        public Adapter caseBattery(Battery object) {
                                return createBatteryAdapter();
                        }
                        @Override
                        public Adapter caseNamedElement(NamedElement object) {
                                return createNamedElementAdapter();
                        }
                        @Override
                        public Adapter caseEquipment(Equipment object) {
                                return createEquipmentAdapter();
                        }
                        @Override
                        public Adapter caseMeasureValue(MeasureValue object) {
                                return createMeasureValueAdapter();
                        }
                        @Override
                        public Adapter caseMeasureConversion(MeasureConversion object) {
                                return createMeasureConversionAdapter();
                        }
                        @Override
                        public Adapter caseMeasureDimension(MeasureDimension object) {
                                return createMeasureDimensionAdapter();
                        }
                        @Override
                        public Adapter casePropertyValue(PropertyValue object) {
                                return createPropertyValueAdapter();
                        }
                        @Override
                        public Adapter caseRobotMissionContainer(RobotMissionContainer object) {
                                return createRobotMissionContainerAdapter();
                        }
                        @Override
                        public Adapter casePropertyKeyContainer(PropertyKeyContainer object) {
                                return createPropertyKeyContainerAdapter();
                        }
                        @Override
                        public Adapter casePropertyKey(PropertyKey object) {
                                return createPropertyKeyAdapter();
                        }
                        @Override
                        public Adapter caseCapability(Capability object) {
                                return createCapabilityAdapter();
                        }
                        @Override
                        public Adapter caseCapabilityProperties(CapabilityProperties object) {
                                return createCapabilityPropertiesAdapter();
                        }
                        @Override
                        public Adapter defaultCase(EObject object) {
                                return createEObjectAdapter();
                        }
                };

        /**
         * Creates an adapter for the <code>target</code>.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param target the object to adapt.
         * @return the adapter for the <code>target</code>.
         * @generated
         */
        @Override
        public Adapter createAdapter(Notifier target) {
                return modelSwitch.doSwitch((EObject)target);
        }


        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Mission <em>Mission</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Mission
         * @generated
         */
        public Adapter createMissionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Task <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Task
         * @generated
         */
        public Adapter createTaskAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.TaskDescriptor <em>Task Descriptor</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.TaskDescriptor
         * @generated
         */
        public Adapter createTaskDescriptorAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Position <em>Position</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Position
         * @generated
         */
        public Adapter createPositionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.AreaObject <em>Area Object</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.AreaObject
         * @generated
         */
        public Adapter createAreaObjectAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Coordinate <em>Coordinate</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Coordinate
         * @generated
         */
        public Adapter createCoordinateAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Property <em>Property</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Property
         * @generated
         */
        public Adapter createPropertyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Robot <em>Robot</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Robot
         * @generated
         */
        public Adapter createRobotAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.StringValue <em>String Value</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.StringValue
         * @generated
         */
        public Adapter createStringValueAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Size <em>Size</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Size
         * @generated
         */
        public Adapter createSizeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Battery <em>Battery</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Battery
         * @generated
         */
        public Adapter createBatteryAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.NamedElement <em>Named Element</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.NamedElement
         * @generated
         */
        public Adapter createNamedElementAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Equipment <em>Equipment</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Equipment
         * @generated
         */
        public Adapter createEquipmentAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.MeasureValue <em>Measure Value</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureValue
         * @generated
         */
        public Adapter createMeasureValueAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.MeasureConversion <em>Measure Conversion</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureConversion
         * @generated
         */
        public Adapter createMeasureConversionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.MeasureDimension <em>Measure Dimension</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.MeasureDimension
         * @generated
         */
        public Adapter createMeasureDimensionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.PropertyValue <em>Property Value</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.PropertyValue
         * @generated
         */
        public Adapter createPropertyValueAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer <em>Robot Mission Container</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.RobotMissionContainer
         * @generated
         */
        public Adapter createRobotMissionContainerAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.PropertyKeyContainer <em>Property Key Container</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.PropertyKeyContainer
         * @generated
         */
        public Adapter createPropertyKeyContainerAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.PropertyKey <em>Property Key</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.PropertyKey
         * @generated
         */
        public Adapter createPropertyKeyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.Capability <em>Capability</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.Capability
         * @generated
         */
        public Adapter createCapabilityAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link hu.bme.mdsd.ztz.model.drone.CapabilityProperties <em>Capability Properties</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see hu.bme.mdsd.ztz.model.drone.CapabilityProperties
         * @generated
         */
        public Adapter createCapabilityPropertiesAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for the default case.
         * <!-- begin-user-doc -->
         * This default implementation returns null.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @generated
         */
        public Adapter createEObjectAdapter() {
                return null;
        }

} //DroneAdapterFactory
