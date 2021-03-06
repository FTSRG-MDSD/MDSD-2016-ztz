/**
 */
package hu.bme.mdsd.ztz.model.drone.provider;


import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.bme.mdsd.ztz.model.drone.RobotMissionContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotMissionContainerItemProvider 
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
        public RobotMissionContainerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(DronePackage.Literals.ROBOT_MISSION_CONTAINER__MISSIONS);
			childrenFeatures.add(DronePackage.Literals.ROBOT_MISSION_CONTAINER__ROBOTS);
			childrenFeatures.add(DronePackage.Literals.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS);
			childrenFeatures.add(DronePackage.Literals.ROBOT_MISSION_CONTAINER__AREA_OBJECTS);
			childrenFeatures.add(DronePackage.Literals.ROBOT_MISSION_CONTAINER__CAPABILITIES);
			childrenFeatures.add(DronePackage.Literals.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER);
			childrenFeatures.add(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS);
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
	 * This returns RobotMissionContainer.gif.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RobotMissionContainer"));
	}

        /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        @Override
        public String getText(Object object) {
		return getString("_UI_RobotMissionContainer_type");
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

		switch (notification.getFeatureID(RobotMissionContainer.class)) {
			case DronePackage.ROBOT_MISSION_CONTAINER__MISSIONS:
			case DronePackage.ROBOT_MISSION_CONTAINER__ROBOTS:
			case DronePackage.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS:
			case DronePackage.ROBOT_MISSION_CONTAINER__AREA_OBJECTS:
			case DronePackage.ROBOT_MISSION_CONTAINER__CAPABILITIES:
			case DronePackage.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER:
			case DronePackage.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS:
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
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__MISSIONS,
				 DroneFactory.eINSTANCE.createMission()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__ROBOTS,
				 DroneFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS,
				 DroneFactory.eINSTANCE.createMeasureDimension()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__AREA_OBJECTS,
				 DroneFactory.eINSTANCE.createAreaObject()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__CAPABILITIES,
				 DroneFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER,
				 DroneFactory.eINSTANCE.createPropertyKeyContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createMission()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createTaskDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createAreaObject()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createSize()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createBattery()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createEquipment()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createMeasureValue()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createMeasureConversion()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createMeasureDimension()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createRobotMissionContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createPropertyKeyContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createPropertyKey()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS,
				 DroneFactory.eINSTANCE.createCapabilityProperties()));
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
			childFeature == DronePackage.Literals.ROBOT_MISSION_CONTAINER__MISSIONS ||
			childFeature == DronePackage.Literals.ROBOT_MISSION_CONTAINER__TEMPORAL_ELEMENTS ||
			childFeature == DronePackage.Literals.ROBOT_MISSION_CONTAINER__ROBOTS ||
			childFeature == DronePackage.Literals.ROBOT_MISSION_CONTAINER__MEASURE_DIMENSIONS ||
			childFeature == DronePackage.Literals.ROBOT_MISSION_CONTAINER__AREA_OBJECTS ||
			childFeature == DronePackage.Literals.ROBOT_MISSION_CONTAINER__CAPABILITIES ||
			childFeature == DronePackage.Literals.ROBOT_MISSION_CONTAINER__PROPERTY_KEY_CONTAINER;

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
