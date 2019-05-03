module BasicSafetyCase

one sig SafetyCase {
	goals: set Goal,
	solutions: set Solution
}

fact ElementOwnership {
	SafetyCase.goals = Goal and
	SafetyCase.solutions = Solution
}

sig Goal extends SafetyCaseElement {}
sig Solution extends SafetyCaseElement {}

sig Supportable in SafetyCaseElement {
	supportedBy: some Supporter
}
fact SupportableElements {
	Supportable = Goal
}
fact SingleRoot {
	#(Supporter - Supporter.supportedBy) = 1
}
fact AcyclicSupporters {
	#(^supportedBy & iden) = 0
}

sig Supporter in SafetyCaseElement {}
fact SupporterElements {
	Supporter = Goal + Solution
}

abstract sig SafetyCaseElement {}

fun getDescendants(s: Supportable): set Supporter {
	s.^supportedBy
}

pred isTree() {
	#supportedBy = minus[#SafetyCaseElement, 1]
}

pred deleteGoal(g:Goal, gSet': set Goal, sSet': set supportedBy) {
	gSet' = Goal - g and sSet' = supportedBy - (g <: supportedBy) - (supportedBy :> g)
}

pred show() {}
run deleteGoal for 10 but exactly 5 Goal, exactly 5 Solution
