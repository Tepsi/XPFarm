package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import main.PickPeaks;

class PickPeaksTest {

	private static String[] msg = { "should support empty input", "1 input only", "Simple test", "Starts with plateau",
			"2 peaks", "Simple plateau", "Two plateaus and and endless"

	};

	@Test
	public void zoliTest1() {
		int[][] array = { {}, { 1 }, { 1, 2, 1 }, { 2, 2, 1 }, { 1, 2, 1, 2, 1 }, { 1, 2, 2, 1 },
				{ 1, 2, 3, 3, 3, 1, 0, 1, 1, 0, 1, 2, 3, 4, 10, 10, 10, 10 } };

		int[][] posS = { {}, {}, { 1 }, {}, { 1, 3 }, { 1 }, { 2, 7 } };

		int[][] peaksS = { {}, {}, { 2 }, {}, { 2, 2 }, { 2 }, { 3, 1 } };
		for (int n = 0; n < msg.length; n++) {
			final int[] p1 = posS[n], p2 = peaksS[n];
			Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {
				private static final long serialVersionUID = 7991077436074516416L;

				{
					put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
					put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
				}
			}, actual = PickPeaks.getPeaks(array[n]);
			assertEquals(msg[n], expected, actual);
		}
	}

	@Test
	public void sampleTests() {
		final String[] msg = { "should support finding peaks",
				"should support finding peaks, but should ignore peaks on the edge of the array",
				"should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
				"should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
				"should support finding peaks, but should ignore peaks on the edge of the array" };
		int[][] array = { { 1, 2, 3, 6, 4, 1, 2, 3, 2, 1 }, { 3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3 },
				{ 3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1 }, { 2, 1, 3, 1, 2, 2, 2, 2, 1 },
				{ 2, 1, 3, 1, 2, 2, 2, 2 } };

		int[][] posS = { { 3, 7 }, { 3, 7 }, { 3, 7, 10 }, { 2, 4 }, { 2 }, };

		int[][] peaksS = { { 6, 3 }, { 6, 3 }, { 6, 3, 2 }, { 3, 2 }, { 3 } };
		for (int n = 0; n < msg.length; n++) {
			final int[] p1 = posS[n], p2 = peaksS[n];
			Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {
				private static final long serialVersionUID = -7490675046816908664L;

				{
					put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
					put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
				}
			}, actual = PickPeaks.getPeaks(array[n]);
			assertEquals(msg[n], expected, actual);
		}
	}

}
