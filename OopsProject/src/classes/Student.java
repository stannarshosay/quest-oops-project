package classes;

import java.io.Serializable;

//Model class Student
public class Student implements Serializable {

	private String name;
	private int rollNo;
	private String address;
	private String bloodGroup;
	private int marks[];

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int getTotalMarks() {

		int sum = 0;

		for (int mark : this.marks)
			sum += mark;

		return sum;

	}
	
	public void printDetails() {
		
		System.out.println("\n"+this.rollNo+") "+this.name+"\n--*--*--*--");
		System.out.println("Address : "+this.address);
		System.out.println("Blood Group : "+this.bloodGroup+"\n");
		if(this.marks!=null) {
			System.out.println("MARKS\n--------");
			for(int mark:this.marks) {
				System.out.println(mark);
			}
		}
		
	}

}
