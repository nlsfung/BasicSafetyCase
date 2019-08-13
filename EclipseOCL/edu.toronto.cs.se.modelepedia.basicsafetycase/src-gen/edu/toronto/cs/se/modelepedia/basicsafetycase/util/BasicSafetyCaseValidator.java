/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase.util;

import edu.toronto.cs.se.modelepedia.basicsafetycase.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage
 * @generated
 */
public class BasicSafetyCaseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasicSafetyCaseValidator INSTANCE = new BasicSafetyCaseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.toronto.cs.se.modelepedia.basicsafetycase";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSafetyCaseValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return BasicSafetyCasePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case BasicSafetyCasePackage.SAFETY_CASE:
			return validateSafetyCase((SafetyCase) value, diagnostics, context);
		case BasicSafetyCasePackage.GOAL:
			return validateGoal((Goal) value, diagnostics, context);
		case BasicSafetyCasePackage.SOLUTION:
			return validateSolution((Solution) value, diagnostics, context);
		case BasicSafetyCasePackage.SAFETY_CASE_ELEMENT:
			return validateSafetyCaseElement((SafetyCaseElement) value, diagnostics, context);
		case BasicSafetyCasePackage.SUPPORTABLE:
			return validateSupportable((Supportable) value, diagnostics, context);
		case BasicSafetyCasePackage.SUPPORTER:
			return validateSupporter((Supporter) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafetyCase(SafetyCase safetyCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(safetyCase, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(safetyCase, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSafetyCase_SingleRoot(safetyCase, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SingleRoot constraint of '<em>Safety Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SAFETY_CASE__SINGLE_ROOT__EEXPRESSION = "self.goals -> union(self.solutions) -> select(elem | elem.supports -> size() = 0) -> size() = 1";

	/**
	 * Validates the SingleRoot constraint of '<em>Safety Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafetyCase_SingleRoot(SafetyCase safetyCase, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(BasicSafetyCasePackage.Literals.SAFETY_CASE, safetyCase, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SingleRoot", SAFETY_CASE__SINGLE_ROOT__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goal, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(goal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSupportable_AcyclicSupporters(goal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolution(Solution solution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafetyCaseElement(SafetyCaseElement safetyCaseElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(safetyCaseElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportable(Supportable supportable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(supportable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSupportable_AcyclicSupporters(supportable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AcyclicSupporters constraint of '<em>Supportable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUPPORTABLE__ACYCLIC_SUPPORTERS__EEXPRESSION = "self.getDescendants() -> excludes(self)";

	/**
	 * Validates the AcyclicSupporters constraint of '<em>Supportable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportable_AcyclicSupporters(Supportable supportable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(BasicSafetyCasePackage.Literals.SUPPORTABLE, supportable, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AcyclicSupporters",
				SUPPORTABLE__ACYCLIC_SUPPORTERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupporter(Supporter supporter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supporter, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BasicSafetyCaseValidator
