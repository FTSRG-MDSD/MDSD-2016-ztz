package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.RobotHasBatteryMatch;
import hu.bme.mdsd.ztz.model.drone.Battery;
import hu.bme.mdsd.ztz.model.drone.Robot;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.robotHasBattery pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class RobotHasBatteryProcessor implements IMatchProcessor<RobotHasBatteryMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * @param pBattery the value of pattern parameter battery in the currently processed match
   * 
   */
  public abstract void process(final Robot pRobot, final Battery pBattery);
  
  @Override
  public void process(final RobotHasBatteryMatch match) {
    process(match.getRobot(), match.getBattery());
  }
}
