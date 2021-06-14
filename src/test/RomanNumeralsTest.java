package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class RomanNumeralsTest {

	@Test
	void testToRoman() {
		assertEquals("I", RomanNumerals.toRoman(1));
	}

	@Test
	void testFromRoman() {
		assertEquals(1, RomanNumerals.fromRoman("I"));
	}

}
