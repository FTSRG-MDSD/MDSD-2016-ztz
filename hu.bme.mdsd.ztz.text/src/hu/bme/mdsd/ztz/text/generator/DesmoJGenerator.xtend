package hu.bme.mdsd.ztz.text.generator

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.drone.AreaObject
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguageFactory
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget
import hu.bme.mdsd.ztz.text.behaviourLanguage.impl.BehaviourLanguageFactoryImpl
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess2

class DesmoJGenerator {
	private BehaviourLanguage bl
	private BehaviourLanguageFactory blf
	private IFileSystemAccess2 fsa

	new(BehaviourLanguage bl, IFileSystemAccess2 fsa) {
		this.bl = bl
		this.fsa = fsa
		blf = new BehaviourLanguageFactoryImpl
		robots = new HashSet
		statements = new HashMap
	}

	private Set<DynamicRobot> robots
	private Map<DynamicRobot, List<AtomicStatement>> statements

	def generateRobotEntity(DynamicRobot robot) '''
	
			DynamicRobotEntity «robot.name.toFirstLower»Entity =
				new DynamicRobotEntity(this, "«robot.name»", false);
			registeredEntities.put(«robot.name.toFirstLower»Entity.getSimpleName(), «robot.name.toFirstLower»Entity);
	'''

	def generateAreaObjectEntity(AreaObject areaObject) '''
		
				ResettableAreaObjectEntity «areaObject.name.toFirstLower»Entity = new ResettableAreaObjectEntity(this, "«areaObject.name»", false);
				
				registeredObjects.put(«areaObject.name.toFirstLower»Entity.getSimpleName(), «areaObject.name.toFirstLower»Entity);
				availableObjects.add(«areaObject.name.toFirstLower»Entity);
	'''

	def generateAll() '''
		«generateHeader»
		«IF !robots.empty»
		«FOR robot : robots»
			«generateRobotEntity(robot)»
		«ENDFOR»
		
		«FOR areaObject : (robots.get(0).robot.eContainer as RobotMissionContainer).areaObjects»
			«generateAreaObjectEntity(areaObject)»
		«ENDFOR»
		«FOR robot : robots»
			«generateStatements(robot)»
		«ENDFOR»
		«ENDIF»
		«generateFooter»
	'''
	
	def generateStatements(DynamicRobot robot)'''
	
			«robot.name.toFirstLower»Entity.initializeEvents(
	«FOR statement : statements.get(robot) SEPARATOR ","»
	
					new StatementEntity(this, new «statement.eventType»Event(this, "«statement.eventType»", true)«generateProperties(robot, statement)»)«ENDFOR»
			);
	'''
	
	def dispatch generateProperties(DynamicRobot robot, DetectionStatement statement)'''
	, "«statement.object.name»", false'''
	
	def dispatch generateProperties(DynamicRobot robot, ActionStatement statement)'''
	«IF !statement.action.targets.empty», "«statement.action.targets.get(0).name»", false«ENDIF»'''
	
	def dispatch generateProperties(DynamicRobot robot, MessageStatement statement)'''
	«IF statement.target instanceof UniTarget»
	, "«IF (statement.target as UniTarget).target.equals(robot)»«statement.robot.name»«ELSE»«(statement.target as UniTarget).target.name»«ENDIF»", true«ENDIF»'''
	
	def dispatch getEventType(ActionStatement statement)
	'''«statement.action.declaration.name»'''
	
	def dispatch getEventType(MessageStatement statement)
	'''Message'''
	
	def dispatch getEventType(DetectionStatement statement)
	'''Detect'''

	def generateFooter() '''
			}
		}
	'''

	def generateHeader() '''
		package hu.bme.mdsd.ztz.model.simulation.objectdelivery.model;

		import desmoj.core.simulator.Model;
		
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.StatementEntity;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.BringEvent;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.DetectEvent;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveEvent;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.ResetObjectEvent;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveToTargetEvent;
		import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MessageEvent;
		
		public class DesmoSimulation extends ObjectDeliverySimulationModel {
			
			public DesmoSimulation(Model owner, String name, boolean showInReport, boolean showInTrace) {
					super(owner, name, showInReport, showInTrace);
			}
			
			@Override
			public void init() {
				super.init();
	'''

	def generateJavaFiles() {
		gatherData(bl.statements)
		fsa.generateFile("DesmoSimulation.java", generateAll)
	}

	def void gatherData(List<Statement> statementList) {
		for (statement : statementList) {
			process(statement)
		}
	}
	
	def dispatch process(ActionStatement st) {
		robots.add(st.robot)
		addStatement(st.robot, st)
	}
	
	def dispatch process(MessageStatement st) {
		robots.add(st.robot)
		if (st.target instanceof UniTarget) {
			val targetRobot = (st.target as UniTarget).target
			robots.add(targetRobot)
			
			addStatement(st.robot, st)
			addStatement(targetRobot, st)
		} else if (st.target instanceof MultiTarget) {
			val targetRobots = (st.target as MultiTarget).target
			partMultiTarget(st, targetRobots)
		} else if (st.target instanceof AllTarget) {
			val targetRobots = st.robot.collaborations.map[c | c.collaborator]
			partMultiTarget(st, targetRobots)
		}
	}
	
	def dispatch process(DetectionStatement st) {
		robots.add(st.robot)
		addStatement(st.robot, st)
	}
	
	def dispatch process(ConditionalStatement st) {
		gatherData(st.statements)
		gatherData(st.otherStatements)
	}
	
	def dispatch process(SynchronousStatement st) {
		gatherData(st.statements.filter(Statement).toList)
	}
	
	def dispatch process(Statement st) {}
	
	def partMultiTarget(MessageStatement st, List<DynamicRobot> targetRobots) {
		for (targetRobot : targetRobots) {
			robots.add(targetRobot)
			
			val uniTarget = blf.createUniTarget
			uniTarget.target = targetRobot
			
			val stCopy = blf.createMessageStatement
			stCopy.message = st.message
			stCopy.robot = st.robot
			stCopy.target = uniTarget
			
			addStatement(stCopy.robot, stCopy)
			addStatement(targetRobot, stCopy)
		}
	}

	def addStatement(DynamicRobot robot, AtomicStatement statement) {
		if (!statements.containsKey(robot)) {
			statements.put(robot, new ArrayList)
		}
		statements.get(robot).add(statement)
	}

}
