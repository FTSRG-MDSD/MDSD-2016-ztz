package hu.bme.mdsd.ztz.text.manager

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import hu.bme.mdsd.ztz.model.drone.DronePackage

class ResourceManager {
	
	@Accessors()
	var String importedModelPath = ""
	
	@Accessors(PUBLIC_GETTER)
	var ResourceSetImpl resourceSet
	
	var Resource resource
	
	var private static ResourceManager instance = null
	
	def protected ResourceManager() {
		resourceSet = new ResourceSetImpl()
	}
	
	def static ResourceManager getInstance() {
		if (instance == null) {
			instance = new ResourceManager()
		}
		return instance
	}
	
	def load(URI resourceURI) {
		print("load resource")
		DronePackage.eINSTANCE.eClass()
		println(resourceURI)
		println(resourceSet)
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl()
		}
		resource = resourceSet.getResource(resourceURI, true)
		
		println(resource)
		for (obj : resource.contents) {
				println(obj)
		}
	}
	
	
}