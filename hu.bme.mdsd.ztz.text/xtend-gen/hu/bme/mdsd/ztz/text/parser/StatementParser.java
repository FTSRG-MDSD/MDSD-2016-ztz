package hu.bme.mdsd.ztz.text.parser;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ExecutionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class StatementParser {
  public void parseStatements(final Resource resource, final Resource resourceOfBehaviour) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    final Iterator<Statement> statementIter = Iterators.<Statement>filter(_allContents, Statement.class);
    while (statementIter.hasNext()) {
      {
        final Statement statement = statementIter.next();
        this.parseStatement(statement, resourceOfBehaviour);
      }
    }
  }
  
  protected Boolean _parseStatement(final ActionStatement statement, final Resource resourceOfBehaviour) {
    boolean _xblockexpression = false;
    {
      final DynamicRobot robot = statement.getRobot();
      Action _action = statement.getAction();
      TaskExecution execution = _action.getCurrentTaskExecution();
      this.addExecution(execution, robot);
      EList<Action> _actions = robot.getActions();
      Action _action_1 = statement.getAction();
      _actions.add(_action_1);
      boolean _xifexpression = false;
      EList<Action> _moreactions = statement.getMoreactions();
      boolean _isEmpty = _moreactions.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        boolean _xblockexpression_1 = false;
        {
          EList<Action> _moreactions_1 = statement.getMoreactions();
          for (final Action action : _moreactions_1) {
            {
              TaskExecution _currentTaskExecution = action.getCurrentTaskExecution();
              execution = _currentTaskExecution;
              this.addExecution(execution, robot);
            }
          }
          DynamicRobot _robot = statement.getRobot();
          EList<Action> _actions_1 = _robot.getActions();
          EList<Action> _moreactions_2 = statement.getMoreactions();
          _xblockexpression_1 = _actions_1.addAll(_moreactions_2);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  public boolean addExecution(final TaskExecution execution, final DynamicRobot robot) {
    boolean _xifexpression = false;
    boolean _notEquals = (!Objects.equal(execution, null));
    if (_notEquals) {
      boolean _xifexpression_1 = false;
      EList<TaskExecution> _executedTasks = robot.getExecutedTasks();
      boolean _contains = _executedTasks.contains(execution);
      boolean _not = (!_contains);
      if (_not) {
        EList<TaskExecution> _executedTasks_1 = robot.getExecutedTasks();
        _xifexpression_1 = _executedTasks_1.add(execution);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected Boolean _parseStatement(final DetectionStatement statement, final Resource resourceOfBehaviour) {
    boolean _xblockexpression = false;
    {
      final DynamicRobot robot = statement.getRobot();
      AreaObject _object = statement.getObject();
      this.removeAreaObject(robot, _object);
      final DetectedObject detectedObject = BehaviourFactory.eINSTANCE.createDetectedObject();
      AreaObject _object_1 = statement.getObject();
      detectedObject.setObject(_object_1);
      boolean _isObstacle = statement.isObstacle();
      detectedObject.setObstacle(_isObstacle);
      EList<DetectedObject> _detectedObjects = robot.getDetectedObjects();
      _xblockexpression = _detectedObjects.add(detectedObject);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _parseStatement(final ExecutionStatement statement, final Resource resourceOfBehaviour) {
    boolean _xblockexpression = false;
    {
      final DynamicRobot robot = statement.getRobot();
      boolean _xifexpression = false;
      EList<TaskExecution> _executedTasks = robot.getExecutedTasks();
      TaskExecution _execution = statement.getExecution();
      boolean _contains = _executedTasks.contains(_execution);
      boolean _not = (!_contains);
      if (_not) {
        EList<TaskExecution> _executedTasks_1 = robot.getExecutedTasks();
        TaskExecution _execution_1 = statement.getExecution();
        _xifexpression = _executedTasks_1.add(_execution_1);
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _parseStatement(final MessageStatement statement, final Resource resourceOfBehaviour) {
    Boolean _xblockexpression = null;
    {
      final DynamicRobot senderRobot = statement.getRobot();
      this.initMessageRepository(senderRobot);
      final MessageTarget messageTarget = statement.getTarget();
      final Message message = statement.getMessage();
      _xblockexpression = this.parseMessageTarget(messageTarget, senderRobot, message);
    }
    return _xblockexpression;
  }
  
  public boolean detected(final DynamicRobot robot, final AreaObject areaObject) {
    EList<DetectedObject> _detectedObjects = robot.getDetectedObjects();
    for (final DetectedObject detectedObj : _detectedObjects) {
      AreaObject _object = detectedObj.getObject();
      boolean _equals = Objects.equal(_object, areaObject);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public boolean removeAreaObject(final DynamicRobot robot, final AreaObject areaObject) {
    boolean _xblockexpression = false;
    {
      DetectedObject removeObject = null;
      EList<DetectedObject> _detectedObjects = robot.getDetectedObjects();
      for (final DetectedObject detectedObj : _detectedObjects) {
        AreaObject _object = detectedObj.getObject();
        boolean _equals = Objects.equal(_object, areaObject);
        if (_equals) {
          removeObject = detectedObj;
        }
      }
      EList<DetectedObject> _detectedObjects_1 = robot.getDetectedObjects();
      _xblockexpression = _detectedObjects_1.remove(removeObject);
    }
    return _xblockexpression;
  }
  
  public MessageRepository initMessageRepository(final DynamicRobot robot) {
    MessageRepository messageRepository = robot.getMessageRepository();
    MessageRepository _messageRepository = robot.getMessageRepository();
    boolean _equals = Objects.equal(_messageRepository, null);
    if (_equals) {
      MessageRepository _createMessageRepository = BehaviourFactory.eINSTANCE.createMessageRepository();
      messageRepository = _createMessageRepository;
      String _name = robot.getName();
      String _plus = (_name + "MessageRepository");
      messageRepository.setName(_plus);
      messageRepository.setRobot(robot);
    }
    return messageRepository;
  }
  
  protected Boolean _parseMessageTarget(final UniTarget target, final DynamicRobot senderRobot, final Message message) {
    boolean _xblockexpression = false;
    {
      InputOutput.<String>println("uni target");
      DynamicRobot _target = target.getTarget();
      boolean _reachableRobot = this.reachableRobot(senderRobot, _target);
      boolean _not = (!_reachableRobot);
      if (_not) {
        InputOutput.<String>println("not reachable");
        return null;
      }
      DynamicRobot _target_1 = target.getTarget();
      this.initMessageRepository(_target_1);
      final UnicastCommunication action = BehaviourFactory.eINSTANCE.createUnicastCommunication();
      action.setMessage(message);
      DynamicRobot _target_2 = target.getTarget();
      action.setTarget(_target_2);
      this.addAction(senderRobot, action);
      _xblockexpression = this.addSendedMessage(senderRobot, message);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _parseMessageTarget(final MultiTarget target, final DynamicRobot senderRobot, final Message message) {
    boolean _xblockexpression = false;
    {
      EList<DynamicRobot> _target = target.getTarget();
      for (final DynamicRobot targetRobot : _target) {
        boolean _reachableRobot = this.reachableRobot(senderRobot, targetRobot);
        boolean _not = (!_reachableRobot);
        if (_not) {
          return null;
        }
      }
      EList<DynamicRobot> _target_1 = target.getTarget();
      for (final DynamicRobot targetRobot_1 : _target_1) {
        this.initMessageRepository(targetRobot_1);
      }
      final MulticastCommunication action = BehaviourFactory.eINSTANCE.createMulticastCommunication();
      action.setMessage(message);
      EList<DynamicRobot> _targets = action.getTargets();
      EList<DynamicRobot> _target_2 = target.getTarget();
      _targets.addAll(_target_2);
      this.addAction(senderRobot, action);
      _xblockexpression = this.addSendedMessage(senderRobot, message);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _parseMessageTarget(final AllTarget target, final DynamicRobot senderRobot, final Message message) {
    boolean _xblockexpression = false;
    {
      EList<RobotCollaboration> _collaborations = senderRobot.getCollaborations();
      boolean _isEmpty = _collaborations.isEmpty();
      if (_isEmpty) {
        return null;
      }
      final BroadcastCommunication action = BehaviourFactory.eINSTANCE.createBroadcastCommunication();
      action.setMessage(message);
      final Set<DynamicRobot> targetRobots = new HashSet<DynamicRobot>();
      EList<RobotCollaboration> _collaborations_1 = senderRobot.getCollaborations();
      for (final RobotCollaboration collab : _collaborations_1) {
        DynamicRobot _collaborator = collab.getCollaborator();
        targetRobots.add(_collaborator);
      }
      for (final DynamicRobot robot : targetRobots) {
        this.initMessageRepository(robot);
      }
      EList<DynamicRobot> _targets = action.getTargets();
      _targets.addAll(targetRobots);
      this.addAction(senderRobot, action);
      _xblockexpression = this.addSendedMessage(senderRobot, message);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  public boolean addAction(final DynamicRobot senderRobot, final Action action) {
    EList<Action> _actions = senderRobot.getActions();
    return _actions.add(action);
  }
  
  public boolean addSendedMessage(final DynamicRobot senderRobot, final Message message) {
    MessageRepository _messageRepository = senderRobot.getMessageRepository();
    EList<Message> _sendedMessages = _messageRepository.getSendedMessages();
    return _sendedMessages.add(message);
  }
  
  public boolean reachableRobot(final DynamicRobot origin, final DynamicRobot target) {
    EList<RobotCollaboration> _collaborations = origin.getCollaborations();
    for (final RobotCollaboration collab : _collaborations) {
      DynamicRobot _collaborator = collab.getCollaborator();
      boolean _equals = Objects.equal(_collaborator, target);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  protected Boolean _parseStatement(final CollaborationStatement statement, final Resource resourceOfBehaviour) {
    final DynamicRobot robot = statement.getRobot();
    final HashSet<DynamicRobot> connectedRobots = new HashSet<DynamicRobot>();
    EList<RobotCollaboration> _collaboration = statement.getCollaboration();
    for (final RobotCollaboration possibleCollaboration : _collaboration) {
      {
        boolean inCollaboration = false;
        EList<RobotCollaboration> _collaborations = robot.getCollaborations();
        for (final RobotCollaboration collaboration : _collaborations) {
          DynamicRobot _collaborator = collaboration.getCollaborator();
          DynamicRobot _collaborator_1 = possibleCollaboration.getCollaborator();
          boolean _equals = Objects.equal(_collaborator, _collaborator_1);
          if (_equals) {
            inCollaboration = true;
          }
        }
        if ((!inCollaboration)) {
          DynamicRobot _collaborator_2 = possibleCollaboration.getCollaborator();
          boolean _notEquals = (!Objects.equal(robot, _collaborator_2));
          if (_notEquals) {
            DynamicRobot _collaborator_3 = possibleCollaboration.getCollaborator();
            connectedRobots.add(_collaborator_3);
          }
        }
      }
    }
    for (final DynamicRobot r : connectedRobots) {
      {
        final RobotCollaboration newCollaboration = BehaviourFactory.eINSTANCE.createRobotCollaboration();
        newCollaboration.setCollaborator(r);
        EList<RobotCollaboration> _collaborations = robot.getCollaborations();
        _collaborations.add(newCollaboration);
        final RobotCollaboration newOppositeCollaboration = BehaviourFactory.eINSTANCE.createRobotCollaboration();
        newOppositeCollaboration.setCollaborator(robot);
        EList<RobotCollaboration> _collaborations_1 = r.getCollaborations();
        _collaborations_1.add(newOppositeCollaboration);
      }
    }
    return null;
  }
  
  public Boolean parseStatement(final Statement statement, final Resource resourceOfBehaviour) {
    if (statement instanceof ActionStatement) {
      return _parseStatement((ActionStatement)statement, resourceOfBehaviour);
    } else if (statement instanceof CollaborationStatement) {
      return _parseStatement((CollaborationStatement)statement, resourceOfBehaviour);
    } else if (statement instanceof DetectionStatement) {
      return _parseStatement((DetectionStatement)statement, resourceOfBehaviour);
    } else if (statement instanceof ExecutionStatement) {
      return _parseStatement((ExecutionStatement)statement, resourceOfBehaviour);
    } else if (statement instanceof MessageStatement) {
      return _parseStatement((MessageStatement)statement, resourceOfBehaviour);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement, resourceOfBehaviour).toString());
    }
  }
  
  public Boolean parseMessageTarget(final MessageTarget target, final DynamicRobot senderRobot, final Message message) {
    if (target instanceof AllTarget) {
      return _parseMessageTarget((AllTarget)target, senderRobot, message);
    } else if (target instanceof MultiTarget) {
      return _parseMessageTarget((MultiTarget)target, senderRobot, message);
    } else if (target instanceof UniTarget) {
      return _parseMessageTarget((UniTarget)target, senderRobot, message);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(target, senderRobot, message).toString());
    }
  }
}
