package javalab.day4.threeDoors;

public class Player {

	private String name;
	private boolean isComputer;
	private boolean toSwitch;
	
	
	/// default constructor, assumes computer player 



	public boolean isComputer() {
		return isComputer;
	}


	public Player(){
		isComputer = true;
		name = "Computer Player";
		this.toSwitch = ((randomValue(1,2) == 2));
	}
	
	


	public boolean isToSwitch() {
		return toSwitch;
	}


	public void setToSwitch(boolean toSwitch) {
		this.toSwitch = toSwitch;
	}


	// overload with initial name, assumes human player
	public Player(String _name){
		name = _name;
		isComputer = false;
		
	}
	
	
	

	  /// simple random number generator that gives a random value between two ranges
		// INPUT: minValue , maxValue
		
		static int randomValue(int minValue, int maxValue)
		{
		   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
		   
		   return (int)(Math.random() * range) + minValue;
		}


	
	
	
	
}
