package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.SpinWords;

class SpinWordsTest {

	
	@Test
	public void test() {
		assertEquals("A", new SpinWords().spinWords("A"));
		assertEquals("ereht", new SpinWords().spinWords("there"));
		assertEquals("gninnipS", new SpinWords().spinWords("Spinning"));
		assertEquals("Stop gninnipS", new SpinWords().spinWords("Stop Spinning"));
		assertEquals("Stop me", new SpinWords().spinWords("Stop me"));
				
		assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
		assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
	}

}
