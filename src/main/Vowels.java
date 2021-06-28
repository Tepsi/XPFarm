package main;

public class Vowels {
	public static int getCount(String str) {
		final String[] VOWELS = { "a", "e", "i", "o", "u" };
		int vowelsCount = 0;
		for (String vowel : VOWELS) {
			int current = str.indexOf(vowel);
			while (current >= 0) {
				vowelsCount++;
				current = str.indexOf(vowel, current + 1);
			}
		}
		return vowelsCount;
	}
}
