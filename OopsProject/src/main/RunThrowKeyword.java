package main;

import java.util.Scanner;

public class RunThrowKeyword {

	public static void main(String[] args) {
		
		//throw keyword helps us throw an exception	
		//we throw an object of a exception class
//		throw new ArithmeticException();
		
		
		//exception thrown with custom message using exception parameterized constructor
//		throw new ArithmeticException("This message will be shown as error message");
		
		
		//EXAMPLE
		// A program to lend loan which asks for age and it should be greater than 18
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scanner.nextInt();
		
		if(age<18) {
			throw new ArithmeticException("Age should be greater than 18");
		}
		
		System.out.println("Your loan is approved!");
		

	}

}
