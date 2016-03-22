/**
 */
package hu.bme.mdsd.ztz.model.behaviour.tests;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.UnicastCommunication;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unicast Communication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnicastCommunicationTest extends CommunicationActionTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(UnicastCommunicationTest.class);
        }

        /**
         * Constructs a new Unicast Communication test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public UnicastCommunicationTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Unicast Communication test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected UnicastCommunication getFixture() {
                return (UnicastCommunication)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(BehaviourFactory.eINSTANCE.createUnicastCommunication());
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

} //UnicastCommunicationTest
