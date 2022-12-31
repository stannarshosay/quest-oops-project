package classes;

public class Laptop extends OperatingSystem {

	private String brand;
	private Integer price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	
	//Annotation to override a function
	
	@Override
	public void printAllDetails() {
		
		super.printAllDetails();	
		
		System.out.println("Brand : "+this.brand);
		System.out.println("Price : "+this.price);
		
	}
	

}
