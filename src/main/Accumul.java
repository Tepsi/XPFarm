package main;

public class Accumul {

	public static String accum(String s) {
		String retString = "";
		for (int i = 0; i < s.length(); i++) {
			if (!retString.isEmpty()) {
				retString += "-";
			}
			retString += add(s.substring(i, i + 1), i);
		}
		return retString;
	}

	private static String add(String letter, int count) {
		String retString = letter.toUpperCase();
		for (int i = 1; i <= count; i++) {
			retString += letter.toLowerCase();
		}
		return retString;
	}
}