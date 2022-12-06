package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Exercise10;

public class Exercise10Test {

	@Test
	public void getFahrenheitOutOfCelsius()
	{
		double celsius = 22.88d;
		double fahrenheit = Exercise10.getFahrenheitOutOfCelsius(celsius);
		
		assertEquals(54.87d, fahrenheit, 0.1);
	}
}
