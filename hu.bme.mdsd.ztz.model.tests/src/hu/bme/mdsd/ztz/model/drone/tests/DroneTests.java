/**
 */
package hu.bme.mdsd.ztz.model.drone.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>drone</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroneTests extends TestSuite {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(suite());
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static Test suite() {
                TestSuite suite = new DroneTests("drone Tests");
                suite.addTestSuite(RobotTest.class);
                return suite;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DroneTests(String name) {
                super(name);
        }

} //DroneTests
