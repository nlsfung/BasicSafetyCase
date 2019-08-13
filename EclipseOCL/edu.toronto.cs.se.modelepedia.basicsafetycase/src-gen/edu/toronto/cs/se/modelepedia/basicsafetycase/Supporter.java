/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase;

import java.math.BigInteger;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter#getSupports <em>Supports</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSupporter()
 * @model abstract="true"
 * @generated
 */
public interface Supporter extends SafetyCaseElement {
	/**
	 * Returns the value of the '<em><b>Supports</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' reference list.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSupporter_Supports()
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable#getSupportedBy
	 * @model opposite="supportedBy"
	 * @generated
	 */
	EList<Supportable> getSupports();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.supports -&gt; closure(s | if s.oclIsKindOf(Supporter) then s.oclAsType(Supporter).supports else s.oclAsSet() endif) -&gt; size()'"
	 * @generated
	 */
	BigInteger getNumAncestors();

} // Supporter
