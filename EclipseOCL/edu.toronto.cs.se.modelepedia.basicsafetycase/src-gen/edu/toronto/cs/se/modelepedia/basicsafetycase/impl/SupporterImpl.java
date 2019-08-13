/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase.impl;

import edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
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
 * An implementation of the model object '<em><b>Supporter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupporterImpl#getSupports <em>Supports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SupporterImpl extends SafetyCaseElementImpl implements Supporter {
	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<Supportable> supports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupporterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicSafetyCasePackage.Literals.SUPPORTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Supportable> getSupports() {
		if (supports == null) {
			supports = new EObjectWithInverseResolvingEList.ManyInverse<Supportable>(Supportable.class, this,
					BasicSafetyCasePackage.SUPPORTER__SUPPORTS, BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY);
		}
		return supports;
	}

	/**
	 * The cached invocation delegate for the '{@link #getNumAncestors() <em>Get Num Ancestors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumAncestors()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NUM_ANCESTORS__EINVOCATION_DELEGATE = ((EOperation.Internal) BasicSafetyCasePackage.Literals.SUPPORTER
			.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getNumAncestors() {
		try {
			return (BigInteger) GET_NUM_ANCESTORS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
		case BasicSafetyCasePackage.SUPPORTER__SUPPORTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSupports()).basicAdd(otherEnd, msgs);
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
		case BasicSafetyCasePackage.SUPPORTER__SUPPORTS:
			return ((InternalEList<?>) getSupports()).basicRemove(otherEnd, msgs);
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
		case BasicSafetyCasePackage.SUPPORTER__SUPPORTS:
			return getSupports();
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
		case BasicSafetyCasePackage.SUPPORTER__SUPPORTS:
			getSupports().clear();
			getSupports().addAll((Collection<? extends Supportable>) newValue);
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
		case BasicSafetyCasePackage.SUPPORTER__SUPPORTS:
			getSupports().clear();
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
		case BasicSafetyCasePackage.SUPPORTER__SUPPORTS:
			return supports != null && !supports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupporterImpl
