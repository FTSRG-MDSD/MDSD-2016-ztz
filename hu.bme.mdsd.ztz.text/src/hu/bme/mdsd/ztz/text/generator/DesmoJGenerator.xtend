package hu.bme.mdsd.ztz.text.generator

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot
import hu.bme.mdsd.ztz.model.drone.AreaObject
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess2

class DesmoJGenerator {
	private BehaviourLanguage bl
	private IFileSystemAccess2 fsa

	new(BehaviourLanguage bl, IFileSystemAccess2 fsa) {
		this.bl = bl
		this.fsa = fsa
		robots = new HashSet
		statements = new HashMap
	}

	private Set<DynamicRobot> robots
	private Map<DynamicRobot, List<Statement>> statements

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

	def generateStatement(ActionStatement statement) '''
		new StatementEntity(this, new SearchEvent(this, "Hoo", true)),
		new StatementEntity(this, new DetectEvent(this, "Detect", true), "Box", false),
		new StatementEntity(this, new MoveEvent(this, "Move", true), "Box", false),
		new StatementEntity(this, new BringEvent(this, "Bring", true), "Box", false)
		);
	'''

	def generateAll() '''
		«generateHeader»
		«FOR robot : robots»
			«generateRobotEntity(robot)»
		«ENDFOR»
		«FOR areaObject : (robots.get(0).robot.eContainer as RobotMissionContainer).areaObjects»
			«generateAreaObjectEntity(areaObject)»
		«ENDFOR»
		«FOR robot : robots»
			«generateStatements(robot)»
		«ENDFOR»
		«generateFooter»
	'''
	
	def generateStatements(DynamicRobot robot)'''
	
			«robot.name.toFirstLower»Entity.initializeEvents(
	«FOR statement : statements.get(robot) SEPARATOR ","»
	
					new StatementEntity(this, new «statement.eventType»Event(this, "«statement.eventType»", true)«generateProperties(statement)»)«ENDFOR»
			);
	'''
	
	def generateProperties(Statement statement)'''
	«IF statement instanceof ActionStatement && !(statement as ActionStatement).action.targets.empty»
	, "«(statement as ActionStatement).action.targets.get(0).name»", false«ENDIF»«IF
	statement instanceof MessageStatement && (statement as MessageStatement).target instanceof UniTarget
	», "«((statement as MessageStatement).target as UniTarget).target.name»", true«ENDIF»«IF
	statement instanceof DetectionStatement», "«(statement as DetectionStatement).object.name»", false«ENDIF»'''
	
	def getEventType(Statement statement)
	'''«IF
	statement instanceof ActionStatement»«statement.action.declaration.name»«ENDIF»«IF
	statement instanceof MessageStatement»Message«ENDIF»«IF
	statement instanceof DetectionStatement»Detect«ENDIF»'''

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
			if (statement instanceof ConditionalStatement) {
				gatherData((statement as ConditionalStatement).statements)
				gatherData((statement as ConditionalStatement).otherStatements)
			} else if (statement instanceof SynchronousStatement) {
				gatherData((statement as SynchronousStatement).statements.filter(Statement).toList)
			} else if (statement instanceof ActionStatement) {
				val st = statement as ActionStatement
				robots.add(st.robot)
				addStatement(st.robot, st)
			} else if (statement instanceof MessageStatement) {
				val st = statement as MessageStatement
				robots.add(st.robot)
				addStatement(st.robot, st)
			} else if (statement instanceof DetectionStatement) {
				val st = statement as DetectionStatement
				robots.add(st.robot)
				addStatement(st.robot, st)
			}

		}

	}

	def addStatement(DynamicRobot robot, Statement statement) {
		if (!statements.containsKey(robot)) {
			statements.put(robot, new ArrayList)
		}
		statements.get(robot).add(statement)
	}

}
