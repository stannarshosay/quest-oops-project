package main;

import java.util.ArrayList;
import java.util.List;

import classes.Student;

public class RunStreamFilter {

	public static void main(String[] args) {

		//Filter out marks greater than 10 marks
		Integer maxMark = 10;

		List<Integer> marks = new ArrayList<>();
		marks.add(11);
		marks.add(3);
		marks.add(35);
		marks.add(4);
		marks.add(5);
		marks.add(16);
		marks.add(7);
		marks.add(80);
		
		marks.stream().forEach(System.out::println);
		
		System.out.println("\nFiltered Output\n------------");
		
		//specifiy condition and based on return boolean value decides whether or not should the element be removed
		// true => stays there | false => neglected
		marks.stream().filter(mark -> mark>=maxMark).forEach(System.out::println);
		
		
		List<String> names = new ArrayList<>();

		names.add("Emma");
		names.add("Liam");
		names.add("Olivia");
		names.add("Noah");
		names.add("Ava");
		names.add("William");
		names.add("Sophia");
		names.add("Mason");
		names.add("Isabella");
		names.add("Jacob");
		
		System.out.println("\nFiltered Names\n------------");
		
		// filter out all names with letter 'M' | case insensitive (filter to ignore case)
		names.stream().filter(name -> name.toLowerCase().contains("m")).forEach(System.out::println);
		
		
				
		//Filtering list of objects
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Stannars",1,"Mumbai","AB+ve"));
		students.add(new Student("Steve",2,"Mumbai","B+ve"));
		students.add(new Student("Ramu",3,"Tamil Nadu","A+ve"));
		students.add(new Student("Michelle",4,"Rajasthan","AB+ve"));
		students.add(new Student("Sana",5,"Rajasthan","A-ve"));
		students.add(new Student("Remo",6,"Rajasthan","B-ve"));
		
		System.out.println("\nFiltered Students\n------------");

		students.stream().filter(student -> student.getAddress().equalsIgnoreCase("Rajasthan")).forEach(student -> student.printDetails());
		
		
		// filter and map
		
		System.out.println("\nFiltered And Mapped Students\n------------");
		
		students.stream().filter(student -> student.getName().toLowerCase().startsWith("s")).map(student -> {
			
			student.setRollNo(student.getRollNo() * 10);			
			return student;
			
		}).forEach(student -> student.printDetails());
		
		
		// map based on condition
		
		System.out.println("\nConditional Mapped Students\n------------");
		
		students.stream().map(student -> {
			
			if(student.getName().toLowerCase().startsWith("s")) {
				
				student.setRollNo(student.getRollNo() * 10);			

			}
			
			return student;
			
		}).forEach(student -> student.printDetails());
		
		
	}

}
