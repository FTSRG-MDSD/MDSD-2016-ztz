package hu.bme.mdsd.ztz.text.generator;

import com.google.common.collect.Iterables;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguageFactory;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ConditionalStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.DetectionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MessageTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.MultiTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.Statement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.SynchronousStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.UniTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.impl.BehaviourLanguageFactoryImpl;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DesmoJGenerator {
  private BehaviourLanguage bl;
  
  private BehaviourLanguageFactory blf;
  
  private IFileSystemAccess2 fsa;
  
  public DesmoJGenerator(final BehaviourLanguage bl, final IFileSystemAccess2 fsa) {
    this.bl = bl;
    this.fsa = fsa;
    BehaviourLanguageFactoryImpl _behaviourLanguageFactoryImpl = new BehaviourLanguageFactoryImpl();
    this.blf = _behaviourLanguageFactoryImpl;
    HashSet<DynamicRobot> _hashSet = new HashSet<DynamicRobot>();
    this.robots = _hashSet;
    HashMap<DynamicRobot, List<AtomicStatement>> _hashMap = new HashMap<DynamicRobot, List<AtomicStatement>>();
    this.statements = _hashMap;
  }
  
  private Set<DynamicRobot> robots;
  
  private Map<DynamicRobot, List<AtomicStatement>> statements;
  
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
  
  public CharSequence generateAll() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateHeader = this.generateHeader();
    _builder.append(_generateHeader, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = this.robots.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          for(final DynamicRobot robot : this.robots) {
            CharSequence _generateRobotEntity = this.generateRobotEntity(robot);
            _builder.append(_generateRobotEntity, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
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
      List<AtomicStatement> _get = this.statements.get(robot);
      boolean _hasElements = false;
      for(final AtomicStatement statement : _get) {
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
        CharSequence _generateProperties = this.generateProperties(robot, statement);
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
  
  protected CharSequence _generateProperties(final DynamicRobot robot, final DetectionStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", \"");
    AreaObject _object = statement.getObject();
    String _name = _object.getName();
    _builder.append(_name, "");
    _builder.append("\", false");
    return _builder;
  }
  
  protected CharSequence _generateProperties(final DynamicRobot robot, final ActionStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ActionImplementation _action = statement.getAction();
      EList<AreaObject> _targets = _action.getTargets();
      boolean _isEmpty = _targets.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(", \"");
        ActionImplementation _action_1 = statement.getAction();
        EList<AreaObject> _targets_1 = _action_1.getTargets();
        AreaObject _get = _targets_1.get(0);
        String _name = _get.getName();
        _builder.append(_name, "");
        _builder.append("\", false");
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateProperties(final DynamicRobot robot, final MessageStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      MessageTarget _target = statement.getTarget();
      if ((_target instanceof UniTarget)) {
        _builder.append(", \"");
        {
          MessageTarget _target_1 = statement.getTarget();
          DynamicRobot _target_2 = ((UniTarget) _target_1).getTarget();
          boolean _equals = _target_2.equals(robot);
          if (_equals) {
            DynamicRobot _robot = statement.getRobot();
            String _name = _robot.getName();
            _builder.append(_name, "");
          } else {
            MessageTarget _target_3 = statement.getTarget();
            DynamicRobot _target_4 = ((UniTarget) _target_3).getTarget();
            String _name_1 = _target_4.getName();
            _builder.append(_name_1, "");
          }
        }
        _builder.append("\", true");
      }
    }
    return _builder;
  }
  
  protected CharSequence _getEventType(final ActionStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    ActionImplementation _action = statement.getAction();
    ActionDeclarationStatement _declaration = _action.getDeclaration();
    String _name = _declaration.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _getEventType(final MessageStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Message");
    return _builder;
  }
  
  protected CharSequence _getEventType(final DetectionStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Detect");
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
      this.process(statement);
    }
  }
  
  protected Boolean _process(final ActionStatement st) {
    boolean _xblockexpression = false;
    {
      DynamicRobot _robot = st.getRobot();
      this.robots.add(_robot);
      DynamicRobot _robot_1 = st.getRobot();
      _xblockexpression = this.addStatement(_robot_1, st);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _process(final MessageStatement st) {
    boolean _xblockexpression = false;
    {
      DynamicRobot _robot = st.getRobot();
      this.robots.add(_robot);
      boolean _xifexpression = false;
      MessageTarget _target = st.getTarget();
      if ((_target instanceof UniTarget)) {
        boolean _xblockexpression_1 = false;
        {
          MessageTarget _target_1 = st.getTarget();
          final DynamicRobot targetRobot = ((UniTarget) _target_1).getTarget();
          this.robots.add(targetRobot);
          DynamicRobot _robot_1 = st.getRobot();
          this.addStatement(_robot_1, st);
          _xblockexpression_1 = this.addStatement(targetRobot, st);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        MessageTarget _target_1 = st.getTarget();
        if ((_target_1 instanceof MultiTarget)) {
          MessageTarget _target_2 = st.getTarget();
          final EList<DynamicRobot> targetRobots = ((MultiTarget) _target_2).getTarget();
          this.partMultiTarget(st, targetRobots);
        } else {
          MessageTarget _target_3 = st.getTarget();
          if ((_target_3 instanceof AllTarget)) {
            DynamicRobot _robot_1 = st.getRobot();
            EList<RobotCollaboration> _collaborations = _robot_1.getCollaborations();
            final Function1<RobotCollaboration, DynamicRobot> _function = (RobotCollaboration c) -> {
              return c.getCollaborator();
            };
            final List<DynamicRobot> targetRobots_1 = ListExtensions.<RobotCollaboration, DynamicRobot>map(_collaborations, _function);
            this.partMultiTarget(st, targetRobots_1);
          }
        }
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _process(final DetectionStatement st) {
    boolean _xblockexpression = false;
    {
      DynamicRobot _robot = st.getRobot();
      this.robots.add(_robot);
      DynamicRobot _robot_1 = st.getRobot();
      _xblockexpression = this.addStatement(_robot_1, st);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  protected Boolean _process(final ConditionalStatement st) {
    EList<Statement> _statements = st.getStatements();
    this.gatherData(_statements);
    EList<Statement> _otherStatements = st.getOtherStatements();
    this.gatherData(_otherStatements);
    return null;
  }
  
  protected Boolean _process(final SynchronousStatement st) {
    EList<AtomicStatement> _statements = st.getStatements();
    Iterable<Statement> _filter = Iterables.<Statement>filter(_statements, Statement.class);
    List<Statement> _list = IterableExtensions.<Statement>toList(_filter);
    this.gatherData(_list);
    return null;
  }
  
  protected Boolean _process(final Statement st) {
    return null;
  }
  
  public void partMultiTarget(final MessageStatement st, final List<DynamicRobot> targetRobots) {
    for (final DynamicRobot targetRobot : targetRobots) {
      {
        this.robots.add(targetRobot);
        final UniTarget uniTarget = this.blf.createUniTarget();
        uniTarget.setTarget(targetRobot);
        final MessageStatement stCopy = this.blf.createMessageStatement();
        Message _message = st.getMessage();
        stCopy.setMessage(_message);
        DynamicRobot _robot = st.getRobot();
        stCopy.setRobot(_robot);
        stCopy.setTarget(uniTarget);
        DynamicRobot _robot_1 = stCopy.getRobot();
        this.addStatement(_robot_1, stCopy);
        this.addStatement(targetRobot, stCopy);
      }
    }
  }
  
  public boolean addStatement(final DynamicRobot robot, final AtomicStatement statement) {
    boolean _xblockexpression = false;
    {
      boolean _containsKey = this.statements.containsKey(robot);
      boolean _not = (!_containsKey);
      if (_not) {
        ArrayList<AtomicStatement> _arrayList = new ArrayList<AtomicStatement>();
        this.statements.put(robot, _arrayList);
      }
      List<AtomicStatement> _get = this.statements.get(robot);
      _xblockexpression = _get.add(statement);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateProperties(final DynamicRobot robot, final AtomicStatement statement) {
    if (statement instanceof ActionStatement) {
      return _generateProperties(robot, (ActionStatement)statement);
    } else if (statement instanceof DetectionStatement) {
      return _generateProperties(robot, (DetectionStatement)statement);
    } else if (statement instanceof MessageStatement) {
      return _generateProperties(robot, (MessageStatement)statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(robot, statement).toString());
    }
  }
  
  public CharSequence getEventType(final AtomicStatement statement) {
    if (statement instanceof ActionStatement) {
      return _getEventType((ActionStatement)statement);
    } else if (statement instanceof DetectionStatement) {
      return _getEventType((DetectionStatement)statement);
    } else if (statement instanceof MessageStatement) {
      return _getEventType((MessageStatement)statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement).toString());
    }
  }
  
  public Boolean process(final Statement st) {
    if (st instanceof ActionStatement) {
      return _process((ActionStatement)st);
    } else if (st instanceof DetectionStatement) {
      return _process((DetectionStatement)st);
    } else if (st instanceof MessageStatement) {
      return _process((MessageStatement)st);
    } else if (st instanceof ConditionalStatement) {
      return _process((ConditionalStatement)st);
    } else if (st instanceof SynchronousStatement) {
      return _process((SynchronousStatement)st);
    } else if (st != null) {
      return _process(st);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(st).toString());
    }
  }
}
