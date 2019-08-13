/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supportable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable#getSupportedBy <em>Supported By</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSupportable()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AcyclicSupporters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AcyclicSupporters='self.getDescendants() -&gt; excludes(self)'"
 * @generated
 */
public interface Supportable extends SafetyCaseElement {
	/**
	 * Returns the value of the '<em><b>Supported By</b></em>' reference list.
	 * The list contents are of type {@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter}.
	 * It is bidirectional and its opposite is '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported By</em>' reference list.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSupportable_SupportedBy()
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter#getSupports
	 * @model opposite="supports" required="true"
	 * @generated
	 */
	EList<Supporter> getSupportedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.supportedBy -&gt; closure(s | if s.oclIsKindOf(Supportable) then s.oclAsType(Supportable).supportedBy else s.oclAsSet() endif)'"
	 * @generated
	 */
	EList<Supporter> getDescendants();

} // Supportable
