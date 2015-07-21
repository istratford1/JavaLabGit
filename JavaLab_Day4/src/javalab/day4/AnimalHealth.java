package javalab.day4;
import java.util.*;
public class AnimalHealth {

	
	private Integer healthPerc;
	private Date lifeExpectancy;
	private Boolean isAlive;
	
	
	
	/// default constructor
	public AnimalHealth(){
		
		
		
		
	}
	
	/// overload, adds baseline life expectancy 
		public AnimalHealth(Date baselineLifeExpectancy){
			
		healthPerc = randomValue(1,100);	
		setLifeExpectancy(baselineLifeExpectancy, healthPerc); 	
			
		}
		

	
		
   
		
		
	
	private void setLifeExpectancy(Date baselineLifeExpectancy, int healthPerc){
		/// get the current number of milliseconds from the baseline
		long msBaseline = baselineLifeExpectancy.getTime();
		lifeExpectancy.setTime(msBaseline * (100 / healthPerc));
		
	}
	
	/// simple random number generator that gives a random value between two ranges
	// INPUT: minValue , maxValue
	
	static int randomValue(int minValue, int maxValue)
	{
	   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
	   
	   return (int)(Math.random() * range) + minValue;
	}
	
	
	
}
