package hu.bme.mdsd.ztz.text.generator

import com.fasterxml.jackson.databind.node.JsonNodeFactory
import com.fasterxml.jackson.databind.node.ObjectNode
import hu.bme.mdsd.ztz.model.behaviour.Action
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot

class JsonNodeGenerator {

	val JsonNodeFactory factory

	new() {
		factory = new JsonNodeFactory(false)
	}

	def newActionNode(Action action, DynamicRobot robot, ObjectNode node) {
		val nestedNode = factory.objectNode
		nestedNode.put("Action", action.name)
		nestedNode.put("Robot", robot.name)
		node.set("Action", nestedNode)
	}

}
