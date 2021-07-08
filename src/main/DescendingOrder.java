package main;

public class DescendingOrder {
	public static int sortDesc(final int num) {
		return calculate(buildStatistic(num));
	}
	
	private static int calculate(int[] statistic) {
		int retNum = 0;
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < statistic[i]; j++) {
				retNum = retNum * 10 + i;
			}
		}
		return retNum;
	}

	private static int[] buildStatistic(int number) {
		int[] statistic = new int[10];
		String numStr = Integer.toString(number);

		for (int i = 0; i < numStr.length(); i++) {
			String digit = numStr.substring(i, i + 1);
			int numDigit = Integer.parseInt(digit);
			statistic[numDigit]++;
		}
		return statistic;
	}
}
