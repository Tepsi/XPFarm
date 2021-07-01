package main;

import java.util.HashSet;
import java.util.Set;

public class FindOdd {
	public static int findIt(int[] a) {
		Set<Integer> processed = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (processed.add(a[i])) {
				int count = 0;
				for (int j = i; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				if (count % 2 == 1) {
					return a[i];
				}
			}
		}
		return 0;
	}
}