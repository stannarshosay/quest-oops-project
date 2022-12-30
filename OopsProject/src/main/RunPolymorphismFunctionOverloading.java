package main;

import classes.Adder;

public class RunPolymorphismFunctionOverloading {

	/* FUNCTION/METHOD OVERLOADING */
	
	// the function or method can have same name only if the function or method differs 
    // in either number of parameters or datatype of parameters or both
	
	public static void main(String[] args) {
		
		Adder.add(5,10);
		Adder.add(1, 2, 4);
		Adder.add(1, 2, 4,55);
		Adder.add("Stannars ","Hosay");

	}

}
