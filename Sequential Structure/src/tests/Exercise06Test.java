package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import exercises.Exercise06;

public class Exercise06Test {

	@Test
	public void getCircleArea() 
	{
		double radius = 3; 
		var result = Exercise06.getCircleArea(radius);
		assertEquals(28.3d, result, 0.1d);
	}
}
