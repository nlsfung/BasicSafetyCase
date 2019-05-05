/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCaseFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface BasicSafetyCasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basicsafetycase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.cs.toronto.edu/modelepedia/BasicSafetyCase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicsafetycase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicSafetyCasePackage eINSTANCE = edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseImpl <em>Safety Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseImpl
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSafetyCase()
	 * @generated
	 */
	int SAFETY_CASE = 0;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__GOALS = 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE__SOLUTIONS = 1;

	/**
	 * The number of structural features of the '<em>Safety Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseElementImpl <em>Safety Case Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseElementImpl
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSafetyCaseElement()
	 * @generated
	 */
	int SAFETY_CASE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Safety Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CASE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupportableImpl <em>Supportable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupportableImpl
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSupportable()
	 * @generated
	 */
	int SUPPORTABLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTABLE__ID = SAFETY_CASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTABLE__DESCRIPTION = SAFETY_CASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTABLE__SUPPORTED_BY = SAFETY_CASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Supportable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTABLE_FEATURE_COUNT = SAFETY_CASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.GoalImpl
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = SUPPORTABLE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = SUPPORTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUPPORTED_BY = SUPPORTABLE__SUPPORTED_BY;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUPPORTS = SUPPORTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__COUNT = SUPPORTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = SUPPORTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupporterImpl <em>Supporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupporterImpl
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSupporter()
	 * @generated
	 */
	int SUPPORTER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTER__ID = SAFETY_CASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTER__DESCRIPTION = SAFETY_CASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTER__SUPPORTS = SAFETY_CASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Supporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTER_FEATURE_COUNT = SAFETY_CASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SolutionImpl
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ID = SUPPORTER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = SUPPORTER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SUPPORTS = SUPPORTER__SUPPORTS;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__COUNT = SUPPORTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = SUPPORTER_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase <em>Safety Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Case</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase
	 * @generated
	 */
	EClass getSafetyCase();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase#getGoals()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase#getSolutions()
	 * @see #getSafetyCase()
	 * @generated
	 */
	EReference getSafetyCase_Solutions();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Goal#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Goal#getCount()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Count();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Solution#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Solution#getCount()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Count();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement <em>Safety Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Case Element</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement
	 * @generated
	 */
	EClass getSafetyCaseElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getId()
	 * @see #getSafetyCaseElement()
	 * @generated
	 */
	EAttribute getSafetyCaseElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement#getDescription()
	 * @see #getSafetyCaseElement()
	 * @generated
	 */
	EAttribute getSafetyCaseElement_Description();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable <em>Supportable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supportable</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable
	 * @generated
	 */
	EClass getSupportable();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported By</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable#getSupportedBy()
	 * @see #getSupportable()
	 * @generated
	 */
	EReference getSupportable_SupportedBy();

	/**
	 * Returns the meta object for class '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter <em>Supporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supporter</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter
	 * @generated
	 */
	EClass getSupporter();

	/**
	 * Returns the meta object for the reference list '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports</em>'.
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter#getSupports()
	 * @see #getSupporter()
	 * @generated
	 */
	EReference getSupporter_Supports();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicSafetyCaseFactory getBasicSafetyCaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseImpl <em>Safety Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseImpl
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSafetyCase()
		 * @generated
		 */
		EClass SAFETY_CASE = eINSTANCE.getSafetyCase();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__GOALS = eINSTANCE.getSafetyCase_Goals();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CASE__SOLUTIONS = eINSTANCE.getSafetyCase_Solutions();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.GoalImpl
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__COUNT = eINSTANCE.getGoal_Count();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SolutionImpl
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__COUNT = eINSTANCE.getSolution_Count();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseElementImpl <em>Safety Case Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SafetyCaseElementImpl
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSafetyCaseElement()
		 * @generated
		 */
		EClass SAFETY_CASE_ELEMENT = eINSTANCE.getSafetyCaseElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CASE_ELEMENT__ID = eINSTANCE.getSafetyCaseElement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CASE_ELEMENT__DESCRIPTION = eINSTANCE.getSafetyCaseElement_Description();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupportableImpl <em>Supportable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupportableImpl
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSupportable()
		 * @generated
		 */
		EClass SUPPORTABLE = eINSTANCE.getSupportable();

		/**
		 * The meta object literal for the '<em><b>Supported By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTABLE__SUPPORTED_BY = eINSTANCE.getSupportable_SupportedBy();

		/**
		 * The meta object literal for the '{@link edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupporterImpl <em>Supporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.SupporterImpl
		 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.impl.BasicSafetyCasePackageImpl#getSupporter()
		 * @generated
		 */
		EClass SUPPORTER = eINSTANCE.getSupporter();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTER__SUPPORTS = eINSTANCE.getSupporter_Supports();

	}

} //BasicSafetyCasePackage
