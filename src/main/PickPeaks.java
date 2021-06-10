package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

	public static Map<String, List<Integer>> getPeaks(int[] arr) {

		Map<String, List<Integer>> retMap = new HashMap<String, List<Integer>>();
		List<Integer> peaks = new ArrayList<Integer>();
		List<Integer> poss = new ArrayList<Integer>();

		if (arr.length >= 3) {
			int currentPos = 1;
			while (currentPos < arr.length - 1) {
				int nextDifferent = searchNextDifferent(arr, currentPos);
				if (nextDifferent > 0) {
					if (arr[currentPos] > arr[currentPos - 1] && arr[currentPos] > arr[nextDifferent]) {
						peaks.add(arr[currentPos]);
						poss.add(currentPos);
					}
					currentPos = nextDifferent;
				} else currentPos = arr.length;
			}

		}
		retMap.put("peaks", peaks);
		retMap.put("pos", poss);
		return retMap;
	}

	private static int searchNextDifferent(int[] array, int pos) {

		for (int i = pos + 1; i < array.length; i++) {
			if (array[pos] != array[i])
				return i;
		}
		return -1;

	}
}
