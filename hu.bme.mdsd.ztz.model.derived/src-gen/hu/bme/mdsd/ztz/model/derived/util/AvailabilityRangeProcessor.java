package hu.bme.mdsd.ztz.model.derived.util;

import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.derived.AvailabilityRangeMatch;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.derived.availabilityRange pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class AvailabilityRangeProcessor implements IMatchProcessor<AvailabilityRangeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobotCollaboration the value of pattern parameter robotCollaboration in the currently processed match
   * @param pMinimumRange the value of pattern parameter minimumRange in the currently processed match
   * 
   */
  public abstract void process(final RobotCollaboration pRobotCollaboration, final MeasureValue pMinimumRange);
  
  @Override
  public void process(final AvailabilityRangeMatch match) {
    process(match.getRobotCollaboration(), match.getMinimumRange());
  }
}
