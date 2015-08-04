import java.util.Scanner;

/**
 * Controls the Game. Involves getting the move from the player and updating the board until
 * the game is won.
 * 
 * @author JBWatson
 *
 */
public class Game {

	private int player;
	public Board board;
	private Scanner input = new Scanner(System.in); 
	
	/**
	 * Constructor
	 */
	public Game() {
		player = 1;
		board = new Board();
	}
	
	/**
	 * Alternates between Player 1 and Player 2
	 */
	public void changePlayer(){
		
		if( this.getPlayer() == 1 )
			this.setPlayer(2);
		
		else if( this.getPlayer() == 2 )
			this.setPlayer(1);
		
	}

	/**
	 * Primary function that controls the game. Loops indefinitely, getting player moves, until
	 * either the game is won or the board is full. When either of these occur, the loop is broken
	 * and the game ends.
	 */
	public void playGame() {
		
		System.out.println("----- Welcome to Noughts and Crosses -----");
		board.displayBoard();
		System.out.println("Player 1 is crosses, Player 2 is noughts ... ");
		System.out.println();		
		
		while( true ){
			
			this.getMove();
			board.displayBoard();
			if( board.checkWinner() ){
				System.out.println("Player " + this.getPlayer() + " has won the game!!!");
				break;
			}
			if( board.isBoardFull() ){
				System.out.println("Board is full! Please start another game!");
				break;
			}
			this.changePlayer();
			
		}
		
	}
	
	/**
	 * Gets Player move from System.in. Validates move before updating the board
	 */
	public void getMove(){
		
		int row, col;
		
		System.out.println("Player " + this.getPlayer() + " please enter row (1-3) of your move:");
		row = input.nextInt();
		
		System.out.println("Player " + this.getPlayer() + " please enter column (1-3) of your move:");
		col = input.nextInt();
		
		if( !isValidMove( row, col ) ){
			System.out.println("That isn't a valid move!");
			this.getMove();
		}
		else if( !board.isSpaceEmpty( row, col ) ){
			System.out.println("That space is already filled!");
			this.getMove();
		}
		else
			board.makeMove(row, col, this.getPlayer());
		
	}
	
	/**
	 * Checks requested moe is in the correct range
	 * 
	 * @param row		-	Requested row of move
	 * @param col		-	Requested column of move
	 * @return			-	 true if valid, false otherwise
	 */
	private static boolean isValidMove(int row, int col) {
		
		return( row >= 1 && row <= 3 ) && ( col >= 1 && col <= 3 );
		
	}

	/**
	 * Main method starts the game
	 * 
	 * @param args		-	not used
	 */
	public static void main(String[] args) {
		Game g = new Game();
		g.playGame();
	}
	
	// Getters and setters for player field
	//
	public int getPlayer(){
		return this.player;
	}
	
	public void setPlayer(int player){
		this.player = player;
	}
	
}
