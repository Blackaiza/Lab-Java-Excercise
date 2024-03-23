package AssessmentEvaluationAssignment;

import java.util.*;
import java.text.*;

public class EvaluationApps {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int bil = sc.nextInt();
		
		Student[] student = new Student[bil];
		AssignmentEvaluation[] assignmentevaluation = new AssignmentEvaluation[bil];
		ProjectEvaluation[] projectevaluation = new ProjectEvaluation[bil];
				
		for (int i = 0; i < bil; i++) {
			
			String name = sc.next();
			String studID = sc.next();
			double assgnMark = sc.nextDouble();
			double report = sc.nextDouble();
			double present = sc.nextDouble();
			
			assignmentevaluation[i] = new AssignmentEvaluation("TK1143", 6, assgnMark);
			projectevaluation[i] = new ProjectEvaluation("TK1143", present, report);
			student[i] = new Student(name, studID);
			
			double assignment = assignmentevaluation[i].evaluation();
			double project = projectevaluation[i].evaluation();
			double totalassessmentmark = assignment + project;
			double assessmentPercentage = totalassessmentmark / 60 * 70;
		
			System.out.println(student[i].toString());
			System.out.println("Total assessment marks (out of 60) : " + df.format(totalassessmentmark));
			System.out.println("Project Status: " + projectevaluation[i].projectStatus());
			System.out.println("Assessment marks (out of 70%): " + df.format(assessmentPercentage) + "%");
			System.out.println();

			projectevaluation[i].setBestStudent(student[i]);
		
		}
		
	}
}
 