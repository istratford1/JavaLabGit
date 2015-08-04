package javalab.day11.interfaces.guessingGame;

import java.util.Random;

public class Game {





	private int rndGuess;
	
	private int maxGuess;
	private int numGuess;

	
	private int currentGuess;
	private boolean correctGuess;

	private int difficulty;




	// default constructor
	public Game() {
		rndGuess = new Random().nextInt(10) + 1;
		correctGuess = false;
		numGuess = 0;
		currentGuess = 0;

	    

	}

			
	public boolean isFinished(){
		return (isCorrectGuess() || numGuess >= maxGuess) ;
				
	}
	
	public int getScore(){
		if (correctGuess) {
			return (9 - numGuess) * difficulty; 
		}else{
	
			return  0;	
			
		}
		
	}

	public void setDifficulty(int d){
		this.difficulty = d;
		this.maxGuess = (10-difficulty);
		
		
	}
	
	
	public void setRndGuess(int rndGuess) {
		this.rndGuess = rndGuess;
	}

	public int getMaxGuess() {
		return maxGuess;
	}

	public void haveGuess(int guess){
		
		 this.currentGuess = guess;
		 numGuess ++;
		
	}
	
     public boolean isCorrectGuess(){
    	 
    	 return (this.currentGuess== rndGuess);
		   	    	 
    	 
     }


     public int getNumGuess() {
 		return numGuess;
 	}


	public void setNumGuess(int numGuess) {
		this.numGuess = numGuess;
	}



	}


	   



	
	
	
	
	

