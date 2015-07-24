package javalab.day6.vehiclesOOP;

import java.util.Date;

public class Car extends Vehicle{



	// unique to car
	private Integer numSeats;
	private boolean hasStereo;
	private boolean hasLeatherSeats;
	
	
	public Car() {
		super();

	}

	public Car(String purchaseDate, Integer conditionPerc) {
		super(purchaseDate, conditionPerc);
	
	}
 
	// huge constructor...
	public Car(String colour, String make, String model, double purchasePrice,Integer conditionPerc, String purchaseDate,Integer numSeats, boolean hasStereo) {
		super(colour, make, model, purchasePrice, conditionPerc, purchaseDate);
		this.numSeats = numSeats;
		this.hasStereo = hasStereo;
		
		
	}

	public Car(String purchaseDate) {
		super(purchaseDate);
	
	}



	public Car(Integer numSeats, boolean hasStereo) {
		super();
		this.numSeats = numSeats;
		this.hasStereo = hasStereo;
	}

	@Override
	public void showStuff(){
		System.out.println("******  CAR *********");
		super.showStuff();
		System.out.println(noNullMsg("Seats" , numSeats));
		System.out.println(noNullMsg("Stereo", hasStereo));
		System.out.println(noNullMsg("LeatherSeats", hasLeatherSeats));
		
			
		
		
		
	}
	

				
		
	
	
}
