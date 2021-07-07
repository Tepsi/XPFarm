package main;

public class SquareDigit {

	public int squareDigits(int n) {
		String strOut = "";
		String strIn = Integer.toString(n);

		strIn = strIn.replace("-", "");

		for (int i = 0; i < strIn.length(); i++) {
			strOut += square(strIn.substring(i, i + 1));
		}

		return Integer.parseInt(strOut);
	}

	private String square(String digit) {
		int number = Integer.parseInt(digit);
		return Integer.toString(number * number);
	}

}
