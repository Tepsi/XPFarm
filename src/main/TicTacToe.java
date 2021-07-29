package main;

public class TicTacToe {

	public static void main(String[] args) {
		Board board = new Board();
		System.out.println("Game Board Creation...");
		board.display();
		System.out.println("Board created.");
		System.out.println("The game will start with player " + board.getNextPlayer());
		System.out.println("-----------------------------");
		while (board.analyze() == ' ') {
			System.out.println("Player " + board.getNextPlayer() + ":");
			board.move();
			board.display();
			switch (board.analyze()) {
			case 'X':
				System.out.println("PLAYER X WON");
				break;
			case 'O':
				System.out.println("PLAYER O WON");
				break;
			case '-':
				System.out.println("GAME ENDS WITH A DRAW!");
				break;
			default: System.out.println("-----------------------------");
				;
			}
			
		}
	}

}