/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusCondition;
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusCondition;
import hu.bme.mdsd.ztz.text.manager.ResourceManager;
import hu.bme.mdsd.ztz.text.scoping.AbstractBehaviourLanguageScopeProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class BehaviourLanguageScopeProvider extends AbstractBehaviourLanguageScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    final ResourceManager manager = ResourceManager.getInstance();
    String _importedModelPath = manager.getImportedModelPath();
    boolean _isEmpty = _importedModelPath.isEmpty();
    if (_isEmpty) {
      Resource _eResource = context.eResource();
      EList<EObject> _contents = _eResource.getContents();
      EObject _get = _contents.get(0);
      final Import imp = ((BehaviourLanguage) _get).getImportModel();
      String _importURI = imp.getImportURI();
      String _acceptedDomain = manager.getAcceptedDomain();
      boolean _endsWith = _importURI.endsWith(_acceptedDomain);
      if (_endsWith) {
        manager.load(imp);
      }
    }
    return this.scopeForContext(context, reference, manager);
  }
  
  protected IScope _scopeForContext(final EObject context, final EReference reference, final ResourceManager manager) {
    return super.getScope(context, reference);
  }
  
  protected IScope _scopeForContext(final DynamicRobot context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _and = false;
      boolean _equals = Objects.equal(reference, BehaviourPackage.Literals.DYNAMIC_ROBOT__ROBOT);
      if (!_equals) {
        _and = false;
      } else {
        Resource _resource = manager.getResource();
        boolean _notEquals = (!Objects.equal(_resource, null));
        _and = _notEquals;
      }
      if (_and) {
        RobotMissionContainer _container = this.getContainer(manager);
        List<Robot> _allContentsOfType = EcoreUtil2.<Robot>getAllContentsOfType(_container, Robot.class);
        return Scopes.scopeFor(_allContentsOfType);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final TaskExecution context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _and = false;
      boolean _equals = Objects.equal(reference, BehaviourPackage.Literals.TASK_EXECUTION__TASK);
      if (!_equals) {
        _and = false;
      } else {
        Resource _resource = manager.getResource();
        boolean _notEquals = (!Objects.equal(_resource, null));
        _and = _notEquals;
      }
      if (_and) {
        RobotMissionContainer _container = this.getContainer(manager);
        List<Task> _allContentsOfType = EcoreUtil2.<Task>getAllContentsOfType(_container, Task.class);
        return Scopes.scopeFor(_allContentsOfType);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final Message context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _and = false;
      boolean _equals = Objects.equal(reference, BehaviourPackage.Literals.MESSAGE__REFERRED_OBJECTS);
      if (!_equals) {
        _and = false;
      } else {
        Resource _resource = manager.getResource();
        boolean _notEquals = (!Objects.equal(_resource, null));
        _and = _notEquals;
      }
      if (_and) {
        RobotMissionContainer _container = this.getContainer(manager);
        List<AreaObject> _allContentsOfType = EcoreUtil2.<AreaObject>getAllContentsOfType(_container, AreaObject.class);
        return Scopes.scopeFor(_allContentsOfType);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final TaskRequirement context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _and = false;
      boolean _equals = Objects.equal(reference, BehaviourPackage.Literals.TASK_REQUIREMENT__REQUIRED_CAPABILITIES);
      if (!_equals) {
        _and = false;
      } else {
        Resource _resource = manager.getResource();
        boolean _notEquals = (!Objects.equal(_resource, null));
        _and = _notEquals;
      }
      if (_and) {
        RobotMissionContainer _container = this.getContainer(manager);
        List<Capability> _allContentsOfType = EcoreUtil2.<Capability>getAllContentsOfType(_container, Capability.class);
        return Scopes.scopeFor(_allContentsOfType);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final DetectionStatement context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      Resource _resource = manager.getResource();
      boolean _notEquals = (!Objects.equal(_resource, null));
      if (_notEquals) {
        boolean _equals = Objects.equal(reference, BehaviourLanguagePackage.Literals.DETECTION_STATEMENT__OBJECT);
        if (_equals) {
          RobotMissionContainer _container = this.getContainer(manager);
          List<AreaObject> _allContentsOfType = EcoreUtil2.<AreaObject>getAllContentsOfType(_container, AreaObject.class);
          return Scopes.scopeFor(_allContentsOfType);
        }
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final Property context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      EObject _eContainer = context.eContainer();
      if ((_eContainer instanceof ActionImplementation)) {
      }
      boolean _and = false;
      boolean _equals = Objects.equal(reference, DronePackage.Literals.PROPERTY__KEY);
      if (!_equals) {
        _and = false;
      } else {
        Resource _resource = manager.getResource();
        boolean _notEquals = (!Objects.equal(_resource, null));
        _and = _notEquals;
      }
      if (_and) {
        final EObject container = context.eContainer();
        if ((container instanceof ActionImplementation)) {
          ActionDeclarationStatement _declaration = ((ActionImplementation)container).getDeclaration();
          EList<PropertyKey> _properties = _declaration.getProperties();
          return Scopes.scopeFor(_properties);
        }
        RobotMissionContainer _container = this.getContainer(manager);
        List<PropertyKey> _allContentsOfType = EcoreUtil2.<PropertyKey>getAllContentsOfType(_container, PropertyKey.class);
        final Set<PropertyKey> droneProperties = IterableExtensions.<PropertyKey>toSet(_allContentsOfType);
        Resource _eResource = context.eResource();
        TreeIterator<EObject> _allContents = _eResource.getAllContents();
        Iterator<PropertyKey> _filter = Iterators.<PropertyKey>filter(_allContents, PropertyKey.class);
        Set<PropertyKey> _set = IteratorExtensions.<PropertyKey>toSet(_filter);
        droneProperties.addAll(_set);
        return Scopes.scopeFor(droneProperties);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final ActionDeclarationStatement context, final EReference reference, final ResourceManager manager) {
    boolean _equals = Objects.equal(reference, BehaviourLanguagePackage.Literals.ACTION_DECLARATION_STATEMENT__PROPERTIES);
    if (_equals) {
      RobotMissionContainer _container = this.getContainer(manager);
      List<PropertyKey> _allContentsOfType = EcoreUtil2.<PropertyKey>getAllContentsOfType(_container, PropertyKey.class);
      final Set<PropertyKey> droneProperties = IterableExtensions.<PropertyKey>toSet(_allContentsOfType);
      Resource _eResource = context.eResource();
      TreeIterator<EObject> _allContents = _eResource.getAllContents();
      Iterator<PropertyKey> _filter = Iterators.<PropertyKey>filter(_allContents, PropertyKey.class);
      Set<PropertyKey> _set = IteratorExtensions.<PropertyKey>toSet(_filter);
      droneProperties.addAll(_set);
      return Scopes.scopeFor(droneProperties);
    }
    return null;
  }
  
  protected IScope _scopeForContext(final MeasureValue context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _and = false;
      boolean _equals = Objects.equal(reference, DronePackage.Literals.MEASURE_VALUE__DIMENSION);
      if (!_equals) {
        _and = false;
      } else {
        Resource _resource = manager.getResource();
        boolean _notEquals = (!Objects.equal(_resource, null));
        _and = _notEquals;
      }
      if (_and) {
        RobotMissionContainer _container = this.getContainer(manager);
        List<MeasureDimension> _allContentsOfType = EcoreUtil2.<MeasureDimension>getAllContentsOfType(_container, MeasureDimension.class);
        return Scopes.scopeFor(_allContentsOfType);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final CapabilityProperties context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _and = false;
      boolean _equals = Objects.equal(reference, DronePackage.Literals.CAPABILITY_PROPERTIES__CAPABILITY);
      if (!_equals) {
        _and = false;
      } else {
        Resource _resource = manager.getResource();
        boolean _notEquals = (!Objects.equal(_resource, null));
        _and = _notEquals;
      }
      if (_and) {
        RobotMissionContainer _container = this.getContainer(manager);
        List<Capability> _allContentsOfType = EcoreUtil2.<Capability>getAllContentsOfType(_container, Capability.class);
        return Scopes.scopeFor(_allContentsOfType);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final TaskStatusCondition context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _equals = Objects.equal(reference, BehaviourLanguagePackage.Literals.TASK_STATUS_CONDITION__TASK_STATUS);
      if (_equals) {
        EList<EEnumLiteral> _eLiterals = BehaviourPackage.Literals.TASK_EXECUTION_STATUS.getELiterals();
        return Scopes.scopeFor(_eLiterals);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected IScope _scopeForContext(final RobotStatusCondition context, final EReference reference, final ResourceManager manager) {
    IScope _xblockexpression = null;
    {
      boolean _equals = Objects.equal(reference, BehaviourLanguagePackage.Literals.ROBOT_STATUS_CONDITION__ROBOT_STATUS);
      if (_equals) {
        EList<EEnumLiteral> _eLiterals = BehaviourPackage.Literals.ROBOT_STATUS.getELiterals();
        return Scopes.scopeFor(_eLiterals);
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  protected RobotMissionContainer getContainer(final ResourceManager manager) {
    Resource _resource = manager.getResource();
    EList<EObject> _contents = _resource.getContents();
    EObject _get = _contents.get(0);
    return ((RobotMissionContainer) _get);
  }
  
  public IScope scopeForContext(final EObject context, final EReference reference, final ResourceManager manager) {
    if (context instanceof DetectionStatement) {
      return _scopeForContext((DetectionStatement)context, reference, manager);
    } else if (context instanceof DynamicRobot) {
      return _scopeForContext((DynamicRobot)context, reference, manager);
    } else if (context instanceof Message) {
      return _scopeForContext((Message)context, reference, manager);
    } else if (context instanceof TaskExecution) {
      return _scopeForContext((TaskExecution)context, reference, manager);
    } else if (context instanceof TaskRequirement) {
      return _scopeForContext((TaskRequirement)context, reference, manager);
    } else if (context instanceof MeasureValue) {
      return _scopeForContext((MeasureValue)context, reference, manager);
    } else if (context instanceof ActionDeclarationStatement) {
      return _scopeForContext((ActionDeclarationStatement)context, reference, manager);
    } else if (context instanceof RobotStatusCondition) {
      return _scopeForContext((RobotStatusCondition)context, reference, manager);
    } else if (context instanceof TaskStatusCondition) {
      return _scopeForContext((TaskStatusCondition)context, reference, manager);
    } else if (context instanceof CapabilityProperties) {
      return _scopeForContext((CapabilityProperties)context, reference, manager);
    } else if (context instanceof Property) {
      return _scopeForContext((Property)context, reference, manager);
    } else if (context != null) {
      return _scopeForContext(context, reference, manager);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(context, reference, manager).toString());
    }
  }
}
