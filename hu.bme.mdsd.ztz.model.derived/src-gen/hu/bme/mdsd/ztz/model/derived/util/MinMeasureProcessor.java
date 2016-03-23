package hu.bme.mdsd.ztz.model.derived.util;

import hu.bme.mdsd.ztz.model.derived.MinMeasureMatch;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.derived.minMeasure pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MinMeasureProcessor implements IMatchProcessor<MinMeasureMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * @param pCooperator the value of pattern parameter cooperator in the currently processed match
   * @param pMinimum the value of pattern parameter minimum in the currently processed match
   * 
   */
  public abstract void process(final Robot pRobot, final Robot pCooperator, final MeasureValue pMinimum);
  
  @Override
  public void process(final MinMeasureMatch match) {
    process(match.getRobot(), match.getCooperator(), match.getMinimum());
  }
}
