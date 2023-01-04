package main;

import java.util.Arrays;

public class RunFinally {

	public static void main(String[] args) {

		Integer numbers[] = { 50, 15, 25, 2 };

		try {
			
			// error code
			System.out.println("RESULT : "+numbers[8]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//irrespective of whether there is an exception thrown or not 
			//finally will be executed finally i.e after try catch
			
			System.out.println("\n\nThe array is : ");
			String numbersAsString = Arrays.deepToString(numbers);
			System.out.println(numbersAsString);
		
		}

		
		

	}

}
