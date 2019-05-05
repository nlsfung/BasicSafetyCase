/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase#getGoals <em>Goals</em>}</li>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSafetyCase()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SingleRoot'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SingleRoot='self.goals -&gt; union(self.solutions) -&gt; select(elem | elem.supports -&gt; size() = 0) -&gt; size() = 1'"
 * @generated
 */
public interface SafetyCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.se.modelepedia.basicsafetycase.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSafetyCase_Goals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.toronto.cs.se.modelepedia.basicsafetycase.Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSafetyCase_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolutions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot post='self.goals -&gt; includes(g)'"
	 * @generated
	 */
	void addGoal(Goal g);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot pre='self.goals -&gt; includes(g)' post='self.goals -&gt; excludes(g)'"
	 * @generated
	 */
	void deleteGoal(Goal g);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot post='self.solutions -&gt; includes(s)'"
	 * @generated
	 */
	void addSolution(Solution s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot pre='self.solutions -&gt; includes(s)' post='self.solutions -&gt; excludes(s)'"
	 * @generated
	 */
	void deleteSolution(Solution s);

} // SafetyCase
