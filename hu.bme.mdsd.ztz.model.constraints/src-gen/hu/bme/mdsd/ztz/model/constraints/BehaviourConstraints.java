package hu.bme.mdsd.ztz.model.constraints;

import hu.bme.mdsd.ztz.model.constraints.CircleRequirementReferenceMatcher;
import hu.bme.mdsd.ztz.model.constraints.CollaborationBetweenDynamicRobotsMatcher;
import hu.bme.mdsd.ztz.model.constraints.CollaborationNotSymmetricMatcher;
import hu.bme.mdsd.ztz.model.constraints.CollaborationRangeDimensionsNotCompatibleMatcher;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionHasMessageMatcher;
import hu.bme.mdsd.ztz.model.constraints.CommunicationActionWithoutMessageMatcher;
import hu.bme.mdsd.ztz.model.constraints.DynamicRobotMultiplyDefinedMatcher;
import hu.bme.mdsd.ztz.model.constraints.ExecutorOfTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.IncorrectWaitingTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.IsNotWaitingTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.MessageNotFromRepositoryMatcher;
import hu.bme.mdsd.ztz.model.constraints.MessageTargetMatcher;
import hu.bme.mdsd.ztz.model.constraints.MessageToSelfMatcher;
import hu.bme.mdsd.ztz.model.constraints.NonPositiveParticipantsMatcher;
import hu.bme.mdsd.ztz.model.constraints.NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher;
import hu.bme.mdsd.ztz.model.constraints.NotEnoughExecutorsMatcher;
import hu.bme.mdsd.ztz.model.constraints.OneDetectedObjectMatcher;
import hu.bme.mdsd.ztz.model.constraints.RepositoryHasSendedMessageMatcher;
import hu.bme.mdsd.ztz.model.constraints.RequiredCapabilityMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotCannotExecuteTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotExecutingUnlinkedTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.RobotHasTaskMatcher;
import hu.bme.mdsd.ztz.model.constraints.SameCollaboratorRobotMatcher;
import hu.bme.mdsd.ztz.model.constraints.SameTaskAsPrerequisiteMatcher;
import hu.bme.mdsd.ztz.model.constraints.TaskExecutionRequiresTaskExecutionMatcher;
import hu.bme.mdsd.ztz.model.constraints.TaskRequirementHasCapabilityMatcher;
import hu.bme.mdsd.ztz.model.constraints.util.CircleRequirementReferenceQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.CollaborationBetweenDynamicRobotsQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.CollaborationNotSymmetricQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.CollaborationRangeDimensionsNotCompatibleQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.CommunicationActionHasMessageQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.CommunicationActionWithoutMessageQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.DynamicRobotMultiplyDefinedQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.ExecutorOfTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.IncorrectWaitingTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.IsNotWaitingTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.MessageNotFromRepositoryQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.MessageTargetQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.MessageToSelfQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NonPositiveParticipantsQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.NotEnoughExecutorsQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.OneDetectedObjectQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RepositoryHasSendedMessageQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RequiredCapabilityQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotCannotExecuteTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotExecutingUnlinkedTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.RobotHasTaskQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SameCollaboratorRobotQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.SameTaskAsPrerequisiteQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.TaskExecutionRequiresTaskExecutionQuerySpecification;
import hu.bme.mdsd.ztz.model.constraints.util.TaskRequirementHasCapabilityQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in behaviourConstraints.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file behaviourConstraints.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mdsd.ztz.model.constraints, the group contains the definition of the following patterns: <ul>
 * <li>sameTaskAsPrerequisite</li>
 * <li>nonPositiveParticipants</li>
 * <li>incorrectWaitingTask</li>
 * <li>isNotWaitingTask</li>
 * <li>sameCollaboratorRobot</li>
 * <li>oneDetectedObject</li>
 * <li>robotCannotExecuteTask</li>
 * <li>requiredCapability</li>
 * <li>robotExecutingUnlinkedTask</li>
 * <li>robotHasTask</li>
 * <li>collaborationRangeDimensionsNotCompatible</li>
 * <li>collaborationBetweenDynamicRobots</li>
 * <li>collaborationNotSymmetric</li>
 * <li>dynamicRobotMultiplyDefined</li>
 * <li>notEnoughExecutors</li>
 * <li>executorOfTask</li>
 * <li>notCorrectlyLinkedCapabilityPropertiesToRequirement</li>
 * <li>taskRequirementHasCapability</li>
 * <li>circleRequirementReference</li>
 * <li>taskExecutionRequiresTaskExecution</li>
 * <li>messageToSelf</li>
 * <li>messageTarget</li>
 * <li>communicationActionWithoutMessage</li>
 * <li>communicationActionHasMessage</li>
 * <li>messageNotFromRepository</li>
 * <li>repositoryHasSendedMessage</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class BehaviourConstraints extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static BehaviourConstraints instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new BehaviourConstraints();
    }
    return INSTANCE;
  }
  
  private static BehaviourConstraints INSTANCE;
  
  private BehaviourConstraints() throws IncQueryException {
    querySpecifications.add(SameTaskAsPrerequisiteQuerySpecification.instance());
    querySpecifications.add(NonPositiveParticipantsQuerySpecification.instance());
    querySpecifications.add(IncorrectWaitingTaskQuerySpecification.instance());
    querySpecifications.add(IsNotWaitingTaskQuerySpecification.instance());
    querySpecifications.add(SameCollaboratorRobotQuerySpecification.instance());
    querySpecifications.add(OneDetectedObjectQuerySpecification.instance());
    querySpecifications.add(RobotCannotExecuteTaskQuerySpecification.instance());
    querySpecifications.add(RequiredCapabilityQuerySpecification.instance());
    querySpecifications.add(RobotExecutingUnlinkedTaskQuerySpecification.instance());
    querySpecifications.add(RobotHasTaskQuerySpecification.instance());
    querySpecifications.add(CollaborationRangeDimensionsNotCompatibleQuerySpecification.instance());
    querySpecifications.add(CollaborationBetweenDynamicRobotsQuerySpecification.instance());
    querySpecifications.add(CollaborationNotSymmetricQuerySpecification.instance());
    querySpecifications.add(DynamicRobotMultiplyDefinedQuerySpecification.instance());
    querySpecifications.add(NotEnoughExecutorsQuerySpecification.instance());
    querySpecifications.add(ExecutorOfTaskQuerySpecification.instance());
    querySpecifications.add(NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification.instance());
    querySpecifications.add(TaskRequirementHasCapabilityQuerySpecification.instance());
    querySpecifications.add(CircleRequirementReferenceQuerySpecification.instance());
    querySpecifications.add(TaskExecutionRequiresTaskExecutionQuerySpecification.instance());
    querySpecifications.add(MessageToSelfQuerySpecification.instance());
    querySpecifications.add(MessageTargetQuerySpecification.instance());
    querySpecifications.add(CommunicationActionWithoutMessageQuerySpecification.instance());
    querySpecifications.add(CommunicationActionHasMessageQuerySpecification.instance());
    querySpecifications.add(MessageNotFromRepositoryQuerySpecification.instance());
    querySpecifications.add(RepositoryHasSendedMessageQuerySpecification.instance());
  }
  
  public SameTaskAsPrerequisiteQuerySpecification getSameTaskAsPrerequisite() throws IncQueryException {
    return SameTaskAsPrerequisiteQuerySpecification.instance();
  }
  
  public SameTaskAsPrerequisiteMatcher getSameTaskAsPrerequisite(final IncQueryEngine engine) throws IncQueryException {
    return SameTaskAsPrerequisiteMatcher.on(engine);
  }
  
  public NonPositiveParticipantsQuerySpecification getNonPositiveParticipants() throws IncQueryException {
    return NonPositiveParticipantsQuerySpecification.instance();
  }
  
  public NonPositiveParticipantsMatcher getNonPositiveParticipants(final IncQueryEngine engine) throws IncQueryException {
    return NonPositiveParticipantsMatcher.on(engine);
  }
  
  public IncorrectWaitingTaskQuerySpecification getIncorrectWaitingTask() throws IncQueryException {
    return IncorrectWaitingTaskQuerySpecification.instance();
  }
  
  public IncorrectWaitingTaskMatcher getIncorrectWaitingTask(final IncQueryEngine engine) throws IncQueryException {
    return IncorrectWaitingTaskMatcher.on(engine);
  }
  
  public IsNotWaitingTaskQuerySpecification getIsNotWaitingTask() throws IncQueryException {
    return IsNotWaitingTaskQuerySpecification.instance();
  }
  
  public IsNotWaitingTaskMatcher getIsNotWaitingTask(final IncQueryEngine engine) throws IncQueryException {
    return IsNotWaitingTaskMatcher.on(engine);
  }
  
  public SameCollaboratorRobotQuerySpecification getSameCollaboratorRobot() throws IncQueryException {
    return SameCollaboratorRobotQuerySpecification.instance();
  }
  
  public SameCollaboratorRobotMatcher getSameCollaboratorRobot(final IncQueryEngine engine) throws IncQueryException {
    return SameCollaboratorRobotMatcher.on(engine);
  }
  
  public OneDetectedObjectQuerySpecification getOneDetectedObject() throws IncQueryException {
    return OneDetectedObjectQuerySpecification.instance();
  }
  
  public OneDetectedObjectMatcher getOneDetectedObject(final IncQueryEngine engine) throws IncQueryException {
    return OneDetectedObjectMatcher.on(engine);
  }
  
  public RobotCannotExecuteTaskQuerySpecification getRobotCannotExecuteTask() throws IncQueryException {
    return RobotCannotExecuteTaskQuerySpecification.instance();
  }
  
  public RobotCannotExecuteTaskMatcher getRobotCannotExecuteTask(final IncQueryEngine engine) throws IncQueryException {
    return RobotCannotExecuteTaskMatcher.on(engine);
  }
  
  public RequiredCapabilityQuerySpecification getRequiredCapability() throws IncQueryException {
    return RequiredCapabilityQuerySpecification.instance();
  }
  
  public RequiredCapabilityMatcher getRequiredCapability(final IncQueryEngine engine) throws IncQueryException {
    return RequiredCapabilityMatcher.on(engine);
  }
  
  public RobotExecutingUnlinkedTaskQuerySpecification getRobotExecutingUnlinkedTask() throws IncQueryException {
    return RobotExecutingUnlinkedTaskQuerySpecification.instance();
  }
  
  public RobotExecutingUnlinkedTaskMatcher getRobotExecutingUnlinkedTask(final IncQueryEngine engine) throws IncQueryException {
    return RobotExecutingUnlinkedTaskMatcher.on(engine);
  }
  
  public RobotHasTaskQuerySpecification getRobotHasTask() throws IncQueryException {
    return RobotHasTaskQuerySpecification.instance();
  }
  
  public RobotHasTaskMatcher getRobotHasTask(final IncQueryEngine engine) throws IncQueryException {
    return RobotHasTaskMatcher.on(engine);
  }
  
  public CollaborationRangeDimensionsNotCompatibleQuerySpecification getCollaborationRangeDimensionsNotCompatible() throws IncQueryException {
    return CollaborationRangeDimensionsNotCompatibleQuerySpecification.instance();
  }
  
  public CollaborationRangeDimensionsNotCompatibleMatcher getCollaborationRangeDimensionsNotCompatible(final IncQueryEngine engine) throws IncQueryException {
    return CollaborationRangeDimensionsNotCompatibleMatcher.on(engine);
  }
  
  public CollaborationBetweenDynamicRobotsQuerySpecification getCollaborationBetweenDynamicRobots() throws IncQueryException {
    return CollaborationBetweenDynamicRobotsQuerySpecification.instance();
  }
  
  public CollaborationBetweenDynamicRobotsMatcher getCollaborationBetweenDynamicRobots(final IncQueryEngine engine) throws IncQueryException {
    return CollaborationBetweenDynamicRobotsMatcher.on(engine);
  }
  
  public CollaborationNotSymmetricQuerySpecification getCollaborationNotSymmetric() throws IncQueryException {
    return CollaborationNotSymmetricQuerySpecification.instance();
  }
  
  public CollaborationNotSymmetricMatcher getCollaborationNotSymmetric(final IncQueryEngine engine) throws IncQueryException {
    return CollaborationNotSymmetricMatcher.on(engine);
  }
  
  public DynamicRobotMultiplyDefinedQuerySpecification getDynamicRobotMultiplyDefined() throws IncQueryException {
    return DynamicRobotMultiplyDefinedQuerySpecification.instance();
  }
  
  public DynamicRobotMultiplyDefinedMatcher getDynamicRobotMultiplyDefined(final IncQueryEngine engine) throws IncQueryException {
    return DynamicRobotMultiplyDefinedMatcher.on(engine);
  }
  
  public NotEnoughExecutorsQuerySpecification getNotEnoughExecutors() throws IncQueryException {
    return NotEnoughExecutorsQuerySpecification.instance();
  }
  
  public NotEnoughExecutorsMatcher getNotEnoughExecutors(final IncQueryEngine engine) throws IncQueryException {
    return NotEnoughExecutorsMatcher.on(engine);
  }
  
  public ExecutorOfTaskQuerySpecification getExecutorOfTask() throws IncQueryException {
    return ExecutorOfTaskQuerySpecification.instance();
  }
  
  public ExecutorOfTaskMatcher getExecutorOfTask(final IncQueryEngine engine) throws IncQueryException {
    return ExecutorOfTaskMatcher.on(engine);
  }
  
  public NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification getNotCorrectlyLinkedCapabilityPropertiesToRequirement() throws IncQueryException {
    return NotCorrectlyLinkedCapabilityPropertiesToRequirementQuerySpecification.instance();
  }
  
  public NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher getNotCorrectlyLinkedCapabilityPropertiesToRequirement(final IncQueryEngine engine) throws IncQueryException {
    return NotCorrectlyLinkedCapabilityPropertiesToRequirementMatcher.on(engine);
  }
  
  public TaskRequirementHasCapabilityQuerySpecification getTaskRequirementHasCapability() throws IncQueryException {
    return TaskRequirementHasCapabilityQuerySpecification.instance();
  }
  
  public TaskRequirementHasCapabilityMatcher getTaskRequirementHasCapability(final IncQueryEngine engine) throws IncQueryException {
    return TaskRequirementHasCapabilityMatcher.on(engine);
  }
  
  public CircleRequirementReferenceQuerySpecification getCircleRequirementReference() throws IncQueryException {
    return CircleRequirementReferenceQuerySpecification.instance();
  }
  
  public CircleRequirementReferenceMatcher getCircleRequirementReference(final IncQueryEngine engine) throws IncQueryException {
    return CircleRequirementReferenceMatcher.on(engine);
  }
  
  public TaskExecutionRequiresTaskExecutionQuerySpecification getTaskExecutionRequiresTaskExecution() throws IncQueryException {
    return TaskExecutionRequiresTaskExecutionQuerySpecification.instance();
  }
  
  public TaskExecutionRequiresTaskExecutionMatcher getTaskExecutionRequiresTaskExecution(final IncQueryEngine engine) throws IncQueryException {
    return TaskExecutionRequiresTaskExecutionMatcher.on(engine);
  }
  
  public MessageToSelfQuerySpecification getMessageToSelf() throws IncQueryException {
    return MessageToSelfQuerySpecification.instance();
  }
  
  public MessageToSelfMatcher getMessageToSelf(final IncQueryEngine engine) throws IncQueryException {
    return MessageToSelfMatcher.on(engine);
  }
  
  public MessageTargetQuerySpecification getMessageTarget() throws IncQueryException {
    return MessageTargetQuerySpecification.instance();
  }
  
  public MessageTargetMatcher getMessageTarget(final IncQueryEngine engine) throws IncQueryException {
    return MessageTargetMatcher.on(engine);
  }
  
  public CommunicationActionWithoutMessageQuerySpecification getCommunicationActionWithoutMessage() throws IncQueryException {
    return CommunicationActionWithoutMessageQuerySpecification.instance();
  }
  
  public CommunicationActionWithoutMessageMatcher getCommunicationActionWithoutMessage(final IncQueryEngine engine) throws IncQueryException {
    return CommunicationActionWithoutMessageMatcher.on(engine);
  }
  
  public CommunicationActionHasMessageQuerySpecification getCommunicationActionHasMessage() throws IncQueryException {
    return CommunicationActionHasMessageQuerySpecification.instance();
  }
  
  public CommunicationActionHasMessageMatcher getCommunicationActionHasMessage(final IncQueryEngine engine) throws IncQueryException {
    return CommunicationActionHasMessageMatcher.on(engine);
  }
  
  public MessageNotFromRepositoryQuerySpecification getMessageNotFromRepository() throws IncQueryException {
    return MessageNotFromRepositoryQuerySpecification.instance();
  }
  
  public MessageNotFromRepositoryMatcher getMessageNotFromRepository(final IncQueryEngine engine) throws IncQueryException {
    return MessageNotFromRepositoryMatcher.on(engine);
  }
  
  public RepositoryHasSendedMessageQuerySpecification getRepositoryHasSendedMessage() throws IncQueryException {
    return RepositoryHasSendedMessageQuerySpecification.instance();
  }
  
  public RepositoryHasSendedMessageMatcher getRepositoryHasSendedMessage(final IncQueryEngine engine) throws IncQueryException {
    return RepositoryHasSendedMessageMatcher.on(engine);
  }
}
