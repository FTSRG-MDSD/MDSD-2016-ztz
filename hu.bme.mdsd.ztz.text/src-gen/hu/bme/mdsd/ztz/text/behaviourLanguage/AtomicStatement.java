/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mdsd.ztz.text.behaviourLanguage;

import hu.bme.mdsd.ztz.model.behaviour.DynamicRobot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement#getRobot <em>Robot</em>}</li>
 * </ul>
 *
 * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getAtomicStatement()
 * @model
 * @generated
 */
public interface AtomicStatement extends Statement
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
   * @see hu.bme.mdsd.ztz.text.behaviourLanguage.BehaviourLanguagePackage#getAtomicStatement_Robot()
   * @model
   * @generated
   */
  DynamicRobot getRobot();

  /**
   * Sets the value of the '{@link hu.bme.mdsd.ztz.text.behaviourLanguage.AtomicStatement#getRobot <em>Robot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Robot</em>' reference.
   * @see #getRobot()
   * @generated
   */
  void setRobot(DynamicRobot value);

} // AtomicStatement