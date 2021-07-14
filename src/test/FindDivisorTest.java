package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.FindDivisor;

class FindDivisorTest {

	FindDivisor fd = new FindDivisor();

	@Test
	public void Test() {
		assertEquals("Should return 1 if the parameter equals 1", 1, fd.numberOfDivisors(1));
		assertEquals("Should return 2 if the parameter equals 2", 2, fd.numberOfDivisors(2));
		assertEquals("Should return 2 if the parameter equals 3", 2, fd.numberOfDivisors(3));
		assertEquals("Should return 2 if the parameter equals 5", 2, fd.numberOfDivisors(5));
		assertEquals("Should return 2 if the parameter equals 5", 2, fd.numberOfDivisors(5));
		assertEquals("Should return 6 if the parameter equals 12", 6, fd.numberOfDivisors(12));
		assertEquals("Should return 8 if the parameter equals 30", 8, fd.numberOfDivisors(30));
	}
  
}
