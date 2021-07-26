package main;

public class TvRemote {

	public static int tvRemote(final String word) {
		if (word.isEmpty()) {
			return 0;
		}
		
		String[] letters = word.split("");
		boolean capital = false;
		int distance = 0;
		String prevLetter = "a";
		for (String letter:letters) {
			if (needShift(letter,capital)) {
				distance += getDistance(prevLetter, "shift");
				capital = !capital;
				prevLetter = "shift";
			}
			distance += getDistance(prevLetter, letter);
			prevLetter = letter;
		}
		return distance;
	}

	private static boolean needShift(String letter, boolean capital) {
		char toChar = letter.charAt(0);
		return (Character.isUpperCase(toChar) && !capital) || (Character.isLowerCase(toChar) && capital);
	}

	private static int getDistance(String from, String to) {
		int[] fromCoord = findButton(from.toLowerCase());
		int[] toCoord = findButton(to.toLowerCase());
		return Math.abs(toCoord[0] - fromCoord[0]) + Math.abs(toCoord[1] - fromCoord[1]) + 1;
	}

	private static int[] findButton(String button) {
		String[][] KEYBOARD = { { "a", "b", "c", "d", "e", "1", "2", "3" }, { "f", "g", "h", "i", "j", "4", "5", "6" },
				{ "k", "l", "m", "n", "o", "7", "8", "9" }, { "p", "q", "r", "s", "t", ".", "@", "0" },
				{ "u", "v", "w", "x", "y", "z", "_", "/" }, { "shift", " ", "", "", "", "", "", "" } };

		for (int x = 0; x < KEYBOARD.length; x++) {
			for (int y = 0; y < KEYBOARD[x].length; y++) {
				if (KEYBOARD[x][y].equals(button)) {
					return new int[] { x, y };
				}
			}
		}
		return new int[] { 0, 0 };
	}

}
