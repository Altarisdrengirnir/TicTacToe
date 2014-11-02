package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest
{
	
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
}
