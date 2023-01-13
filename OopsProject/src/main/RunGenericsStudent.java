package main;

import java.util.Scanner;

import classes.Doctor;
import classes.Student;
import generics.Repository;
import generics.StudentRepository;

public class RunGenericsStudent {

	public static void main(String[] args) {
		
		int length = 2;		
		Scanner scanner = new Scanner(System.in);
		
//		StudentRepository repo = new StudentRepository(new Student[length]);
		
		//USE GENERIC CLASS
		Repository<Student> repo = new Repository<>(new Student[length]);		
		
		for (int i = 0; i < length; i++) {
			
			Student student = new Student();
			
			System.out.println("\nEnter Name : ");
			student.setName(scanner.nextLine());
			
			System.out.println("Enter Address :");
			student.setAddress(scanner.nextLine());
			
//			repo.addStudent(i, student);
			repo.add(i, student);
			
		}
		
		System.out.println("\n=======================\n");
		
		
//		Student students[] = repo.getStudents();
		Student students[] = repo.getAll();
		
		for(Student student : students) {
			
			System.out.println("\nName : "+student.getName());
			System.out.println("Address : "+student.getAddress());
			
		}	

	}

}
