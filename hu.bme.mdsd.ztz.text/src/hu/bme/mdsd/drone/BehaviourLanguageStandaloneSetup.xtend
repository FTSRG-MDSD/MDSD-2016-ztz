/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.drone


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BehaviourLanguageStandaloneSetup extends BehaviourLanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new BehaviourLanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
