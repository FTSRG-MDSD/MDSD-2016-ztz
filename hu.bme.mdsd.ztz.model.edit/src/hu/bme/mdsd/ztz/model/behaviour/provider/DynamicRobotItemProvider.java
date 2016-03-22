/**
 */
package hu.bme.mdsd.ztz.model.behaviour.provider;


import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.RobotStatus;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mdsd.ztz.model.behaviour.DynamicRobot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicRobotItemProvider 
        extends ItemProviderAdapter
        implements
                IEditingDomainItemProvider,
                IStructuredItemContentProvider,
                ITreeItemContentProvider,
                IItemLabelProvider,
                IItemPropertySource {
        /**
         * This constructs an instance from a factory and a notifier.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DynamicRobotItemProvider(AdapterFactory adapterFactory) {
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

                        addRobotPropertyDescriptor(object);
                        addStatusPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Robot feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addRobotPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DynamicRobot_robot_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DynamicRobot_robot_feature", "_UI_DynamicRobot_type"),
                                 BehaviourPackage.Literals.DYNAMIC_ROBOT__ROBOT,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Status feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addStatusPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_DynamicRobot_status_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_DynamicRobot_status_feature", "_UI_DynamicRobot_type"),
                                 BehaviourPackage.Literals.DYNAMIC_ROBOT__STATUS,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                        childrenFeatures.add(BehaviourPackage.Literals.DYNAMIC_ROBOT__DETECTED_OBJECTS);
                        childrenFeatures.add(BehaviourPackage.Literals.DYNAMIC_ROBOT__COLLABORATIONS);
                        childrenFeatures.add(BehaviourPackage.Literals.DYNAMIC_ROBOT__MESSAGE_REPOSITORY);
                        childrenFeatures.add(BehaviourPackage.Literals.DYNAMIC_ROBOT__ACTIONS);
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
         * This returns DynamicRobot.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/DynamicRobot"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                RobotStatus labelValue = ((DynamicRobot)object).getStatus();
                String label = labelValue == null ? null : labelValue.toString();
                return label == null || label.length() == 0 ?
                        getString("_UI_DynamicRobot_type") :
                        getString("_UI_DynamicRobot_type") + " " + label;
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

                switch (notification.getFeatureID(DynamicRobot.class)) {
                        case BehaviourPackage.DYNAMIC_ROBOT__STATUS:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case BehaviourPackage.DYNAMIC_ROBOT__DETECTED_OBJECTS:
                        case BehaviourPackage.DYNAMIC_ROBOT__COLLABORATIONS:
                        case BehaviourPackage.DYNAMIC_ROBOT__MESSAGE_REPOSITORY:
                        case BehaviourPackage.DYNAMIC_ROBOT__ACTIONS:
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
                                (BehaviourPackage.Literals.DYNAMIC_ROBOT__DETECTED_OBJECTS,
                                 BehaviourFactory.eINSTANCE.createDetectedObject()));

                newChildDescriptors.add
                        (createChildParameter
                                (BehaviourPackage.Literals.DYNAMIC_ROBOT__COLLABORATIONS,
                                 BehaviourFactory.eINSTANCE.createRobotCollaboration()));

                newChildDescriptors.add
                        (createChildParameter
                                (BehaviourPackage.Literals.DYNAMIC_ROBOT__MESSAGE_REPOSITORY,
                                 BehaviourFactory.eINSTANCE.createMessageRepository()));

                newChildDescriptors.add
                        (createChildParameter
                                (BehaviourPackage.Literals.DYNAMIC_ROBOT__ACTIONS,
                                 BehaviourFactory.eINSTANCE.createAction()));
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
