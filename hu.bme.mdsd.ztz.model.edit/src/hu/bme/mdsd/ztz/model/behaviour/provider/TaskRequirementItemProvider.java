/**
 */
package hu.bme.mdsd.ztz.model.behaviour.provider;


import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;

import hu.bme.mdsd.ztz.model.drone.provider.NamedElementItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mdsd.ztz.model.behaviour.TaskRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskRequirementItemProvider extends NamedElementItemProvider {
        /**
         * This constructs an instance from a factory and a notifier.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskRequirementItemProvider(AdapterFactory adapterFactory) {
                super(adapterFactory);
        }

        /**
         * This returns the property descriptors for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
                if (itemPropertyDescriptors == null) {
                        super.getPropertyDescriptors(object);

                        addTaskExecutionPropertyDescriptor(object);
                        addPrerequisitePropertyDescriptor(object);
                        addParticipantsPropertyDescriptor(object);
                        addRequiredCapabilitiesPropertyDescriptor(object);
                        addDescriptorPropertyDescriptor(object);
                        addTaskPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Task Execution feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addTaskExecutionPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_TaskRequirement_taskExecution_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_TaskRequirement_taskExecution_feature", "_UI_TaskRequirement_type"),
                                 BehaviourPackage.Literals.TASK_REQUIREMENT__TASK_EXECUTION,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Task feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addTaskPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_TaskRequirement_task_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_TaskRequirement_task_feature", "_UI_TaskRequirement_type"),
                                 BehaviourPackage.Literals.TASK_REQUIREMENT__TASK,
                                 false,
                                 false,
                                 false,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Prerequisite feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addPrerequisitePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_TaskRequirement_prerequisite_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_TaskRequirement_prerequisite_feature", "_UI_TaskRequirement_type"),
                                 BehaviourPackage.Literals.TASK_REQUIREMENT__PREREQUISITE,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Participants feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addParticipantsPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_TaskRequirement_participants_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_TaskRequirement_participants_feature", "_UI_TaskRequirement_type"),
                                 BehaviourPackage.Literals.TASK_REQUIREMENT__PARTICIPANTS,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Required Capabilities feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addRequiredCapabilitiesPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_TaskRequirement_requiredCapabilities_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_TaskRequirement_requiredCapabilities_feature", "_UI_TaskRequirement_type"),
                                 BehaviourPackage.Literals.TASK_REQUIREMENT__REQUIRED_CAPABILITIES,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Descriptor feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addDescriptorPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_TaskRequirement_descriptor_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_TaskRequirement_descriptor_feature", "_UI_TaskRequirement_type"),
                                 BehaviourPackage.Literals.TASK_REQUIREMENT__DESCRIPTOR,
                                 false,
                                 false,
                                 false,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
         * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
         * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
                if (childrenFeatures == null) {
                        super.getChildrenFeatures(object);
                        childrenFeatures.add(BehaviourPackage.Literals.TASK_REQUIREMENT__PROPERTIES);
                        childrenFeatures.add(BehaviourPackage.Literals.TASK_REQUIREMENT__CAPABILITY_PROPERTIES);
                }
                return childrenFeatures;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EStructuralFeature getChildFeature(Object object, Object child) {
                // Check the type of the specified child object and return the proper feature to use for
                // adding (see {@link AddCommand}) it as a child.

                return super.getChildFeature(object, child);
        }

        /**
         * This returns TaskRequirement.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskRequirement"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                String label = ((TaskRequirement)object).getName();
                return label == null || label.length() == 0 ?
                        getString("_UI_TaskRequirement_type") :
                        getString("_UI_TaskRequirement_type") + " " + label;
        }
        

        /**
         * This handles model notifications by calling {@link #updateChildren} to update any cached
         * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void notifyChanged(Notification notification) {
                updateChildren(notification);

                switch (notification.getFeatureID(TaskRequirement.class)) {
                        case BehaviourPackage.TASK_REQUIREMENT__PARTICIPANTS:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case BehaviourPackage.TASK_REQUIREMENT__PROPERTIES:
                        case BehaviourPackage.TASK_REQUIREMENT__CAPABILITY_PROPERTIES:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                                return;
                }
                super.notifyChanged(notification);
        }

        /**
         * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
         * that can be created under this object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
                super.collectNewChildDescriptors(newChildDescriptors, object);

                newChildDescriptors.add
                        (createChildParameter
                                (BehaviourPackage.Literals.TASK_REQUIREMENT__PROPERTIES,
                                 DroneFactory.eINSTANCE.createProperty()));

                newChildDescriptors.add
                        (createChildParameter
                                (BehaviourPackage.Literals.TASK_REQUIREMENT__CAPABILITY_PROPERTIES,
                                 DroneFactory.eINSTANCE.createCapabilityProperties()));
        }

        /**
         * Return the resource locator for this item provider's resources.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator() {
                return BehaviourEditPlugin.INSTANCE;
        }

}
