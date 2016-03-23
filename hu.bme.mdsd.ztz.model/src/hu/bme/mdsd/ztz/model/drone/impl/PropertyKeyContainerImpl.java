/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.PropertyKeyContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Key Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.PropertyKeyContainerImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyKeyContainerImpl extends NamedElementImpl implements PropertyKeyContainer {
        /**
         * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getKeys()
         * @generated
         * @ordered
         */
        protected EList<PropertyKey> keys;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected PropertyKeyContainerImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.PROPERTY_KEY_CONTAINER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<PropertyKey> getKeys() {
                if (keys == null) {
                        keys = new EObjectContainmentEList<PropertyKey>(PropertyKey.class, this, DronePackage.PROPERTY_KEY_CONTAINER__KEYS);
                }
                return keys;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.PROPERTY_KEY_CONTAINER__KEYS:
                                return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
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
                        case DronePackage.PROPERTY_KEY_CONTAINER__KEYS:
                                return getKeys();
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
                        case DronePackage.PROPERTY_KEY_CONTAINER__KEYS:
                                getKeys().clear();
                                getKeys().addAll((Collection<? extends PropertyKey>)newValue);
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
                        case DronePackage.PROPERTY_KEY_CONTAINER__KEYS:
                                getKeys().clear();
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
                        case DronePackage.PROPERTY_KEY_CONTAINER__KEYS:
                                return keys != null && !keys.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //PropertyKeyContainerImpl
