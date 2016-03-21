package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.SameMeasureMatch;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.sameMeasure pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SameMeasureProcessor implements IMatchProcessor<SameMeasureMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pMeasure the value of pattern parameter measure in the currently processed match
   * @param pConvertedMeasure the value of pattern parameter convertedMeasure in the currently processed match
   * 
   */
  public abstract void process(final MeasureDimension pMeasure, final MeasureDimension pConvertedMeasure);
  
  @Override
  public void process(final SameMeasureMatch match) {
    process(match.getMeasure(), match.getConvertedMeasure());
  }
}
