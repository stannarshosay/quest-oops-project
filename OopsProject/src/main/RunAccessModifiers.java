package main;

import classes.Bird;

//-----------------------------------------------------------------
//	Specifier		class	subclass	package		world(outside)
//-----------------------------------------------------------------
//  private			✅		no			no			no
//  protected		✅		✅			✅			no
//  public			✅		✅			✅			✅
//  default(none)	✅		no			✅			no

//✅ = Can Access | No = No Access.

public class RunAccessModifiers {

	public static void main(String[] args) {
		
		
		Bird swan = new Bird();
		
		
//		private properties and functions cannot be accessed anywhere including subclasses but accessible only within the class 
//		protected properties and functions cannot be accessed anywhere but within the class and subclasses
//		public properties and functions can be accessed anywhere outside or within the class or subclass (everywhere)

//		protected variables and functions can be accessed outside the class
//      only condition that its in the same package		

//		swan.doesFly; // its private
		swan.isMulticolor = true; // its public
//		swan.doesSwim; // its protected
		
		
//		swan.printDoesFly(); // its private
		swan.printIsMulticolor(); // its public
//		swan.printDoesSwim(); // its protected
		
	}

}
