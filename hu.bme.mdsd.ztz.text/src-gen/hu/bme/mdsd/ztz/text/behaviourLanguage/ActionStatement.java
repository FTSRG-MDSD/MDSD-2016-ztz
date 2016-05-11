/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement#getRobot <em>Robot</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement#getAction <em>Action</em>}</li>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement#getMoreactions <em>Moreactions</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getActionStatement()
 * @model
 * @generated
 */
public interface ActionStatement extends AtomicStatement
{
  /**
   * Returns the value of the '<em><b>Robot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Robot</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Robot</em>' reference.
   * @see #setRobot(DynamicRobot)
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getActionStatement_Robot()
   * @model
   * @generated
   */
  DynamicRobot getRobot();

  /**
   * Sets the value of the '{@link hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement#getRobot <em>Robot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Robot</em>' reference.
   * @see #getRobot()
   * @generated
   */
  void setRobot(DynamicRobot value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(ActionImplementation)
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getActionStatement_Action()
   * @model containment="true"
   * @generated
   */
  ActionImplementation getAction();

  /**
   * Sets the value of the '{@link hu.bme.mdsd.ztz.text.behaviourLanguage.ActionStatement#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ActionImplementation value);

  /**
   * Returns the value of the '<em><b>Moreactions</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mdsd.ztz.text.behaviourLanguage.ActionImplementation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moreactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moreactions</em>' containment reference list.
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getActionStatement_Moreactions()
   * @model containment="true"
   * @generated
   */
  EList<ActionImplementation> getMoreactions();

} // ActionStatement
