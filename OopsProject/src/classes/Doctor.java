package classes;

//Entity or Model or POJO(Plain Old Java Object) or Bean Class
public class Doctor {

	private String name;
	private String location;	
	
	
	//DEFAULT CONSTRUCTOR - does'nt have any arguments or parameters
	// its a method that has no return type and name that of the class itself and is called or 
	// executed at the time of object creation
	public Doctor() {
	
		this.name = "NA";
		this.location = "NA";
		
	}
	
	//PARAMETERIZED CONSTRUCTOR
	public Doctor(String name,String location) {
		
		this.name = name;
		this.location = location;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
