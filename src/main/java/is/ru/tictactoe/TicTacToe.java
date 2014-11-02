package is.ru.tictactoe;

import java.util.Scanner;


public class TicTacToe
 {

        public Grid grid;
        private boolean isX;


        public TicTacToe()
        {
                this.grid = new Grid();
                this.isX = true;
        }
        
        
        public boolean override(int index, String str)
        {
        	if(str.charAt(index) == 'X' || str.charAt(index) == 'O')
        	{
        		throw new IllegalArgumentException("This field is occupied");
        	}
        	return false;
        }

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
                        throw new IllegalArgumentException("Invalid input");
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
                System.out.println("Welcome to ALTARIS Tic Tac Toe");
                TicTacToe ttt = new TicTacToe();
                Scanner in = new Scanner(System.in);
                int newLineCounter = 0;
                int rounds = 0;
                char XO = 'X';
                while(rounds < 9)
                {
                        //Double for loop that prints out the grid correctly.
                        for(int i = 0; i < 9; i++)
                        {
                                newLineCounter++;
                                System.out.print(ttt.grid.Board[i]);
                                if(newLineCounter % 3 == 0)
                                {
                                      System.out.println();
                                }
                                
                        }
                        
                        
                        if(ttt.isX)
                        {
                                System.out.println("X's move");
                                ttt.isX = false;
                                XO = 'X';
                        }
                        else
                        {
                                System.out.println("O's move");
                                ttt.isX = true;
                                XO = 'O';
                        }

                        int input = in.nextInt();
                        ttt.override(input, ttt.grid.toString());
                        	
                        ttt.moveXO(XO, input);
                        if(ttt.checkForWinner(ttt.grid.toString()))
                        {
                        	for(int i = 0; i < 9; i++)
                            {
                                    newLineCounter++;
                                    System.out.print(ttt.grid.Board[i]);
                                    if(newLineCounter % 3 == 0)
                                    {
                                          System.out.println();
                                    }  
                            }
                        	if(!ttt.isX)
                        	{
                        		System.out.println("X IS THE WINNER! CONGRATULATIONS MR.X");
                        	}
                        	else
                        	{
                        		System.out.println("O IS THE WINNER! CONGRATULATIONS MR.O");
                        	}
                        	return;
                        }
               
                        

                        rounds++;
                        
                }
                
            	for(int i = 0; i < 9; i++)
                {
                        newLineCounter++;
                        System.out.print(ttt.grid.Board[i]);
                        if(newLineCounter % 3 == 0)
                        {
                              System.out.println();
                        }
                        
                }
                System.out.println("It's a draw!");
                in.close();
        }
}
