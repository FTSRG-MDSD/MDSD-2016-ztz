/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.drone.tests;

import com.google.inject.Inject;
import hu.bme.mdsd.drone.tests.BehaviourLanguageInjectorProvider;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BehaviourLanguageInjectorProvider.class)
@SuppressWarnings("all")
public class BehaviourLanguageParsingTest {
  @Inject
  private ParseHelper<BehaviourContainer> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final BehaviourContainer result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
