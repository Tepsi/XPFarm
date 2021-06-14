package main;

public class RomanNumerals {

	final static String[] ROMAN = { "M", "D", "C", "L", "X", "V", "I" };
	final static int[] ARABIC = { 1000, 500, 100, 50, 10, 5, 1 };

	public static String toRoman(int n) {
		String retString = "";

		for (int value = 0; value < ARABIC.length; value++) {
			int multiplier = n / ARABIC[value];
			if (multiplier > 0) {
				if (multiplier == 4 && value > 0) {
					retString += ROMAN[value] + ROMAN[value - 1];
				} else {
					for (int i = 0; i < multiplier; i++) {
						retString += ROMAN[value];
					}
				}
				n -= multiplier * ARABIC[value];
			}
		}

		return retString;

	}

	public static int fromRoman(String romanNumeral) {
		return 1;
	}
}
