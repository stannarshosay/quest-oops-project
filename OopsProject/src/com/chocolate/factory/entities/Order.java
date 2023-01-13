package com.chocolate.factory.entities;


public class Order {
	
	private Chocolate chocloate;	
	
	public void getDiscount() {
		
		// calculate discount
	}
	
	public void getTotalPrice() {
		
		System.out.println(Size.SMALL);
		
		
		// caluclate totalPrice
		
	}

	public enum Size {
		SMALL,
		BIG,
		JUMBO
	}

}
