/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase.impl;

import edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Goal;
import edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Solution;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseImpl#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyCaseImpl extends MinimalEObjectImpl.Container implements SafetyCase {
	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicSafetyCasePackage.Literals.SAFETY_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, BasicSafetyCasePackage.SAFETY_CASE__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<Solution>(Solution.class, this,
					BasicSafetyCasePackage.SAFETY_CASE__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * The cached invocation delegate for the '{@link #addGoal(edu.toronto.cs.se.modelepedia.basicsafetycase.Goal) <em>Add Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #addGoal(edu.toronto.cs.se.modelepedia.basicsafetycase.Goal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ADD_GOAL_GOAL__EINVOCATION_DELEGATE = ((EOperation.Internal) BasicSafetyCasePackage.Literals.SAFETY_CASE
			.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addGoal(Goal g) {
		try {
			ADD_GOAL_GOAL__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { g }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #deleteGoal(edu.toronto.cs.se.modelepedia.basicsafetycase.Goal) <em>Delete Goal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deleteGoal(edu.toronto.cs.se.modelepedia.basicsafetycase.Goal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DELETE_GOAL_GOAL__EINVOCATION_DELEGATE = ((EOperation.Internal) BasicSafetyCasePackage.Literals.SAFETY_CASE
			.getEOperations().get(1)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void deleteGoal(Goal g) {
		try {
			DELETE_GOAL_GOAL__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { g }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #addSolution(edu.toronto.cs.se.modelepedia.basicsafetycase.Solution) <em>Add Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #addSolution(edu.toronto.cs.se.modelepedia.basicsafetycase.Solution)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ADD_SOLUTION_SOLUTION__EINVOCATION_DELEGATE = ((EOperation.Internal) BasicSafetyCasePackage.Literals.SAFETY_CASE
			.getEOperations().get(2)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addSolution(Solution s) {
		try {
			ADD_SOLUTION_SOLUTION__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { s }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #deleteSolution(edu.toronto.cs.se.modelepedia.basicsafetycase.Solution) <em>Delete Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deleteSolution(edu.toronto.cs.se.modelepedia.basicsafetycase.Solution)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DELETE_SOLUTION_SOLUTION__EINVOCATION_DELEGATE = ((EOperation.Internal) BasicSafetyCasePackage.Literals.SAFETY_CASE
			.getEOperations().get(3)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void deleteSolution(Solution s) {
		try {
			DELETE_SOLUTION_SOLUTION__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { s }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicSafetyCasePackage.SAFETY_CASE__GOALS:
			return ((InternalEList<?>) getGoals()).basicRemove(otherEnd, msgs);
		case BasicSafetyCasePackage.SAFETY_CASE__SOLUTIONS:
			return ((InternalEList<?>) getSolutions()).basicRemove(otherEnd, msgs);
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
		case BasicSafetyCasePackage.SAFETY_CASE__GOALS:
			return getGoals();
		case BasicSafetyCasePackage.SAFETY_CASE__SOLUTIONS:
			return getSolutions();
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
		case BasicSafetyCasePackage.SAFETY_CASE__GOALS:
			getGoals().clear();
			getGoals().addAll((Collection<? extends Goal>) newValue);
			return;
		case BasicSafetyCasePackage.SAFETY_CASE__SOLUTIONS:
			getSolutions().clear();
			getSolutions().addAll((Collection<? extends Solution>) newValue);
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
		case BasicSafetyCasePackage.SAFETY_CASE__GOALS:
			getGoals().clear();
			return;
		case BasicSafetyCasePackage.SAFETY_CASE__SOLUTIONS:
			getSolutions().clear();
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
		case BasicSafetyCasePackage.SAFETY_CASE__GOALS:
			return goals != null && !goals.isEmpty();
		case BasicSafetyCasePackage.SAFETY_CASE__SOLUTIONS:
			return solutions != null && !solutions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SafetyCaseImpl
