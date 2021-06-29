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
	}

}
