package hu.bme.mdsd.ztz.text.util;

import com.google.common.base.Objects;
import hu.bme.mdsd.ztz.model.behaviour.Action;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;
import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;
import hu.bme.mdsd.ztz.model.behaviour.Message;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;
import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;
import hu.bme.mdsd.ztz.model.drone.AreaObject;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class RobotUtil {
  public static boolean addAction(final DynamicRobot senderRobot, final Action action) {
    EList<Action> _actions = senderRobot.getActions();
    return _actions.add(action);
  }
  
  public static boolean addSendedMessage(final DynamicRobot senderRobot, final Message message) {
    MessageRepository _messageRepository = senderRobot.getMessageRepository();
    EList<Message> _sendedMessages = _messageRepository.getSendedMessages();
    return _sendedMessages.add(message);
  }
  
  public static boolean reachableRobot(final DynamicRobot origin, final DynamicRobot target) {
    EList<RobotCollaboration> _collaborations = origin.getCollaborations();
    for (final RobotCollaboration collab : _collaborations) {
      DynamicRobot _collaborator = collab.getCollaborator();
      boolean _equals = Objects.equal(_collaborator, target);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public static MessageRepository initMessageRepository(final DynamicRobot robot) {
    MessageRepository messageRepository = robot.getMessageRepository();
    MessageRepository _messageRepository = robot.getMessageRepository();
    boolean _equals = Objects.equal(_messageRepository, null);
    if (_equals) {
      MessageRepository _createMessageRepository = BehaviourFactory.eINSTANCE.createMessageRepository();
      messageRepository = _createMessageRepository;
      String _name = robot.getName();
      String _plus = (_name + "MessageRepository");
      messageRepository.setName(_plus);
      messageRepository.setRobot(robot);
    }
    return messageRepository;
  }
  
  public static boolean detected(final DynamicRobot robot, final AreaObject areaObject) {
    EList<DetectedObject> _detectedObjects = robot.getDetectedObjects();
    for (final DetectedObject detectedObj : _detectedObjects) {
      AreaObject _object = detectedObj.getObject();
      boolean _equals = Objects.equal(_object, areaObject);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean removeAreaObject(final DynamicRobot robot, final AreaObject areaObject) {
    boolean _xblockexpression = false;
    {
      DetectedObject removeObject = null;
      EList<DetectedObject> _detectedObjects = robot.getDetectedObjects();
      for (final DetectedObject detectedObj : _detectedObjects) {
        AreaObject _object = detectedObj.getObject();
        boolean _equals = Objects.equal(_object, areaObject);
        if (_equals) {
          removeObject = detectedObj;
        }
      }
      EList<DetectedObject> _detectedObjects_1 = robot.getDetectedObjects();
      _xblockexpression = _detectedObjects_1.remove(removeObject);
    }
    return _xblockexpression;
  }
}
