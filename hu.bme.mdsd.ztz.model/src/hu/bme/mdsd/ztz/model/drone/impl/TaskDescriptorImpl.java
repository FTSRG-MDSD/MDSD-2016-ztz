/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;

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
 * An implementation of the model object '<em><b>Task Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskDescriptorImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskDescriptorImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.TaskDescriptorImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskDescriptorImpl extends MinimalEObjectImpl.Container implements TaskDescriptor {
        /**
         * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTargets()
         * @generated
         * @ordered
         */
        protected EList<AreaObject> targets;

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
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskDescriptorImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.TASK_DESCRIPTOR;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<AreaObject> getTargets() {
                if (targets == null) {
                        targets = new EObjectResolvingEList<AreaObject>(AreaObject.class, this, DronePackage.TASK_DESCRIPTOR__TARGETS);
                }
                return targets;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, DronePackage.TASK_DESCRIPTOR__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Task getTask() {
                if (eContainerFeatureID() != DronePackage.TASK_DESCRIPTOR__TASK) return null;
                return (Task)eInternalContainer();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
                msgs = eBasicSetContainer((InternalEObject)newTask, DronePackage.TASK_DESCRIPTOR__TASK, msgs);
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTask(Task newTask) {
                if (newTask != eInternalContainer() || (eContainerFeatureID() != DronePackage.TASK_DESCRIPTOR__TASK && newTask != null)) {
                        if (EcoreUtil.isAncestor(this, newTask))
                                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
                        NotificationChain msgs = null;
                        if (eInternalContainer() != null)
                                msgs = eBasicRemoveFromContainer(msgs);
                        if (newTask != null)
                                msgs = ((InternalEObject)newTask).eInverseAdd(this, DronePackage.TASK__DESCRIPTOR, Task.class, msgs);
                        msgs = basicSetTask(newTask, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.TASK_DESCRIPTOR__TASK, newTask, newTask));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.TASK_DESCRIPTOR__TASK:
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
                        case DronePackage.TASK_DESCRIPTOR__PROPERTIES:
                                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
                        case DronePackage.TASK_DESCRIPTOR__TASK:
                                return basicSetTask(null, msgs);
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
                        case DronePackage.TASK_DESCRIPTOR__TASK:
                                return eInternalContainer().eInverseRemove(this, DronePackage.TASK__DESCRIPTOR, Task.class, msgs);
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
                        case DronePackage.TASK_DESCRIPTOR__TARGETS:
                                return getTargets();
                        case DronePackage.TASK_DESCRIPTOR__PROPERTIES:
                                return getProperties();
                        case DronePackage.TASK_DESCRIPTOR__TASK:
                                return getTask();
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
                        case DronePackage.TASK_DESCRIPTOR__TARGETS:
                                getTargets().clear();
                                getTargets().addAll((Collection<? extends AreaObject>)newValue);
                                return;
                        case DronePackage.TASK_DESCRIPTOR__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case DronePackage.TASK_DESCRIPTOR__TASK:
                                setTask((Task)newValue);
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
                        case DronePackage.TASK_DESCRIPTOR__TARGETS:
                                getTargets().clear();
                                return;
                        case DronePackage.TASK_DESCRIPTOR__PROPERTIES:
                                getProperties().clear();
                                return;
                        case DronePackage.TASK_DESCRIPTOR__TASK:
                                setTask((Task)null);
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
                        case DronePackage.TASK_DESCRIPTOR__TARGETS:
                                return targets != null && !targets.isEmpty();
                        case DronePackage.TASK_DESCRIPTOR__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case DronePackage.TASK_DESCRIPTOR__TASK:
                                return getTask() != null;
                }
                return super.eIsSet(featureID);
        }

} //TaskDescriptorImpl
