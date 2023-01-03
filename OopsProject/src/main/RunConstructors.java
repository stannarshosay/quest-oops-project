package main;
import classes.Doctor;

public class RunConstructors {

	public static void main(String[] args) {
		
		
		//DEFAULT CONSTRUCTOR
		Doctor na = new Doctor(); // object creation
		
		//without setting values using setters we give initial values to data members 
		//in a constructor which is called when object is created
		System.out.println(na.getName());
		System.out.println(na.getLocation());
		
		
		
		//PARAMETRIZED CONSTRUCTOR
		Doctor doctor = new Doctor("Stannars","Kerala"); // object creation
		
		System.out.println(doctor.getName());
		System.out.println(doctor.getLocation());
				
		
		
	}

}
