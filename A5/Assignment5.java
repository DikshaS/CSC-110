/*
* For assignments:5; Diksha Sharma
* Program Name: The Class Grade Calculator
* Calculates the final letter grade of all students and output the number receiving grades
* Program Input: different marks for labs, assignments, final and midterms
*Outputs: student ID, total percentage, and letter grade
*/
import java.util.*;


import java.io.*;

public class Assignment5 {
	public static void main (String[] args)throws FileNotFoundException{

		System.out.println("COURSE GRADE CALCULATOR");
		System.out.println();
		System.out.println(" Author: L. Jackson November 2007 Update May 2011");
		System.out.println(" Purpose: Calculated the weighted grade for a student in a course");
		System.out.println("\tInputs: Assignment, Lab, Quiz and Exam grades");
		System.out.println();
		System.out.println("INPUT being received from file. . . .");
		System.out.println();

	File f= new File("scores.dat");
	Scanner input=new Scanner (f);

	double [] info= new double [13];
		int grade1=0;
		int grade2=0;
		int grade3=0;
		int grade4=0;
		int grade5=0;
		int grade6=0;
		int grade7=0;
		int grade8=0;
		int grade9=0;
		int grade10=0;
	while(input.hasNext()){
		for(int i=0; i<info.length; i++){
		info[i]=input.nextDouble();
	}


	double finalpercentage= (info[1]+info[2]+info[3]+info[4]+info[5]+info[6]+info[7]+info[8]+info[9]+info[10]+info[11]+info[12]);
	finalpercentage= (finalpercentage/385)*100;
	
	String grade;

		if (finalpercentage >= 96.5) {
		grade1++;
		grade = "A+";
		
		} else if (finalpercentage >= 92.5) {
		grade = "A";
		grade2++;
		} else if (finalpercentage >= 87.5) {
		grade = "A-";
		grade3++;
		} else if (finalpercentage >= 82.5) {
		grade = "B+";
		grade4++;
		} else if (finalpercentage >= 77.5) {
		grade = "B";
		grade5++;
		}else if (finalpercentage >= 71.5) {
		grade = "B-";
		grade6++;
		}else if (finalpercentage >= 65.5) {
		grade = "C+";
		grade7++;
		}else if (finalpercentage >= 59.5) {
		grade = "C";
		grade8++;
		}else if (finalpercentage >= 49.5) {
		grade = "D";
		grade9++;
		}else {
		grade = "F";
		grade10++;
		}
	System.out.println( info[0] +"  Grade= " + (double)finalpercentage + "  Letter= " + grade);
	}
		System.out.println("\nGrade\tNumber Receiving Grade");
		System.out.println("A+\t" +grade1);
		System.out.println("A \t" +grade2);
		System.out.println("A-\t" +grade3);
		System.out.println("B+\t" +grade4);
		System.out.println("B \t" +grade5);
		System.out.println("B-\t" +grade6);
		System.out.println("C+\t" +grade7);
		System.out.println("C \t" +grade8);
		System.out.println("D \t" +grade9);
		System.out.println("F \t" +grade10);


}
}
