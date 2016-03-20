/**
 */
package drone.provider;


import behaviourModel.BehaviourModelFactory;

import drone.DroneFactory;
import drone.DronePackage;
import drone.Robot;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link drone.Robot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotItemProvider extends NamedElementItemProvider {
        /**
         * This constructs an instance from a factory and a notifier.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotItemProvider(AdapterFactory adapterFactory) {
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

                        addTasksPropertyDescriptor(object);
                        addMissionPropertyDescriptor(object);
                        addCapabilityPropertyDescriptor(object);
                        addCommunicationActionPropertyDescriptor(object);
                }
                return itemPropertyDescriptors;
        }

        /**
         * This adds a property descriptor for the Tasks feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addTasksPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Robot_tasks_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Robot_tasks_feature", "_UI_Robot_type"),
                                 DronePackage.Literals.ROBOT__TASKS,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Mission feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addMissionPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Robot_mission_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Robot_mission_feature", "_UI_Robot_type"),
                                 DronePackage.Literals.ROBOT__MISSION,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Capability feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCapabilityPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Robot_capability_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Robot_capability_feature", "_UI_Robot_type"),
                                 DronePackage.Literals.ROBOT__CAPABILITY,
                                 true,
                                 false,
                                 true,
                                 null,
                                 null,
                                 null));
        }

        /**
         * This adds a property descriptor for the Communication Action feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void addCommunicationActionPropertyDescriptor(Object object) {
                itemPropertyDescriptors.add
                        (createItemPropertyDescriptor
                                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                                 getResourceLocator(),
                                 getString("_UI_Robot_communicationAction_feature"),
                                 getString("_UI_PropertyDescriptor_description", "_UI_Robot_communicationAction_feature", "_UI_Robot_type"),
                                 DronePackage.Literals.ROBOT__COMMUNICATION_ACTION,
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
                        childrenFeatures.add(DronePackage.Literals.ROBOT__POSITION);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__SIZE);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__BATTERIES);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__COLLABORATIONS);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__DETECTED_OBJECTS);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__EQUIPMENTS);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__PROPERTIES);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__COMMUNICATION_RANGE);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__WEIGHT);
                        childrenFeatures.add(DronePackage.Literals.ROBOT__ACTIONS);
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
         * This returns Robot.gif.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object getImage(Object object) {
                return overlayImage(object, getResourceLocator().getImage("full/obj16/Robot"));
        }

        /**
         * This returns the label text for the adapted class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String getText(Object object) {
                String label = ((Robot)object).getName();
                return label == null || label.length() == 0 ?
                        getString("_UI_Robot_type") :
                        getString("_UI_Robot_type") + " " + label;
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

                switch (notification.getFeatureID(Robot.class)) {
                        case DronePackage.ROBOT__POSITION:
                        case DronePackage.ROBOT__SIZE:
                        case DronePackage.ROBOT__BATTERIES:
                        case DronePackage.ROBOT__COLLABORATIONS:
                        case DronePackage.ROBOT__DETECTED_OBJECTS:
                        case DronePackage.ROBOT__EQUIPMENTS:
                        case DronePackage.ROBOT__PROPERTIES:
                        case DronePackage.ROBOT__COMMUNICATION_RANGE:
                        case DronePackage.ROBOT__WEIGHT:
                        case DronePackage.ROBOT__ACTIONS:
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
                                (DronePackage.Literals.ROBOT__POSITION,
                                 DroneFactory.eINSTANCE.createPosition()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__SIZE,
                                 DroneFactory.eINSTANCE.createSize()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__BATTERIES,
                                 DroneFactory.eINSTANCE.createBattery()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__COLLABORATIONS,
                                 DroneFactory.eINSTANCE.createRobotCollaboration()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__DETECTED_OBJECTS,
                                 DroneFactory.eINSTANCE.createDetectedObject()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__EQUIPMENTS,
                                 DroneFactory.eINSTANCE.createEquipment()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__PROPERTIES,
                                 DroneFactory.eINSTANCE.createProperty()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__COMMUNICATION_RANGE,
                                 DroneFactory.eINSTANCE.createMeasureValue()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__WEIGHT,
                                 DroneFactory.eINSTANCE.createMeasureValue()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__ACTIONS,
                                 DroneFactory.eINSTANCE.createAction()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__ACTIONS,
                                 BehaviourModelFactory.eINSTANCE.createCommunicationAction()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__ACTIONS,
                                 BehaviourModelFactory.eINSTANCE.createUnicast()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__ACTIONS,
                                 BehaviourModelFactory.eINSTANCE.createMulticast()));

                newChildDescriptors.add
                        (createChildParameter
                                (DronePackage.Literals.ROBOT__ACTIONS,
                                 BehaviourModelFactory.eINSTANCE.createBroadcast()));
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
                        childFeature == DronePackage.Literals.ROBOT__COMMUNICATION_RANGE ||
                        childFeature == DronePackage.Literals.ROBOT__WEIGHT;

                if (qualify) {
                        return getString
                                ("_UI_CreateChild_text2",
                                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
                }
                return super.getCreateChildText(owner, feature, child, selection);
        }

}
