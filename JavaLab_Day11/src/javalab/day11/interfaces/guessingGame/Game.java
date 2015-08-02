package javalab.day11.interfaces.guessingGame;

import java.util.Random;

public class Game {



	// init the game object (sets rnd number, num guesses)
	// 

	TextInputGUI inputGui;
	TextOutputGUI outputGUI;
	

	private int rndNumber;
	private int maxGuess;
	private int numGuess;
	private boolean correctGuess;
	private boolean outOfGuesses;
	private int difficulty;




	// default constructor
	public Game() {
		rndNumber = new Random().nextInt(10) + 1;
		correctGuess = false;
		numGuess = 0;
	

	}

	public int getScore(){
		if (correctGuess) {
			return (9 - numGuess) * difficulty; 
		}else{
	
			return  0;	
			
		}
		
	}

	public void setMaxGuess(){
		this.maxGuess = (9 - difficulty);  

	}

	public int getMaxGuess(){
		return this.maxGuess;  

	}






	// runs the game. displays the menu and ask for difficualty
	// then iterates around asking the user to guess
	// breaks when the correct value is found

	public void RunGame(){

		numGuess = 0;
		int guess;
        outputGUI.displayGameStart();
		difficulty = inputGui.getUserInt(); // difficulty
		setMaxGuess();


		// test if the user has guessed correctly..
		do {
			numGuess ++;
			
			guess = inputGui.getUserInt();

			if(guess == rndNumber){
				correctGuess = true;
				break;
			}
		

		} while ((guess != rndNumber) && (numGuess < maxGuess));



	}



	}


	   



	
	
	
	
	

