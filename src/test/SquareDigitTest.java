package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.SquareDigit;

class SquareDigitTest {

	@Test
	public void test() {
		assertEquals(0, new SquareDigit().squareDigits(0));
		assertEquals(1, new SquareDigit().squareDigits(1));
		assertEquals(1, new SquareDigit().squareDigits(-1));
		assertEquals(4, new SquareDigit().squareDigits(2));
		assertEquals(10, new SquareDigit().squareDigits(10));
		assertEquals(49, new SquareDigit().squareDigits(23));
		assertEquals(2536, new SquareDigit().squareDigits(56));
		assertEquals(811181, new SquareDigit().squareDigits(9119));
	}
}
