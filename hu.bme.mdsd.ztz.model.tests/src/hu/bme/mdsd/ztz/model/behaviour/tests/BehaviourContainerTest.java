/**
 */
package hu.bme.mdsd.ztz.model.behaviour.tests;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourContainer;
import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourContainerTest extends TestCase {

        /**
         * The fixture for this Container test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BehaviourContainer fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(BehaviourContainerTest.class);
        }

        /**
         * Constructs a new Container test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BehaviourContainerTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this Container test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(BehaviourContainer fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this Container test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected BehaviourContainer getFixture() {
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
                setFixture(BehaviourFactory.eINSTANCE.createBehaviourContainer());
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

} //BehaviourContainerTest
