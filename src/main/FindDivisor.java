package main;

public class FindDivisor {

	public long numberOfDivisors(int n) {
		long retNum = 0;
		double root = Math.sqrt(n);
		for (double i = 1; i < root; i++) {
			if (n % i == 0) {
				retNum+= 2;
			}
		}
		if (n % root == 0) {
			retNum++;
		}
		return retNum;
	}
}