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
			boolean found = false;
			if (i < romanNumeral.length() - 1) {
				int value = searchRoman(romanNumeral.substring(i, i + 2));
				if (value > 0) {
					retNum += value;
					i++;
					found = true;
				}
			}
			if (!found) {
				retNum += searchRoman(romanNumeral.substring(i, i + 1));
			}
		}
		return retNum;
	}

	private static int searchRoman(String letter) {
		for (int i = 0; i < ROMAN.length; i++) {
			if (ROMAN[i].equals(letter)) {
				return ARABIC[i];
			}
		}
		return 0;
	}
}
