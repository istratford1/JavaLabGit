import static org.junit.Assert.*;

import org.junit.Test;


public class ProjectTests {
	
	Board b = new Board();

	@Test
	public void Col_1_Win_X_Test() {
		b.makeMove(1, 1, 1);
		b.makeMove(2, 1, 1);
		b.makeMove(3, 1, 1);
		assertTrue(b.checkWinner());
	}
	
	@Test
	public void Col_2_Win_X_Test() {
		b.makeMove(1, 2, 1);
		b.makeMove(2, 2, 1);
		b.makeMove(3, 2, 1);
		assertTrue(b.checkWinner());
	}
	
	@Test
	public void Col_3_Win_O_Test() {
		b.makeMove(1, 3, 2);
		b.makeMove(2, 3, 2);
		b.makeMove(3, 3, 2);
		assertTrue(b.checkWinner());
	}
	
	@Test
	public void Row_1_Win_X_Test() {
		b.makeMove(1, 1, 1);
		b.makeMove(1, 2, 1);
		b.makeMove(1, 3, 1);
		assertTrue(b.checkWinner());
	}
	
	@Test
	public void Row_2_Win_X_Test() {
		b.makeMove(2, 1, 1);
		b.makeMove(2, 2, 1);
		b.makeMove(2, 3, 1);
		assertTrue(b.checkWinner());
	}
	
	@Test
	public void Row_3_Win_O_Test() {
		b.makeMove(3, 1, 2);
		b.makeMove(3, 2, 2);
		b.makeMove(3, 3, 2);
		assertTrue(b.checkWinner());
	}
	
	@Test
	public void Left_Diagonal_Win_X_Test() {
		b.makeMove(1, 1, 1);
		b.makeMove(2, 2, 1);
		b.makeMove(3, 3, 1);
		assertTrue(b.checkWinner());
	}
	
	@Test
	public void Right_Diagonal_Win_X_Test() {
		b.makeMove(1, 3, 1);
		b.makeMove(2, 2, 1);
		b.makeMove(3, 1, 1);
		assertTrue(b.checkWinner());
	}

}
