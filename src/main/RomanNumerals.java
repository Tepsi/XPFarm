package main;

public class RomanNumerals {

	final static String[] ROMAN = { "M", "D", "C", "L", "X", "V", "I" };
	final static int[] ARABIC = { 1000, 500, 100, 50, 10, 5, 1 };

	public static String toRoman(int n) {
		String retString = "";

		for (int value = 0; value < ARABIC.length; value++) {
			int multiplier = n / ARABIC[value];
			if (multiplier > 0) {
				for (int i = 0; i < multiplier; i++) {
					retString += ROMAN[value];
				}
				n -= multiplier * ARABIC[value];
			} else {
				if (value < ARABIC.length - 1) {
					if (value % 2 == 1) {
						if (n >= ARABIC[value] - ARABIC[value + 1]) {
							retString += ROMAN[value + 1] + ROMAN[value];
							n -= (ARABIC[value] - ARABIC[value + 1]);
						}
					} else {
						if (n >= ARABIC[value] - ARABIC[value + 2]) {
							retString += ROMAN[value + 2] + ROMAN[value];
							n -= (ARABIC[value] - ARABIC[value + 2]);
						}
					}
				}
			}
		}

		return retString;

	}

	public static int fromRoman(String romanNumeral) {
		return 1;
	}
}
