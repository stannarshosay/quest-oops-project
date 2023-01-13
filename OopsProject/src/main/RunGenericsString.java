package main;

import java.util.Scanner;

import classes.Doctor;
import generics.FruitRepository;
import generics.Repository;


//Fruits
public class RunGenericsString {
	
	public static void main(String[] args) {
		
		int length = 2;		
		Scanner scanner = new Scanner(System.in);
		
//		FruitRepository repo = new FruitRepository(new String[length]);
		
		//USE GENERIC CLASS
		Repository<String> repo = new Repository<>(new String[length]);		
		
		for (int i = 0; i < length; i++) {
						
			System.out.println("\nEnter Fruit : ");
//			repo.addFruit(i, scanner.nextLine());
			repo.add(i, scanner.nextLine());
			
		}
		
		System.out.println("\n=======================\n");
		
		
//		String fruits[] = repo.getFruits();
		String fruits[] = repo.getAll();
		
		for(String fruit : fruits) {
			
			System.out.println("\nFruit : "+fruit);
			
		}	
		
	}

}
