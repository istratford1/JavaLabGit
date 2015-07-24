package javalab.day6.vehiclesOOP;

import java.util.Date;

public class Boat extends Vehicle{
	

	// unique to boat
	private Integer yearsAtSea;
	private String boatType;
	private boolean hasRadar;
	private boolean hasSeaDog;
	private boolean hasCabinBoy;
	
	
	
	

	public Boat() {
		super();

	}





	public Boat(String purchaseDate, Integer conditionPerc) {
		super(purchaseDate, conditionPerc);
	
	}





	public Boat(String colour, String make, String model, double purchasePrice,Integer conditionPerc, String purchaseDate,
			   Integer yearsAtSea, String boatType, boolean hasRadar,boolean hasSeaDog, boolean hasCabinBoy) {
		super(colour, make, model, purchasePrice, conditionPerc, purchaseDate);
		this.yearsAtSea = yearsAtSea;
		this.boatType = boatType;
		this.hasRadar = hasRadar;
		this.hasSeaDog = hasSeaDog;
		this.hasCabinBoy = hasCabinBoy;
		
	}





	public Boat(String purchaseDate) {
		super(purchaseDate);
	
	}





	public void showStuff(){
		
		System.out.println("***  Boat   ***");
		super.showStuff();
		System.out.println(noNullMsg("Boat Type " ,boatType));
		System.out.println(noNullMsg("Has Radar ",hasRadar));
		System.out.println(noNullMsg("Has SeaDog ",hasSeaDog));
		System.out.println(noNullMsg("Has Cabin boy ",hasCabinBoy));
		System.out.println(noNullMsg("Year at sea ",yearsAtSea));
		
			
				
	}
		



	
	
}
