package hu.bme.mdsd.ztz.text.generator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.RobotStatus;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.Coordinate;
import hu.bme.mdsd.ztz.model.drone.Equipment;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Mission;
import hu.bme.mdsd.ztz.model.drone.Position;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.PropertyValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.Size;
import hu.bme.mdsd.ztz.model.drone.StringValue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JsonNodeGenerator {
  private final JsonNodeFactory factory;
  
  public JsonNodeGenerator() {
    JsonNodeFactory _jsonNodeFactory = new JsonNodeFactory(false);
    this.factory = _jsonNodeFactory;
  }
  
  public ObjectNode newInitNode(final ObjectNode node, final Resource resource) {
    ArrayNode _arrayNode = this.factory.arrayNode();
    node.set("Robots", _arrayNode);
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<DynamicRobot> _filter = Iterators.<DynamicRobot>filter(_allContents, DynamicRobot.class);
    Set<DynamicRobot> _set = IteratorExtensions.<DynamicRobot>toSet(_filter);
    for (final DynamicRobot dynamicRobot : _set) {
      {
        ObjectNode robotsNode = this.factory.objectNode();
        String _name = dynamicRobot.getName();
        robotsNode.put("DynamicRobot", _name);
        Robot _robot = dynamicRobot.getRobot();
        String _name_1 = _robot.getName();
        robotsNode.put("Robot", _name_1);
        JsonNode _get = node.get("Robots");
        ((ArrayNode) _get).add(robotsNode);
      }
    }
    return node;
  }
  
  public ObjectNode newStatusNode(final ObjectNode node, final Resource resource) {
    ArrayNode _arrayNode = this.factory.arrayNode();
    node.set("Robots", _arrayNode);
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<DynamicRobot> _filter = Iterators.<DynamicRobot>filter(_allContents, DynamicRobot.class);
    Set<DynamicRobot> _set = IteratorExtensions.<DynamicRobot>toSet(_filter);
    for (final DynamicRobot dynamicRobot : _set) {
      {
        ObjectNode robotsNode = this.factory.objectNode();
        Robot _robot = dynamicRobot.getRobot();
        String _name = _robot.getName();
        robotsNode.put("Robot", _name);
        Robot _robot_1 = dynamicRobot.getRobot();
        Position _position = _robot_1.getPosition();
        EList<Coordinate> _coordinates = _position.getCoordinates();
        Coordinate _get = _coordinates.get(0);
        float _latitude = _get.getLatitude();
        String _string = Float.valueOf(_latitude).toString();
        robotsNode.put("Lat", _string);
        Robot _robot_2 = dynamicRobot.getRobot();
        Position _position_1 = _robot_2.getPosition();
        EList<Coordinate> _coordinates_1 = _position_1.getCoordinates();
        Coordinate _get_1 = _coordinates_1.get(0);
        float _longitude = _get_1.getLongitude();
        String _string_1 = Float.valueOf(_longitude).toString();
        robotsNode.put("Long", _string_1);
        Robot _robot_3 = dynamicRobot.getRobot();
        ObjectNode _newSizeNode = this.newSizeNode(_robot_3);
        robotsNode.set("Size", _newSizeNode);
        RobotStatus _status = dynamicRobot.getStatus();
        String _string_2 = _status.toString();
        robotsNode.put("Status", _string_2);
        float _xifexpression = (float) 0;
        Robot _robot_4 = dynamicRobot.getRobot();
        MeasureValue _communicationRange = _robot_4.getCommunicationRange();
        boolean _notEquals = (!Objects.equal(_communicationRange, null));
        if (_notEquals) {
          Robot _robot_5 = dynamicRobot.getRobot();
          MeasureValue _communicationRange_1 = _robot_5.getCommunicationRange();
          _xifexpression = _communicationRange_1.getValue();
        } else {
          _xifexpression = 0;
        }
        robotsNode.put("Range", _xifexpression);
        String _xifexpression_1 = null;
        Robot _robot_6 = dynamicRobot.getRobot();
        Mission _mission = _robot_6.getMission();
        boolean _notEquals_1 = (!Objects.equal(_mission, null));
        if (_notEquals_1) {
          Robot _robot_7 = dynamicRobot.getRobot();
          Mission _mission_1 = _robot_7.getMission();
          _xifexpression_1 = _mission_1.getName();
        } else {
          _xifexpression_1 = "";
        }
        robotsNode.put("Mission", _xifexpression_1);
        Robot _robot_8 = dynamicRobot.getRobot();
        ArrayNode _newCapabilitiesNode = this.newCapabilitiesNode(_robot_8);
        robotsNode.set("Capabilities", _newCapabilitiesNode);
        Robot _robot_9 = dynamicRobot.getRobot();
        ArrayNode _newEquipmentsNode = this.newEquipmentsNode(_robot_9);
        robotsNode.set("Equipments", _newEquipmentsNode);
        JsonNode _get_2 = node.get("Robots");
        ((ArrayNode) _get_2).add(robotsNode);
      }
    }
    return node;
  }
  
  public ObjectNode newSizeNode(final Robot robot) {
    final ObjectNode node = this.factory.objectNode();
    Size _size = robot.getSize();
    MeasureValue _width = _size.getWidth();
    float _value = _width.getValue();
    String _string = Float.valueOf(_value).toString();
    String _plus = (_string + " ");
    Size _size_1 = robot.getSize();
    MeasureValue _width_1 = _size_1.getWidth();
    MeasureDimension _dimension = _width_1.getDimension();
    String _name = _dimension.getName();
    String _plus_1 = (_plus + _name);
    node.put("Width", _plus_1);
    Size _size_2 = robot.getSize();
    MeasureValue _height = _size_2.getHeight();
    float _value_1 = _height.getValue();
    String _string_1 = Float.valueOf(_value_1).toString();
    String _plus_2 = (_string_1 + " ");
    Size _size_3 = robot.getSize();
    MeasureValue _width_2 = _size_3.getWidth();
    MeasureDimension _dimension_1 = _width_2.getDimension();
    String _name_1 = _dimension_1.getName();
    String _plus_3 = (_plus_2 + _name_1);
    node.put("Height", _plus_3);
    Size _size_4 = robot.getSize();
    MeasureValue _length = _size_4.getLength();
    float _value_2 = _length.getValue();
    String _string_2 = Float.valueOf(_value_2).toString();
    String _plus_4 = (_string_2 + " ");
    Size _size_5 = robot.getSize();
    MeasureValue _width_3 = _size_5.getWidth();
    MeasureDimension _dimension_2 = _width_3.getDimension();
    String _name_2 = _dimension_2.getName();
    String _plus_5 = (_plus_4 + _name_2);
    node.put("Length", _plus_5);
    return node;
  }
  
  public ArrayNode newCapabilitiesNode(final Robot robot) {
    final ArrayNode node = this.factory.arrayNode();
    EList<Capability> _capabilities = robot.getCapabilities();
    for (final Capability cap : _capabilities) {
      String _name = cap.getName();
      node.add(_name);
    }
    return node;
  }
  
  public ArrayNode newEquipmentsNode(final Robot robot) {
    final ArrayNode node = this.factory.arrayNode();
    EList<Equipment> _equipments = robot.getEquipments();
    for (final Equipment e : _equipments) {
      String _name = e.getName();
      node.add(_name);
    }
    return node;
  }
  
  protected JsonNode _newActionNode(final Action action, final DynamicRobot robot, final ObjectNode node) {
    JsonNode _xblockexpression = null;
    {
      final ObjectNode nestedNode = this.factory.objectNode();
      String _name = action.getName();
      nestedNode.put("Action", _name);
      Robot _robot = robot.getRobot();
      String _name_1 = _robot.getName();
      nestedNode.put("Robot", _name_1);
      EList<Property> _properties = action.getProperties();
      this.newPropertiesNode(nestedNode, _properties);
      _xblockexpression = node.set("Action", nestedNode);
    }
    return _xblockexpression;
  }
  
  protected JsonNode _newActionNode(final UnicastCommunication action, final DynamicRobot robot, final ObjectNode node) {
    JsonNode _xblockexpression = null;
    {
      final ObjectNode nestedNode = this.factory.objectNode();
      Message _message = action.getMessage();
      String _name = _message.getName();
      nestedNode.put("Message", _name);
      DynamicRobot _target = action.getTarget();
      Robot _robot = _target.getRobot();
      String _name_1 = _robot.getName();
      nestedNode.put("Target", _name_1);
      _xblockexpression = node.set("UnicastCommunication", nestedNode);
    }
    return _xblockexpression;
  }
  
  protected JsonNode _newActionNode(final MulticastCommunication action, final DynamicRobot robot, final ObjectNode node) {
    JsonNode _xblockexpression = null;
    {
      final ObjectNode nestedNode = this.factory.objectNode();
      Message _message = action.getMessage();
      String _name = _message.getName();
      nestedNode.put("Message", _name);
      ArrayNode _arrayNode = this.factory.arrayNode();
      nestedNode.set("Targets", _arrayNode);
      EList<DynamicRobot> _targets = action.getTargets();
      for (final DynamicRobot targetRobot : _targets) {
        JsonNode _get = nestedNode.get("Targets");
        Robot _robot = targetRobot.getRobot();
        String _name_1 = _robot.getName();
        ((ArrayNode) _get).add(_name_1);
      }
      _xblockexpression = node.set("MulticastCommunication", nestedNode);
    }
    return _xblockexpression;
  }
  
  protected JsonNode _newActionNode(final BroadcastCommunication action, final DynamicRobot robot, final ObjectNode node) {
    JsonNode _xblockexpression = null;
    {
      final ObjectNode nestedNode = this.factory.objectNode();
      Message _message = action.getMessage();
      String _name = _message.getName();
      nestedNode.put("Message", _name);
      ArrayNode _arrayNode = this.factory.arrayNode();
      nestedNode.set("Targets", _arrayNode);
      EList<DynamicRobot> _targets = action.getTargets();
      for (final DynamicRobot targetRobot : _targets) {
        JsonNode _get = nestedNode.get("Targets");
        Robot _robot = targetRobot.getRobot();
        String _name_1 = _robot.getName();
        ((ArrayNode) _get).add(_name_1);
      }
      _xblockexpression = node.set("BroadcastCommunication", nestedNode);
    }
    return _xblockexpression;
  }
  
  public JsonNode newDetectionNode(final DynamicRobot robot, final DetectedObject detectedObject, final ObjectNode node) {
    JsonNode _xblockexpression = null;
    {
      final ObjectNode nestedNode = this.factory.objectNode();
      Robot _robot = robot.getRobot();
      String _name = _robot.getName();
      nestedNode.put("Robot", _name);
      AreaObject _object = detectedObject.getObject();
      String _name_1 = _object.getName();
      nestedNode.put("DetectedObject", _name_1);
      _xblockexpression = node.set("Detection", nestedNode);
    }
    return _xblockexpression;
  }
  
  public JsonNode newPropertiesNode(final ObjectNode containerNode, final EList<Property> properties) {
    JsonNode _xblockexpression = null;
    {
      final String propertyKey = "Properties";
      JsonNode _xifexpression = null;
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(properties, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _isEmpty = properties.isEmpty();
        boolean _not = (!_isEmpty);
        _and = _not;
      }
      if (_and) {
        JsonNode _xblockexpression_1 = null;
        {
          final ObjectNode propertiesNode = this.factory.objectNode();
          for (final Property property : properties) {
            PropertyValue _value = property.getValue();
            if ((_value instanceof StringValue)) {
              PropertyKey _key = property.getKey();
              String _name = _key.getName();
              PropertyValue _value_1 = property.getValue();
              String _value_2 = ((StringValue) _value_1).getValue();
              propertiesNode.put(_name, _value_2);
            } else {
              PropertyValue _value_3 = property.getValue();
              if ((_value_3 instanceof MeasureValue)) {
                PropertyKey _key_1 = property.getKey();
                String _name_1 = _key_1.getName();
                PropertyValue _value_4 = property.getValue();
                float _value_5 = ((MeasureValue) _value_4).getValue();
                propertiesNode.put(_name_1, _value_5);
              }
            }
          }
          _xblockexpression_1 = containerNode.set(propertyKey, propertiesNode);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public JsonNode newActionNode(final Action action, final DynamicRobot robot, final ObjectNode node) {
    if (action instanceof BroadcastCommunication) {
      return _newActionNode((BroadcastCommunication)action, robot, node);
    } else if (action instanceof MulticastCommunication) {
      return _newActionNode((MulticastCommunication)action, robot, node);
    } else if (action instanceof UnicastCommunication) {
      return _newActionNode((UnicastCommunication)action, robot, node);
    } else if (action != null) {
      return _newActionNode(action, robot, node);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action, robot, node).toString());
    }
  }
}
