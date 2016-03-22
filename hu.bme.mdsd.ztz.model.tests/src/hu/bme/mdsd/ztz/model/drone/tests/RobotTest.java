/**
 */
package hu.bme.mdsd.ztz.model.drone.tests;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.Robot;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link hu.bme.mdsd.ztz.model.drone.Robot#getMission() <em>Mission</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RobotTest extends NamedElementTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(RobotTest.class);
        }

        /**
         * Constructs a new Robot test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Robot test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected Robot getFixture() {
                return (Robot)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(DroneFactory.eINSTANCE.createRobot());
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
         * Tests the '{@link hu.bme.mdsd.ztz.model.drone.Robot#getMission() <em>Mission</em>}' feature getter.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.Robot#getMission()
         * @generated
         */
        public void testGetMission() {
                // TODO: implement this feature getter test method
                // Ensure that you remove @generated or mark it @generated NOT
                fail();
        }

        /**
         * Tests the '{@link hu.bme.mdsd.ztz.model.drone.Robot#isSetMission() <em>isSetMission()</em>}' method.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.bme.mdsd.ztz.model.drone.Robot#isSetMission()
         * @generated
         */
        public void testIsSetMission() {
                // TODO: implement this test method
                // Ensure that you remove @generated or mark it @generated NOT
                fail();
        }

} //RobotTest
