package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import classes.Student;

public class RunStreamDistinct {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student("Stannars", 1, "Mumbai", "AB+ve"));
		students.add(new Student("Steve", 2, "Mumbai", "B+ve"));
		students.add(new Student("Ramu", 3, "Tamil Nadu", "A+ve"));
		students.add(new Student("Michelle", 4, "Rajasthan", "AB+ve"));
		students.add(new Student("Sana", 5, "Rajasthan", "A-ve"));
		students.add(new Student("Remo", 6, "Rajasthan", "B-ve"));

		students.stream().forEach(student -> student.printDetails());

		System.out.println("Places List\n**********\n");

		//Distinct Values using SET
//		Set<String> places = students.stream().map(student -> student.getAddress()).collect(Collectors.toSet());
		
		//Distinct Values using Stream distinct()
		List<String> places = students.stream().map(student -> student.getAddress()).distinct().collect(Collectors.toList());

		for (String place : places) {
			System.out.println(place);
		}

	}

}
