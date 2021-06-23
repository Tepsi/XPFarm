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
		assertEquals("IV", RomanNumerals.toRoman(4));
		assertEquals("III", RomanNumerals.toRoman(3));
		assertEquals("IX", RomanNumerals.toRoman(9));
		assertEquals("VIII", RomanNumerals.toRoman(8));
		assertEquals("XLIX", RomanNumerals.toRoman(49));
		assertEquals("CMXLVIII", RomanNumerals.toRoman(948));
		
	}

	@Test
	void testFromRoman() {
		assertEquals(1, RomanNumerals.fromRoman("I"));
		assertEquals(2, RomanNumerals.fromRoman("II"));
		assertEquals(3, RomanNumerals.fromRoman("III"));
		assertEquals(5, RomanNumerals.fromRoman("V"));
		assertEquals(10, RomanNumerals.fromRoman("X"));
		assertEquals(6, RomanNumerals.fromRoman("VI"));
		assertEquals(8, RomanNumerals.fromRoman("VIII"));
		assertEquals(4, RomanNumerals.fromRoman("IV"));
		assertEquals(9, RomanNumerals.fromRoman("IX"));
		assertEquals(49, RomanNumerals.fromRoman("XLIX"));
		assertEquals(1666, RomanNumerals.fromRoman("MDCLXVI"));
		assertEquals(2008, RomanNumerals.fromRoman("MMVIII"));
		assertEquals(948, RomanNumerals.fromRoman("CMXLVIII"));
	}

}
