package main;

public class RunCatchForAnyException {

	public static void main(String[] args) {
		
		int a = 14;
		int b = 50;
		int result;
		int numbers[] = {15,25,2,60};
		String name = null;
		
		// any exception in java can be handled with a single catch block by using the parent class 
		// Exception based on the concept of inheritance and upcasting where in a child object is
		// converted to parent object (Parent is the top level class Exception)
		try {
			
			System.out.println(numbers[10]);
			result = a/b;
			name.length();
			
		}catch(Exception e) {
			// this catch will catch or lookout for any exception 
			// and execute the common code inside catch
			System.out.println("Oops! the name can't be null and the number can't be zero and array index should'nt go outside length");
			System.out.println("\n"+e.toString());
			
		}

	}

}
