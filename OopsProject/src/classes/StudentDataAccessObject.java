package classes;

//These kind classes are used for CRUD operation w.r.t a model class
// C - Create | R - Retrieve | U - Update | D - Delete
//Sometimes its also called Repository class
//Student DAO class handles data altering/transfer process related to the model class Student
//it deals with array of student objects
public class StudentDataAccessObject {
	
	private Student students[];
	private int length;
	private int index; //acts like a cursor
	
	public StudentDataAccessObject(int length) {
		
		this.length = length;
		this.students = new Student[length];
		this.index = 0;
		
	}

	//getters
	
	public int getPosition() {
		return this.index + 1;
	}

	public int getLength() {
		return length;
	}
	
	public Student[] getStudents() {
		return this.students;
	}
	
	//computing methods
	
	//object is added to array and index is updated
    public void addStudent(Student student) {
		
		this.students[this.index] = student;
		++this.index;
		
	}
    
    public Student getStudent(int rollNo) {
    	
    	for(Student student : this.students) {
    		
    		if(student == null) continue;
    		
    		if(student.getRollNo() == rollNo) return student;
    		
    		
    	}
    	
    	return null;
    	
    }

}
