/**
 */
package drone.util;

import drone.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see drone.DronePackage
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
                        public Adapter caseStringProperty(StringProperty object) {
                                return createStringPropertyAdapter();
                        }
                        @Override
                        public Adapter caseTaskExecution(TaskExecution object) {
                                return createTaskExecutionAdapter();
                        }
                        @Override
                        public Adapter caseRobotCollaboration(RobotCollaboration object) {
                                return createRobotCollaborationAdapter();
                        }
                        @Override
                        public Adapter caseTaskRequirement(TaskRequirement object) {
                                return createTaskRequirementAdapter();
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
                        public Adapter caseDetectedObject(DetectedObject object) {
                                return createDetectedObjectAdapter();
                        }
                        @Override
                        public Adapter caseEquipment(Equipment object) {
                                return createEquipmentAdapter();
                        }
                        @Override
                        public Adapter caseAction(Action object) {
                                return createActionAdapter();
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
                        public Adapter caseMeasureProperty(MeasureProperty object) {
                                return createMeasurePropertyAdapter();
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
                        public Adapter caseCapability(Capability object) {
                                return createCapabilityAdapter();
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
         * Creates a new adapter for an object of class '{@link drone.Mission <em>Mission</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Mission
         * @generated
         */
        public Adapter createMissionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Task <em>Task</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Task
         * @generated
         */
        public Adapter createTaskAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.TaskDescriptor <em>Task Descriptor</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.TaskDescriptor
         * @generated
         */
        public Adapter createTaskDescriptorAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Position <em>Position</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Position
         * @generated
         */
        public Adapter createPositionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.AreaObject <em>Area Object</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.AreaObject
         * @generated
         */
        public Adapter createAreaObjectAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Coordinate <em>Coordinate</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Coordinate
         * @generated
         */
        public Adapter createCoordinateAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Property <em>Property</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Property
         * @generated
         */
        public Adapter createPropertyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Robot <em>Robot</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Robot
         * @generated
         */
        public Adapter createRobotAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.StringProperty <em>String Property</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.StringProperty
         * @generated
         */
        public Adapter createStringPropertyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.TaskExecution <em>Task Execution</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.TaskExecution
         * @generated
         */
        public Adapter createTaskExecutionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.RobotCollaboration <em>Robot Collaboration</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.RobotCollaboration
         * @generated
         */
        public Adapter createRobotCollaborationAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.TaskRequirement <em>Task Requirement</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.TaskRequirement
         * @generated
         */
        public Adapter createTaskRequirementAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Size <em>Size</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Size
         * @generated
         */
        public Adapter createSizeAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Battery <em>Battery</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Battery
         * @generated
         */
        public Adapter createBatteryAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.NamedElement <em>Named Element</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.NamedElement
         * @generated
         */
        public Adapter createNamedElementAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.DetectedObject <em>Detected Object</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.DetectedObject
         * @generated
         */
        public Adapter createDetectedObjectAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Equipment <em>Equipment</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Equipment
         * @generated
         */
        public Adapter createEquipmentAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Action <em>Action</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Action
         * @generated
         */
        public Adapter createActionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.MeasureValue <em>Measure Value</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.MeasureValue
         * @generated
         */
        public Adapter createMeasureValueAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.MeasureConversion <em>Measure Conversion</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.MeasureConversion
         * @generated
         */
        public Adapter createMeasureConversionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.MeasureDimension <em>Measure Dimension</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.MeasureDimension
         * @generated
         */
        public Adapter createMeasureDimensionAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.MeasureProperty <em>Measure Property</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.MeasureProperty
         * @generated
         */
        public Adapter createMeasurePropertyAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.PropertyValue <em>Property Value</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.PropertyValue
         * @generated
         */
        public Adapter createPropertyValueAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.RobotMissionContainer <em>Robot Mission Container</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.RobotMissionContainer
         * @generated
         */
        public Adapter createRobotMissionContainerAdapter() {
                return null;
        }

        /**
         * Creates a new adapter for an object of class '{@link drone.Capability <em>Capability</em>}'.
         * <!-- begin-user-doc -->
         * This default implementation returns null so that we can easily ignore cases;
         * it's useful to ignore a case when inheritance will catch all the cases anyway.
         * <!-- end-user-doc -->
         * @return the new adapter.
         * @see drone.Capability
         * @generated
         */
        public Adapter createCapabilityAdapter() {
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
