package main;

import java.util.Scanner;

import exceptions.AgeInvalidException;

//Inorder to create an unchecked exception we have to inherit from RuntimeException Class since
//the subclasses and itself is of exception type unchecked
public class RunUncheckedCustomException {

	public static void main(String[] args) {
		
		// A program to lend loan which asks for age and it should be greater than 18

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scanner.nextInt();
		
		if(age<18) {
			throw new AgeInvalidException("Age is less than 18");
		}
		
		System.out.println("Your loan is approved!");

	}

}
