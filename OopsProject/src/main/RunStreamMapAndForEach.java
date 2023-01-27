package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import classes.Student;

public class RunStreamMapAndForEach {

	public static void main(String[] args) {

		Integer graceMarks = 2;

		List<Integer> marks = new ArrayList<>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		marks.add(4);
		marks.add(5);
		marks.add(6);
		marks.add(7);
		marks.add(8);

		// To Add graceMarks to all marks in the list representing student marks

		// Without Stream add graceMarks

//		for (int i = 0; i < marks.size(); i++) {
//			
//			Integer mark = marks.get(i);
//			marks.set(i, mark + graceMarks);
//			
//		}
//		
//		for (Integer mark : marks) {
//			System.out.print(mark+" ");
//		}

		// With Stream add graceMarks

//		marks.stream().map(mark -> mark + graceMarks).forEach(mark -> System.out.print(mark + " "));
		
		//Original data doesn't change when using streams
//		System.out.println();		
//		for (Integer mark : marks) {
//			System.out.print(mark+" ");
//		}
		
		
		//Get a new List
		
		//Method 1
//		List<Integer> modifiedMarks = marks.stream().map(mark -> mark + graceMarks).toList();
		
		//Method 2
//		List<Integer> modifiedMarks = marks.stream().map(mark -> mark + graceMarks).collect(Collectors.toList());
//		
//		System.out.println();		
//		for (Integer mark : modifiedMarks) {
//			System.out.print(mark+" ");
//		}
		
		
		
		// MAP Intermediate Operation with Objects
		
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Stannars",1,"Mumbai","AB+ve"));
		students.add(new Student("Steve",2,"Mumbai","B+ve"));
		students.add(new Student("Ramu",3,"Tamil Nadu","A+ve"));
		students.add(new Student("Michelle",4,"Rajasthan","AB+ve"));
		students.add(new Student("Sana",5,"Rajasthan","A-ve"));
		students.add(new Student("Remo",6,"Rajasthan","B-ve"));
		
		students.stream().forEach(student -> student.printDetails());
		
		
		// GET Only the names of students
		// can use map to convert the list of objects into list of names i.e String
		
		System.out.println("Names List\n**********\n");
		
//		students.stream().map(student -> student.getName()).forEach(name -> System.out.println(name));		
		
//		List<String> names = students.stream().map(student -> student.getName()).toList();
		
		List<String> names = students.stream().map(student -> student.getName()).collect(Collectors.toList());
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
		//Using the MAP to change the property of an object
		
		students.stream().map(student->{
			
			Integer newRollNo = student.getRollNo() * 2;
			student.setRollNo(newRollNo);
			
			return student;
			
		}).forEach(student->student.printDetails());

	}

}
