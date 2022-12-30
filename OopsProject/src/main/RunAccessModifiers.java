package main;

import classes.Bird;

public class RunAccessModifiers {

	public static void main(String[] args) {
		
		
		Bird swan = new Bird();
		
		
//		private properties and functions cannot be accessed anywhere including subclasses but accessible only within the class 
//		protected properties and functions cannot be accessed anywhere but within the class and subclasses
//		public properties and functions can be accessed anywhere outside or within the class (everywhere)
		

//		swan.doesFly; // its private
		swan.isMulticolor = true; // its public
//		swan.doesSwim; // its protected
		
		
//		swan.printDoesFly(); // its private
		swan.printIsMulticolor(); // its public
//		swan.printDoesSwim(); // its protected
		
	}

}
