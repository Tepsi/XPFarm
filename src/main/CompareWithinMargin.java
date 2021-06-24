package main;

public class CompareWithinMargin {
	public static int closeCompare(double a, double b) {
		return closeCompare(a, b, 0);
	}

	public static int closeCompare(double a, double b, double margin) {
		if (b > a + margin) {
			return -1;
		} else if (b < a - margin) {
			return 1;
		}
		return 0;
	}
}
