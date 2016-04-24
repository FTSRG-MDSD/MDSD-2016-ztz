package hu.bme.mdsd.ztz.text.manager

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.Accessors

class ResourceManager {
	
	@Accessors(PUBLIC_GETTER)
	var String importedModelPath
	
	@Accessors(PUBLIC_GETTER)
	var ResourceSetImpl resourceSet
	
	var private static ResourceManager instance = null
	
	def protected ResourceManager() {
		
	}
	
	def static ResourceManager getInstance() {
		if (instance == null) {
			instance = new ResourceManager()
		}
		return instance
	}
	
	
}