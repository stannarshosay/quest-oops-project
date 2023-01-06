package main;

public class RunThrowsKeyword {
	
	//calls second method and hence becomes responsible for handling exception since
	//second method throws an exception
	//But here the first method also does'nt handle the exception rather throws it away
	public void firstMethod() throws ClassNotFoundException {
		secondMethod();
	}
	
	//calls final method and hence becomes responsible for handling exception since
	//final method throws an exception
	//But here the second method also does'nt handle the exception rather throws it away
	public void secondMethod() throws ClassNotFoundException {
		finalMethod();
	}
	
	//Has exception code -> it does'nt handle it but rather throws it away
	public void finalMethod() throws ClassNotFoundException{
		
		// a checked exception will be thrown
		Class classObject = Class.forName("somepackagewhichdoesntexist.SomeClass");
		
	}

    //main function calls first method and hence becomes responsible for handling exception since
  	//first method throws an exception  
    // NOTE: IT IS MANDATORY TO HANDLE THE EXCEPTION ONLY IN MAIN FUNCTION
	public static void main(String[] args) {
		
		
		String errorMessage = "Oops! something went wrong.....";
		
		RunThrowsKeyword object = new RunThrowsKeyword();
		try {
			
			object.firstMethod();
			
		} catch (ClassNotFoundException e) {
			
			System.out.println(errorMessage);
			
		}

	}

}
