/**
 */
package behaviourModel.tests;

import behaviourModel.BehaviourModelFactory;
import behaviourModel.Broadcast;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Broadcast</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BroadcastTest extends CommunicationActionTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(BroadcastTest.class);
        }

        /**
         * Constructs a new Broadcast test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BroadcastTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Broadcast test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected Broadcast getFixture() {
                return (Broadcast)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(BehaviourModelFactory.eINSTANCE.createBroadcast());
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

} //BroadcastTest
