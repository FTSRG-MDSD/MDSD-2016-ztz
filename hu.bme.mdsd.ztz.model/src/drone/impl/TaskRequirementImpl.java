/**
 */
package drone.impl;

import drone.Capability;
import drone.DronePackage;
import drone.Property;
import drone.Task;
import drone.TaskRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.TaskRequirementImpl#getTask <em>Task</em>}</li>
 *   <li>{@link drone.impl.TaskRequirementImpl#getPrerequisite <em>Prerequisite</em>}</li>
 *   <li>{@link drone.impl.TaskRequirementImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link drone.impl.TaskRequirementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link drone.impl.TaskRequirementImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskRequirementImpl extends MinimalEObjectImpl.Container implements TaskRequirement {
        /**
         * The cached value of the '{@link #getPrerequisite() <em>Prerequisite</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getPrerequisite()
         * @generated
         * @ordered
         */
        protected Task prerequisite;

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
                return DronePackage.Literals.TASK_REQUIREMENT;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task getTask() {
                if (eContainerFeatureID() != DronePackage.TASK_REQUIREMENT__TASK) return null;
                return (Task)eInternalContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newTask, DronePackage.TASK_REQUIREMENT__TASK, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTask(Task newTask) {
                if (newTask != eInternalContainer() || (eContainerFeatureID() != DronePackage.TASK_REQUIREMENT__TASK && newTask != null)) {
                        if (EcoreUtil.isAncestor(this, newTask))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newTask != null)
                                msgs = ((InternalEObject)newTask).eInverseAdd(this, DronePackage.TASK__REQUIREMENT, Task.class, msgs);
                        msgs = basicSetTask(newTask, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK_REQUIREMENT__TASK, newTask, newTask));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task getPrerequisite() {
                if (prerequisite != null && prerequisite.eIsProxy()) {
                        InternalEObject oldPrerequisite = (InternalEObject)prerequisite;
                        prerequisite = (Task)eResolveProxy(oldPrerequisite);
                        if (prerequisite != oldPrerequisite) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.TASK_REQUIREMENT__PREREQUISITE, oldPrerequisite, prerequisite));
                        }
                }
                return prerequisite;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task basicGetPrerequisite() {
                return prerequisite;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setPrerequisite(Task newPrerequisite) {
                Task oldPrerequisite = prerequisite;
                prerequisite = newPrerequisite;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK_REQUIREMENT__PREREQUISITE, oldPrerequisite, prerequisite));
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
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK_REQUIREMENT__PARTICIPANTS, oldParticipants, participants));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, DronePackage.TASK_REQUIREMENT__PROPERTIES);
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
                        requiredCapabilities = new EObjectResolvingEList<Capability>(Capability.class, this, DronePackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES);
                }
                return requiredCapabilities;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.TASK_REQUIREMENT__TASK:
                                if (eInternalContainer() != null)
                                        msgs = eBasicRemoveFromContainer(msgs);
                                return basicSetTask((Task)otherEnd, msgs);
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
                        case DronePackage.TASK_REQUIREMENT__TASK:
                                return basicSetTask(null, msgs);
                        case DronePackage.TASK_REQUIREMENT__PROPERTIES:
                                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
                switch (eContainerFeatureID()) {
                        case DronePackage.TASK_REQUIREMENT__TASK:
                                return eInternalContainer().eInverseRemove(this, DronePackage.TASK__REQUIREMENT, Task.class, msgs);
                }
                return super.eBasicRemoveFromContainerFeature(msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DronePackage.TASK_REQUIREMENT__TASK:
                                return getTask();
                        case DronePackage.TASK_REQUIREMENT__PREREQUISITE:
                                if (resolve) return getPrerequisite();
                                return basicGetPrerequisite();
                        case DronePackage.TASK_REQUIREMENT__PARTICIPANTS:
                                return getParticipants();
                        case DronePackage.TASK_REQUIREMENT__PROPERTIES:
                                return getProperties();
                        case DronePackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                return getRequiredCapabilities();
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
                        case DronePackage.TASK_REQUIREMENT__TASK:
                                setTask((Task)newValue);
                                return;
                        case DronePackage.TASK_REQUIREMENT__PREREQUISITE:
                                setPrerequisite((Task)newValue);
                                return;
                        case DronePackage.TASK_REQUIREMENT__PARTICIPANTS:
                                setParticipants((Integer)newValue);
                                return;
                        case DronePackage.TASK_REQUIREMENT__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case DronePackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                getRequiredCapabilities().clear();
                                getRequiredCapabilities().addAll((Collection<? extends Capability>)newValue);
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
                        case DronePackage.TASK_REQUIREMENT__TASK:
                                setTask((Task)null);
                                return;
                        case DronePackage.TASK_REQUIREMENT__PREREQUISITE:
                                setPrerequisite((Task)null);
                                return;
                        case DronePackage.TASK_REQUIREMENT__PARTICIPANTS:
                                setParticipants(PARTICIPANTS_EDEFAULT);
                                return;
                        case DronePackage.TASK_REQUIREMENT__PROPERTIES:
                                getProperties().clear();
                                return;
                        case DronePackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                getRequiredCapabilities().clear();
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
                        case DronePackage.TASK_REQUIREMENT__TASK:
                                return getTask() != null;
                        case DronePackage.TASK_REQUIREMENT__PREREQUISITE:
                                return prerequisite != null;
                        case DronePackage.TASK_REQUIREMENT__PARTICIPANTS:
                                return participants != PARTICIPANTS_EDEFAULT;
                        case DronePackage.TASK_REQUIREMENT__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case DronePackage.TASK_REQUIREMENT__REQUIRED_CAPABILITIES:
                                return requiredCapabilities != null && !requiredCapabilities.isEmpty();
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
