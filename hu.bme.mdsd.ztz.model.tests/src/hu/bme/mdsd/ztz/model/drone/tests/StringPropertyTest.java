/**
 */
package hu.bme.mdsd.ztz.model.drone.tests;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.StringProperty;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringPropertyTest extends TestCase {

        /**
         * The fixture for this String Property test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected StringProperty fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(StringPropertyTest.class);
        }

        /**
         * Constructs a new String Property test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public StringPropertyTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this String Property test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(StringProperty fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this String Property test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected StringProperty getFixture() {
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
                setFixture(DroneFactory.eINSTANCE.createStringProperty());
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

} //StringPropertyTest
