import markers.*;

/**
 * Holds board state and can detect when a game is won or the board is full.
 * 
 * @author JBWatson
 *
 */
public class Board {
	
	private Marker[][] board;

	/**
	 * Constructor. Initialise 2D array
	 */
	public Board() {
		resetBoard();
		
	
		
		
	}
	
	public void resetBoard(){
		// initilise array
		board = new Marker[3][3]; // sets the size of array
		for( int i = 0; i < 3; i++ ){						
			for( int j = 0; j < 3; j++ ){				
				board[i][j] = new Blank();		
			}					
			
		}		
	
		
	}
	
	/**
	 * Method responsible for displaying the board in a text format
	 */
	public void displayBoard(){
		
		System.out.println();
		for( int i = 0; i < 3; i++ ){						
			for( int j = 0; j < 3; j++ ){				
				System.out.print("|" + board[i][j].getMark() + "|");			
			}					
			System.out.println();		
		}		
		System.out.println();
	}
	
	/**
	 * Makes move at requested place on the board.
	 * 
	 * @param row		-	Requested row
	 * @param col		-	Requested column
	 * @param player	-	Player 1 or 2 (crosses or noughts)
	 */
	public void makeMove( int row, int col, int player ){
		
		if( player == 1 ){
			board[row-1][col-1] = Cross.getInstance();
		}
		else if( player == 2 ){
			board[row-1][col-1] = Nought.getInstance();
		}
		
	}
	
	/**
	 * Checks if there is a winning line on the board. 
	 * 
	 * @return		-	true if there is a line of 3 markers of the same type, false otherwise
	 */
	public boolean checkWinner() {
		
		int i;
		Cross cross = Cross.getInstance();
		Nought nought = Nought.getInstance();
		
		for( i = 0; i < 3; i++ ){
			
			// Check Columns
			if( board[i][0].equals(cross) && board[i][1].equals(cross) && board[i][2].equals(cross) )
				return true;
			if( board[i][0].equals(nought) && board[i][1].equals(nought) && board[i][2].equals(nought) )
				return true;
			
			// Check Rows
			if( board[0][i].equals(cross) && board[1][i].equals(cross) && board[2][i].equals(cross) )
				return true;
			
			if( board[0][i].equals(nought) && board[1][i].equals(nought) && board[2][i].equals(nought) )
			  return true;
						
		}
		
		// Check Left Diagonal
		if( board[0][0].equals(cross) && board[1][1].equals(cross) && board[2][2].equals(cross) )
			return true;
		if( board[0][0].equals(nought) && board[1][1].equals(nought) && board[2][2].equals(nought) )
			return true;
		
		// Check Right Diagonal
		if( board[0][2].equals(cross) && board[1][1].equals(cross) && board[2][0].equals(cross) )
			return true;
		if( board[0][2].equals(nought) && board[1][1].equals(nought) && board[2][0].equals(nought) )
			return true;
		
		return false;
		
	}
	
	/**
	 * Checks if every space on the board has been filled
	 * 
	 * @return		-	true if board is full, false otherwise
	 */
	public boolean isBoardFull() {
		
		Blank blank = Blank.getInstance();
		
		for( int i = 0; i < 3; i++ ){
			for( int j = 0; j < 3; j++ ){
				
				if( board[i][j].getMark() == blank.getMark() )
					return false;				
			}
		}
		return true;
		
	}


	/**
	 * Checks if a space on the board is filled with a nought or cross.
	 * 
	 * @param row		-	row of requested space
	 * @param col		-	column of requested space
	 * @return			-	true if requested space is blank, false otherwise
	 */
	public boolean isSpaceEmpty(int row, int col) {
		
		Blank blank = Blank.getInstance();
		Marker current = board[row-1][col-1];
	//	return  board[row-1][col-1].equals(Blank.getInstance());
		return  (current.getMark() == (blank.getMark()));
		

	}
}
