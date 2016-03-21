/**
 */
package hu.bme.mdsd.ztz.model.behaviourModel.tests;

import hu.bme.mdsd.ztz.model.behaviourModel.BehaviourModelFactory;
import hu.bme.mdsd.ztz.model.behaviourModel.Multicast;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multicast</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MulticastTest extends CommunicationActionTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(MulticastTest.class);
        }

        /**
         * Constructs a new Multicast test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MulticastTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Multicast test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected Multicast getFixture() {
                return (Multicast)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(BehaviourModelFactory.eINSTANCE.createMulticast());
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

} //MulticastTest
