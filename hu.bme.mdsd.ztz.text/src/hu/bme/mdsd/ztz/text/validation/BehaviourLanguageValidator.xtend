/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.validation

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
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
				if (!manager.folderExist(imp)) {
					error("The imported file must be located in the model folder which does not exist", BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, 
						ErrorCodes.MISSING_FOLDER
					)
				}
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
				val robots = statement.eContainer.eAllContents.filter(DynamicRobot).toSet
				if (robots.size > 1) {
					for (DynamicRobot r : robots) {
						if (r != statement.robot) {
							error("Robots cannot know themselves", collab, BehaviourPackage.Literals.ROBOT_COLLABORATION__COLLABORATOR,
								ErrorCodes.SAME_COLLABORATOR, r.name)
							return
						}
					}
				} else {
					error("Robots cannot know themselves", collab, BehaviourPackage.Literals.ROBOT_COLLABORATION__COLLABORATOR,
						ErrorCodes.SAME_AND_ONLY_COLLABORATOR)
				}
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
					error("Cannot instantiate a robot with a dynamic robot more than once", dynamicRobot, BehaviourPackage.Literals.DYNAMIC_ROBOT__ROBOT, 
						ErrorCodes.MORE_DYNAMIC_INSTANCE_OF_ROBOT, dynamicRobot.name)
				}
			}
		}
	}

//	@Check
//	def checkUniqueMessageNames(Message message) {
//		val messagesIterator = message.eResource.allContents.filter(Message)
//		while (messagesIterator.hasNext) {
//			var otherMessage = messagesIterator.next()
//			if (otherMessage != message) {
//				if (otherMessage.name.equals(message.name)) {
//					error("Messages cannot have the same name", message, DronePackage.Literals.NAMED_ELEMENT__NAME,
//						ErrorCodes.SAME_MESSAGE_NAME)
//				}
//			}
//
//		}
//	}

	@Check
	def checkUniqueTaskExecutionNames(TaskExecution taskExecution) {
		val taskIterator = taskExecution.eResource.allContents.filter(TaskExecution)
		while (taskIterator.hasNext) {
			var otherTaskExecution = taskIterator.next()
			if (otherTaskExecution != taskExecution) {
				if (otherTaskExecution.name.equals(taskExecution.name)) {
					error("Task executions cannot have the same name", taskExecution,
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
			if (target.target == robot) {
				val robots = target.eResource.allContents.filter(DynamicRobot).toSet
				for (DynamicRobot r : robots) {
					if (r != target.target && inCollaboration(collabStatements, robot, r)) {
						error("The target robot is the same as the sender", target, BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET, 
							ErrorCodes.SAME_MESSAGE_TARGET_WITH_COLLABORATIONS, r.name)
						return
					}
				}
				error("The target robot is the same as the sender", target, BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET, ErrorCodes.SAME_MESSAGE_TARGET)
			} else if (!inCollaboration(collabStatements, robot, target.target)) {
				error("Target robot is not in collaboration with the sender robot", target,
					BehaviourLanguagePackage.Literals.UNI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION, target.target.name)
			}
		} else if (target instanceof MultiTarget) {
			for (DynamicRobot targetRobot : target.target) {
				if (!inCollaboration(collabStatements, robot, targetRobot)) {
					error("Target robot is not in collaboration with the sender robot", target,
						BehaviourLanguagePackage.Literals.MULTI_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION, targetRobot.name)
				}
			}
		} else if (target instanceof AllTarget) {
			if (!hasCollaboration(collabStatements, robot)) {
				error("The sender robot is not in collaboration with anyone", target,
					BehaviourLanguagePackage.Literals.ALL_TARGET__TARGET, ErrorCodes.NOT_IN_COLLABORATION_BROADCAST)
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
		}
	}

	def dispatch findRobotOccurrence(ActionStatement statement, HashMap<DynamicRobot, Integer> robotOccurence) {
		if (robotOccurence.containsKey(statement.robot)) {
			error("A synchronous statement cannot contain more actions belonging to the same robot", statement,  
						BehaviourLanguagePackage.Literals.ACTION_STATEMENT__ROBOT, ErrorCodes.SAME_ROBOT_STATEMENTS_IN_SYNC)	
		} else {
			robotOccurence.put(statement.robot, 1)
		}
	}

	def dispatch findRobotOccurrence(MessageStatement statement, HashMap<DynamicRobot, Integer> robotOccurence) {
		if (robotOccurence.containsKey(statement.robot)) {
			error("A synchronous statement cannot contain more actions belonging to the same robot", statement,  
						BehaviourLanguagePackage.Literals.MESSAGE_STATEMENT__ROBOT, ErrorCodes.SAME_ROBOT_STATEMENTS_IN_SYNC)	
		} else {
			robotOccurence.put(statement.robot, 1)
		}
	}

	def dispatch findRobotOccurrence(DetectionStatement statement, HashMap<DynamicRobot, Integer> robotOccurence) {
		if (robotOccurence.containsKey(statement.robot)) {
			error("A synchronous statement cannot contain more actions belonging to the same robot", statement,  
						BehaviourLanguagePackage.Literals.DETECTION_STATEMENT__ROBOT, ErrorCodes.SAME_ROBOT_STATEMENTS_IN_SYNC)	
		} else {
			robotOccurence.put(statement.robot, 1)
		}
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
			error("An action must have as many properties as its declaration has", actionImplementation, BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__PROPERTIES, 
				ErrorCodes.FEWER_ACTION_PROPERTIES)
				return
		}
		val keys = new HashSet<PropertyKey>()
		for (Property property : actionImplementation.properties) {
			keys.add(property.key)
		}
		for (PropertyKey key : actionImplementation.declaration.properties)  {
			if (!keys.contains(key)) {
				error("An action must have the same properties as its declaration", actionImplementation, BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__PROPERTIES,
					ErrorCodes.NOT_THE_SAME_ACTION_PROPERTIES)
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
		
		if (action.declaration != null) {
			if (action.declaration.name == null) {
				error("A robot cannot do an action without an action declaration. Declare an action with the action keyword.", action,
					BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION__DECLARATION, ErrorCodes.MISSING_ACTION_DECLARATION)
			}
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
