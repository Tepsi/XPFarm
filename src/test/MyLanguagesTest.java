package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import main.MyLanguages;

class MyLanguagesTest {

	@Test
	public void basicTests() {
		final Map<String, Integer> mapEmpty = new HashMap<>();
		assertEquals(Collections.emptyList(), MyLanguages.myLanguages(mapEmpty));

		final Map<String, Integer> mapOneSmall = new HashMap<>();
		mapOneSmall.put("Java", 10);
		assertEquals(Collections.emptyList(), MyLanguages.myLanguages(mapOneSmall));

		final Map<String, Integer> mapTwoDiff = new HashMap<>();
		mapTwoDiff.put("Java", 10);
		mapTwoDiff.put("Ruby", 60);
		assertEquals(Arrays.asList("Ruby"), MyLanguages.myLanguages(mapTwoDiff));

		final Map<String, Integer> map1 = new HashMap<>();
		map1.put("Java", 10);
		map1.put("Ruby", 80);
		map1.put("Python", 65);
		assertEquals(Arrays.asList("Ruby", "Python"), MyLanguages.myLanguages(map1));
	
		final Map<String, Integer> map2 = new HashMap<>();
		map2.put("Hindi", 60);
		map2.put("Dutch", 93);
		map2.put("Greek", 71);
		assertEquals(Arrays.asList("Dutch", "Greek", "Hindi"), MyLanguages.myLanguages(map2));
		
		final Map<String, Integer> map3 = new HashMap<>();
		map3.put("C++", 50);
		map3.put("ASM", 10);
		map3.put("Haskell", 20);
		assertEquals(Collections.emptyList(), MyLanguages.myLanguages(map3));
		
	}
}
