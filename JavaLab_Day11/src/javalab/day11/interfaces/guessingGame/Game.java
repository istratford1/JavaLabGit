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
		this.maxGuess = (9-difficulty);
		
		
	}
	
	
	
	public void haveGuess(int guess){
		
		 this.currentGuess = guess;
		
	}
	
     public boolean isCorrectGuess(){
    	 
    	 return (this.currentGuess== rndGuess);
		   	    	 
    	 
     }





	}


	   



	
	
	
	
	

