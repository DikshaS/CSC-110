/*
* For assignments:4; Diksha Sharma
* Program Name: Calculate your Grade
* Calculates the final letter grade of a student by getting the marks for final, midterm, assignments and labs 
* Program Input: different marks for labs, assignments, final and midterms
*Outputs: student ID, total percentage, and letter grade
*/
import java.util.*;

public class Assignment4 {
	public static void main (String [] args) {
	

		System.out.println("COURSE GRADE CALCULATOR");
		System.out.println(" Author: L. Jackson October 2010 update May 2011");
		System.out.println(" Purpose: Calculated the weighted grade for a student in a course");
		System.out.println("\tInputs: Assignment, Lab, Quiz and Exam grades");

		System.out.println("\nPassing Grade for Final ==> 50");
		Scanner input = new Scanner(System.in);
		String IDnumber=" ";
		System.out.print("\nInput ID number ==> ");
		IDnumber= input.nextLine();
		System.out.println();


		double a=getGrades("Assignments", 20, 8);
		a=a*0.24;
		System.out.println();
		double l= getGrades("Lab Attendance",5, 1);
		l=l*0.05;
		System.out.println();
		double q= getGrades("Quiz",20, 1);
		q=q*0.03;
		System.out.println();
		double b= getGrades("Midterm",100,1);
		b=b*0.23;
		System.out.println();
		double c= getGrades("Final Exam",100,1);
		c=c*0.45;
		double finalpercentage= (a+l+q+b+c);
		String grade;

		if (finalpercentage >= 96.5) {
			grade = "A+";
		} else if (finalpercentage >= 92.5) {
			grade = "A";
		} else if (finalpercentage >= 87.5) {
			grade = "A-";
		} else if (finalpercentage >= 82.5) {
			grade = "B+";
		} else if (finalpercentage >= 77.5) {
			grade = "B";
		}else if (finalpercentage >= 71.5) {
			grade = "B-";
		}else if (finalpercentage >= 65.5) {
			grade = "C+";
		}else if (finalpercentage >= 59.5) {
			grade = "C";
		}else if (finalpercentage >= 49.5) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println();
        System.out.println(IDnumber +"  Grade= " + (double) finalpercentage + "  Letter= " + grade);
	}


	public static double getGrades(String type,int max, int num){
		Scanner userReader = new Scanner(System.in);
			System.out.println("Input " +type+ ("(max " +max+ "):"));
				double sum=0.0;
				for( int i=1; i<=num; i++){
					System.out.print("#" +i+ "==>");
					double gradeEntered = userReader.nextDouble();
				if(gradeEntered>max){
					System.out.println("INPUT TOO LARGE:Type a number in the range 0-"+max);
					i--;
					sum=sum-gradeEntered;
				}else if(gradeEntered<0){
					System.out.println("INPUT TOO SMALL:Type a number in the range 0-"+max);
					i--;
					sum=sum-gradeEntered;
				}
					sum=sum+gradeEntered;
				}

				double average=0.0;
				average= sum/num;

				double percentage=0.0;
				percentage= average/max *100.0;

				return percentage;
	}
}
