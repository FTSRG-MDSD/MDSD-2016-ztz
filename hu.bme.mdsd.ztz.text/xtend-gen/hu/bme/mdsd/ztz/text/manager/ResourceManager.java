package hu.bme.mdsd.ztz.text.manager;

import com.google.common.base.Objects;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import java.util.Map;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ResourceManager {
  @Accessors
  private String importedModelPath = "";
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private ResourceSetImpl resourceSet;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Resource resource;
  
  private static ResourceManager instance = null;
  
  protected ResourceSetImpl ResourceManager() {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    return this.resourceSet = _resourceSetImpl;
  }
  
  public static ResourceManager getInstance() {
    boolean _equals = Objects.equal(ResourceManager.instance, null);
    if (_equals) {
      ResourceManager _resourceManager = new ResourceManager();
      ResourceManager.instance = _resourceManager;
    }
    return ResourceManager.instance;
  }
  
  public void load(final URI resourceURI) {
    InputOutput.<String>print("load resource");
    DronePackage.eINSTANCE.eClass();
    final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    final Map<String, Object> m = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("drone", _xMIResourceFactoryImpl);
    boolean _equals = Objects.equal(this.resourceSet, null);
    if (_equals) {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      this.resourceSet = _resourceSetImpl;
    }
    Resource _resource = this.resourceSet.getResource(resourceURI, true);
    this.resource = _resource;
    final TreeIterator<EObject> iterator = this.resource.getAllContents();
    while (iterator.hasNext()) {
      EObject _next = iterator.next();
      InputOutput.<EObject>println(_next);
    }
  }
  
  @Pure
  public String getImportedModelPath() {
    return this.importedModelPath;
  }
  
  public void setImportedModelPath(final String importedModelPath) {
    this.importedModelPath = importedModelPath;
  }
  
  @Pure
  public ResourceSetImpl getResourceSet() {
    return this.resourceSet;
  }
  
  @Pure
  public Resource getResource() {
    return this.resource;
  }
}
