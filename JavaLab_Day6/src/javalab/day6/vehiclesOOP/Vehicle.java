package javalab.day6.vehiclesOOP;

public abstract class Vehicle {

	
	// common to all vehicles	
	private String colour;
	
	private String make;
	private String model;
	private double purchasePrice;
	private Integer conditionPerc;
	private String purchaseDate;
	
	public abstract void printMaxSpeed();
	
	// default constructor
	public Vehicle(){
		/// do something here
		conditionPerc = 1 + (int)(Math.random() * ((100 - 1) + 1));

	
	}
	

	// 1st constructor
	public Vehicle(String purchaseDate){
		
		this();
		this.purchaseDate = purchaseDate;
		
    }

	// 2nd constructor
	public Vehicle(String purchaseDate, Integer conditionPerc){
			
		this.conditionPerc = conditionPerc;
		this.purchaseDate = purchaseDate;
		
	}

	// 3rd constructor
	public Vehicle(String colour, String make, String model, double purchasePrice, Integer conditionPerc, String purchaseDate) {
	
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.purchasePrice = purchasePrice;
		this.conditionPerc = conditionPerc;
		this.purchaseDate = purchaseDate;
	}

	
	public void showStuff(){
		
		System.out.println(noNullMsg("Make"  ,make) + " " + noNullMsg("Model" , model));
		System.out.println(noNullMsg("Purchase date" , purchaseDate) + " " + noNullMsg("Purchase price" ,purchasePrice));
		System.out.println("Current Condition is " + getConditionStr());
					
		
	}
	
	public String noNullMsg(String msg, Object o ){
		if(o != null){
		return msg + " " + String.valueOf(o);
		} else{
		  return msg + " has not been recorded"; 
		}
		
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
