package hu.bme.mdsd.ztz.text.util;

import com.google.common.base.Objects;
import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.PropertyValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.impl.DroneFactoryImpl;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MeasureComparable;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class RobotUtil {
  public static boolean addAction(final DynamicRobot senderRobot, final Action action) {
    EList<Action> _actions = senderRobot.getActions();
    return _actions.add(action);
  }
  
  public static boolean addSendedMessage(final DynamicRobot senderRobot, final Message message) {
    MessageRepository _messageRepository = senderRobot.getMessageRepository();
    EList<Message> _sendedMessages = _messageRepository.getSendedMessages();
    return _sendedMessages.add(message);
  }
  
  public static boolean reachableRobot(final DynamicRobot origin, final DynamicRobot target) {
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
  
  public static MessageRepository initMessageRepository(final DynamicRobot robot) {
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
  
  public static boolean addExecution(final DynamicRobot robot, final TaskExecution execution) {
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
  
  public static boolean detected(final DynamicRobot robot, final AreaObject areaObject) {
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
  
  public static boolean removeAreaObject(final DynamicRobot robot, final AreaObject areaObject) {
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
  
  public static MeasureValue convertTo(final MeasureValue value, final MeasureDimension dimension) {
    MeasureDimension _dimension = value.getDimension();
    boolean _equals = Objects.equal(_dimension, dimension);
    if (_equals) {
      return value;
    } else {
      final HashMap<MeasureDimension, Float> availableDimensions = new HashMap<MeasureDimension, Float>();
      float _value = value.getValue();
      MeasureDimension _dimension_1 = value.getDimension();
      RobotUtil.convertTo(Float.valueOf(_value), _dimension_1, dimension, availableDimensions);
      final Float convertedValue = availableDimensions.get(dimension);
      boolean _notEquals = (!Objects.equal(convertedValue, null));
      if (_notEquals) {
        final MeasureValue convertedMeasureValue = DroneFactoryImpl.eINSTANCE.createMeasureValue();
        convertedMeasureValue.setDimension(dimension);
        convertedMeasureValue.setValue((convertedValue).floatValue());
        return convertedMeasureValue;
      } else {
        return null;
      }
    }
  }
  
  private static void convertTo(final Float value, final MeasureDimension currentDimension, final MeasureDimension dimension, final Map<MeasureDimension, Float> availableDimensions) {
    EList<MeasureConversion> _conversions = currentDimension.getConversions();
    for (final MeasureConversion conversion : _conversions) {
      {
        boolean _containsKey = availableDimensions.containsKey(dimension);
        if (_containsKey) {
          return;
        }
        MeasureDimension _dimension = conversion.getDimension();
        boolean _containsKey_1 = availableDimensions.containsKey(_dimension);
        boolean _not = (!_containsKey_1);
        if (_not) {
          float _rate = conversion.getRate();
          final float convertedValue = ((value).floatValue() * _rate);
          MeasureDimension _dimension_1 = conversion.getDimension();
          availableDimensions.put(_dimension_1, Float.valueOf(convertedValue));
          MeasureDimension _dimension_2 = conversion.getDimension();
          boolean _equals = Objects.equal(_dimension_2, dimension);
          if (_equals) {
            return;
          } else {
            MeasureDimension _dimension_3 = conversion.getDimension();
            RobotUtil.convertTo(Float.valueOf(convertedValue), _dimension_3, dimension, availableDimensions);
          }
        }
      }
    }
  }
  
  public static PropertyValue getPropertyValueFromComparable(final MeasureComparable comparable) {
    PropertyValue _value = comparable.getValue();
    boolean _notEquals = (!Objects.equal(_value, null));
    if (_notEquals) {
      return comparable.getValue();
    } else {
      boolean _and = false;
      DynamicRobot _container = comparable.getContainer();
      boolean _notEquals_1 = (!Objects.equal(_container, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        PropertyKey _member = comparable.getMember();
        boolean _notEquals_2 = (!Objects.equal(_member, null));
        _and = _notEquals_2;
      }
      if (_and) {
        DynamicRobot _container_1 = comparable.getContainer();
        Robot _robot = _container_1.getRobot();
        EList<Property> _properties = _robot.getProperties();
        final Function1<Property, Boolean> _function = (Property prop) -> {
          PropertyKey _key = prop.getKey();
          PropertyKey _member_1 = comparable.getMember();
          return Boolean.valueOf(_key.equals(_member_1));
        };
        Property _findFirst = IterableExtensions.<Property>findFirst(_properties, _function);
        return _findFirst.getValue();
      }
    }
    return null;
  }
}
