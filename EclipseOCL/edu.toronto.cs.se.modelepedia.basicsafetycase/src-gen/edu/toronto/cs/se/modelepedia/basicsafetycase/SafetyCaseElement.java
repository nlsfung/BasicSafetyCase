/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Case Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getId <em>Id</em>}</li>
 *   <li>{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSafetyCaseElement()
 * @model abstract="true"
 * @generated
 */
public interface SafetyCaseElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSafetyCaseElement_Id()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='if self.oclIsTypeOf(Goal) then \'G\'.concat(self.oclAsType(Goal).count.toString()) else \'Sn\'.concat(self.oclAsType(Solution).count.toString()) endif'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#getSafetyCaseElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SafetyCaseElement
