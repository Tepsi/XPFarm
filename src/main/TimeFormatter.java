package main;

public class TimeFormatter {

// https://www.codewars.com/kata/52742f58faf5485cae000b9a/train/java

	public static String formatDuration(int seconds) {

		if (seconds == 0)
			return "now";

		final int[] DIVISORS = { 356, 24, 60, 60, 1 };
		final String[] NAMES = { "year", "day", "hour", "minute", "second" };
		final String PLURAL = "s";
		String retString = "";

		for (int i = 0; i < DIVISORS.length; i++) {

			int divisor = 1;
			for (int j = i; j < DIVISORS.length; j++) {
				divisor *= DIVISORS[j];
			}

			int number = seconds / divisor;
			seconds -= (number * divisor);
			if (number > 0) {
				if (!retString.equals("")) {
					retString += ", ";
				}
				retString += Integer.toString(number) + " " + NAMES[i];
				if (number > 1) {
					retString += PLURAL;
				}
			}
		}

		int lastPos = retString.lastIndexOf(",");
		if (lastPos >= 0) {
			retString = retString.substring(0, lastPos) + " and" + retString.substring(lastPos + 1);
		}
		return (retString);

	}
}