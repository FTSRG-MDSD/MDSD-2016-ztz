/**
 */
package hu.bme.mdsd.ztz.model.drone.util;

import hu.bme.mdsd.ztz.model.drone.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mdsd.ztz.model.drone.DronePackage
 * @generated
 */
public class DroneSwitch<T> extends Switch<T> {
        /**
         * The cached model package
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static DronePackage modelPackage;

        /**
         * Creates an instance of the switch.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DroneSwitch() {
                if (modelPackage == null) {
                        modelPackage = DronePackage.eINSTANCE;
                }
        }

        /**
         * Checks whether this is a switch for the given package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param ePackage the package in question.
         * @return whether this is a switch for the given package.
         * @generated
         */
        @Override
        protected boolean isSwitchFor(EPackage ePackage) {
                return ePackage == modelPackage;
        }

        /**
         * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the first non-null result returned by a <code>caseXXX</code> call.
         * @generated
         */
        @Override
        protected T doSwitch(int classifierID, EObject theEObject) {
                switch (classifierID) {
                        case DronePackage.MISSION: {
                                Mission mission = (Mission)theEObject;
                                T result = caseMission(mission);
                                if (result == null) result = caseNamedElement(mission);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.TASK: {
                                Task task = (Task)theEObject;
                                T result = caseTask(task);
                                if (result == null) result = caseNamedElement(task);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.TASK_DESCRIPTOR: {
                                TaskDescriptor taskDescriptor = (TaskDescriptor)theEObject;
                                T result = caseTaskDescriptor(taskDescriptor);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.POSITION: {
                                Position position = (Position)theEObject;
                                T result = casePosition(position);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.AREA_OBJECT: {
                                AreaObject areaObject = (AreaObject)theEObject;
                                T result = caseAreaObject(areaObject);
                                if (result == null) result = caseNamedElement(areaObject);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.COORDINATE: {
                                Coordinate coordinate = (Coordinate)theEObject;
                                T result = caseCoordinate(coordinate);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.PROPERTY: {
                                Property property = (Property)theEObject;
                                T result = caseProperty(property);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.ROBOT: {
                                Robot robot = (Robot)theEObject;
                                T result = caseRobot(robot);
                                if (result == null) result = caseNamedElement(robot);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.STRING_PROPERTY: {
                                StringProperty stringProperty = (StringProperty)theEObject;
                                T result = caseStringProperty(stringProperty);
                                if (result == null) result = casePropertyValue(stringProperty);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.TASK_EXECUTION: {
                                TaskExecution taskExecution = (TaskExecution)theEObject;
                                T result = caseTaskExecution(taskExecution);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.ROBOT_COLLABORATION: {
                                RobotCollaboration robotCollaboration = (RobotCollaboration)theEObject;
                                T result = caseRobotCollaboration(robotCollaboration);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.TASK_REQUIREMENT: {
                                TaskRequirement taskRequirement = (TaskRequirement)theEObject;
                                T result = caseTaskRequirement(taskRequirement);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.SIZE: {
                                Size size = (Size)theEObject;
                                T result = caseSize(size);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.BATTERY: {
                                Battery battery = (Battery)theEObject;
                                T result = caseBattery(battery);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.NAMED_ELEMENT: {
                                NamedElement namedElement = (NamedElement)theEObject;
                                T result = caseNamedElement(namedElement);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.DETECTED_OBJECT: {
                                DetectedObject detectedObject = (DetectedObject)theEObject;
                                T result = caseDetectedObject(detectedObject);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.EQUIPMENT: {
                                Equipment equipment = (Equipment)theEObject;
                                T result = caseEquipment(equipment);
                                if (result == null) result = caseNamedElement(equipment);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.ACTION: {
                                Action action = (Action)theEObject;
                                T result = caseAction(action);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.MEASURE_VALUE: {
                                MeasureValue measureValue = (MeasureValue)theEObject;
                                T result = caseMeasureValue(measureValue);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.MEASURE_CONVERSION: {
                                MeasureConversion measureConversion = (MeasureConversion)theEObject;
                                T result = caseMeasureConversion(measureConversion);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.MEASURE_DIMENSION: {
                                MeasureDimension measureDimension = (MeasureDimension)theEObject;
                                T result = caseMeasureDimension(measureDimension);
                                if (result == null) result = caseNamedElement(measureDimension);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.MEASURE_PROPERTY: {
                                MeasureProperty measureProperty = (MeasureProperty)theEObject;
                                T result = caseMeasureProperty(measureProperty);
                                if (result == null) result = casePropertyValue(measureProperty);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.PROPERTY_VALUE: {
                                PropertyValue propertyValue = (PropertyValue)theEObject;
                                T result = casePropertyValue(propertyValue);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.ROBOT_MISSION_CONTAINER: {
                                RobotMissionContainer robotMissionContainer = (RobotMissionContainer)theEObject;
                                T result = caseRobotMissionContainer(robotMissionContainer);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.CAPABILITY: {
                                Capability capability = (Capability)theEObject;
                                T result = caseCapability(capability);
                                if (result == null) result = caseNamedElement(capability);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        case DronePackage.CAPABILITY_PROPERTIES: {
                                CapabilityProperties capabilityProperties = (CapabilityProperties)theEObject;
                                T result = caseCapabilityProperties(capabilityProperties);
                                if (result == null) result = defaultCase(theEObject);
                                return result;
                        }
                        default: return defaultCase(theEObject);
                }
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMission(Mission object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Task</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTask(Task object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Task Descriptor</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Task Descriptor</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTaskDescriptor(TaskDescriptor object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Position</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T casePosition(Position object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Area Object</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Area Object</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseAreaObject(AreaObject object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCoordinate(Coordinate object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Property</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseProperty(Property object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseRobot(Robot object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseStringProperty(StringProperty object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Task Execution</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Task Execution</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTaskExecution(TaskExecution object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Robot Collaboration</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Robot Collaboration</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseRobotCollaboration(RobotCollaboration object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Task Requirement</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Task Requirement</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseTaskRequirement(TaskRequirement object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Size</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseSize(Size object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Battery</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Battery</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseBattery(Battery object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseNamedElement(NamedElement object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Detected Object</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Detected Object</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseDetectedObject(DetectedObject object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseEquipment(Equipment object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Action</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseAction(Action object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Measure Value</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Measure Value</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMeasureValue(MeasureValue object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Measure Conversion</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Measure Conversion</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMeasureConversion(MeasureConversion object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Measure Dimension</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Measure Dimension</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMeasureDimension(MeasureDimension object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Measure Property</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Measure Property</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseMeasureProperty(MeasureProperty object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T casePropertyValue(PropertyValue object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Robot Mission Container</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Robot Mission Container</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseRobotMissionContainer(RobotMissionContainer object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCapability(Capability object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>Capability Properties</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>Capability Properties</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
         * @generated
         */
        public T caseCapabilityProperties(CapabilityProperties object) {
                return null;
        }

        /**
         * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
         * <!-- begin-user-doc -->
         * This implementation returns null;
         * returning a non-null result will terminate the switch, but this is the last case anyway.
         * <!-- end-user-doc -->
         * @param object the target of the switch.
         * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
         * @see #doSwitch(org.eclipse.emf.ecore.EObject)
         * @generated
         */
        @Override
        public T defaultCase(EObject object) {
                return null;
        }

} //DroneSwitch
