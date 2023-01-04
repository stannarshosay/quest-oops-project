package main;

public class RunMultipleCatch {

	public static void main(String[] args) {
		
		
		int a = 14;
		int b = 10;
		int result;
		String name = null;
		
		// multiple catch statements can be used for some code in try for which 
		// there is a possibility of multiple types of exception
		try {
			
			result = a/b;
			name.length();
			
		}catch(ArithmeticException e) {
			// this catch will catch or lookout for arithmetic exception only
			System.out.println("Oops! cannot divide by zero");
			
		}catch(NullPointerException e) {
			// this catch will catch or lookout for null pointer exception only
			System.out.println("Oops! name cannot be null");
		}

	}

}
