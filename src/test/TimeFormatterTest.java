package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.TimeFormatter;

public class TimeFormatterTest {
	
	@Test
	public void zoliTests() {
		assertEquals("now", TimeFormatter.formatDuration(0));
		assertEquals("1 second", TimeFormatter.formatDuration(1));
		assertEquals("3 seconds", TimeFormatter.formatDuration(3));
		assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
		assertEquals("1 minute", TimeFormatter.formatDuration(60));
		assertEquals("2 minutes", TimeFormatter.formatDuration(120));
		assertEquals("1 hour", TimeFormatter.formatDuration(3600));
		assertEquals("2 hours and 1 second", TimeFormatter.formatDuration(7201));
		assertEquals("2 hours, 4 minutes and 1 second", TimeFormatter.formatDuration(7441));
		assertEquals("1 year", TimeFormatter.formatDuration(30758400));
		assertEquals("4 years and 68 days", TimeFormatter.formatDuration(128908800));
		assertEquals("4 years, 68 days and 3 hours", TimeFormatter.formatDuration(128919600));
		assertEquals("4 years, 68 days, 3 hours and 4 minutes", TimeFormatter.formatDuration(128919840));
		assertEquals("4 years, 68 days, 3 hours and 4 seconds", TimeFormatter.formatDuration(128919604));
		assertEquals("104 days", TimeFormatter.formatDuration(8985600));
		assertEquals("4 years and 104 days", TimeFormatter.formatDuration(132019200));
	}

	@Test
    public void exampleTests() {
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }
    
    
}
