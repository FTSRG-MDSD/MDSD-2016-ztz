package hu.bme.mdsd.ztz.text.generator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;

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
      String _name_1 = robot.getName();
      nestedNode.put("Robot", _name_1);
      _xblockexpression = node.set("Action", nestedNode);
    }
    return _xblockexpression;
  }
}
