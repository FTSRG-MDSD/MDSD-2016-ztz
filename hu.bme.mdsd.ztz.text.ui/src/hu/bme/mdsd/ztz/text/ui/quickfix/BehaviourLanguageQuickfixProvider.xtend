/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.ui.quickfix

import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.drone.DroneFactory
import hu.bme.mdsd.ztz.model.drone.PropertyKey
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguageFactory
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement
import hu.bme.mdsd.ztz.text.validation.ErrorCodes
import java.util.ArrayList
import java.util.HashMap
import java.util.Map
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
class BehaviourLanguageQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(ErrorCodes.NOT_IN_COLLABORATION)
	def fixMissingCollaboration(Issue issue, IssueResolutionAcceptor acceptor) {
		val modificationContext = modificationContextFactory.createModificationContext(issue)
		
		acceptor.accept(issue, "Add new collaboration", "", "") [
			element, context |
				val messageTarget = element as MessageTarget
				val statement = messageTarget.eContainer as MessageStatement			
				val language = statement.eContainer as BehaviourLanguage
				
				val robots = messageTarget.eResource.allContents.filter(DynamicRobot).toSet
				var DynamicRobot target
				for (DynamicRobot r : robots) {
					if (issue.data.get(0).equals(r.name)) {
						target = r
					}
				}
				
				val newCollaborationStatement = BehaviourLanguageFactory.eINSTANCE.createCollaborationStatement
				newCollaborationStatement.robot = statement.robot
					
				val newCollaboration = BehaviourFactory.eINSTANCE.createRobotCollaboration
				newCollaboration.collaborator = target 
					
				newCollaborationStatement.collaboration.add(newCollaboration)
				language.statements.add(0, newCollaborationStatement)
			
		]
	}

//	@Fix(ErrorCodes.SAME_MESSAGE_NAME)
//	def changeMessageName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Change message', 'Change the message name.', 'upcase.png') [
//			element, context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//			val message = element as Message
//			val oldMessageName = message.name 
//			message.name = oldMessageName + "2"
//		]
//	}
	
	@Fix(ErrorCodes.MISSING_ACTION_DECLARATION)
	def fixMissingActionDeclaration(Issue issue, IssueResolutionAcceptor acceptor) {
		val modificationContext = modificationContextFactory.createModificationContext(issue)
		
		acceptor.accept(issue, "Add new action", "", "") [
			element, context |
				val actionImp = element as ActionImplementation
				val document = context.xtextDocument				
				val actionName = document.get(issue.offset,issue.length)

				val language = actionImp.eResource.contents.get(0) as BehaviourLanguage
				
				val ActionDeclarationStatement newActionDeclaration = BehaviourLanguageFactory.eINSTANCE.createActionDeclarationStatement
				newActionDeclaration.name = actionName
				newActionDeclaration.properties.addAll(actionImp.declaration.properties)
				
				language.statements.add(0, newActionDeclaration)
			
		]
	}
	
	@Fix(ErrorCodes.SAME_COLLABORATOR)
	def fixSelfCollaboration(Issue issue, IssueResolutionAcceptor acceptor) {
		val modificationContext = modificationContextFactory.createModificationContext(issue)

		acceptor.accept(issue, "Change the collaborator to " + issue.data.get(0), "", "") [
			element, context |
				val xtextDocument = context.xtextDocument
				xtextDocument.replace(issue.offset, issue.length, issue.data.get(0))
		]
	}
	
	@Fix(ErrorCodes.SAME_MESSAGE_TARGET_WITH_COLLABORATIONS)
	def fixSelfMessageTarget(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Change the target to " + issue.data.get(0), "", "") [
			element, context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, issue.data.get(0))
		]
	}	
	
	@Fix(ErrorCodes.SAME_ROBOT_STATEMENTS_IN_SYNC)
	def fixSameRobotStatementsInSync(Issue issue, IssueResolutionAcceptor acceptor) {
		val modificationContext = modificationContextFactory.createModificationContext(issue)
		
		acceptor.accept(issue, "Move statement before the synchronous statement", "", "") [
			element, context |
				val synchStatement = element.eContainer as SynchronousStatement
				synchStatement.statements.remove(element)
				synchStatement.eContainer.addNewStatement(synchStatement, element as Statement, false)
		]
		
		acceptor.accept(issue, "Move statement after the synchronous statement", "", "") [
			element, context |
				val synchStatement = element.eContainer as SynchronousStatement
				synchStatement.statements.remove(element)
				synchStatement.eContainer.addNewStatement(synchStatement, element as Statement, true)
					
		]
	}
	
	def dispatch addNewStatement(BehaviourLanguage container, SynchronousStatement sync, Statement statement, boolean after) {
		var index = container.statements.indexOf(sync)
		if (after) {
			index++
		}
		
		container.statements.add(index, statement)
	}
	
	def dispatch addNewStatement(ConditionalStatement container, SynchronousStatement sync, Statement statement, boolean after) {
		var index = container.statements.indexOf(sync)
		if (after) {
			index++
		}
		
		container.statements.add(index, statement)
	}
	
	@Fix(ErrorCodes.FEWER_ACTION_PROPERTIES)
	def fixMissingActionProperties(Issue issue, IssueResolutionAcceptor acceptor) {
		val modificationContext = modificationContextFactory.createModificationContext(issue)

		acceptor.accept(issue, "Add the rest of the required properties", "", "") [
			element, context |
				val actionImp = element as ActionImplementation
				changeActionProperties(actionImp, false)
		]
		
		acceptor.accept(issue, "Add the rest of the required properties and remove the superfluous ones", "", "") [
			element, context |
				val actionImp = element as ActionImplementation
				changeActionProperties(actionImp, true)
		]
	}
	
	protected def changeActionProperties(ActionImplementation actionImp, boolean removeIncorrectProperties) {
		val Map<PropertyKey, Integer> keys = getPropertyKeys(actionImp)
		 
		val newKeys = getMissingKeys(actionImp, keys)
		
		for(PropertyKey key : newKeys) {
			var property = DroneFactory.eINSTANCE.createProperty
			property.key = key
			val propertyStringValue = DroneFactory.eINSTANCE.createStringValue
			propertyStringValue.value = ""
			property.value = propertyStringValue
			
			actionImp.properties.add(property)
		}
		
		if (removeIncorrectProperties) {
			val incorrectProperties = new ArrayList<hu.bme.mdsd.ztz.model.drone.Property>()
			
			for (hu.bme.mdsd.ztz.model.drone.Property property : actionImp.properties) {
				if (!actionImp.declaration.properties.contains(property.key)) {
					incorrectProperties.add(property)
				}
			}
			
			for (hu.bme.mdsd.ztz.model.drone.Property property : incorrectProperties) {
				actionImp.properties.remove(property)
			}
			
		}
	}
	
	protected def getMissingKeys(ActionImplementation actionImp, Map<PropertyKey, Integer> keys) {
		val newKeys = new ArrayList<PropertyKey>()
		for(PropertyKey key : actionImp.declaration.properties) {
			if (!keys.containsKey(key)) {
				newKeys.add(key)
			}
		}
		return newKeys
	}
	
	protected def getPropertyKeys(ActionImplementation actionImp) {
		val Map<PropertyKey, Integer> keys = new HashMap<PropertyKey, Integer>()
		for (hu.bme.mdsd.ztz.model.drone.Property property : actionImp.properties) {
				keys.put(property.key, 1)
		}
		return keys
	}
	
	
	
	@Fix(ErrorCodes.NOT_THE_SAME_ACTION_PROPERTIES)
	def fixIncorrectActionProperties(Issue issue, IssueResolutionAcceptor acceptor) {
		val modificationContext = modificationContextFactory.createModificationContext(issue)
		
		acceptor.accept(issue, "Change the properties", "", "") [
			element, context |
				val actionImp = element as ActionImplementation
				changeActionProperties(actionImp, true)
		]
	}
	
}
