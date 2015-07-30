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
		gui = new ConsoleGUI();

	}

	public int getScore(){
		if (correctGuess) {
			return numGuess * (10 - maxGuess); 
		}else{
	
			return  0;	
			
		}
		
	}

	public void setMaxGuess(){
		this.maxGuess = (10 - difficulty);  

	}

	public int getMaxGuess(){
		return (10 - difficulty);  

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

		numGuess = 1;
		int guess;
		gui.ShowMsg("Please select difficulty 1-8");
		difficulty = gui.getUserInt(); // difficulty
		setMaxGuess();


		// test if the user has guessed correctly..
		do {
			gui.ShowMsg("You have " + (getMaxGuess() - numGuess) + " guesses remaining");

			guess = gui.getUserInt();

			if(guess == rndNumber){
				correctGuess = true;
				break;
			}
			numGuess ++;

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
