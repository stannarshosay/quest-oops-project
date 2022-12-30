package classes;

public class Teacher {

	public String gender;
	private Integer age;
	protected Long salary;
	
	
	public void printGender() {
		System.out.println("Gender : "+this.gender);
	}
	
	private void printAge() {
		System.out.println("Age : "+this.age);
	}
	
	protected void printSalary() {
		System.out.println("Salary : "+this.salary);
	}
	
}
