/**
 */
package hu.bme.mdsd.ztz.model.behaviourModel.impl;

import hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelPackage;
import hu.bme.mdsd.ztz.model.behaviourModel.Message;

import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.Task;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviourModel.impl.MessageImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviourModel.impl.MessageImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
        /**
         * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getProperties()
         * @generated
         * @ordered
         */
        protected EList<Property> properties;

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
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MessageImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourModelPackage.Literals.MESSAGE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectResolvingEList<Property>(Property.class, this, BehaviourModelPackage.MESSAGE__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Task> getTasks() {
                if (tasks == null) {
                        tasks = new EObjectResolvingEList<Task>(Task.class, this, BehaviourModelPackage.MESSAGE__TASKS);
                }
                return tasks;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourModelPackage.MESSAGE__PROPERTIES:
                                return getProperties();
                        case BehaviourModelPackage.MESSAGE__TASKS:
                                return getTasks();
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
                        case BehaviourModelPackage.MESSAGE__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case BehaviourModelPackage.MESSAGE__TASKS:
                                getTasks().clear();
                                getTasks().addAll((Collection<? extends Task>)newValue);
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
                        case BehaviourModelPackage.MESSAGE__PROPERTIES:
                                getProperties().clear();
                                return;
                        case BehaviourModelPackage.MESSAGE__TASKS:
                                getTasks().clear();
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
                        case BehaviourModelPackage.MESSAGE__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case BehaviourModelPackage.MESSAGE__TASKS:
                                return tasks != null && !tasks.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //MessageImpl
