package hu.bme.mdsd.ztz.text.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Objects;
import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.RobotStatus;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecutionStatus;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Condition;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ExecutionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusCondition;
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusCondition;
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget;
import hu.bme.mdsd.ztz.text.generator.JsonNodeGenerator;
import hu.bme.mdsd.ztz.text.util.RobotUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class StatementParser {
  private JsonNodeFactory factory;
  
  @Extension
  private JsonNodeGenerator jsonGenerator;
  
  public StatementParser() {
    JsonNodeFactory _jsonNodeFactory = new JsonNodeFactory(false);
    this.factory = _jsonNodeFactory;
    JsonNodeGenerator _jsonNodeGenerator = new JsonNodeGenerator();
    this.jsonGenerator = _jsonNodeGenerator;
  }
  
  public JsonNode parseStatements(final Resource resource) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final EList<Statement> statements = ((BehaviourLanguage) _get).getStatements();
    ArrayNode rootNode = this.factory.arrayNode();
    for (final Statement statement : statements) {
      this.parseStatement(statement, rootNode);
    }
    return rootNode;
  }
  
  protected Object _parseStatement(final SynchronousStatement synchronousStatement, final ArrayNode containerNode) {
    ArrayNode _xblockexpression = null;
    {
      final ObjectNode node = this.factory.objectNode();
      ArrayNode _arrayNode = this.factory.arrayNode();
      node.set("Sync", _arrayNode);
      EList<AtomicStatement> _statements = synchronousStatement.getStatements();
      for (final Statement stat : _statements) {
        JsonNode _get = node.get("Sync");
        this.parseStatement(stat, ((ArrayNode) _get));
      }
      _xblockexpression = containerNode.add(node);
    }
    return _xblockexpression;
  }
  
  protected Object _parseStatement(final ConditionalStatement conditionalStatement, final ArrayNode containerNode) {
    Condition _condition = conditionalStatement.getCondition();
    boolean _trueCondition = this.trueCondition(_condition);
    if (_trueCondition) {
      EList<Statement> _statements = conditionalStatement.getStatements();
      for (final Statement st : _statements) {
        this.parseStatement(st, containerNode);
      }
    } else {
      EList<Statement> _otherStatements = conditionalStatement.getOtherStatements();
      boolean _notEquals = (!Objects.equal(_otherStatements, null));
      if (_notEquals) {
        EList<Statement> _otherStatements_1 = conditionalStatement.getOtherStatements();
        for (final Statement st_1 : _otherStatements_1) {
          this.parseStatement(st_1, containerNode);
        }
      }
    }
    return null;
  }
  
  protected boolean _trueCondition(final TaskStatusCondition condition) {
    boolean _isEqual = condition.isEqual();
    if (_isEqual) {
      TaskExecution _task = condition.getTask();
      TaskExecutionStatus _status = _task.getStatus();
      TaskExecutionStatus _taskStatus = condition.getTaskStatus();
      return Objects.equal(_status, _taskStatus);
    } else {
      boolean _isNotEqual = condition.isNotEqual();
      if (_isNotEqual) {
        TaskExecution _task_1 = condition.getTask();
        TaskExecutionStatus _status_1 = _task_1.getStatus();
        TaskExecutionStatus _taskStatus_1 = condition.getTaskStatus();
        return (!Objects.equal(_status_1, _taskStatus_1));
      }
    }
    return false;
  }
  
  protected boolean _trueCondition(final RobotStatusCondition condition) {
    boolean _isEqual = condition.isEqual();
    if (_isEqual) {
      DynamicRobot _robot = condition.getRobot();
      RobotStatus _status = _robot.getStatus();
      RobotStatus _robotStatus = condition.getRobotStatus();
      return Objects.equal(_status, _robotStatus);
    } else {
      boolean _isNotEqual = condition.isNotEqual();
      if (_isNotEqual) {
        DynamicRobot _robot_1 = condition.getRobot();
        RobotStatus _status_1 = _robot_1.getStatus();
        RobotStatus _robotStatus_1 = condition.getRobotStatus();
        return (!Objects.equal(_status_1, _robotStatus_1));
      }
    }
    return false;
  }
  
  protected Object _parseStatement(final ActionStatement statement, final ArrayNode containerNode) {
    boolean _xblockexpression = false;
    {
      final DynamicRobot robot = statement.getRobot();
      Action _action = statement.getAction();
      TaskExecution execution = _action.getCurrentTaskExecution();
      RobotUtil.addExecution(robot, execution);
      final Action action = statement.getAction();
      EList<Action> _actions = robot.getActions();
      _actions.add(action);
      ObjectNode node = this.factory.objectNode();
      this.jsonGenerator.newActionNode(action, robot, node);
      containerNode.add(node);
      boolean _xifexpression = false;
      EList<Action> _moreactions = statement.getMoreactions();
      boolean _isEmpty = _moreactions.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        boolean _xblockexpression_1 = false;
        {
          EList<Action> _moreactions_1 = statement.getMoreactions();
          for (final Action otherAction : _moreactions_1) {
            {
              TaskExecution _currentTaskExecution = otherAction.getCurrentTaskExecution();
              execution = _currentTaskExecution;
              RobotUtil.addExecution(robot, execution);
            }
          }
          final EList<Action> moreActions = statement.getMoreactions();
          for (final Action act : moreActions) {
            {
              ObjectNode _objectNode = this.factory.objectNode();
              node = _objectNode;
              this.jsonGenerator.newActionNode(act, robot, node);
              containerNode.add(node);
            }
          }
          DynamicRobot _robot = statement.getRobot();
          EList<Action> _actions_1 = _robot.getActions();
          _xblockexpression_1 = _actions_1.addAll(moreActions);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _parseStatement(final DetectionStatement statement, final ArrayNode containerNode) {
    boolean _xblockexpression = false;
    {
      final DynamicRobot robot = statement.getRobot();
      AreaObject _object = statement.getObject();
      RobotUtil.removeAreaObject(robot, _object);
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
  
  protected Object _parseStatement(final ExecutionStatement statement, final ArrayNode containerNode) {
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
  
  protected Object _parseStatement(final MessageStatement statement, final ArrayNode containerNode) {
    Boolean _xblockexpression = null;
    {
      final DynamicRobot senderRobot = statement.getRobot();
      RobotUtil.initMessageRepository(senderRobot);
      MessageTarget messageTarget = statement.getTarget();
      Message message = statement.getMessage();
      _xblockexpression = this.parseMessageTarget(messageTarget, senderRobot, message);
    }
    return _xblockexpression;
  }
  
  protected Object _parseStatement(final RobotStatusStatement statement, final ArrayNode containerNode) {
    final DynamicRobot robot = statement.getRobot();
    RobotStatus _status = statement.getStatus();
    robot.setStatus(_status);
    return null;
  }
  
  protected Object _parseStatement(final TaskStatusStatement statement, final ArrayNode containerNode) {
    final TaskExecution task = statement.getTask();
    TaskExecutionStatus _status = statement.getStatus();
    task.setStatus(_status);
    return null;
  }
  
  protected Boolean _parseMessageTarget(final UniTarget target, final DynamicRobot senderRobot, final Message message) {
    boolean _xblockexpression = false;
    {
      DynamicRobot _target = target.getTarget();
      boolean _reachableRobot = RobotUtil.reachableRobot(senderRobot, _target);
      boolean _not = (!_reachableRobot);
      if (_not) {
        return null;
      }
      DynamicRobot _target_1 = target.getTarget();
      RobotUtil.initMessageRepository(_target_1);
      final UnicastCommunication action = BehaviourFactory.eINSTANCE.createUnicastCommunication();
      action.setMessage(message);
      DynamicRobot _target_2 = target.getTarget();
      action.setTarget(_target_2);
      RobotUtil.addAction(senderRobot, action);
      _xblockexpression = RobotUtil.addSendedMessage(senderRobot, message);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _parseMessageTarget(final MultiTarget target, final DynamicRobot senderRobot, final Message message) {
    boolean _xblockexpression = false;
    {
      EList<DynamicRobot> _target = target.getTarget();
      for (final DynamicRobot targetRobot : _target) {
        boolean _reachableRobot = RobotUtil.reachableRobot(senderRobot, targetRobot);
        boolean _not = (!_reachableRobot);
        if (_not) {
          return null;
        }
      }
      EList<DynamicRobot> _target_1 = target.getTarget();
      for (final DynamicRobot targetRobot_1 : _target_1) {
        RobotUtil.initMessageRepository(targetRobot_1);
      }
      final MulticastCommunication action = BehaviourFactory.eINSTANCE.createMulticastCommunication();
      action.setMessage(message);
      EList<DynamicRobot> _targets = action.getTargets();
      EList<DynamicRobot> _target_2 = target.getTarget();
      _targets.addAll(_target_2);
      RobotUtil.addAction(senderRobot, action);
      _xblockexpression = RobotUtil.addSendedMessage(senderRobot, message);
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
        RobotUtil.initMessageRepository(robot);
      }
      EList<DynamicRobot> _targets = action.getTargets();
      _targets.addAll(targetRobots);
      RobotUtil.addAction(senderRobot, action);
      _xblockexpression = RobotUtil.addSendedMessage(senderRobot, message);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Object _parseStatement(final CollaborationStatement statement, final ArrayNode containerNode) {
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
  
  public Object parseStatement(final Statement statement, final ArrayNode containerNode) {
    if (statement instanceof RobotStatusStatement) {
      return _parseStatement((RobotStatusStatement)statement, containerNode);
    } else if (statement instanceof TaskStatusStatement) {
      return _parseStatement((TaskStatusStatement)statement, containerNode);
    } else if (statement instanceof ActionStatement) {
      return _parseStatement((ActionStatement)statement, containerNode);
    } else if (statement instanceof CollaborationStatement) {
      return _parseStatement((CollaborationStatement)statement, containerNode);
    } else if (statement instanceof DetectionStatement) {
      return _parseStatement((DetectionStatement)statement, containerNode);
    } else if (statement instanceof ExecutionStatement) {
      return _parseStatement((ExecutionStatement)statement, containerNode);
    } else if (statement instanceof MessageStatement) {
      return _parseStatement((MessageStatement)statement, containerNode);
    } else if (statement instanceof ConditionalStatement) {
      return _parseStatement((ConditionalStatement)statement, containerNode);
    } else if (statement instanceof SynchronousStatement) {
      return _parseStatement((SynchronousStatement)statement, containerNode);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement, containerNode).toString());
    }
  }
  
  public boolean trueCondition(final Condition condition) {
    if (condition instanceof RobotStatusCondition) {
      return _trueCondition((RobotStatusCondition)condition);
    } else if (condition instanceof TaskStatusCondition) {
      return _trueCondition((TaskStatusCondition)condition);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(condition).toString());
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
