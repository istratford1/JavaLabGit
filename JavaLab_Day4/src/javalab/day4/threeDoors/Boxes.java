package javalab.day4.threeDoors;

import java.util.*;


public class Boxes {


	static List<String> listBoxes = new ArrayList<String>(2);
	
	
	// default constructor
	public Boxes(){
		// set rnd goat box
		setRndPrizeBox();
		
		
	}
	
	// get box contents (ndx)

	 public String getBoxContents(int ndx){
		 		 
		 return listBoxes.get(ndx-1);
		 
	 }
	
	/// switch boxes
		public int switchBoxes(int playerBox, int randomGoatBox){
		  return  (6 - (playerBox + randomGoatBox));
			
	}	 

	 
	// return simple array of box nums 
	public int[] allBoxNums(){
		int[] a = {1,2,3};
		return a;
	}
	
	/// random goat box
	public int randomGoat(){
		int[] a = new int[2];
		for(int i=0 ; i<2; i++){
		   if(listBoxes.get(i) == "Goat"){
			  a[i] = i; 
		   }
			
		}
		
		return 1+ a[randomValue(0,1)];
	}
	 
	
	 
	 // set rnd box contents
	
	 static void setRndPrizeBox(){
		 int rndPrizeNdx = randomValue(1,3);
		 /// loop through array
		 for(int i =0; i<=2;i++){
			 if(i == (rndPrizeNdx-1)){
				 listBoxes.add("Car");
				 
			 } else{
				 listBoxes.add("Goat");
			 }
		 
		 }
	 }
	 
	
	
	
	
	 
	 
   /// simple random number generator that gives a random value between two ranges
	// INPUT: minValue , maxValue
	
	static int randomValue(int minValue, int maxValue)
	{
	   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
	   
	   return (int)(Math.random() * range) + minValue;
	}
	
	
}
