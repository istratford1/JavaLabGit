package javalab.day4.vehicles;

import java.util.Date;

public class Car {

	// common to all vehicles	
	private String colour;
	private String make;
	private String model;
	private double purchasePrice;
	private Integer conditionPerc;
	private String purchaseDate;
	
	// unique to car
	private Integer numSeats;
	private boolean hasStereo;
	private boolean hasLeatherSeats;
	
	
	
	// default constructor
	public Car(){
		/// do something here
		conditionPerc = 1 + (int)(Math.random() * ((100 - 1) + 1));

	
	}
	
	


	// overload constructor
	public Car(String _make, String _model, String _colour, double _purchasePrice, String _purchaseDate, Integer _numSeats ){
		
		this(); // call to default constructor
		
		make = _make;
		model = _model;
		colour = _colour;
		purchasePrice = _purchasePrice;
		purchaseDate = _purchaseDate;
		numSeats = _numSeats;	
			
	}
	
	public void showStuff(){
		
		System.out.println("***Car***");
		System.out.println(make + " " + model);
		System.out.println("Purchased on " + purchaseDate + " for £" + purchasePrice);
		System.out.println("Current Condition is " + getConditionStr());
		System.out.println("Num Seats " + numSeats);	
				
		
		
		
	}
	
	private String getConditionStr(){
		
		int p = conditionPerc;
		
		if (p > 1 && p <20){
			/// poor
			return "Poor";			
		} else if(p > 20 && p < 50){
			// not bad
			return "Fair";
			
		} else if (p > 50 && p < 80){
			// good
			return "Good";
		} else if (p > 80 && p < 100){
			// excellent
			return "Excellent";
			
		} else {
			return "Condition Unknown";
			
		}
			
				
	}
	
	
	
}
