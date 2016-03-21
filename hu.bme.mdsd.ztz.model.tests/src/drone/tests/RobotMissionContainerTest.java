/**
 */
package drone.tests;

import drone.DroneFactory;
import drone.RobotMissionContainer;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Robot Mission Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotMissionContainerTest extends TestCase {

        /**
         * The fixture for this Robot Mission Container test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected RobotMissionContainer fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(RobotMissionContainerTest.class);
        }

        /**
         * Constructs a new Robot Mission Container test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public RobotMissionContainerTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this Robot Mission Container test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(RobotMissionContainer fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this Robot Mission Container test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected RobotMissionContainer getFixture() {
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
                setFixture(DroneFactory.eINSTANCE.createRobotMissionContainer());
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

} //RobotMissionContainerTest
