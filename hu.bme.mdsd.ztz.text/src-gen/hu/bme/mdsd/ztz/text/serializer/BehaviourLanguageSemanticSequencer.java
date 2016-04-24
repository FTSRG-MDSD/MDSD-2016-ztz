/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.serializer;

import com.google.inject.Inject;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourPackage;
import hu.bme.mdsd.ztz.model.behaviour.BehaviouralPropertyKeyContainer;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.MulticastCommunication;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;
import hu.bme.mdsd.ztz.model.behaviour.TaskRequirement;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Battery;
import hu.bme.mdsd.ztz.model.drone.Capability;
import hu.bme.mdsd.ztz.model.drone.CapabilityProperties;
import hu.bme.mdsd.ztz.model.drone.Coordinate;
import hu.bme.mdsd.ztz.model.drone.DronePackage;
import hu.bme.mdsd.ztz.model.drone.Equipment;
import hu.bme.mdsd.ztz.model.drone.MeasureConversion;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;
import hu.bme.mdsd.ztz.model.drone.MeasureValue;
import hu.bme.mdsd.ztz.model.drone.Position;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.Size;
import hu.bme.mdsd.ztz.model.drone.StringValue;
import hu.bme.mdsd.ztz.model.drone.Task;
import hu.bme.mdsd.ztz.model.drone.TaskDescriptor;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Import;
import hu.bme.mdsd.ztz.text.services.BehaviourLanguageGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BehaviourLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BehaviourLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BehaviourPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehaviourPackage.ACTION:
				sequence_Action_Impl(context, (hu.bme.mdsd.ztz.model.behaviour.Action) semanticObject); 
				return; 
			case BehaviourPackage.BEHAVIOUR_CONTAINER:
				sequence_BehaviourContainer(context, (BehaviourContainer) semanticObject); 
				return; 
			case BehaviourPackage.BEHAVIOURAL_PROPERTY_KEY_CONTAINER:
				sequence_BehaviouralPropertyKeyContainer(context, (BehaviouralPropertyKeyContainer) semanticObject); 
				return; 
			case BehaviourPackage.BROADCAST_COMMUNICATION:
				sequence_BroadcastCommunication(context, (BroadcastCommunication) semanticObject); 
				return; 
			case BehaviourPackage.DETECTED_OBJECT:
				sequence_DetectedObject(context, (DetectedObject) semanticObject); 
				return; 
			case BehaviourPackage.DYNAMIC_ROBOT:
				sequence_DynamicRobot(context, (DynamicRobot) semanticObject); 
				return; 
			case BehaviourPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case BehaviourPackage.MESSAGE_REPOSITORY:
				sequence_MessageRepository(context, (MessageRepository) semanticObject); 
				return; 
			case BehaviourPackage.MULTICAST_COMMUNICATION:
				sequence_MulticastCommunication(context, (MulticastCommunication) semanticObject); 
				return; 
			case BehaviourPackage.ROBOT_COLLABORATION:
				sequence_RobotCollaboration(context, (RobotCollaboration) semanticObject); 
				return; 
			case BehaviourPackage.TASK_EXECUTION:
				sequence_TaskExecution(context, (TaskExecution) semanticObject); 
				return; 
			case BehaviourPackage.TASK_REQUIREMENT:
				sequence_TaskRequirement(context, (TaskRequirement) semanticObject); 
				return; 
			case BehaviourPackage.UNICAST_COMMUNICATION:
				sequence_UnicastCommunication(context, (UnicastCommunication) semanticObject); 
				return; 
			}
		else if (epackage == BehaviourLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BehaviourLanguagePackage.BEHAVIOUR_LANGUAGE:
				sequence_BehaviourLanguage(context, (BehaviourLanguage) semanticObject); 
				return; 
			case BehaviourLanguagePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			}
		else if (epackage == DronePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DronePackage.AREA_OBJECT:
				sequence_AreaObject(context, (AreaObject) semanticObject); 
				return; 
			case DronePackage.BATTERY:
				sequence_Battery(context, (Battery) semanticObject); 
				return; 
			case DronePackage.CAPABILITY:
				sequence_Capability(context, (Capability) semanticObject); 
				return; 
			case DronePackage.CAPABILITY_PROPERTIES:
				sequence_CapabilityProperties(context, (CapabilityProperties) semanticObject); 
				return; 
			case DronePackage.COORDINATE:
				sequence_Coordinate(context, (Coordinate) semanticObject); 
				return; 
			case DronePackage.EQUIPMENT:
				sequence_Equipment(context, (Equipment) semanticObject); 
				return; 
			case DronePackage.MEASURE_CONVERSION:
				sequence_MeasureConversion(context, (MeasureConversion) semanticObject); 
				return; 
			case DronePackage.MEASURE_DIMENSION:
				sequence_MeasureDimension(context, (MeasureDimension) semanticObject); 
				return; 
			case DronePackage.MEASURE_VALUE:
				sequence_MeasureValue(context, (MeasureValue) semanticObject); 
				return; 
			case DronePackage.POSITION:
				sequence_Position(context, (Position) semanticObject); 
				return; 
			case DronePackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case DronePackage.PROPERTY_KEY:
				sequence_PropertyKey(context, (PropertyKey) semanticObject); 
				return; 
			case DronePackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case DronePackage.SIZE:
				sequence_Size(context, (Size) semanticObject); 
				return; 
			case DronePackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case DronePackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			case DronePackage.TASK_DESCRIPTOR:
				sequence_TaskDescriptor(context, (TaskDescriptor) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *     Action_Impl returns Action
	 *
	 * Constraint:
	 *     (name=EString currentTaskExecution=[TaskExecution|EString]? (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_Action_Impl(ISerializationContext context, hu.bme.mdsd.ztz.model.behaviour.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AreaObject returns AreaObject
	 *
	 * Constraint:
	 *     (name=EString (positions+=Position positions+=Position*)? size=Size? (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_AreaObject(ISerializationContext context, AreaObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Battery returns Battery
	 *
	 * Constraint:
	 *     (capacity=MeasureValue voltage=MeasureValue rechargeTime=MeasureValue (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_Battery(ISerializationContext context, Battery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourContainer returns BehaviourContainer
	 *
	 * Constraint:
	 *     (
	 *         (dynamicRobots+=DynamicRobot dynamicRobots+=DynamicRobot*)? 
	 *         (taskExecutions+=TaskExecution taskExecutions+=TaskExecution*)? 
	 *         (taskRequirements+=TaskRequirement taskRequirements+=TaskRequirement*)? 
	 *         behaviourKeysContainer=BehaviouralPropertyKeyContainer?
	 *     )
	 */
	protected void sequence_BehaviourContainer(ISerializationContext context, BehaviourContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BehaviourLanguage returns BehaviourLanguage
	 *
	 * Constraint:
	 *     (importModel=Import container=BehaviourContainer)
	 */
	protected void sequence_BehaviourLanguage(ISerializationContext context, BehaviourLanguage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.BEHAVIOUR_LANGUAGE__IMPORT_MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.BEHAVIOUR_LANGUAGE__IMPORT_MODEL));
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.BEHAVIOUR_LANGUAGE__CONTAINER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.BEHAVIOUR_LANGUAGE__CONTAINER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBehaviourLanguageAccess().getImportModelImportParserRuleCall_0_0(), semanticObject.getImportModel());
		feeder.accept(grammarAccess.getBehaviourLanguageAccess().getContainerBehaviourContainerParserRuleCall_1_0(), semanticObject.getContainer());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BehaviouralPropertyKeyContainer returns BehaviouralPropertyKeyContainer
	 *
	 * Constraint:
	 *     (name=EString (keys+=PropertyKey keys+=PropertyKey*)?)
	 */
	protected void sequence_BehaviouralPropertyKeyContainer(ISerializationContext context, BehaviouralPropertyKeyContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns BroadcastCommunication
	 *     BroadcastCommunication returns BroadcastCommunication
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         currentTaskExecution=[TaskExecution|EString]? 
	 *         message=[Message|EString] 
	 *         targets+=[DynamicRobot|EString] 
	 *         targets+=[DynamicRobot|EString]* 
	 *         (properties+=Property properties+=Property*)?
	 *     )
	 */
	protected void sequence_BroadcastCommunication(ISerializationContext context, BroadcastCommunication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CapabilityProperties returns CapabilityProperties
	 *
	 * Constraint:
	 *     (capability=[Capability|EString] (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_CapabilityProperties(ISerializationContext context, CapabilityProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Capability returns Capability
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Capability(ISerializationContext context, Capability semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCapabilityAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Coordinate returns Coordinate
	 *
	 * Constraint:
	 *     (latitude=EFloat longitude=EFloat altitude=EFloat)
	 */
	protected void sequence_Coordinate(ISerializationContext context, Coordinate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.COORDINATE__LATITUDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.COORDINATE__LATITUDE));
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.COORDINATE__LONGITUDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.COORDINATE__LONGITUDE));
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.COORDINATE__ALTITUDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.COORDINATE__ALTITUDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCoordinateAccess().getLatitudeEFloatParserRuleCall_3_0(), semanticObject.getLatitude());
		feeder.accept(grammarAccess.getCoordinateAccess().getLongitudeEFloatParserRuleCall_5_0(), semanticObject.getLongitude());
		feeder.accept(grammarAccess.getCoordinateAccess().getAltitudeEFloatParserRuleCall_7_0(), semanticObject.getAltitude());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DetectedObject returns DetectedObject
	 *
	 * Constraint:
	 *     (obstacle?='obstacle'? object=[AreaObject|EString])
	 */
	protected void sequence_DetectedObject(ISerializationContext context, DetectedObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DynamicRobot returns DynamicRobot
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         status=RobotStatus 
	 *         robot=[Robot|EString] 
	 *         (executedTasks+=[TaskExecution|EString] executedTasks+=[TaskExecution|EString]*)? 
	 *         (detectedObjects+=DetectedObject detectedObjects+=DetectedObject*)? 
	 *         collaborations=RobotCollaboration? 
	 *         messageRepository=MessageRepository? 
	 *         (actions+=Action actions+=Action*)?
	 *     )
	 */
	protected void sequence_DynamicRobot(ISerializationContext context, DynamicRobot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Equipment returns Equipment
	 *
	 * Constraint:
	 *     (name=EString (facilitate+=[Capability|EString] facilitate+=[Capability|EString]*)? (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_Equipment(ISerializationContext context, Equipment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviourLanguagePackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MeasureConversion returns MeasureConversion
	 *
	 * Constraint:
	 *     (rate=EFloat? dimension=[MeasureDimension|EString])
	 */
	protected void sequence_MeasureConversion(ISerializationContext context, MeasureConversion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MeasureDimension returns MeasureDimension
	 *
	 * Constraint:
	 *     (name=EString (conversions+=MeasureConversion conversions+=MeasureConversion*)?)
	 */
	protected void sequence_MeasureDimension(ISerializationContext context, MeasureDimension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns MeasureValue
	 *     MeasureValue returns MeasureValue
	 *
	 * Constraint:
	 *     (value=EFloat? dimension=[MeasureDimension|EString])
	 */
	protected void sequence_MeasureValue(ISerializationContext context, MeasureValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageRepository returns MessageRepository
	 *
	 * Constraint:
	 *     (name=EString (sendedMessages+=Message sendedMessages+=Message*)?)
	 */
	protected void sequence_MessageRepository(ISerializationContext context, MessageRepository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (
	 *         needResponse?='needResponse' 
	 *         name=EString 
	 *         timestamp=EDate? 
	 *         (involvedTaskExecutions+=[TaskExecution|EString] involvedTaskExecutions+=[TaskExecution|EString]*)? 
	 *         (referredObjects+=[AreaObject|EString] referredObjects+=[AreaObject|EString]*)? 
	 *         follows=[Message|EString]? 
	 *         (properties+=Property properties+=Property*)? 
	 *         TTL=MeasureValue?
	 *     )
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns MulticastCommunication
	 *     MulticastCommunication returns MulticastCommunication
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         currentTaskExecution=[TaskExecution|EString]? 
	 *         message=[Message|EString] 
	 *         targets+=[DynamicRobot|EString] 
	 *         targets+=[DynamicRobot|EString]* 
	 *         (properties+=Property properties+=Property*)?
	 *     )
	 */
	protected void sequence_MulticastCommunication(ISerializationContext context, MulticastCommunication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Position returns Position
	 *
	 * Constraint:
	 *     ((coordinates+=Coordinate coordinates+=Coordinate*)? (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_Position(ISerializationContext context, Position semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyKey returns PropertyKey
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_PropertyKey(ISerializationContext context, PropertyKey semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyKeyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (key=[PropertyKey|EString] value=PropertyValue)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.PROPERTY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.PROPERTY__KEY));
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getKeyPropertyKeyEStringParserRuleCall_3_0_1(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RobotCollaboration returns RobotCollaboration
	 *
	 * Constraint:
	 *     (collaborator=[DynamicRobot|EString] (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_RobotCollaboration(ISerializationContext context, RobotCollaboration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (tasks+=[Task|EString] tasks+=[Task|EString]*)? 
	 *         (capabilities+=[Capability|EString] capabilities+=[Capability|EString]*)? 
	 *         position=Position 
	 *         size=Size 
	 *         (batteries+=Battery batteries+=Battery*)? 
	 *         (equipments+=Equipment equipments+=Equipment*)? 
	 *         (properties+=Property properties+=Property*)? 
	 *         communicationRange=MeasureValue? 
	 *         weight=MeasureValue? 
	 *         (capabilityProperties+=CapabilityProperties capabilityProperties+=CapabilityProperties*)?
	 *     )
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Size returns Size
	 *
	 * Constraint:
	 *     (width=MeasureValue height=MeasureValue length=MeasureValue)
	 */
	protected void sequence_Size(ISerializationContext context, Size semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.SIZE__WIDTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.SIZE__WIDTH));
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.SIZE__HEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.SIZE__HEIGHT));
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.SIZE__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.SIZE__LENGTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeAccess().getWidthMeasureValueParserRuleCall_3_0(), semanticObject.getWidth());
		feeder.accept(grammarAccess.getSizeAccess().getHeightMeasureValueParserRuleCall_5_0(), semanticObject.getHeight());
		feeder.accept(grammarAccess.getSizeAccess().getLengthMeasureValueParserRuleCall_7_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TaskDescriptor returns TaskDescriptor
	 *
	 * Constraint:
	 *     ((targets+=[AreaObject|EString] targets+=[AreaObject|EString]*)? (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_TaskDescriptor(ISerializationContext context, TaskDescriptor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskExecution returns TaskExecution
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         status=TaskExecutionStatus 
	 *         (executors+=[DynamicRobot|EString] executors+=[DynamicRobot|EString]*)? 
	 *         task=[Task|EString] 
	 *         requirement=[TaskRequirement|EString]? 
	 *         executionTime=MeasureValue?
	 *     )
	 */
	protected void sequence_TaskExecution(ISerializationContext context, TaskExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskRequirement returns TaskRequirement
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         participants=EInt 
	 *         taskExecution=[TaskExecution|EString] 
	 *         prerequisite=[TaskExecution|EString]? 
	 *         (requiredCapabilities+=[Capability|EString] requiredCapabilities+=[Capability|EString]*)? 
	 *         (properties+=Property properties+=Property*)? 
	 *         (capabilityProperties+=CapabilityProperties capabilityProperties+=CapabilityProperties*)?
	 *     )
	 */
	protected void sequence_TaskRequirement(ISerializationContext context, TaskRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (name=EString descriptor=TaskDescriptor)
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DronePackage.Literals.TASK__DESCRIPTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DronePackage.Literals.TASK__DESCRIPTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTaskAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTaskAccess().getDescriptorTaskDescriptorParserRuleCall_4_0(), semanticObject.getDescriptor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns UnicastCommunication
	 *     UnicastCommunication returns UnicastCommunication
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         currentTaskExecution=[TaskExecution|EString]? 
	 *         message=[Message|EString] 
	 *         target=[DynamicRobot|EString] 
	 *         (properties+=Property properties+=Property*)?
	 *     )
	 */
	protected void sequence_UnicastCommunication(ISerializationContext context, UnicastCommunication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
