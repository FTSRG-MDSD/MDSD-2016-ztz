/**
 */
package hu.bme.mdsd.ztz.model.drone.tests;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.Task;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Task#getEstimatedTime() <em>Estimated Time</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TaskTest extends NamedElementTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(TaskTest.class);
        }

        /**
         * Constructs a new Task test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public TaskTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Task test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected Task getFixture() {
                return (Task)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(DroneFactory.eINSTANCE.createTask());
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

        /**
         * Tests the '{@link hu.bme.mdsd.ztz.model.drone.Task#getEstimatedTime() <em>Estimated Time</em>}' feature getter.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.Task#getEstimatedTime()
         * @generated
         */
        public void testGetEstimatedTime() {
                // TODO: implement this feature getter test method
                // Ensure that you remove @generated or mark it @generated NOT
                fail();
        }

        /**
         * Tests the '{@link hu.bme.mdsd.ztz.model.drone.Task#isSetEstimatedTime() <em>isSetEstimatedTime()</em>}' method.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.Task#isSetEstimatedTime()
         * @generated
         */
        public void testIsSetEstimatedTime() {
                // TODO: implement this test method
                // Ensure that you remove @generated or mark it @generated NOT
                fail();
        }

} //TaskTest
