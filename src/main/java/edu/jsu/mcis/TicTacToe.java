package edu.jsu.mcis;

import java.util.*;
import java.lang.*;

public class TicTacToe{
	
	public String[][] arr = new String[3][3];
	public String playerOne = "X";
	public String playerTwo = "O";
	
	
	public void markBoard (int r, int c, String side)
	{
		arr[r][c] = side;
	}
	public TicTacToe() 
	{
		createdBoard();
	}
	public void createdBoard ()
	{
		for(int row = 0; row < 3; row++) 
		{
			for(int column=0; column < 3;column++)
			{
				arr[row][column]=" ";
			}
		}
	}
	public String getLocation(int row ,int column){
		String s = arr[row][column];
		return s;
	}
}