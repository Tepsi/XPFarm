package main;

public class MultiplesOf3Or5 {
	public int solution(int number) {
		if (number < 4) {
			return 0;
		}

		int retNumber = 0;
		for (int i = 3; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				retNumber += i;
			}
		}

		return retNumber;
	}
}
