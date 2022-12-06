package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Exercise12.Exercise12;
import exercises.Exercise12.Genre;

public class Exercise12Test {

	@Test
	public void getManIdealWeight()
	{
		Genre genre = Genre.Man;
		double height = 1.78;
		double result = Exercise12.getIdealWeight(height, genre);
		assertEquals(71.4, result, 0.1);
	}
	
	@Test
	public void getWomanIdealWeight()
	{
		Genre genre = Genre.Woman;
		double height = 1.78;
		double result = Exercise12.getIdealWeight(height, genre);
		assertEquals(65.8, result, 0.1);
	}
}
