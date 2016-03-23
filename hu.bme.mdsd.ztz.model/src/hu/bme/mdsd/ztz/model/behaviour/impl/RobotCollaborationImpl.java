/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;

import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.RobotCollaborationImpl#getCollaborator <em>Collaborator</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.RobotCollaborationImpl#getAvailabilityRange <em>Availability Range</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.RobotCollaborationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotCollaborationImpl extends MinimalEObjectImpl.Container implements RobotCollaboration {
        /**
         * The cached value of the '{@link #getCollaborator() <em>Collaborator</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCollaborator()
         * @generated
         * @ordered
         */
        protected DynamicRobot collaborator;

        /**
         * The cached setting delegate for the '{@link #getAvailabilityRange() <em>Availability Range</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getAvailabilityRange()
         * @generated
         * @ordered
         */
        protected EStructuralFeature.Internal.SettingDelegate AVAILABILITY_RANGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)BehaviourPackage.Literals.ROBOT_COLLABORATION__AVAILABILITY_RANGE).getSettingDelegate();

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
        protected RobotCollaborationImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.ROBOT_COLLABORATION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DynamicRobot getCollaborator() {
                if (collaborator != null && collaborator.eIsProxy()) {
                        InternalEObject oldCollaborator = (InternalEObject)collaborator;
                        collaborator = (DynamicRobot)eResolveProxy(oldCollaborator);
                        if (collaborator != oldCollaborator) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourPackage.ROBOT_COLLABORATION__COLLABORATOR, oldCollaborator, collaborator));
                        }
                }
                return collaborator;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DynamicRobot basicGetCollaborator() {
                return collaborator;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCollaborator(DynamicRobot newCollaborator) {
                DynamicRobot oldCollaborator = collaborator;
                collaborator = newCollaborator;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.ROBOT_COLLABORATION__COLLABORATOR, oldCollaborator, collaborator));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getAvailabilityRange() {
                return (MeasureValue)AVAILABILITY_RANGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue basicGetAvailabilityRange() {
                return (MeasureValue)AVAILABILITY_RANGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, BehaviourPackage.ROBOT_COLLABORATION__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.ROBOT_COLLABORATION__PROPERTIES:
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
                        case BehaviourPackage.ROBOT_COLLABORATION__COLLABORATOR:
                                if (resolve) return getCollaborator();
                                return basicGetCollaborator();
                        case BehaviourPackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE:
                                if (resolve) return getAvailabilityRange();
                                return basicGetAvailabilityRange();
                        case BehaviourPackage.ROBOT_COLLABORATION__PROPERTIES:
                                return getProperties();
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
                        case BehaviourPackage.ROBOT_COLLABORATION__COLLABORATOR:
                                setCollaborator((DynamicRobot)newValue);
                                return;
                        case BehaviourPackage.ROBOT_COLLABORATION__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
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
                        case BehaviourPackage.ROBOT_COLLABORATION__COLLABORATOR:
                                setCollaborator((DynamicRobot)null);
                                return;
                        case BehaviourPackage.ROBOT_COLLABORATION__PROPERTIES:
                                getProperties().clear();
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
                        case BehaviourPackage.ROBOT_COLLABORATION__COLLABORATOR:
                                return collaborator != null;
                        case BehaviourPackage.ROBOT_COLLABORATION__AVAILABILITY_RANGE:
                                return AVAILABILITY_RANGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
                        case BehaviourPackage.ROBOT_COLLABORATION__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //RobotCollaborationImpl
