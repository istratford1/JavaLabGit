package javalab.day6.vehiclesOOP;



public class Bus extends Vehicle{


	
	// unique to bus
	private Integer numPassengers;
	private Integer numDecks;
	private String fuelType;
	
	
	
	
	public Bus() {
		super();
	
	}




	public Bus(String purchaseDate, Integer conditionPerc) {
		super(purchaseDate, conditionPerc);
	
	}


	
	// big constructor

	public Bus(String colour, String make, String model, double purchasePrice,Integer conditionPerc, String purchaseDate,Integer numPassengers, Integer numDecks, String fuelType) {
		super(colour, make, model, purchasePrice, conditionPerc, purchaseDate);
		this.numPassengers = numPassengers;
		this.numDecks = numDecks;
		this.fuelType = fuelType;
	
	}




	public Bus(String purchaseDate) {
		super(purchaseDate);
	
	}




	@Override
	public void showStuff(){
		System.out.println("***** BUS  ******");	
		super.showStuff();
		System.out.println(noNullMsg("Num passengers: " , numPassengers));	
		System.out.println(noNullMsg("Fuel type: " , fuelType));			
		System.out.println(noNullMsg("Num decks: " , numDecks));			
					
		
	}




	@Override
	public void printMaxSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Max speed is 60Mph");
	}

	
}
