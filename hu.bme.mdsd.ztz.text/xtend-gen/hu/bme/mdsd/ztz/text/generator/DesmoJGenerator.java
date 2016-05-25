package hu.bme.mdsd.ztz.text.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import hu.bme.mdsd.ztz.model.drone.Coordinate;
import hu.bme.mdsd.ztz.model.drone.Position;
import hu.bme.mdsd.ztz.model.drone.Property;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;
import hu.bme.mdsd.ztz.model.drone.PropertyValue;
import hu.bme.mdsd.ztz.model.drone.Robot;
import hu.bme.mdsd.ztz.model.drone.RobotMissionContainer;
import hu.bme.mdsd.ztz.model.drone.StringValue;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AllTarget;
import hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguageFactory;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
    BehaviourLanguage _copy = EcoreUtil.<BehaviourLanguage>copy(bl);
    this.bl = _copy;
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
  
  public CharSequence generateRobotPosition(final DynamicRobot robot) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Robot _robot = robot.getRobot();
      Position _position = _robot.getPosition();
      EList<Coordinate> _coordinates = _position.getCoordinates();
      boolean _isEmpty = _coordinates.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("\t\t");
        String _name = robot.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "\t\t");
        _builder.append("Entity.setPosition(new Position(");
        Robot _robot_1 = robot.getRobot();
        Position _position_1 = _robot_1.getPosition();
        EList<Coordinate> _coordinates_1 = _position_1.getCoordinates();
        Coordinate _get = _coordinates_1.get(0);
        float _longitude = _get.getLongitude();
        _builder.append(_longitude, "\t\t");
        _builder.append(", ");
        Robot _robot_2 = robot.getRobot();
        Position _position_2 = _robot_2.getPosition();
        EList<Coordinate> _coordinates_2 = _position_2.getCoordinates();
        Coordinate _get_1 = _coordinates_2.get(0);
        float _latitude = _get_1.getLatitude();
        _builder.append(_latitude, "\t\t");
        _builder.append("));");
      }
    }
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
  
  public CharSequence generateAreaObjectPosition(final AreaObject areaObject) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      EList<Position> _positions = areaObject.getPositions();
      boolean _isEmpty = _positions.isEmpty();
      boolean _not = (!_isEmpty);
      if (!_not) {
        _and = false;
      } else {
        EList<Position> _positions_1 = areaObject.getPositions();
        Position _get = _positions_1.get(0);
        EList<Coordinate> _coordinates = _get.getCoordinates();
        boolean _isEmpty_1 = _coordinates.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        _and = _not_1;
      }
      if (_and) {
        _builder.newLine();
        _builder.append("\t\t");
        String _name = areaObject.getName();
        String _firstLower = StringExtensions.toFirstLower(_name);
        _builder.append(_firstLower, "\t\t");
        _builder.append("Entity.setResetPosition(new Position(");
        EList<Position> _positions_2 = areaObject.getPositions();
        Position _get_1 = _positions_2.get(0);
        EList<Coordinate> _coordinates_1 = _get_1.getCoordinates();
        Coordinate _get_2 = _coordinates_1.get(0);
        float _longitude = _get_2.getLongitude();
        _builder.append(_longitude, "\t\t");
        _builder.append(", ");
        EList<Position> _positions_3 = areaObject.getPositions();
        Position _get_3 = _positions_3.get(0);
        EList<Coordinate> _coordinates_2 = _get_3.getCoordinates();
        Coordinate _get_4 = _coordinates_2.get(0);
        float _latitude = _get_4.getLatitude();
        _builder.append(_latitude, "\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _name_1 = areaObject.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
        _builder.append(_firstLower_1, "\t\t");
        _builder.append("Entity.setPosition(new Position(");
        EList<Position> _positions_4 = areaObject.getPositions();
        Position _get_5 = _positions_4.get(0);
        EList<Coordinate> _coordinates_3 = _get_5.getCoordinates();
        Coordinate _get_6 = _coordinates_3.get(0);
        float _longitude_1 = _get_6.getLongitude();
        _builder.append(_longitude_1, "\t\t");
        _builder.append(", ");
        EList<Position> _positions_5 = areaObject.getPositions();
        Position _get_7 = _positions_5.get(0);
        EList<Coordinate> _coordinates_4 = _get_7.getCoordinates();
        Coordinate _get_8 = _coordinates_4.get(0);
        float _latitude_1 = _get_8.getLatitude();
        _builder.append(_latitude_1, "\t\t");
        _builder.append("));");
      }
    }
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
            CharSequence _generateRobotPosition = this.generateRobotPosition(robot);
            _builder.append(_generateRobotPosition, "");
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
            CharSequence _generateAreaObjectPosition = this.generateAreaObjectPosition(areaObject);
            _builder.append(_generateAreaObjectPosition, "");
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
        _builder.append("\", true");
        String _generateEventPosition = this.generateEventPosition(statement);
        _builder.append(_generateEventPosition, "\t\t\t\t");
        _builder.append(")");
        CharSequence _generateTarget = this.generateTarget(robot, statement);
        _builder.append(_generateTarget, "\t\t\t\t");
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generateTarget(final DynamicRobot robot, final DetectionStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", \"");
    AreaObject _object = statement.getObject();
    String _name = _object.getName();
    _builder.append(_name, "");
    _builder.append("\", false");
    return _builder;
  }
  
  protected CharSequence _generateTarget(final DynamicRobot robot, final ActionStatement statement) {
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
  
  protected CharSequence _generateTarget(final DynamicRobot robot, final MessageStatement statement) {
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
  
  protected String _generateEventPosition(final Statement statement) {
    return "";
  }
  
  protected String _generateEventPosition(final ActionStatement statement) {
    ActionImplementation _action = statement.getAction();
    EList<Property> _properties = _action.getProperties();
    final Function1<Property, Boolean> _function = (Property prop) -> {
      PropertyKey _key = prop.getKey();
      String _name = _key.getName();
      return Boolean.valueOf(_name.equals("Lat"));
    };
    final Property longitude = IterableExtensions.<Property>findFirst(_properties, _function);
    ActionImplementation _action_1 = statement.getAction();
    EList<Property> _properties_1 = _action_1.getProperties();
    final Function1<Property, Boolean> _function_1 = (Property prop) -> {
      PropertyKey _key = prop.getKey();
      String _name = _key.getName();
      return Boolean.valueOf(_name.equals("Long"));
    };
    final Property latitude = IterableExtensions.<Property>findFirst(_properties_1, _function_1);
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    boolean _notEquals = (!Objects.equal(longitude, null));
    if (!_notEquals) {
      _and_2 = false;
    } else {
      PropertyValue _value = longitude.getValue();
      _and_2 = (_value instanceof StringValue);
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      boolean _notEquals_1 = (!Objects.equal(latitude, null));
      _and_1 = _notEquals_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      PropertyValue _value_1 = latitude.getValue();
      _and = (_value_1 instanceof StringValue);
    }
    if (_and) {
      PropertyValue _value_2 = longitude.getValue();
      String _value_3 = ((StringValue) _value_2).getValue();
      String _plus = (", new Position(" + _value_3);
      String _plus_1 = (_plus + ", ");
      PropertyValue _value_4 = latitude.getValue();
      String _value_5 = ((StringValue) _value_4).getValue();
      String _plus_2 = (_plus_1 + _value_5);
      return (_plus_2 + ")");
    }
    return null;
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
    _builder.append("import hu.bme.mdsd.ztz.model.simulation.objectdelivery.entities.Position;");
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
  
  protected Boolean _process(final CollaborationStatement st) {
    DynamicRobot _robot = st.getRobot();
    EList<RobotCollaboration> _collaborations = _robot.getCollaborations();
    EList<RobotCollaboration> _collaboration = st.getCollaboration();
    _collaborations.addAll(_collaboration);
    EList<RobotCollaboration> _collaboration_1 = st.getCollaboration();
    for (final RobotCollaboration collaboration : _collaboration_1) {
      {
        final RobotCollaboration oppositeColl = BehaviourFactory.eINSTANCE.createRobotCollaboration();
        DynamicRobot _robot_1 = st.getRobot();
        oppositeColl.setCollaborator(_robot_1);
        DynamicRobot _collaborator = collaboration.getCollaborator();
        EList<RobotCollaboration> _collaborations_1 = _collaborator.getCollaborations();
        _collaborations_1.add(oppositeColl);
      }
    }
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
  
  public CharSequence generateTarget(final DynamicRobot robot, final AtomicStatement statement) {
    if (statement instanceof ActionStatement) {
      return _generateTarget(robot, (ActionStatement)statement);
    } else if (statement instanceof DetectionStatement) {
      return _generateTarget(robot, (DetectionStatement)statement);
    } else if (statement instanceof MessageStatement) {
      return _generateTarget(robot, (MessageStatement)statement);
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
  
  public String generateEventPosition(final Statement statement) {
    if (statement instanceof ActionStatement) {
      return _generateEventPosition((ActionStatement)statement);
    } else if (statement != null) {
      return _generateEventPosition(statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement).toString());
    }
  }
  
  public Boolean process(final Statement st) {
    if (st instanceof ActionStatement) {
      return _process((ActionStatement)st);
    } else if (st instanceof CollaborationStatement) {
      return _process((CollaborationStatement)st);
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
