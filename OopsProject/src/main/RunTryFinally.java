package main;

public class RunTryFinally {

	public static void main(String[] args) {
		
		
		try {
			
			String name = null;
			System.out.println(name.length());
			
		} finally {
			//no matter the program stops finally will be executed
			System.out.println("Some code you want to execute when any sort of exception occurs,"
					+ " without considering the fact that the program will stop.");
			
		}
		
		System.out.println("If this statement gets executed the program does'nt stop on exception!");

	}

}
