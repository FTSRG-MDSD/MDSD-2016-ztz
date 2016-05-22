/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage.impl;

import hu.bme.mdsd.ztz.model.behaviour.TaskExecution;

import hu.bme.mdsd.ztz.model.drone.Property;

import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionDeclarationStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.ActionImplementationImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.ActionImplementationImpl#getCurrentTaskExecution <em>Current Task Execution</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.ActionImplementationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImplementationImpl extends MinimalEObjectImpl.Container implements ActionImplementation
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected ActionDeclarationStatement declaration;

  /**
   * The cached value of the '{@link #getCurrentTaskExecution() <em>Current Task Execution</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentTaskExecution()
   * @generated
   * @ordered
   */
  protected TaskExecution currentTaskExecution;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImplementationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BehaviourLanguagePackage.Literals.ACTION_IMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDeclarationStatement getDeclaration()
  {
    if (declaration != null && declaration.eIsProxy())
    {
      InternalEObject oldDeclaration = (InternalEObject)declaration;
      declaration = (ActionDeclarationStatement)eResolveProxy(oldDeclaration);
      if (declaration != oldDeclaration)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourLanguagePackage.ACTION_IMPLEMENTATION__DECLARATION, oldDeclaration, declaration));
      }
    }
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDeclarationStatement basicGetDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(ActionDeclarationStatement newDeclaration)
  {
    ActionDeclarationStatement oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.ACTION_IMPLEMENTATION__DECLARATION, oldDeclaration, declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskExecution getCurrentTaskExecution()
  {
    if (currentTaskExecution != null && currentTaskExecution.eIsProxy())
    {
      InternalEObject oldCurrentTaskExecution = (InternalEObject)currentTaskExecution;
      currentTaskExecution = (TaskExecution)eResolveProxy(oldCurrentTaskExecution);
      if (currentTaskExecution != oldCurrentTaskExecution)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourLanguagePackage.ACTION_IMPLEMENTATION__CURRENT_TASK_EXECUTION, oldCurrentTaskExecution, currentTaskExecution));
      }
    }
    return currentTaskExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskExecution basicGetCurrentTaskExecution()
  {
    return currentTaskExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentTaskExecution(TaskExecution newCurrentTaskExecution)
  {
    TaskExecution oldCurrentTaskExecution = currentTaskExecution;
    currentTaskExecution = newCurrentTaskExecution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.ACTION_IMPLEMENTATION__CURRENT_TASK_EXECUTION, oldCurrentTaskExecution, currentTaskExecution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, BehaviourLanguagePackage.ACTION_IMPLEMENTATION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__DECLARATION:
        if (resolve) return getDeclaration();
        return basicGetDeclaration();
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__CURRENT_TASK_EXECUTION:
        if (resolve) return getCurrentTaskExecution();
        return basicGetCurrentTaskExecution();
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__PROPERTIES:
        return getProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__DECLARATION:
        setDeclaration((ActionDeclarationStatement)newValue);
        return;
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__CURRENT_TASK_EXECUTION:
        setCurrentTaskExecution((TaskExecution)newValue);
        return;
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__DECLARATION:
        setDeclaration((ActionDeclarationStatement)null);
        return;
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__CURRENT_TASK_EXECUTION:
        setCurrentTaskExecution((TaskExecution)null);
        return;
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__PROPERTIES:
        getProperties().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__DECLARATION:
        return declaration != null;
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__CURRENT_TASK_EXECUTION:
        return currentTaskExecution != null;
      case BehaviourLanguagePackage.ACTION_IMPLEMENTATION__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionImplementationImpl