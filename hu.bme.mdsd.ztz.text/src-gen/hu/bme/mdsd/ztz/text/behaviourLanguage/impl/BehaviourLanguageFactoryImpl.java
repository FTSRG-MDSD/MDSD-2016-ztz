/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage.impl;

import hu.bme.mdsd.ztz.text.behaviourLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourLanguageFactoryImpl extends EFactoryImpl implements BehaviourLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BehaviourLanguageFactory init()
  {
    try
    {
      BehaviourLanguageFactory theBehaviourLanguageFactory = (BehaviourLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviourLanguagePackage.eNS_URI);
      if (theBehaviourLanguageFactory != null)
      {
        return theBehaviourLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BehaviourLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviourLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BehaviourLanguagePackage.BEHAVIOUR_LANGUAGE: return createBehaviourLanguage();
      case BehaviourLanguagePackage.IMPORT: return createImport();
      case BehaviourLanguagePackage.STATEMENT: return createStatement();
      case BehaviourLanguagePackage.ATOMIC_STATEMENT: return createAtomicStatement();
      case BehaviourLanguagePackage.CONDITIONAL_STATEMENT: return createConditionalStatement();
      case BehaviourLanguagePackage.SYNCHRONOUS_STATEMENT: return createSynchronousStatement();
      case BehaviourLanguagePackage.ACTION_DECLARATION_STATEMENT: return createActionDeclarationStatement();
      case BehaviourLanguagePackage.ACTION_STATEMENT: return createActionStatement();
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION: return createActionImplementation();
      case BehaviourLanguagePackage.MESSAGE_STATEMENT: return createMessageStatement();
      case BehaviourLanguagePackage.COLLABORATION_STATEMENT: return createCollaborationStatement();
      case BehaviourLanguagePackage.DETECTION_STATEMENT: return createDetectionStatement();
      case BehaviourLanguagePackage.EXECUTION_STATEMENT: return createExecutionStatement();
      case BehaviourLanguagePackage.STATUS_STATEMENT: return createStatusStatement();
      case BehaviourLanguagePackage.ROBOT_STATUS_STATEMENT: return createRobotStatusStatement();
      case BehaviourLanguagePackage.TASK_STATUS_STATEMENT: return createTaskStatusStatement();
      case BehaviourLanguagePackage.MESSAGE_TARGET: return createMessageTarget();
      case BehaviourLanguagePackage.UNI_TARGET: return createUniTarget();
      case BehaviourLanguagePackage.MULTI_TARGET: return createMultiTarget();
      case BehaviourLanguagePackage.ALL_TARGET: return createAllTarget();
      case BehaviourLanguagePackage.CONDITION: return createCondition();
      case BehaviourLanguagePackage.TASK_STATUS_CONDITION: return createTaskStatusCondition();
      case BehaviourLanguagePackage.ROBOT_STATUS_CONDITION: return createRobotStatusCondition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviourLanguage createBehaviourLanguage()
  {
    BehaviourLanguageImpl behaviourLanguage = new BehaviourLanguageImpl();
    return behaviourLanguage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicStatement createAtomicStatement()
  {
    AtomicStatementImpl atomicStatement = new AtomicStatementImpl();
    return atomicStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalStatement createConditionalStatement()
  {
    ConditionalStatementImpl conditionalStatement = new ConditionalStatementImpl();
    return conditionalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SynchronousStatement createSynchronousStatement()
  {
    SynchronousStatementImpl synchronousStatement = new SynchronousStatementImpl();
    return synchronousStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDeclarationStatement createActionDeclarationStatement()
  {
    ActionDeclarationStatementImpl actionDeclarationStatement = new ActionDeclarationStatementImpl();
    return actionDeclarationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStatement createActionStatement()
  {
    ActionStatementImpl actionStatement = new ActionStatementImpl();
    return actionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionImplementation createActionImplementation()
  {
    ActionImplementationImpl actionImplementation = new ActionImplementationImpl();
    return actionImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageStatement createMessageStatement()
  {
    MessageStatementImpl messageStatement = new MessageStatementImpl();
    return messageStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollaborationStatement createCollaborationStatement()
  {
    CollaborationStatementImpl collaborationStatement = new CollaborationStatementImpl();
    return collaborationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DetectionStatement createDetectionStatement()
  {
    DetectionStatementImpl detectionStatement = new DetectionStatementImpl();
    return detectionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecutionStatement createExecutionStatement()
  {
    ExecutionStatementImpl executionStatement = new ExecutionStatementImpl();
    return executionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusStatement createStatusStatement()
  {
    StatusStatementImpl statusStatement = new StatusStatementImpl();
    return statusStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotStatusStatement createRobotStatusStatement()
  {
    RobotStatusStatementImpl robotStatusStatement = new RobotStatusStatementImpl();
    return robotStatusStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskStatusStatement createTaskStatusStatement()
  {
    TaskStatusStatementImpl taskStatusStatement = new TaskStatusStatementImpl();
    return taskStatusStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageTarget createMessageTarget()
  {
    MessageTargetImpl messageTarget = new MessageTargetImpl();
    return messageTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniTarget createUniTarget()
  {
    UniTargetImpl uniTarget = new UniTargetImpl();
    return uniTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiTarget createMultiTarget()
  {
    MultiTargetImpl multiTarget = new MultiTargetImpl();
    return multiTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllTarget createAllTarget()
  {
    AllTargetImpl allTarget = new AllTargetImpl();
    return allTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskStatusCondition createTaskStatusCondition()
  {
    TaskStatusConditionImpl taskStatusCondition = new TaskStatusConditionImpl();
    return taskStatusCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotStatusCondition createRobotStatusCondition()
  {
    RobotStatusConditionImpl robotStatusCondition = new RobotStatusConditionImpl();
    return robotStatusCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviourLanguagePackage getBehaviourLanguagePackage()
  {
    return (BehaviourLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BehaviourLanguagePackage getPackage()
  {
    return BehaviourLanguagePackage.eINSTANCE;
  }

} //BehaviourLanguageFactoryImpl
