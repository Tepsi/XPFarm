package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TvRemote {

	public static int tvRemote(final String word) {
		if (word.isEmpty()) {
			return 0;
		}
		List<String> route = new ArrayList<>();
		route.add("a");
		route.addAll(Arrays.asList(word.split("")));
		return findRoute(route, false);
	}

	private static int findRoute(List<String> route, boolean capital) {
		if (route.size() == 1) {
			return 0;
		}

		int shift = needShift(route, capital);
		if (shift == 1) {
			List<String> shiftRoute = new ArrayList<>();
			shiftRoute.addAll(route);
			shiftRoute.add(1, "shift");
			int shiftNow = getDistance(shiftRoute.get(0), shiftRoute.get(1));
			shiftRoute.remove(0);
			shiftNow += findRoute(shiftRoute, !capital);

			int shiftLater = getDistance(route.get(0), route.get(1));
			route.remove(0);
			shiftLater += findRoute(route, capital);

			return Math.min(shiftNow, shiftLater);
		}
		if (shift == 0) {
			route.add(1, "Shift");
			capital = !capital;
		}

		int distance = getDistance(route.get(0), route.get(1));
		route.remove(0);
		return distance + findRoute(route, capital);
	}

	private static int needShift(List<String> route, boolean capital) {
		int distAlpha = findNextAlpha(route);
		char toChar = ' ';
		switch (distAlpha) {
		case 0:
			return -1;
		case 1:
			toChar = route.get(1).charAt(0);
			if ((Character.isUpperCase(toChar) && !capital) || (Character.isLowerCase(toChar) && capital)) {
				return 0;
			} else {
				return -1;
			}
		default:
			toChar = route.get(distAlpha).charAt(0);
			if ((Character.isUpperCase(toChar) && !capital) || (Character.isLowerCase(toChar) && capital)) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	private static int findNextAlpha(List<String> route) {
		for (int i = 1; i < route.size(); i++) {
			if (isAlpha(route.get(i))) {
				return i;
			}
		}
		return 0;
	}

	private static boolean isAlpha(String letter) {
		if (Character.isAlphabetic(letter.charAt(0))) {
			return true;
		}
		return false;
	}

	private static int getDistance(String from, String to) {
		int[] fromCoord = findButton(from.toLowerCase());
		int[] toCoord = findButton(to.toLowerCase());
		return Math.abs(toCoord[0] - fromCoord[0]) + Math.abs(toCoord[1] - fromCoord[1]) + 1;
	}

	private static int[] findButton(String button) {
		String[][] KEYBOARD = { { "a", "b", "c", "d", "e", "1", "2", "3" }, { "f", "g", "h", "i", "j", "4", "5", "6" },
				{ "k", "l", "m", "n", "o", "7", "8", "9" }, { "p", "q", "r", "s", "t", ".", "@", "0" },
				{ "u", "v", "w", "x", "y", "z", "_", "/" }, { "shift", " ", "", "", "", "", "", "" } };

		for (int x = 0; x < KEYBOARD.length; x++) {
			for (int y = 0; y < KEYBOARD[x].length; y++) {
				if (KEYBOARD[x][y].equals(button)) {
					return new int[] { x, y };
				}
			}
		}
		return new int[] { 0, 0 };
	}

}
