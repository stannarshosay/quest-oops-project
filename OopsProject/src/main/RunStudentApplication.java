package main;

import classes.Student;

public class RunStudentApplication {

	public static void main(String[] args) {
		
		Student ramu = new Student();
		ramu.setName("Ramu");
		ramu.setRollNo(25);		
		//setting an array as a data member
		int ramuMarks[] = new int[] {25,45,12,15,3,4};
		ramu.setMarks(ramuMarks);
		
		
		Student sonu = new Student();
		sonu.setName("Sonu");
		sonu.setRollNo(125);		
		//setting an array as a data member
		int sonuMarks[] = new int[] {8,52,46,45,4,8,2,1};
		sonu.setMarks(sonuMarks);
		
		//PRINTING
		
		System.out.println("NAME : "+ramu.getName());
		System.out.println("ROLLNO : "+ramu.getRollNo());
		System.out.println("MARKS\n-----");
		
		for(int mark:ramu.getMarks()) {
			System.out.print(mark+" ");
		}
		
		System.out.println("\nTOTAL : "+ramu.getTotalMarks());
		
		
		
		System.out.println("\n\nNAME : "+sonu.getName());
		System.out.println("ROLLNO : "+sonu.getRollNo());		
        System.out.println("MARKS\n-----");
        
		for(int mark:sonu.getMarks()) {
			System.out.print(mark+" ");
		}
		
		System.out.println("\nTOTAL : "+sonu.getTotalMarks());
	}

}
