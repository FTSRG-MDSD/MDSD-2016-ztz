/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.ide.contentassist.antlr;

import com.google.inject.Inject;
import hu.bme.mdsd.ztz.text.ide.contentassist.antlr.internal.InternalBehaviourLanguageParser;
import hu.bme.mdsd.ztz.text.services.BehaviourLanguageGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class BehaviourLanguageParser extends AbstractContentAssistParser {

	@Inject
	private BehaviourLanguageGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalBehaviourLanguageParser createParser() {
		InternalBehaviourLanguageParser result = new InternalBehaviourLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPropertyValueAccess().getAlternatives(), "rule__PropertyValue__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getAtomicStatementAccess().getAlternatives(), "rule__AtomicStatement__Alternatives");
					put(grammarAccess.getMessageTargetAccess().getAlternatives(), "rule__MessageTarget__Alternatives");
					put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
					put(grammarAccess.getTaskStatusConditionAccess().getAlternatives_1(), "rule__TaskStatusCondition__Alternatives_1");
					put(grammarAccess.getRobotStatusConditionAccess().getAlternatives_1(), "rule__RobotStatusCondition__Alternatives_1");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getRobotStatusAccess().getAlternatives(), "rule__RobotStatus__Alternatives");
					put(grammarAccess.getTaskExecutionStatusAccess().getAlternatives(), "rule__TaskExecutionStatus__Alternatives");
					put(grammarAccess.getBehaviourLanguageAccess().getGroup(), "rule__BehaviourLanguage__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup(), "rule__BehaviourContainer__Group__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup_3(), "rule__BehaviourContainer__Group_3__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup_3_3(), "rule__BehaviourContainer__Group_3_3__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup_4(), "rule__BehaviourContainer__Group_4__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup_4_3(), "rule__BehaviourContainer__Group_4_3__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup_5(), "rule__BehaviourContainer__Group_5__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup_5_3(), "rule__BehaviourContainer__Group_5_3__0");
					put(grammarAccess.getBehaviourContainerAccess().getGroup_6(), "rule__BehaviourContainer__Group_6__0");
					put(grammarAccess.getDynamicRobotAccess().getGroup(), "rule__DynamicRobot__Group__0");
					put(grammarAccess.getConditionalStatementAccess().getGroup(), "rule__ConditionalStatement__Group__0");
					put(grammarAccess.getConditionalStatementAccess().getGroup_6(), "rule__ConditionalStatement__Group_6__0");
					put(grammarAccess.getActionStatementAccess().getGroup(), "rule__ActionStatement__Group__0");
					put(grammarAccess.getActionStatementAccess().getGroup_3(), "rule__ActionStatement__Group_3__0");
					put(grammarAccess.getMessageStatementAccess().getGroup(), "rule__MessageStatement__Group__0");
					put(grammarAccess.getCollaborationStatementAccess().getGroup(), "rule__CollaborationStatement__Group__0");
					put(grammarAccess.getCollaborationStatementAccess().getGroup_3(), "rule__CollaborationStatement__Group_3__0");
					put(grammarAccess.getDetectionStatementAccess().getGroup(), "rule__DetectionStatement__Group__0");
					put(grammarAccess.getExecutionStatementAccess().getGroup(), "rule__ExecutionStatement__Group__0");
					put(grammarAccess.getMultiTargetAccess().getGroup(), "rule__MultiTarget__Group__0");
					put(grammarAccess.getMultiTargetAccess().getGroup_2(), "rule__MultiTarget__Group_2__0");
					put(grammarAccess.getTaskStatusConditionAccess().getGroup(), "rule__TaskStatusCondition__Group__0");
					put(grammarAccess.getRobotStatusConditionAccess().getGroup(), "rule__RobotStatusCondition__Group__0");
					put(grammarAccess.getTaskExecutionAccess().getGroup(), "rule__TaskExecution__Group__0");
					put(grammarAccess.getTaskExecutionAccess().getGroup_4(), "rule__TaskExecution__Group_4__0");
					put(grammarAccess.getTaskExecutionAccess().getGroup_5(), "rule__TaskExecution__Group_5__0");
					put(grammarAccess.getTaskExecutionAccess().getGroup_5_3(), "rule__TaskExecution__Group_5_3__0");
					put(grammarAccess.getTaskExecutionAccess().getGroup_6(), "rule__TaskExecution__Group_6__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup(), "rule__TaskRequirement__Group__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup_7(), "rule__TaskRequirement__Group_7__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup_8(), "rule__TaskRequirement__Group_8__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup_8_3(), "rule__TaskRequirement__Group_8_3__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup_9(), "rule__TaskRequirement__Group_9__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup_9_3(), "rule__TaskRequirement__Group_9_3__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup_10(), "rule__TaskRequirement__Group_10__0");
					put(grammarAccess.getTaskRequirementAccess().getGroup_10_3(), "rule__TaskRequirement__Group_10_3__0");
					put(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getGroup(), "rule__BehaviouralPropertyKeyContainer__Group__0");
					put(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getGroup_4(), "rule__BehaviouralPropertyKeyContainer__Group_4__0");
					put(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getGroup_4_3(), "rule__BehaviouralPropertyKeyContainer__Group_4_3__0");
					put(grammarAccess.getRobotCollaborationAccess().getGroup(), "rule__RobotCollaboration__Group__0");
					put(grammarAccess.getRobotCollaborationAccess().getGroup_2(), "rule__RobotCollaboration__Group_2__0");
					put(grammarAccess.getRobotCollaborationAccess().getGroup_2_3(), "rule__RobotCollaboration__Group_2_3__0");
					put(grammarAccess.getAction_ImplAccess().getGroup(), "rule__Action_Impl__Group__0");
					put(grammarAccess.getAction_ImplAccess().getGroup_2(), "rule__Action_Impl__Group_2__0");
					put(grammarAccess.getAction_ImplAccess().getGroup_3(), "rule__Action_Impl__Group_3__0");
					put(grammarAccess.getAction_ImplAccess().getGroup_3_3(), "rule__Action_Impl__Group_3_3__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getMeasureValueAccess().getGroup(), "rule__MeasureValue__Group__0");
					put(grammarAccess.getMeasureValueAccess().getGroup_2(), "rule__MeasureValue__Group_2__0");
					put(grammarAccess.getCapabilityPropertiesAccess().getGroup(), "rule__CapabilityProperties__Group__0");
					put(grammarAccess.getCapabilityPropertiesAccess().getGroup_4(), "rule__CapabilityProperties__Group_4__0");
					put(grammarAccess.getCapabilityPropertiesAccess().getGroup_4_3(), "rule__CapabilityProperties__Group_4_3__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
					put(grammarAccess.getPropertyKeyAccess().getGroup(), "rule__PropertyKey__Group__0");
					put(grammarAccess.getStringValueAccess().getGroup(), "rule__StringValue__Group__0");
					put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
					put(grammarAccess.getMessageAccess().getGroup_1(), "rule__Message__Group_1__0");
					put(grammarAccess.getMessageAccess().getGroup_1_1(), "rule__Message__Group_1_1__0");
					put(grammarAccess.getMessageAccess().getGroup_1_1_3(), "rule__Message__Group_1_1_3__0");
					put(grammarAccess.getMessageAccess().getGroup_1_2(), "rule__Message__Group_1_2__0");
					put(grammarAccess.getMessageAccess().getGroup_1_2_3(), "rule__Message__Group_1_2_3__0");
					put(grammarAccess.getMessageAccess().getGroup_1_3(), "rule__Message__Group_1_3__0");
					put(grammarAccess.getMessageAccess().getGroup_1_4(), "rule__Message__Group_1_4__0");
					put(grammarAccess.getMessageAccess().getGroup_1_4_3(), "rule__Message__Group_1_4_3__0");
					put(grammarAccess.getMessageAccess().getGroup_1_5(), "rule__Message__Group_1_5__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getBehaviourLanguageAccess().getImportModelAssignment_0(), "rule__BehaviourLanguage__ImportModelAssignment_0");
					put(grammarAccess.getBehaviourLanguageAccess().getContainerAssignment_1(), "rule__BehaviourLanguage__ContainerAssignment_1");
					put(grammarAccess.getBehaviourLanguageAccess().getStatementsAssignment_2(), "rule__BehaviourLanguage__StatementsAssignment_2");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsAssignment_3_2(), "rule__BehaviourContainer__DynamicRobotsAssignment_3_2");
					put(grammarAccess.getBehaviourContainerAccess().getDynamicRobotsAssignment_3_3_1(), "rule__BehaviourContainer__DynamicRobotsAssignment_3_3_1");
					put(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsAssignment_4_2(), "rule__BehaviourContainer__TaskExecutionsAssignment_4_2");
					put(grammarAccess.getBehaviourContainerAccess().getTaskExecutionsAssignment_4_3_1(), "rule__BehaviourContainer__TaskExecutionsAssignment_4_3_1");
					put(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsAssignment_5_2(), "rule__BehaviourContainer__TaskRequirementsAssignment_5_2");
					put(grammarAccess.getBehaviourContainerAccess().getTaskRequirementsAssignment_5_3_1(), "rule__BehaviourContainer__TaskRequirementsAssignment_5_3_1");
					put(grammarAccess.getBehaviourContainerAccess().getBehaviourKeysContainerAssignment_6_1(), "rule__BehaviourContainer__BehaviourKeysContainerAssignment_6_1");
					put(grammarAccess.getDynamicRobotAccess().getNameAssignment_0(), "rule__DynamicRobot__NameAssignment_0");
					put(grammarAccess.getDynamicRobotAccess().getRobotAssignment_2(), "rule__DynamicRobot__RobotAssignment_2");
					put(grammarAccess.getConditionalStatementAccess().getConditionAssignment_1(), "rule__ConditionalStatement__ConditionAssignment_1");
					put(grammarAccess.getConditionalStatementAccess().getStatementsAssignment_4(), "rule__ConditionalStatement__StatementsAssignment_4");
					put(grammarAccess.getConditionalStatementAccess().getOtherStatementsAssignment_6_2(), "rule__ConditionalStatement__OtherStatementsAssignment_6_2");
					put(grammarAccess.getActionStatementAccess().getRobotAssignment_0(), "rule__ActionStatement__RobotAssignment_0");
					put(grammarAccess.getActionStatementAccess().getActionAssignment_2(), "rule__ActionStatement__ActionAssignment_2");
					put(grammarAccess.getActionStatementAccess().getMoreactionsAssignment_3_1(), "rule__ActionStatement__MoreactionsAssignment_3_1");
					put(grammarAccess.getMessageStatementAccess().getRobotAssignment_0(), "rule__MessageStatement__RobotAssignment_0");
					put(grammarAccess.getMessageStatementAccess().getTargetAssignment_2(), "rule__MessageStatement__TargetAssignment_2");
					put(grammarAccess.getMessageStatementAccess().getMessageAssignment_3(), "rule__MessageStatement__MessageAssignment_3");
					put(grammarAccess.getCollaborationStatementAccess().getRobotAssignment_0(), "rule__CollaborationStatement__RobotAssignment_0");
					put(grammarAccess.getCollaborationStatementAccess().getCollaborationAssignment_2(), "rule__CollaborationStatement__CollaborationAssignment_2");
					put(grammarAccess.getCollaborationStatementAccess().getCollaborationAssignment_3_1(), "rule__CollaborationStatement__CollaborationAssignment_3_1");
					put(grammarAccess.getDetectionStatementAccess().getRobotAssignment_0(), "rule__DetectionStatement__RobotAssignment_0");
					put(grammarAccess.getDetectionStatementAccess().getObjectAssignment_2(), "rule__DetectionStatement__ObjectAssignment_2");
					put(grammarAccess.getDetectionStatementAccess().getObstacleAssignment_3(), "rule__DetectionStatement__ObstacleAssignment_3");
					put(grammarAccess.getExecutionStatementAccess().getRobotAssignment_0(), "rule__ExecutionStatement__RobotAssignment_0");
					put(grammarAccess.getExecutionStatementAccess().getExecutionAssignment_2(), "rule__ExecutionStatement__ExecutionAssignment_2");
					put(grammarAccess.getUniTargetAccess().getTargetAssignment(), "rule__UniTarget__TargetAssignment");
					put(grammarAccess.getMultiTargetAccess().getTargetAssignment_1(), "rule__MultiTarget__TargetAssignment_1");
					put(grammarAccess.getMultiTargetAccess().getTargetAssignment_2_1(), "rule__MultiTarget__TargetAssignment_2_1");
					put(grammarAccess.getAllTargetAccess().getTargetAssignment(), "rule__AllTarget__TargetAssignment");
					put(grammarAccess.getTaskStatusConditionAccess().getTaskAssignment_0(), "rule__TaskStatusCondition__TaskAssignment_0");
					put(grammarAccess.getTaskStatusConditionAccess().getEqualAssignment_1_0(), "rule__TaskStatusCondition__EqualAssignment_1_0");
					put(grammarAccess.getTaskStatusConditionAccess().getNotEqualAssignment_1_1(), "rule__TaskStatusCondition__NotEqualAssignment_1_1");
					put(grammarAccess.getTaskStatusConditionAccess().getTaskStatusAssignment_2(), "rule__TaskStatusCondition__TaskStatusAssignment_2");
					put(grammarAccess.getRobotStatusConditionAccess().getRobotAssignment_0(), "rule__RobotStatusCondition__RobotAssignment_0");
					put(grammarAccess.getRobotStatusConditionAccess().getEqualAssignment_1_0(), "rule__RobotStatusCondition__EqualAssignment_1_0");
					put(grammarAccess.getRobotStatusConditionAccess().getNotEqualAssignment_1_1(), "rule__RobotStatusCondition__NotEqualAssignment_1_1");
					put(grammarAccess.getRobotStatusConditionAccess().getRobotStatusAssignment_2(), "rule__RobotStatusCondition__RobotStatusAssignment_2");
					put(grammarAccess.getTaskExecutionAccess().getNameAssignment_0(), "rule__TaskExecution__NameAssignment_0");
					put(grammarAccess.getTaskExecutionAccess().getTaskAssignment_2(), "rule__TaskExecution__TaskAssignment_2");
					put(grammarAccess.getTaskExecutionAccess().getStatusAssignment_4_1(), "rule__TaskExecution__StatusAssignment_4_1");
					put(grammarAccess.getTaskExecutionAccess().getExecutorsAssignment_5_2(), "rule__TaskExecution__ExecutorsAssignment_5_2");
					put(grammarAccess.getTaskExecutionAccess().getExecutorsAssignment_5_3_1(), "rule__TaskExecution__ExecutorsAssignment_5_3_1");
					put(grammarAccess.getTaskExecutionAccess().getExecutionTimeAssignment_6_1(), "rule__TaskExecution__ExecutionTimeAssignment_6_1");
					put(grammarAccess.getTaskRequirementAccess().getNameAssignment_1(), "rule__TaskRequirement__NameAssignment_1");
					put(grammarAccess.getTaskRequirementAccess().getParticipantsAssignment_4(), "rule__TaskRequirement__ParticipantsAssignment_4");
					put(grammarAccess.getTaskRequirementAccess().getTaskExecutionAssignment_6(), "rule__TaskRequirement__TaskExecutionAssignment_6");
					put(grammarAccess.getTaskRequirementAccess().getPrerequisiteAssignment_7_1(), "rule__TaskRequirement__PrerequisiteAssignment_7_1");
					put(grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesAssignment_8_2(), "rule__TaskRequirement__RequiredCapabilitiesAssignment_8_2");
					put(grammarAccess.getTaskRequirementAccess().getRequiredCapabilitiesAssignment_8_3_1(), "rule__TaskRequirement__RequiredCapabilitiesAssignment_8_3_1");
					put(grammarAccess.getTaskRequirementAccess().getPropertiesAssignment_9_2(), "rule__TaskRequirement__PropertiesAssignment_9_2");
					put(grammarAccess.getTaskRequirementAccess().getPropertiesAssignment_9_3_1(), "rule__TaskRequirement__PropertiesAssignment_9_3_1");
					put(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesAssignment_10_2(), "rule__TaskRequirement__CapabilityPropertiesAssignment_10_2");
					put(grammarAccess.getTaskRequirementAccess().getCapabilityPropertiesAssignment_10_3_1(), "rule__TaskRequirement__CapabilityPropertiesAssignment_10_3_1");
					put(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getNameAssignment_2(), "rule__BehaviouralPropertyKeyContainer__NameAssignment_2");
					put(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysAssignment_4_2(), "rule__BehaviouralPropertyKeyContainer__KeysAssignment_4_2");
					put(grammarAccess.getBehaviouralPropertyKeyContainerAccess().getKeysAssignment_4_3_1(), "rule__BehaviouralPropertyKeyContainer__KeysAssignment_4_3_1");
					put(grammarAccess.getRobotCollaborationAccess().getCollaboratorAssignment_1(), "rule__RobotCollaboration__CollaboratorAssignment_1");
					put(grammarAccess.getRobotCollaborationAccess().getPropertiesAssignment_2_2(), "rule__RobotCollaboration__PropertiesAssignment_2_2");
					put(grammarAccess.getRobotCollaborationAccess().getPropertiesAssignment_2_3_1(), "rule__RobotCollaboration__PropertiesAssignment_2_3_1");
					put(grammarAccess.getAction_ImplAccess().getNameAssignment_1(), "rule__Action_Impl__NameAssignment_1");
					put(grammarAccess.getAction_ImplAccess().getCurrentTaskExecutionAssignment_2_1(), "rule__Action_Impl__CurrentTaskExecutionAssignment_2_1");
					put(grammarAccess.getAction_ImplAccess().getPropertiesAssignment_3_2(), "rule__Action_Impl__PropertiesAssignment_3_2");
					put(grammarAccess.getAction_ImplAccess().getPropertiesAssignment_3_3_1(), "rule__Action_Impl__PropertiesAssignment_3_3_1");
					put(grammarAccess.getPropertyAccess().getKeyAssignment_3(), "rule__Property__KeyAssignment_3");
					put(grammarAccess.getPropertyAccess().getValueAssignment_5(), "rule__Property__ValueAssignment_5");
					put(grammarAccess.getMeasureValueAccess().getValueAssignment_2_1(), "rule__MeasureValue__ValueAssignment_2_1");
					put(grammarAccess.getMeasureValueAccess().getDimensionAssignment_4(), "rule__MeasureValue__DimensionAssignment_4");
					put(grammarAccess.getCapabilityPropertiesAccess().getCapabilityAssignment_3(), "rule__CapabilityProperties__CapabilityAssignment_3");
					put(grammarAccess.getCapabilityPropertiesAccess().getPropertiesAssignment_4_2(), "rule__CapabilityProperties__PropertiesAssignment_4_2");
					put(grammarAccess.getCapabilityPropertiesAccess().getPropertiesAssignment_4_3_1(), "rule__CapabilityProperties__PropertiesAssignment_4_3_1");
					put(grammarAccess.getPropertyKeyAccess().getNameAssignment_2(), "rule__PropertyKey__NameAssignment_2");
					put(grammarAccess.getStringValueAccess().getValueAssignment_3(), "rule__StringValue__ValueAssignment_3");
					put(grammarAccess.getMessageAccess().getNameAssignment_0(), "rule__Message__NameAssignment_0");
					put(grammarAccess.getMessageAccess().getInvolvedTaskExecutionsAssignment_1_1_2(), "rule__Message__InvolvedTaskExecutionsAssignment_1_1_2");
					put(grammarAccess.getMessageAccess().getInvolvedTaskExecutionsAssignment_1_1_3_1(), "rule__Message__InvolvedTaskExecutionsAssignment_1_1_3_1");
					put(grammarAccess.getMessageAccess().getReferredObjectsAssignment_1_2_2(), "rule__Message__ReferredObjectsAssignment_1_2_2");
					put(grammarAccess.getMessageAccess().getReferredObjectsAssignment_1_2_3_1(), "rule__Message__ReferredObjectsAssignment_1_2_3_1");
					put(grammarAccess.getMessageAccess().getFollowsAssignment_1_3_1(), "rule__Message__FollowsAssignment_1_3_1");
					put(grammarAccess.getMessageAccess().getPropertiesAssignment_1_4_2(), "rule__Message__PropertiesAssignment_1_4_2");
					put(grammarAccess.getMessageAccess().getPropertiesAssignment_1_4_3_1(), "rule__Message__PropertiesAssignment_1_4_3_1");
					put(grammarAccess.getMessageAccess().getTTLAssignment_1_5_1(), "rule__Message__TTLAssignment_1_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalBehaviourLanguageParser typedParser = (InternalBehaviourLanguageParser) parser;
			typedParser.entryRuleBehaviourLanguage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BehaviourLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BehaviourLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
