package main;

public class TvRemote {

	public static int tvRemote(final String word) {

		int posX = 0;
		int posY = 0;
		int steps = 0;
		for (int i = 0; i < word.length(); i++) {
			int[] coord = findButton(word.charAt(i));
			steps += Math.abs(coord[0] - posX) + Math.abs(coord[1] - posY) + 1;
			posX = coord[0];
			posY = coord[1];
		}
		return steps;

	}

	private static int[] findButton(char letter) {
		char[][] KEYBOARD = { { 'a', 'b', 'c', 'd', 'e', '1', '2', '3' }, { 'f', 'g', 'h', 'i', 'j', '4', '5', '6' },
				{ 'k', 'l', 'm', 'n', 'o', '7', '8', '9' }, { 'p', 'q', 'r', 's', 't', '.', '@', '0' },
				{ 'u', 'v', 'w', 'x', 'y', 'z', '_', '/' } };
		int[] coord = { 0, 0 };
		for (int i = 0; i < KEYBOARD.length; i++) {
			for (int j = 0; j < KEYBOARD[i].length; j++) {
				if (KEYBOARD[i][j] == letter) {
					coord[0] = i;
					coord[1] = j;
					return coord;
				}
			}
		}
		return coord;
	}

}
