package main;

public class RomanNumerals {
	public static String toRoman(int n) {
		String retString = "";
		if (n >= 5) {
			retString += "V";
			n -= 5;
		}
		for (int i = 0; i < n; i++) {
			retString += "I";
		}
		return retString;

	}

	public static int fromRoman(String romanNumeral) {
		return 1;
	}
}
