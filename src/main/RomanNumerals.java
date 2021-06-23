package main;

public class RomanNumerals {

	final static String[] ROMAN = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	final static int[] ARABIC = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public static String toRoman(int n) {
		String retString = "";

		for (int value = 0; value < ARABIC.length; value++) {
			int multiplier = n / ARABIC[value];
			if (multiplier > 0) {
				for (int i = 0; i < multiplier; i++) {
					retString += ROMAN[value];
				}
				n -= multiplier * ARABIC[value];
			}
		}
		return retString;
	}

	public static int fromRoman(String romanNumeral) {
		int retNum = 0;
		for (int i = 0; i < romanNumeral.length(); i++) {
			String letter = romanNumeral.substring(i, i + 1);
			for (int j = 0; j < ROMAN.length; j++) {
				if (ROMAN[j].equals(letter)) {
					retNum += ARABIC[j];
				}
			}
		}
		return retNum;
	}
}
