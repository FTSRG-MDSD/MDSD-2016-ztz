/**
 */
package hu.bme.mdsd.ztz.model.behaviourModel.tests;

import hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelFactory;
import hu.bme.mdsd.ztz.model.behaviourModel.CommunicationAction;

import hu.bme.mdsd.ztz.model.drone.tests.ActionTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationActionTest extends ActionTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(CommunicationActionTest.class);
        }

        /**
         * Constructs a new Communication Action test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public CommunicationActionTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Communication Action test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected CommunicationAction getFixture() {
                return (CommunicationAction)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(BehaviourModelFactory.eINSTANCE.createCommunicationAction());
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#tearDown()
         * @generated
         */
        @Override
        protected void tearDown() throws Exception {
                setFixture(null);
        }

} //CommunicationActionTest
