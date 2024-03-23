package AssessmentEvaluationAssignment;

public class Student {

	String studName;
	String studID;
	
	public Student(String stNm, String stID) {
		studName = stNm;
		studID = stID;
	}
	
	public String getStudName() {
		return studName;
	}
	
	public String getStudID() {
		return studID;
	}
	
	public String toString() {

		return studName + " (" + studID + ")"; 
	}
}
