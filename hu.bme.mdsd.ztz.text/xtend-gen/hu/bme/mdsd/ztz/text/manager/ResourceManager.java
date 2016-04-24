package hu.bme.mdsd.ztz.text.manager;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ResourceManager {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String importedModelPath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private ResourceSetImpl resourceSet;
  
  private static ResourceManager instance = null;
  
  protected Object ResourceManager() {
    return null;
  }
  
  public static ResourceManager getInstance() {
    boolean _equals = Objects.equal(ResourceManager.instance, null);
    if (_equals) {
      ResourceManager _resourceManager = new ResourceManager();
      ResourceManager.instance = _resourceManager;
    }
    return ResourceManager.instance;
  }
  
  @Pure
  public String getImportedModelPath() {
    return this.importedModelPath;
  }
  
  @Pure
  public ResourceSetImpl getResourceSet() {
    return this.resourceSet;
  }
}
