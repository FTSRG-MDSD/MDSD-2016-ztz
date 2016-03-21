/**
 */
package drone.impl;

import drone.Capability;
import drone.CapabilityProperties;
import drone.DronePackage;
import drone.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.CapabilityPropertiesImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link drone.impl.CapabilityPropertiesImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityPropertiesImpl extends MinimalEObjectImpl.Container implements CapabilityProperties {
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
         * The cached value of the '{@link #getCapability() <em>Capability</em>}' reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCapability()
         * @generated
         * @ordered
         */
        protected Capability capability;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected CapabilityPropertiesImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.CAPABILITY_PROPERTIES;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<Property> getProperties() {
                if (properties == null) {
                        properties = new EObjectContainmentEList<Property>(Property.class, this, DronePackage.CAPABILITY_PROPERTIES__PROPERTIES);
                }
                return properties;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Capability getCapability() {
                if (capability != null && capability.eIsProxy()) {
                        InternalEObject oldCapability = (InternalEObject)capability;
                        capability = (Capability)eResolveProxy(oldCapability);
                        if (capability != oldCapability) {
                                if (eNotificationRequired())
                                        eNotify(new ENotificationImpl(this, Notification.RESOLVE, DronePackage.CAPABILITY_PROPERTIES__CAPABILITY, oldCapability, capability));
                        }
                }
                return capability;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Capability basicGetCapability() {
                return capability;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCapability(Capability newCapability) {
                Capability oldCapability = capability;
                capability = newCapability;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.CAPABILITY_PROPERTIES__CAPABILITY, oldCapability, capability));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.CAPABILITY_PROPERTIES__PROPERTIES:
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
                        case DronePackage.CAPABILITY_PROPERTIES__PROPERTIES:
                                return getProperties();
                        case DronePackage.CAPABILITY_PROPERTIES__CAPABILITY:
                                if (resolve) return getCapability();
                                return basicGetCapability();
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
                        case DronePackage.CAPABILITY_PROPERTIES__PROPERTIES:
                                getProperties().clear();
                                getProperties().addAll((Collection<? extends Property>)newValue);
                                return;
                        case DronePackage.CAPABILITY_PROPERTIES__CAPABILITY:
                                setCapability((Capability)newValue);
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
                        case DronePackage.CAPABILITY_PROPERTIES__PROPERTIES:
                                getProperties().clear();
                                return;
                        case DronePackage.CAPABILITY_PROPERTIES__CAPABILITY:
                                setCapability((Capability)null);
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
                        case DronePackage.CAPABILITY_PROPERTIES__PROPERTIES:
                                return properties != null && !properties.isEmpty();
                        case DronePackage.CAPABILITY_PROPERTIES__CAPABILITY:
                                return capability != null;
                }
                return super.eIsSet(featureID);
        }

} //CapabilityPropertiesImpl
