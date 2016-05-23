package hu.bme.mdsd.ztz.text.manager

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import hu.bme.mdsd.ztz.model.drone.DronePackage
import java.util.Map
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import com.google.common.io.Files
import java.io.File

class ResourceManager {
	
	@Accessors()
	var String importedModelPath = ""
	
	@Accessors(PUBLIC_GETTER)
	var ResourceSetImpl resourceSet
	
	@Accessors(PUBLIC_GETTER)
	var Resource resource
	
	@Accessors(PUBLIC_GETTER)
	var String acceptedDomain = "drone"
	
	@Accessors(PUBLIC_GETTER)
	val String modelFolder = "../model/"
	
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
	
	def protected load(URI resourceURI) {
		DronePackage.eINSTANCE.eClass()
		
		val Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE
	    val Map<String, Object> m = reg.getExtensionToFactoryMap()
	    m.put("drone", new XMIResourceFactoryImpl())
		
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl()
		}
		resource = resourceSet.getResource(resourceURI, true)
	}
	
	def load(Import imp) {
		if (!importedModelPath.equals(imp.importURI)){
			importedModelPath = imp.importURI
			val platformString = imp.eResource.URI.toPlatformString(true);
	    	val myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
	    	val proj = myFile.getProject();
	    	val IPath modelPath = new Path(ResourcesPlugin.getWorkspace().getRoot().fullPath.toOSString).
	    		append(proj.fullPath).
	    		append(new Path("/model/").toOSString).
	    		append(imp.importURI)
	    	load(URI.createPlatformResourceURI(modelPath.toOSString, true))
    	}
	}
	
	def boolean folderExist(Import imp) {
		if (!importedModelPath.equals(imp.importURI)){
			val platformString = imp.eResource.URI.toPlatformString(true);
	    	val myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
	    	val proj = myFile.getProject();
	    	val modelPath = new Path(ResourcesPlugin.getWorkspace().getRoot().fullPath.toOSString).
	    		append(proj.fullPath).
	    		append(new Path("/model/").toOSString)

	    	if (ResourcesPlugin.getWorkspace().getRoot().exists(modelPath)) {
	    		return true
	    	} else {
				return false
	    	}
	    }
		return true
	}
	
	
}