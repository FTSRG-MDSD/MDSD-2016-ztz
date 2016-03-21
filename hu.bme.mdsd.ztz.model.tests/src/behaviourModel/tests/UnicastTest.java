/**
 */
package behaviourModel.tests;

import behaviourModel.BehaviourModelFactory;
import behaviourModel.Unicast;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unicast</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnicastTest extends CommunicationActionTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(UnicastTest.class);
        }

        /**
         * Constructs a new Unicast test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public UnicastTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Unicast test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected Unicast getFixture() {
                return (Unicast)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(BehaviourModelFactory.eINSTANCE.createUnicast());
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

} //UnicastTest
