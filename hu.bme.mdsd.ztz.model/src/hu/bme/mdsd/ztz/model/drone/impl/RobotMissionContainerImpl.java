/**
 */
package hu.bme.mdsd.ztz.model.drone.impl;

import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
                }
                return super.eIsSet(featureID);
        }

} //RobotMissionContainerImpl
