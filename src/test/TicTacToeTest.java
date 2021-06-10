package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Board;

class TicTacToeTest {

	@Test
	@DisplayName("Empty board")
	void testEmpty() {
		Board board = new Board(new String("         ").toCharArray());
		assertEquals(' ', board.analyze(), "Empty board should be continued");
	}
	
	@Test
	@DisplayName("Full board")
	void testFull() {
		Board board = new Board(new String("XOXOOXXXO").toCharArray());
		assertEquals('-', board.analyze(), "Full board should stop");
	}

	@Test
	@DisplayName("X wins horizontally")
	void testXWinsHorizontal() {
		Board board = new Board(new String("XXXOO    ").toCharArray());
		assertEquals('X', board.analyze(), "X wins horizontally");
	}
	
	@Test
	@DisplayName("O wins horizontally")
	void testOWinsHorizontal() {
		Board board = new Board(new String("XX OOOX  ").toCharArray());
		assertEquals('O', board.analyze(), "O wins horizontally");
	}

	@Test
	@DisplayName("X wins vertically")
	void testXWinsvertical() {
		Board board = new Board(new String("XO XO X  ").toCharArray());
		assertEquals('X', board.analyze(), "X wins vertically");
	}
	
	@Test
	@DisplayName("O wins vertically")
	void testOWinsVertical() {
		Board board = new Board(new String(" XOX OX O").toCharArray());
		assertEquals('O', board.analyze(), "O wins vertically");
	}	
	@Test
	@DisplayName("X wins diagonally \\")
	void testXWinsDiagonal() {
		Board board = new Board(new String("XO OX   X").toCharArray());
		assertEquals('X', board.analyze(), "X wins diagonally \\");
	}
	
	
	@Test
	@DisplayName("O wins diagonally /")
	void testOWinsDiagonal() {
		Board board = new Board(new String(" XOXO O X").toCharArray());
		assertEquals('O', board.analyze(), "O wins diagonally /");
	}	
	
	@Test
	@DisplayName("Starting player")
	void testStartingPlayer() {
		Board board = new Board();
		assertEquals('X', board.getNextPlayer(), "Starting player should be X");
	}	
	
}

