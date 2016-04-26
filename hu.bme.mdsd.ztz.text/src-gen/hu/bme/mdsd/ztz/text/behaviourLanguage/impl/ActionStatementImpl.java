/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage.impl;

import hu.bme.mdsd.ztz.model.behaviour.Action;

import hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement;
import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.ActionStatementImpl#getAction <em>Action</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.ActionStatementImpl#getMoreactions <em>Moreactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionStatementImpl extends AtomicStatementImpl implements ActionStatement
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getMoreactions() <em>Moreactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoreactions()
   * @generated
   * @ordered
   */
  protected EList<Action> moreactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionStatementImpl()
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
    return BehaviourLanguagePackage.Literals.ACTION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.ACTION_STATEMENT__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.ACTION_STATEMENT__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourLanguagePackage.ACTION_STATEMENT__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BehaviourLanguagePackage.ACTION_STATEMENT__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getMoreactions()
  {
    if (moreactions == null)
    {
      moreactions = new EObjectContainmentEList<Action>(Action.class, this, BehaviourLanguagePackage.ACTION_STATEMENT__MOREACTIONS);
    }
    return moreactions;
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
      case BehaviourLanguagePackage.ACTION_STATEMENT__ACTION:
        return basicSetAction(null, msgs);
      case BehaviourLanguagePackage.ACTION_STATEMENT__MOREACTIONS:
        return ((InternalEList<?>)getMoreactions()).basicRemove(otherEnd, msgs);
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
      case BehaviourLanguagePackage.ACTION_STATEMENT__ACTION:
        return getAction();
      case BehaviourLanguagePackage.ACTION_STATEMENT__MOREACTIONS:
        return getMoreactions();
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
      case BehaviourLanguagePackage.ACTION_STATEMENT__ACTION:
        setAction((Action)newValue);
        return;
      case BehaviourLanguagePackage.ACTION_STATEMENT__MOREACTIONS:
        getMoreactions().clear();
        getMoreactions().addAll((Collection<? extends Action>)newValue);
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
      case BehaviourLanguagePackage.ACTION_STATEMENT__ACTION:
        setAction((Action)null);
        return;
      case BehaviourLanguagePackage.ACTION_STATEMENT__MOREACTIONS:
        getMoreactions().clear();
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
      case BehaviourLanguagePackage.ACTION_STATEMENT__ACTION:
        return action != null;
      case BehaviourLanguagePackage.ACTION_STATEMENT__MOREACTIONS:
        return moreactions != null && !moreactions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionStatementImpl
