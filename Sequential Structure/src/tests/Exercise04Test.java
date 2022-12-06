package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import exercises.Exercise04;

public class Exercise04Test {

	@Test
	public void getGradesAverage()
	{
		var grades = new double[] {8, 6, 7, 9};
		var result = Exercise04.getGradesAverage(grades);
		assertEquals(7.5d, result, 0.1);
	}
}
