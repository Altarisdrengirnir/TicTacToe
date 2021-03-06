package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		TicTacToe ttt = new TicTacToe();
		assertEquals("0123X5678", ttt.moveXO('X', 4));
		assertEquals("0O23X5678", ttt.moveXO('O', 1));
		assertEquals("XO23X5678", ttt.moveXO('X', 0));
	}
	
	@Test
	public void testMove2() throws Exception
	{
		TicTacToe ttt = new TicTacToe();
		assertEquals("X12345678", ttt.moveXO('X', 0));
		assertEquals("X123O5678", ttt.moveXO('O', 4));
		assertEquals("X12XO5678", ttt.moveXO('X', 3));
	}
	
	@Test
	public void testCheckForWinner() throws Exception
	{
		assertTrue(new TicTacToe().checkForWinner("XXX345OO8"));
		assertFalse(new TicTacToe().checkForWinner("012345678"));
		assertTrue(new TicTacToe().checkForWinner("012OOO678"));
		assertTrue(new TicTacToe().checkForWinner("O123O567O"));
		assertFalse(new TicTacToe().checkForWinner("012345678"));
	}
	
	
	@Test
	public void testOverride() throws Exception
	{
		assertFalse(new TicTacToe().override(5, "0123X5678"));
	}

	@Test(expected=Exception.class)
	public void testToLargeInput()
	{
		TicTacToe ttt = new TicTacToe();
		ttt.moveXO('X', 23);
		ttt.moveXO('O', 100);
	}
	
	@Test(expected=Exception.class)
	public void testOverridefails()
	{
		TicTacToe ttt = new TicTacToe();
		ttt.override(5, "01234X678");
		ttt.override(5, "XXXXXXXXX");
		ttt.override(0, "O12345678");
	}	
	
	@Test
	public void testMorewinners()
	{	
		assertTrue(new TicTacToe().checkForWinner("X1XOOO6X8"));
		assertTrue(new TicTacToe().checkForWinner("O12O45O78"));
		assertFalse(new TicTacToe().checkForWinner("OXOXO5678"));
	}
}
