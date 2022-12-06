package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import exercises.Exercise03;

public class Exercise03Test {

	@Test
	public void returnsSum() 
	{
		assertEquals(10, Exercise03.sum(5,5));
	}
}
