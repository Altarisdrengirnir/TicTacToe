package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

<<<<<<< HEAD
public class TicTacToeTest
{
	
	public static void main(String args[])
	{
	      org.junit.runner.JUnitCore.main("tictactoe.TicTacToeTest");
	}
	
=======
public class TicTacToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }
	@Test
	public void testNumberOne(){
		assertEquals(1, TicTacToeMain.returnOne(1));
	}	
	/*
>>>>>>> 68f4624b27b7fe413d9c93bc560be2b7ff9a8fb5
	@Test
	public void testEmptyBoard() throws Exception
	{
		Grid grid = new Grid();
		assertEquals("012345678", grid.toString());
	}
}
