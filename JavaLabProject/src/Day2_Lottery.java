
import java.util.*;

public class Day2_Lottery {

	
	public static void main(String[] args){
		
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
		
		// form the string of numbers to show in the output console
		String lotteryString = "";
		
		for(int n=0; n < arrLotteryNums.size(); n++){
		  lotteryString = lotteryString +  arrLotteryNums.get(n).toString() + " " ;
		}
		
		// print the final string to the console
		System.out.println("Lottery numbers: " + lotteryString + " Bonus ball " + String.valueOf(bonusBall) );
		
		
		
	}
	
	/// simple random number generator that gives a random value between two ranges
	// INPUT: minValue , maxValue
	
	static int randomValue(int minValue, int maxValue)
	{
	   int range = (maxValue - minValue) + 1; // gives the total range of values that we need minus the minimum value
	   
	   return (int)(Math.random() * range) + minValue;
	}
	
	
	
	
}
