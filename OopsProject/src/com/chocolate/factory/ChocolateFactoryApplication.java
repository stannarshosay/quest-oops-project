package com.chocolate.factory;

import java.util.Scanner;

public class ChocolateFactoryApplication {

	public static void main(String[] args) {
		
//		A chocolate company wants to computerize their daily work.
//		It makes two types of chocolate on order - milk and cocoa.
//		cost of chocolate depends on its size.
//		There are 3 sizes in chocolates : - small - big - jumbo 
//		Prices are as follows :
//					milk 	cocoa
//			------------------------
//			small 	40 		60 
//			big 	100 	180 
//			jumbo 	250 	400 
//			
//		discount is given as per the ordered number of chocolates.
//		<50 10% 
//		< 100 15% 
//		< 150 20% 
//		>150 30% 
//		
//		You are expected to create classes with proper fields and methods.
//		Establish relationship between the classes.
//		Overload and Override methods. Implement interface for business logic.
		
		
		Scanner scanner = new Scanner(System.in);
		int chocolateOption;
		int sizeOption;
		int quantity;
		
		System.out.println("Which Chocolate do you want?");
		System.out.println("1) Milk");
		System.out.println("2) Cocoa" );
		
		chocolateOption = scanner.nextInt();
		
		if(chocolateOption == 1) {
			
			//Milk
			
			System.out.println("What is the size?");
			System.out.println("1) small");
			System.out.println("2) big");
			System.out.println("3) jumbo");
			
			sizeOption = scanner.nextInt();
			
			switch(sizeOption) {
				case 1:{
					
					System.out.println("How many chocolates do you need?");
					quantity = scanner.nextInt();
					
					// calculate discount based on quantity
					
					
					
				}
				case 2:{
					
				}
				case 3:{
					
				}
			}
			
			
			
		}else {
			
			//Cocao
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
