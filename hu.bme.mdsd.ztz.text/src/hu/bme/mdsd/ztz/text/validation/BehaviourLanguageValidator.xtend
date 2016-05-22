/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.validation

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.behaviour.Message
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution
import hu.bme.mdsd.ztz.model.drone.DronePackage
import hu.bme.mdsd.ztz.model.drone.MeasureValue
import hu.bme.mdsd.ztz.model.drone.Property
import hu.bme.mdsd.ztz.model.drone.PropertyKey
import hu.bme.mdsd.ztz.model.drone.StringValue
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.Condition
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget
import hu.bme.mdsd.ztz.text.manager.ResourceManager
import java.util.HashMap
import java.util.HashSet
import java.util.Iterator
import java.util.Map.Entry
import org.eclipse.xtext.validation.Check
import hu.bme.mdsd.ztz.text.util.RobotUtil

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BehaviourLanguageValidator extends AbstractBehaviourLanguageValidator {

	@Check
	def handleImport(Import imp) {
		if (imp.importURI.empty) {
			error("Import cannot be empty", BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI,
				ErrorCodes.INVALID_IMPORT)
		} else if (imp.importURI.endsWith(ResourceManager.instance.acceptedDomain)) {
			val manager = ResourceManager.instance
			try {
				manager.load(imp)
			} catch (Exception e) {
				error(e.message, BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT)
			}
		} else {
			error(
				"The resource must be an instance of " + ResourceManager.instance.acceptedDomain,
				BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI,
				ErrorCodes.INVALID_IMPORT
			)
		}
	}

	@Check
	def checkSelfKnowing(CollaborationStatement statement) {
		for (RobotCollaboration collab : statement.collaboration) {
			if (statement.robot == collab.collaborator) {
				error("Robots cannot know themselves", BehaviourLanguagePackage.Literals.COLLABORATION_STATEMENT__ROBOT,
					ErrorCodes.SAME_COLLABORATOR)
			}
		}
	}

	@Check
	def checkUniqueRobotNames(DynamicRobot robot) {
		val container = robot.eContainer as BehaviourContainer
		for (DynamicRobot otherRobot : container.dynamicRobots) {
			if (otherRobot != robot) {
				if (otherRobot.name.equals(robot.name)) {
					error("Robots cannot have the same name", robot, DronePackage.Literals.NAMED_ELEMENT__NAME,
						ErrorCodes.SAME_ROBOT_NAME)
				}
			}
		}
	}
	
	@Check
	def checkUniqueRobots(DynamicRobot dynamicRobot) {
		val container = dynamicRobot.eContainer as BehaviourContainer
		for (DynamicRobot otherDynamicRobot : container.dynamicRobots) {
			if (otherDynamicRobot != dynamicRobot) {
				if (otherDynamicRobot.robot == dynamicRobot.robot) {
					error("Cannot instantiate a robot with a dynamic robot more than once", dynamicRobot, BehaviourPackage.Literals.DYNAMIC_ROBOT__ROBOT)
				}
			}
		}
	}

	@Check
	def checkUniqueMessageNames(Message message) {
		val messagesIterator = message.eResource.allContents.filter(Message)
		while (messagesIterator.hasNext) {
			var otherMessage = messagesIterator.next()
			if (otherMessage != message) {
				if (otherMessage.name.equals(message.name)) {
					error("Messages cannot have the same name", message, DronePackage.Literals.NAMED_ELEMENT__NAME,
						ErrorCodes.SAME_MESSAGE_NAME)
				}
			}

		}
	}

	@Check
	def checkUniqueTaskExecutionNames(TaskExecution taskExecution) {
		val taskIterator = taskExecution.eResource.allContents.filter(TaskExecution)
		while (taskIterator.hasNext) {
			var otherMessage = taskIterator.next()
			if (otherMessage != taskExecution) {
				if (otherMessage.name.equals(taskExecution.name)) {
					error("Messages cannot have the same name", taskExecution,
						DronePackage.Literals.NAMED_ELEMENT__NAME, ErrorCodes.SAME_TASK_EXECUTION_NAME)
				}
			}
		}
	}

	@Check
	def checkUniqueMessageStatement(MessageStatement statement) {
		val robot = statement.robot
		val collabStatements = statement.eResource.allContents.filter(CollaborationStatement)
		val target = statement.target

		if (target instanceof UniTarget) {
			if (!inCollaboration(collabStatements, robot, target.target)) {
				error("Target robot is not in collaboration with the sender robot", target,
					BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION)
			}
		} else if (target instanceof MultiTarget) {
			for (DynamicRobot targetRobot : target.target) {
				if (!inCollaboration(collabStatements, robot, targetRobot)) {
					error("Target robot is not in collaboration with the sender robot", target,
						BehaviourLanguagePackage.Literals.MULTI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION)
				}
			}
		} else if (target instanceof AllTarget) {
			if (!hasCollaboration(collabStatements, robot)) {
				error("The sender robot is not in collaboration with anyone", target,
					BehaviourLanguagePackage.Literals.ALL_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION)
			}

		}
	}

	def boolean hasCollaboration(Iterator<CollaborationStatement> collabStatements, DynamicRobot robot) {
		while (collabStatements.hasNext) {
			var stat = collabStatements.next
			if (stat.robot == robot) {
				return true
			} else {
				for (RobotCollaboration collab : stat.collaboration) {
					if (collab.collaborator == robot) {
						return true
					}
				}
			}
		}
		return false
	}

	def inCollaboration(Iterator<CollaborationStatement> collabStatements, DynamicRobot robot,
		DynamicRobot targetRobot) {
		while (collabStatements.hasNext) {
			var stat = collabStatements.next
			if (stat.robot == targetRobot) {
				return true
			} else if (stat.robot == robot) {
				for (RobotCollaboration collab : stat.collaboration) {
					if (collab.collaborator == targetRobot) {
						return true
					}
				}
			}
		}
		return false
	}

	@Check
	def checkSynchronousStatement(SynchronousStatement synchronousStatement) {
		val robotOccurrence = new HashMap<DynamicRobot, Integer>()
		for (Statement statement : synchronousStatement.statements) {
			findRobotOccurrence(statement, robotOccurrence)
			for (Entry<DynamicRobot, Integer> entry : robotOccurrence.entrySet) {
				if (entry.value > 1) {
					error("A synchronous statement cannot contain more actions belonging to the same robot",
						BehaviourLanguagePackage.Literals.SYNCHRONOUS_STATEMENT__STATEMENTS)
				}
			}
		}
	}

	def dispatch findRobotOccurrence(ActionStatement statement, HashMap<DynamicRobot, Integer> robotOccurence) {
		var int occurred = getOccurrence(robotOccurence, statement.robot)
		robotOccurence.put(statement.robot, occurred)
	}

	def dispatch findRobotOccurrence(MessageStatement statement, HashMap<DynamicRobot, Integer> robotOccurence) {
		var int occurred = getOccurrence(robotOccurence, statement.robot)
		robotOccurence.put(statement.robot, occurred)
	}

	def dispatch findRobotOccurrence(DetectionStatement statement, HashMap<DynamicRobot, Integer> robotOccurence) {
		var int occurred = getOccurrence(robotOccurence, statement.robot)
		robotOccurence.put(statement.robot, occurred)
	}

	def dispatch findRobotOccurrence(Statement statement, HashMap<DynamicRobot, Integer> robotOccurence) {
	}

	def getOccurrence(HashMap<DynamicRobot, Integer> robotOccurence, DynamicRobot robot) {
		var int occurred = 0
		if (robotOccurence.containsKey(robot)) {
			occurred = 2
		} else {
			occurred = 1
		}
	}

	@Check
	def checkPropertyKeysForActionDeclarations(ActionDeclarationStatement statement) {
		val keys = new HashMap<PropertyKey, String>()
		for (PropertyKey key : statement.properties) {
			if (keys.containsKey(key)) {
				error("An action cannot contain the same property twice", key, BehaviourLanguagePackage.Literals.ACTION_DECLARATION_STATEMENT__PROPERTIES)
				return
			}
			keys.put(key, "")
		}
	}
	
	@Check
	def checkPropertyKeysForActionImplementation(ActionImplementation actionImplementation) {
		if (actionImplementation.properties.size != actionImplementation.declaration.properties.size) {
			error("An action must have as many properties as its declaration has", actionImplementation, BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__PROPERTIES)
		}
		val keys = new HashSet<PropertyKey>()
		for (Property property : actionImplementation.properties) {
			keys.add(property.key)
		}
		for (PropertyKey key : actionImplementation.declaration.properties)  {
			if (!keys.contains(key)) {
				error("An action must have the same properties as its declaration", actionImplementation, BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__PROPERTIES)	
			}
		}
	}
	
	@Check
	def checkUniqueActionName(ActionDeclarationStatement actionStatement) {
		val container = actionStatement.eContainer as BehaviourLanguage
		for (Statement otherStatement : container.statements) {
			if (otherStatement != actionStatement) {
				if (otherStatement instanceof ActionDeclarationStatement) {
					if (otherStatement.name.equals(actionStatement.name)) {
						error("Action declarations cannot have the same name", actionStatement, BehaviourLanguagePackage.Literals.ACTION_DECLARATION_STATEMENT__NAME)
					}
				}
			}
		}
	}
	
	@Check
	def checkActionWithoutDeclarations(ActionImplementation action) {
		val container = action.eResource.contents.get(0) as BehaviourLanguage 
		if (container.statements.filter(ActionDeclarationStatement).size == 0) {
			error("A robot cannot do an action without an action declaration. Declare an action with the action keyword.", action, 
				BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__DECLARATION)
		}
	}
	
	@Check
	def propertyConditionsNotMatch(Condition condition) {
		if (condition.leftMeasure != null && condition.rightMeasure != null) {
			val left = RobotUtil.getPropertyValueFromComparable(condition.leftMeasure)
			val right = RobotUtil.getPropertyValueFromComparable(condition.rightMeasure)
			if (left instanceof StringValue != right instanceof StringValue) {
				error("The types of the properties in the condition does not match.",condition,
					BehaviourLanguagePackage.Literals.CONDITION__COMPARE)
			} else if (left instanceof MeasureValue) {
				if (RobotUtil.convertTo(left as MeasureValue, (right as MeasureValue).dimension) == null
						&& RobotUtil.convertTo(right as MeasureValue, (left as MeasureValue).dimension) == null
				) {
					error("No conversion available between the dimensions of the properties in the condition.", condition,
						BehaviourLanguagePackage.Literals.CONDITION__COMPARE
					)
				}
			}
		}
	}

}
