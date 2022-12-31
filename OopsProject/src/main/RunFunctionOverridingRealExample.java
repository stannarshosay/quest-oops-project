package main;

import classes.Employee;

public class RunFunctionOverridingRealExample {

	public static void main(String[] args) {
				
		Employee ramu =  new Employee();
		ramu.setName("Ramu");
		ramu.setAddress("Mumbai");
		ramu.setDesignation("Node Js Developer");
		ramu.setSalary(85000);
		
		Employee sonu = new Employee();
		sonu.setName("Sonu");
		sonu.setAddress("Kerala");
		sonu.setDesignation("Angular Developer");
		sonu.setSalary(95000);
		
		
		System.out.println(ramu.toString());
		System.out.println(sonu.toString());
		
		
		

	}

}
