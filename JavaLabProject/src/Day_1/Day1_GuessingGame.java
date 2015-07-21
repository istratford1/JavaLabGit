package Day_1;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Day1_GuessingGame {

	
	public static void main(String args[]){
		
		final int MAX_GUESS = 4;

		// create the scanner object
		Scanner keyInput = new Scanner(System.in);
		out.print("Guess a number from 1 to 10. You have 4 attempts...");
		// get input from user
		int inNumber = keyInput.nextInt();
		// generate a random number from 1 to 10
		int rndNumber = new Random().nextInt(10) + 1;
        
		int numGuesses = 1;

		// test if the user has guessed correctly..
		while ((inNumber != rndNumber) && numGuesses <= MAX_GUESS ){
			// not equal to the random number, so guess again...
			out.println("Sorry, wrong answer");
			numGuesses++;
			inNumber = keyInput.nextInt();
		
		} // end while loop
		
		if((numGuesses <= MAX_GUESS)){
		  // success !
			out.println("*********");
			out.println("***Well DONE**");
			out.println(inNumber + " was correct!!!");
			out.println("You got it in "+ numGuesses + " Guesses");
			out.println("Thanks for playing");
						
			
		} else{			
				out.println("SORRY :(");
				out.println("Max number of guesses was reached**");
				out.println(rndNumber + " was the correct one");
				out.println("Thanks for playing");
					
		 }	
		
		keyInput.close();
		// close unused resources
	
	}
			
	
}
	
	

