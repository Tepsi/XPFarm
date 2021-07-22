package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.TvRemote;

class TvRemoteTest {

	@Test
	void testTvRemote() {
		assertEquals(1, TvRemote.tvRemote("a"), "A is just one OK");
		assertEquals(2, TvRemote.tvRemote("b"), "B should step 1 and OK");
		assertEquals(2, TvRemote.tvRemote("f"), "F should step down and OK");
		assertEquals(3, TvRemote.tvRemote("c"), "Double-step for C and OK");
		assertEquals(12, TvRemote.tvRemote("/"), "Lots of steps and OK");
		assertEquals(3, TvRemote.tvRemote("ab"), "Multiletter combinations should add up");
		assertEquals(3, TvRemote.tvRemote("af"), "Multiletter combinations should add up");
		assertEquals(16, TvRemote.tvRemote("does"), "Multiletter words should work as well");
		assertEquals(36, TvRemote.tvRemote("codewars"), "Multiletter words should work as well");
	}

}
