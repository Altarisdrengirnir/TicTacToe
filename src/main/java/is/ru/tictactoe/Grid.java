package is.ru.tictactoe;

public class Grid 
{
	private final int SIZE = 9;
	public char[] Board;
	
	public Grid()
	{
		Board = new char[SIZE];
		this.Board = "012345678".toCharArray();
	}
	
	public String toString()
	{
		return new String(Board);
	}
}
