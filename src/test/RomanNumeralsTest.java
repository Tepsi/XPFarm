package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.RomanNumerals;

class RomanNumeralsTest {

	@Test
	void testToRoman() {
		assertEquals("I", RomanNumerals.toRoman(1));
		assertEquals("II", RomanNumerals.toRoman(2));
		assertEquals("V", RomanNumerals.toRoman(5));
		assertEquals("X", RomanNumerals.toRoman(10));
		assertEquals("III", RomanNumerals.toRoman(3));
		assertEquals("VI", RomanNumerals.toRoman(6));
		assertEquals("MDCLXVI", RomanNumerals.toRoman(1666));
		assertEquals("MMVIII", RomanNumerals.toRoman(2008));
	}

	@Test
	void testFromRoman() {
		assertEquals(1, RomanNumerals.fromRoman("I"));
	}

}
