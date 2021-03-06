package javalab.day7.guessingGame;

import java.util.Random;

public class Game {



	// init the game object (sets rnd number, num guesses)
	// 

	ConsoleGUI gui;

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
		gui = new ConsoleGUI();

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

	public String getUserName(){
		gui.ShowMsg("Please enter your name");
		return gui.getUserString();
	}

	public boolean carryOn(){
		gui.ShowMsg("Do you want to continue");
		return gui.getYesNo();
	}


	// runs the game. displays the menu and ask for difficualty
	// then iterates around asking the user to guess
	// breaks when the correct value is found

	public void RunGame(){

		numGuess = 0;
		int guess;
		gui.ShowMsg("Please select difficulty 1-9");
		difficulty = gui.getUserInt(); // difficulty
		setMaxGuess();


		// test if the user has guessed correctly..
		do {
			numGuess ++;
			gui.ShowMsg("You have " + (getMaxGuess() - numGuess) + " guesses remaining");

			guess = gui.getUserInt();

			if(guess == rndNumber){
				correctGuess = true;
				break;
			}
		

		} while ((guess != rndNumber) && (numGuess < maxGuess));



	}


	public void ShowPlayerResult(){


		if(correctGuess &&  (!outOfGuesses)){
			// success
			gui.ShowMsg("Well done, you guessed correctly in " + numGuess + " guesses");
		} else{			
			// too many guesses, or not correct
			gui.ShowMsg("Sorry, you didn't win this time");
			
		}	


	}

	public void showHighScore(String highScoreName, int highScoreValue) {

		if(highScoreValue > 0){
			if (highScoreName != "" || highScoreName !=null){
				gui.ShowMsg("Current high score of " + highScoreValue + " was set by " + highScoreName);
			} else {	
				gui.ShowMsg("Current high score of " + highScoreValue );	

			}
		}

	}


	   



	
	
	
	
	
}
