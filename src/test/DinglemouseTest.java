package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import main.Dinglemouse;

class DinglemouseTest {

	@Test
	void testPaintLetterboxes() {
		assertArrayEquals(new int[] { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, Dinglemouse.paintLetterboxes(1, 1));
		assertArrayEquals(new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 }, Dinglemouse.paintLetterboxes(2, 2));
		assertArrayEquals(new int[] { 0, 1, 1, 0, 0, 0, 0, 0, 0, 0 }, Dinglemouse.paintLetterboxes(1, 2));
		assertArrayEquals(new int[] { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, Dinglemouse.paintLetterboxes(1, 9));
		assertArrayEquals(new int[] { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, Dinglemouse.paintLetterboxes(10, 10));
		assertArrayEquals(new int[] { 1, 3, 0, 0, 0, 0, 0, 0, 0, 0 }, Dinglemouse.paintLetterboxes(10, 11));

		assertArrayEquals(new int[] { 1, 9, 6, 3, 0, 1, 1, 1, 1, 1 }, Dinglemouse.paintLetterboxes(125, 132));
	}

}
