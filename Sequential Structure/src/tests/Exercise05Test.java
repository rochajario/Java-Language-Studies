package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import exercises.Exercise05;

public class Exercise05Test {
	@Test
	public void metersToCentimeters()
	{
		var result = Exercise05.metersToCentimeters(1);
		assertEquals(1000, result);
	}
}
