/**
 */
package hu.bme.mdsd.ztz.model.drone.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Drone edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class DroneEditPlugin extends EMFPlugin {
        /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static final DroneEditPlugin INSTANCE = new DroneEditPlugin();

        /**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        private static Implementation plugin;

        /**
	 * Create the instance.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public DroneEditPlugin() {
		super
		  (new ResourceLocator [] {
		   });
	}

        /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
        @Override
        public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

        /**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
        public static Implementation getPlugin() {
		return plugin;
	}

        /**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
	 * @generated
	 */
        public static class Implementation extends EclipsePlugin {
                /**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
		 * @generated
		 */
                public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
        }

}
