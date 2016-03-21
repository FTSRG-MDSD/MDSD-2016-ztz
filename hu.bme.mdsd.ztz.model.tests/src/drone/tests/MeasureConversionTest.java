/**
 */
package drone.tests;

import drone.DroneFactory;
import drone.MeasureConversion;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure Conversion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureConversionTest extends TestCase {

        /**
         * The fixture for this Measure Conversion test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MeasureConversion fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(MeasureConversionTest.class);
        }

        /**
         * Constructs a new Measure Conversion test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureConversionTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this Measure Conversion test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(MeasureConversion fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this Measure Conversion test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected MeasureConversion getFixture() {
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
                setFixture(DroneFactory.eINSTANCE.createMeasureConversion());
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

} //MeasureConversionTest
