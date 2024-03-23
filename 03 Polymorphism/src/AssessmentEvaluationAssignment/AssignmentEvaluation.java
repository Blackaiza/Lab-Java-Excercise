package AssessmentEvaluationAssignment;

public class AssignmentEvaluation extends AssessmentEvaluation{

	int numAssignment;
	double totalAssignmentMarks;
	
	public AssignmentEvaluation(String sn, int na, double tam) {
		super(sn);
		numAssignment = na;
		totalAssignmentMarks = tam;
	}
	
	public double evaluation() {
		return totalAssignmentMarks / numAssignment;
	}
	
	public int getNumAssignment() {
		return numAssignment;
	}
	
	public double getTotalAssignmentMarks() {
		return totalAssignmentMarks;
	}
}
