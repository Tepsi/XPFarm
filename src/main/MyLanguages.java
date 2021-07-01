package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyLanguages {
	public static List<String> myLanguages(final Map<String, Integer> results) {
		List<String> retList = new ArrayList<>();
		int maxValue = 59;
		for (Map.Entry<String, Integer> result : results.entrySet()) {
			if (result.getValue() > maxValue) {
				maxValue = result.getValue();
			}
		}
		for (int i = maxValue; i >= 60; i--) {
			for (Map.Entry<String, Integer> result : results.entrySet()) {
				if (result.getValue() == i) {
					retList.add(result.getKey());
				}
			}
		}
		return retList;
	}
}
