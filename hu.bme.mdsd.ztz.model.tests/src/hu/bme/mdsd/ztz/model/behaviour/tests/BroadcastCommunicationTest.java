/**
 */
package hu.bme.mdsd.ztz.model.behaviour.tests;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.BroadcastCommunication;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Broadcast Communication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BroadcastCommunicationTest extends CommunicationActionTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(BroadcastCommunicationTest.class);
        }

        /**
         * Constructs a new Broadcast Communication test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BroadcastCommunicationTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Broadcast Communication test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected BroadcastCommunication getFixture() {
                return (BroadcastCommunication)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(BehaviourFactory.eINSTANCE.createBroadcastCommunication());
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

} //BroadcastCommunicationTest
