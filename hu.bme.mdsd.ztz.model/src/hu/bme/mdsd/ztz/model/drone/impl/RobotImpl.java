/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.behaviourModel.CommunicationAction;

import hu.bme.mdsd.ztz.model.drone.Action;
import hu.bme.mdsd.ztz.model.drone.Battery;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.DetectedObject;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.Equipment;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Position;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotCollaboration;
import hu.bme.mdsd.ztz.model.drone.Size;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskExecution;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getSize <em>Size</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getCollaborations <em>Collaborations</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getDetectedObjects <em>Detected Objects</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getCommunicationRange <em>Communication Range</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getMission <em>Mission</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getCommunicationAction <em>Communication Action</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getCapabilityProperties <em>Capability Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends NamedElementImpl implements Robot {
        /**
         * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPosition()
         * @generated
         * @ordered
         */
        protected Position position;

        /**
         * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getSize()
         * @generated
         * @ordered
         */
        protected Size size;

        /**
         * The cached value of the '{@link #getBatteries() <em>Batteries</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getBatteries()
         * @generated
         * @ordered
         */
        protected EList<Battery> batteries;

        /**
         * The cached value of the '{@link #getCollaborations() <em>Collaborations</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCollaborations()
         * @generated
         * @ordered
         */
        protected EList<RobotCollaboration> collaborations;

        /**
         * The cached value of the '{@link #getDetectedObjects() <em>Detected Objects</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDetectedObjects()
         * @generated
         * @ordered
         */
        protected EList<DetectedObject> detectedObjects;

        /**
         * The cached value of the '{@link #getEquipments() <em>Equipments</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getEquipments()
         * @generated
         * @ordered
         */
        protected EList<Equipment> equipments;

        /**
         * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTasks()
         * @generated
         * @ordered
         */
        protected EList<Task> tasks;

        /**
         * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getProperties()
         * @generated
         * @ordered
         */
        protected EList<Property> properties;

        /**
         * The cached value of the '{@link #getCommunicationRange() <em>Communication Range</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCommunicationRange()
         * @generated
         * @ordered
         */
        protected MeasureValue communicationRange;

        /**
         * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getWeight()
         * @generated
         * @ordered
         */
        protected MeasureValue weight;

        /**
         * The cached setting delegate for the '{@link #getMission() <em>Mission</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMission()
         * @generated
         * @ordered
         */
        protected EStructuralFeature.Internal.SettingDelegate MISSION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)DronePackage.Literals.ROBOT__MISSION).getSettingDelegate();

        /**
         * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getActions()
         * @generated
         * @ordered
         */
        protected EList<Action> actions;

        /**
         * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCapabilities()
         * @generated
         * @ordered
         */
        protected EList<Capability> capabilities;

        /**
         * The cached value of the '{@link #getCommunicationAction() <em>Communication Action</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCommunicationAction()
         * @generated
         * @ordered
         */
        protected EList<CommunicationAction> communicationAction;

        /**
         * The cached value of the '{@link #getCapabilityProperties() <em>Capability Properties</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCapabilityProperties()
         * @generated
         * @ordered
         */
        protected EList<CapabilityProperties> capabilityProperties;

        /**
         * The cached value of the '{@link #getExecute() <em>Execute</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getExecute()
         * @generated
         * @ordered
         */
        protected TaskExecution execute;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected RobotImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.ROBOT;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Position getPosition() {
                return position;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
                Position oldPosition = position;
                position = newPosition;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__POSITION, oldPosition, newPosition);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setPosition(Position newPosition) {
                if (newPosition != position) {
                        NotificationChain msgs = null;
                        if (position != null)
                                msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__POSITION, null, msgs);
                        if (newPosition != null)
                                msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__POSITION, null, msgs);
                        msgs = basicSetPosition(newPosition, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__POSITION, newPosition, newPosition));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Size getSize() {
                return size;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetSize(Size newSize, NotificationChain msgs) {
                Size oldSize = size;
                size = newSize;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__SIZE, oldSize, newSize);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setSize(Size newSize) {
                if (newSize != size) {
                        NotificationChain msgs = null;
                        if (size != null)
                                msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__SIZE, null, msgs);
                        if (newSize != null)
                                msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__SIZE, null, msgs);
                        msgs = basicSetSize(newSize, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__SIZE, newSize, newSize));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Battery> getBatteries() {
                if (batteries == null) {
                        batteries = new EObjectContainmentEList<Battery>(Battery.class, this, DronePackage.ROBOT__BATTERIES);
                }
                return batteries;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<RobotCollaboration> getCollaborations() {
                if (collaborations == null) {
                        collaborations = new EObjectContainmentEList<RobotCollaboration>(RobotCollaboration.class, this, DronePackage.ROBOT__COLLABORATIONS);
                }
                return collaborations;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<DetectedObject> getDetectedObjects() {
                if (detectedObjects == null) {
                        detectedObjects = new EObjectContainmentEList<DetectedObject>(DetectedObject.class, this, DronePackage.ROBOT__DETECTED_OBJECTS);
                }
                return detectedObjects;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Equipment> getEquipments() {
                if (equipments == null) {
                        equipments = new EObjectContainmentEList<Equipment>(Equipment.class, this, DronePackage.ROBOT__EQUIPMENTS);
                }
                return equipments;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Task> getTasks() {
                if (tasks == null) {
                        tasks = new EObjectResolvingEList<Task>(Task.class, this, DronePackage.ROBOT__TASKS);
                }
                return tasks;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, DronePackage.ROBOT__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getCommunicationRange() {
                return communicationRange;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetCommunicationRange(MeasureValue newCommunicationRange, NotificationChain msgs) {
                MeasureValue oldCommunicationRange = communicationRange;
                communicationRange = newCommunicationRange;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__COMMUNICATION_RANGE, oldCommunicationRange, newCommunicationRange);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCommunicationRange(MeasureValue newCommunicationRange) {
                if (newCommunicationRange != communicationRange) {
                        NotificationChain msgs = null;
                        if (communicationRange != null)
                                msgs = ((InternalEObject)communicationRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__COMMUNICATION_RANGE, null, msgs);
                        if (newCommunicationRange != null)
                                msgs = ((InternalEObject)newCommunicationRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__COMMUNICATION_RANGE, null, msgs);
                        msgs = basicSetCommunicationRange(newCommunicationRange, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__COMMUNICATION_RANGE, newCommunicationRange, newCommunicationRange));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getWeight() {
                return weight;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetWeight(MeasureValue newWeight, NotificationChain msgs) {
                MeasureValue oldWeight = weight;
                weight = newWeight;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__WEIGHT, oldWeight, newWeight);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setWeight(MeasureValue newWeight) {
                if (newWeight != weight) {
                        NotificationChain msgs = null;
                        if (weight != null)
                                msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__WEIGHT, null, msgs);
                        if (newWeight != null)
                                msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT__WEIGHT, null, msgs);
                        msgs = basicSetWeight(newWeight, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__WEIGHT, newWeight, newWeight));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Mission getMission() {
                return (Mission)MISSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Mission basicGetMission() {
                return (Mission)MISSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetMission() {
                return MISSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Action> getActions() {
                if (actions == null) {
                        actions = new EObjectContainmentEList<Action>(Action.class, this, DronePackage.ROBOT__ACTIONS);
                }
                return actions;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Capability> getCapabilities() {
                if (capabilities == null) {
                        capabilities = new EObjectResolvingEList<Capability>(Capability.class, this, DronePackage.ROBOT__CAPABILITIES);
                }
                return capabilities;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<CommunicationAction> getCommunicationAction() {
                if (communicationAction == null) {
                        communicationAction = new EObjectResolvingEList<CommunicationAction>(CommunicationAction.class, this, DronePackage.ROBOT__COMMUNICATION_ACTION);
                }
                return communicationAction;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<CapabilityProperties> getCapabilityProperties() {
                if (capabilityProperties == null) {
                        capabilityProperties = new EObjectContainmentEList<CapabilityProperties>(CapabilityProperties.class, this, DronePackage.ROBOT__CAPABILITY_PROPERTIES);
                }
                return capabilityProperties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution getExecute() {
                if (execute != null && execute.eIsProxy()) {
                        InternalEObject oldExecute = (InternalEObject)execute;
                        execute = (TaskExecution)eResolveProxy(oldExecute);
                        if (execute != oldExecute) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.ROBOT__EXECUTE, oldExecute, execute));
                        }
                }
                return execute;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution basicGetExecute() {
                return execute;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetExecute(TaskExecution newExecute, NotificationChain msgs) {
                TaskExecution oldExecute = execute;
                execute = newExecute;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__EXECUTE, oldExecute, newExecute);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setExecute(TaskExecution newExecute) {
                if (newExecute != execute) {
                        NotificationChain msgs = null;
                        if (execute != null)
                                msgs = ((InternalEObject)execute).eInverseRemove(this, DronePackage.TASK_EXECUTION__EXECUTORS, TaskExecution.class, msgs);
                        if (newExecute != null)
                                msgs = ((InternalEObject)newExecute).eInverseAdd(this, DronePackage.TASK_EXECUTION__EXECUTORS, TaskExecution.class, msgs);
                        msgs = basicSetExecute(newExecute, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT__EXECUTE, newExecute, newExecute));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.ROBOT__EXECUTE:
                                if (execute != null)
                                        msgs = ((InternalEObject)execute).eInverseRemove(this, DronePackage.TASK_EXECUTION__EXECUTORS, TaskExecution.class, msgs);
                                return basicSetExecute((TaskExecution)otherEnd, msgs);
                }
                return super.eInverseAdd(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.ROBOT__POSITION:
                                return basicSetPosition(null, msgs);
                        case DronePackage.ROBOT__SIZE:
                                return basicSetSize(null, msgs);
                        case DronePackage.ROBOT__BATTERIES:
                                return ((InternalEList<?>)getBatteries()).basicRemove(otherEnd, msgs);
                        case DronePackage.ROBOT__COLLABORATIONS:
                                return ((InternalEList<?>)getCollaborations()).basicRemove(otherEnd, msgs);
                        case DronePackage.ROBOT__DETECTED_OBJECTS:
                                return ((InternalEList<?>)getDetectedObjects()).basicRemove(otherEnd, msgs);
                        case DronePackage.ROBOT__EQUIPMENTS:
                                return ((InternalEList<?>)getEquipments()).basicRemove(otherEnd, msgs);
                        case DronePackage.ROBOT__PROPERTIES:
                                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
                        case DronePackage.ROBOT__COMMUNICATION_RANGE:
                                return basicSetCommunicationRange(null, msgs);
                        case DronePackage.ROBOT__WEIGHT:
                                return basicSetWeight(null, msgs);
                        case DronePackage.ROBOT__ACTIONS:
                                return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
                        case DronePackage.ROBOT__CAPABILITY_PROPERTIES:
                                return ((InternalEList<?>)getCapabilityProperties()).basicRemove(otherEnd, msgs);
                        case DronePackage.ROBOT__EXECUTE:
                                return basicSetExecute(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DronePackage.ROBOT__POSITION:
                                return getPosition();
                        case DronePackage.ROBOT__SIZE:
                                return getSize();
                        case DronePackage.ROBOT__BATTERIES:
                                return getBatteries();
                        case DronePackage.ROBOT__COLLABORATIONS:
                                return getCollaborations();
                        case DronePackage.ROBOT__DETECTED_OBJECTS:
                                return getDetectedObjects();
                        case DronePackage.ROBOT__EQUIPMENTS:
                                return getEquipments();
                        case DronePackage.ROBOT__TASKS:
                                return getTasks();
                        case DronePackage.ROBOT__PROPERTIES:
                                return getProperties();
                        case DronePackage.ROBOT__COMMUNICATION_RANGE:
                                return getCommunicationRange();
                        case DronePackage.ROBOT__WEIGHT:
                                return getWeight();
                        case DronePackage.ROBOT__MISSION:
                                if (resolve) return getMission();
                                return basicGetMission();
                        case DronePackage.ROBOT__ACTIONS:
                                return getActions();
                        case DronePackage.ROBOT__CAPABILITIES:
                                return getCapabilities();
                        case DronePackage.ROBOT__COMMUNICATION_ACTION:
                                return getCommunicationAction();
                        case DronePackage.ROBOT__CAPABILITY_PROPERTIES:
                                return getCapabilityProperties();
                        case DronePackage.ROBOT__EXECUTE:
                                if (resolve) return getExecute();
                                return basicGetExecute();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @SuppressWarnings("unchecked")
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DronePackage.ROBOT__POSITION:
                                setPosition((Position)newValue);
                                return;
                        case DronePackage.ROBOT__SIZE:
                                setSize((Size)newValue);
                                return;
                        case DronePackage.ROBOT__BATTERIES:
                                getBatteries().clear();
                                getBatteries().addAll((Collection<? extends Battery>)newValue);
                                return;
                        case DronePackage.ROBOT__COLLABORATIONS:
                                getCollaborations().clear();
                                getCollaborations().addAll((Collection<? extends RobotCollaboration>)newValue);
                                return;
                        case DronePackage.ROBOT__DETECTED_OBJECTS:
                                getDetectedObjects().clear();
                                getDetectedObjects().addAll((Collection<? extends DetectedObject>)newValue);
                                return;
                        case DronePackage.ROBOT__EQUIPMENTS:
                                getEquipments().clear();
                                getEquipments().addAll((Collection<? extends Equipment>)newValue);
                                return;
                        case DronePackage.ROBOT__TASKS:
                                getTasks().clear();
                                getTasks().addAll((Collection<? extends Task>)newValue);
                                return;
                        case DronePackage.ROBOT__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case DronePackage.ROBOT__COMMUNICATION_RANGE:
                                setCommunicationRange((MeasureValue)newValue);
                                return;
                        case DronePackage.ROBOT__WEIGHT:
                                setWeight((MeasureValue)newValue);
                                return;
                        case DronePackage.ROBOT__ACTIONS:
                                getActions().clear();
                                getActions().addAll((Collection<? extends Action>)newValue);
                                return;
                        case DronePackage.ROBOT__CAPABILITIES:
                                getCapabilities().clear();
                                getCapabilities().addAll((Collection<? extends Capability>)newValue);
                                return;
                        case DronePackage.ROBOT__COMMUNICATION_ACTION:
                                getCommunicationAction().clear();
                                getCommunicationAction().addAll((Collection<? extends CommunicationAction>)newValue);
                                return;
                        case DronePackage.ROBOT__CAPABILITY_PROPERTIES:
                                getCapabilityProperties().clear();
                                getCapabilityProperties().addAll((Collection<? extends CapabilityProperties>)newValue);
                                return;
                        case DronePackage.ROBOT__EXECUTE:
                                setExecute((TaskExecution)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case DronePackage.ROBOT__POSITION:
                                setPosition((Position)null);
                                return;
                        case DronePackage.ROBOT__SIZE:
                                setSize((Size)null);
                                return;
                        case DronePackage.ROBOT__BATTERIES:
                                getBatteries().clear();
                                return;
                        case DronePackage.ROBOT__COLLABORATIONS:
                                getCollaborations().clear();
                                return;
                        case DronePackage.ROBOT__DETECTED_OBJECTS:
                                getDetectedObjects().clear();
                                return;
                        case DronePackage.ROBOT__EQUIPMENTS:
                                getEquipments().clear();
                                return;
                        case DronePackage.ROBOT__TASKS:
                                getTasks().clear();
                                return;
                        case DronePackage.ROBOT__PROPERTIES:
                                getProperties().clear();
                                return;
                        case DronePackage.ROBOT__COMMUNICATION_RANGE:
                                setCommunicationRange((MeasureValue)null);
                                return;
                        case DronePackage.ROBOT__WEIGHT:
                                setWeight((MeasureValue)null);
                                return;
                        case DronePackage.ROBOT__ACTIONS:
                                getActions().clear();
                                return;
                        case DronePackage.ROBOT__CAPABILITIES:
                                getCapabilities().clear();
                                return;
                        case DronePackage.ROBOT__COMMUNICATION_ACTION:
                                getCommunicationAction().clear();
                                return;
                        case DronePackage.ROBOT__CAPABILITY_PROPERTIES:
                                getCapabilityProperties().clear();
                                return;
                        case DronePackage.ROBOT__EXECUTE:
                                setExecute((TaskExecution)null);
                                return;
                }
                super.eUnset(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case DronePackage.ROBOT__POSITION:
                                return position != null;
                        case DronePackage.ROBOT__SIZE:
                                return size != null;
                        case DronePackage.ROBOT__BATTERIES:
                                return batteries != null && !batteries.isEmpty();
                        case DronePackage.ROBOT__COLLABORATIONS:
                                return collaborations != null && !collaborations.isEmpty();
                        case DronePackage.ROBOT__DETECTED_OBJECTS:
                                return detectedObjects != null && !detectedObjects.isEmpty();
                        case DronePackage.ROBOT__EQUIPMENTS:
                                return equipments != null && !equipments.isEmpty();
                        case DronePackage.ROBOT__TASKS:
                                return tasks != null && !tasks.isEmpty();
                        case DronePackage.ROBOT__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case DronePackage.ROBOT__COMMUNICATION_RANGE:
                                return communicationRange != null;
                        case DronePackage.ROBOT__WEIGHT:
                                return weight != null;
                        case DronePackage.ROBOT__MISSION:
                                return isSetMission();
                        case DronePackage.ROBOT__ACTIONS:
                                return actions != null && !actions.isEmpty();
                        case DronePackage.ROBOT__CAPABILITIES:
                                return capabilities != null && !capabilities.isEmpty();
                        case DronePackage.ROBOT__COMMUNICATION_ACTION:
                                return communicationAction != null && !communicationAction.isEmpty();
                        case DronePackage.ROBOT__CAPABILITY_PROPERTIES:
                                return capabilityProperties != null && !capabilityProperties.isEmpty();
                        case DronePackage.ROBOT__EXECUTE:
                                return execute != null;
                }
                return super.eIsSet(featureID);
        }

} //RobotImpl
