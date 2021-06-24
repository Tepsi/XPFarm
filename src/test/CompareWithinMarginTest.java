package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CompareWithinMargin;

class CompareWithinMarginTest {

	@Test
	void testCloseCompareDoubleDouble() {
		assertEquals(0, CompareWithinMargin.closeCompare(0, 0));
		assertEquals(-1, CompareWithinMargin.closeCompare(0, 1));
		assertEquals(1, CompareWithinMargin.closeCompare(1, 0));
		assertEquals(-1, CompareWithinMargin.closeCompare(4, 5));
        assertEquals(0, CompareWithinMargin.closeCompare(5, 5));
        assertEquals(1, CompareWithinMargin.closeCompare(6, 5));
        assertEquals(-1, CompareWithinMargin.closeCompare(-6, -5));
	}

	@Test
	void testCloseCompareDoubleDoubleDouble() {
		assertEquals(0, CompareWithinMargin.closeCompare(0, 0, 0));
		assertEquals(-1, CompareWithinMargin.closeCompare(0, 1, 0));
		assertEquals(1, CompareWithinMargin.closeCompare(1, 0, 0));
		assertEquals(0, CompareWithinMargin.closeCompare(1, 0, 1));
		assertEquals(1, CompareWithinMargin.closeCompare(2, 0, 1));
		assertEquals(0, CompareWithinMargin.closeCompare(2, 5, 3));
        assertEquals(1, CompareWithinMargin.closeCompare(8.1, 5, 3));
        assertEquals(-1, CompareWithinMargin.closeCompare(1.99, 5, 3));
	}

}
