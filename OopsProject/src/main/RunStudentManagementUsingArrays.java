package main;

import java.util.Scanner;

import classes.Student;
import classes.StudentDataAccessObject;

//Inorder to create an checked exception we have to inherit from Exception Class since
//the subclasses and itself is of exception type checked
public class RunStudentManagementUsingArrays {

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
			scanner.nextLine();
			
			switch(option) {
				case 1:{
					
					System.out.println("Adding Student to Position : "+dao.getPosition()+"/"+dao.getLength());
					System.out.println("Enter Name : ");
					String name = scanner.nextLine();
					System.out.println("Enter RollNo : ");
					int rollNo = scanner.nextInt();
					
					//skip line after nextInt
					scanner.nextLine();
					
					System.out.println("Enter Address : ");
					String address = scanner.nextLine();
					System.out.println("Enter Blood Group : ");
					String bloodGroup = scanner.nextLine();
					
					Student student = new Student();
					student.setRollNo(rollNo);
					student.setName(name);
					student.setAddress(address);
					student.setBloodGroup(bloodGroup);
					
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
						
						student.printDetails();
						
					}
					
					break;
				}
				case 3:{
					
					System.out.println("All Students\n-------------");
					
					Student students[] = dao.getStudents();
					
					for(Student student:students) {
						
						//method 1 (preferred)
						if(student == null) continue;						
						student.printDetails();
							
						//method 2
//						try {
//							
//							student.printDetails();
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
					
					System.out.println("Enter the roll no of Student : ");
					int rollNo = scanner.nextInt();
					scanner.nextLine();
					
					Student student = dao.getStudent(rollNo);
					
					if(student == null) {
						
						System.out.println("Oops! No such record found");
						
					} else {
						
						student.printDetails();
						
						System.out.println("\nEnter the new name : ");
						String name = scanner.nextLine();
						System.out.println("Enter the new address : ");
						String address = scanner.nextLine();
						System.out.println("Enter the new blood group : ");
						String bloodGroup = scanner.nextLine();
						
						Student newStudent = new Student();
						newStudent.setName(name);
						newStudent.setAddress(address);
						newStudent.setBloodGroup(bloodGroup);
						
						dao.editStudent(student,newStudent);
						
					}
					
					break;
				}
				case 5:{
					
					System.out.println("Enter the roll no of Student : ");
					int rollNo = scanner.nextInt();
					
					Student student = dao.getStudent(rollNo);
					
					if(student == null) {
						
						System.out.println("Oops! No such record found");
						
					}else {
						
						System.out.println("The student with below details have been deleted :");						
						student.printDetails();
						
						dao.deleteStudent();
						
					}
					
					
					break;
				}
			}
			
		}

	}

}
