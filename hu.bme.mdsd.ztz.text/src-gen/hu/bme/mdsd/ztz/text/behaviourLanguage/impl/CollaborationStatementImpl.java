/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage.impl;

import hu.bme.mdsd.ztz.model.behaviour.RobotCollaboration;

import hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage;
import hu.bme.mdsd.ztz.text.behaviourLanguage.CollaborationStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.impl.CollaborationStatementImpl#getCollaboration <em>Collaboration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationStatementImpl extends StatementImpl implements CollaborationStatement
{
  /**
   * The cached value of the '{@link #getCollaboration() <em>Collaboration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollaboration()
   * @generated
   * @ordered
   */
  protected EList<RobotCollaboration> collaboration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CollaborationStatementImpl()
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
    return BehaviourLanguagePackage.Literals.COLLABORATION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RobotCollaboration> getCollaboration()
  {
    if (collaboration == null)
    {
      collaboration = new EObjectContainmentEList<RobotCollaboration>(RobotCollaboration.class, this, BehaviourLanguagePackage.COLLABORATION_STATEMENT__COLLABORATION);
    }
    return collaboration;
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
      case BehaviourLanguagePackage.COLLABORATION_STATEMENT__COLLABORATION:
        return ((InternalEList<?>)getCollaboration()).basicRemove(otherEnd, msgs);
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
      case BehaviourLanguagePackage.COLLABORATION_STATEMENT__COLLABORATION:
        return getCollaboration();
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
      case BehaviourLanguagePackage.COLLABORATION_STATEMENT__COLLABORATION:
        getCollaboration().clear();
        getCollaboration().addAll((Collection<? extends RobotCollaboration>)newValue);
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
      case BehaviourLanguagePackage.COLLABORATION_STATEMENT__COLLABORATION:
        getCollaboration().clear();
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
      case BehaviourLanguagePackage.COLLABORATION_STATEMENT__COLLABORATION:
        return collaboration != null && !collaboration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CollaborationStatementImpl