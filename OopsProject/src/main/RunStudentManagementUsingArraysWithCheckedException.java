package main;

import java.util.Scanner;

import classes.Student;
import classes.StudentDataAccessObject;

//Inorder to create an checked exception we have to inherit from Exception Class since
//the subclasses and itself is of exception type checked
public class RunStudentManagementUsingArraysWithCheckedException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int option;
		
		System.out.println("Student Management\n=================");
		System.out.println("Enter the number of records");
		
		StudentDataAccessObject dao = new StudentDataAccessObject(scanner.nextInt());
		
		while(true) {
			
			System.out.println("\nSELECT AN OPTION\n=================");
			System.out.println("1) Add a student");
			System.out.println("2) List a student");
			System.out.println("3) List all students");
			System.out.println("4) Update a student");
			System.out.println("5) Delete a student");
			System.out.println("*) Quit");
			
			option = scanner.nextInt();
			
			switch(option) {
				case 1:{
					
					System.out.println("Adding Student to Position : "+dao.getPosition()+"/"+dao.getLength());
					System.out.println("Enter Name : ");
					String name = scanner.next();
					System.out.println("Enter RollNo : ");
					int rollNo = scanner.nextInt();
					
					Student student = new Student(name,rollNo);
					
					dao.addStudent(student);
					
					break;
				}
				case 2:{
					
					System.out.println("Enter the roll no of Student : ");
					int rollNo = scanner.nextInt();
					
					Student student = dao.getStudent(rollNo);
					
					if(student == null) {
						
						System.out.println("Oops! No such record found");
						
					}else {
						
						System.out.println(student.getRollNo()+" | "+student.getName());
						
					}
					
					break;
				}
				case 3:{
					
					System.out.println("All Students\n-------------");
					
					Student students[] = dao.getStudents();
					
					for(Student student:students) {
						
						//method 1 (preferred)
						if(student == null) continue;						
						System.out.println(student.getRollNo()+" | "+student.getName());
							
						//method 2
//						try {
//							
//							System.out.println(student.getRollNo()+" | "+student.getName());
//
//						}catch(NullPointerException e) {
//							
//							continue;
//							
//						}
						
						
					}
					
					break;
				}
				case 4:{
					break;
				}
				case 5:{
					break;
				}
			}
			
		}

	}

}
