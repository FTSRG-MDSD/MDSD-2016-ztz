package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.SizeDimensionsDifferMatch;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.Size;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.sizeDimensionsDiffer pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SizeDimensionsDifferProcessor implements IMatchProcessor<SizeDimensionsDifferMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * @param pSize the value of pattern parameter size in the currently processed match
   * 
   */
  public abstract void process(final Robot pRobot, final Size pSize);
  
  @Override
  public void process(final SizeDimensionsDifferMatch match) {
    process(match.getRobot(), match.getSize());
  }
}
