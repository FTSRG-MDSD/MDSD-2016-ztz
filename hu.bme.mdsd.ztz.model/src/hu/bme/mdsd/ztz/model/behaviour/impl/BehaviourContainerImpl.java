/**
 */
package hu.bme.mdsd.ztz.model.behaviour.impl;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.CommunicationAction;

import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl#getCommunicationActions <em>Communication Actions</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.model.behaviour.impl.BehaviourContainerImpl#getMessageRepositories <em>Message Repositories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourContainerImpl extends MinimalEObjectImpl.Container implements BehaviourContainer {
        /**
         * The cached value of the '{@link #getCommunicationActions() <em>Communication Actions</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCommunicationActions()
         * @generated
         * @ordered
         */
        protected EList<CommunicationAction> communicationActions;

        /**
         * The cached value of the '{@link #getMessageRepositories() <em>Message Repositories</em>}' containment reference list.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getMessageRepositories()
         * @generated
         * @ordered
         */
        protected EList<MessageRepository> messageRepositories;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BehaviourContainerImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return BehaviourPackage.Literals.BEHAVIOUR_CONTAINER;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<CommunicationAction> getCommunicationActions() {
                if (communicationActions == null) {
                        communicationActions = new EObjectContainmentEList<CommunicationAction>(CommunicationAction.class, this, BehaviourPackage.BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS);
                }
                return communicationActions;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EList<MessageRepository> getMessageRepositories() {
                if (messageRepositories == null) {
                        messageRepositories = new EObjectContainmentEList<MessageRepository>(MessageRepository.class, this, BehaviourPackage.BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES);
                }
                return messageRepositories;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS:
                                return ((InternalEList<?>)getCommunicationActions()).basicRemove(otherEnd, msgs);
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES:
                                return ((InternalEList<?>)getMessageRepositories()).basicRemove(otherEnd, msgs);
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS:
                                return getCommunicationActions();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES:
                                return getMessageRepositories();
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS:
                                getCommunicationActions().clear();
                                getCommunicationActions().addAll((Collection<? extends CommunicationAction>)newValue);
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES:
                                getMessageRepositories().clear();
                                getMessageRepositories().addAll((Collection<? extends MessageRepository>)newValue);
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS:
                                getCommunicationActions().clear();
                                return;
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES:
                                getMessageRepositories().clear();
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
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__COMMUNICATION_ACTIONS:
                                return communicationActions != null && !communicationActions.isEmpty();
                        case BehaviourPackage.BEHAVIOUR_CONTAINER__MESSAGE_REPOSITORIES:
                                return messageRepositories != null && !messageRepositories.isEmpty();
                }
                return super.eIsSet(featureID);
        }

} //BehaviourContainerImpl
