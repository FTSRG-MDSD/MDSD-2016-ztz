/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;

import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;

import hu.bme.mdsd.ztz.model.drone.impl.NamedElementImpl;
import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getInvolvedTaskExecutions <em>Involved Task Executions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getReferredObjects <em>Referred Objects</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#isNeedResponse <em>Need Response</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.MessageImpl#getTTL <em>TTL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
        /**
         * The cached value of the '{@link #getInvolvedTaskExecutions() <em>Involved Task Executions</em>}' reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getInvolvedTaskExecutions()
         * @generated
         * @ordered
         */
        protected EList<TaskExecution> involvedTaskExecutions;

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
         * The default value of the '{@link #isNeedResponse() <em>Need Response</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isNeedResponse()
         * @generated
         * @ordered
         */
        protected static final boolean NEED_RESPONSE_EDEFAULT = false;

        /**
         * The cached value of the '{@link #isNeedResponse() <em>Need Response</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #isNeedResponse()
         * @generated
         * @ordered
         */
        protected boolean needResponse = NEED_RESPONSE_EDEFAULT;

        /**
         * The cached value of the '{@link #getTTL() <em>TTL</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getTTL()
         * @generated
         * @ordered
         */
        protected MeasureValue ttl;

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
        public EList<TaskExecution> getInvolvedTaskExecutions() {
                if (involvedTaskExecutions == null) {
                        involvedTaskExecutions = new EObjectResolvingEList<TaskExecution>(TaskExecution.class, this, BehaviourPackage.MESSAGE__INVOLVED_TASK_EXECUTIONS);
                }
                return involvedTaskExecutions;
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
        public boolean isNeedResponse() {
                return needResponse;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setNeedResponse(boolean newNeedResponse) {
                boolean oldNeedResponse = needResponse;
                needResponse = newNeedResponse;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MESSAGE__NEED_RESPONSE, oldNeedResponse, needResponse));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getTTL() {
                return ttl;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetTTL(MeasureValue newTTL, NotificationChain msgs) {
                MeasureValue oldTTL = ttl;
                ttl = newTTL;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourPackage.MESSAGE__TTL, oldTTL, newTTL);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setTTL(MeasureValue newTTL) {
                if (newTTL != ttl) {
                        NotificationChain msgs = null;
                        if (ttl != null)
                                msgs = ((InternalEObject)ttl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.MESSAGE__TTL, null, msgs);
                        if (newTTL != null)
                                msgs = ((InternalEObject)newTTL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourPackage.MESSAGE__TTL, null, msgs);
                        msgs = basicSetTTL(newTTL, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.MESSAGE__TTL, newTTL, newTTL));
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
                        case BehaviourPackage.MESSAGE__TTL:
                                return basicSetTTL(null, msgs);
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
                        case BehaviourPackage.MESSAGE__INVOLVED_TASK_EXECUTIONS:
                                return getInvolvedTaskExecutions();
                        case BehaviourPackage.MESSAGE__TIMESTAMP:
                                return getTimestamp();
                        case BehaviourPackage.MESSAGE__PROPERTIES:
                                return getProperties();
                        case BehaviourPackage.MESSAGE__REFERRED_OBJECTS:
                                return getReferredObjects();
                        case BehaviourPackage.MESSAGE__NEED_RESPONSE:
                                return isNeedResponse();
                        case BehaviourPackage.MESSAGE__TTL:
                                return getTTL();
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
                        case BehaviourPackage.MESSAGE__INVOLVED_TASK_EXECUTIONS:
                                getInvolvedTaskExecutions().clear();
                                getInvolvedTaskExecutions().addAll((Collection<? extends TaskExecution>)newValue);
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
                        case BehaviourPackage.MESSAGE__NEED_RESPONSE:
                                setNeedResponse((Boolean)newValue);
                                return;
                        case BehaviourPackage.MESSAGE__TTL:
                                setTTL((MeasureValue)newValue);
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
                        case BehaviourPackage.MESSAGE__INVOLVED_TASK_EXECUTIONS:
                                getInvolvedTaskExecutions().clear();
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
                        case BehaviourPackage.MESSAGE__NEED_RESPONSE:
                                setNeedResponse(NEED_RESPONSE_EDEFAULT);
                                return;
                        case BehaviourPackage.MESSAGE__TTL:
                                setTTL((MeasureValue)null);
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
                        case BehaviourPackage.MESSAGE__INVOLVED_TASK_EXECUTIONS:
                                return involvedTaskExecutions != null && !involvedTaskExecutions.isEmpty();
                        case BehaviourPackage.MESSAGE__TIMESTAMP:
                                return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
                        case BehaviourPackage.MESSAGE__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case BehaviourPackage.MESSAGE__REFERRED_OBJECTS:
                                return referredObjects != null && !referredObjects.isEmpty();
                        case BehaviourPackage.MESSAGE__NEED_RESPONSE:
                                return needResponse != NEED_RESPONSE_EDEFAULT;
                        case BehaviourPackage.MESSAGE__TTL:
                                return ttl != null;
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
                result.append(", needResponse: ");
                result.append(needResponse);
                result.append(')');
                return result.toString();
        }

} //MessageImpl
