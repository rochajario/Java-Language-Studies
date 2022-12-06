package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Exercise08;

public class Exercise08Test {

	@Test
	public void salaryCalculation()
	{
		double hourValue = 30.0d;
		int monthHours = 80;
		
		double salary = Exercise08.salaryCalculation(hourValue, monthHours);
		assertEquals(2400d, salary, 0.1);
	}
}
