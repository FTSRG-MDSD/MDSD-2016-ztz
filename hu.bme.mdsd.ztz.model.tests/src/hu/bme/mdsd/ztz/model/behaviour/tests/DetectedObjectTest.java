/**
 */
package hu.bme.mdsd.ztz.model.behaviour.tests;

import hu.bme.mdsd.ztz.model.behaviour.BehaviourFactory;
import hu.bme.mdsd.ztz.model.behaviour.DetectedObject;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Detected Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetectedObjectTest extends TestCase {

        /**
         * The fixture for this Detected Object test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DetectedObject fixture = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static void main(String[] args) {
                TestRunner.run(DetectedObjectTest.class);
        }

        /**
         * Constructs a new Detected Object test case with the given name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public DetectedObjectTest(String name) {
                super(name);
        }

        /**
         * Sets the fixture for this Detected Object test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected void setFixture(DetectedObject fixture) {
                this.fixture = fixture;
        }

        /**
         * Returns the fixture for this Detected Object test case.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected DetectedObject getFixture() {
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
                setFixture(BehaviourFactory.eINSTANCE.createDetectedObject());
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

} //DetectedObjectTest
