/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.validation

import org.eclipse.xtext.validation.Check
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage
import hu.bme.mdsd.ztz.text.manager.ResourceManager
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BehaviourLanguageValidator extends AbstractBehaviourLanguageValidator {
	
	
	@Check
	def handleImport(Import imp) {
		if (imp.importURI.empty) {
			error("Import cannot be empty", BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI, ErrorCodes.INVALID_IMPORT)
		} else if (imp.importURI.endsWith(ResourceManager.instance.acceptedDomain)){
			val manager = ResourceManager.instance
			manager.load(imp)
		}
	}
	
	@Check
	def checkSelfKnowing(CollaborationStatement statement) {
		for (RobotCollaboration collab : statement.collaboration) {
			if (statement.robot == collab.collaborator) {
				error("Robots cannot know themselves", BehaviourLanguagePackage.Literals.STATEMENT__ROBOT, ErrorCodes.SAME_COLLABORATOR)
			}
		}
	}
	
}
