/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Goal#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Supportable, Supporter {

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(BigInteger)
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getGoal_Count()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='Goal.allInstances() -&gt; size()'"
	 * @generated
	 */
	BigInteger getCount();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Goal#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(BigInteger value);
} // Goal
