package main;
import java.util.Arrays;
import java.util.Random;

public class Board {

	private char[] state;
	private char nextPlayer;

	public Board() {
		state = new char[9];
		Arrays.fill(state, ' ');
		nextPlayer = 'X';
	}

	public Board(char[] state) {
		this.state = state;
		nextPlayer = 'X';
	}

	public char getNextPlayer() {
		return nextPlayer;
	}

	public char analyze() {

		for (int sor = 0; sor < 3; sor++) {
			if (state[sor*3] == state[sor*3+1] &&
			    state[sor*3] == state[sor*3+2]) return state[sor*3];
		}

		for (int oszlop = 0; oszlop < 3; oszlop++) {
			if (state[oszlop] == state[3+oszlop] &&
			    state[oszlop] == state[6+oszlop]) return state[oszlop];
		}
		
		if (state[0] == state[4] &&
		    state[0] == state[8]) return state[4];
		
		if (state[2] == state[4] &&
			state[2] == state[6]) return state[4];
		
		for (char x : state) {
			if (x == ' ')
				return x;
		}
		return '-';
	}

	public void move() {
		Random random = new Random();
		int i;
		do {
			i = random.nextInt(9);
		} while (state[i] != ' ');
		state[i] = nextPlayer;
		if (nextPlayer == 'X')
			nextPlayer = 'O';
		else
			nextPlayer = 'X';
	}

	public void display() {
		System.out.println(state[0] + "|" + state[1] + "|" + state[2]);
		System.out.println("-+-+-");
		System.out.println(state[3] + "|" + state[4] + "|" + state[5]);
		System.out.println("-+-+-");
		System.out.println(state[6] + "|" + state[7] + "|" + state[8]);

	}
}