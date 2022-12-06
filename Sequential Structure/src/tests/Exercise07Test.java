package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercises.Exercise07;

public class Exercise07Test {
	@Test
	public void doubleOfSquareArea() 
	{
		double width = 2;
		double height = 4;
		
		double areaDouble = Exercise07.doubleOfSquareArea(width, height);
		assertEquals(16, areaDouble, 0.1);
	}
}
