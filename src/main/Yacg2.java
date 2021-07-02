package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Yacg2 {

	final static List<String> RANKS = new ArrayList<>(
			Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));

	public static String winnerOfTrick(String[] cards, String[] players) {
		int winner = 0;
		int maxRank = rank(cards[0]);
		final String CALLEDSUIT = suit(cards[0]);
		for (int i = 1; i < cards.length; i++) {
			int currentRank = rank(cards[i]);
			if (CALLEDSUIT.equals(suit(cards[i])) && currentRank > maxRank) {
				maxRank = currentRank;
				winner = i;
			}
		}
		return players[winner] + " wins";
	}

	private static String suit(String card) {
		return card.substring(1);
	}

	private static int rank(String card) {
		return RANKS.indexOf(card.substring(0, 1));
	}

}
