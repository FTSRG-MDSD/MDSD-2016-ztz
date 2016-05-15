package hu.bme.mdsd.ztz.text.generator

import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.fasterxml.jackson.databind.node.ObjectNode
import hu.bme.mdsd.ztz.model.behaviour.Action
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import org.eclipse.emf.common.util.EList
import hu.bme.mdsd.ztz.model.drone.StringValue
import hu.bme.mdsd.ztz.model.drone.MeasureValue
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication
import com.fasterxml.jackson.databind.node.ArrayNode
import org.eclipse.emf.ecore.resource.Resource
import hu.bme.mdsd.ztz.model.drone.Robot

class JsonNodeGenerator {

	val JsonNodeFactory factory

	new() {
		factory = new JsonNodeFactory(false)
	}

	def newInitNode(ObjectNode node, Resource resource) {
		node.set("Robots", factory.arrayNode)
		for (DynamicRobot dynamicRobot : resource.allContents.filter(DynamicRobot).toSet) {
			var robotsNode = factory.objectNode
			robotsNode.put("DynamicRobot", dynamicRobot.name)
			robotsNode.put("Robot", dynamicRobot.robot.name)
			(node.get("Robots") as ArrayNode).add(robotsNode)
		}
		return node
		
	}
	
	def newStatusNode(ObjectNode node, Resource resource) {
		node.set("Robots", factory.arrayNode)
		for (DynamicRobot dynamicRobot : resource.allContents.filter(DynamicRobot).toSet) {
			var robotsNode = factory.objectNode
			robotsNode.put("Robot", dynamicRobot.robot.name)
			robotsNode.put("Lat", dynamicRobot.robot.position.coordinates.get(0).latitude.toString)
			robotsNode.put("Long", dynamicRobot.robot.position.coordinates.get(0).longitude.toString)
			
			robotsNode.set("Size", newSizeNode(dynamicRobot.robot))
			
			(node.get("Robots") as ArrayNode).add(robotsNode)
		}
		return node
	}

	def newSizeNode(Robot robot) {
		val node = factory.objectNode
		node.put("Width", robot.size.width.value.toString + " " + robot.size.width.dimension.name)
		node.put("Height", robot.size.height.value.toString + " " + robot.size.width.dimension.name)
		node.put("Length", robot.size.length.value.toString + " " + robot.size.width.dimension.name)
		return node
	}

	def dispatch newActionNode(Action action, DynamicRobot robot, ObjectNode node) {
		val nestedNode = factory.objectNode
		nestedNode.put("Action", action.name)
		nestedNode.put("Robot", robot.robot.name)
		
		newPropertiesNode(nestedNode, action.properties)
		
		node.set("Action", nestedNode)
	}

	def dispatch newActionNode(UnicastCommunication action, DynamicRobot robot, ObjectNode node) {
		val nestedNode = factory.objectNode
		nestedNode.put("Message", action.message.name)
		nestedNode.put("Target", action.target.robot.name)
		
		node.set("UnicastCommunication", nestedNode)
	}
	
	def dispatch newActionNode(MulticastCommunication action, DynamicRobot robot, ObjectNode node) {
		val nestedNode = factory.objectNode
		nestedNode.put("Message", action.message.name)
		nestedNode.set("Targets", factory.arrayNode)
		for(DynamicRobot targetRobot : action.targets) {
			(nestedNode.get("Targets") as ArrayNode).add(targetRobot.robot.name)
		}
		
		node.set("MulticastCommunication", nestedNode)
	}
	
	def dispatch newActionNode(BroadcastCommunication action, DynamicRobot robot, ObjectNode node) {
		val nestedNode = factory.objectNode
		nestedNode.put("Message", action.message.name)
		nestedNode.set("Targets", factory.arrayNode)
		for(DynamicRobot targetRobot : action.targets) {
			(nestedNode.get("Targets") as ArrayNode).add(targetRobot.robot.name)
		}
		
		node.set("BroadcastCommunication", nestedNode)
	}

	def newDetectionNode(DynamicRobot robot, DetectedObject detectedObject, ObjectNode node) {
		val nestedNode = factory.objectNode
		nestedNode.put("Robot", robot.robot.name)
		nestedNode.put("DetectedObject", detectedObject.object.name)
		
		node.set("Detection", nestedNode)
	}

	def newPropertiesNode(ObjectNode containerNode, EList<hu.bme.mdsd.ztz.model.drone.Property> properties) {
		val propertyKey = "Properties"
		if (properties != null && !properties.empty) {
			val ObjectNode propertiesNode = factory.objectNode
			for (hu.bme.mdsd.ztz.model.drone.Property property : properties) {
				if (property.value instanceof StringValue) {
					propertiesNode.put(property.key.name, (property.value as StringValue).value)
				} else if (property.value instanceof MeasureValue) {
					propertiesNode.put(property.key.name, (property.value as MeasureValue).value)
				}
			}
			containerNode.set(propertyKey, propertiesNode)
		}
	}

}
