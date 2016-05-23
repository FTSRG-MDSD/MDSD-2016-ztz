package hu.bme.mdsd.ztz.text.generator;

import com.google.common.collect.Iterables;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DesmoJGenerator {
  private BehaviourLanguage bl;
  
  private IFileSystemAccess2 fsa;
  
  public DesmoJGenerator(final BehaviourLanguage bl, final IFileSystemAccess2 fsa) {
    this.bl = bl;
    this.fsa = fsa;
    HashSet<DynamicRobot> _hashSet = new HashSet<DynamicRobot>();
    this.robots = _hashSet;
    HashMap<DynamicRobot, List<Statement>> _hashMap = new HashMap<DynamicRobot, List<Statement>>();
    this.statements = _hashMap;
  }
  
  private Set<DynamicRobot> robots;
  
  private Map<DynamicRobot, List<Statement>> statements;
  
  public CharSequence generateRobotEntity(final DynamicRobot robot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("DynamicRobotEntity ");
    String _name = robot.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "\t\t");
    _builder.append("Entity =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("new DynamicRobotEntity(this, \"");
    String _name_1 = robot.getName();
    _builder.append(_name_1, "\t\t\t");
    _builder.append("\", false);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("registeredEntities.put(");
    String _name_2 = robot.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("Entity.getSimpleName(), ");
    String _name_3 = robot.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_2, "\t\t");
    _builder.append("Entity);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateAreaObjectEntity(final AreaObject areaObject) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ResettableAreaObjectEntity ");
    String _name = areaObject.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "\t\t");
    _builder.append("Entity = new ResettableAreaObjectEntity(this, \"");
    String _name_1 = areaObject.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\", false);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("registeredObjects.put(");
    String _name_2 = areaObject.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
    _builder.append(_firstLower_1, "\t\t");
    _builder.append("Entity.getSimpleName(), ");
    String _name_3 = areaObject.getName();
    String _firstLower_2 = StringExtensions.toFirstLower(_name_3);
    _builder.append(_firstLower_2, "\t\t");
    _builder.append("Entity);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("availableObjects.add(");
    String _name_4 = areaObject.getName();
    String _firstLower_3 = StringExtensions.toFirstLower(_name_4);
    _builder.append(_firstLower_3, "\t\t");
    _builder.append("Entity);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateStatement(final ActionStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new StatementEntity(this, new SearchEvent(this, \"Hoo\", true)),");
    _builder.newLine();
    _builder.append("new StatementEntity(this, new DetectEvent(this, \"Detect\", true), \"Box\", false),");
    _builder.newLine();
    _builder.append("new StatementEntity(this, new MoveEvent(this, \"Move\", true), \"Box\", false),");
    _builder.newLine();
    _builder.append("new StatementEntity(this, new BringEvent(this, \"Bring\", true), \"Box\", false)");
    _builder.newLine();
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAll() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateHeader = this.generateHeader();
    _builder.append(_generateHeader, "");
    _builder.newLineIfNotEmpty();
    {
      for(final DynamicRobot robot : this.robots) {
        CharSequence _generateRobotEntity = this.generateRobotEntity(robot);
        _builder.append(_generateRobotEntity, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      DynamicRobot _get = ((DynamicRobot[])Conversions.unwrapArray(this.robots, DynamicRobot.class))[0];
      Robot _robot = _get.getRobot();
      EObject _eContainer = _robot.eContainer();
      EList<AreaObject> _areaObjects = ((RobotMissionContainer) _eContainer).getAreaObjects();
      for(final AreaObject areaObject : _areaObjects) {
        CharSequence _generateAreaObjectEntity = this.generateAreaObjectEntity(areaObject);
        _builder.append(_generateAreaObjectEntity, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final DynamicRobot robot_1 : this.robots) {
        CharSequence _generateStatements = this.generateStatements(robot_1);
        _builder.append(_generateStatements, "");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence _generateFooter = this.generateFooter();
    _builder.append(_generateFooter, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateStatements(final DynamicRobot robot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t");
    String _name = robot.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "\t\t");
    _builder.append("Entity.initializeEvents(");
    _builder.newLineIfNotEmpty();
    {
      List<Statement> _get = this.statements.get(robot);
      boolean _hasElements = false;
      for(final Statement statement : _get) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.newLine();
        _builder.append("\t\t\t\t");
        _builder.append("new StatementEntity(this, new ");
        CharSequence _eventType = this.getEventType(statement);
        _builder.append(_eventType, "\t\t\t\t");
        _builder.append("Event(this, \"");
        CharSequence _eventType_1 = this.getEventType(statement);
        _builder.append(_eventType_1, "\t\t\t\t");
        _builder.append("\", true)");
        CharSequence _generateProperties = this.generateProperties(statement);
        _builder.append(_generateProperties, "\t\t\t\t");
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateProperties(final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      if (!(statement instanceof ActionStatement)) {
        _and = false;
      } else {
        ActionImplementation _action = ((ActionStatement) statement).getAction();
        EList<AreaObject> _targets = _action.getTargets();
        boolean _isEmpty = _targets.isEmpty();
        boolean _not = (!_isEmpty);
        _and = _not;
      }
      if (_and) {
        _builder.append(", \"");
        ActionImplementation _action_1 = ((ActionStatement) statement).getAction();
        EList<AreaObject> _targets_1 = _action_1.getTargets();
        AreaObject _get = _targets_1.get(0);
        String _name = _get.getName();
        _builder.append(_name, "");
        _builder.append("\", false");
      }
    }
    {
      boolean _and_1 = false;
      if (!(statement instanceof MessageStatement)) {
        _and_1 = false;
      } else {
        MessageTarget _target = ((MessageStatement) statement).getTarget();
        _and_1 = (_target instanceof UniTarget);
      }
      if (_and_1) {
        _builder.append(", \"");
        MessageTarget _target_1 = ((MessageStatement) statement).getTarget();
        DynamicRobot _target_2 = ((UniTarget) _target_1).getTarget();
        String _name_1 = _target_2.getName();
        _builder.append(_name_1, "");
        _builder.append("\", true");
      }
    }
    {
      if ((statement instanceof DetectionStatement)) {
        _builder.append(", \"");
        AreaObject _object = ((DetectionStatement) statement).getObject();
        String _name_2 = _object.getName();
        _builder.append(_name_2, "");
        _builder.append("\", false");
      }
    }
    return _builder;
  }
  
  public CharSequence getEventType(final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((statement instanceof ActionStatement)) {
        ActionImplementation _action = ((ActionStatement)statement).getAction();
        ActionDeclarationStatement _declaration = _action.getDeclaration();
        String _name = _declaration.getName();
        _builder.append(_name, "");
      }
    }
    {
      if ((statement instanceof MessageStatement)) {
        _builder.append("Message");
      }
    }
    {
      if ((statement instanceof DetectionStatement)) {
        _builder.append("Detect");
      }
    }
    return _builder;
  }
  
  public CharSequence generateFooter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package hu.bme.mdsd.ztz.model.simulation.objectdelivery.model;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import desmoj.core.simulator.Model;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.DynamicRobotEntity;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.ResettableAreaObjectEntity;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.StatementEntity;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.BringEvent;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.DetectEvent;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveEvent;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.ResetObjectEvent;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MoveToTargetEvent;");
    _builder.newLine();
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.events.MessageEvent;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class DesmoSimulation extends ObjectDeliverySimulationModel {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public DesmoSimulation(Model owner, String name, boolean showInReport, boolean showInTrace) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("super(owner, name, showInReport, showInTrace);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void init() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.init();");
    _builder.newLine();
    return _builder;
  }
  
  public void generateJavaFiles() {
    EList<Statement> _statements = this.bl.getStatements();
    this.gatherData(_statements);
    CharSequence _generateAll = this.generateAll();
    this.fsa.generateFile("DesmoSimulation.java", _generateAll);
  }
  
  public void gatherData(final List<Statement> statementList) {
    for (final Statement statement : statementList) {
      if ((statement instanceof ConditionalStatement)) {
        EList<Statement> _statements = ((ConditionalStatement) statement).getStatements();
        this.gatherData(_statements);
        EList<Statement> _otherStatements = ((ConditionalStatement) statement).getOtherStatements();
        this.gatherData(_otherStatements);
      } else {
        if ((statement instanceof SynchronousStatement)) {
          EList<AtomicStatement> _statements_1 = ((SynchronousStatement) statement).getStatements();
          Iterable<Statement> _filter = Iterables.<Statement>filter(_statements_1, Statement.class);
          List<Statement> _list = IterableExtensions.<Statement>toList(_filter);
          this.gatherData(_list);
        } else {
          if ((statement instanceof ActionStatement)) {
            final ActionStatement st = ((ActionStatement) statement);
            DynamicRobot _robot = st.getRobot();
            this.robots.add(_robot);
            DynamicRobot _robot_1 = st.getRobot();
            this.addStatement(_robot_1, st);
          } else {
            if ((statement instanceof MessageStatement)) {
              final MessageStatement st_1 = ((MessageStatement) statement);
              DynamicRobot _robot_2 = st_1.getRobot();
              this.robots.add(_robot_2);
              DynamicRobot _robot_3 = st_1.getRobot();
              this.addStatement(_robot_3, st_1);
            } else {
              if ((statement instanceof DetectionStatement)) {
                final DetectionStatement st_2 = ((DetectionStatement) statement);
                DynamicRobot _robot_4 = st_2.getRobot();
                this.robots.add(_robot_4);
                DynamicRobot _robot_5 = st_2.getRobot();
                this.addStatement(_robot_5, st_2);
              }
            }
          }
        }
      }
    }
  }
  
  public boolean addStatement(final DynamicRobot robot, final Statement statement) {
    boolean _xblockexpression = false;
    {
      boolean _containsKey = this.statements.containsKey(robot);
      boolean _not = (!_containsKey);
      if (_not) {
        ArrayList<Statement> _arrayList = new ArrayList<Statement>();
        this.statements.put(robot, _arrayList);
      }
      List<Statement> _get = this.statements.get(robot);
      _xblockexpression = _get.add(statement);
    }
    return _xblockexpression;
  }
}
