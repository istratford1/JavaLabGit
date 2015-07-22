package javalab.day4.animals;

public class Day4_Animals {

	public static void main(String[] args){
		
		
		
		Dog fidoDog = new Dog("Fido",randomValue(1,15),randomValue(1,100));
		Fish goldieFish = new Fish("Goldie",randomValue(1,2),randomValue(1,100));
		Snake sidSnake = new Snake("Sid",randomValue(1,5),randomValue(1,100));
		
		
		fidoDog.doStuff();
		goldieFish.doStuff();
		sidSnake.doStuff();
		
		
	}
	

	
	
	   /// simple random number generator that gives a random value between two ranges
		// INPUT: minValue , maxValue
		
		static int randomValue(int minValue, int maxValue)
		{
		   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
		   
		   return (int)(Math.random() * range) + minValue;
		}
		
	
}
