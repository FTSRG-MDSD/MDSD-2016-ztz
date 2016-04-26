/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.tests;

import com.google.inject.Inject;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.tests.BehaviourLanguageInjectorProvider;
import hu.bme.mdsd.ztz.text.validation.ErrorCodes;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BehaviourLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class BehaviourLanguageParsingTest {
  @Inject
  private ParseHelper<BehaviourLanguage> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testEmptyImport() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import \"\"");
      _builder.newLine();
      final BehaviourLanguage model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BehaviourLanguagePackage.Literals.IMPORT, ErrorCodes.INVALID_IMPORT);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBasicGrammar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import \"something\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Declaration {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BehaviourLanguage model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
