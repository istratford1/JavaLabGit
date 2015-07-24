package javalab.day6.vehiclesOOP;

import java.util.Date;

public class Bicycle extends Vehicle{

	
	
	// unique to bicycle
	private boolean hasRepairKit;


	private String tyreWidth;
	private Integer frameSize;
	private String bikeType;
	
	

	public Bicycle() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Bicycle(String purchaseDate, Integer conditionPerc) {
		super(purchaseDate, conditionPerc);
		// TODO Auto-generated constructor stub
	}




	public Bicycle(String colour, String make, String model,double purchasePrice, Integer conditionPerc, String purchaseDate,boolean hasRepairKit, String tyreWidth, Integer frameSize,	String bikeType) {
		super(colour, make, model, purchasePrice, conditionPerc, purchaseDate);
		this.hasRepairKit = hasRepairKit;
		this.tyreWidth = tyreWidth;
		this.frameSize = frameSize;
		this.bikeType = bikeType;
		
	}




	public Bicycle(String purchaseDate) {
		super(purchaseDate);
		// TODO Auto-generated constructor stub
	}




	@Override
	public void showStuff(){
		
		System.out.println("***Bicycle***");
		super.showStuff();
		System.out.println(noNullMsg("Has repair kit ",hasRepairKit));
		System.out.println(noNullMsg("Bike type ",bikeType));
		System.out.println(noNullMsg("Frame size " , frameSize));
		System.out.println(noNullMsg("Tyre width " , tyreWidth));
			
				
		
		
		
	}
	

	
}
