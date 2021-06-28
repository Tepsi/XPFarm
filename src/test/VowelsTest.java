package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Vowels;

class VowelsTest {
	@Test
	public void testCase1() {
		assertEquals(0, Vowels.getCount(""));
		assertEquals(0, Vowels.getCount("x"));
		assertEquals(1, Vowels.getCount("a"));
		assertEquals(1, Vowels.getCount("ax"));
		assertEquals(2, Vowels.getCount("aa"));
		assertEquals(5, Vowels.getCount("aeiou"));
		assertEquals(5, Vowels.getCount("abracadabra"));
	}

}
