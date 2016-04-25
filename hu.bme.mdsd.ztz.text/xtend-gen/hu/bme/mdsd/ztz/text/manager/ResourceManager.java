package hu.bme.mdsd.ztz.text.manager;

import com.google.common.base.Objects;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ResourceManager {
  @Accessors
  private String importedModelPath = "";
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private ResourceSetImpl resourceSet;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Resource resource;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String acceptedDomain = "drone";
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final String modelFolder = "../model/";
  
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
  
  protected Resource load(final URI resourceURI) {
    Resource _xblockexpression = null;
    {
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
      _xblockexpression = this.resource = _resource;
    }
    return _xblockexpression;
  }
  
  public Resource load(final Import imp) {
    Resource _xifexpression = null;
    String _importURI = imp.getImportURI();
    boolean _equals = this.importedModelPath.equals(_importURI);
    boolean _not = (!_equals);
    if (_not) {
      Resource _xblockexpression = null;
      {
        String _importURI_1 = imp.getImportURI();
        this.importedModelPath = _importURI_1;
        Resource _eResource = imp.eResource();
        URI _uRI = _eResource.getURI();
        final String platformString = _uRI.toPlatformString(true);
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        Path _path = new Path(platformString);
        final IFile myFile = _root.getFile(_path);
        final IProject proj = myFile.getProject();
        IWorkspace _workspace_1 = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root_1 = _workspace_1.getRoot();
        IPath _fullPath = _root_1.getFullPath();
        String _oSString = _fullPath.toOSString();
        Path _path_1 = new Path(_oSString);
        IPath _fullPath_1 = proj.getFullPath();
        IPath _append = _path_1.append(_fullPath_1);
        Path _path_2 = new Path("/model/");
        String _oSString_1 = _path_2.toOSString();
        IPath _append_1 = _append.append(_oSString_1);
        String _importURI_2 = imp.getImportURI();
        final IPath modelPath = _append_1.append(_importURI_2);
        String _oSString_2 = modelPath.toOSString();
        URI _createPlatformResourceURI = URI.createPlatformResourceURI(_oSString_2, true);
        _xblockexpression = this.load(_createPlatformResourceURI);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
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
  
  @Pure
  public String getAcceptedDomain() {
    return this.acceptedDomain;
  }
  
  @Pure
  public String getModelFolder() {
    return this.modelFolder;
  }
}
