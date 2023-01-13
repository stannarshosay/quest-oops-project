package generics;

import classes.Student;

public class StudentRepository {

	private Student students[];	
	
	public StudentRepository(Student[] students) {
		this.students = students;
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void addStudent(int index, Student student) {
		this.students[index] = student;
	}
}
