package hu.bme.mdsd.ztz.text.util

import hu.bme.mdsd.ztz.model.behaviour.Action
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.behaviour.Message
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution
import hu.bme.mdsd.ztz.model.drone.AreaObject
import hu.bme.mdsd.ztz.model.drone.MeasureDimension
import hu.bme.mdsd.ztz.model.drone.MeasureValue
import hu.bme.mdsd.ztz.model.drone.impl.DroneFactoryImpl
import hu.bme.mdsd.ztz.text.behaviourLanguage.MeasureComparable
import java.util.HashMap
import java.util.Map

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

	def static addExecution(DynamicRobot robot, TaskExecution execution) {
		if (execution != null) {
			if (!robot.executedTasks.contains(execution)) {
				robot.executedTasks.add(execution)
			}
		}
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
	
	def static convertTo(MeasureValue value, MeasureDimension dimension) {
		if (value.dimension == dimension){ return value; }
		else {
			val availableDimensions = new HashMap
			convertTo(value.value, value.dimension, dimension, availableDimensions)
			val convertedValue = availableDimensions.get(dimension)
			if (convertedValue != null) {
				val convertedMeasureValue = DroneFactoryImpl.eINSTANCE.createMeasureValue()
				convertedMeasureValue.dimension = dimension
				convertedMeasureValue.value = convertedValue
				return convertedMeasureValue
			}
			else return null
		}
	}
	
	private def static void convertTo(Float value, MeasureDimension currentDimension, MeasureDimension dimension, Map<MeasureDimension, Float> availableDimensions) {
		for (conversion : currentDimension.conversions) {
			if (availableDimensions.containsKey(dimension))
				return;
			if (!availableDimensions.containsKey(conversion.dimension)) {
				val convertedValue = value*conversion.rate;
				availableDimensions.put(conversion.dimension, convertedValue)
				if (conversion.dimension == dimension) {
					return;
				}
				else {
					convertTo(convertedValue, conversion.dimension, dimension, availableDimensions)
				}
			}
		}
	}
	
	def static getPropertyValueFromComparable(MeasureComparable comparable) {
		if (comparable.value != null)
			return comparable.value
		else if (comparable.container != null && comparable.member != null) {
			return comparable.container.robot.properties
				.findFirst[prop | prop.key.equals(comparable.member)].value
		}
	}
	

}
