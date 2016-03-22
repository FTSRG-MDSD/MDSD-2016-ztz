package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.constraints.OneDetectedObjectMatch;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.oneDetectedObject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class OneDetectedObjectProcessor implements IMatchProcessor<OneDetectedObjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pObject the value of pattern parameter object in the currently processed match
   * @param pDetected1 the value of pattern parameter detected1 in the currently processed match
   * 
   */
  public abstract void process(final AreaObject pObject, final DetectedObject pDetected1);
  
  @Override
  public void process(final OneDetectedObjectMatch match) {
    process(match.getObject(), match.getDetected1());
  }
}
