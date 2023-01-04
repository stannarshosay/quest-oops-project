package main;

import java.util.Scanner;

public class RunTryCatchFinallyExample {

	public static void main(String[] args) {
		
		
		int a,b,result;
		Scanner scanner = new Scanner(System.in);

		while(true) {
			
			System.out.println("\n\nEnter two numbers : ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			
			try {
				
				result = a/b;
				System.out.println("Result : "+result);
				
			} catch (ArithmeticException e) {
				
				System.out.println("Oops the second number can't be zero!");
				
			} finally {
				
				System.out.println("Your numbers are : "+a+","+b);
				
			}
			
			
		}

	}

}
