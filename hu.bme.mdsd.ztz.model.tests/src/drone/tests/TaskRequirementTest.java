/**
 */
package drone.tests;

import drone.DroneFactory;
import drone.TaskRequirement;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskRequirementTest extends TestCase {

        /**
         * The fixture for this Task Requirement test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskRequirement fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(TaskRequirementTest.class);
        }

        /**
         * Constructs a new Task Requirement test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskRequirementTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this Task Requirement test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(TaskRequirement fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this Task Requirement test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskRequirement getFixture() {
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
                setFixture(DroneFactory.eINSTANCE.createTaskRequirement());
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

} //TaskRequirementTest
