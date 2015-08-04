package javalab.day11.interfaces.guessingGame;

public class GameManager {

	
	static TextInputGUI inputGUI = new TextInputGUI();
	
	static TextOutputGUI outputGUI = new TextOutputGUI();
	
	
	static Game game;
	
	
	public static void main(String[] args){
		
		game = new Game();
		
		outputGUI.displayGameStart();
	
		outputGUI.displayMainMenu();
		game.setDifficulty(inputGUI.getUserInt());
		
		do{
		
		outputGUI.displayGameState();
		
		game.haveGuess(inputGUI.getUserInt());
		
		} while ( ! game.isFinished());
		
		
		if (game.isCorrectGuess()){
			outputGUI.displayWin();
		} else {
			outputGUI.displayLose();
			
		}
			
		
		
		outputGUI.displayGameEnd();
		
		
	}
	
	
	
	public GameManager() {
		// TODO Auto-generated constructor stub
	
	
	}
	

	
}
