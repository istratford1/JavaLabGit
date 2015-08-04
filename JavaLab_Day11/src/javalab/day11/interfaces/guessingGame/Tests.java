package javalab.day11.interfaces.guessingGame;
import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
	

	/// first test that the number of guesses matches the difficulty.....
	@Test
	
	public void testDifficulty(){
		Game g = new Game();
	
		// for each difficulty level (1-9) 
		// the number of guesses should decrease proportionally
		/// eg diff 1 = 9 guesses
		//  eg diff 10 = 1 guesses
		
		for(int i=1; i <=9; i++){
			g.setDifficulty(i);
			
			assertEquals(10-i,g.getMaxGuess());
			
			
			
			
		}
		
		

	}

	
	@Test
	public void testCorrectGuess(){
		Game g = new Game();
		g.setDifficulty(1);
		 
		
		for(int d=1; d<=10; d++){
			/// set the number to guess, reset the number of guesses made..
			g.setRndGuess(d);
			g.setNumGuess(0);
				
			for(int i=1; i <=9; i++){
				// have a guess
				g.haveGuess(i); /// this also increments the num of guesses
			    
				// was the number guessed in the correct number of guesses?
				if(g.isCorrectGuess()){
					assertEquals(d,g.getNumGuess());
					
				}
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		

	}

	
	
			
			
			
			
			
		
		
}
