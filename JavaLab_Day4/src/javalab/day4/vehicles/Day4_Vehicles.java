package javalab.day4.vehicles;

import java.util.*;

public class Day4_Vehicles {

	
	public static void main(String[] args){
		
	

	
		Car herbie = new Car("Fiat","Panda","Pink",500.10,"20/10/1979",4);
		SportsCar sporty = new SportsCar("Pontiac","GTO","Red",20000,"18/09/1965",22);
		SportsCar classic = new SportsCar("MG","GT","Racing Green",100000,"01/02/1962",154);
		Bus london = new Bus("RouteMaster", "DT Plus","Red",35000,"01/07/1982",89);	
		Boat seaDog = new Boat("Glazer","X100","White",2000,"10/10/2001");
		Bicycle mike = new Bicycle("Dawes", "EG Dynamic","Blue",289.99,"01/01/2010",21);
		
		
		herbie.showStuff();
		sporty.showStuff();
		classic.showStuff();
		london.showStuff();
		seaDog.showStuff();
		mike.showStuff();
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	   /// simple random number generator that gives a random value between two ranges
		// INPUT: minValue , maxValue
		
		public int randomValue(int minValue, int maxValue)
		{
		   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
		   
		   return (int)(Math.random() * range) + minValue;
		}
		
}
