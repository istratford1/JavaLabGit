package javalab.day6.cyberpetOOP;

public class Cyberpet{

	
	/**
	Cyberpet class
	Play ? reduces energy / increases hunger?

			Feed

			Sleep

			IsAlive ? Check whether your pet is dead or not.
	**/
	
	private int health;
	private int energy;
	private int hunger;
	private String petName;
	
	
	

	// default constructor
	public Cyberpet(){
		health = randomValue(1,100);
		energy = randomValue(10,80);
		hunger = randomValue(20,60);
		
	}
	
	// overload with pet name, send random age to animal subclass
	public Cyberpet(String petName){
	
		this.petName = petName;
		
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public String getPetName() {
		return petName;
	}

	
	public void addEnergy(int qty){
		
		if(energy+qty <100){
			energy =+ qty;
		}
		
	}
	
   public void addHunger(int qty){
		
		if(hunger+qty <100){
			hunger =+ qty;
		}
		
	}
	
   public void addHealth(int qty){
		
		if(health+qty <100){
			health =+ qty;
		}
					
	}
		
	
   
	
	
	
	// eat a random amount
	public void feed(){
	
		int foodQty = randomValue(1,20);
		if(health>=0 && health <=25) foodQty = (foodQty *2);
		
		addEnergy(foodQty);
		addHunger(-foodQty);	
		addHealth(randomValue(10,foodQty));
			
	}
		
		
	// play a random amount
	public void play(){
			
		int playQty = randomValue(5,25);
			
		if(health>=50 && health <=100) playQty = (playQty *2);
			
		addEnergy(-playQty);
		addHunger(playQty);	
		addHealth(randomValue(1,playQty));
				
	}
			
	
	// sleep a random amount
	public void sleep(){
		int sleepQty = randomValue(1,20);
			
		addEnergy(sleepQty);
		addHunger(-sleepQty);	
		addHealth(randomValue(-5,sleepQty));
			
    }
		
	
	public String getStatusStr(){
		
		StringBuilder statusStr = new StringBuilder();
		statusStr.append(System.getProperty("line.separator")); // newline
		statusStr.append("Health: " + health + " Energy " + energy + " Hunger: " + hunger);
		
		return statusStr.toString();
		
		
	}
	
	public void doStuff(){
		System.out.println("Cyberpet " + getPetName());
		
		
	}
	
	public boolean isSick(){
		return (health>=0 && health <=25);
	}
	
	
	
	public boolean isAlive(){
		return (health>=0);
	}
	
	
	
	 /// simple random number generator that gives a random value between two ranges
	// INPUT: minValue , maxValue
	
	 static int randomValue(int minValue, int maxValue)
	{
	   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
	   
	   return (int)(Math.random() * range) + minValue;
	}

	
	
		
}
