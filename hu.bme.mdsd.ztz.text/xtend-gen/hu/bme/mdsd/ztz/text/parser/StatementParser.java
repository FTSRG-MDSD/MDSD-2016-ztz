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
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyValue;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Condition;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ExecutionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MeasureComparable;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    final ObjectNode initNode = this.factory.objectNode();
    ObjectNode _objectNode = this.factory.objectNode();
    initNode.set("Status", _objectNode);
    JsonNode _get_1 = initNode.get("Status");
    this.jsonGenerator.newStatusNode(((ObjectNode) _get_1), resource);
    rootNode.add(initNode);
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
  
  protected Object _parseStatement(final ActionDeclarationStatement synchronousStatement, final ArrayNode containerNode) {
    return null;
  }
  
  protected Object _parseStatement(final ConditionalStatement conditionalStatement, final ArrayNode containerNode) {
    EList<Condition> _condition = conditionalStatement.getCondition();
    final Function1<Condition, Boolean> _function = (Condition it) -> {
      return Boolean.valueOf(this.trueCondition(it));
    };
    boolean _exists = IterableExtensions.<Condition>exists(_condition, _function);
    if (_exists) {
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
  
  public boolean trueCondition(final Condition condition) {
    TaskExecution _leftTask = condition.getLeftTask();
    boolean _notEquals = (!Objects.equal(_leftTask, null));
    if (_notEquals) {
      TaskExecution _leftTask_1 = condition.getLeftTask();
      TaskExecutionStatus _status = _leftTask_1.getStatus();
      hu.bme.mdsd.ztz.text.behaviourLanguage.EObject _rightStatus = condition.getRightStatus();
      boolean _equals = _status.equals(_rightStatus);
      String _compare = condition.getCompare();
      boolean _equals_1 = _compare.equals("==");
      return (_equals == _equals_1);
    } else {
      DynamicRobot _leftRobot = condition.getLeftRobot();
      boolean _notEquals_1 = (!Objects.equal(_leftRobot, null));
      if (_notEquals_1) {
        DynamicRobot _leftRobot_1 = condition.getLeftRobot();
        RobotStatus _status_1 = _leftRobot_1.getStatus();
        hu.bme.mdsd.ztz.text.behaviourLanguage.EObject _rightStatus_1 = condition.getRightStatus();
        boolean _equals_2 = _status_1.equals(_rightStatus_1);
        String _compare_1 = condition.getCompare();
        boolean _equals_3 = _compare_1.equals("==");
        return (_equals_2 == _equals_3);
      } else {
        boolean _and = false;
        MeasureComparable _leftMeasure = condition.getLeftMeasure();
        boolean _notEquals_2 = (!Objects.equal(_leftMeasure, null));
        if (!_notEquals_2) {
          _and = false;
        } else {
          MeasureComparable _rightMeasure = condition.getRightMeasure();
          boolean _notEquals_3 = (!Objects.equal(_rightMeasure, null));
          _and = _notEquals_3;
        }
        if (_and) {
          MeasureComparable _leftMeasure_1 = condition.getLeftMeasure();
          final PropertyValue left = RobotUtil.getPropertyValueFromComparable(_leftMeasure_1);
          MeasureComparable _rightMeasure_1 = condition.getRightMeasure();
          final PropertyValue right = RobotUtil.getPropertyValueFromComparable(_rightMeasure_1);
          boolean _and_1 = false;
          if (!(left instanceof MeasureValue)) {
            _and_1 = false;
          } else {
            _and_1 = (right instanceof MeasureValue);
          }
          if (_and_1) {
            MeasureDimension _dimension = ((MeasureValue) right).getDimension();
            final MeasureValue leftConversion = RobotUtil.convertTo(((MeasureValue) left), _dimension);
            boolean _notEquals_4 = (!Objects.equal(leftConversion, null));
            if (_notEquals_4) {
              String _compare_2 = condition.getCompare();
              return this.compareMeasureValues(leftConversion, ((MeasureValue) right), _compare_2);
            } else {
              MeasureDimension _dimension_1 = ((MeasureValue) left).getDimension();
              final MeasureValue rightConversion = RobotUtil.convertTo(((MeasureValue) right), _dimension_1);
              String _compare_3 = condition.getCompare();
              return this.compareMeasureValues(rightConversion, ((MeasureValue) left), _compare_3);
            }
          } else {
            boolean _equals_4 = left.equals(right);
            String _compare_4 = condition.getCompare();
            boolean _equals_5 = _compare_4.equals("==");
            return (_equals_4 == _equals_5);
          }
        }
      }
    }
    return false;
  }
  
  public boolean compareMeasureValues(final MeasureValue left, final MeasureValue right, final String comparison) {
    boolean _equals = comparison.equals(">");
    if (_equals) {
      float _value = left.getValue();
      float _value_1 = right.getValue();
      return (_value > _value_1);
    } else {
      boolean _equals_1 = comparison.equals(">=");
      if (_equals_1) {
        float _value_2 = left.getValue();
        float _value_3 = right.getValue();
        return (_value_2 >= _value_3);
      } else {
        boolean _equals_2 = comparison.equals("<");
        if (_equals_2) {
          float _value_4 = left.getValue();
          float _value_5 = right.getValue();
          return (_value_4 < _value_5);
        } else {
          boolean _equals_3 = comparison.equals("<=");
          if (_equals_3) {
            float _value_6 = left.getValue();
            float _value_7 = right.getValue();
            return (_value_6 <= _value_7);
          } else {
            boolean _equals_4 = comparison.equals("==");
            if (_equals_4) {
              float _value_8 = left.getValue();
              float _value_9 = right.getValue();
              return (_value_8 == _value_9);
            } else {
              boolean _equals_5 = comparison.equals("!=");
              if (_equals_5) {
                float _value_10 = left.getValue();
                float _value_11 = right.getValue();
                return (_value_10 != _value_11);
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  protected Object _parseStatement(final ActionStatement statement, final ArrayNode containerNode) {
    final DynamicRobot robot = statement.getRobot();
    ActionImplementation _action = statement.getAction();
    TaskExecution execution = _action.getCurrentTaskExecution();
    RobotUtil.addExecution(robot, execution);
    final ActionImplementation actionImpl = statement.getAction();
    Action action = BehaviourFactory.eINSTANCE.createAction();
    ActionDeclarationStatement _declaration = actionImpl.getDeclaration();
    String _name = _declaration.getName();
    action.setName(_name);
    TaskExecution _currentTaskExecution = actionImpl.getCurrentTaskExecution();
    action.setCurrentTaskExecution(_currentTaskExecution);
    EList<Property> _properties = action.getProperties();
    EList<Property> _properties_1 = actionImpl.getProperties();
    _properties.addAll(_properties_1);
    EList<Action> _actions = robot.getActions();
    _actions.add(action);
    ObjectNode node = this.factory.objectNode();
    this.jsonGenerator.newActionNode(action, robot, node);
    containerNode.add(node);
    EList<ActionImplementation> _moreactions = statement.getMoreactions();
    boolean _isEmpty = _moreactions.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<ActionImplementation> _moreactions_1 = statement.getMoreactions();
      for (final ActionImplementation otherAction : _moreactions_1) {
        {
          TaskExecution _currentTaskExecution_1 = otherAction.getCurrentTaskExecution();
          execution = _currentTaskExecution_1;
          RobotUtil.addExecution(robot, execution);
        }
      }
      final EList<ActionImplementation> moreActions = statement.getMoreactions();
      for (final ActionImplementation act : moreActions) {
        {
          Action _createAction = BehaviourFactory.eINSTANCE.createAction();
          action = _createAction;
          ActionDeclarationStatement _declaration_1 = act.getDeclaration();
          String _name_1 = _declaration_1.getName();
          action.setName(_name_1);
          TaskExecution _currentTaskExecution_1 = act.getCurrentTaskExecution();
          action.setCurrentTaskExecution(_currentTaskExecution_1);
          EList<Property> _properties_2 = action.getProperties();
          EList<Property> _properties_3 = act.getProperties();
          _properties_2.addAll(_properties_3);
          ObjectNode _objectNode = this.factory.objectNode();
          node = _objectNode;
          this.jsonGenerator.newActionNode(action, robot, node);
          containerNode.add(node);
          DynamicRobot _robot = statement.getRobot();
          EList<Action> _actions_1 = _robot.getActions();
          _actions_1.add(action);
        }
      }
    }
    return null;
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
      ObjectNode node = this.factory.objectNode();
      this.jsonGenerator.newDetectionNode(robot, detectedObject, node);
      containerNode.add(node);
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
      _xblockexpression = this.parseMessageTarget(messageTarget, senderRobot, containerNode, message);
    }
    return _xblockexpression;
  }
  
  protected Boolean _parseMessageTarget(final UniTarget target, final DynamicRobot senderRobot, final ArrayNode containerNode, final Message message) {
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
      ObjectNode node = this.factory.objectNode();
      this.jsonGenerator.newActionNode(action, senderRobot, node);
      containerNode.add(node);
      RobotUtil.addAction(senderRobot, action);
      _xblockexpression = RobotUtil.addSendedMessage(senderRobot, message);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _parseMessageTarget(final MultiTarget target, final DynamicRobot senderRobot, final ArrayNode containerNode, final Message message) {
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
      ObjectNode node = this.factory.objectNode();
      this.jsonGenerator.newActionNode(action, senderRobot, node);
      containerNode.add(node);
      RobotUtil.addAction(senderRobot, action);
      _xblockexpression = RobotUtil.addSendedMessage(senderRobot, message);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _parseMessageTarget(final AllTarget target, final DynamicRobot senderRobot, final ArrayNode containerNode, final Message message) {
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
      ObjectNode node = this.factory.objectNode();
      this.jsonGenerator.newActionNode(action, senderRobot, node);
      containerNode.add(node);
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
    if (statement instanceof ActionStatement) {
      return _parseStatement((ActionStatement)statement, containerNode);
    } else if (statement instanceof CollaborationStatement) {
      return _parseStatement((CollaborationStatement)statement, containerNode);
    } else if (statement instanceof DetectionStatement) {
      return _parseStatement((DetectionStatement)statement, containerNode);
    } else if (statement instanceof ExecutionStatement) {
      return _parseStatement((ExecutionStatement)statement, containerNode);
    } else if (statement instanceof MessageStatement) {
      return _parseStatement((MessageStatement)statement, containerNode);
    } else if (statement instanceof ActionDeclarationStatement) {
      return _parseStatement((ActionDeclarationStatement)statement, containerNode);
    } else if (statement instanceof ConditionalStatement) {
      return _parseStatement((ConditionalStatement)statement, containerNode);
    } else if (statement instanceof SynchronousStatement) {
      return _parseStatement((SynchronousStatement)statement, containerNode);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement, containerNode).toString());
    }
  }
  
  public Boolean parseMessageTarget(final MessageTarget target, final DynamicRobot senderRobot, final ArrayNode containerNode, final Message message) {
    if (target instanceof AllTarget) {
      return _parseMessageTarget((AllTarget)target, senderRobot, containerNode, message);
    } else if (target instanceof MultiTarget) {
      return _parseMessageTarget((MultiTarget)target, senderRobot, containerNode, message);
    } else if (target instanceof UniTarget) {
      return _parseMessageTarget((UniTarget)target, senderRobot, containerNode, message);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(target, senderRobot, containerNode, message).toString());
    }
  }
}
