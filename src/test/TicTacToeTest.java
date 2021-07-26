package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Board;

class TicTacToeTest {

	@Test
	@DisplayName("Empty board")
	void testEmpty() {
		Board board = new Board(new String("         ").toCharArray());
		assertEquals(' ', board.analyze(), "Empty board should be continued");
		assertEquals(
				Arrays.asList("Game Board Creation...", " | | ", "-+-+-", " | | ", "-+-+-", " | | ", "Board Created.",
						"The game will start with player X", "-----------------------------"),
				board.display(), "Empty board display");

	}

	@Test
	@DisplayName("Full board with a draw")
	void testFull() {
		Board board = new Board(new String("XOXOOXXXO").toCharArray());
		assertEquals('-', board.analyze(), "Full board should stop");
		assertEquals(Arrays.asList("X|O|X", "-+-+-", "O|O|X", "-+-+-", "X|X|O", "GAME ENDS WITH A DRAW!"),
				board.display(), "Full board display");
	}

	@Test
	@DisplayName("Board in progress")
	void testInProgress() {
		Board board = new Board(new String("XOXOO XXO").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");
		assertEquals(Arrays.asList("X|O|X", "-+-+-", "O|O| ", "-+-+-", "X|X|O", "-----------------------------"),
				board.display(), "Board in progress display");

		board = new Board(new String("XO  X    ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("   XOXO  ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("XO    O X").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("OX    X O").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("X        ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("      X  ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String(" O  X O X").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("O        ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("      O  ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String(" X  O X O").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String(" X       ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("    O    ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("      X  ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("  X   X  ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

		board = new Board(new String("    X X  ").toCharArray());
		assertEquals(' ', board.analyze(), "Board in progress");

	}

	@Test
	@DisplayName("X wins horizontally")
	void testXWinsHorizontal() {
		Board board = new Board(new String("XXXOO    ").toCharArray());
		assertEquals('X', board.analyze(), "X wins horizontally");
		assertEquals(Arrays.asList("X|X|X", "-+-+-", "O|O| ", "-+-+-", " | | ", "PLAYER X WON!"), board.display(),
				"Winner display");
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
	@DisplayName("O wins diagonally \\")
	void testOWinsDiagonal2() {
		Board board = new Board(new String("O XXO  XO").toCharArray());
		assertEquals('O', board.analyze(), "O wins diagonally \\");
	}

	@Test
	@DisplayName("X wins diagonally /")
	void testXWinsDiagonal2() {
		Board board = new Board(new String(" OXOX X  ").toCharArray());
		assertEquals('X', board.analyze(), "X wins diagonally /");
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

	@Test
	@DisplayName("One X should be added to an empty board, next player should be O")
	void testStartingMove() {
		Board board = new Board();
		board.move();
		assertEquals(1, count('X', board), "One X should be on the board");
		assertEquals(8, count(' ', board), "All the other fields should be empty");
		assertEquals('O', board.getNextPlayer(), "Next player should be O");
	}

	@Test
	@DisplayName("After two steps one X and one O should be added to an empty board, next player should be X")
	void testSecondMove() {
		Board board = new Board();
		board.move();
		board.move();
		assertEquals(1, count('X', board), "One X should be on the board");
		assertEquals(1, count('O', board), "One O should be on the board");
		assertEquals(7, count(' ', board), "All the other fields should be empty");
		assertEquals('X', board.getNextPlayer(), "Next player should be X");
	}

	private int count(char what, Board board) {
		int retCount = 0;
		for (char field : board.getState()) {
			if (field == what) {
				retCount++;
			}
		}
		return retCount;
	}

}
