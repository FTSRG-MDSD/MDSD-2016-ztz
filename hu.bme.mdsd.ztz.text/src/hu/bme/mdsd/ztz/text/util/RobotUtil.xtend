package hu.bme.mdsd.ztz.text.util

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.behaviour.Action
import hu.bme.mdsd.ztz.model.behaviour.Message
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory
import hu.bme.mdsd.ztz.model.drone.AreaObject
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject

class RobotUtil {

	def static addAction(DynamicRobot senderRobot, Action action) {
		senderRobot.actions.add(action)
	}

	def static addSendedMessage(DynamicRobot senderRobot, Message message) {
		senderRobot.messageRepository.sendedMessages.add(message)
	}

	def static boolean reachableRobot(DynamicRobot origin, DynamicRobot target) {
		for (RobotCollaboration collab : origin.collaborations) {
			if (collab.collaborator == target) {
				return true
			}
		}
		return false
	}

	def static MessageRepository initMessageRepository(DynamicRobot robot) {
		var MessageRepository messageRepository = robot.messageRepository

		if (robot.messageRepository == null) {
			messageRepository = BehaviourFactory.eINSTANCE.createMessageRepository()
			messageRepository.name = robot.name + "MessageRepository"
			messageRepository.robot = robot
		}
		return messageRepository
	}

	def static boolean detected(DynamicRobot robot, AreaObject areaObject) {
		for (DetectedObject detectedObj : robot.detectedObjects) {
			if (detectedObj.object == areaObject) {
				return true
			}
		}
		return false
	}
	
	def static removeAreaObject(DynamicRobot robot, AreaObject areaObject) {
		var DetectedObject removeObject 
		for (DetectedObject detectedObj : robot.detectedObjects) {
			if (detectedObj.object == areaObject) {
				removeObject = detectedObj
			}
		}
		robot.detectedObjects.remove(removeObject)
	}
	

}
