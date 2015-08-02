package javalab.day11.interfaces.guessingGame;


/**
 * Interface designed to be used by simple games to give output (eg: text 
 * based output or GUI output). Provides methods to allow different displays 
 * depending upon the different stages of the game.
 * 
 * @author jbwatson
 *
 */
public interface OutputInterface {
	
	/**
	 * This method should be used to display any information required at the initialisation 
	 * of the game. 
	 */
	public void displayGameStart();
	
	
	
	/**
	 * This method should be used to display the main menu of a game.
	 */
	public void displayMainMenu();
	
	
	
	/**
	 * This method should be used to display the state of the game.
	 */
	
	public void displayGameState();
	
	
	
	/**
	 * This method should be used to display information after the end conditions
	 * of the game have been met.
	 */
	public void displayWin();
	
	
	
	/**
	 * This method should be used to display information if the end conditions of the 
	 * game haven't been met.
	 */
	public void displayLose();
	
	
	
	/**
	 * This method should be used to display any information required at the end of the game.
	 */
	public void displayGameEnd();

}
