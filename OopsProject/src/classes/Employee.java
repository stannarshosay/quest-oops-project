package classes;

public class Employee {

	private String name;
	private String address;
	private double salary;
	private String designation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {	
		return "NAME : "+this.name+"\n"
				+"ADDRESS : "+this.address+"\n"
				+"DESIGNATION : "+this.designation+"\n"
				+"SALARY : "+this.salary+"\n\n";
	}

}
