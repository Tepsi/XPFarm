package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

	public char[] getState() {
		return state;
	}

	public char analyze() {

		for (int sor = 0; sor < 3; sor++) {
			if (state[sor * 3] == state[sor * 3 + 1] && state[sor * 3] == state[sor * 3 + 2])
				return state[sor * 3];
		}

		for (int oszlop = 0; oszlop < 3; oszlop++) {
			if (state[oszlop] == state[3 + oszlop] && state[oszlop] == state[6 + oszlop])
				return state[oszlop];
		}

		if (state[0] == state[8] && state[4] == state[8])
			return state[4];

		if (state[2] == state[6] && state[4] == state[6])
			return state[4];

		for (char x : state) {
			if (x == ' ')
				return x;
		}
		return '-';
	}

	public void move() {
		Random random = new Random();
		List<Integer> empty = new ArrayList<>();

		for (int i = 0; i < 9; i++) {
			if (state[i] == ' ') {
				empty.add(i);
			}
		}
		state[empty.get(random.nextInt(empty.size()))] = nextPlayer;
		if (nextPlayer == 'X')
			nextPlayer = 'O';
		else
			nextPlayer = 'X';
	}

	public List<String> display() {
		List<String> messages = new ArrayList<>();
		messages.add(state[0] + "|" + state[1] + "|" + state[2]);
		messages.add("-+-+-");
		messages.add(state[3] + "|" + state[4] + "|" + state[5]);
		messages.add("-+-+-");
		messages.add(state[6] + "|" + state[7] + "|" + state[8]);
		char winner = analyze();
		if (isEmpty()) {
			messages.add(0, "Game Board Creation...");
			messages.add("Board Created.");
			messages.add("The game will start with player X");
		}
		switch (winner) {
		case 'X':
		case 'O':
			messages.add("PLAYER " + winner + " WON!");
			break;
		case '-':
			messages.add("GAME ENDS WITH A DRAW!");
			break;
		default:
			messages.add("-----------------------------");
			;
		}
		return messages;
	}
	
	private boolean isEmpty() {
		for (int i=0;i<state.length;i++) {
			if (state[i] != ' ') {
				return false;
			}
		}
		return true;
	}
}