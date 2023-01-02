package main;

import classes.Laptop;

//FUNCTION OVERRIDING
//it allows the child or sub class to give a new implementation to the function or method 
//of super or parent class

public class RunPolymorphismFunctionOverriding {
	

	public static void main(String[] args) {
		
		
		System.out.println("Laptop Distributer : "+Laptop.OS_DISTRIBUTER);
		
//		Laptop laptop = new Laptop() {
//
//			@Override
//			public String toString() {
//				this.printAllDetails();
//				return "";
//			}
//			
//		};
		
		Laptop laptop = new Laptop();
		laptop.setName("Windows 11");
		laptop.setIsOpenSource(false);
		laptop.setBrand("HP");
		laptop.setPrice(76000);
		
		laptop.printAllDetails();
		
//		laptop.printOsDetails();
		
//		laptop.toString();

	}

}
