/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;

import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;

import hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl;

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
 * An implementation of the model object '<em><b>Task Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getTaskExecution <em>Task Execution</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getCapabilityProperties <em>Capability Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getTask <em>Task</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getPrerequisiteTask <em>Prerequisite Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRequirementImpl extends NamedElementImpl implements TaskRequirement {
        /**
         * The cached value of the '{@link #getTaskExecution() <em>Task Execution</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTaskExecution()
         * @generated
         * @ordered
         */
        protected TaskExecution taskExecution;

        /**
         * The cached value of the '{@link #getPrerequisite() <em>Prerequisite</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPrerequisite()
         * @generated
         * @ordered
         */
        protected TaskExecution prerequisite;

        /**
         * The default value of the '{@link #getParticipants() <em>Participants</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipants()
         * @generated
         * @ordered
         */
        protected static final int PARTICIPANTS_EDEFAULT = 0;

        /**
         * The cached value of the '{@link #getParticipants() <em>Participants</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getParticipants()
         * @generated
         * @ordered
         */
        protected int participants = PARTICIPANTS_EDEFAULT;

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
         * The cached value of the '{@link #getRequiredCapabilities() <em>Required Capabilities</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getRequiredCapabilities()
         * @generated
         * @ordered
         */
        protected EList<Capability> requiredCapabilities;

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
         * The cached setting delegate for the '{@link #getDescriptor() <em>Descriptor</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getDescriptor()
         * @generated
         * @ordered
         */
        protected EStructuralFeature.Internal.SettingDelegate DESCRIPTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BehaviourPackage.Literals.TASK_REQUIREMENT__DESCRIPTOR).getSettingDelegate();

        /**
         * The cached setting delegate for the '{@link #getTask() <em>Task</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTask()
         * @generated
         * @ordered
         */
        protected EStructuralFeature.Internal.SettingDelegate TASK__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BehaviourPackage.Literals.TASK_REQUIREMENT__TASK).getSettingDelegate();

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskRequirementImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.TASK_REQUIREMENT;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution getTaskExecution() {
                if (taskExecution != null && taskExecution.eIsProxy()) {
                        InternalEObject oldTaskExecution = (InternalEObject)taskExecution;
                        taskExecution = (TaskExecution)eResolveProxy(oldTaskExecution);
                        if (taskExecution != oldTaskExecution) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.TASK_REQUIREMENT__TASK_EXECUTION, oldTaskExecution, taskExecution));
                        }
                }
                return taskExecution;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution basicGetTaskExecution() {
                return taskExecution;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTaskExecution(TaskExecution newTaskExecution) {
                TaskExecution oldTaskExecution = taskExecution;
                taskExecution = newTaskExecution;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.TASK_REQUIREMENT__TASK_EXECUTION, oldTaskExecution, taskExecution));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task getTask() {
                return (Task)TASK__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task basicGetTask() {
                return (Task)TASK__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetTask() {
                return TASK__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task getPrerequisiteTask() {
                Task prerequisiteTask = basicGetPrerequisiteTask();
                return prerequisiteTask != null && prerequisiteTask.eIsProxy() ? (Task)eResolveProxy((InternalEObject)prerequisiteTask) : prerequisiteTask;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task basicGetPrerequisiteTask() {
                // TODO: implement this method to return the 'Prerequisite Task' reference
                // -> do not perform proxy resolution
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public boolean isSetPrerequisiteTask() {
                // TODO: implement this method to return whether the 'Prerequisite Task' reference is set
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution getPrerequisite() {
                if (prerequisite != null && prerequisite.eIsProxy()) {
                        InternalEObject oldPrerequisite = (InternalEObject)prerequisite;
                        prerequisite = (TaskExecution)eResolveProxy(oldPrerequisite);
                        if (prerequisite != oldPrerequisite) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE, oldPrerequisite, prerequisite));
                        }
                }
                return prerequisite;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution basicGetPrerequisite() {
                return prerequisite;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setPrerequisite(TaskExecution newPrerequisite) {
                TaskExecution oldPrerequisite = prerequisite;
                prerequisite = newPrerequisite;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE, oldPrerequisite, prerequisite));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public int getParticipants() {
                return participants;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setParticipants(int newParticipants) {
                int oldParticipants = participants;
                participants = newParticipants;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.TASK_REQUIREMENT__PARTICIPANTS, oldParticipants, participants));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, BehaviourPackage.TASK_REQUIREMENT__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Capability> getRequiredCapabilities() {
                if (requiredCapabilities == null) {
                        requiredCapabilities = new EObjectResolvingEList<Capability>(Capability.class, this, BehaviourPackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES);
                }
                return requiredCapabilities;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<CapabilityProperties> getCapabilityProperties() {
                if (capabilityProperties == null) {
                        capabilityProperties = new EObjectContainmentEList<CapabilityProperties>(CapabilityProperties.class, this, BehaviourPackage.TASK_REQUIREMENT__CAPABILITY_PROPERTIES);
                }
                return capabilityProperties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskDescriptor getDescriptor() {
                return (TaskDescriptor)DESCRIPTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskDescriptor basicGetDescriptor() {
                return (TaskDescriptor)DESCRIPTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.TASK_REQUIREMENT__PROPERTIES:
                                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.TASK_REQUIREMENT__CAPABILITY_PROPERTIES:
                                return ((InternalEList<?>)getCapabilityProperties()).basicRemove(otherEnd, msgs);
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK_EXECUTION:
                                if (resolve) return getTaskExecution();
                                return basicGetTaskExecution();
                        case BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE:
                                if (resolve) return getPrerequisite();
                                return basicGetPrerequisite();
                        case BehaviourPackage.TASK_REQUIREMENT__PARTICIPANTS:
                                return getParticipants();
                        case BehaviourPackage.TASK_REQUIREMENT__PROPERTIES:
                                return getProperties();
                        case BehaviourPackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                return getRequiredCapabilities();
                        case BehaviourPackage.TASK_REQUIREMENT__CAPABILITY_PROPERTIES:
                                return getCapabilityProperties();
                        case BehaviourPackage.TASK_REQUIREMENT__DESCRIPTOR:
                                if (resolve) return getDescriptor();
                                return basicGetDescriptor();
                        case BehaviourPackage.TASK_REQUIREMENT__TASK:
                                if (resolve) return getTask();
                                return basicGetTask();
                        case BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE_TASK:
                                if (resolve) return getPrerequisiteTask();
                                return basicGetPrerequisiteTask();
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK_EXECUTION:
                                setTaskExecution((TaskExecution)newValue);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE:
                                setPrerequisite((TaskExecution)newValue);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__PARTICIPANTS:
                                setParticipants((Integer)newValue);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                getRequiredCapabilities().clear();
                                getRequiredCapabilities().addAll((Collection<? extends Capability>)newValue);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__CAPABILITY_PROPERTIES:
                                getCapabilityProperties().clear();
                                getCapabilityProperties().addAll((Collection<? extends CapabilityProperties>)newValue);
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK_EXECUTION:
                                setTaskExecution((TaskExecution)null);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE:
                                setPrerequisite((TaskExecution)null);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__PARTICIPANTS:
                                setParticipants(PARTICIPANTS_EDEFAULT);
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__PROPERTIES:
                                getProperties().clear();
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                getRequiredCapabilities().clear();
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__CAPABILITY_PROPERTIES:
                                getCapabilityProperties().clear();
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK_EXECUTION:
                                return taskExecution != null;
                        case BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE:
                                return prerequisite != null;
                        case BehaviourPackage.TASK_REQUIREMENT__PARTICIPANTS:
                                return participants != PARTICIPANTS_EDEFAULT;
                        case BehaviourPackage.TASK_REQUIREMENT__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case BehaviourPackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                return requiredCapabilities != null && !requiredCapabilities.isEmpty();
                        case BehaviourPackage.TASK_REQUIREMENT__CAPABILITY_PROPERTIES:
                                return capabilityProperties != null && !capabilityProperties.isEmpty();
                        case BehaviourPackage.TASK_REQUIREMENT__DESCRIPTOR:
                                return DESCRIPTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
                        case BehaviourPackage.TASK_REQUIREMENT__TASK:
                                return isSetTask();
                        case BehaviourPackage.TASK_REQUIREMENT__PREREQUISITE_TASK:
                                return isSetPrerequisiteTask();
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (participants: ");
                result.append(participants);
                result.append(')');
                return result.toString();
        }

} //TaskRequirementImpl
