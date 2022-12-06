package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Exercise09;

public class Exercise09Test {
	
	@Test
	public void getCelsiusOutOfFahreiheit()
	{
		double fahrenheit = 73.2d;
		double celsius = Exercise09.getCelsiusOutOfFahrenheit(fahrenheit);
		
		assertEquals(22.88d, celsius, 0.1);
	}
}
