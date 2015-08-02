package javalab.day11.interfaces.guessingGame;

public class GameManager {

	
	
	static Game game;
	
	
	public static void main(String[] args){
		
		game = new Game();
		
		game.outputGUI.displayGameStart();
		
		game.RunGame();
		
		game.outputGUI.displayGameEnd();
		
		
	}
	
	
	
	public GameManager() {
		// TODO Auto-generated constructor stub
	
	
	}
	

	
}
