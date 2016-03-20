/**
 */
package drone.provider;


import drone.Battery;
import drone.DroneFactory;
import drone.DronePackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link drone.Battery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BatteryItemProvider 
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
        public BatteryItemProvider(AdapterFactory adapterFactory) {
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

                        addCapacityPropertyDescriptor(object);
                        addVoltagePropertyDescriptor(object);
                        addRechargeTimePropertyDescriptor(object);
                        addPropertiesPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Capacity feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCapacityPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Battery_capacity_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Battery_capacity_feature", "_UI_Battery_type"),
                                 DronePackage.Literals.BATTERY__CAPACITY,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Voltage feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addVoltagePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Battery_voltage_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Battery_voltage_feature", "_UI_Battery_type"),
                                 DronePackage.Literals.BATTERY__VOLTAGE,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Recharge Time feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addRechargeTimePropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Battery_rechargeTime_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Battery_rechargeTime_feature", "_UI_Battery_type"),
                                 DronePackage.Literals.BATTERY__RECHARGE_TIME,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Properties feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addPropertiesPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Battery_properties_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Battery_properties_feature", "_UI_Battery_type"),
                                 DronePackage.Literals.BATTERY__PROPERTIES,
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
                        childrenFeatures.add(DronePackage.Literals.BATTERY__CAPACITY);
                        childrenFeatures.add(DronePackage.Literals.BATTERY__VOLTAGE);
                        childrenFeatures.add(DronePackage.Literals.BATTERY__RECHARGE_TIME);
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
         * This returns Battery.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/Battery"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                return getString("_UI_Battery_type");
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

                switch (notification.getFeatureID(Battery.class)) {
                        case DronePackage.BATTERY__CAPACITY:
                        case DronePackage.BATTERY__VOLTAGE:
                        case DronePackage.BATTERY__RECHARGE_TIME:
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
                                (DronePackage.Literals.BATTERY__CAPACITY,
                                 DroneFactory.eINSTANCE.createMeasureValue()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.BATTERY__VOLTAGE,
                                 DroneFactory.eINSTANCE.createMeasureValue()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.BATTERY__RECHARGE_TIME,
                                 DroneFactory.eINSTANCE.createMeasureValue()));
        }

        /**
         * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
                Object childFeature = feature;
                Object childObject = child;

                boolean qualify =
                        childFeature == DronePackage.Literals.BATTERY__CAPACITY ||
                        childFeature == DronePackage.Literals.BATTERY__VOLTAGE ||
                        childFeature == DronePackage.Literals.BATTERY__RECHARGE_TIME;

                if (qualify) {
                        return getString
                                ("_UI_CreateChild_text2",
                                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
                }
                return super.getCreateChildText(owner, feature, child, selection);
        }

        /**
         * Return the resource locator for this item provider's resources.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator() {
                return DroneEditPlugin.INSTANCE;
        }

}
