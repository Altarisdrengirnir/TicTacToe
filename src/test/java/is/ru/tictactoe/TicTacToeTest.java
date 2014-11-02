package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
	public static void main(String args[])
	{
	      org.junit.runner.JUnitCore.main("tictactoe.TicTacToeTest");
	}
	
	@Test
	public void testEmptyBoard() throws Exception
	{
		Grid grid = new Grid();
		assertEquals("012345678", grid.toString());
	}

	@Test
	public void testMove() throws Exception
	{
		TicTacToeMain ttt = new TicTacToeMain();
		assertEquals("0123X5678", ttt.moveXO('X', 4));
		assertEquals("0O23X5678", ttt.moveXO('O', 1));
		assertEquals("XO23X5678", ttt.moveXO('X', 0));
	}
	
	@Test
	public void testMove2() throws Exception
	{
		TicTacToeMain ttt = new TicTacToeMain();
		assertEquals("X12345678", ttt.moveXO('X', 0));
		assertEquals("X123O5678", ttt.moveXO('O', 4));
		assertEquals("X12XO5678", ttt.moveXO('X', 3));
	}
	
	@Test
	public void testCheckForOutOfBounds() throws Exception
	{
		TicTacToeMain ttt = new TicTacToeMain();
		assertFalse(ttt.checkForOutOfBounds(69));
		assertTrue(ttt.checkForOutOfBounds(5));
	}

}
