/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;

import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;

import hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getTask <em>Task</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getCapabilityProperties <em>Capability Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.TaskRequirementImpl#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRequirementImpl extends NamedElementImpl implements TaskRequirement {
        /**
         * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTask()
         * @generated
         * @ordered
         */
        protected TaskExecution task;

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
        public TaskExecution getTask() {
                if (task != null && task.eIsProxy()) {
                        InternalEObject oldTask = (InternalEObject)task;
                        task = (TaskExecution)eResolveProxy(oldTask);
                        if (task != oldTask) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.TASK_REQUIREMENT__TASK, oldTask, task));
                        }
                }
                return task;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskExecution basicGetTask() {
                return task;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTask(TaskExecution newTask) {
                TaskExecution oldTask = task;
                task = newTask;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.TASK_REQUIREMENT__TASK, oldTask, task));
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
                TaskDescriptor descriptor = basicGetDescriptor();
                return descriptor != null && descriptor.eIsProxy() ? (TaskDescriptor)eResolveProxy((InternalEObject)descriptor) : descriptor;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskDescriptor basicGetDescriptor() {
                // TODO: implement this method to return the 'Descriptor' reference
                // -> do not perform proxy resolution
                // Ensure that you remove @generated or mark it @generated NOT
                throw new UnsupportedOperationException();
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK:
                                if (resolve) return getTask();
                                return basicGetTask();
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK:
                                setTask((TaskExecution)newValue);
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK:
                                setTask((TaskExecution)null);
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
                        case BehaviourPackage.TASK_REQUIREMENT__TASK:
                                return task != null;
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
                                return basicGetDescriptor() != null;
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