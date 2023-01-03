package main;

import classes.CollegeFaculty;
import classes.Faculty;
import classes.HighSchoolFaculty;

public class RunAbstractClass {

	public static void main(String[] args) {
		
		HighSchoolFaculty hFaculty = new HighSchoolFaculty();
		hFaculty.printWelcomeMessageAndSalary();
		hFaculty.printBonus();
		
		System.out.println();
		
		CollegeFaculty cFaculty = new CollegeFaculty();
		cFaculty.printWelcomeMessageAndSalary();
		cFaculty.printBonus();
		cFaculty.onClassStart();
		cFaculty.draw();
		
		
		//UPCASTING - converting child to parent object
		
		// only considering the parent class functions and properties and 
		// neglecting the child or sub class properties or functions i.e college-faculty class
		
		Faculty upCollegeFaculty = (Faculty) new CollegeFaculty();
//		Faculty collegeFaculty = new CollegeFaculty(); //works without parenthesis parent class 
		upCollegeFaculty.printWelcomeMessageAndSalary();
		upCollegeFaculty.printBonus();
		
		//the functions below can't be accessed anymore
//		upCollegeFaculty.onClassStart();
//		upCollegeFaculty.draw();
		
		//DOWNCASTING - converting parent to child object
		// inorder to do a downcasting an upcasting should be done beforehand so that 
		// a reference of the child exists
		Faculty faculty = (Faculty) new CollegeFaculty(); // -> UPCASTING
		
		CollegeFaculty collegeFaculty = (CollegeFaculty)faculty;
		collegeFaculty.printWelcomeMessageAndSalary();
		collegeFaculty.printBonus();
		collegeFaculty.onClassStart();
		collegeFaculty.draw();
		

	}

}
