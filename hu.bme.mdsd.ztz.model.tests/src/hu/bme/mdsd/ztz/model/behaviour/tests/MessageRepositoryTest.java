/**
 */
package hu.bme.mdsd.ztz.model.behaviour.tests;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.MessageRepository;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Message Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageRepositoryTest extends TestCase {

        /**
         * The fixture for this Message Repository test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MessageRepository fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(MessageRepositoryTest.class);
        }

        /**
         * Constructs a new Message Repository test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MessageRepositoryTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this Message Repository test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(MessageRepository fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this Message Repository test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MessageRepository getFixture() {
                return fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(BehaviourFactory.eINSTANCE.createMessageRepository());
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

} //MessageRepositoryTest
