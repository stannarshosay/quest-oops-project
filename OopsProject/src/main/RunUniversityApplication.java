package main;

import java.util.Scanner;

import classes.University;

public class RunUniversityApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("How many universities do you wish to enter?");
		University universities[] = new University[scanner.nextInt()];
		
		for (int i = 0; i < universities.length; i++) {
			
			University university = new University();
			
			System.out.println("\n\nEnter University Data : ");
			
			System.out.println("Enter name");			
			String name = scanner.next();
			university.setName(name);
			
			System.out.println("Enter location");			
			String location = scanner.next();
			university.setLocation(location);
			
			System.out.println("Enter total Students");			
			int totalStudents = scanner.nextInt();
			university.setTotalStudents(totalStudents);
			
			System.out.println("Enter year established");			
			int yearEstablished = scanner.nextInt();
			university.setYearEstablished(yearEstablished);
						
			//save the data of university object into some position in array
			universities[i] = university;
			
		}
		
		System.out.println("\n\nUNIVERSITIES");
		System.out.println("************");
		
		
		for (int i = 0; i < universities.length; i++) {
			
			University university = universities[i];
			
			System.out.println("\n\nNAME : "+university.getName());
			System.out.println("LOCATION : "+university.getLocation());
			System.out.println("TOTAL STUDENTS : "+university.getTotalStudents());		
			System.out.println("YEAR : "+university.getYearEstablished()+"\n\n");
			
		}
		
		
		System.out.println("\n\nSEARCH");
		System.out.println("************");

		
		while(true) {
			
			System.out.println("Enter search term : ");
			String term = scanner.next();
			
			University university  =  University.searchByName(term, universities);
			
			if(university == null) {
				
				System.out.println("\n\nOops! No results found!");
				
			}else {
				
				System.out.println("\n\nResults of '"+term+"' : ");
				System.out.println("NAME : "+university.getName());
				System.out.println("LOCATION : "+university.getLocation());
				System.out.println("TOTAL STUDENTS : "+university.getTotalStudents());		
				System.out.println("YEAR : "+university.getYearEstablished()+"\n\n");
				
			}
			
		}
		
		
		


	}

}
