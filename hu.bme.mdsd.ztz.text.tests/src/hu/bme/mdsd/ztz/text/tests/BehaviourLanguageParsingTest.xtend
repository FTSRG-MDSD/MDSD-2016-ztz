/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.validation.ErrorCodes

@RunWith(XtextRunner)
@InjectWith(BehaviourLanguageInjectorProvider)
class BehaviourLanguageParsingTest{

	@Inject
	ParseHelper<BehaviourLanguage> parseHelper;

 	@Inject
  	private ValidationTestHelper helper;

	
	@Test
	def void testEmptyImport() {
		val model = parseHelper.parse(
		'''
		import ""
		''')
		helper.assertError(model, BehaviourLanguagePackage.Literals.IMPORT, ErrorCodes.INVALID_IMPORT)
	}
	
}