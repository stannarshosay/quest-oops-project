package classes;

public class University {

	private String name;
	private int totalStudents;
	private String location;
	private int yearEstablished;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getYearEstablished() {
		return yearEstablished;
	}

	public void setYearEstablished(int yearEstablished) {
		this.yearEstablished = yearEstablished;
	}
	
	
	
	
	public static University searchByName(String term, University universities[]) {
		
		for(University university:universities) {
			
			if(university.getName().contains(term)) {
				
				return university;
				
			}
			
		}
		
		return null;
		
	}
	
	
	
	
	

}
