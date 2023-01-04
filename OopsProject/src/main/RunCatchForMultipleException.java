package main;

public class RunCatchForMultipleException {

	public static void main(String[] args) {
		
		int a = 14;
		int b = 50;
		int result;
		String name = null;
		
		// multiple exceptions can be handled with a single catch block to execute a common code
		// this is done with the help of pipe symbol '|'
		try {
			
			result = a/b;
			name.length();
			
		}catch(ArithmeticException | NullPointerException  e) {
			// this catch will catch or lookout for arithmetic and null pointer exception 
			// and execute the common code inside catch
			System.out.println("Oops! the name can't be null and the number can't be zero");
			System.out.println("\n"+e.toString());
			
		}

	}

}
