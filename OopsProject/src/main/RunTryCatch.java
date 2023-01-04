package main;

public class RunTryCatch {

	public static void main(String[] args) {
		
	
		try {
			
			// some code that can give exception inside of try block
			// if an exception occurs it goes to the catch and does'nt stop the program
			
			int result = 50/0;
			
		}catch(ArithmeticException e) {
			
			// if an exception is thrown in try block its been caught by catch block
			// NOTE: exception thrown is an object of respective exception class
			// the parenthesis of catch is for us to obtain the exception object
			
			
			System.out.println("Exception has occured....");
			System.out.println("MESSAGE IS : "+e.getMessage());
			System.out.println();
			
			//prints exception details just like an exception throw in console 
			//but does'nt stop the the program
			e.printStackTrace();
			
		}
		
		
		//program does'nt stop because exception is handles with try catch
		System.out.println("\n\nStatement Executed After Error Handling Without Program Being Stopped....");
		

	}

}
