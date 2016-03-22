package hu.bme.mdsd.ztz.model.derived.util;

import hu.bme.mdsd.ztz.model.derived.EstimatedTimeMatch;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Task;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.derived.estimatedTime pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EstimatedTimeProcessor implements IMatchProcessor<EstimatedTimeMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSourceTask the value of pattern parameter sourceTask in the currently processed match
   * @param pTargetMeasure the value of pattern parameter targetMeasure in the currently processed match
   * 
   */
  public abstract void process(final Task pSourceTask, final MeasureValue pTargetMeasure);
  
  @Override
  public void process(final EstimatedTimeMatch match) {
    process(match.getSourceTask(), match.getTargetMeasure());
  }
}
