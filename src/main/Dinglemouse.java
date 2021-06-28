package main;

import java.util.Arrays;

public class Dinglemouse {
	public static int[] paintLetterboxes(final int start, final int end) {
		int[] retArray = new int[10];
		Arrays.fill(retArray, 0);
		for (int i = start; i <= end; i++) {
			String number = Integer.toString(i);
			for (char c : number.toCharArray()) {
				retArray[c - '0']++;
			}
		}
		return retArray;
	}

}
