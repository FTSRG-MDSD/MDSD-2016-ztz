package hu.bme.mdsd.ztz.model.constraints.util;

import hu.bme.mdsd.ztz.model.constraints.CollaboratorRangeDimensionsNotCompatibleMatch;
import hu.bme.mdsd.ztz.model.drone.Robot;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mdsd.ztz.model.constraints.collaboratorRangeDimensionsNotCompatible pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CollaboratorRangeDimensionsNotCompatibleProcessor implements IMatchProcessor<CollaboratorRangeDimensionsNotCompatibleMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRobot the value of pattern parameter robot in the currently processed match
   * @param pCollaborator the value of pattern parameter collaborator in the currently processed match
   * 
   */
  public abstract void process(final Robot pRobot, final Robot pCollaborator);
  
  @Override
  public void process(final CollaboratorRangeDimensionsNotCompatibleMatch match) {
    process(match.getRobot(), match.getCollaborator());
  }
}
