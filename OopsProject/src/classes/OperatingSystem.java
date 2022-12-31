package classes;

//consider can't be modified (complied class)
public class OperatingSystem {

	private String name;
	private Boolean isOpenSource;
	//final keyword for having constant variables
	public static final String OS_DISTRIBUTER = "Stannars Jose";

	public String getName() {
		return name;
	}

	//final keyword to make parameter constant inside the function
	public void setName(final String name) {
		
		// the final parameter or argument can't be changed or modified
		// within this function
//		name += " MASTER";
		
		this.name = name;		
		
	}

	public Boolean getIsOpenSource() {
		return isOpenSource;
	}

	public void setIsOpenSource(Boolean isOpenSource) {
		this.isOpenSource = isOpenSource;
	}
	
	public void printAllDetails() {
		
		System.out.println("OS Name : "+this.name);
		System.out.println("Open Source : "+this.isOpenSource);
		
	}
	
	// final keyword for a function
	// it restricts modification of a specific function by subclass
	// or in programmatic terms its restricts overriding of a 
	// specific function by the sub or child class
	public final void printOsDetails() {
		
		System.out.println("OS Name : "+this.name);
		System.out.println("Open Source : "+this.isOpenSource);
		
	}
	
	

}
