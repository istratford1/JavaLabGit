package javalab.day7.guessingGame;

public class GameManager {

	
	static int highScoreValue;
	static String highScoreName;
	static int difficulty;
		
	
	public static void main(String[] args){
		
		StartGame();
		
	}
	
	
	
	public GameManager() {
		// TODO Auto-generated constructor stub
	
	
	}
	

	
	public static void StartGame(){
		
		Game game = new Game();
		
		do{
		
		
		game.showHighScore(highScoreName, highScoreValue);
		game.RunGame();
		game.ShowPlayerResult();
		if(game.getScore() > highScoreValue){
			// record high score
			highScoreName = game.getUserName();
			highScoreValue = game.getScore();
					}
		
		} while(game.carryOn());
		
	}
	
	
	
}
