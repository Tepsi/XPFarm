package main;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TicTacToe {

	public static void main(String[] args) throws InterruptedException {
		Board board = new Board();
		printMessages(board.display());
		while (board.analyze() == ' ') {
			TimeUnit.SECONDS.sleep(2);
			board.move();
			printMessages(board.display());
		}
	}

	private static void printMessages(List<String> messages) {
		for (String message : messages) {
			System.out.println(message);
		}
	}

}