/**
 */
package drone.impl;

import drone.DronePackage;
import drone.MeasureValue;
import drone.Size;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link drone.impl.SizeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link drone.impl.SizeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link drone.impl.SizeImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SizeImpl extends MinimalEObjectImpl.Container implements Size {
        /**
         * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getWidth()
         * @generated
         * @ordered
         */
        protected MeasureValue width;

        /**
         * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getHeight()
         * @generated
         * @ordered
         */
        protected MeasureValue height;

        /**
         * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getLength()
         * @generated
         * @ordered
         */
        protected MeasureValue length;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SizeImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return DronePackage.Literals.SIZE;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getWidth() {
                return width;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetWidth(MeasureValue newWidth, NotificationChain msgs) {
                MeasureValue oldWidth = width;
                width = newWidth;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__WIDTH, oldWidth, newWidth);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setWidth(MeasureValue newWidth) {
                if (newWidth != width) {
                        NotificationChain msgs = null;
                        if (width != null)
                                msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.SIZE__WIDTH, null, msgs);
                        if (newWidth != null)
                                msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.SIZE__WIDTH, null, msgs);
                        msgs = basicSetWidth(newWidth, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__WIDTH, newWidth, newWidth));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getHeight() {
                return height;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetHeight(MeasureValue newHeight, NotificationChain msgs) {
                MeasureValue oldHeight = height;
                height = newHeight;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__HEIGHT, oldHeight, newHeight);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setHeight(MeasureValue newHeight) {
                if (newHeight != height) {
                        NotificationChain msgs = null;
                        if (height != null)
                                msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.SIZE__HEIGHT, null, msgs);
                        if (newHeight != null)
                                msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.SIZE__HEIGHT, null, msgs);
                        msgs = basicSetHeight(newHeight, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__HEIGHT, newHeight, newHeight));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public MeasureValue getLength() {
                return length;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NotificationChain basicSetLength(MeasureValue newLength, NotificationChain msgs) {
                MeasureValue oldLength = length;
                length = newLength;
                if (eNotificationRequired()) {
                        ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__LENGTH, oldLength, newLength);
                        if (msgs == null) msgs = notification; else msgs.add(notification);
                }
                return msgs;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setLength(MeasureValue newLength) {
                if (newLength != length) {
                        NotificationChain msgs = null;
                        if (length != null)
                                msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DronePackage.SIZE__LENGTH, null, msgs);
                        if (newLength != null)
                                msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DronePackage.SIZE__LENGTH, null, msgs);
                        msgs = basicSetLength(newLength, msgs);
                        if (msgs != null) msgs.dispatch();
                }
                else if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.SIZE__LENGTH, newLength, newLength));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
                switch (featureID) {
                        case DronePackage.SIZE__WIDTH:
                                return basicSetWidth(null, msgs);
                        case DronePackage.SIZE__HEIGHT:
                                return basicSetHeight(null, msgs);
                        case DronePackage.SIZE__LENGTH:
                                return basicSetLength(null, msgs);
                }
                return super.eInverseRemove(otherEnd, featureID, msgs);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case DronePackage.SIZE__WIDTH:
                                return getWidth();
                        case DronePackage.SIZE__HEIGHT:
                                return getHeight();
                        case DronePackage.SIZE__LENGTH:
                                return getLength();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case DronePackage.SIZE__WIDTH:
                                setWidth((MeasureValue)newValue);
                                return;
                        case DronePackage.SIZE__HEIGHT:
                                setHeight((MeasureValue)newValue);
                                return;
                        case DronePackage.SIZE__LENGTH:
                                setLength((MeasureValue)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case DronePackage.SIZE__WIDTH:
                                setWidth((MeasureValue)null);
                                return;
                        case DronePackage.SIZE__HEIGHT:
                                setHeight((MeasureValue)null);
                                return;
                        case DronePackage.SIZE__LENGTH:
                                setLength((MeasureValue)null);
                                return;
                }
                super.eUnset(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case DronePackage.SIZE__WIDTH:
                                return width != null;
                        case DronePackage.SIZE__HEIGHT:
                                return height != null;
                        case DronePackage.SIZE__LENGTH:
                                return length != null;
                }
                return super.eIsSet(featureID);
        }

} //SizeImpl
