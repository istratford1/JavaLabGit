package javalab.day11.interfaces.lottery;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LotteryWeek {

	int[][] arr= new int[7][7];

	MyLotteryIO myLotteryIO = new MyLotteryIO();
	
	
	public void loadWeek() throws IOException{
		
		myLotteryIO.loadTheWeek(arr);
		
	}
	
     public void saveWeek() throws IOException{
		
		myLotteryIO.saveTheWeek(arr);
		
	}
	
	public void showNums(String msg){
		
		System.out.println(msg);
		
		int maxLength = arr[0].length;
		for(int i = 0 ; i < maxLength; i++){
		  System.out.println("Set " + (i + 1));
			for(int a = 0; a < maxLength; a++){
			  
				System.out.print(arr[i][a] + ",");
			  
		  }
			
			  System.out.println("\n");
					
		}
		
		System.out.println("**************");
		
	}
	
	
	public LotteryWeek() {
		// seven sets of lottery nums incl bonus ball..
		
	}

	public void generateWeek(){

		int maxLength = arr[0].length;
		for(int i=0; i < maxLength;i++ ){  // outer bounds of array
			arr[i] = generateSet(); // inner bounds
				
		}
		
				
		
	}


	private int[] generateSet(){
		
		List<Integer> arrLotteryNums = new ArrayList<Integer>(); // type safe array of integers
		
		
		/// fill the array with lotto numbers

		for(int i=1; i <= 6; i++){
			int newNum = randomValue(1,50);
			
			while(arrLotteryNums.contains(newNum)){ ///make sure that it isn't in the list...
			  newNum = randomValue(1,50); // it was in the list, so generate a new number
					
			}
			
			arrLotteryNums.add(newNum);
			
		}
				
		/// sort the lottery numbers into order...
		Collections.sort(arrLotteryNums);
		

		// now get the unique bonus ball
	
		int bonusBall = randomValue(1,50);
		while(arrLotteryNums.contains(bonusBall)){ ///make sure that it isn't in the list...
		  bonusBall = randomValue(1,50); // it was in the lottery array  list, so change for a new ball
		}
		arrLotteryNums.add(bonusBall);
	
		
		return buildIntArray(arrLotteryNums);
		
	}

	
	private int[] buildIntArray(List<Integer> integers) {
	    int[] ints = new int[integers.size()];
	    int i = 0;
	    for (Integer n : integers) {
	        ints[i++] = n;
	    }
	    return ints;
	}
	
	/// simple random number generator that gives a random value between two ranges
	// INPUT: minValue , maxValue
	
	static int randomValue(int minValue, int maxValue)
	{
	   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
	   
	   return (int)(Math.random() * range) + minValue;
	}


	


	
}
