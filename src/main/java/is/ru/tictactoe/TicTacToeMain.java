package is.ru.tictactoe;

import java.util.Scanner;


public class TicTacToeMain
 {
	
	private Grid grid = new Grid();
	private boolean isX = true;
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

	public boolean checkForWinner(String str)
	{
		//Check if we have a winner with vertical tic tac toe.
		if(str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) 
		{
			return true;
		}
		else if(str.charAt(3) == str.charAt(4) && str.charAt(4) == str.charAt(5)) 
		{
			return true;
		}
		else if(str.charAt(6) == str.charAt(7) && str.charAt(7) == str.charAt(8)) 
		{
			return true;
		}
		//Check if we have a winner with horizontal tic tac toe.
		else if(str.charAt(0) == str.charAt(3) && str.charAt(3) == str.charAt(6)) 
		{
			return true;
		}
		else if(str.charAt(1) == str.charAt(4) && str.charAt(4) == str.charAt(7)) 
		{
			return true;
		}
		else if(str.charAt(2) == str.charAt(5) && str.charAt(5) == str.charAt(8)) 
		{
			return true;
		}
		//Check if we have a winner with a diagonal tic tac toe. Also known as a fraud tic tac toe.
		else if(str.charAt(0) == str.charAt(4) && str.charAt(4) == str.charAt(8)) 
		{
			return true;
		}
		else if(str.charAt(2) == str.charAt(4) && str.charAt(4) == str.charAt(6)) 
		{
			return true;
		}
		return false;
	}
	
	public boolean isX(boolean isX)
	{
		if(isX)
		{
			isX = false;
			return true;
		}
		else
		{
			isX = true;
			return false;	
		}
	}
	
	public static void main(String[] arguments)
	{
		
	}
}
