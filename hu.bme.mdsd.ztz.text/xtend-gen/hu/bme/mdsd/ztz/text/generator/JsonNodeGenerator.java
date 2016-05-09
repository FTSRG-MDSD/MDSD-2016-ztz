package hu.bme.mdsd.ztz.text.generator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Objects;
import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.PropertyValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.StringValue;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class JsonNodeGenerator {
  private final JsonNodeFactory factory;
  
  public JsonNodeGenerator() {
    JsonNodeFactory _jsonNodeFactory = new JsonNodeFactory(false);
    this.factory = _jsonNodeFactory;
  }
  
  public JsonNode newActionNode(final Action action, final DynamicRobot robot, final ObjectNode node) {
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
}
