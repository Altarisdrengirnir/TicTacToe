package is.ru.tictactoe;

import java.util.Scanner;


public class TicTacToeMain
 {
	
	private Grid grid = new Grid();
	public String moveXO(char XO, int index)
	{
		if(checkForOutOfBounds(index))
		{
			grid.Board[index] = XO;
		}
		
		return grid.toString();
	}
	
	private boolean checkForOutOfBounds(int x)
	{
		if(x < 0 || x > 8)
		{
			System.out.println("You entered " +  x + " which is an illeagal input. \nPlease enter a number between 0-8");
			return false;
		}
		return true;
	}
	
	public static void main(String[] arguments)
	{

	}
}
