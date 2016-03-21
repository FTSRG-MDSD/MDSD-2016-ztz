/**
 */
package hu.bme.mdsd.ztz.model.drone.tests;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.MeasureDimension;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Measure Dimension</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureDimensionTest extends NamedElementTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(MeasureDimensionTest.class);
        }

        /**
         * Constructs a new Measure Dimension test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureDimensionTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Measure Dimension test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected MeasureDimension getFixture() {
                return (MeasureDimension)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(DroneFactory.eINSTANCE.createMeasureDimension());
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

} //MeasureDimensionTest
