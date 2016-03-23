/**
 */
package hu.bme.mdsd.ztz.model.behaviour.provider;


import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.Message;

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
 * This is the item provider adapter for a {@link hu.bme.mdsd.ztz.model.behaviour.Message} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageItemProvider 
        extends NamedElementItemProvider {
        /**
         * This constructs an instance from a factory and a notifier.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MessageItemProvider(AdapterFactory adapterFactory) {
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

                        addInvolvedTaskExecutionsPropertyDescriptor(object);
                        addTimestampPropertyDescriptor(object);
                        addReferredObjectsPropertyDescriptor(object);
                        addNeedResponsePropertyDescriptor(object);
                        addFollowsPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Involved Task Executions feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addInvolvedTaskExecutionsPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Message_involvedTaskExecutions_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Message_involvedTaskExecutions_feature", "_UI_Message_type"),
                                 BehaviourPackage.Literals.MESSAGE__INVOLVED_TASK_EXECUTIONS,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Timestamp feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addTimestampPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Message_timestamp_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Message_timestamp_feature", "_UI_Message_type"),
                                 BehaviourPackage.Literals.MESSAGE__TIMESTAMP,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Referred Objects feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addReferredObjectsPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Message_referredObjects_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Message_referredObjects_feature", "_UI_Message_type"),
                                 BehaviourPackage.Literals.MESSAGE__REFERRED_OBJECTS,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Need Response feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addNeedResponsePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Message_needResponse_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Message_needResponse_feature", "_UI_Message_type"),
                                 BehaviourPackage.Literals.MESSAGE__NEED_RESPONSE,
                                 true,
                                 false,
                                 false,
                                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Follows feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addFollowsPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Message_follows_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Message_follows_feature", "_UI_Message_type"),
                                 BehaviourPackage.Literals.MESSAGE__FOLLOWS,
                                 true,
                                 false,
                                 true,
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
                        childrenFeatures.add(BehaviourPackage.Literals.MESSAGE__PROPERTIES);
                        childrenFeatures.add(BehaviourPackage.Literals.MESSAGE__TTL);
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
         * This returns Message.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/Message"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                String label = ((Message)object).getName();
                return label == null || label.length() == 0 ?
                        getString("_UI_Message_type") :
                        getString("_UI_Message_type") + " " + label;
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

                switch (notification.getFeatureID(Message.class)) {
                        case BehaviourPackage.MESSAGE__TIMESTAMP:
                        case BehaviourPackage.MESSAGE__NEED_RESPONSE:
                                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                                return;
                        case BehaviourPackage.MESSAGE__PROPERTIES:
                        case BehaviourPackage.MESSAGE__TTL:
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
                                (BehaviourPackage.Literals.MESSAGE__PROPERTIES,
                                 DroneFactory.eINSTANCE.createProperty()));

                newChildDescriptors.add
                        (createChildParameter
                                (BehaviourPackage.Literals.MESSAGE__TTL,
                                 DroneFactory.eINSTANCE.createMeasureValue()));
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
