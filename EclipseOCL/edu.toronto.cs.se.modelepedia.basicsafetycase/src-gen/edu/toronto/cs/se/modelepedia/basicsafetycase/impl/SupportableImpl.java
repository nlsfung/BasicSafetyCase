/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase.impl;

import edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supportable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupportableImpl#getSupportedBy <em>Supported By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SupportableImpl extends SafetyCaseElementImpl implements Supportable {
	/**
	 * The cached value of the '{@link #getSupportedBy() <em>Supported By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Supporter> supportedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicSafetyCasePackage.Literals.SUPPORTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Supporter> getSupportedBy() {
		if (supportedBy == null) {
			supportedBy = new EObjectWithInverseResolvingEList.ManyInverse<Supporter>(Supporter.class, this,
					BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY, BasicSafetyCasePackage.SUPPORTER__SUPPORTS);
		}
		return supportedBy;
	}

	/**
	 * The cached invocation delegate for the '{@link #getDescendants() <em>Get Descendants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescendants()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_DESCENDANTS__EINVOCATION_DELEGATE = ((EOperation.Internal) BasicSafetyCasePackage.Literals.SUPPORTABLE
			.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Supporter> getDescendants() {
		try {
			return (EList<Supporter>) GET_DESCENDANTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSupportedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY:
			return ((InternalEList<?>) getSupportedBy()).basicRemove(otherEnd, msgs);
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
		case BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY:
			return getSupportedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY:
			getSupportedBy().clear();
			getSupportedBy().addAll((Collection<? extends Supporter>) newValue);
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
		case BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY:
			getSupportedBy().clear();
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
		case BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY:
			return supportedBy != null && !supportedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupportableImpl
