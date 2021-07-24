package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.TvRemote;

class TvRemoteTest {
	
	@Test
	void testTvRemoteRandom() {
		assertEquals(278, TvRemote.tvRemote("xgBvUnTmy3f3 J3jbSlt7MJzLmJJFL"), "random test");
	}
	
	@Test
	void testTvRemoteSentence() {
		assertEquals(306, TvRemote.tvRemote("The Quick Brown Fox Jumps Over A Lazy Dog."), "A whole sentence");
	}

	@Test
	void testTvRemote() {
		assertEquals(1, TvRemote.tvRemote("a"), "a is just one OK");
		assertEquals(2, TvRemote.tvRemote("b"), "b should step 1 and OK");
		assertEquals(2, TvRemote.tvRemote("f"), "f should step down and OK");
		assertEquals(3, TvRemote.tvRemote("c"), "Double-step for c and OK");
		assertEquals(12, TvRemote.tvRemote("/"), "Lots of steps and OK");
		assertEquals(3, TvRemote.tvRemote("ab"), "Multiletter combinations should add up");
		assertEquals(3, TvRemote.tvRemote("af"), "Multiletter combinations should add up");
		assertEquals(16, TvRemote.tvRemote("does"), "Multiletter words should work as well");
		assertEquals(36, TvRemote.tvRemote("codewars"), "Multiletter words should work as well");
		assertEquals(12, TvRemote.tvRemote("A"), "Capital letters need Shift");
		assertEquals(16, TvRemote.tvRemote("a A"), "Mix of capital and noncapital letters");
		assertEquals(15, TvRemote.tvRemote("a Z"), "Should optimize pressing shift");
		assertEquals(12, TvRemote.tvRemote("z."), "Capital and non-alpha tests");
		assertEquals(15, TvRemote.tvRemote("Z."), "Capital and non-alpha tests");
		assertEquals(21, TvRemote.tvRemote("a 1E"), "Should optimize pressing shift");
		assertEquals(31, TvRemote.tvRemote("F_m"), "Should optimize pressing shift");
//		assertEquals(-1, TvRemote.tvRemote("%"), "Wrong button entered");
		assertEquals(22, TvRemote.tvRemote("t_U"), "Should optimize pressing shift");
		assertEquals(7, TvRemote.tvRemote(" "), "1 Space");
		assertEquals(9, TvRemote.tvRemote("   "), "more Spaces");
		assertEquals(0, TvRemote.tvRemote(""), "Empty?");

	}

	@Test
	public void upper() {
		assertEquals(27, TvRemote.tvRemote("DOES"));
		assertEquals(26, TvRemote.tvRemote("YOUR"));
		assertEquals(38, TvRemote.tvRemote("SOLUTION"));
		assertEquals(23, TvRemote.tvRemote("WORK"));
		assertEquals(21, TvRemote.tvRemote("FOR"));
		assertEquals(32, TvRemote.tvRemote("THESE"));
		assertEquals(28, TvRemote.tvRemote("WORDS"));
	}

	@Test
	public void mixed() {
		assertEquals(40, TvRemote.tvRemote("Does"));
		assertEquals(37, TvRemote.tvRemote("Your"));
		assertEquals(49, TvRemote.tvRemote("Solution"));
		assertEquals(30, TvRemote.tvRemote("Work"));
		assertEquals(28, TvRemote.tvRemote("For"));
		assertEquals(41, TvRemote.tvRemote("These"));
		assertEquals(35, TvRemote.tvRemote("Words"));
	}


}
