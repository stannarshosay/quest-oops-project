package main;

import classes.Laptop;

//FUNCTION OVERRIDING
//it allows the child or sub class to give a new implementation to the function or method 
//of super or parent class

public class RunPolymorphismFunctionOverriding {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setName("Windows 11");
		laptop.setIsOpenSource(false);
		laptop.setBrand("HP");
		laptop.setPrice(76000);
		
		laptop.printDetails();

	}

}
