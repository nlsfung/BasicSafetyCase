module BasicSafetyCase

one sig SafetyCase {
	goals: set Goal,
	solutions: set Solution
}

fact ElementOwnership {
	SafetyCase.goals = Goal and
	SafetyCase.solutions = Solution
}

sig Goal extends SafetyCaseElement {
	supportedBy: some (Goal + Solution)
}
sig Solution extends SafetyCaseElement {}

fact SingleRoot {
	#(Goal + Solution - Goal.supportedBy) = 1
}
fact AcyclicSupporters {
	#(^supportedBy & iden) = 0
}

abstract sig SafetyCaseElement {}

fun getDescendants(g: Goal): set (Goal + Solution) {
	g.^supportedBy
}

fun getAncestors(e: SafetyCaseElement): set (Goal + Solution) {
	^supportedBy.e
}

pred isTree() {
	#supportedBy = minus[#SafetyCaseElement, 1]
}

pred deleteGoal(g:Goal, gSet': set Goal, sSet': set supportedBy) {
	gSet' = Goal - g and sSet' = supportedBy - (g <: supportedBy) - (supportedBy :> g)
}

assert GoalRoot {
	Solution in Goal.supportedBy
}

check GoalRoot

-- run isTree for 10 but exactly 5 Goal

-- pred show() {}
-- run show for 10 but exactly 5 Goal, exactly 5 Solution
