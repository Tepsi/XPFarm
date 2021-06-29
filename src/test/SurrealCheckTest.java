package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.SurrealCheck;

class SurrealCheckTest {

	SurrealCheck sc = new SurrealCheck();

	@Test
	public void simpleTest1() {
		assertEquals(true, sc.isSurreal("-1", "1"));
	}

	@Test
	public void simpleTest2() {
		assertEquals(false, sc.isSurreal("1", "-1"));
	}

	@Test
	public void simpleTest3() {
		assertEquals(true, sc.isSurreal("-3 -2 -1 0", "17"));
	}

	@Test
	public void simpleTest4() {
		assertEquals(true, sc.isSurreal("1/2", "3/4"));
	}

	@Test
	public void simpleTest5() {
		assertEquals(true, sc.isSurreal("18 33 -2 19 -1/8", "99 34 200/3"));
	}
	
	@Test
	public void emptyTest1() {
		assertEquals(true, sc.isSurreal("", "1"));
	}

	@Test
	public void emptyTest2() {
		assertEquals(true, sc.isSurreal("-1", ""));
	}

	@Test
	public void formatTestPoint1() {
		assertEquals(true, sc.isSurreal("1", "1.1"));
	}

	@Test
	public void complexTest1() {
		assertEquals(false,
				sc.isSurreal("-405/1080 -1309 434/807 578/1216 431/668 -915/1372 0.2817311349053433 251 447/1283 -4206 -613/849 -3261 293/1241 0.7592663061763636 478/179 0.4136736147474148 404/1967 -303/1900 -4147 0.8985201499194404 4497",
						"565/420 0.2296132153463043 0.1048582011164153 0.1789903100013125 2574 0.33108542987300327 0.04665232180830803 -181/1693 947/798 0.5927723344826333 0.8903747015722752 609 1858 -127/1759 -3781 -681/1572 -628/653 -365 956/405 -2740 0.7410575295312797 4964 -309/1379 -322/229 -3396"));
	}


}
