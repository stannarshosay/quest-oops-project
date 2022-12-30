package main;

import classes.Bike;
import classes.Car;

public class RunInheritence {

	public static void main(String[] args) {
		
		
		Car tataNano = new Car();
		//come from Vehicle class
		tataNano.setName("Tata Nano");
		tataNano.setPrice(54686786);
		//
		tataNano.setNoOfAirbags(2);
		tataNano.setNoOfDoors(4);
		
		
		Bike harley = new Bike();
		//come from Vehicle class
		harley.setName("Harley Davidson");
		harley.setPrice(13525684);
		//
		harley.setPillionSeat(false);
		harley.setSportsBike(false);
		
		
		System.out.println("CAR\n========");
		System.out.println("Name : "+tataNano.getName());
		System.out.println("Price : "+tataNano.getPrice());
		System.out.println("No of Airbags : "+tataNano.getNoOfAirbags());
		System.out.println("No of Doors : "+tataNano.getNoOfDoors());		
		
		System.out.println("\n\nBIKE\n========");
		System.out.println("Name : "+harley.getName());
		System.out.println("Price : "+harley.getPrice());
		System.out.println("Pillion Seat : "+harley.isPillionSeat());
		System.out.println("Sports Bike : "+harley.isSportsBike());
		

	}

}
