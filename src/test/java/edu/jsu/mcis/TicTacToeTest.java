package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest{
	
	@Test
	public void testGameBoardToSeeIfIsEmpty(){
		TicTacToe board = new TicTacToe();
		for(int row = 0; row < 3; row++) {
			for(int column=0; column< 3; column++) {
				board.markBoard(row, column, "X");
				assertEquals(board.getLocation(row, column), "X");
			}
		}
	}

	@Test
	public void testInput(){
		TicTacToe view = new TicTacToe();
		assertEquals(view.getInput(),1);
	}
	
	
	
	
	
	
	
	/*
	@Test
	public void testlocationOfMarkInBoard(){
		game.markAtThisLocation(1,1);
		assertEquals(TicTacToe.markBoard.X, game.markLocation(1,1));
		game.markAtThisLocation(0,1);
		assertEquals(TicTacToe.markBoard.O, game.markLocation(0,1));
		game.markAtThisLocation(0,0);
		assertEquals(TicTacToe.markBoard.X, game.markLocation(0,0));
		game.markAtThisLocation(0,2);
		assertEquals(TicTacToe.markBoard.O, game.markLocation(0,2));
		game.markAtThisLocation(2,2);
		assertEquals(TicTacToe.markBoard.X, game.markLocation(2,2));
	
	}
*/

	
	
}

