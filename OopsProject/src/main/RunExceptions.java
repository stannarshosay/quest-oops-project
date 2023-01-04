package main;

public class RunExceptions {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//ClassNotFoundException
//		Class studentClass = Class.forName("classes.Student"); //correct classname with path (no error)
		Class studentClass = Class.forName("Student"); //wrong path w.r.t src folder (error is thrown)
		
		//ArithmeticException
		int a = 15;
		int b = 0;		
		int qoutient = a/b;
		System.out.println("Dividing : "+qoutient);
		
		//NullPointerException
		String name = null;
	    System.out.println(name.charAt(0));

		//NumberFormatException
		String rollNo = "580dsd";
		int roll = Integer.parseInt(rollNo);
		System.out.println(roll + 50);

		// StringIdexOutOfBoundsException
		String registerNo = "580dsd";
		System.out.println(registerNo.charAt(6));

		// ArrayIndexOutOfBoundsException
		int[] numbers = { 45, 25, 12 };
		System.out.println(numbers[5]);

	}

}
