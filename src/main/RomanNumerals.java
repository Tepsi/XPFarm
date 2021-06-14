package main;

public class RomanNumerals {
	public static String toRoman(int n) {
		String retString = "";
		for (int i = 0; i < n; i++) {
			retString += "I";
		}
		return retString;

	}

	public static int fromRoman(String romanNumeral) {
		return 1;
	}
}
