/**
 */
package drone.tests;

import drone.DroneFactory;
import drone.TaskDescriptor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDescriptorTest extends TestCase {

        /**
         * The fixture for this Task Descriptor test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskDescriptor fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(TaskDescriptorTest.class);
        }

        /**
         * Constructs a new Task Descriptor test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskDescriptorTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this Task Descriptor test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(TaskDescriptor fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this Task Descriptor test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected TaskDescriptor getFixture() {
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
                setFixture(DroneFactory.eINSTANCE.createTaskDescriptor());
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

} //TaskDescriptorTest
