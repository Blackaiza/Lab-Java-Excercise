package AssessmentEvaluationAssignment;

public class ProjectEvaluation extends AssessmentEvaluation{

	double presentationMarks;
	double reportMarks;
	private Student bestStudent;
	double totalMarks;
	
	public ProjectEvaluation(String nm, double pm, double rm) {
		super(nm);
		presentationMarks = pm;
		reportMarks = rm;
	}
	
	public double getTotalMark() {
		return totalMarks;
	}
	
	public double evaluation() {
		return totalMarks = presentationMarks + reportMarks;
	}
	
	public void setBestStudent(Student a) {
		
		bestStudent = a;
		if(totalMarks > 30) {
			System.out.print(bestStudent.toString() + " got " + projectStatus() + " project\n");
		}
	
	}
	
	public String projectStatus() {
		
		if(totalMarks > 30)
			return ("Excellent");
		else if(totalMarks >= 24 && totalMarks <= 30)
			return ("Good");
		else if(totalMarks >= 16 && totalMarks <= 23)
			return ("Satisfactory");
		else
			return("Fail");
	}
	
	public double getPresentationMarks() {
		return presentationMarks;
	}
	
	public double getReportMarks() {
		return reportMarks;
	}
}
