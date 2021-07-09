package main;

public class DRoot {
	public static int digital_root(int n) {
		String[] digits = Integer.toString(n).split("");
		int retNum = 0;
		for (String digit : digits) {
			retNum += Integer.valueOf(digit);
		}
		if (retNum > 9) {
			return digital_root(retNum);
		}
		return retNum;
	}
}
