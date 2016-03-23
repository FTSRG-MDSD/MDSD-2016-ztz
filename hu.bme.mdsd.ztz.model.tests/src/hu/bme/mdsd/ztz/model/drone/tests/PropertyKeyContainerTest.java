/**
 */
package hu.bme.mdsd.ztz.model.drone.tests;

import hu.bme.mdsd.ztz.model.drone.DroneFactory;
import hu.bme.mdsd.ztz.model.drone.PropertyKeyContainer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Key Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyKeyContainerTest extends NamedElementTest {

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(PropertyKeyContainerTest.class);
        }

        /**
         * Constructs a new Property Key Container test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public PropertyKeyContainerTest(String name) {
                super(name);
        }

        /**
         * Returns the fixture for this Property Key Container test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected PropertyKeyContainer getFixture() {
                return (PropertyKeyContainer)fixture;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see junit.framework.TestCase#setUp()
         * @generated
         */
        @Override
        protected void setUp() throws Exception {
                setFixture(DroneFactory.eINSTANCE.createPropertyKeyContainer());
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

} //PropertyKeyContainerTest
