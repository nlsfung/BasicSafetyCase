/**
 */
package edu.toronto.cs.se.modelepedia.basicsafetycase.impl;

import edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCaseFactory;
import edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Goal;
import edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCase;
import edu.toronto.cs.se.modelepedia.basicsafetycase.SafetyCaseElement;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Solution;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supportable;
import edu.toronto.cs.se.modelepedia.basicsafetycase.Supporter;

import edu.toronto.cs.se.modelepedia.basicsafetycase.util.BasicSafetyCaseValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicSafetyCasePackageImpl extends EPackageImpl implements BasicSafetyCasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyCaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supporterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.toronto.cs.se.modelepedia.basicsafetycase.BasicSafetyCasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicSafetyCasePackageImpl() {
		super(eNS_URI, BasicSafetyCaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasicSafetyCasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicSafetyCasePackage init() {
		if (isInited)
			return (BasicSafetyCasePackage) EPackage.Registry.INSTANCE.getEPackage(BasicSafetyCasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasicSafetyCasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasicSafetyCasePackageImpl theBasicSafetyCasePackage = registeredBasicSafetyCasePackage instanceof BasicSafetyCasePackageImpl
				? (BasicSafetyCasePackageImpl) registeredBasicSafetyCasePackage
				: new BasicSafetyCasePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBasicSafetyCasePackage.createPackageContents();

		// Initialize created meta-data
		theBasicSafetyCasePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theBasicSafetyCasePackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return BasicSafetyCaseValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theBasicSafetyCasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicSafetyCasePackage.eNS_URI, theBasicSafetyCasePackage);
		return theBasicSafetyCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyCase() {
		return safetyCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyCase_Goals() {
		return (EReference) safetyCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyCase_Solutions() {
		return (EReference) safetyCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoal_Count() {
		return (EAttribute) goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolution_Count() {
		return (EAttribute) solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyCaseElement() {
		return safetyCaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyCaseElement_Id() {
		return (EAttribute) safetyCaseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyCaseElement_Description() {
		return (EAttribute) safetyCaseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportable() {
		return supportableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportable_SupportedBy() {
		return (EReference) supportableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupporter() {
		return supporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupporter_Supports() {
		return (EReference) supporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicSafetyCaseFactory getBasicSafetyCaseFactory() {
		return (BasicSafetyCaseFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		safetyCaseEClass = createEClass(SAFETY_CASE);
		createEReference(safetyCaseEClass, SAFETY_CASE__GOALS);
		createEReference(safetyCaseEClass, SAFETY_CASE__SOLUTIONS);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__COUNT);

		solutionEClass = createEClass(SOLUTION);
		createEAttribute(solutionEClass, SOLUTION__COUNT);

		safetyCaseElementEClass = createEClass(SAFETY_CASE_ELEMENT);
		createEAttribute(safetyCaseElementEClass, SAFETY_CASE_ELEMENT__ID);
		createEAttribute(safetyCaseElementEClass, SAFETY_CASE_ELEMENT__DESCRIPTION);

		supportableEClass = createEClass(SUPPORTABLE);
		createEReference(supportableEClass, SUPPORTABLE__SUPPORTED_BY);

		supporterEClass = createEClass(SUPPORTER);
		createEReference(supporterEClass, SUPPORTER__SUPPORTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		goalEClass.getESuperTypes().add(this.getSupportable());
		goalEClass.getESuperTypes().add(this.getSupporter());
		solutionEClass.getESuperTypes().add(this.getSupporter());
		supportableEClass.getESuperTypes().add(this.getSafetyCaseElement());
		supporterEClass.getESuperTypes().add(this.getSafetyCaseElement());

		// Initialize classes and features; add operations and parameters
		initEClass(safetyCaseEClass, SafetyCase.class, "SafetyCase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyCase_Goals(), this.getGoal(), null, "goals", null, 0, -1, SafetyCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSafetyCase_Solutions(), this.getSolution(), null, "solutions", null, 0, -1, SafetyCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(safetyCaseEClass, null, "deleteGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGoal(), "g", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Count(), ecorePackage.getEBigInteger(), "count", null, 0, 1, Goal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolution_Count(), ecorePackage.getEBigInteger(), "count", null, 0, 1, Solution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(safetyCaseElementEClass, SafetyCaseElement.class, "SafetyCaseElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyCaseElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, SafetyCaseElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyCaseElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SafetyCaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(supportableEClass, Supportable.class, "Supportable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportable_SupportedBy(), this.getSupporter(), this.getSupporter_Supports(), "supportedBy",
				null, 1, -1, Supportable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(supportableEClass, this.getSupporter(), "getDescendants", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(supporterEClass, Supporter.class, "Supporter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupporter_Supports(), this.getSupportable(), this.getSupportable_SupportedBy(), "supports",
				null, 0, -1, Supporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(supporterEClass, ecorePackage.getEBigInteger(), "getNumAncestors", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(safetyCaseEClass, source, new String[] { "constraints", "SingleRoot" });
		addAnnotation(supportableEClass, source, new String[] { "constraints", "AcyclicSupporters" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(safetyCaseEClass, source, new String[] { "SingleRoot",
				"self.goals -> union(self.solutions) -> select(elem | elem.supports -> size() = 0) -> size() = 1" });
		addAnnotation(safetyCaseEClass.getEOperations().get(0), source,
				new String[] { "pre", "self.goals -> includes(g)", "post",
						"self.goals -> excludes(g) and self.goals.supportedBy -> excludes(g)" });
		addAnnotation(getGoal_Count(), source, new String[] { "derivation", "Goal.allInstances() -> size()" });
		addAnnotation(getSolution_Count(), source, new String[] { "derivation", "Solution.allInstances() -> size()" });
		addAnnotation(getSafetyCaseElement_Id(), source, new String[] { "derivation",
				"if self.oclIsTypeOf(Goal) then \'G\'.concat(self.oclAsType(Goal).count.toString()) else \'Sn\'.concat(self.oclAsType(Solution).count.toString()) endif" });
		addAnnotation(supportableEClass, source,
				new String[] { "AcyclicSupporters", "self.getDescendants() -> excludes(self)" });
		addAnnotation(supportableEClass.getEOperations().get(0), source, new String[] { "body",
				"self.supportedBy -> closure(s | if s.oclIsKindOf(Supportable) then s.oclAsType(Supportable).supportedBy else s.oclAsSet() endif)" });
		addAnnotation(supporterEClass.getEOperations().get(0), source, new String[] { "body",
				"self.supports -> closure(s | if s.oclIsKindOf(Supporter) then s.oclAsType(Supporter).supports else s.oclAsSet() endif) -> size()" });
	}

} //BasicSafetyCasePackageImpl
