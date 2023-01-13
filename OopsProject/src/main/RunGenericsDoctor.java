package main;

import java.util.Scanner;

import classes.Doctor;
import generics.DoctorRepository;
import generics.Repository;

public class RunGenericsDoctor {

	public static void main(String[] args) {
		
		int length = 2;		
		Scanner scanner = new Scanner(System.in);
				
//		DoctorRepository repo = new DoctorRepository(new Doctor[length]);
		
		//USE GENERIC CLASS
		Repository<Doctor> repo = new Repository<>(new Doctor[length]);		
		
		for (int i = 0; i < length; i++) {
			
			Doctor doctor = new Doctor();
			
			System.out.println("\nEnter Name : ");
			doctor.setName(scanner.nextLine());
			
			System.out.println("Enter Location :");
			doctor.setLocation(scanner.nextLine());
			
//			repo.addDoctor(i, doctor);
			
			repo.add(i, doctor);
			
		}
		
		System.out.println("\n=======================\n");
		
		
//		Doctor doctors[] = repo.getDoctors();
		
		Doctor doctors[] = repo.getAll();
		
		for(Doctor doctor : doctors) {
			
			System.out.println("\nName : "+doctor.getName());
			System.out.println("Location : "+doctor.getLocation());
			
		}	

	}

}
