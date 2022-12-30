package classes;

//consider can't be modified (complied class)
public class OperatingSystem {

	private String name;
	private Boolean isOpenSource;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsOpenSource() {
		return isOpenSource;
	}

	public void setIsOpenSource(Boolean isOpenSource) {
		this.isOpenSource = isOpenSource;
	}
	
	public void printDetails() {
		
		System.out.println("OS Name : "+this.name);
		System.out.println("Open Source : "+this.isOpenSource);
		
	}

}
