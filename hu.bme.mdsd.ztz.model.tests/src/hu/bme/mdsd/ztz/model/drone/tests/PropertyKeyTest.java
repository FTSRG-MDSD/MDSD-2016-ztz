/**
 */
package hu.bme.mdsd.ztz.model.drone.tests;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.PropertyKey;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyKeyTest extends NamedElementTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(PropertyKeyTest.class);
        }

        /**
         * Constructs a new Property Key test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public PropertyKeyTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Property Key test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected PropertyKey getFixture() {
                return (PropertyKey)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(DroneFactory.eINSTANCE.createPropertyKey());
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

} //PropertyKeyTest
