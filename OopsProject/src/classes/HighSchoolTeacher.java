package classes;

public class HighSchoolTeacher extends Teacher{
	
	private String highSchoolSubject;
	
	public void printFormattedGender() {
		//public variables of superclass are accessible in subclass
		System.out.println("Your gender is "+gender);
	}
	
	public void printGenderWithSubject() {
		
		System.out.println("Subject : "+this.highSchoolSubject);
		//public functions of superclass are accessible in subclass
		printGender();
		
	}
	
	public void printFormattedAge() {
		//private variables of superclass cannot be accessed in subclass
//		System.out.println("Your age is "+age);
		
	}
	
	public void printSubjectWithAge() {
		System.out.println("Subject : "+this.highSchoolSubject);
		//private functions of superclass cannot be accessed in subclass
//		printAge();
	}
	
	
	public void printFormattedSalary() {
		//protected variables of superclass can be accessed in subclass
		System.out.println("Your salary is "+salary);
		
	}
	
	public void printSubjectWithSalary() {
		System.out.println("Subject : "+this.highSchoolSubject);
		//protected functions of superclass can be accessed in subclass
		printSalary();
	}
	

}
