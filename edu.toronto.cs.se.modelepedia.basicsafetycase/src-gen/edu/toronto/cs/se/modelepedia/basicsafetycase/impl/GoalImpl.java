/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase.impl;

import edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Goal;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.GoalImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.GoalImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends SupportableImpl implements Goal {
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
	 * The cached setting delegate for the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate COUNT__ESETTING_DELEGATE = ((EStructuralFeature.Internal) BasicSafetyCasePackage.Literals.GOAL__COUNT)
			.getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicSafetyCasePackage.Literals.GOAL;
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
					BasicSafetyCasePackage.GOAL__SUPPORTS, BasicSafetyCasePackage.SUPPORTABLE__SUPPORTED_BY);
		}
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCount() {
		return (BigInteger) COUNT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(BigInteger newCount) {
		COUNT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCount);
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
		case BasicSafetyCasePackage.GOAL__SUPPORTS:
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
		case BasicSafetyCasePackage.GOAL__SUPPORTS:
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
		case BasicSafetyCasePackage.GOAL__SUPPORTS:
			return getSupports();
		case BasicSafetyCasePackage.GOAL__COUNT:
			return getCount();
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
		case BasicSafetyCasePackage.GOAL__SUPPORTS:
			getSupports().clear();
			getSupports().addAll((Collection<? extends Supportable>) newValue);
			return;
		case BasicSafetyCasePackage.GOAL__COUNT:
			setCount((BigInteger) newValue);
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
		case BasicSafetyCasePackage.GOAL__SUPPORTS:
			getSupports().clear();
			return;
		case BasicSafetyCasePackage.GOAL__COUNT:
			COUNT__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
		case BasicSafetyCasePackage.GOAL__SUPPORTS:
			return supports != null && !supports.isEmpty();
		case BasicSafetyCasePackage.GOAL__COUNT:
			return COUNT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Supporter.class) {
			switch (derivedFeatureID) {
			case BasicSafetyCasePackage.GOAL__SUPPORTS:
				return BasicSafetyCasePackage.SUPPORTER__SUPPORTS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Supporter.class) {
			switch (baseFeatureID) {
			case BasicSafetyCasePackage.SUPPORTER__SUPPORTS:
				return BasicSafetyCasePackage.GOAL__SUPPORTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GoalImpl
