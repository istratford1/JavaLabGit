package javalab.day6.vehiclesOOP;



public class SportsCar extends Car {


	
	/// unique to sports car
	private Integer trackDaysComplete;
	private Integer trophiesCount;
	



	public SportsCar() {
		super();
		// TODO Auto-generated constructor stub
	}







	public SportsCar(Integer numSeats, boolean hasStereo) {
		super(numSeats, hasStereo);
		// TODO Auto-generated constructor stub
	}







	public SportsCar(String purchaseDate, Integer conditionPerc) {
		super(purchaseDate, conditionPerc);
		// TODO Auto-generated constructor stub
	}







	public SportsCar(String colour, String make, String model,	double purchasePrice, Integer conditionPerc, String purchaseDate,Integer numSeats, boolean hasStereo,Integer trackDaysComplete, Integer trophiesCount) {
		
		super(colour, make, model, purchasePrice, conditionPerc, purchaseDate,numSeats, hasStereo);
		this.trackDaysComplete = trackDaysComplete;
		this.trophiesCount = trophiesCount;
	
		
	}







	public SportsCar(String purchaseDate) {
		super(purchaseDate);
		// TODO Auto-generated constructor stub
	}




	@Override
	public void showStuff(){
		
		System.out.println("***Sports Car***");
		super.showStuff();
		System.out.println(noNullMsg("Track Days Complete ",trackDaysComplete));
		System.out.println(noNullMsg("Trophie Count ",trophiesCount));
			
	}
		
	
	
	
	
	
	
	
}
