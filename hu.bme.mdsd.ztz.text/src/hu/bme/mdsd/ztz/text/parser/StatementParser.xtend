package hu.bme.mdsd.ztz.text.parser

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.JsonNodeFactory
import hu.bme.mdsd.ztz.model.behaviour.Action
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.behaviour.Message
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.ExecutionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusCondition
import hu.bme.mdsd.ztz.text.behaviourLanguage.RobotStatusStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusCondition
import hu.bme.mdsd.ztz.text.behaviourLanguage.TaskStatusStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget
import hu.bme.mdsd.ztz.text.generator.JsonNodeGenerator
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource

import static extension hu.bme.mdsd.ztz.text.util.RobotUtil.*
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement

class StatementParser {
	
	var JsonNodeFactory factory
	
	@Extension
	var JsonNodeGenerator jsonGenerator
	
	new() {
		factory = new JsonNodeFactory(false)
		jsonGenerator = new JsonNodeGenerator
	}
	
	def JsonNode parseStatements(Resource resource) {
		val statements = (resource.contents.get(0) as BehaviourLanguage).statements
	
		var ArrayNode rootNode= factory.arrayNode
		for (Statement statement : statements) {
			statement.parseStatement(rootNode)
		}
		
		return rootNode
	}

	def dispatch parseStatement(SynchronousStatement synchronousStatement, ArrayNode containerNode) {
		val node = factory.objectNode
		node.set("Sync", factory.arrayNode)
		for (Statement  stat: synchronousStatement.statements) {
			stat.parseStatement(node.get("Sync") as ArrayNode)
		}
		containerNode.add(node)
	}

	def dispatch parseStatement(ConditionalStatement conditionalStatement, ArrayNode containerNode) {
		if (conditionalStatement.condition.trueCondition()) {
			for (Statement st : conditionalStatement.statements) {
				st.parseStatement(containerNode)
			}
		} else if (conditionalStatement.otherStatements != null){
			for (Statement st : conditionalStatement.otherStatements) {
				st.parseStatement(containerNode)
			}
		}
	}

	def dispatch trueCondition(TaskStatusCondition condition) {
		if (condition.equal) {
			return condition.task.status == condition.taskStatus	
		} else if (condition.notEqual) {
			return condition.task.status != condition.taskStatus
		}
	}
	
	def dispatch trueCondition(RobotStatusCondition condition) {
		if (condition.equal) {
			return condition.robot.status == condition.robotStatus	
		} else if (condition.notEqual) {
			return condition.robot.status != condition.robotStatus
		}
		
	}

	def dispatch parseStatement(ActionStatement statement, ArrayNode containerNode) {
		val robot = statement.robot 
		var execution = statement.action.currentTaskExecution
		
		robot.addExecution(execution)
		val action = statement.action
		robot.actions.add(action)

		var node = factory.objectNode
		newActionNode(action, robot, node)
		containerNode.add(node)
		
		if (!statement.moreactions.empty) {
			for (Action otherAction : statement.moreactions) {
				execution = otherAction.currentTaskExecution
				robot.addExecution(execution)
			}
			val moreActions = statement.moreactions
			for (Action act : moreActions) {
				node = factory.objectNode
				newActionNode(act, robot, node)
				containerNode.add(node)
			}
			statement.robot.actions.addAll(moreActions)
		}
	}
	
	def dispatch parseStatement(DetectionStatement statement, ArrayNode containerNode) {
		val robot = statement.robot
		robot.removeAreaObject(statement.object)
		
		val detectedObject = BehaviourFactory.eINSTANCE.createDetectedObject
		detectedObject.object = statement.object
		detectedObject.obstacle = statement.obstacle
		
		var node = factory.objectNode
		newDetectionNode(robot, detectedObject, node)
		containerNode.add(node)
		
		robot.detectedObjects.add(detectedObject)
	}

	def dispatch parseStatement(ExecutionStatement statement, ArrayNode containerNode) {
		val robot = statement.robot
		
		if (!robot.executedTasks.contains(statement.execution)) {
			robot.executedTasks.add(statement.execution)
//			orderedStatements.add(statement)
		}
	}
	
	def dispatch parseStatement(MessageStatement statement, ArrayNode containerNode) {
		val senderRobot = statement.robot
		initMessageRepository(senderRobot)

		var messageTarget = statement.target
		var message = statement.message

		messageTarget.parseMessageTarget(senderRobot, containerNode, message)
		
	}
	
	def dispatch parseStatement(RobotStatusStatement statement, ArrayNode containerNode) {
		val robot = statement.robot
		
		robot.status = statement.status	
	}
	
	def dispatch parseStatement(TaskStatusStatement statement, ArrayNode containerNode) {
		val task = statement.task
		task.status = statement.status		
	}
	
	def dispatch parseMessageTarget(UniTarget target, DynamicRobot senderRobot, ArrayNode containerNode, Message message) {
		if (!reachableRobot(senderRobot, target.target)) {
			return null
		}
		target.target.initMessageRepository()
		val action = BehaviourFactory.eINSTANCE.createUnicastCommunication()
		action.message = message
		action.target = target.target
		
		var node = factory.objectNode
		newActionNode(action, senderRobot, node)
		containerNode.add(node)
		
		senderRobot.addAction(action)
		addSendedMessage(senderRobot, message)
	}
	
	def dispatch parseMessageTarget(MultiTarget target, DynamicRobot senderRobot, ArrayNode containerNode, Message message) {
		for (DynamicRobot targetRobot : target.target) {
			if (!reachableRobot(senderRobot, targetRobot)) {
				return null
			}
		}
		for (DynamicRobot targetRobot : target.target) {
			targetRobot.initMessageRepository()
		}
		val action = BehaviourFactory.eINSTANCE.createMulticastCommunication()
		action.message = message
		action.targets.addAll(target.target)
		
		var node = factory.objectNode
		newActionNode(action, senderRobot, node)
		containerNode.add(node)
		
		senderRobot.addAction(action)
		addSendedMessage(senderRobot, message)
	}
	
	def dispatch parseMessageTarget(AllTarget target, DynamicRobot senderRobot, ArrayNode containerNode, Message message) {
		if (senderRobot.collaborations.empty) {
			return null
		}
		val action = BehaviourFactory.eINSTANCE.createBroadcastCommunication
		action.message = message
		
		val Set<DynamicRobot> targetRobots = new HashSet<DynamicRobot>()
		for (RobotCollaboration collab : senderRobot.collaborations) {
			targetRobots.add(collab.collaborator)
		}
		
		for (DynamicRobot robot : targetRobots) {
			robot.initMessageRepository()
		}
		
		action.targets.addAll(targetRobots)
		
		var node = factory.objectNode
		newActionNode(action, senderRobot, node)
		containerNode.add(node)
		
		senderRobot.addAction(action)
		addSendedMessage(senderRobot, message)
	}
	
	def dispatch parseStatement(CollaborationStatement statement, ArrayNode containerNode) {
		val robot = statement.robot

		val connectedRobots = new HashSet<DynamicRobot>()
		for (RobotCollaboration possibleCollaboration : statement.collaboration) {
			var inCollaboration = false
			for (RobotCollaboration collaboration : robot.collaborations) {
				if (collaboration.collaborator == possibleCollaboration.collaborator) {
					inCollaboration = true
				}
			}
			if (!inCollaboration) {
				if (robot != possibleCollaboration.collaborator) {
					connectedRobots.add(possibleCollaboration.collaborator)
				}
			}
		}

		for (DynamicRobot r : connectedRobots) {
			val newCollaboration = BehaviourFactory.eINSTANCE.createRobotCollaboration()
			newCollaboration.collaborator = r
			robot.collaborations.add(newCollaboration)

			val newOppositeCollaboration = BehaviourFactory.eINSTANCE.createRobotCollaboration()
			newOppositeCollaboration.collaborator = robot
			r.collaborations.add(newOppositeCollaboration)
//			orderedStatements.add(statement)
		}
	}
	
	
}