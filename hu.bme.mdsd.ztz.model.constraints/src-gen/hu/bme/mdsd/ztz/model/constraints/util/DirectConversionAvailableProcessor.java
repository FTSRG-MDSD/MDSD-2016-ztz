package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.DirectConversionAvailableMatch;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.directConversionAvailable pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DirectConversionAvailableProcessor implements IMatchProcessor<DirectConversionAvailableMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDim1 the value of pattern parameter dim1 in the currently processed match
   * @param pDim2 the value of pattern parameter dim2 in the currently processed match
   * 
   */
  public abstract void process(final MeasureDimension pDim1, final MeasureDimension pDim2);
  
  @Override
  public void process(final DirectConversionAvailableMatch match) {
    process(match.getDim1(), match.getDim2());
  }
}
