/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.Message;

import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.Task;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getReferredObjects <em>Referred Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
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
         * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTimestamp()
         * @generated
         * @ordered
         */
        protected static final Date TIMESTAMP_EDEFAULT = null;
        /**
         * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTimestamp()
         * @generated
         * @ordered
         */
        protected Date timestamp = TIMESTAMP_EDEFAULT;
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
         * The cached value of the '{@link #getReferredObjects() <em>Referred Objects</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getReferredObjects()
         * @generated
         * @ordered
         */
        protected EList<AreaObject> referredObjects;
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
                return BehaviourPackage.Literals.MESSAGE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Task> getTasks() {
                if (tasks == null) {
                        tasks = new EObjectResolvingEList<Task>(Task.class, this, BehaviourPackage.MESSAGE__TASKS);
                }
                return tasks;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Date getTimestamp() {
                return timestamp;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTimestamp(Date newTimestamp) {
                Date oldTimestamp = timestamp;
                timestamp = newTimestamp;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MESSAGE__TIMESTAMP, oldTimestamp, timestamp));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, BehaviourPackage.MESSAGE__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<AreaObject> getReferredObjects() {
                if (referredObjects == null) {
                        referredObjects = new EObjectResolvingEList<AreaObject>(AreaObject.class, this, BehaviourPackage.MESSAGE__REFERRED_OBJECTS);
                }
                return referredObjects;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.MESSAGE__PROPERTIES:
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
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case BehaviourPackage.MESSAGE__TASKS:
                                return getTasks();
                        case BehaviourPackage.MESSAGE__TIMESTAMP:
                                return getTimestamp();
                        case BehaviourPackage.MESSAGE__PROPERTIES:
                                return getProperties();
                        case BehaviourPackage.MESSAGE__REFERRED_OBJECTS:
                                return getReferredObjects();
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
                        case BehaviourPackage.MESSAGE__TASKS:
                                getTasks().clear();
                                getTasks().addAll((Collection<? extends Task>)newValue);
                                return;
                        case BehaviourPackage.MESSAGE__TIMESTAMP:
                                setTimestamp((Date)newValue);
                                return;
                        case BehaviourPackage.MESSAGE__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case BehaviourPackage.MESSAGE__REFERRED_OBJECTS:
                                getReferredObjects().clear();
                                getReferredObjects().addAll((Collection<? extends AreaObject>)newValue);
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
                        case BehaviourPackage.MESSAGE__TASKS:
                                getTasks().clear();
                                return;
                        case BehaviourPackage.MESSAGE__TIMESTAMP:
                                setTimestamp(TIMESTAMP_EDEFAULT);
                                return;
                        case BehaviourPackage.MESSAGE__PROPERTIES:
                                getProperties().clear();
                                return;
                        case BehaviourPackage.MESSAGE__REFERRED_OBJECTS:
                                getReferredObjects().clear();
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
                        case BehaviourPackage.MESSAGE__TASKS:
                                return tasks != null && !tasks.isEmpty();
                        case BehaviourPackage.MESSAGE__TIMESTAMP:
                                return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
                        case BehaviourPackage.MESSAGE__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case BehaviourPackage.MESSAGE__REFERRED_OBJECTS:
                                return referredObjects != null && !referredObjects.isEmpty();
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
                result.append(" (timestamp: ");
                result.append(timestamp);
                result.append(')');
                return result.toString();
        }

} //MessageImpl
