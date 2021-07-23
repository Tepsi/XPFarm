package main;

public class TvRemote {

	public static int tvRemote(final String word) {

		RemoteState remoteState = new RemoteState();
		for (int i = 0; i < word.length(); i++) {
			char currentLetter = word.charAt(i);
			if (needsShift(word, i, remoteState.isCapital())) {
				remoteState = pressButton(remoteState, "Shift");
				remoteState.toggleCapital();
			}
			remoteState = pressButton(remoteState, Character.toString(currentLetter).toLowerCase());
			if (remoteState.getSteps() == -1) {
				return -1;
			}
		}
		return remoteState.getSteps();
	}

	private static RemoteState pressButton(RemoteState remoteState, String letter) {
		RemoteState newRemoteState = findButton(letter);
		if (newRemoteState.getSteps() == -1) {
			return newRemoteState;
		}
		int step = Math.abs(newRemoteState.getPosX() - remoteState.getPosX())
				+ Math.abs(newRemoteState.getPosY() - remoteState.getPosY()) + 1;
		newRemoteState.setSteps(remoteState.getSteps() + step);
		newRemoteState.setCapital(remoteState.isCapital());
		return newRemoteState;
	}

	private static boolean needsShift(String word, int currentPos, boolean capital) {
		for (int i = currentPos; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (Character.isAlphabetic(letter)) {
				return (Character.isUpperCase(letter) && !capital) || (Character.isLowerCase(letter) && capital);
			}
		}
		return false;
	}

	private static RemoteState findButton(String letter) {
		String[][] KEYBOARD = { { "a", "b", "c", "d", "e", "1", "2", "3" }, { "f", "g", "h", "i", "j", "4", "5", "6" },
				{ "k", "l", "m", "n", "o", "7", "8", "9" }, { "p", "q", "r", "s", "t", ".", "@", "0" },
				{ "u", "v", "w", "x", "y", "z", "_", "/" }, { "Shift", " ", "", "", "", "", "", "" } };

		RemoteState remoteState = new RemoteState();
		for (int x = 0; x < KEYBOARD.length; x++) {
			for (int y = 0; y < KEYBOARD[x].length; y++) {
				if (KEYBOARD[x][y].equals(letter)) {
					remoteState.setPosX(x);
					remoteState.setPosY(y);
					return remoteState;
				}
			}
		}
		remoteState.setSteps(-1);
		return remoteState;
	}

	public static class RemoteState {
		int posX;
		int posY;
		int steps;
		boolean capital;

		public RemoteState() {
			posX = 0;
			posY = 0;
			steps = 0;
			capital = false;
		}

		public int getPosX() {
			return posX;
		}

		public void setPosX(int posX) {
			this.posX = posX;
		}

		public int getPosY() {
			return posY;
		}

		public void setPosY(int posY) {
			this.posY = posY;
		}

		public boolean isCapital() {
			return capital;
		}

		public void setCapital(boolean capital) {
			this.capital = capital;
		}

		public void toggleCapital() {
			capital = !capital;
		}

		public void setSteps(int steps) {
			this.steps = steps;
		}

		public int getSteps() {
			return steps;
		}

	}

}
