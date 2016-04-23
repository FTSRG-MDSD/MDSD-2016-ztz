/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.PropertyKeyContainer;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Mission Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl#getMissions <em>Missions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl#getRobots <em>Robots</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl#getMeasureDimensions <em>Measure Dimensions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl#getAreaObjects <em>Area Objects</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl#getPropertyKeyContainer <em>Property Key Container</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.impl.RobotMissionContainerImpl#getTemporalElements <em>Temporal Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotMissionContainerImpl extends MinimalEObjectImpl.Container implements RobotMissionContainer {
        /**
	 * The cached value of the '{@link #getMissions() <em>Missions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMissions()
	 * @generated
	 * @ordered
	 */
        protected EList<Mission> missions;

        /**
	 * The cached value of the '{@link #getRobots() <em>Robots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getRobots()
	 * @generated
	 * @ordered
	 */
        protected EList<Robot> robots;

        /**
	 * The cached value of the '{@link #getMeasureDimensions() <em>Measure Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getMeasureDimensions()
	 * @generated
	 * @ordered
	 */
        protected EList<MeasureDimension> measureDimensions;

        /**
	 * The cached value of the '{@link #getAreaObjects() <em>Area Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getAreaObjects()
	 * @generated
	 * @ordered
	 */
        protected EList<AreaObject> areaObjects;

        /**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
        protected EList<Capability> capabilities;

        /**
	 * The cached value of the '{@link #getPropertyKeyContainer() <em>Property Key Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @see #getPropertyKeyContainer()
	 * @generated
	 * @ordered
	 */
        protected PropertyKeyContainer propertyKeyContainer;

        /**
	 * The cached value of the '{@link #getTemporalElements() <em>Temporal Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> temporalElements;

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        protected RobotMissionContainerImpl() {
		super();
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        protected EClass eStaticClass() {
		return DronePackage.Literals.ROBOT_MISSION_CONTAINER;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<Mission> getMissions() {
		if (missions == null) {
			missions = new EObjectContainmentEList<Mission>(Mission.class, this, DronePackage.ROBOT_MISSION_CONTAINER__MISSIONS);
		}
		return missions;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<Robot> getRobots() {
		if (robots == null) {
			robots = new EObjectContainmentEList<Robot>(Robot.class, this, DronePackage.ROBOT_MISSION_CONTAINER__ROBOTS);
		}
		return robots;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<MeasureDimension> getMeasureDimensions() {
		if (measureDimensions == null) {
			measureDimensions = new EObjectContainmentEList<MeasureDimension>(MeasureDimension.class, this, DronePackage.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS);
		}
		return measureDimensions;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<AreaObject> getAreaObjects() {
		if (areaObjects == null) {
			areaObjects = new EObjectContainmentEList<AreaObject>(AreaObject.class, this, DronePackage.ROBOT_MISSION_CONTAINER__AREA_OBJECTS);
		}
		return areaObjects;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, DronePackage.ROBOT_MISSION_CONTAINER__CAPABILITIES);
		}
		return capabilities;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public PropertyKeyContainer getPropertyKeyContainer() {
		return propertyKeyContainer;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public NotificationChain basicSetPropertyKeyContainer(PropertyKeyContainer newPropertyKeyContainer, NotificationChain msgs) {
		PropertyKeyContainer oldPropertyKeyContainer = propertyKeyContainer;
		propertyKeyContainer = newPropertyKeyContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER, oldPropertyKeyContainer, newPropertyKeyContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

        /**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public void setPropertyKeyContainer(PropertyKeyContainer newPropertyKeyContainer) {
		if (newPropertyKeyContainer != propertyKeyContainer) {
			NotificationChain msgs = null;
			if (propertyKeyContainer != null)
				msgs = ((InternalEObject)propertyKeyContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER, null, msgs);
			if (newPropertyKeyContainer != null)
				msgs = ((InternalEObject)newPropertyKeyContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER, null, msgs);
			msgs = basicSetPropertyKeyContainer(newPropertyKeyContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER, newPropertyKeyContainer, newPropertyKeyContainer));
	}

        /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTemporalElements() {
		if (temporalElements == null) {
			temporalElements = new EObjectContainmentEList<EObject>(EObject.class, this, DronePackage.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS);
		}
		return temporalElements;
	}

								/**
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DronePackage.ROBOT_MISSION_CONTAINER__MISSIONS:
				return ((InternalEList<?>)getMissions()).basicRemove(otherEnd, msgs);
			case DronePackage.ROBOT_MISSION_CONTAINER__ROBOTS:
				return ((InternalEList<?>)getRobots()).basicRemove(otherEnd, msgs);
			case DronePackage.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS:
				return ((InternalEList<?>)getMeasureDimensions()).basicRemove(otherEnd, msgs);
			case DronePackage.ROBOT_MISSION_CONTAINER__AREA_OBJECTS:
				return ((InternalEList<?>)getAreaObjects()).basicRemove(otherEnd, msgs);
			case DronePackage.ROBOT_MISSION_CONTAINER__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER:
				return basicSetPropertyKeyContainer(null, msgs);
			case DronePackage.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS:
				return ((InternalEList<?>)getTemporalElements()).basicRemove(otherEnd, msgs);
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
			case DronePackage.ROBOT_MISSION_CONTAINER__MISSIONS:
				return getMissions();
			case DronePackage.ROBOT_MISSION_CONTAINER__ROBOTS:
				return getRobots();
			case DronePackage.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS:
				return getMeasureDimensions();
			case DronePackage.ROBOT_MISSION_CONTAINER__AREA_OBJECTS:
				return getAreaObjects();
			case DronePackage.ROBOT_MISSION_CONTAINER__CAPABILITIES:
				return getCapabilities();
			case DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER:
				return getPropertyKeyContainer();
			case DronePackage.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS:
				return getTemporalElements();
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
			case DronePackage.ROBOT_MISSION_CONTAINER__MISSIONS:
				getMissions().clear();
				getMissions().addAll((Collection<? extends Mission>)newValue);
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__ROBOTS:
				getRobots().clear();
				getRobots().addAll((Collection<? extends Robot>)newValue);
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS:
				getMeasureDimensions().clear();
				getMeasureDimensions().addAll((Collection<? extends MeasureDimension>)newValue);
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__AREA_OBJECTS:
				getAreaObjects().clear();
				getAreaObjects().addAll((Collection<? extends AreaObject>)newValue);
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER:
				setPropertyKeyContainer((PropertyKeyContainer)newValue);
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS:
				getTemporalElements().clear();
				getTemporalElements().addAll((Collection<? extends EObject>)newValue);
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
			case DronePackage.ROBOT_MISSION_CONTAINER__MISSIONS:
				getMissions().clear();
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__ROBOTS:
				getRobots().clear();
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS:
				getMeasureDimensions().clear();
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__AREA_OBJECTS:
				getAreaObjects().clear();
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER:
				setPropertyKeyContainer((PropertyKeyContainer)null);
				return;
			case DronePackage.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS:
				getTemporalElements().clear();
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
			case DronePackage.ROBOT_MISSION_CONTAINER__MISSIONS:
				return missions != null && !missions.isEmpty();
			case DronePackage.ROBOT_MISSION_CONTAINER__ROBOTS:
				return robots != null && !robots.isEmpty();
			case DronePackage.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS:
				return measureDimensions != null && !measureDimensions.isEmpty();
			case DronePackage.ROBOT_MISSION_CONTAINER__AREA_OBJECTS:
				return areaObjects != null && !areaObjects.isEmpty();
			case DronePackage.ROBOT_MISSION_CONTAINER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER:
				return propertyKeyContainer != null;
			case DronePackage.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS:
				return temporalElements != null && !temporalElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotMissionContainerImpl
